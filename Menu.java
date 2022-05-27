import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Menu extends JFrame {

	JFrame f = new JFrame("융다방 키오스크");
	ImageIcon image = new ImageIcon("images/002.jpg");

	public static int totalPrice = 0;
	static String order_list = ""; // 주문내용 받아올 string
	int ordernum[] = new int[9];
	int price[] = { 3000, 4500, 3500, 4000, 4000, 4000, 2000, 5000, 5500 };
	String[] Menu_name = { "아메리카노", "스위트라떼", "카페모카", "밀크티", "초코라떼", "녹차", "마카롱", "치즈케이크", "크로플" };

	Menu() {

		JPanel Back = new JPanel() { // 프레임 이미지 background만들기 위해 판넬생성
			public void paintComponent(Graphics g) {
				g.drawImage(image.getImage(), 0, 0, null);
				setOpaque(false);    // 그림을 표시하게 설정
				super.paintComponent(g);
			}
		};
		
		// 프레임을 background로 바꿈
		f.setContentPane(Back);

		// 소제목
		JLabel A = new JLabel("COFFEE"); // 라벨링
		JLabel B = new JLabel("NON-COFFEE");
		JLabel C = new JLabel("DESERT");
		f.add(A);
		A.setBounds(35, 35, 100, 30);   // 절대위치지정
		f.add(B);
		B.setBounds(35, 200, 100, 30);
		f.add(C);
		C.setBounds(35, 360, 100, 30);

		// 메뉴이름,가격 1줄
		JLabel[] menuLabel = new JLabel[9];
		JLabel[] priceLabel = new JLabel[9];
		JLabel[] menuImages = new JLabel[9];
		
		//품절메뉴
		String [] soldout = {"","","","","","","","",""};
		//아메리카노, 스위트라떼, 카페모카, 밀크티, 초코라떼, 녹차, 마카롱, 치즈케이크, 크로플
		
		for(int j =0; j<9; j++) {
			if(soldout[j] == Menu_name[j]) {
			
				switch(j) {
				case 0:
					Menu_name[0] = Menu_name[1];
					Menu_name[1] = Menu_name[2];
					Menu_name[2] = "";
					price[0] = price[1];
					price[1] = price[2];
					price[2] = 0;
					break;
				case 1:
					Menu_name[1] = Menu_name[2];
					Menu_name[2] = "";
					price[1] = price[2];
					price[2] = 0;
					break;
				case 2: 	
					Menu_name[2] = "";
					price[2] = 0;
					break;
				case 3:
					Menu_name[3] = Menu_name[4];
					Menu_name[4] = Menu_name[5];
					Menu_name[5] = "";
					price[3] = price[4];
					price[4] = price[5];
					price[5] = 0;
					break;
				case 4:
					Menu_name[4] = Menu_name[5];
					Menu_name[5] = "";
					price[4] = price[5];
					price[5] =0;
					break;
				case 5:
					Menu_name[5] = "";
					price[5] = 0;
					break;
				case 6:
					Menu_name[6] = Menu_name[7];
					Menu_name[7] = Menu_name[8];
					Menu_name[8] = "";
					price[6] = price[7];
					price[7] = price[8];
					price[8] = 0;
					break;
				case 7:
					Menu_name[7] = Menu_name[7];
					Menu_name[8] = "";
					price[7] = price[8];
					price[8] =0;
					break;
				case 8:
					Menu_name[8] = "";
					price[8] = 0;
					break;
					
				}
				
				}}
			
		int x = 125; //라벨
		int y = 65;
		
		int xx = 35; //이미지
		int yy = 65;
		
		for (int i = 0 ; i < Menu_name.length; i++) {
			
			
			menuLabel[i] = new JLabel(Menu_name[i]);
			f.add(menuLabel[i]);
			menuLabel[i].setBounds(x, y, 65, 26);
			
			if(price[i] != 0) {
			priceLabel[i] = new JLabel(Integer.toString(price[i]));
			f.add(priceLabel[i]);
			priceLabel[i].setBounds(x, y+20, 60, 25);}
			
			
			menuImages[i] = new JLabel(new ImageIcon("images/"+ Menu_name[i] +"(정사각형).jpg"));
			f.add(menuImages[i]);
			menuImages[i].setBounds(xx, yy, 80, 80);
			
			if (i%3 ==2 ) {  // 인덱스 2, 5, 8
				x = 125;     //JLabel
				y += 165; 
				
				xx = 35;     //이미지
				yy += 165;   }
			
			else if (i%3 == 0 || i%3 == 1) {  // 인덱스 1, 2, 4, 5, 7, 8
				x += 190;
				xx += 185; }
		}
		

		// 메인버튼 두개
		JButton button2 = new JButton("BACK");
		button2.setBounds(625, 40, 100, 40);
		f.add(button2);
		button2.addActionListener(new MyActionListener2());// 액션리스너 추가

		JButton button = new JButton("ORDER");            // 버튼추가
		button.setBounds(625, 480, 100, 40);              // 버튼 위치 및 크기설정
		f.add(button);
		button.addActionListener(new MyActionListener3());// 액션리스너 추가


		
		SpinnerModel americano_v = new SpinnerNumberModel(0, // initial value
				0, // minimum value
				30, // maximum value
				1); // step
		SpinnerModel sweetlatte_v = new SpinnerNumberModel(0, 0, 30, 1);
		SpinnerModel cafemocha_v = new SpinnerNumberModel(0, 0, 30, 1);
		SpinnerModel milktea_v = new SpinnerNumberModel(0, 0, 30, 1);
		SpinnerModel chocolatte_v = new SpinnerNumberModel(0, 0, 30, 1);
		SpinnerModel greentea_v = new SpinnerNumberModel(0, 0, 30, 1);
		SpinnerModel macaron_v = new SpinnerNumberModel(0, 0, 30, 1);
		SpinnerModel cheesecake_v = new SpinnerNumberModel(0, 0, 30, 1);
		SpinnerModel croffle_v = new SpinnerNumberModel(0, 0, 30, 1);

		
		// JSpinner (-숫자와 최대숫자 제한을 위한 코드)
				
		JSpinner americano_s = new JSpinner(americano_v);
		JSpinner sweetlatte_s = new JSpinner(sweetlatte_v);
		JSpinner cafemocha_s = new JSpinner(cafemocha_v);
		JSpinner milktea_s = new JSpinner(milktea_v);
		JSpinner chocolatte_s = new JSpinner(chocolatte_v);
		JSpinner greentea_s = new JSpinner(greentea_v);
		JSpinner macaron_s = new JSpinner(macaron_v);
		JSpinner cheesecake_s = new JSpinner(cheesecake_v);
		JSpinner croffle_s = new JSpinner(croffle_v);

		americano_s.addChangeListener(new SpinnerListener0());
		sweetlatte_s.addChangeListener(new SpinnerListener1());
		cafemocha_s.addChangeListener(new SpinnerListener2());
		milktea_s.addChangeListener(new SpinnerListener3());

		chocolatte_s.addChangeListener(new SpinnerListener4());

		greentea_s.addChangeListener(new SpinnerListener5());

		macaron_s.addChangeListener(new SpinnerListener6());

		cheesecake_s.addChangeListener(new SpinnerListener7());

		croffle_s.addChangeListener(new SpinnerListener8());

		
		americano_s.setBounds(125, 110, 50, 30);
		sweetlatte_s.setBounds(320, 110, 50, 30);
		cafemocha_s.setBounds(500, 110, 50, 30);
		milktea_s.setBounds(125, 275, 50, 30);
		chocolatte_s.setBounds(315, 275, 50, 30);
		greentea_s.setBounds(500, 275, 50, 30);
		macaron_s.setBounds(125, 445, 50, 30);
		cheesecake_s.setBounds(315, 445, 50, 30);
		croffle_s.setBounds(500, 445, 50, 30);

		f.setSize(800, 600);
		f.setLayout(null);
		f.setVisible(true);

		for(int i =0; i<9; i++) {
			if(price[i] == 0) {
				continue;}
			else {
				switch(i) {
				case 0:
					f.add(americano_s);
					break;
				case 1:
					f.add(sweetlatte_s);
					break;
				case 2: 
					f.add(cafemocha_s);
					break;
				case 3:
					f.add(milktea_s);
					break;
				case 4:
					f.add(chocolatte_s);
					break;
				case 5:
					f.add(greentea_s);
					break;
				case 6:
					f.add(macaron_s);
					break;
				case 7:
					f.add(cheesecake_s);
					break;
				case 8:
					f.add(croffle_s);
					break;
				}
			}}
		
		
		
		
	}

	void total() {

		// total price 구하기
		for (int i = 0; i < ordernum.length; i++) {
			totalPrice += ordernum[i] * price[i];
		}

		// 주문내용 받아오기
		for (int i = 0; i < ordernum.length; i++) {
			if (ordernum[i] != 0) {
				order_list += Menu_name[i] + " " + ordernum[i] + "개 " + ordernum[i] * price[i] + "원\n";
				;
			}
		}
		
		
		
	}
	
	

	class SpinnerListener0 implements ChangeListener {
		public void stateChanged(ChangeEvent evt) {
			JSpinner spinner = (JSpinner) evt.getSource();
			ordernum[0] = (int) spinner.getValue();
		}
	}

	class SpinnerListener1 implements ChangeListener {
		public void stateChanged(ChangeEvent evt) {
			JSpinner spinner = (JSpinner) evt.getSource();
			ordernum[1] = (int) spinner.getValue();
		}
	}

	class SpinnerListener2 implements ChangeListener {
		public void stateChanged(ChangeEvent evt) {
			JSpinner spinner = (JSpinner) evt.getSource();
			ordernum[2] = (int) spinner.getValue();
		}
	}

	class SpinnerListener3 implements ChangeListener {
		public void stateChanged(ChangeEvent evt) {
			JSpinner spinner = (JSpinner) evt.getSource();
			ordernum[3] = (int) spinner.getValue();
		}
	}

	class SpinnerListener4 implements ChangeListener {
		public void stateChanged(ChangeEvent evt) {
			JSpinner spinner = (JSpinner) evt.getSource();
			ordernum[4] = (int) spinner.getValue();
		}
	}

	class SpinnerListener5 implements ChangeListener {
		public void stateChanged(ChangeEvent evt) {
			JSpinner spinner = (JSpinner) evt.getSource();
			ordernum[5] = (int) spinner.getValue();
		}
	}

	class SpinnerListener6 implements ChangeListener {
		public void stateChanged(ChangeEvent evt) {
			JSpinner spinner = (JSpinner) evt.getSource();
			ordernum[6] = (int) spinner.getValue();
		}
	}

	class SpinnerListener7 implements ChangeListener {
		public void stateChanged(ChangeEvent evt) {
			JSpinner spinner = (JSpinner) evt.getSource();
			ordernum[7] = (int) spinner.getValue();
		}
	}

	class SpinnerListener8 implements ChangeListener {
		public void stateChanged(ChangeEvent evt) {
			JSpinner spinner = (JSpinner) evt.getSource();
			ordernum[8] = (int) spinner.getValue();
		}
	}

	class MyActionListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if (b.getText().equals("BACK")) {
				new Main();
				f.setVisible(false);
			}
		}
	}

	class MyActionListener3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if (b.getText().equals("ORDER")) {
				total();

				new Random();
				f.setVisible(false);
			}
		}
	}

	public static void main(String[] args) {
		Menu frame = new Menu();

	}
}
