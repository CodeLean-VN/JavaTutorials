package DemoJavaApp;

/**
 * Write a description of class GameObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameObject
{
	protected float x;
	protected float y;
	protected float oldx;
	protected float oldy;
	protected float dx;
	protected float dy;
	protected int r;
	
	public GameObject()
	{
	}
	public float getR()
	{
		return r;
	}
	public void setR(int r)
	{
		this.r=r;
	}
	public float getX()
	{
		return x;
	}
	public void setX(float x)
	{
		this.x=x;
	}
	public float getY()
	{
		return y;
	}
	public void setY(float y)
	{
		this.y=y;
	}
	public float getDX()
	{
		return dx;
	}
	public void setDX(float dx)
	{
		this.dx=dx;
	}
	public float getDY()
	{
		return dy;
	}
	
	public void setDY(float dy)
	{
		this.dy=dy;
	}
	public void notifyVisible(boolean visible)
	{
	}
	public void notifyObjectCollision(GameObject object)
	{
	}
}
