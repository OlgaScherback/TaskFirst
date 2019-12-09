package model.entity;
import java.util.HashSet;
import java.util.Date;

public abstract class Note {

    private long dateOfAddedNote;
    private long lastModifiedDateOfNote;
    private int importance;


    Note(long dateOfAddedNote, long lastModifiedDateOfNote, final TextData textData ) {

        this.dateOfAddedNote = dateOfAddedNote;
        this.lastModifiedDateOfNote = lastModifiedDateOfNote;
        importance = textData.importance();
    }

    Note(long dateOfAddedNote, long lastModifiedDateOfNote, final PictureData pictureData ) {

        this.dateOfAddedNote = dateOfAddedNote;
        this.lastModifiedDateOfNote = lastModifiedDateOfNote;
        importance = pictureData.importance();
    }


    // getter methods

    public long getDateOfAddedNote() {
        return dateOfAddedNote;
    }

    public long getLastModifiedDateOfNote() {
        return lastModifiedDateOfNote;
    }

    public int getImportance() {
        return importance;
    }

}

