import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

public class Soldout extends JFrame{ //������ Ŭ����

	JFrame f=new JFrame("������ ȭ��");
	JButton button[] = new JButton[18];
	String namecopy [] = { "�Ƹ޸�ī��", "����Ʈ��", "ī���ī", "��ũƼ", "���ڶ�", "����", "��ī��", "ġ������ũ", "ũ����" };
	int pricecopy[] =  {3000, 4500, 3500, 4000, 4000, 4000, 2000, 5000, 5500 };
	
	Soldout(){
		
		
		
		for (int i = 0; i<9; i++) {
			button[i] = new JButton(namecopy[i] + " ǰ��");
			f.add(button[i]);
		}
	
		button[9] = new JButton("�ʱ�ȭ");
		button[9].setBackground(new Color (255,128,0));
		f.add(button[9]);
		
		button[0].addActionListener(new MyActionListener0());
		button[1].addActionListener(new MyActionListener1());
		button[2].addActionListener(new MyActionListener2());
		button[3].addActionListener(new MyActionListener3());
		button[4].addActionListener(new MyActionListener4());
		button[5].addActionListener(new MyActionListener5());
		button[6].addActionListener(new MyActionListener6());
		button[7].addActionListener(new MyActionListener7());
		button[8].addActionListener(new MyActionListener8());
		button[9].addActionListener(new MyActionListener9());
		
		
		f.setTitle("������ ȭ��"); // ������
		f.setSize(500, 500); // �������
		f.setVisible(true); // â�� ȭ�鿡 ��Ÿ�� ����������
		f.setResizable(false); // â����
		f.setLayout(new GridLayout(0, 3));

	}
	
	
		 class MyActionListener0 implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if (b.getText().equals("�Ƹ޸�ī�� ǰ��")) {
					//Menu.soldout[0] = "�Ƹ޸�ī��";
					Menu.price[0]=0;
					}}}
		 
		 class MyActionListener1 implements ActionListener{
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					if (b.getText().equals("����Ʈ�� ǰ��")) {
						//Menu.soldout[1] = "����Ʈ��";
						Menu.price[1]=0;
						}}}

		 class MyActionListener2 implements ActionListener{
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					if (b.getText().equals("ī���ī ǰ��")) {
						//Menu.soldout[2] = "ī���ī";
						Menu.price[2]=0;
						}}}
		 class MyActionListener3 implements ActionListener{
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					if (b.getText().equals("��ũƼ ǰ��")) {
						//Menu.soldout[3] = "��ũƼ";
						Menu.price[3]=0;
						}}}
		 class MyActionListener4 implements ActionListener{
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					if (b.getText().equals("���ڶ� ǰ��")) {
						//Menu.soldout[4] = "���ڶ�";
						Menu.price[4]=0;
						}}}
		 
		 class MyActionListener5 implements ActionListener{
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					if (b.getText().equals("���� ǰ��")) {
						//Menu.soldout[5] = "����";
						Menu.price[5]=0;
						}}}
		 class MyActionListener6 implements ActionListener{
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					if (b.getText().equals("��ī�� ǰ��")) {
						//Menu.soldout[6] = "��ī��";
						Menu.price[6]=0;
						}}}
		 
		 class MyActionListener7 implements ActionListener{
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					if (b.getText().equals("ġ������ũ ǰ��")) {
						//Menu.soldout[7] = "ġ������ũ";
						Menu.price[7]=0;
						}}}
		 
		 class MyActionListener8 implements ActionListener{
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					if (b.getText().equals("ũ���� ǰ��")) {
						//Menu.soldout[8] = "ũ����";
						Menu.price[8] = 0;
						}}}
		 
		 
				class MyActionListener9 implements ActionListener {
					public void actionPerformed(ActionEvent e) {
						JButton b = (JButton) e.getSource();
						if (b.getText().equals("�ʱ�ȭ")) {
							Menu.price = pricecopy.clone();
							Menu.Menu_name = namecopy.clone();
						}
					}
				}

			

				
        public static void main(String[] args) {
    		// TODO Auto-generated method stub
        	Soldout out = new Soldout();
        	
	}

}
