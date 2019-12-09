package model.entity;

public enum PictureData {

    PlanDay ("JPG", 1 ),
    Study ("JPEG", 2 ),
    HomeAndFamily ("PNG", 3),
    Travel ("WEBP", 4),
    Motivation ("RAW", 5),
    Books ("TIFF",  6);


    PictureData(String pictureFormat, int importance) {
    this.pictureFormat = pictureFormat;
    this.importance = importance;
}

    private String pictureFormat;
    private int importance;

    public String pictureFormat () { return pictureFormat;}
    public int importance() { return importance; }

}
