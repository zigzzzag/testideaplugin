package org.zigzzzag.wizard;

import com.intellij.ui.wizard.WizardModel;
import com.intellij.ui.wizard.WizardNavigationState;
import com.intellij.ui.wizard.WizardStep;
import com.intellij.util.ui.JBUI;

import javax.swing.*;
import java.awt.*;

public class CityInfoWizardStep extends WizardStep<WizardModel> {

    @Override
    public JComponent prepare(WizardNavigationState state) {
        JPanel mainPanel = new JPanel();

        mainPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "City info step"));

        mainPanel.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = JBUI.insets(10);

        constraints.gridx = 0;
        constraints.gridy = 0;
        mainPanel.add(new JLabel("Enter cityName: "), constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        mainPanel.add(new JTextField(20), constraints);
        constraints.gridwidth = 1;

        constraints.gridx = 0;
        constraints.gridy = 1;
        mainPanel.add(new JLabel("Checkbox Test: "), constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        mainPanel.add(new JCheckBox(), constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        mainPanel.add(new JLabel("RadioGroup Test: "), constraints);

        JRadioButton radio1 = new JRadioButton("radio 1");
        JRadioButton radio2 = new JRadioButton("radio 2");
        ButtonGroup buttonGroup  = new ButtonGroup();
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);

        constraints.gridx = 1;
        constraints.gridy = 2;
        mainPanel.add(radio1, constraints);

        constraints.gridx = 2;
        constraints.gridy = 2;
        mainPanel.add(radio2, constraints);

        return mainPanel;
    }
}
