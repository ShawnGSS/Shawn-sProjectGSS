public class Date {
    private int day;
    private int month;
    private int year;

    public void setDay(int day){this.day = day; }
    public void setMonth(int month){this.month = month; }
    public void setYear(int year){this.year = year; }

    public int getDay(){return day; }
    public int getMonth(){return month; }
    public int getYear(){return year; }

    @Override
    public String toString(){
        return this.day + "/" + this.month + "/" + this.year;
    }

    public boolean equals(Date o){
        if(this.day == o.getDay() && this.month == o.getMonth() && this.year == o.getYear() ){
            return true;
        }else{
            return false;
        }
    }

}
