package view.common;

import oracle.adf.view.rich.event.DialogEvent;

public class backingBeanOfTaskDelete {
    public backingBeanOfTaskDelete() {
    }

    public void deleteNotes(DialogEvent dialogEvent) {
        MyADFUtil.executeOperation("Delete");
        MyADFUtil.executeOperation("Commit");
        MyADFUtil.showSuccessfulMessage("Task Deleted Successfully");
    }
}
