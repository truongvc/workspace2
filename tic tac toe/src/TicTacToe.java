

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TicTacToe {

	private JFrame frmTicTacToe;
	private char [][] grid;
	private char turn; // who's turn is it, 'x' or 'o' ? x always starts
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frmTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
	}
	
	public void newGame(){//creates a new 2D array of size 3x3 and sets the first turn to x
		grid = new char[3][3];
		turn = 'x';
        //fill all empty slots with -
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                grid[i][j] = '-';
            }
        }
	}
	
	public void printBoard(){//prints the 2D array(board) to console
		System.out.println("********************************");
		for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(grid[i][j]);;
            }
            System.out.println();
        }
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("Tic Tac Toe");
		frmTicTacToe.setIconImage(Toolkit.getDefaultToolkit().getImage(TicTacToe.class.getResource("/game/resources/grid.png")));
		frmTicTacToe.setBounds(100, 100, 500,500);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.getContentPane().setLayout(new GridLayout(3,3));
		
		JButton btn00 = new JButton("");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				grid[0][0] = turn; //sets the array to the token of the user's turn
				if (turn == 'x'){//sets the button to the correct image
					btn00.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/x.png")));
					turn = 'o';}//changes the token for the next player
				else{
					turn = 'x';
					btn00.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/o.png")));
				}
			}
		});
		frmTicTacToe.getContentPane().add(btn00);		
	//MORE BUTTONS HERE
		
		newGame();//creates a new game with empty board
		
	}
}

