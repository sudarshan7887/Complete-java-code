
import java.awt.*;
import java.applet.*;
import java.util.*;
/*<applet code="BorderLayoutDemo" width=400 height=200>
</applet>*/

public class BorderLayoutDemo extends Applet 
{
	public void init() 
	{
		setLayout(new BorderLayout());
		add(new Button("Top."), BorderLayout.NORTH);
		add(new Button("Bottom."),BorderLayout.SOUTH);
		add(new Button("Right"), BorderLayout.EAST);
		add(new Button("Left"), BorderLayout.WEST);
	       add(new TextArea("Welcome to Border Layout Demo"), BorderLayout.CENTER);
	}
}
