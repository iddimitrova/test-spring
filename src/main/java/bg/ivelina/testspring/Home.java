package bg.ivelina.testspring;

/**
 * Created by IDD on 7/15/2017.
 */
public class Home {
    private int id;
    private String content;

    public Home(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
