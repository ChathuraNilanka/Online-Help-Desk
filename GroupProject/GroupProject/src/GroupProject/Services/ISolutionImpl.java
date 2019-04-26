package GroupProject.Services;

import java.sql.*;
import java.util.ArrayList;


import GroupProject.Model.Question;
import GroupProject.Model.Solution;
import GroupProject.Util.DBconnect;

public class ISolutionImpl implements ISolution{
	
	Connection connection;
	PreparedStatement prep;


	public void addSolution(Solution solution) {
		try {
			connection = DBconnect.getConnection();
			
			prep = connection.prepareStatement("insert into solutions values(?,?,?,?,?)");
			
			prep.setString(1, solution.getsId());
			prep.setString(2, solution.getqId());
			prep.setString(3, solution.getSolution());
			prep.setString(4, solution.getTechId());
			prep.setString(5, solution.getTechType());
			
			prep.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Database Connection Terminated");
                } catch (Exception e) {
                	e.printStackTrace();
                }
            }
		}
		
	}

	
	public void viewSingleSolution(Solution solution) {
		try {
			connection = DBconnect.getConnection();
			
			prep = connection.prepareStatement("SELECT solution FROM solutions WHERE qid=?");
			prep.setString(1, solution.getqId());
			
			ResultSet rs = prep.executeQuery();
			if(rs.next())
				solution.setSolution(rs.getString("solution"));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Database Connection Terminated");
                } catch (Exception e) {
                	e.printStackTrace();
                }
            }
		}
		
	}

	public void deleteSolution(Solution solution) {
		try {
			connection = DBconnect.getConnection();
			
			
			prep = connection.prepareStatement("DELETE FROM solutions WHERE qid = ?");
			
			prep.setString(1, solution.getqId());
			
			prep.executeUpdate();
	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Database Connection Terminated");
                } catch (Exception e) {
                	e.printStackTrace();
                }
            }
		}
		
	}


	public void updateSolution(Solution solution) {
		try {
			connection = DBconnect.getConnection();
			
			
			prep = connection.prepareStatement("update solutions set solution = ? where qid = ?");
			
			prep.setString(1, solution.getSolution());
			prep.setString(2, solution.getqId());
			
			prep.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Database Connection Terminated");
                } catch (Exception e) {
                	e.printStackTrace();
                }
            }
		}
		
	}
	
	public ArrayList<Question> getQuestions() {
			
			return actionOnQuestion(null);
		}

	private ArrayList<Question> actionOnQuestion(String questionID) {
			
			ArrayList<Question> questionList = new ArrayList<Question>();
			try {
				connection = DBconnect.getConnection();
		
				prep = connection.prepareStatement("select * from query");
				
				
				ResultSet rs = prep.executeQuery();
	
				while (rs.next()) {
					Question question = new Question();
					question.setQid(rs.getString(1));
					question.setUserId(rs.getString(2));
					question.setQuery(rs.getString(4));
					
					questionList.add(question);
				}
	
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
				if (connection != null) {
	                try {
	                    connection.close();
	                    System.out.println("Database Connection Terminated");
	                } catch (Exception e) {
	                	e.printStackTrace();
	                }
	            }
			} 
			return questionList;
		}


	@Override
	public boolean checkSolutionIsNull(Question question) {
		String qid = null;
		
		try {
			connection = DBconnect.getConnection();
			
			prep = connection.prepareStatement("SELECT sid FROM solutions WHERE qid=?");
			prep.setString(1, question.getqid());
			
			ResultSet rs = prep.executeQuery();
			if(rs.next())
				qid = rs.getString("sid");
			
			if(qid == null || qid == "") {
				return true;
			}
			
			else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Database Connection Terminated");
                } catch (Exception e) {
                	e.printStackTrace();
                }
            }
		}
		return false;
	}

}
