package com.inner;
import java.awt.*;
import java.awt.event.*;

public class WindowsEventEx03 extends Frame {

	
	public WindowsEventEx03() {
		super("Event03");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(400,300);
		setVisible(true);
		
	}
	
		public static void main(String[] args) {
			new WindowsEventEx03();
		}
}
