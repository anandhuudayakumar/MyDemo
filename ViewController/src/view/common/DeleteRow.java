package view.common;

import oracle.adf.view.rich.event.DialogEvent;

public class DeleteRow {
    public DeleteRow() {
    }

    public void doDelete(DialogEvent dialogEvent) {
        MyADFUtil.executeOperation("Delete1");
        MyADFUtil.executeOperation("Commit");
        MyADFUtil.showSuccessfulMessage("Row Deleted Successfully");
        
        
        
    }
}
