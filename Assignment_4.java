class Assignment4 {

  StringBuffer LowerCaseForBuilder(StringBuffer s1) {
    StringBuffer s2 = new StringBuffer();
    for (int i = 0; i < s1.length(); i++) {
      char ch = (char) ((int) (s1.charAt(i)) + 32);
      s2 = s2.append(ch);
    }
    return s2;
  }

  StringBuffer UpperCaseForBuilder(StringBuffer s1) {
    StringBuffer s2 = new StringBuffer();
    for (int i = 0; i < s1.length(); i++) {
      if ((s1.charAt(i) >= 97 && s1.charAt(i) <= 122)) {
        char ch = (char) ((int) (s1.charAt(i)) - 32);
        s2 = s2.append(ch);
      } else {
        s2 = s2.append(s1.charAt(i));
      }
    }
    return s2;
  }

  StringBuffer[] DuplicateRemoving(StringBuffer s1) {
    StringBuffer array[] = new StringBuffer[2];
    StringBuffer s3 = new StringBuffer();
    for (int i = 0; i < s1.length(); i++) {
      for (int j = 0; j < s1.length(); j++) {
        if (s1.charAt(i) == s1.charAt(j) && i != j) {
          s3 = s3.append(s1.charAt(j));
          s1 = s1.delete(j, j + 1);
          j--;
        }
      }
    }
    array[0] = s1;
    array[1] = s3;
    return array;
  }

  public static void main(String[] args) {
    // Q1:-Remove Duplicates from String
    Assignment4 assignment = new Assignment4();
    StringBuffer s1 = new StringBuffer("PINEAPPLE");
    System.out.println("Original String is " + s1.toString());
    StringBuffer s3 = new StringBuffer();
    StringBuffer result[] = new StringBuffer[2];

    s1 = assignment.LowerCaseForBuilder(s1);
    result = assignment.DuplicateRemoving(s1);

    s1 = assignment.UpperCaseForBuilder(result[0]);
    result = assignment.DuplicateRemoving(result[1]);

    result[0] = assignment.UpperCaseForBuilder(result[0]);
    s3 = assignment.UpperCaseForBuilder(s3);

    System.out.println("After Removing Duplicates " + s1);
    // Q2:- Print Duplicate Characters:-
    System.out.println("Duplicates " + result[0]);

    //  Q3: Palindrome or not
    String palin = "2552";
    String check = "";

    for (int i = palin.length() - 1; i >= 0; i--) {
      check = check + palin.charAt(i);
    }
    if (check.equals(palin)) {
      System.out.println("Yes it is a Palindrome");
    } else {
      System.out.println("Not a Palindrome");
    }

    //  Q4: Consonants vovals and special symbols;
    StringBuffer question_4 = new StringBuffer("My Name is Kamran 33###");
    question_4 = assignment.UpperCaseForBuilder(question_4);

    int vovals = 0;
    int consonants = 0;
    int special = 0;

    for (int i = 0; i < question_4.length(); i++) {
      if (
        (question_4.charAt(i) < 65 || question_4.charAt(i) > 90) &&
        (question_4.charAt(i) != ' ') &&
        (question_4.charAt(i) < 49 || question_4.charAt(i) > 57)
      ) {
        special++;
      } else if (
        question_4.charAt(i) == 'A' ||
        question_4.charAt(i) == 'E' ||
        question_4.charAt(i) == 'I' ||
        question_4.charAt(i) == 'O' ||
        question_4.charAt(i) == 'U'
      ) {
        vovals++;
      } else if (
        question_4.charAt(i) != ' ' &&
        ((question_4.charAt(i) >= 65 && question_4.charAt(i) <= 90))
      ) {
        consonants++;
      }
    }
    System.out.println("Vowels are " + vovals);
    System.out.println("Special Symbols are " + special);
    System.out.println("Consonants Symbols are " + consonants);

    // Question 5: ANAGRAM.

    StringBuffer q5_1 = new StringBuffer("integral");
    StringBuffer q5_2 = new StringBuffer("triangle");
    boolean flag = false;;
    int j;

    for (int i = 0; i < q5_1.length(); i++) {
      flag = false;
      j=0;
      while (j < q5_2.length()) {
        if (q5_2.charAt(j) == q5_1.charAt(i)) {
          flag = true;
          break;
        } else j++;
      }
      if(!flag){
         System.out.println("Not ANAGRAMS");
         break;
      }
    }

    if(flag){
      System.out.println("ANAGRAMS");
    }

   //  Question 6:- PANGRAM.

   StringBuffer question_6 = new StringBuffer("My name is Kamran Mehboob");
   int pangram[] = new int[26];

   question_6 =  assignment.UpperCaseForBuilder(question_6);
   for(int i=0;i<question_6.length(); i++){
      int index = (int) question_6.charAt(i);
      if(index != 32){
         pangram[(index-65)]++;
      }
   }

   boolean flag2 = false;
   for(int i=0; i< pangram.length; i++){
      if(pangram[i] < 1){
         flag2 = true;
         System.out.println("Not a Pangram");
         break;
      }
   }

   if(!flag2){
      System.out.println("String Given is Pangram");
   }

    //   Question 7:- UNIQUE CHARACTERS

    StringBuffer s8 = new StringBuffer("KAMRAN");
    StringBuffer s9 = new StringBuffer();
    StringBuffer result2[] = new StringBuffer[2];

    s8 = assignment.LowerCaseForBuilder(s8);
    result2 = assignment.DuplicateRemoving(s8);
    if(result2[1].length() == 0){
      System.out.println("String Contains all unique symbols");
    }
    else{
      System.out.println("String doesn't contain all unique symbols");
    }


   //  Question 8:- MAX OCCURING 

   String question_8 = new String("KAMRAN MEHBOOB MMALIK");
   int arr[] = new int[26];

   for(int i=0;i<question_8.length(); i++){
      int index = (int) question_8.charAt(i);
      if(index != 32){
         arr[(index-65)]++;
      }
   }
   int max = 0;
   int index = 0;
   for(int i=0;i<arr.length; i++){
      if(max < arr[i]){
         max = arr[i];
         index = i;
      }
   }
   char ch = (char) (index + 65);
   System.out.println("MOst occuring character is " + ch);
   











  }
}
