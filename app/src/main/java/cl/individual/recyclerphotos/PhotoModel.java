package cl.individual.recyclerphotos;


public class PhotoModel {
    String imgLink;
    String imgDetail;

    public PhotoModel(String imgLink, String imgDetail) {
        this.imgLink = imgLink;
        this.imgDetail = imgDetail;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getImgDetail() {
        return imgDetail;
    }

    public void setImgDetail(String imgDetail) {
        this.imgDetail = imgDetail;
    }


}
