package com.olympic.cis143.m05.student.lab.trycatch;

public class MyException extends Exception{
	
	/*
	 * Author: Joseph Racke
	 * Date: 17-MAY-2021
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String stringMsg) {
		super(stringMsg);
	}
	
	public class Main 
	{
		public void main(String args[])
		{
			try
			{
				throw new MyException("Excepted");
			}
			catch (MyException ex)
			{
				System.out.println("Exception Caught");
				System.out.println(ex.getMessage());
			}
		}
	}

}
