package com.usebuttonevent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ʵ�ֵ����¼��������ӿڣ���Ϊ�����¼�ActionEvent�Ĵ�����
class ButtonHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("�����˵����¼�");
	}
}
