public class UserInfo {
	//this data will be hidden(for my info)
	private String name;
	private int age;
	private String email;
	private boolean isActive;
	
	public UserInfo(String name, int age, String email, boolean isActive) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.isActive = isActive;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		if (age>=0){
			this.age = age;
		}
	}
	
	
	public String getEmail(){
		return email;
	}
	public void setEmail (String email){
		this.email = email;
	}
		

	public boolean isActive(){
		return isActive;
	}
	public void setisActive(boolean isActive){
		this.isActive = isActive;
	}
	
	public void displayInfo(){
		System.out.println("User info:");
		System.out.println("Name:" + " " + name);
		System.out.println("Age:" + " " + age);
		System.out.println("Email" + " " + email);
		System.out.println("Active / Not Active:" + " " + isActive); 
		System.out.println("--------------------------------"); 
		System.out.println(); 


	}
}