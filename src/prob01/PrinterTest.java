package prob01;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer();
		// 오버로드해서 풀기
		printer.println( 10 );
		printer.println( true );
		printer.println( 5.7 );
		printer.println( "홍길동" );
		
		//printer.println2( new String[] { "둘리", "마이콜", "또치"} );
	
		}

}
