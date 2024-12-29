package DS07_DSA;
public class MyArrayList {
    //base DS
    private int[] data;
    private int end;

    public MyArrayList() {
        data = new int[10];
        end = -1;
    }

    public MyArrayList(int initialCapacity) {
        data = new int[initialCapacity];
        end = -1;
    }

    //Operations
    public void add(int e) {
        if (end + 1 == data.length) {
            reallocate();
        }
        data[++end] = e;
    }
    public void add(int pos, int e) {
        //index check
        if(pos < 0 || pos > end + 1) {
            throw new IndexOutOfBoundsException
                    ("Invalid Index for size = " + (end+1));
        }
        //reallocate
        if (end + 1 == data.length) {
            reallocate();
        }
        //shift
        for (int i = end+1; i > pos ; i--) {
            data[i] = data[i-1];
        }
        //write
        data[pos] = e;
        end++;
    }

    public int size() {
        return end + 1;
    }
    public int get(int index) {
        if(index < 0 || index > end) {
            throw new IndexOutOfBoundsException
                    ("Invalid Index");
        }
        return data[index];
    }
    public int remove(int index) {
        if(index < 0 || index > end) {
            throw new IndexOutOfBoundsException
                    ("Invalid Index");
        }
        int ans = data[index];
        for (int i = index; i < end ; i++) {
            data[i] = data[i+1];
        }
        end--;
        return ans;
    }

    private void reallocate() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }


    //toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= end; i++) {
            sb.append(data[i]);
            if (i != end)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }


    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();
        list.add(50);
        list.add(60);
        list.add(80);
        System.out.println(list);
        System.out.println(list.size());
        list.add(1, 100);
        System.out.println(list);
        System.out.println("Get of index 2 = " + list.get(2));
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println("Size = " + list.size());
        while (list.size() > 0)
            System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        list.add(58);
        System.out.println(list);
        }
    }