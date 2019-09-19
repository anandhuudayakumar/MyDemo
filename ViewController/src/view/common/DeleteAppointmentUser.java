package view.common;

import oracle.adf.view.rich.event.DialogEvent;

public class DeleteAppointmentUser {
    public DeleteAppointmentUser() {
    }

    public void doDeleteAppointmentUser(DialogEvent dialogEvent) {
        // Add event code here...
        MyADFUtil.executeOperation("Delete");
        MyADFUtil.executeOperation("Commit");
        MyADFUtil.showSuccessfulMessage("User remove successfully");
    }
}
