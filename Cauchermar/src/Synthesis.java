import javax.swing.*;

public class Synthesis extends JFrame{

	MainPanel mp;

		public Synthesis(){

//===========================================================================================================================
// Just some variables
//===========================================================================================================================

			int width = 400;
			int height = 400;
			String title = "Synthese";

//===========================================================================================================================
// Bounds and name
//===========================================================================================================================

			setSize(width,height);
			setTitle(title);
			setLocation(90,500);

//===========================================================================================================================
//	Set Visible
//===========================================================================================================================

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		public void refresh(String instrument, double frequence){
			mp = new MainPanel(instrument, frequence);
			add(mp);
		}
}