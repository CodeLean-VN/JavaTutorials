package DemoJavaApp;
/**
 * Write a description of class World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferStrategy;

public class World extends Canvas implements Runnable
{
	private Vector<Ball> balls;
	public int count;
	public Random rand;
	CollisionDetection collisionDetector=new CollisionDetection();
	public Image doubleBuffer;
	public World()
	{	
		balls=new Vector();
		rand=new Random(System.currentTimeMillis());
		//System.out.println("Hello world");
		for (int i = 0; i<10; i++)
		{
		
			Ball ball=new Ball(Math.abs((float)Math.random()*180),Math.abs((float)Math.random()*180),5,
								new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
			this.addBall(ball);					
		}
		Thread worldThread=new Thread(this);
		worldThread.start();
	}
	public void add(GameObject o)
	{
	}
	public void addBall(Ball o)
	{
		balls.addElement(o);
	}
	public void run()
	{
		long startTime = System.currentTimeMillis();
        long currTime = startTime;
        long elapsedTime;

		
		while(true)
		{
			elapsedTime =System.currentTimeMillis() - currTime;
			currTime+=elapsedTime;
			
			repaint();
			
			for(int i=0;i<balls.size();i++)
			{
				balls.elementAt(i).update(elapsedTime);
				balls.elementAt(i).setLimitedBounds(this.getBounds());
				balls.elementAt(i).notifyBoundsCollision();
				collisionDetector.checkObject(balls.elementAt(i),balls);	
			}
			
			try
			{
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public void paint(Graphics g)
	{
		if (g instanceof Graphics2D) {
        	Graphics2D g2 = (Graphics2D)g;
        	g2.setRenderingHint(
            	RenderingHints.KEY_TEXT_ANTIALIASING,
            	RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    	}


		g.clearRect(0,0,this.getWidth(),this.getHeight());
		for(int i=0;i<balls.size();i++)
		{
			balls.elementAt(i).draw(g);		
		}
	}
	public void update(Graphics g) {
	    Dimension size = getSize();
	    if (doubleBuffer == null ||
	        doubleBuffer.getWidth(this) != size.width ||
	        doubleBuffer.getHeight(this) != size.height)
	    {
	        doubleBuffer = createImage(size.width, size.height);
	    }
	    if (doubleBuffer != null) {
	        Graphics g2 = doubleBuffer.getGraphics();
	        paint(g2);
	        g2.dispose();
	        g.drawImage(doubleBuffer, 0, 0, null);
	    }
	    else {
	        paint(g);
	    }
	}
	public static void main(String [] agrs)
	{
		World world=new World();
		Frame f=new Frame("Game World!");
		f.setSize(200,200);
		f.setVisible(true);
		f.add(world);
	
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}
