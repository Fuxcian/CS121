package week9;

public class RestaurantReservationSimulator {
    public static void main(String[] args) {

        System.out.println("The default books are as follows: ");
        //2D array of Strings
        String[][] tables = {
                //Hardcoded values:
                {"2 seats", "Available"},
                {"3 seats", "Available"},
                {"6 seats", "Available"}
        };
        //Print Tables:
        for(String[] row: tables){
            //Goes down the row of tables
            for(String column: row){
                /* Goes down the column of every row
                 * prints accordingly.
                 */
                System.out.printf("%s ", column);
            }
            System.out.println();
        }
        //Printing a change in one or more tables:
        tables[0][1] = "Unavaiable";

        System.out.println("The updated books are as follows:");

        for(String[] row: tables) {
            //Goes down the row of tables
            for (String column : row) {
                /* Goes down the column of every row
                 * prints accordingly.
                 */
                System.out.printf("%s ", column);
            }
            System.out.println("");
        }
    }
}
