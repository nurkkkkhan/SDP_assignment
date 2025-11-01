package NewsPortal.BuildetPattern;
import NewsPortal.model.Article;
public class ArticleBuilder {
    private String title;
    private String content;
    private String category;
    private String author;

    public ArticleBuilder(){

    }

    public ArticleBuilder title(String title){
        this.title=title;
        return this;
    }
    public ArticleBuilder content(String content){
        this.content=content;
        return this;
    }
    public ArticleBuilder category(String category){
        this.category=category;
        return this;
    }
    public ArticleBuilder author(String author){
        this.author=author;
        return this;
    }
    public Article build(){
        validateArticle();
        return new Article(title,content,category,author);
    }
    private void validateArticle(){
        if(title==null || title.isEmpty()){
            throw new IllegalArgumentException("Article title cannot be null or empty");
        }
        if(content==null || content.isEmpty()){
            throw new IllegalArgumentException("Article content cannot be null or empty");
        }
        if(author==null||author.isEmpty()){
            throw new IllegalArgumentException("Article author cannot be null or empty");
        }

    }
}
