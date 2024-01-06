package HeadFirstKotlin.Chapter4ClassesAndObject.BeTheCompiler;

public class Quicksort {
    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    static int pivotIndex(int a[], int low, int high) {
        int i = low;
        int j = high;
        int pivot = a[0];
        while (i < j) {
            while (a[i] <= pivot ) {
                //swap(a,i,pivot);
                i++;
            }
            while (a[j] >= pivot&&j>=0) {
                j--;
            }
            if (a[i] > pivot) {
                swap(a, i, pivot);
            }
            if (a[j]<pivot){
                swap(a,j,pivot);
            }

        }
        //swap(a, i, j);
        return j;
    }

    static void quicksort(int a[], int low, int high) {
        int pivot = pivotIndex(a, low, high);
        System.out.println(pivot);
        quicksort(a, low, pivot );
        quicksort(a, pivot + 1, high);
    }


    public static void main(String[] args) {
        int a[] = {3, 2, 5, 1, 0, 7, 8};
        quicksort(a, 0, a.length - 1);


        for (int e : a
        ) {
            System.out.println(e);

        }

    }
}
