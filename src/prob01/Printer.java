package prob01;

public class Printer {
	public void println( int a ) {
		System.out.println( a );
	}
	public void println( boolean a ) {
		System.out.println( a );
			
	}
	public void println( double a ) {
		System.out.println( a );
		
	}
	public void println( String a ) {
		System.out.println( a );
		
	}
	
	
	/*
	
	    public void println( Object o ) {
		System.out.println( o );
	}	// object도 괜찮은데 제네릭으로 사용하는게 더 좋음
	
	public <T> void println( T t ) {		//제네릭 메소드
		System.out.println( t );
	}
	
	
	 * public <T, P> List<P> println( T t ) {
		System.out.println( t );
		List<P> list = new ArrayList<P>();
		return list;
	}
	
	
	// 가변 파라미터 메소드 만들기
	public void println2( String[] params ) {
		for( String s : params ) {
			System.out.println( s + ":" );
		}
		System.out.println( "" );
	}
	
	public void println3( String... params ) {
		for( String s : params ) {
			System.out.println( s + ":" );
		}
		System.out.println( "" );
	
	}
*/}
