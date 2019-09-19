package view.common;

import oracle.adf.view.rich.event.DialogEvent;

public class DeleteAppointment {
    public DeleteAppointment() {
    }

    public void doDeleteAppointment(DialogEvent dialogEvent) {
        MyADFUtil.executeOperation("Delete");
        MyADFUtil.executeOperation("Commit");
    }
}
