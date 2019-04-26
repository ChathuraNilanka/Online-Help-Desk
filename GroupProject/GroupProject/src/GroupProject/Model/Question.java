package GroupProject.Model;



public class Question {
	private static String prefix="Q100";
	private static int iter=1;
	private String qid;
	private String userId;
	private String query;

	
	public String getqid() {
		return qid;
	}
	
	public void generateQid() {
		this.qid = Question.prefix + Question.iter;
		Question.iter++;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	

	public void setQid(String qid) {
		this.qid = qid;
	}

	
	
}
