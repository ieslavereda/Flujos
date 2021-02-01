package exceptions;

public class E1 {

	public static void main(String[] args) {

		int n = 5;
		int d = 0;

		
			try {
				System.out.println(divide(n,d));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		
	}

	private static int divide(int numerador, int denominador) throws Exception {
		
		if (denominador != 0)
			return numerador / denominador;
		else
			throw new Exception("No puedo hacer una division por cero");

	}

}
