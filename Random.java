import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Random extends JFrame{

	ImageIcon Background= new ImageIcon("C:\\Users\\wlgus\\OneDrive\\���� ȭ��\\KIOSK\\003.jpg");
	JFrame f=new JFrame("���ٹ� Ű����ũ"); 
	public String Value;
	int num = 0;
	
	Random(){
		
		JPanel Back = new JPanel() { //������ �̹��� background����� ���� �ǳڻ���
	    public void paintComponent(Graphics g) {
	    g.drawImage(Background.getImage(),0, 0, null);
	    setOpaque(false); //�׸��� ǥ���ϰ� ����
	    super.paintComponent(g);} };
	        
	    f.setContentPane(Back);//�������� background�� �ٲ�
		f.setTitle("���ٹ� Ű����ũ");//������
        f.setSize(800, 600);//�������
        f.setVisible(true);//â�� ȭ�鿡 ��Ÿ�� ����������
        f.setResizable(false); //â����
        f.setLayout(null);
		
		//��ư����
        JButton button0 = new JButton("PUSH");//��ư�߰�
		button0.setBounds(500,200,100,40);//��ư ��ġ �� ũ�⼳��
		f.add(button0);
		
		JButton button1 = new JButton("ORDER");//��ư�߰�
		button1.setBounds(600,480,130,40);//��ư ��ġ �� ũ�⼳��
		f.add(button1);
		JButton button2 = new JButton("BACK");//��ư�߰�
		button2.setBounds(50,480,130,40);//��ư ��ġ �� ũ�⼳��
		f.add(button2);
		
		button2.addActionListener(new MyActionListener3());
		button1.addActionListener(new MyActionListener4());
		button0.addActionListener(new MyActionListener5());
		
		
	}
	
	private String next(int length) {
		// TODO Auto-generated method stub
		return null;
	}

	class MyActionListener3 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if (b.getText().equals("BACK")) {
				
			new Menu();
			f.setVisible(false);}}}
	
	class MyActionListener4 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if (b.getText().equals("ORDER")) {
				
			new Payment();
			f.setVisible(false);}}}
	
	class MyActionListener5 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if (b.getText().equals("PUSH")) { //push��ư ������
				
				while(num == 0) {
					String[] items = {"��", "�Ƹ޸�ī��", "��Ű", "1000�� ����"};
					int nums= (int) (Math.random()*4); //�����ε��� �ޱ�
					Value = items[nums]; //�迭�ȿ� �������� �����ȿ� �ֱ�
					num =1;
					
					JLabel op = new JLabel(Value); //�󺧸�
					f.add(op);//�����ӿ� �󺧸� �߰�
					op.setBounds(340, 205, 200,30);//������ġ����
					op.setFont(op.getFont().deriveFont(18.0f)); //�۾� ũ������
					}
			}}}

	 public static void main(String[] args) {	
		 Random R = new Random();
	    }
	
}
