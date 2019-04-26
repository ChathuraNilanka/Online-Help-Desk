package GroupProject.Services;

import java.util.ArrayList;

import GroupProject.Model.Notice;
import GroupProject.Model.Question;

public interface INoticeService {
	
	//add a notice
	public void addNotice(Notice notice);
	
	//get particular notice
	public void getNoticeByID(Notice notice);
	
	//update existing notice
	public void updateNotice(Notice notice);
	
	//remove existing notice
	public void removeNotice(Notice notice);
	
	public ArrayList <Notice> getNotice();
	
	public void viewSingleNotice(Notice notice);
}
