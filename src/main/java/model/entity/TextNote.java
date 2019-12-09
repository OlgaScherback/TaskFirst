package model.entity;

public class TextNote extends Note {

    //class of TextNote

    private String heading;
    private String tag;

    //constructor

    TextNote(TextData textData, String heading, String tag) {
        super(long dateOfAddedNote, long lastModifiedDateOfNote, TextData textData);

        heading = textData.heading();
        tag = textData.tag();
    }


    //getter methods
    public String getHeading() { return heading;}
    public String getTag() { return tag;}






}
