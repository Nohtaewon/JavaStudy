package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static String myName="�豸��";
	public static void test() {
		System.out.println("test() ȣ���");
	}
	public static void main(String[] args) {
		MyUtil.send();
		MyUtil.version="1.0";
		System.out.println(myName);//���������ȿ� �����ϸ� Ŭ�������� ���� �����ϱ⵵�ϴ� MainClass.Myname
		MainClass02.test();
		//this.test();// new MainClass02().test(); ������ �ʿ�
	}
}