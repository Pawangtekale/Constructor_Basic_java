class ServerDBDrive 
{
	public static void main(String[] args) 
	{
		Server s1=new Server();
		s1.name="Apacha Tomcat";
		s1.portNo=3030;
		s1.ip="101.2334.343";
		s1.status="ON";
		s1.getServerDetails().setDB("MY SQL","ROOT","Root").getDB();
		
		
	}
}
