import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

//Now this is the Date time formatter Class
import java.time.format.DateTimeFormatter;
class Dtime
{
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //Now formatting date time 
        DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm");
        String newFormattedDate = newPattern.format(currentDateTime);
        System.out.println(newFormattedDate);
    }
}