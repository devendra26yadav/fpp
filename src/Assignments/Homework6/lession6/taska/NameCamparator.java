package Assignments.Homework6.lession6.taska;

import java.util.Arrays;
import java.util.Comparator;

public class NameCamparator  implements Comparator<DeptEmployee> {

    @Override
    public int compare(DeptEmployee o1, DeptEmployee o2) {
        if(o1==null && o2==null) return 0;
        if(o1==null) return 1;
        if(o2==null) return -1;
        return o1.getName().compareTo(o2.getName());
    }

    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        Arrays.sort(data,new NameCamparator());
        for(DeptEmployee e:data){
            System.out.println(e);
        }
    }
}
