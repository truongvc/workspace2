package game;

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
	//comment
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
	
	public void newGame(){
		grid = new char[3][3];
		turn = 'x';
        //fill all empty slots with -
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                grid[i][j] = '-';
            }
        }
	}
	
	public void printBoard(){
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
				grid[0][0] = turn;
				if (turn == 'x'){
					btn00.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/x.png")));
					turn = 'o';}
				else{
					turn = 'x';
					btn00.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/o.png")));
				}
				
			}
			
		});
		frmTicTacToe.getContentPane().add(btn00);
		
		JButton btn01 = new JButton("");
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				grid[0][1] = turn;
				if (turn == 'x'){
					btn01.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/x.png")));
					turn = 'o';}
				else{
					turn = 'x';
					btn01.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/o.png")));
				}
				printBoard();
			}
		});
		frmTicTacToe.getContentPane().add(btn01);
		
		JButton btn02 = new JButton("");
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				grid[0][2] = turn;
				if (turn == 'x'){
					btn02.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/x.png")));
					turn = 'o';}
				else{
					turn = 'x';
					btn02.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/o.png")));
				}
				printBoard();
			}
		});
		frmTicTacToe.getContentPane().add(btn02);
		
		JButton btn10 = new JButton("");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				grid[1][0] = turn;
				if (turn == 'x'){
					btn10.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/x.png")));
					turn = 'o';}
				else{
					turn = 'x';
					btn10.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/o.png")));
				}
				printBoard();
			}
		});
		frmTicTacToe.getContentPane().add(btn10);
		
		JButton btn11 = new JButton("");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				grid[1][1] = turn;
				if (turn == 'x'){
					btn11.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/x.png")));
					turn = 'o';}
				else{
					turn = 'x';
					btn11.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/o.png")));
				}
				printBoard();
			}
		});
		frmTicTacToe.getContentPane().add(btn11);
		
		JButton btn12 = new JButton("");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				grid[1][2] = turn;
				if (turn == 'x'){
					btn12.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/x.png")));
					turn = 'o';}
				else{
					turn = 'x';
					btn12.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/o.png")));
				}
				printBoard();
			}
		});
		frmTicTacToe.getContentPane().add(btn12);
		
		JButton btn20 = new JButton("");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				grid[2][0] = turn;
				if (turn == 'x'){
					btn20.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/x.png")));
					turn = 'o';}
				else{
					turn = 'x';
					btn20.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/o.png")));
				}
				printBoard();
			}
		});
		frmTicTacToe.getContentPane().add(btn20);
		
		JButton btn21 = new JButton("");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				grid[2][1] = turn;
				if (turn == 'x'){
					btn21.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/x.png")));
					turn = 'o';}
				else{
					turn = 'x';
					btn21.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/o.png")));
				}
				printBoard();
			}
		});
		frmTicTacToe.getContentPane().add(btn21);
		
		JButton btn22 = new JButton("");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				grid[2][2] = turn;
				if (turn == 'x'){
					btn22.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/x.png")));
					turn = 'o';}
				else{
					turn = 'x';
					btn22.setIcon(new ImageIcon(TicTacToe.class.getResource("/game/resources/o.png")));
				}
				printBoard();
			}
		});
		frmTicTacToe.getContentPane().add(btn22);
		
		newGame();
		
	}
}
