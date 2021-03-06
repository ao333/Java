public class Quick {
    
    public static void main(String[] args) {
         int[] a = {5,3,1,9,7};
         sort(a,0,a.length-1);
         for (int i:a) System.out.print(i + ",");
    }

    static void sort(int[] a, int l, int r) {
        // pick the pivot
        int m = l + (r - l) / 2;
        int pivot = a[m];
        // make left < pivot and right > pivot
        int i = l, j = r;
        while (i <= j) {
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;
            if (i <= j) {
                int swap = a[i];
                a[i] = a[j];
                a[j] = swap;
                i++; j--;
            }
        }
        // recursively sort two subparts
        if (l < j) sort(a, l, j);
        if (r > i) sort(a, i, r);
    }
}


