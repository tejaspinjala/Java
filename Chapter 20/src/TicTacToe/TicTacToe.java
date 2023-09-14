/*
 * Tejas Pinjala
 * COSC 2436 / Professor Woods
 * 04/27/2021
 * Tic-Tac-Toe Simulator
 */

package TicTacToe;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Ellipse;

public class TicTacToe extends Application {
	//starts off with X first
	private char turn = 'X';

	//creates a cell and gives it a 3 by 3 
	private Cell[][] tictactoe =  new Cell[3][3];

	//creates and initializes the label
	private Label label = new Label("X's turn to play");

	//creates the stages and sets it
	public void start(Stage stage) {
		//holds the tictactoe cells
		GridPane pane = new GridPane(); 

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				pane.add(tictactoe[i][j] = new Cell(), j, i);
			}
		}

		//creates and initializes the borderpane
		BorderPane border = new BorderPane();
		border.setCenter(pane);
		border.setBottom(label);
    
		//create a scene and place it in the stage
		Scene scene = new Scene(border, 450, 170);
		//stage title
		stage.setTitle("TicTacToe");
		stage.setScene(scene);
		//displays the stage
		stage.show(); 
	}

  
	//checks if all the cells are used
	public boolean isFull() {
		//checks for each gird in the 3 by 3
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tictactoe[i][j].getToken() == ' ')
			          return false;
			}
		}
		return true;
	}

	
	//checks who won the tictactoe
	public boolean won(char token) {
		//checks for the ones in the rows
		for (int i = 0; i < 3; i++) {
			if (tictactoe[i][0].getToken() == token 
					&& tictactoe[i][1].getToken() == token 
					&& tictactoe[i][2].getToken() == token);
			return true;
		}

		//checks for the ones in the columns
		for (int j = 0; j < 3; j++) {
			if (tictactoe[0][j].getToken() ==  token
					&& tictactoe[1][j].getToken() == token
					&& tictactoe[2][j].getToken() == token);
			return true;
		}
		
		return false;
	}

  
	//cell class
	public class Cell{
		//token used for this cell
		private char token = ' ';

		//gives the token a size and color
		public Cell() {
			setStyle("-fx-border-color: black"); 
			this.setPrefSize(800, 800);
			this.setOnMouseClicked(e -> handleMouseClick());
		}

    //returns the token
    public char getToken() {
    	return token;
    }

    //sets the symbols
    public void setToken(char c) {
    	token = c;
      
    	//draws the X
    	if (token == 'X') {
    		Line line1 = new Line(10, 10, this.getWidth() - 10, this.getHeight() - 10);
    		line1.endXProperty().bind(this.widthProperty().subtract(10));
    		line1.endYProperty().bind(this.heightProperty().subtract(10));
    		Line line2 = new Line(10, this.getHeight() - 10, this.getWidth() - 10, 10);
    		line2.startYProperty().bind(this.heightProperty().subtract(10));
    		line2.endXProperty().bind(this.widthProperty().subtract(10));
        
    		//adds the X
    		add(line1, line2); 
      
    	}
      
    	//draws the O
    	else if (token == 'O') {
    		Ellipse ellipse = new Ellipse(this.getWidth() / 2, this.getHeight() / 2, this.getWidth() / 2 - 10, this.getHeight() / 2 - 10);
    		ellipse.centerXProperty().bind(this.widthProperty().divide(2));
    		ellipse.centerYProperty().bind(this.heightProperty().divide(2));
    		ellipse.radiusXProperty().bind(this.widthProperty().divide(2).subtract(10));        
    		ellipse.radiusYProperty().bind(this.heightProperty().divide(2).subtract(10));   
    		ellipse.setStroke(Color.BLACK);
    		ellipse.setFill(Color.WHITE);
        
    		//adds the eclipse
    		add(ellipse);
    	}
    }

    
    //describes what happens when the mouse is clicked
    private void mouseClick() {
    	//cell is null then the game is not over
    	if (token == ' ' && turn != ' ') {
    		//sets the token in the cell
    		setToken(turn);

    		//game status
    		if (won(turn)) {
    			label.setText(turn + " won! The game is over");
    			//game is over if won
    			turn = ' ';
    		} else if (isFull()) 
    			label.setText("Draw! The game is over");
    			//game is over if draw
    			turn = ' ';
    		} else {
    			//change the turn  back and forth
    			turn = (turn == 'X') ? 'O' : 'X';
    			//display whose turn it is
    			label.setText(turn + "'s turn");
    		}
    	}
    }
}

