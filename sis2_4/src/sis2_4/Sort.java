package sis2_4;

public class Sort {
	static <E> void swap(E [] array, int i, int j) {
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	static <E extends Comparable<E>> void BubbleSort(E [] array) {
		 for(int j = 1; j < array.length; j++) {
	        for(int i = 0; i < array.length - j; i++) {
	            if(array[i].compareTo(array[i+1]) > 0) {
	               swap(array, i, i+1);
	            }
	        }
	     }
	}
	
	static <E extends Comparable<E>> void mergeSort(E [] array, int l, int r) {
		if(l < r) {
			int m = (l+r)/2;
			
			mergeSort(array,l,m);
			mergeSort(array,m+1,r);
			merge(array,l,m,r);
		}
	}

	private static <E extends Comparable<E>> void merge(E[] array, int l, int m, int r) {
		@SuppressWarnings("unchecked")
		E[] leftArray  = (E[]) new Comparable[m - l + 1];
        @SuppressWarnings("unchecked")
		E[] rightArray = (E[]) new Comparable[r - m];

        
        for (int i = 0; i < leftArray.length; ++i)
            leftArray[i] = array[l + i];

        for (int i = 0; i < rightArray.length; ++i)
            rightArray[i] = array[m + 1 + i];

        int leftIndex = 0, rightIndex = 0;

        int currentIndex = l;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length)
        {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0)
            {
                array[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            }
            else
            {
                array[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }
        
        while (leftIndex < leftArray.length) array[currentIndex++] = leftArray[leftIndex++];

        while (rightIndex < rightArray.length) array[currentIndex++] = rightArray[rightIndex++];
		
	}
}