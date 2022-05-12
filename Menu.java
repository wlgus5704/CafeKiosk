
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu extends JFrame{
	
		JFrame f=new JFrame("융다방 키오스크"); 
		ImageIcon image = new ImageIcon("C:\\Users\\wlgus\\OneDrive\\바탕 화면\\KIOSK\\002.jpg");

		int totalPrice = 0;
		
		Menu(){
		
		JPanel Back = new JPanel() { //프레임 이미지 background만들기 위해 판넬생성
		public void paintComponent(Graphics g) {
		g.drawImage(image.getImage(),0, 0, null);
		setOpaque(false); //그림을 표시하게 설정
		super.paintComponent(g);} };
			        
		f.setContentPane(Back);//프레임을 background로 바꿈
		
		//가격 배열
		int price[] = {3000, 4500, 3500, 4000, 4000, 4000, 2000, 5000, 5500};
		
		//소제목 
		JLabel A = new JLabel("COFFEE"); //라벨링
		JLabel B = new JLabel("NON-COFFEE");
		JLabel C = new JLabel("DESERT");
		f.add(A);
		A.setBounds(35, 35, 100,30);//절대위치지정
		f.add(B);
		B.setBounds(35, 200, 100,30);
		f.add(C);
		C.setBounds(35, 360, 100,30);
		
		//메뉴이름,가격 1줄
		JLabel small_Ame = new JLabel("아메리카노");   
		f.add(small_Ame);
		small_Ame.setBounds(125, 65, 65,30);
		JLabel price_Ame = new JLabel("3000원");   
		f.add(price_Ame);
		price_Ame.setBounds(125, 85, 65,30);
		
		JLabel small_lat = new JLabel("스위트 라떼");   
		f.add(small_lat);
		small_lat.setBounds(315, 65, 65,30);
		JLabel price_lat = new JLabel("4500원");   
		f.add(price_lat);
		price_lat.setBounds(315, 85, 65,30);
		
		JLabel small_moc = new JLabel("카페모카");   
		f.add(small_moc);
		small_moc.setBounds(500, 65, 65,30);
		JLabel price_moc = new JLabel("3500원");   
		f.add(price_moc);
		price_moc.setBounds(500, 85, 65,30);
		
		//메뉴이름,가격 2줄
		JLabel small_mi = new JLabel("밀크티");   
		f.add(small_mi);
		small_mi.setBounds(125, 230, 65,30);
		JLabel price_mi = new JLabel("4000원");   
		f.add(price_mi);
		price_mi.setBounds(125, 250, 65,30);
		
		
		JLabel small_cho = new JLabel("초코라떼");   
		f.add(small_cho);
		small_cho.setBounds(315, 230, 65,30);
		JLabel price_cho = new JLabel("4000원");   
		f.add(price_cho);
		price_cho.setBounds(315, 250, 65,30);
		
		JLabel small_gre = new JLabel("녹차");   
		f.add(small_gre);
		small_gre.setBounds(500, 230, 65,30);
		JLabel price_gre = new JLabel("4000원");   
		f.add(price_gre);
		price_gre.setBounds(500, 250, 65,30);
		
		//메뉴이름,가격 3줄
		JLabel small_ma = new JLabel("마카롱");   
		f.add(small_ma);
		small_ma.setBounds(125, 400, 65,30);
		JLabel price_ma = new JLabel("2000원");   
		f.add(price_ma);
		price_ma.setBounds(125, 420, 65,30);
		
		JLabel small_che = new JLabel("치즈케이크");   
		f.add(small_che);
		small_che.setBounds(315, 400, 65,30);
		JLabel price_che = new JLabel("5000원");   
		f.add(price_che);
		price_che.setBounds(315, 420, 65,30);
		
		JLabel small_wa = new JLabel("크로플");   
		f.add(small_wa);
		small_wa.setBounds(500, 400, 65,30);
		JLabel price_wa = new JLabel("5500원");   
		f.add(price_wa);
		price_wa.setBounds(500, 420, 65,30);
				
		
		//메인버튼 두개
		JButton button2 = new JButton("BACK");
		button2.setBounds(625,40,100,40);
		f.add(button2);
		button2.addActionListener(new MyActionListener2());//액션리스너 추가
		
		JButton button = new JButton("ORDER");//버튼추가
		button.setBounds(625,480,100,40);//버튼 위치 및 크기설정
		f.add(button);
		button.addActionListener(new MyActionListener3());//액션리스너 추가
		
		//coffee 이미지
		JLabel Americano = new JLabel(new ImageIcon("C:\\Users\\wlgus\\OneDrive\\바탕 화면\\KIOSK\\아메리카노(정사각형).jpg"));
		JLabel Latte = new JLabel(new ImageIcon("C:\\Users\\wlgus\\OneDrive\\바탕 화면\\KIOSK\\라떼(정사각형).jpg"));
		JLabel mocha = new JLabel(new ImageIcon("C:\\Users\\wlgus\\OneDrive\\바탕 화면\\KIOSK\\카페모카(정사각형).jpg"));
			
		//coffee 위치설정
		f.add(Americano);
		Americano.setBounds(35, 65, 80,80);
		f.add(Latte);
		Latte.setBounds(220, 65, 80,80);
		f.add(mocha);
		mocha.setBounds(400, 65, 80,80);
					
		//non-coffee 이미지
		JLabel milktea = new JLabel(new ImageIcon("C:\\Users\\wlgus\\OneDrive\\바탕 화면\\KIOSK\\밀크티(정사각형).jpg"));	
		JLabel choco = new JLabel(new ImageIcon("C:\\Users\\wlgus\\OneDrive\\바탕 화면\\KIOSK\\초코라떼(정사각형).jpg"));	
		JLabel greentea = new JLabel(new ImageIcon("C:\\Users\\wlgus\\OneDrive\\바탕 화면\\KIOSK\\녹차(정사각형).jpg"));	
		
		//non-coffee 위치설정
		f.add(milktea);
		milktea.setBounds(35, 230, 80,80);
		f.add(choco);
		choco.setBounds(225, 230, 80,80);
		f.add(greentea);
		greentea.setBounds(400, 230, 80,80);
				
		//desert
		JLabel macaroon = new JLabel(new ImageIcon("C:\\Users\\wlgus\\OneDrive\\바탕 화면\\KIOSK\\마카롱(정사각형).jpg"));	
		JLabel cake = new JLabel(new ImageIcon("C:\\Users\\wlgus\\OneDrive\\바탕 화면\\KIOSK\\치즈케이크(정사각형).jpg"));
		JLabel waffle = new JLabel(new ImageIcon("C:\\Users\\wlgus\\OneDrive\\바탕 화면\\KIOSK\\크로플(정사각형).jpg"));
				
		//desert 위치설정
		f.add(macaroon);
		macaroon.setBounds(35, 400, 80,80);
		f.add(cake);
		cake.setBounds(220, 400, 80,80);
		f.add(waffle);
		waffle.setBounds(400, 400, 80,80);
						
		
		//JSpinner
		SpinnerModel americano_v =
		         new SpinnerNumberModel(0, //initial value
		            0, //minimum value
		            30, //maximum value
		            1); //step
		SpinnerModel sweetlatte_v = new SpinnerNumberModel(0, 0, 30, 1); 
		SpinnerModel cafemocha_v = new SpinnerNumberModel(0, 0, 30, 1); 
		SpinnerModel milktea_v = new SpinnerNumberModel(0, 0, 30, 1); 
		SpinnerModel chocolatte_v = new SpinnerNumberModel(0, 0, 30, 1); 
		SpinnerModel greentea_v = new SpinnerNumberModel(0, 0, 30, 1); 
		SpinnerModel macaron_v = new SpinnerNumberModel(0, 0, 30, 1); 
		SpinnerModel cheesecake_v = new SpinnerNumberModel(0, 0, 30, 1); 
		SpinnerModel croffle_v = new SpinnerNumberModel(0, 0, 30, 1); 
		
		JSpinner americano_s = new JSpinner(americano_v); 
		JSpinner sweetlatte_s = new JSpinner(sweetlatte_v); 
		JSpinner cafemocha_s = new JSpinner(cafemocha_v); 
		JSpinner milktea_s = new JSpinner(milktea_v); 
		JSpinner chocolatte_s = new JSpinner(chocolatte_v); 
		JSpinner greentea_s = new JSpinner(greentea_v); 
		JSpinner macaron_s = new JSpinner(macaron_v); 
		JSpinner cheesecake_s = new JSpinner(cheesecake_v); 
		JSpinner croffle_s = new JSpinner(croffle_v); 
		
		//주문수량 받아오기
		int ordernum[] = {(int)americano_s.getValue(), (int)sweetlatte_s.getValue(), (int)cafemocha_s.getValue(), (int)milktea_s.getValue(), 
				(int)chocolatte_s.getValue(), (int)greentea_s.getValue(), (int)macaron_s.getValue(), (int)cheesecake_s.getValue(), (int)croffle_s.getValue()};
		
		// 총가격 구하기 (메소드 따로 만들기)
		for(int i=0; i<ordernum.length; i++)
			totalPrice += ordernum[i]*price[i];
		
		
		
		f.add(americano_s);
		americano_s.setBounds(125,110,50,30);
		f.add(sweetlatte_s);
		sweetlatte_s.setBounds(320,110,50,30); 
		f.add(cafemocha_s);
		cafemocha_s.setBounds(500,110,50,30); 
		f.add(milktea_s);
		milktea_s.setBounds(125, 275, 50,30);
		f.add(chocolatte_s);
		chocolatte_s.setBounds(315, 275, 50,30);
		f.add(greentea_s);
		greentea_s.setBounds(500, 275, 50,30);
		f.add(macaron_s);
		macaron_s.setBounds(125, 445, 50,30);
		f.add(cheesecake_s);
		cheesecake_s.setBounds(315, 445, 50,30);
		f.add(croffle_s);
		croffle_s.setBounds(500, 445, 50,30);
		
		
		f.setSize(800,600);  
		f.setLayout(null);
	    f.setVisible(true); 
	
	
	
}
	class MyActionListener2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if (b.getText().equals("BACK")) {
				
			new Main();
			f.setVisible(false);}}}
	
	class MyActionListener3 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if (b.getText().equals("ORDER")) {
				
			new Random();
			f.setVisible(false);}}}
	
	public static void main(String[] args) {	
        Menu frame = new Menu();
        
    }
}
