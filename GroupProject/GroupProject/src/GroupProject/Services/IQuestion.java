package GroupProject.Services;

import java.util.ArrayList;

import GroupProject.Model.Question; 

public interface IQuestion {
	
	public void addQuery(Question question);
	
		//add new query
	
	public void viewSingleQuery(Question question);
	
		//view query
	
	public void deleteQuery(Question question);
	
		//delete query
	
	public void updateQuery(Question question);
	
		//edit query
	
	public ArrayList<Question> getQuestions();
	
	public boolean checkSolutionIsNull(Question question);

}
