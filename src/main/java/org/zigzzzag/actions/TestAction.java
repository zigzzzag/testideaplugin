package org.zigzzzag.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.ui.wizard.WizardModel;
import org.zigzzzag.wizard.TestDialogWizard;
import org.zigzzzag.wizard.UserInfoWizardStep;

public class TestAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);

        WizardModel testWizardModel = new WizardModel("Test wizard model");
        testWizardModel.add(new UserInfoWizardStep());

        TestDialogWizard dialogWizard = new TestDialogWizard(project, true, testWizardModel);
        dialogWizard.show();
    }
}
