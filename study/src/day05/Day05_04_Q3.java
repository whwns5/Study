package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2011_11_07
 * 
 * ����ڷ� ���� �������� �Է¹޾� ���� ���̸� ���ϱ�
 */
public class Day05_04_Q3 {
	
	final static double pi = Math.PI;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		 
		double rad; // ������
		double area; //���� ����
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("�������� �Է��ϼ��� : ");
		rad = Double.parseDouble(br.readLine());
		
		area = rad * rad * pi;
		System.out.println(rad);
		System.out.println(area);
		
	}

}
