class Palace{
	static String name;
	static String location;
	static String states;
	static float area;
	static byte noOfrooms;
	
	public static void setValue(String fname,String flocation,String fstates,float farea,byte fnoOfrooms){
		System.out.println("The set value of palace is");
		name=fname;
		location=flocation;
		states=fstates;
		area=farea;
		noOfrooms=fnoOfrooms;
	}
public static void display(){
	    System.out.println("Name of the palace:"+name);
		System.out.println("Location is:"+location);
		System.out.println("State:"+states);
		System.out.println("Area of the palace:"+area);
		System.out.println("No of roms:"+noOfrooms);
	
}


}