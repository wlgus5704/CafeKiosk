import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    ImageIcon image= new ImageIcon("C:\\Users\\wlgus\\OneDrive\\���� ȭ��\\KIOSK\\001.jpg");
    //�̹��� ������ �ҷ�����
    	JFrame f = new JFrame("���ٹ� Ű����ũ"); 
    	boolean Takeout = false;
    	Main() {
    		
    		
    		
        JPanel background = new JPanel() { //������ �̹��� background����� ���� �ǳڻ���
        public void paintComponent(Graphics g) {
        g.drawImage(image.getImage(),0, 0, null);
        setOpaque(false); //�׸��� ǥ���ϰ� ����
        super.paintComponent(g);} };
        
        f.setContentPane(background);//�������� background�� �ٲ�
        f.setTitle("���ٹ� Ű����ũ");//������
        f.setSize(800, 600);//�������
        f.setVisible(true);//â�� ȭ�鿡 ��Ÿ�� ����������
        f.setResizable(false); //â����
        f.setLayout(null);
        
        
		
		JButton button = new JButton("����");
		button.setBounds(480,480,130,40);
		button.addActionListener(new MyActionListener());
		JButton button2 = new JButton("����ũ�ƿ�");//��ư�߰�
		button2.setBounds(180,480,130,40);//��ư ��ġ �� ũ�⼳��
		button2.addActionListener(new MyActionListener());
		
		f.add(button); //��ư �߰�
		f.add(button2); 
    }
    	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if (b.getText().equals("����ũ�ƿ�"))
				Takeout = true;
				
			new Menu();
			f.setVisible(false);}}
			
    
    public static void main(String[] args) {	
        Main frame = new Main();
    }
	
}
