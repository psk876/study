package heap;

public class Heap {
	private final int MAX_ELLEMENT = 200;
	private int[] heap;
	private int heap_size;
	
	public Heap() {
		heap = new int[MAX_ELLEMENT];
		heap[0] = 0;
		heap_size = 0;
	}
	
	public void insert(int element) {
		if (heap_size >= 200) {
			return;
		}
		heap[++heap_size] = element;
		
		int current_location = heap_size;
		
		int temp = 0;
		while (current_location/2 > 0) {
			if (heap[current_location/2] < heap[current_location]) {
				temp = heap[current_location/2];
				heap[current_location/2] = heap[current_location];
				heap[current_location] = temp;
				current_location = current_location/2;
			}else {
				break;
			}
		}
	}
	
	public void remove() {
		if (heap_size < 1) {
			return;
		}
		
		int current_location = 1;
		heap[current_location] = heap[heap_size];
		heap_size--;
		int temp = 0;
		while (current_location < heap_size) {
			int child;
			
			if (current_location*2 + 1 > heap_size) {
				child = current_location*2;
			}else {
				child = heap[current_location*2] < heap[current_location*2 +1] ? current_location*2 +1 : current_location*2;
			}
			
			if (heap[current_location] < heap[child]) {
				temp = heap[child];
				heap[child] = heap[current_location];
				heap[current_location] = temp;
				current_location = child;
			}else {
				break;
			}
		}
	}
	
	public void printHeap() {
		for (int i = 1; i <= heap_size; i++) {
			System.out.println(i+" "+heap[i]);
		}
	}
}
