import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args){

Scanner scan = new Scanner(System.in);
String[] firstName = new String[100];  
    
firstName[0] = "Marcel";
firstName[1] = "Todd";
firstName[2] = "Stefan";
firstName[3] = "Kaia";
firstName[4] = "Gary";
firstName[5] = "Bobbi";
firstName[6] = "Jay-Jay";
firstName[7] = "Kenny";
firstName[8] = "Jovan";
firstName[9] = "Gracie-Mae";
firstName[10] = "Kealan";
firstName[11] = "Callum";
firstName[12] = "Maverick";
firstName[13] = "Anisah";
firstName[14] = "Ritchie";
firstName[15] = "Danial";
firstName[16] = "Malika";
firstName[17] = "Shelbie";
firstName[18] = "Henna";
firstName[19] = "Kajol";
firstName[20] = "Leigha";
firstName[21] = "Jordanne";
firstName[22] = "Karan";
firstName[23] = "Libbie";
firstName[24] = "Rita";
firstName[25] = "Paulina";
firstName[26] = "Alishba";
firstName[27] = "Nichole";
firstName[28] = "Joel";
firstName[29] = "Myrtle";
firstName[30] = "Arianne";
firstName[31] = "Sheikh";
firstName[32] = "Lillie-May";
firstName[33] = "Mustafa";
firstName[34] = "Ryder";
firstName[35] = "Blade";
firstName[36] = "Afsana";
firstName[37] = "Wayne";
firstName[38] = "Burhan";
firstName[39] = "Atticus";
firstName[40] = "Dafydd";
firstName[41] = "Shani";
firstName[42] = "Angharad";
firstName[43] = "Habiba";
firstName[44] = "Coby";
firstName[45] = "Travis";
firstName[46] = "Kristian";
firstName[47] = "Nakita";
firstName[48] = "Kirk";
firstName[49] = "Skyla";
firstName[50] = "Shauna";
firstName[51] = "Abdurrahman";
firstName[52] = "Wasim";
firstName[53] = "Terry";
firstName[54] = "Ed";
firstName[55] = "Cheyenne";
firstName[56] = "Kimberly";
firstName[57] = "Melissa";
firstName[58] = "Ilayda";
firstName[59] = "Fathima";
firstName[60] = "Salma";
firstName[61] = "Hakim";
firstName[62] = "Safaa";
firstName[63] = "Regan";
firstName[64] = "Maizie";
firstName[65] = "Faiza";
firstName[66] = "Norah";
firstName[67] = "Kristopher";
firstName[68] = "Elisha";
firstName[69] = "Janice";
firstName[70] = "Ahmet";
firstName[71] = "Sofie";
firstName[72] = "Natalie";
firstName[73] = "Inara";
firstName[74] = "Cai";
firstName[75] = "Anthony";
firstName[76] = "Daanyaal";
firstName[77] = "Aryaan";
firstName[78] = "Harley";
firstName[79] = "Humza";
firstName[80] = "Luka";
firstName[81] = "Ranveer";
firstName[82] = "Tanya";
firstName[83] = "Grover";
firstName[84] = "Becky";
firstName[85] = "Eamonn";
firstName[86] = "Walter";
firstName[87] = "Rosemary";
firstName[88] = "Yousef";
firstName[89] = "Vinny";
firstName[90] = "Trystan";
firstName[91] = "Rimsha";
firstName[92] = "Misha";
firstName[93] = "Alison";
firstName[94] = "Jamel";
firstName[95] = "Thalia";
firstName[96] = "Jacob";
firstName[97] = "Krista";
firstName[98] = "Mari";
firstName[99] = "Vinay";

ArrayList firstNameList = new ArrayList();
for (String i: firstName) {
    firstNameList.add(i);
}
    
String[] lastName = new String[100];
lastName[0] = "Green";
lastName[1] = "Muir";
lastName[2] = "Pratt";
lastName[3] = "Bull";
lastName[4] = "Rossi";
lastName[5] = "Aguilar";
lastName[6] = "Stephens";
lastName[7] = "Barton";
lastName[8] = "Iles";
lastName[9] = "Roche";
lastName[10] = "Smyth";
lastName[11] = "Mata";
lastName[12] = "Herman";
lastName[13] = "Steele";
lastName[14] = "Sawyer";
lastName[15] = "Wolf";
lastName[16] = "Francis";
lastName[17] = "Mccartney";
lastName[18] = "Downes";
lastName[19] = "Decker";
lastName[20] = "Pruitt";
lastName[21] = "Soto";
lastName[22] = "Mueller";
lastName[23] = "Mcguire";
lastName[24] = "Stephenson";
lastName[25] = "Redfern";
lastName[26] = "Cairns";
lastName[27] = "Gross";
lastName[28] = "Sosa";
lastName[29] = "Chester";
lastName[30] = "Roberson";
lastName[31] = "Weeks";
lastName[32] = "Flowers";
lastName[33] = "Benitez";
lastName[34] = "Vu";
lastName[35] = "Woods";
lastName[36] = "Merritt";
lastName[37] = "Manning";
lastName[38] = "Booker";
lastName[39] = "Pearson";
lastName[40] = "Mccallum";
lastName[41] = "Bowen";
lastName[42] = "Spears";
lastName[43] = "Bartlett";
lastName[44] = "Velez";
lastName[45] = "Barlow";
lastName[46] = "Greenaway";
lastName[47] = "Armstrong";
lastName[48] = "Freeman";
lastName[49] = "Rosa";
lastName[50] = "Sims";
lastName[51] = "Dunne";
lastName[52] = "Reyna";
lastName[53] = "Bowden";
lastName[54] = "Mac";
lastName[55] = "Kearns";
lastName[56] = "Lozano";
lastName[57] = "Lott";
lastName[58] = "Bates";
lastName[59] = "Mcculloch";
lastName[60] = "Beck";
lastName[61] = "Newman";
lastName[62] = "Bernard";
lastName[63] = "Burris";
lastName[64] = "Whyte";
lastName[65] = "Guy";
lastName[66] = "Choi";
lastName[67] = "Blair";
lastName[68] = "Logan";
lastName[69] = "Lane";
lastName[70] = "Erickson";
lastName[71] = "Knott";
lastName[72] = "Aldred";
lastName[73] = "Naylor";
lastName[74] = "Clarke";
lastName[75] = "Smith";
lastName[76] = "Moon";
lastName[77] = "Mcmanus";
lastName[78] = "Wilde";
lastName[79] = "Hamer";
lastName[80] = "Maddox";
lastName[81] = "Pena";
lastName[82] = "Rose";
lastName[83] = "Hutchinson";
lastName[84] = "Mansell";
lastName[85] = "Barnard";
lastName[86] = "Lugo";
lastName[87] = "Ryan";
lastName[88] = "Donnelly";
lastName[89] = "Noble";
lastName[90] = "Mercer";
lastName[91] = "Olson";
lastName[92] = "Villanueva";
lastName[93] = "Wilson";
lastName[94] = "Wilkerson";
lastName[95] = "Head";
lastName[96] = "Hewitt";
lastName[97] = "Thomas";
lastName[98] = "Gilbert";
lastName[99] = "Hayden";
ArrayList lastNameList = new ArrayList();
for (String i: lastName) {
    lastNameList.add(i);
}

String[] fallGrade = new String[100];
fallGrade[0] = "A";
fallGrade[1] = "B";
fallGrade[2] = "A";
fallGrade[3] = "C";
fallGrade[4] = "D";
fallGrade[5] = "F";
fallGrade[6] = "C";
fallGrade[7] = "B";
fallGrade[8] = "A";
fallGrade[9] = "F";
fallGrade[10] = "B";
fallGrade[11] = "C";
fallGrade[12] = "A";
fallGrade[13] = "A";
fallGrade[14] = "B";
fallGrade[15] = "B";
fallGrade[16] = "B";
fallGrade[17] = "A";
fallGrade[18] = "B";
fallGrade[19] = "A";
fallGrade[20] = "C";
fallGrade[21] = "D";
fallGrade[22] = "F";
fallGrade[23] = "C";
fallGrade[24] = "B";
fallGrade[25] = "A";
fallGrade[26] = "F";
fallGrade[27] = "B";
fallGrade[28] = "F";
fallGrade[29] = "C";
fallGrade[30] = "B";
fallGrade[31] = "A";
fallGrade[32] = "F";
fallGrade[33] = "B";
fallGrade[34] = "C";
fallGrade[35] = "A";
fallGrade[36] = "A";
fallGrade[37] = "B";
fallGrade[38] = "B";
fallGrade[39] = "B";
fallGrade[40] = "A";
fallGrade[41] = "B";
fallGrade[42] = "A";
fallGrade[43] = "C";
fallGrade[44] = "D";
fallGrade[45] = "F";
fallGrade[46] = "C";
fallGrade[47] = "B";
fallGrade[48] = "B";
fallGrade[49] = "A";
fallGrade[50] = "F";
fallGrade[51] = "B";
fallGrade[52] = "C";
fallGrade[53] = "A";
fallGrade[54] = "A";
fallGrade[55] = "B";
fallGrade[56] = "B";
fallGrade[57] = "B";
fallGrade[58] = "A";
fallGrade[59] = "B";
fallGrade[60] = "A";
fallGrade[61] = "B";
fallGrade[62] = "A";
fallGrade[63] = "C";
fallGrade[64] = "D";
fallGrade[65] = "F";
fallGrade[66] = "C";
fallGrade[67] = "B";
fallGrade[68] = "A";
fallGrade[69] = "F";
fallGrade[70] = "B";
fallGrade[71] = "C";
fallGrade[72] = "A";
fallGrade[73] = "A";
fallGrade[74] = "B";
fallGrade[75] = "B";
fallGrade[76] = "B";
fallGrade[77] = "A";
fallGrade[78] = "B";
fallGrade[79] = "A";
fallGrade[80] = "C";
fallGrade[81] = "D";
fallGrade[82] = "F";
fallGrade[83] = "B";
fallGrade[84] = "C";
fallGrade[85] = "A";
fallGrade[86] = "A";
fallGrade[87] = "B";
fallGrade[88] = "B";
fallGrade[89] = "B";
fallGrade[90] = "A";
fallGrade[91] = "B";
fallGrade[92] = "A";
fallGrade[93] = "C";
fallGrade[94] = "D";
fallGrade[95] = "A";
fallGrade[96] = "A";
fallGrade[97] = "B";
fallGrade[98] = "B";
fallGrade[99] = "B";
ArrayList fallGradeList = new ArrayList();
  for (String i: fallGrade) {
    fallGradeList.add(i);
}
System.out.println("List of actions: ");
System.out.println(" ");
System.out.println("**Add Student (type 'A')");
System.out.println("**Student Search (type 'B')");
System.out.println("**Delete Student (type 'C')");
System.out.println("**Enter Spring Grades (type 'D')");
System.out.println("**Alphabetize Students By Last Names (type 'E')");
System.out.println("**Alter a Student's Grade (type 'F')");
System.out.println(" ");
System.out.println("What do you want to do?");
String choice = scan.nextLine();
  
if(choice.compareToIgnoreCase("a")==0){
    System.out.print("Add Student's First Name: ");
    String addFirstName = scan.nextLine();
    firstNameList.add(addFirstName);
    System.out.print("OK! Now... Add Student's Last Name: ");
    String addLastName = scan.nextLine();
    lastNameList.add(addLastName);
    System.out.print("OK! Finally...Add the student's fall grade (A, B, C, D, or F): " );
    String addFallGrade = scan.nextLine();
    
    fallGradeList.add(addFallGrade);  
    System.out.println(firstNameList);
    System.out.println(" ");
    System.out.println(lastNameList);
    System.out.println(" ");
    System.out.println(fallGradeList);
    System.out.println(" ");

}

    else if(choice.compareToIgnoreCase("b")==0){

    System.out.print("Search by First Name (F) or Last Name (L)?: ");
    String searchChoice = scan.nextLine();
    if(searchChoice.compareToIgnoreCase("f")==0){
    System.out.print("Type Student's First Name: ");
    String fName = scan.nextLine();
    int index = linearSearch(firstName, fName);
      if(index != -1) System.out.println(fName +" found in firstName at: " + index);
  else System.out.println(fName +" not found in the list of first names.");
    }
    else if(searchChoice.compareToIgnoreCase("l")==0){
    System.out.print("Type Student's Last Name: ");
    String lName = scan.nextLine();
    int index2 = linearSearch2(lastName, lName);
        if(index2 != -1) System.out.println(lName +" found in lastName at: " + index2); 
        else System.out.println(lName +" not found in the list of last names.");
    }
}
  if(choice.compareToIgnoreCase("c")==0){
    System.out.println("Delete the first name of a Student from this List: ");
    System.out.println(firstNameList);
    System.out.println(" ");
    System.out.println(lastNameList);
    System.out.println(" ");
    System.out.println(fallGradeList);
    System.out.println(" ");
    System.out.print("Type the First Name of the Student you want to delete: ");
    String deleteFirstName = scan.nextLine();
    firstNameList.remove(deleteFirstName);
    System.out.print("OK! Now... Delete that same Student's Last Name: ");
    String deleteLastName = scan.nextLine();
    lastNameList.remove(deleteLastName);
    System.out.print("OK! Finally... Delete that same Student's Fall Grade (A, B, C, D, or F): ");
    String deleteFallGrade = scan.nextLine();
    fallGradeList.remove(deleteFallGrade);

    System.out.print(deleteFirstName+" "+deleteLastName+" with Fall Grade: "+deleteFallGrade+" has been deleted.");
    System.out.println(" ");
    System.out.println(firstNameList);
    System.out.println(lastNameList);
    System.out.println(fallGradeList);
    }
     else if(choice.compareToIgnoreCase("d")==0){
       String[] springGrade = new String[100];  
       ArrayList springGradeList = new ArrayList();
       
       for(int i=0; i<springGrade.length; i++){
        System.out.print("Enter a Spring Grade for "+firstName[i]+" (A, B, C, D, or F): " );
         String userSpringGrade = scan.nextLine();
         if(userSpringGrade.compareToIgnoreCase("A")==0 || userSpringGrade.compareToIgnoreCase("B")==0 || userSpringGrade.compareToIgnoreCase("C")==0 || userSpringGrade.compareToIgnoreCase("D")==0 || userSpringGrade.compareToIgnoreCase("F")==0){
  springGradeList.add(userSpringGrade);
         }
       
        else{
        System.out.println("Grade is invalid. Please try again.");
        i--;
      }
       }
      System.out.println(firstNameList);
      System.out.println(" ");
      System.out.println("Spring Grades: ");
      System.out.print(springGradeList);
       }
  
     else if(choice.compareToIgnoreCase("e")==0){
        selectionSort(lastNameList, firstNameList, fallGradeList);
       for (int i = 0; i < lastNameList.size(); i++) {
         System.out.println(lastNameList.get(i) + ", " + firstNameList.get(i) + " - Grade: " + fallGradeList.get(i));
         }
    }
    else if(choice.compareToIgnoreCase("f")==0){
     System.out.print("Alter Student's Grade by First Name (F) or Last Name (L)?: ");
      String alterChoice = scan.nextLine();
      if(alterChoice.compareToIgnoreCase("f")==0){
        System.out.print("Type Student's First Name: ");
        String fName = scan.nextLine();
        int index = linearSearch3(firstName, fName);
        if(index != -1){
          System.out.print("Enter new Grade: ");
          String newGrade = scan.nextLine();
          fallGradeList.set(index, newGrade);
          System.out.println(fName +"'s grade has been updated to: "+fallGradeList.get(index));
        }
      }

      else if(alterChoice.compareToIgnoreCase("l")==0){
          System.out.print("Type Student's Last Name: ");
          String lName = scan.nextLine();
          int index2 = linearSearch4(lastName, lName);
          if(index2 != -1){
            System.out.print("Enter new Grade: ");
            String newGrade = scan.nextLine();
            fallGradeList.set(index2, newGrade);
            System.out.println(lName +"'s grade has been updated to: "+fallGradeList.get(index2));
          }
      }
  }
  else{
    System.out.println("Invalid option. Please select again.");
  }
  }

    private static int linearSearch(String[] firstName, String fName){
    for(int i=0; i<firstName.length; i++){
      if(firstName[i].compareToIgnoreCase(fName)==0) {
        return i;
      }
    }

    return -1;
  }
    private static int linearSearch2(String[] lastName, String lName){
      for(int i=0; i<lastName.length; i++){
        if(lastName[i].compareToIgnoreCase(lName)==0) {
          return i;
        }
      }

      return -1;
    }
  
    private static int linearSearch3(String[] firstName, String fname){
    for(int i=0; i<firstName.length; i++){
      if(firstName[i].compareToIgnoreCase(fname)==0) {
        return i;
      }
    }

    return -1;
  }
  private static int linearSearch4(String[] lastName, String lname){
    for(int i=0; i<lastName.length; i++){
      if(lastName[i].compareToIgnoreCase(lname)==0) {
        return i;
      }
    }

    return -1;
  }

  public static void selectionSort(ArrayList<String> firstName, ArrayList<String> lastName, ArrayList<String> fallGrade) {
    for(int i = 0; i < firstName.size() - 1; i++) {
      int min = i;
      for(int j = i + 1; j < firstName.size(); j++) {
        if(firstName.get(min).compareTo(firstName.get(j)) > 0) {
          min = j;
        }
      }
      String temp = firstName.get(i);
      String temp2 = lastName.get(i);
      String temp3 = fallGrade.get(i);
      firstName.set(i, firstName.get(min));
      lastName.set(i, lastName.get(min));
      fallGrade.set(i, fallGrade.get(min));
      firstName.set(min, temp);
      lastName.set(min, temp2);
      fallGrade.set(min, temp3);  
    }
  }
  }



