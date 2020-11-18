ALGHORITHM chaine{  
      
        //Counter variable to store the count of vowels and consonant  
         var  vCount := 0; 
         var cCount := 0;  
         var wCount := 0;  
          
        //Declare a string  
        String str = "This is a really simple sentence";  
  BEGIN        
        //Converting entire string to lower case to reduce the comparisons  
        str = str.toLowerCase();  
     READ (str);    
        for(int i = 0; i < str.length(); i++) {  
            //Checks whether a character is a vowel  
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {  
                //Increments the vowel counter  
                vCount++;  
            }  
            //Checks whether a character is a consonant  
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {    
                //Increments the consonant counter  
                cCount++;  
            }  
             //Checks whether a character is a consonant  
            else if(str.charAt(i) == ' ') {    
                //Increments the consonant counter  
                wCount++;  
            }  
        }  
        write("Number of vowels: " + vCount);  
        write("Number of consonants: " + cCount); 
        write("Number of word: " + cCount+1); 
     
}  END
