import java.awt.*;
import javax.swing.*;

public class Payment {

	ImageIcon Background= new ImageIcon("C:\\Users\\wlgus\\OneDrive\\바탕 화면\\KIOSK\\004.jpg");
	JFrame f=new JFrame("융다방 키오스크"); 
	
	Payment(){
		
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
        f.setLayout(null); //레이아웃 null(절대위치 설정할거라서)
	
        
        JLabel op = new JLabel("주문금액 : "); //라벨링
		f.add(op);//프레임에 라벨링 추가
		op.setBounds(280, 150, 100,30);//절대위치지정
		op.setFont(op.getFont().deriveFont(18.0f)); //글씨 크기지정
		
		JButton button0 = new JButton("CARD");//버튼추가
		button0.setBounds(600,480,130,40);//버튼 위치 및 크기설정
		f.add(button0);
		
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment pay = new Payment();
}}
