package patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Hunter implements InvocationHandler{
	
	private Object object;

	public Hunter(Object object) {
		super();
		this.object = object;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		if (method.getName().equalsIgnoreCase("interview")) {
			throw new RuntimeException("Hunter is not allowed to interview.");
		}
		
		method.invoke(object, args);
		
	//	System.out.println(proxy.getClass().getCanonicalName() + "." + method.getName() + " is called by proxy class.");
		return null;
	}

}
