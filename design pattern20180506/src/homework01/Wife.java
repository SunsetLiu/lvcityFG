package homework01;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author Sunset
 * �̶�������������
 */
public class Wife {
	//��������ܲ�����ʵ������
	private static int maxNumOfWife=4;
	//ÿ�����������֣�ʹ��ArrayList�����ɣ�ÿ�������˽������
	private static ArrayList<String> nameList=new ArrayList<String>();
	//����һ���б��������Ե�����ʵ��
	private static ArrayList<Wife> wifeList=new ArrayList<Wife>();
	//��ǰ���ӵ����к�
	private static int countNumOfWife=0;
	//�������еĶ���
	static{
		for(int i=0;i<maxNumOfWife;i++){
			wifeList.add(new Wife("����"+(i+1)));
		}
	}
	//�����������ƣ�����һ�����Ӷ���
	private Wife(String name){
		nameList.add(name);
	}
	//������һ�����Ӷ���
	public static Wife getInstance(){
		Random random=new Random();
		//�������һ������
		countNumOfWife=random.nextInt(maxNumOfWife);
		return wifeList.get(countNumOfWife);
	}
	//���ӽӴ�����
	public static void receive(){
		System.out.println(nameList.get(countNumOfWife));
	}
}
