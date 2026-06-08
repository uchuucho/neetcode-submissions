class DynamicArray {
    int capacity;
    int[] arr;
    int size = 0;

    public DynamicArray(int capacity) {
        if(capacity > 0) {
            this.arr = new int[capacity];
            this.capacity = capacity;
        }
        else arr = null;
        

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
        size--;
        return arr[size];
        

    }

    private void resize() {
        this.capacity *= 2;
        int[] newArr = new int[this.capacity];
        for(int i = 0; i< size; i++) {
            newArr[i] = arr[i];
        }
        this.arr = newArr;

    }

    public int getSize() {
        return this.size;

    }

    public int getCapacity() {
        return this.capacity;

    }
}
