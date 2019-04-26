package GroupProject.Services;

import java.sql.*;
import java.util.ArrayList;

import GroupProject.Model.Notice;
import GroupProject.Util.DBconnect;

public class NoticeServiceImpl implements INoticeService {
	
	Connection connection;
	PreparedStatement prepStat;
	
	public void addNotice(Notice notice) {
		
		try {
			connection = DBconnect.getConnection();
			
			prepStat = connection.prepareStatement("insert into notice values (?,?)");
			
			prepStat.setString(1, notice.getNoticeID());
			prepStat.setString(2, notice.getNoticeContent());
			
			prepStat.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(connection != null) {
				try {
					connection.close();
					System.out.println("Database Connection Terminated.");
				}
				catch(Exception e) {
				}
			}
		}
	}

	public void getNoticeByID(Notice notice) {
		try {
			connection = DBconnect.getConnection();
			
			prepStat = connection.prepareStatement("select notice from notice where noticeID = ?");
			prepStat.setString(1, notice.getNoticeID());
			
			ResultSet rs = prepStat.executeQuery();
			
			if(rs.next())
				notice.setNoticeContent(rs.getString("notice"));
		} 
		catch(Exception e) {
			e.printStackTrace();
		} 
		finally {
			if (connection != null) {
				try {
					connection.close();
					System.out.println("Database Connection Terminated.");
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void updateNotice(Notice notice) {
		
		try {
			connection = DBconnect.getConnection();
			
			prepStat = connection.prepareStatement("update notice set notice = ? where noticeID = ?");
			
			prepStat.setString(1, notice.getNoticeContent());
			prepStat.setString(2, notice.getNoticeID());
			
			prepStat.executeUpdate();
			
			System.out.println(notice.getNoticeContent());
			System.out.println(notice.getNoticeID());
		} 
		catch(Exception e) {
			e.printStackTrace();
		} 
		finally {
			if (connection != null) {
				try {
					connection.close();
					System.out.println("Database Connection Terminated.");
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void removeNotice(Notice notice) {
		
		try {
			connection = DBconnect.getConnection();
			
			prepStat = connection.prepareStatement("delete from notice where noticeID = ?");
			
			prepStat.setString(1, notice.getNoticeID());
			
			prepStat.executeUpdate();
		} 
		catch(Exception e) {
			e.printStackTrace();
		} 
		finally {
			if (connection != null) {
				try {
					connection.close();
					System.out.println("Database Connection Terminated.");
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public ArrayList<Notice> getNotice() {
		
		ArrayList<Notice> noticeList = new ArrayList<Notice>();
		
		try {
			connection = DBconnect.getConnection();
			
			prepStat = connection.prepareStatement("select * from notice");
			
			ResultSet rs = prepStat.executeQuery();
			
			while (rs.next()) {
				Notice notice = new Notice();
				notice.setNoticeID(rs.getString(1));
				notice.setNoticeContent(rs.getString(2));
				
				noticeList.add(notice);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if (connection != null) {
				try {
					connection.close();
					System.out.println("Database Connection Terminated.");
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		return noticeList;
	}


	public void viewSingleNotice(Notice notice) {
		try {
			connection = DBconnect.getConnection();
			
			prepStat = connection.prepareStatement("SELECT notice FROM notice WHERE noticeID=?");
			prepStat.setString(1, notice.getNoticeID());
			
			ResultSet rs = prepStat.executeQuery();
			if(rs.next())
				notice.setNoticeContent(rs.getString("notice"));

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
}