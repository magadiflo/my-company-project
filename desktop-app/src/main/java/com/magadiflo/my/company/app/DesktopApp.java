package com.magadiflo.my.company.app;

import javax.swing.*;
import java.awt.*;

public class DesktopApp extends JFrame {

    private static final String APP_NAME = CommonUtility.getAppName();

    public DesktopApp() {
        super(APP_NAME);
        setLayout(new FlowLayout());
        add(new JLabel("Welcome to " + APP_NAME));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DesktopApp().setVisible(true);
            }
        });
    }
}
