public class HelloUser {
	
	private String username;
	public HelloUser(String inUserName) {
       username = inUserName;
    }
	
	public void greetUser()
	{
		
		System.out.println("Hello " + username + "!" );
	}
}