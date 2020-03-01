package DemoJavaApp;
/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
public class Ball extends GameObject
{
	private Color color;
	private Rectangle rec=new Rectangle(0,0,100,100);
	public Ball(float x,float y,int r,Color color)
	{
		this.x=x;
		this.y=y;
		this.r=r;
		this.color=color;
		int sign=new Random().nextInt()>0?1:-1;
		float d=(float)Math.random();
		dx=/*0.05f;*/(float)Math.random()*sign/3;
		sign=new Random().nextInt()>0?1:-1;
		dy=/*0.05f;*/(float)Math.random()*sign/3;
	}
	public void setPosition(float x,float y)
	{
		this.x=x;
		this.y=y;
	}
	public void setLimitedBounds(Rectangle rec)
	{
		this.rec=rec;
	}
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillOval(Math.round(x)-r,Math.round(y)-r,2*r,2*r);
	}
	public void update(long elapsedtime)
	{
		oldx=x;
		oldy=y;
		x+=dx*elapsedtime;
		y+=dy*elapsedtime;
	}
	public void setOldPosition(boolean flag)
	{
		if(flag)
		{
			setPosition(oldx,oldy);
		}else{
			setPosition(x,y);
		}
	}
	public void notifyBoundsCollision()
	{
		boolean isCollision=false;
		if(x>=rec.getWidth()-r-1||x<1)
		{
			isCollision=true;
			dx= -dx;
		}
		if(y>=rec.getHeight()-r-1||y<1)
		{
			isCollision=true;
			dy= -dy;
			
		}
		setOldPosition(isCollision);
	}
	public void notifyObjectCollision(GameObject two)
	{
		boolean isCollision=false;
		float dx1=x-two.x;
		float dy1=y-two.y;
		
		int sx=two.dx>0?1:-1;
		int sy=two.dy>0?1:-1;
		float ddx=Math.abs(Math.abs(dx)-Math.abs(two.dx));
		float ddy=Math.abs(Math.abs(dy)-Math.abs(two.dy));
		
		int min=r+((Ball)two).r;
		if(dx1*dx1+dy1*dy1<min*min)
		{
			isCollision=true;
			if(Math.abs(ddx)<r&&Math.abs(ddy)>r){
				dy= -dy;
			}
			if(Math.abs(ddy)<r&&Math.abs(ddx)>r){
				dx= -dx;
			}
			if(Math.abs(ddx)>r&&Math.abs(ddy)>r){
				dx= -dx;
				dy= -dy;
			}
			if(Math.abs(ddx)<r&&Math.abs(ddy)<r){
				dx= -dx;
				dy= -dy;
			}
		}
		setOldPosition(isCollision);
	}
}