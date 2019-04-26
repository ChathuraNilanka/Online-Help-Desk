package GroupProject.Model;

public class Notice {
	
	private static String prefix = "N100";
	private static int iter = 1;
	private String noticeID;
	private String noticeContent;
	
	public void setNoticeID(String noticeID) {
		this.noticeID = noticeID;
	}
	
	public String getNoticeID() {
		return noticeID;
	}
	
	public void generateNoticeID() {
		this.noticeID = Notice.prefix + Notice.iter;
		Notice.iter++;
	}
	
	public String getNoticeContent() {
		return noticeContent;
	}
	
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
}

