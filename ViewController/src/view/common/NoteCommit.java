package view.common;

import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

public class NoteCommit {
    public NoteCommit() {
    }

    public void doNoteCommit(DialogEvent dialogEvent) {
    
       
        MyADFUtil.executeOperation("Commit");
        MyADFUtil.showSuccessfulMessage("Note Inserted Successfully");
        
    }


    public void noteEditFuction(DialogEvent dialogEvent) {
        MyADFUtil.executeOperation("Commit");
        MyADFUtil.showSuccessfulMessage("Note Edited Successfully");
        
        
    }
    public void noteCreateFetchListner(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        MyADFUtil.executeOperation("CreateInsert");
    }
}
