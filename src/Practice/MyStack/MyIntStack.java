package Practice.MyStack;

public class MyIntStack {
    public static void main(String[] args) {
        MyCustomStack<Integer> nums = new MyCustomStack<>();
        nums.push(4);
        nums.push(8);
        System.out.println(nums);
    }
}
