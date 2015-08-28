public class CalendarPrinter
{
    public static void main (String[] args) {
        String y = "September ";
        String z = "  ";
        int x = 1;
        while ( x < 31 )
        {
            if ( x == 5 || x == 6 || x == 12 || x == 13 || x == 19 || x == 20 )
            {
                z = "  WEEKEND";
            }
            else if ( x == 7 )
            {
                z = "  NO SCHOOL (LABOR DAY)";
            }
            else if ( x == 25 )
            {
                z = "  END OF MARKING PERIOD";
            }
            else 
            {
                z = "  ";
            }
        System.out.println( y + x + z );
        x++;
        }
    }
}
            