package GroupProject.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import GroupProject.Model.Users;
import GroupProject.Util.DBconnect;

public class IUserImpl implements IUsers {

	Connection connection;
	PreparedStatement prep;
	ResultSet myRs;

	@Override
	public void addUser(Users user) {
		try {
			connection=DBconnect.getConnection();

			prep=connection.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?,?,?)");

			prep.setString(1, user.getUid());
			prep.setString(2, user.getFirstName());
			prep.setString(3, user.getLastName());
			prep.setString(4, user.getPassword());
			prep.setString(5, user.getGender());
			prep.setString(6, user.getEmail());
			prep.setString(7, user.getHometown());
			prep.setString(8, user.getType());

			prep.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					prep.close();
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public Users viewUser(String userID) {
		Users user = new Users();
		try {
			connection=DBconnect.getConnection();
			prep=connection.prepareStatement("SELECT * FROM user WHERE uid= ?");
			prep.setString(1, userID);
			myRs=prep.executeQuery();

			while(myRs.next()) {
				user.setUid(myRs.getString("uid"));
				user.setFirstName(myRs.getString("firstName"));
				user.setLastName(myRs.getString("lastName"));
				user.setEmail(myRs.getString("email"));
				user.setGender(myRs.getString("gender"));
				user.setType(myRs.getString("type"));
				user.setHometown(myRs.getString("hometown"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection!=null) {
				try {
					prep.close();
					myRs.close();
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return user;
	}

	@Override
	public void removeUser(String userID) {

		try {
			connection=DBconnect.getConnection();

			prep=connection.prepareStatement("DELETE FROM user WHERE uid=?");

			prep.setString(1, userID);

			prep.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection!=null) {
				try {
					prep.close();
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void editUser(String userID, Users user) {
		try {
			connection=DBconnect.getConnection();

			prep=connection.prepareStatement("UPDATE user SET firstName=? , lastName=? , password=?, email=?, hometown=? WHERE uid=?");

			prep.setString(1, user.getFirstName());
			prep.setString(2, user.getLastName());
			prep.setString(3, user.getPassword());
			prep.setString(4, user.getEmail());
			prep.setString(5, user.getHometown());			
			prep.setString(6, userID);

			prep.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection!=null) {
				try {
					prep.close();
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public boolean Login(Users user) {
		String passwordT=null;
		try {
			connection=DBconnect.getConnection();
			prep=connection.prepareStatement("SELECT password FROM user WHERE uid = ?");
			String id = user.getUid();

			prep.setString(1, id);

			myRs = prep.executeQuery();

			while(myRs.next()) {
				passwordT = myRs.getString("password");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection!=null) {
				try {
					prep.close();
					myRs.close();
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}	
		}

		if( passwordT.equals(user.getPassword()) ) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ArrayList<Users> getUsers() {
		
		ArrayList<Users> usersList = new ArrayList<>();
		
		try {
			DBconnect.getConnection();
			
			prep=connection.prepareStatement("SELECT * FROM user");
			
			myRs=prep.executeQuery();
			
			while(myRs.next()) {
				Users tempUser = new Users();
				
				tempUser.setUid(myRs.getString("uid"));
				tempUser.setFirstName(myRs.getString("firstName"));
				tempUser.setLastName(myRs.getString("lastName"));
				tempUser.setPassword(myRs.getString("password"));
				tempUser.setGender(myRs.getString("gender"));
				tempUser.setEmail(myRs.getString("email"));
				tempUser.setHometown(myRs.getString("hometown"));
				tempUser.setType(myRs.getString("type"));
				
				usersList.add(tempUser);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection!=null) {
				try {
					prep.close();
					myRs.close();
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return usersList;
	}
}
