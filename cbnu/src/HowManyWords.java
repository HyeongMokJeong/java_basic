package cbnu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public class HowManyWords {
	
	public static String text() {
		String text = " ���� ���� �̸��� �ҷ��ֱ� ������ �״� �ٸ� �ϳ��� ������ ������ �ʾҴ�.\n���� ���� �̸��� �ҷ��־��� ��, �״� ���Է� �� ���� �Ǿ���.\n���� ���� �̸��� �ҷ��� ��ó�� ���� �� ����� ��⿡ �˸´� ���� ���� �̸��� �ҷ��ٿ�.\n�׿��Է� ���� ���� ���� ���� �ǰ� �ʹ�.\n�츮���� ��� ������ �ǰ� �ʹ�.\n���� �ʿ��� �ʴ� ������ �������� �ʴ� �ϳ��� ������ �ǰ� �ʹ�.";	
		return text;
	}
	
	public static HashMap<Character, Integer> countChar(String text){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i=0; i <= text.length() - 1; i++) {
			if (map.containsKey(text.charAt(i))) { // �̹� Key���� �����Ѵٸ�
				map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
			}
			else 
				map.put(text.charAt(i), 1);
		}
		
//		List<Entry<Character, Integer>> map_list = new ArrayList<Entry<Character, Integer>>(map.entrySet());
//		Collections.sort(map_list, new Comparator<Entry<String, Integer>>() {
//			// compare�� ���� ��
//			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
//			{
//				// ���� �������� ����
//				return obj2.getValue().compareTo(obj1.getValue());
//			}
//		});
		
		return map;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("����");
		System.out.println(text());
		String text = text().replace(" ", "").replace("\n", "").replace(".", "").replace(",", "");
		HashMap<Character, Integer> map = countChar(text);
		
		System.out.println("-------------\n����\t�󵵼�\n-------------");
		for (Entry<Character, Integer> i: map.entrySet()) {
			System.out.println(i.getKey() + "\t" + i.getValue());
		}
		
		
	}

}
