package org.zigzzzag.wizard;

import com.intellij.openapi.project.Project;
import com.intellij.ui.wizard.WizardDialog;
import com.intellij.ui.wizard.WizardModel;

public class TestDialogWizard extends WizardDialog<WizardModel> {

    public TestDialogWizard(Project project, boolean canBeParent, WizardModel model) {
        super(project, canBeParent, model);
    }
}
