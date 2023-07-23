package ExceptionHandling;

public class P1 {

	int a = 10;
	int b = 0;
	int c = a / b;

	public void name() {
		System.out.println(c);
	}

	public static void main(String[] args) {
		try {
			new P1().name();
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} catch (Throwable e) {
			System.out.println(e);
		} finally {
			System.out.println("i am finally block");
		}
	}

}
