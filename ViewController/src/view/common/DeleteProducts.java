package view.common;

import oracle.adf.view.rich.event.DialogEvent;

public class DeleteProducts {
    public DeleteProducts() {
    }

    public void doDeleteProduct(DialogEvent dialogEvent) {
        MyADFUtil.executeOperation("Delete");
        MyADFUtil.executeOperation("Commit");
        MyADFUtil.showSuccessfulMessage("Product deleted successfully");
    }
}
