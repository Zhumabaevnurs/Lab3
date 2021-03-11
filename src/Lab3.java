
public class Lab3 {
	public static void main(String[] args) {
		float fahrenheit, centigrade;
		fahrenheit=(float) 98.6;
		centigrade=(5/9f)*(fahrenheit-32);
		System.out.println("Fahrenheit is: "+fahrenheit+", centigrade is: "+centigrade);
		
		for(fahrenheit=0; fahrenheit<=40; fahrenheit +=5) {
			centigrade=(5/9f)*(fahrenheit-32);
			System.out.println("Fahrenheit is: "+fahrenheit+", centigrade is: "+centigrade);
		} // for loop
		
		System.out.println("------------------------------------------------------------------");
		
		fahrenheit=0;
		
		while(fahrenheit<=40)
		{
			centigrade=(5/9f)*(fahrenheit-32);
			System.out.println("Fahrenheit is: "+fahrenheit+", centigrade is: "+centigrade);
		    fahrenheit+=5;
		}

	}
}
