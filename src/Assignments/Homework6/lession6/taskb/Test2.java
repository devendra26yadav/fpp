package Assignments.Homework6.lession6.taskb;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
    }
    class NameCamarator implements Comparator<DeptEmployee>{
        @Override
        public int compare(DeptEmployee e1,DeptEmployee e2){
            return e1.getName().compareTo(e2.getName());
        }
    }
}
