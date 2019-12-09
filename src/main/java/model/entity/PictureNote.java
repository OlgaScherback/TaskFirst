package model.entity;

public class PictureNote extends Note {

    private String pictureFormat;

    PictureNote(PictureData pictureData, String pictureFormat) {
        super(long dateOfAddedNote, long lastModifiedDateOfNote, PictureData pictureData);
        this.pictureFormat = pictureData.pictureFormat();
    }

    // getter methods
    public String pictureFormat() { return pictureFormat;}

}
