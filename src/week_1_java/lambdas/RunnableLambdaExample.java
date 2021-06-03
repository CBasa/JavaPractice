package week_1_java.lambdas;

public class RunnableLambdaExample {

	// "main" + CTRL+space
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("inside runnable");
			}
		};
		new Thread(runnable).start();		
		
		
		// () -> {} LAMBDA EXPRESSION -----------------------------------
		Runnable runnableLambda1 = () -> {
			System.out.println("inside runnable lambda 1");
		};
		new Thread(runnableLambda1).start();
		
		//'{}' not needed if only one line of code
		Runnable runnableLambda2 = () -> System.out.println("inside runnable lambda 2");
		new Thread(runnableLambda2).start();
		
		new Thread(()->System.out.println("inside runnable lambda 3")).start();
	}
}
