package com.inner;

import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;
public class WindowsEventEx02 extends Frame implements WindowListener{

	
	public WindowsEventEx02() {
		super("Evnet02");
		addWindowListener(this);
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new WindowsEventEx02();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
