package GroupProject.Services;

import java.util.ArrayList;

import java.sql.*;

import GroupProject.Model.Question;
import GroupProject.Util.DBconnect;

public class IQuestionImpl implements IQuestion {
	

	Connection connection;
	PreparedStatement prep;
	
	public void addQuery(Question question) {
		
		try {
			connection = DBconnect.getConnection();
			
			prep = connection.prepareStatement("insert into query values(?,?,?)");
			
			prep.setString(1, question.getqid());
			prep.setString(2, question.getUserId());
			prep.setString(4, question.getQuery());
			
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

	public void viewSingleQuery(Question question) {
		
		try {
			connection = DBconnect.getConnection();
			
			prep = connection.prepareStatement("SELECT question FROM query WHERE qid=?");
			prep.setString(1, question.getqid());
			
			ResultSet rs = prep.executeQuery();
			if(rs.next())
				question.setQuery(rs.getString("question"));

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
	

	public void deleteQuery(Question question) {
		try {
			connection = DBconnect.getConnection();
			
			
			prep = connection.prepareStatement("DELETE FROM query WHERE qid = ?");
			
			prep.setString(1, question.getqid());
			
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

	public void updateQuery(Question question) {
		try {
			connection = DBconnect.getConnection();
			
			
			prep = connection.prepareStatement("update query set question = ? where qid = ?");
			
			prep.setString(1, question.getQuery());
			prep.setString(2, question.getqid());
			
			prep.executeUpdate();
			System.out.println(question.getQuery());
			System.out.println(question.getqid());
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
