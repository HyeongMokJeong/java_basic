package cbnu;

public class oxsort {
	public static void oxSort(int[] arr) { //배열을 선택 정렬로 sort해주는 함수
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
		
		System.out.print("정렬 전 데이터 : ");
		for (int a=0; a < oxList.length; a++) {
			System.out.printf("0x%x ", oxList[a]);
		}
		System.out.print("\n정렬 후 데이터 : ");
		oxSort(oxList);
		for (int b=0; b < oxList.length; b++) {
			System.out.printf("0x%x ", oxList[b]);
			
		}
	}

}
