package exam11;

public class WriteArticleService {
	private ArticleDao dao;

	
	
	public WriteArticleService(ArticleDao dao) {
		super();
		this.dao = dao;
	}


	public void write() {
		dao.insert();
	}
}
