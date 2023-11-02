package StringSums;

public class StringValueChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String jhon = "Jhon";
String joe = new String("Jhon");
String name = joe;

boolean value1 = jhon == joe;
boolean value2 = jhon.equals(joe);
boolean value3 = name == jhon;
boolean value4 = name == joe;
boolean value5 = jhon.equals(name);
boolean value6 = joe.equals(name);

System.out.println(value1);
System.out.println(value2);
System.out.println(value3);
System.out.println(value4);
System.out.println(value5);
System.out.println(value6);
	}

}
