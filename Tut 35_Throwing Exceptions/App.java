// import java.io.IOException;

public class App {

	public static void main(String[] args) {

		Test test = new Test();

		try {
			test.run();
		} catch (ServerException e) {
			System.out.println(e.getMessage());
			// siyah renkte "Could not connect to server" yazýsýnýn çýkmasýný saðlar
			
			e.printStackTrace();
			// kýrmýzý renkteki stack trace yazýsýnýn çýkmasýný saðlýyor
		}

	}

}
