package cbnu;

public class oxsort {
	public static void oxSort(int[] arr) { //�迭�� ���� ���ķ� sort���ִ� �Լ�
		for (int i=0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] oxList = {0xA37B, 0x23CC, 0x88D9, 0xBB8F, 0x3A9A};
		
		System.out.print("���� �� ������ : ");
		for (int a=0; a < oxList.length; a++) {
			System.out.printf("0x%x ", oxList[a]);
		}
		System.out.print("\n���� �� ������ : ");
		oxSort(oxList);
		for (int b=0; b < oxList.length; b++) {
			System.out.printf("0x%x ", oxList[b]);
			
		}
	}

}
