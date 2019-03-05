package com.spring.java;

public class Triangle {
	
	private int height;
	private String type;
	
	
	
	public Triangle(String type) {
		super();
		this.type = type;
	}

	public Triangle(int height) {
		super();
		this.height = height;
	}

	 public Triangle(String type,int height)
{
		 this.type=type;
         this.height=height;
	  }
	 
	
	public String getType() {
		return type;
	}
	public int getHeight() {
		return height;
	}
	

	
	
	//public void setType(String type) {
		//this.type = type;
	//}

	public void draw()
	{
		System.out.println( getType()+" drawn "+ getHeight());
	}
}
