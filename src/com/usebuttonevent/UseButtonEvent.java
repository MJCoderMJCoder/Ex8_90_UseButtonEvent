package com.usebuttonevent;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UseButtonEvent {

	public static void main(String[] args) {
		JFrame frm = new JFrame("����¼�");
		frm.setLayout(new BorderLayout());
		
		//������ť�����ע�������������Ȩ������Ϊ���¼������ߣ���ʱҲ��Ϊ������������
		JButton btn = new JButton("�뵥������ť");
		frm.getContentPane().add(btn);
		ButtonHandler btnHandler = new ButtonHandler();
		btn.addActionListener(btnHandler);	//�뵥���¼���ص���Ȩ������������Ϊ�¼������߶���
		
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}

}
