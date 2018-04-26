package com.logic;

import javax.ejb.Remote;

@Remote
public interface CalculatorRemote {
	
	public double add(double n1,double n2);
	public double min(double n1,double n2);
	public double divide(double n1,double n2);
	public double mul(double n1,double n2);


}
