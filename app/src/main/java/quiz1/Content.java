package quiz1;

import java.util.Date;

public class Content {
    private int contentId;
    private String type;
    private String contentName;
    private Date uploadDate;

    public Content(int contentId, String type, String contentName, Date uploadDate) {
        this.contentId = contentId;
        this.type = type;
        this.contentName = contentName;
        this.uploadDate = uploadDate;
    }

    public void showContentDetails() {
        System.out.println("Content Id: " + contentId);
        System.out.println("Type: " + type);
        System.out.println("Content Name: " + contentName);
        System.out.println("Upload Date: " + uploadDate);
        System.out.println("+----------------------------+");
    }

    public String getType() {
        return type;
    }

    public String getContentName() {
        return contentName;
    }


}
