package com.company.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {

    JFrame f;
    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go(){
        f = new JFrame();
        JButton jButton = new JButton("should i do it");
        jButton.addActionListener(new A());
        jButton.addActionListener(new B());
        f.getContentPane().add(BorderLayout.CENTER,jButton);
    }

    class A implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("A");
        }
    }

    class B implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("B");
        }
    }
}
