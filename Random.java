import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Random extends JFrame{

	ImageIcon Background= new ImageIcon("C:\\Users\\wlgus\\OneDrive\\바탕 화면\\KIOSK\\003.jpg");
	JFrame f=new JFrame("융다방 키오스크"); 
	public String Value;
	int num = 0;
	
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
			if (b.getText().equals("PUSH")) { //push버튼 누를시
				
				while(num == 0) {
					String[] items = {"꽝", "아메리카노", "쿠키", "1000원 할인"};
					int nums= (int) (Math.random()*4); //랜덤인덱스 받기
					Value = items[nums]; //배열안에 랜덤값을 변수안에 넣기
					num =1;
					
					JLabel op = new JLabel(Value); //라벨링
					f.add(op);//프레임에 라벨링 추가
					op.setBounds(340, 205, 200,30);//절대위치지정
					op.setFont(op.getFont().deriveFont(18.0f)); //글씨 크기지정
					}
			}}}

	 public static void main(String[] args) {	
		 Random R = new Random();
	    }
	
}
