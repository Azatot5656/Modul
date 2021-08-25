package chess;

import javax.swing.*;
import java.awt.*;

public class chess {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 512, 512);
        frame.setUndecorated(true);
        JPanel pl = new JPanel() {
            @Override
            public void paint(Graphics g) {
                boolean white = true;

                for (int y = 0; y < 8; y++) {
                    for (int x = 0; x < 8; x++) {
                        if (white) {
                            g.setColor(Color.white);
                        } else {
                            g.setColor(Color.black);
                        }
                        white = !white;
                        g.fillRect(x * 64, y * 64, 64, 64);
                    }
                    white = !white;
                }
            }
        };
        frame.add(pl);
        frame.setVisible(true);

    }
}