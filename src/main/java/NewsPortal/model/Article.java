package NewsPortal.model;

public class Article {
    private String title;
    private String content;
    private String category;
    private String author;

    public Article(String title,String content,String category,String author){
        this.title=title;
        this.content=content;
        this.category=category;
        this.author=author;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return "Article{" + "title=' " + title + '\'' + ", content=' " + content + '\'' + "category=' " + category +'\'' + ", author=' " + author + '\''+'}';
    }
}
