import java.awt.*;

class awtt
{
	public static void main (String args[])
	{
		Frame f= new Frame("Student Infromation");
		f.setLayout(new FlowLayout());
		Button b= new Button("A");
		f.add(b);
		
		Button b1 = new Button("B");
		f.add(b1);
		
		f.setSize(500,400);
		f.setVisible(true);
	}
}