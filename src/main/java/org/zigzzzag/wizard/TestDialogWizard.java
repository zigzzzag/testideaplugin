package org.zigzzzag.wizard;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.ValidationInfo;
import com.intellij.ui.wizard.WizardDialog;
import com.intellij.ui.wizard.WizardModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TestDialogWizard extends WizardDialog<WizardModel> {

    final WizardModel model;

    public TestDialogWizard(Project project, boolean canBeParent, WizardModel model) {
        super(project, canBeParent, model);

        this.model = model;
    }

    @Override
    public void onStepChanged() {
        super.onStepChanged();

        Notifications.Bus.notify(
                new Notification("xxx", "Test Notifications", "Welcome to Hell!!!", NotificationType.INFORMATION)
        );
    }

    @Override
    protected void doOKAction() {
        super.doOKAction();

        Notifications.Bus.notify(
                new Notification("yyy", "doOkAction", "doOkAction", NotificationType.INFORMATION)
        );
    }

    @Nullable
    @Override
    protected ValidationInfo doValidate() {
        Notifications.Bus.notify(
                new Notification("yyy", "doValidate", "doValidate", NotificationType.INFORMATION)
        );

        return super.doValidate();
    }

    @NotNull
    @Override
    protected List<ValidationInfo> doValidateAll() {
        Notifications.Bus.notify(
                new Notification("yyy", "doValidateAll", "doValidateAll", NotificationType.INFORMATION)
        );

        return super.doValidateAll();
    }
}
