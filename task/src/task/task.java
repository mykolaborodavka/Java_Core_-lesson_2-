package task;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte by=15;
		short sh=415;
		int i=5415;
		long lon=83648L;
		char ch='e';
		float fl=5.24f;
		double dou=3.005;
		boolean bl=true;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Boolean.FALSE);
		System.out.println(Boolean.TRUE);
		int Ar[]=new int[10];
		int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		for (i=0;i<10;i++) {
			Ar[i]=(int)(Math.random()*10);
			if (Ar[i]>max) {
				max=Ar[i];
			}
			if(Ar[i]<min) {
				min=Ar[i];
			}
		
		}
		
		System.out.println("min="+min);
		System.out.println("max="+max);
		
	
	}

}
