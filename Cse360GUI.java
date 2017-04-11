import sun.jvm.hotspot.ui.JavaStackTracePanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by CYH on 4/10/17.
 */
public class Cse360GUI {

    public Cse360GUI() throws Exception {

        JFrame mainFrame = mainFrame();

    }

    public JFrame mainFrame() {

        JFrame mainFrame = new JFrame("The Devils' spell checker");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(20, 50);
        textArea.setEditable(false);
        mainFrame.add(textArea, BorderLayout.CENTER);

        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(75, 100));
        mainFrame.getContentPane().add(emptyLabel, BorderLayout.WEST);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());

        JButton runButton = new JButton("Run");
        bottomPanel.add(runButton);

        JButton helpButton = new JButton("Help");
        bottomPanel.add(helpButton);

        JButton quitButton = new JButton("Quit");
        bottomPanel.add(quitButton);

        mainFrame.add(bottomPanel, BorderLayout.SOUTH);

        JPanel rightPanelAdd = new JPanel();
        JButton addButton = new JButton("Add");
        rightPanelAdd.add(addButton);

        JPanel rightPanelIgnore = new JPanel();
        JButton ignoreButton = new JButton("Ignore");
        rightPanelIgnore.add(ignoreButton);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        rightPanel.add(rightPanelAdd, BorderLayout.NORTH);
        rightPanel.add(rightPanelIgnore, BorderLayout.CENTER);

        mainFrame.add(rightPanel, BorderLayout.EAST);

        JPanel upPanel = new JPanel();
        upPanel.setLayout(new FlowLayout());

        JButton replaceButton = new JButton("Replace");
        upPanel.add(replaceButton);

        JButton statisticButton = new JButton("Statistic");
        upPanel.add(statisticButton);

        mainFrame.add(upPanel, BorderLayout.NORTH);

        mainFrame.pack();
        mainFrame.setVisible(true);

        return mainFrame;

    }

    public static void main(String [] args) throws Exception {

        Cse360GUI mainGUI = new Cse360GUI();
    }

}