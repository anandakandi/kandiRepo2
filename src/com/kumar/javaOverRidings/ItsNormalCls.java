package com.kumar.javaOverRidings;

public class ItsNormalCls extends ItsAbstrCls  {

	public static void main(String[] args) {
		
		
		ItsNormalCls obj = new ItsNormalCls();
		obj.fun();
		obj.ItsAbstrCls();
	}

	@Override
	void fun() {
		// TODO Auto-generated method stub
		System.out.println("its from ItsAbstrCls ");
		
	}
}
