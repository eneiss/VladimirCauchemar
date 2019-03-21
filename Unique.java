import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Unique extends JFrame{
		public Unique(String instrument, double frequence){

//===========================================================================================================================
// Just some variables
//===========================================================================================================================

			int width = 400;
			int height = 400;
			String title = "Analyse";

//===========================================================================================================================
// Bounds and name
//===========================================================================================================================

			setSize(width,height);
			setTitle(title);
			setLocation(1200,500);

//===========================================================================================================================
//	Add Label
//===========================================================================================================================

			MainPanel mp = new MainPanel(instrument, frequence, "unique");
			add(mp);

//===========================================================================================================================
//	Set Visible
//===========================================================================================================================

			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}