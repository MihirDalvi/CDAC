package single.dimensional.array;

import java.util.*;

class Array{
	private int[] arr;
	
	public Array( ) {
		this( 5 );
	}
	
	public Array( int size ) {
		this.arr = new int[ size ];
	}
	
	private static Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		for( int index = 0; index < this.arr.length; ++ index ) {
			System.out.print("Enter arr["+ index +"]	:	");
			this.arr[ index ] = sc.nextInt();
		}
	}

	public void printRecord() {
		for( int index = 0; index < this.arr.length; ++ index ) {
			int i = this.arr[ index ];
			Arrays.sort(arr );
//			System.out.println( arr[ index ] );
		}
		System.out.println( Arrays.toString(arr));
	}
	public static void releaseResource( ) {
		sc.close();
	}
}

public class SingleDimensionalArray {
	public static void main(String[] args) {
		Array a = new Array();
		
		//int[] arr = new int[] {12, 20, 34, 87, 9};
		
		//System.out.println( Arrays.toString(arr));
		
//		System.out.println("Enter ");
//		Scanner sc = new Scanner(System.in);
//		sc.nextInt();
		
		a.acceptRecord();
		a.printRecord();
		
//		sc.close();
	}
	
	
}
