/*
 * Create a data type Date that represents a date.
 * You should be able to create a new Date by specifying the month,
 * day, and year.
 * It should supports methods to compute the number of days between two dates,
 * return the day of the week that a day falls on, etc.
 * The program should be named CustomDate.java.
 */
public class CustomDate {

        private int month;
        private int day;
        private int year;

        public CustomDate(int month, int day, int year) {
                this.month = month;
                this.day = day;
                this.year = year;
        }

        public int getDaysBetween(CustomDate other) {
                return Math.abs(this.totalDays() - other.totalDays());
        }

        public int totalDays() {
                int x = (365 * year) + year / 4 - year / 100 + year / 400;
                int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
                for (int i = 0; i < this.month; i++) {
                        x += daysInMonth[i];
                }
                x += this.day;
                if (this.isLeapYear() && this.month > 2) {
                        x++;
                }
                return x;
        }

        public int getDayOfWeek() {
                int y0 = y - (14 - month) / 12;
                int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
                int m0 = month + 12 * ((14 - month) / 12) - 2;
                int d0 = (day + x + (31 * m0) / 12) % 7;
                // 0 is Sunday through 7 is Saturday.
                return d0;
        }

        public boolean isLeapYear() {
                // year is divisible by 4, and not divisible by 100 unless divisible by 400
                return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        }

        static void main() {
                CustomDate d1 = new CustomDate(7, 4, 1989);
                CustomDate d2 = new CustomDate(9, 23, 1997);
                IO.println("Date 1: " + d1);
                IO.println("Date 2: " + d2);
                IO.println("Day of week for Date 1: " + d1.getDayOfWeek());
                IO.println("Day of week for Date 2: " + d2.getDayOfWeek());
                IO.println("Is 1989 a leap year? " + d1.isLeapYear());
                IO.println("Is 1997 a leap year? " + d2.isLeapYear());
                IO.println("Days between Date 1 and Date 2: " + d1.getDaysBetween(d2));
        }
}
