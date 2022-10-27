package ch02;

public class Ex2_9 {

	public static void main(String[] args) {
		
		short sMin = -32768; //short 타입의 최소값
		short sMax = 32767;  //short 타입의 최대값
		char cMin = '0';
		char cMax = 65535;

			System.out.println("sMin =" + sMin); 
			System.out.println("sMax =" + sMax);
			System.out.println("sMIn -1 = " + (short)(sMin-1) ); // == sMax
			System.out.println("sMax +1 = "	+ (short)(sMax+1)); // == sMin
			System.out.println("cMin = "+ cMin);
			System.out.println("cMax = "+ cMax);
			System.out.println("cMin - 1 = "+(int)(cMin-1));  //== cMax
			System.out.println("cMax + 1 = "+(int)(cMax+1));  //== cMin
		
		
		
	}
}
