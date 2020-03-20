package source;

import javax.swing.JFrame;

public class HowToPlayFrame extends JFrame{
	public static final int HEIGHT = 720, WIDTH = 640;

	public HowToPlayFrame() {
		JFrame window = new JFrame(
				"Game Legendaris Klasik Balok Susun Lucu Warna-warni Hanya menyerupai Tapi Bukan TETRIS 2019");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		window.add(new HowToPlayPanel());
		setVisible(true);
	}

}
