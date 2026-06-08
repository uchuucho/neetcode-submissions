class DynamicArray {
    int capacity;
    int[] arr;
    int length;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.length = 0;
    }


    public int get(int i) {
        if(i < length) return arr[i];
        return -1;

    }

    public void set(int i, int n) {
        if(i < length) {
            arr[i] = n;
            return;
        }
        return;

    }

    public void pushback(int n) {
        if(length == capacity) this.resize();
        arr[length] = n;
        length++;

    }

    public int popback() {
        if(length > 0) {
            int pop = arr[length-1];
            length--;
            return pop;
        }
        return -1;
    }

    private void resize() {
        this.capacity = 2*capacity;
        int[] newArr = new int[capacity];
        for(int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        this.arr = newArr; 
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
