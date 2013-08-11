package patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HR ericssonHR = new HR();
		InvocationHandler invocationHandler = new Hunter(ericssonHR);

		Ericsson ericssonProxy = (Ericsson) Proxy.newProxyInstance(ericssonHR.getClass().getClassLoader(), ericssonHR.getClass().getInterfaces(), invocationHandler);
		
		ericssonProxy.acceptResume("Jerry");
		
		try {
			ericssonProxy.interview();
		} catch (Exception e) {
			System.out.println("ERROR : " + e.getMessage());
		}
		
		HR realHr = new HR();
		realHr.acceptResume("Kavin");
		realHr.interview();

	}

}
