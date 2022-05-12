import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Random extends JFrame{

	ImageIcon Background= new ImageIcon("C:\\Users\\wlgus\\OneDrive\\바탕 화면\\KIOSK\\003.jpg");
	JFrame f=new JFrame("융다방 키오스크"); 
	
	Random(){
		
		JPanel Back = new JPanel() { //프레임 이미지 background만들기 위해 판넬생성
	    public void paintComponent(Graphics g) {
	    g.drawImage(Background.getImage(),0, 0, null);
	    setOpaque(false); //그림을 표시하게 설정
	    super.paintComponent(g);} };
	        
	    f.setContentPane(Back);//프레임을 background로 바꿈
		f.setTitle("융다방 키오스크");//제목설정
        f.setSize(800, 600);//사이즈설정
        f.setVisible(true);//창을 화면에 나타낼 것인지설정
        f.setResizable(false); //창고정
        f.setLayout(null);
		
		
		//버튼세개
        JButton button0 = new JButton("PUSH");//버튼추가
		button0.setBounds(500,200,100,40);//버튼 위치 및 크기설정
		f.add(button0);
		
		JButton button1 = new JButton("ORDER");//버튼추가
		button1.setBounds(600,480,130,40);//버튼 위치 및 크기설정
		f.add(button1);
		JButton button2 = new JButton("BACK");//버튼추가
		button2.setBounds(50,480,130,40);//버튼 위치 및 크기설정
		f.add(button2);
		button2.addActionListener(new MyActionListener3());
		
		
		
		
		
	}
	
	class MyActionListener3 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if (b.getText().equals("BACK")) {
				
			new Menu();
			f.setVisible(false);}}}

	 public static void main(String[] args) {	
		 Random frame = new Random();
	    }
	
}
