package GroupProject.Model;

public class Users {

	private static String userprefix="U100";
	private static String techprefix="T100";
	private static int uiditer=1;
	private static int tiditer=1;
	private String uid;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String Gender;
	private String hometown;
	private String type;
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUid() {
		return uid;
	}
	public void generateUid() {
		this.uid = Users.userprefix + Users.uiditer;
		Users.uiditer++;
	}
	public void generateTechID() {
		this.uid=Users.techprefix+Users.tiditer;
		Users.tiditer++;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
}
