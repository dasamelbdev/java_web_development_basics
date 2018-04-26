package com.logic;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Calculator
 */
@Stateless
@LocalBean
public class Calculator implements CalculatorRemote {

    /**
     * Default constructor. 
     */
    public Calculator() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public double add(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

	@Override
	public double min(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}

	@Override
	public double divide(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1/n2;
	}

	@Override
	public double mul(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1*n2;
	}

}
