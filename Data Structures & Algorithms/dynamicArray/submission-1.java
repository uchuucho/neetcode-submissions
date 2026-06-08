class DynamicArray {
    int capacity;
    int[] arr;
    int size;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr  = new int[capacity];
        this.size = 0;
        
    }

    public int get(int i) {
        return arr[i];

    }

    public void set(int i, int n) {
        arr[i] = n;

    }

    public void pushback(int n) {
        if(size == capacity) {
            resize();
        }
        arr[size] = n;
        size++;
        }

    

    public int popback() {
        if(size > 0) {
            size--;
        }
        return arr[size];
        
    }

    private void resize() {
        this.capacity *= 2;
        int[] new_arr = new int[capacity];
        if(size > 0) {
            for(int i = 0; i < size; i++) {
                new_arr[i] = arr[i];
            }
            this.arr = new_arr;
        } 
        

    }

    public int getSize() {
        return this.size;

    }

    public int getCapacity() {
        return this.capacity;

    }
}


