// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        quickSort(pairs, 0, pairs.size()-1);
        return pairs;
    }

    public void quickSort(List<Pair> pairs, int l, int r) {
        if(l >= r) return;
        int pivotIndex = partition(pairs,l,r);
        quickSort(pairs, l, pivotIndex - 1);
        quickSort(pairs, pivotIndex+1, r);
    }

    public int partition(List<Pair> pairs, int l, int r) {
        Pair pivot = pairs.get(r);
        int i = l-1;
        for(int j = l; j <r; j++) {
            if(pairs.get(j).key < pivot.key) {
                i++;
                swap(pairs, i, j);
            }
        }
        swap(pairs, i+1, r);
        return i+1;
    }

    public void swap(List<Pair> pairs, int a, int b) {
        Pair temp = pairs.get(a);
        pairs.set(a, pairs.get(b));
        pairs.set(b, temp);
    }
}
