import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JPanel
	implements ActionListener
{
	private Difficulty difficulty;

	public enum Difficulty {
		EASY,
		MEDIUM,
		HARD
	}

	public Game(Difficulty d)
	{
		difficulty = d;

		Timer t = new Timer(1000/60, this);
	}

	public void actionPerformed(ActionEvent e)
	{
		System.out.println("wow");
	}
}
