package exam12;

public class WriteArticleService {
	private ArticleDao dao;


	public void write() {
		dao.insert();
	}
}
