import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class HelloAction extends AnAction {

    public HelloAction() {
        super("Hello");
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        Messages.showMessageDialog(project, "Welcome to Hell!", "Greeting", Messages.getInformationIcon());
    }
}
