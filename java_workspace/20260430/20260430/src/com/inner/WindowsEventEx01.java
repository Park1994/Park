package com.inner;

import java.awt.*;
public class WindowsEventEx01 {

		public static void main(String[] args) {
			Frame f = new Frame("Event01");
			WinEvent we = new WinEvent();
			f.addWindowListener(we);
			f.setSize(400,300);
			f.setVisible(true);
		}
}
