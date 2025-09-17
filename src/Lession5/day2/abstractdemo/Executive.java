package Lession5.day2.abstractdemo;

public class Executive extends Manager{
    private int numberOfShares;
    public Executive(){
    }
    public Executive(String aName, double aSalary, int aYear, int aMonth, int aDay) {
        super(aName,aSalary,aYear,aMonth,aDay);
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }
    @Override
    public void getFun() {
        System.out.println("Getting fun from Executive");
    }
}
