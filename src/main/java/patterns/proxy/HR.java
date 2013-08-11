package patterns.proxy;

public class HR implements Ericsson {

	public void acceptResume(String name) {

		System.out.println(name + "'s CV is accpeted.");
	}

	public void interview() {

		System.out.println("interview is scheduled.");
	}

}
