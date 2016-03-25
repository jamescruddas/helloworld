/**
 * 
 */
package helloworld.core;

/**
 * @author James Cruddas
 * Application entry method
 */
public class HelloWorld {

	/**
	 * @param args Default args array
	 */
	public static void main(String[] args) {
		HelloWorldHelper helper = new HelloWorldHelper();
		String call = helper.SaySomething("Hello Jenkins!");
		System.out.println(call);
	}
}