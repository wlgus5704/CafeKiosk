import java.awt.*;
import javax.swing.*;

public class Payment {

	ImageIcon Background= new ImageIcon("C:\\Users\\wlgus\\OneDrive\\���� ȭ��\\KIOSK\\004.jpg");
	JFrame f=new JFrame("���ٹ� Ű����ũ"); 
	
	Payment(){
		
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
        f.setLayout(null); //���̾ƿ� null(������ġ �����ҰŶ�)
	
        
        JLabel op = new JLabel("�ֹ��ݾ� : "); //�󺧸�
		f.add(op);//�����ӿ� �󺧸� �߰�
		op.setBounds(280, 150, 100,30);//������ġ����
		op.setFont(op.getFont().deriveFont(18.0f)); //�۾� ũ������
		
		JButton button0 = new JButton("CARD");//��ư�߰�
		button0.setBounds(600,480,130,40);//��ư ��ġ �� ũ�⼳��
		f.add(button0);
		
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment pay = new Payment();
}}
