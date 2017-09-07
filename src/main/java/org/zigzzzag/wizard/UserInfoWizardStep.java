package org.zigzzzag.wizard;

import com.intellij.ui.wizard.WizardModel;
import com.intellij.ui.wizard.WizardNavigationState;
import com.intellij.ui.wizard.WizardStep;
import com.intellij.util.ui.JBUI;

import javax.swing.*;
import java.awt.*;

public class UserInfoWizardStep extends WizardStep<WizardModel> {

    private JPanel mainPanel = new JPanel();
    private JLabel firstNameLabel = new JLabel("Enter firstName: ");
    private JLabel secondNameLabel = new JLabel("Enter lastName: ");
    private JTextField firstNameTextField = new JTextField(20);
    private JTextField secondNameTextField = new JTextField(20);

    @Override
    public JComponent prepare(WizardNavigationState state) {
        mainPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "User info step"));

        mainPanel.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = JBUI.insets(10);

        constraints.gridx = 0;
        constraints.gridy = 0;
        mainPanel.add(firstNameLabel, constraints);

        constraints.gridx = 1;
        mainPanel.add(firstNameTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        mainPanel.add(secondNameLabel, constraints);

        constraints.gridx = 1;
        mainPanel.add(secondNameTextField, constraints);

        return mainPanel;
    }
}
