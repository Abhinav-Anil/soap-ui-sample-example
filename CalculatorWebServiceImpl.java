package mscca;

import calcwsdl.CalculatorPortType;

public class CalculatorWebServiceImpl implements CalculatorPortType {

	@Override
	public Integer add(Integer n1, Integer n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

}
