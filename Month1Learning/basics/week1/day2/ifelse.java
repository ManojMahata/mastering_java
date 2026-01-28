public class ifelse {

public static void main(String[] args){

    int month = 4;

    String season;
// write a program that checks season type accroding to the entered month

// is else if

if (month == 12 || month == 1 ||month == 2){
season = "Winter";
}
else if(month == 3 || month == 4 || month == 5){
season = "Spring";
}
else if(month == 6 ||month == 7 ||month == 8){
season = "Summer";
}
else if(month == 9 ||month == 10 ||month == 11){
season = "Autumn";
}
else season = "Bouge Summer";

System.out.println("April is in the " + season + ".");
    }
}
