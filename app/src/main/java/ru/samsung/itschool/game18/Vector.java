package ru.samsung.itschool.game18;

public class Vector {
    float x, y;
    private void print()
    {
    	System.out.println("(" + x + ", " + y + ")");
    }
    
    public String toString()
    {
    	return "(" + x + "; " + y + ")";
    }
    
    protected void sum(Vector v)
    {
    	this.x += v.x;
    	this.y += v.y;
    }
    
    private void mul(float k)
    {
    	x *= k;
    	y *= k;
    }
    
    private void set(float x, float y)
    {
    	this.x = x;
    	this.y = y;
    }
    
    public Vector()
    {
    	x = 0;
    	y = 0;
    }
    
    protected Vector(float x, float y)
    {
    	this.x = x;
    	this.y = y;
    }
    
    
    static Vector v;
	public static void main(String argS[]) {    
          System.out.println(v);
	}
}
