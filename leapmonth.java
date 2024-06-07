
package vu.question1leapmonth;

public class leapmonth {
    private int year;
    private int month;

    public leapmonth(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public boolean isLeapMonth() {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (month % 100 != 0);
        isLeapMonth = isLeapMonth || (month % 400 == 0);
        return isLeapMonth;
    }

    public static void main(String[] args) {
        int year = 2024;
        int month = 2;

        leapmonth leapMonth = new leapmonth(year, month); 

        if (leapMonth.isLeapMonth()) {
            System.out.println("The month " + month + " in the year " + year + " is a leap month.");
        } else {
            System.out.println("The month " + month + " in the year " + year + " is not a leap month.");
        }
    }
}
