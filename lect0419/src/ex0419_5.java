

public class ex0419_5 {

	static void CheckName(String[] name) {
		int sum = 0;
		for (int i = 0; i < name.length; i++) {
			String lastname = name[i];
			String j = lastname.substring(0, 1);
			if (j.equals("이") || j.equals("김")) {
				sum++;
			}
		}
		System.out.println("이 혹은 김씨성의 숫자는 : " + sum);
	}
	
	static void calcNameCount(String[] name) {
		int cnt = 0;
		for (int i = 0; i < name.length; i++) {
			if ( name[i].equals("권종표")) 
				cnt++;
		}
		System.out.println("권종표의 숫자는 : " + cnt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] Name = { "이유덕","이재영","권종표","이재영","박민호","강상희","권종표","이재영","김지완",
				"최승혁","권종표","이성연","박영서","박민호","전경헌","권종표","송정환","김재성","이유덕","전경헌" };
		
		CheckName(Name);
		calcNameCount(Name);

	};

}
