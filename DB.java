class DB 
{
	String name;
	String user;
	String pass;
	// Constructor Created
	DB(){
		System.out.println("From DB Constructor");
	}
	
	public DB getDB(){
		System.out.println(name);
		System.out.println(user);
		System.out.println(pass);
		return this;
	}
}
