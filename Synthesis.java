import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Synthesis extends JFrame{
		public Synthesis(String instrument, double frequence){

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
			setLocation(750,500);

//===========================================================================================================================
//	Add Label
//===========================================================================================================================

			MainPanel mp = new MainPanel(instrument, frequence, "synthesis");
			add(mp);

//===========================================================================================================================
//	Set Visible
//===========================================================================================================================

			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}