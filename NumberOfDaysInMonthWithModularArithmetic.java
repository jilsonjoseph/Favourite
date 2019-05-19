public class NumberOfDaysInMonthWithModularArithmetic {
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if (year%4 == 0 && year%100 != 0)
                return true;
            if (year%400 == 0)
                return true;
        }
        return false;
    }
    
    public static int getDaysInMonth(int month, int year){
        if(month<1 || month>12 || year<1 || year>9999){
            return -1;
        }
        
        if(month == 7)
        return 31;
        
        if(month == 2)
        if(isLeapYear(year))
        return 29;
        else 
        return 28;
        
        if((month%7)%2 == 0)
        return 30;
        else return 31;
    }
}