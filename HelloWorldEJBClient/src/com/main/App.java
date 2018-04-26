package com.main;

import java.util.Properties;

import javax.naming.InitialContext;

import com.logic.CalculatorRemote;

public class App {

	public static void main(String g[]) {

		try {
			Properties props = new Properties();
	        props.put("java.naming.factory.url.pkgs","org.jboss.ejb.client.naming");
			InitialContext context = new InitialContext(props);

			String appName = "";
			String moduleName = "HelloWorldEJB";
			String distinctName = "";
			String interfaceName = CalculatorRemote.class.getName();
			String name = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + "Calculator" + "!"
					+ interfaceName;
			System.out.println("ejb name :"+name);
			CalculatorRemote bean = (CalculatorRemote) context.lookup(name);
			double result = bean.mul(5, 6);
			System.out.println("Result computed by EJB is :" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
