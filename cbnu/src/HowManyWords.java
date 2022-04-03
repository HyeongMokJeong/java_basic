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
		String text = " 내가 그의 이름을 불러주기 전에는 그는 다만 하나의 몸짓에 지나지 않았다.\n내가 그의 이름을 불러주었을 때, 그는 내게로 와 꽃이 되었다.\n내가 그의 이름을 불러준 것처럼 나의 이 빛깔과 향기에 알맞는 누가 나의 이름을 불러다오.\n그에게로 가서 나도 그의 꽃이 되고 싶다.\n우리들은 모두 무엇이 되고 싶다.\n나는 너에게 너는 나에게 잊혀지지 않는 하나의 눈짓이 되고 싶다.";	
		return text;
	}
	
	public static HashMap<Character, Integer> countChar(String text){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i=0; i <= text.length() - 1; i++) {
			if (map.containsKey(text.charAt(i))) { // 이미 Key값이 존재한다면
				map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
			}
			else 
				map.put(text.charAt(i), 1);
		}
		
//		List<Entry<Character, Integer>> map_list = new ArrayList<Entry<Character, Integer>>(map.entrySet());
//		Collections.sort(map_list, new Comparator<Entry<String, Integer>>() {
//			// compare로 값을 비교
//			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
//			{
//				// 내림 차순으로 정렬
//				return obj2.getValue().compareTo(obj1.getValue());
//			}
//		});
		
		return map;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("원문");
		System.out.println(text());
		String text = text().replace(" ", "").replace("\n", "").replace(".", "").replace(",", "");
		HashMap<Character, Integer> map = countChar(text);
		
		System.out.println("-------------\n글자\t빈도수\n-------------");
		for (Entry<Character, Integer> i: map.entrySet()) {
			System.out.println(i.getKey() + "\t" + i.getValue());
		}
		
		
	}

}
