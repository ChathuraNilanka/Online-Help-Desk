package GroupProject.Services;

import java.util.ArrayList;

import GroupProject.Model.Users;

public interface IUsers {


	/*
	 * add a user 
	 */
	public void addUser(Users user);
	
	/*
	 * view a user
	 */
	public Users viewUser(String userID);
	
	/*
	 * remove a user
	 */
	public void removeUser(String userID);
	
	/*
	 * update an existing user
	 */
	public void editUser(String userID, Users user);
	
	/*
	 * log user in
	 */
	public boolean Login(Users user);
	
	/*
	 *  gets every user in the db
	 */
	public ArrayList<Users> getUsers();
}
