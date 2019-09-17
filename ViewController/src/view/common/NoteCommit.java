package view.common;

import oracle.adf.view.rich.event.DialogEvent;

public class NoteCommit {
    public NoteCommit() {
    }

    public void doNoteCommit(DialogEvent dialogEvent) {
    
        MyADFUtil.executeOperation("CreateInsert");
        MyADFUtil.executeOperation("Commit");
        MyADFUtil.showSuccessfulMessage("Row Inserted Successfully");
        
    }
}
