package GroupProject.Model;



public class Solution {
	private static String prefix="S100";
	private static int iter=1;
	private String sId;
	private String qId;
	private String solution;
	private String techId;
	private String techType ="type1";
	
	

	public void generateSid() {
		this.sId = Solution.prefix + Solution.iter;
		Solution.iter++;
	}
	
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getqId() {
		return qId;
	}
	public void setqId(String qId) {
		this.qId = qId;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public String getTechId() {
		return techId;
	}
	public void setTechId(String techId) {
		this.techId = techId;
	}
	public String getTechType() {
		return techType;
	}
	public void setTechType(String techType) {
		this.techType = techType;
	}

}
