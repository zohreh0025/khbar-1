package ir.akhbar;

public class NewsData {

    private String newsTitle;
    private String newsDescription;
    private String newsImage;

    public NewsData(String newsTitle, String newsDescription, String newsImage) {
        this.newsTitle = newsTitle;
        this.newsDescription = newsDescription;
        this.newsImage = newsImage;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public String getNewsDescription() {
        return newsDescription;
    }

    public String getNewsImage() {
        return newsImage;
    }
}
