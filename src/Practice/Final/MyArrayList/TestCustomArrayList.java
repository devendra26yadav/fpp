package Practice.Final.MyArrayList;

public class TestCustomArrayList {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for(int i=1;i<5;i++){
            list.add(String.valueOf(i));
        }
        list.insert(4,"o");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.printArray();

    }
}
