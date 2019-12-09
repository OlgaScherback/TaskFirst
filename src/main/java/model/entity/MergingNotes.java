package model.entity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class MergingNotes {
    //list notes
    private List<Note> listNotes;



    public MergingNotes() {
        listNotes = new ArrayList<Note>();
    }




    public void addTextNote(TextData textData, String heading, String tag ) {
        listNotes.add(new TextNote(textData, heading, tag));
    }

    private List<Note> sortByImportance(List<Note> list) {
        Collections.sort(list, (Comparator) (note1, note2) {
            return (new Integer(note1.getImportance())
                    .compareTo(note2.getImportance()));

        });
        return list;
    }




    public void addPictureNote(PictureData pictureData, String pictureFormat) {
        listNotes.add(new PictureNote(pictureData, pictureFormat));
    }



    public List<Note> getListNotes() {
        return listNotes;
    }


    public void callSortNotesListByImportance() {
        listNotes = sortByImportance(listNotes);
    }


}

