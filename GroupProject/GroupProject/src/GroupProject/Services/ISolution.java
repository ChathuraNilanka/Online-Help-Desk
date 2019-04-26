package GroupProject.Services;

import java.util.ArrayList;

import GroupProject.Model.Question;
import GroupProject.Model.Solution;

public interface ISolution {
		
		public void addSolution(Solution solution);
		
			//add new query
		
		public void viewSingleSolution(Solution solution);
		
			//view query
		
		public void deleteSolution(Solution solution);
		
			//delete query
		
		public void updateSolution(Solution solution);
		
			//edit query
		
		public ArrayList<Question> getQuestions();
		
		public boolean checkSolutionIsNull(Question question);


}
