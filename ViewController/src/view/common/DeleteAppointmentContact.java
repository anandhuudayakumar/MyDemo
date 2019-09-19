package view.common;

import oracle.adf.view.rich.event.DialogEvent;

public class DeleteAppointmentContact {
    public DeleteAppointmentContact() {
    }

    public void doDeleteAppointmentContact(DialogEvent dialogEvent) {
        MyADFUtil.executeOperation("Delete1");
        MyADFUtil.executeOperation("Commit");
        MyADFUtil.showSuccessfulMessage("Contact Removed  Successfully");
        
    }
}
