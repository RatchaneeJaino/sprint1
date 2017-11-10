
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
public class UserPanel extends JPanel{
	private ImageIcon image;

	public UserPanel() {
		image = new ImageIcon("tubg.jpg");
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image.getImage(),0,0,getWidth(),getHeight(),null);
	}

}
