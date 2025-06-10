class Server 
{
	String name;
	String ip;
	int portNo;
	String status;
	
	
	Server(){// Constructor Created
		System.out.println("From Server Constructor");
	}
	public Server getServerDetails()
	{
		System.out.println(name);
		System.out.println(ip);
		System.out.println(portNo);
		System.out.println(status);
		return this;
	}
	public DB setDB(String name,String user,String pass)
	{
		status="ON";
		DB d1=new DB();
		d1.name=name;
		d1.user=user;
		d1.pass=pass;
		
		return d1;
	}
}
