package view.common;

import oracle.adf.view.rich.event.DialogEvent;

public class DeleteNotes {
    public DeleteNotes() {
    }

    public void deleteNotesFromList(DialogEvent dialogEvent) {
        MyADFUtil.executeOperation("Delete");
        MyADFUtil.executeOperation("Commit");
        MyADFUtil.showSuccessfulMessage("Note Deleted Successfully");
        
    }
}
