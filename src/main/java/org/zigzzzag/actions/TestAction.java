package org.zigzzzag.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.TitlePanel;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TestAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);

        DialogWrapper dialogWrapper = new DialogWrapper(project, true) {
            @Nullable
            @Override
            protected JComponent createCenterPanel() {
                return new TestPanel("TestPanel");
            }
        };
        dialogWrapper.show();
    }
}
