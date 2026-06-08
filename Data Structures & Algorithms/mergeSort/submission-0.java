// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        int len = pairs.size();
        int l = 0;
        int r = len-1;
        
        mergeSort(pairs, l,r);
        return pairs;
    }

    public List<Pair> mergeSort(List<Pair> pairs, int l, int r) {
        if(l < r) {
        int m = (r+l)/2;
        mergeSort(pairs,l,m);
        mergeSort(pairs,m+1,r);
        merge(pairs, l, m, r);
        }
        
        return pairs;
    }

    public List<Pair> merge(List<Pair> pairs, int l, int m, int r) {
        //copying the lists
        int len1 = m - l + 1;
        int len2 = r-m;
        List<Pair> L = new ArrayList<>(len1);
        List<Pair> R = new ArrayList<>(len2);
        
        for(int i = 0; i < len1; i++) {
            L.add(pairs.get(l+i));
        }
        for(int i = 0; i < len2; i++) {
            R.add(pairs.get(m+1+i));
        }

        int i = 0;
        int j = 0;
        int k = l;
        while (i < len1 && j < len2) {
            if(L.get(i).key <= R.get(j).key) {
                pairs.set(k, L.get(i));
                i++;
            } else {
                pairs.set(k, R.get(j));
                j++;
            }
            k++; 
        }
        while (i < len1) {
            pairs.set(k, L.get(i));
            i++;
            k++;
        }
        while(j < len2) {
            pairs.set(k, R.get(j));
            j++;
            k++;
        }
        return pairs;
    }
    
        
}
