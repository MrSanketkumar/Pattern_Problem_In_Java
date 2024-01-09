public class Swati {
     public static void main(String[] args)
      {


//-------------------------------------------------------------------------DAY-1 (22-06-2023)---------------------------------------------------------------------------------

        /*

        *****
        *   *
        *   *
        *   *                   PATTERN PRINTING PROBLEM 1 
        *   *
        *****
        
        */

        // for (int i = 0; i <= 5; i++) {
        //     for (int j = 0; j <= 4; j++) {
        //         if (i==0 || i==5 || j==0 || j==4) {
        //             System.out.print("*");
                    
        //         } else {
        //             System.out.print(" ");
                    
        //         }
        //     //  System.out.println();   
        //     }
        //   System.out.println();  
        // }

        
        /*
          1 
         2 2
        3 3 3                        PATTERN PRINTING PROBLEM 2
       4 4 4 4
         
        
        
        for (int i = 1; i <=4; i++) {
            for (int j =1 ; j <=4-i ; j++) {
                System.out.print(" ");  
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
                
            }System.out.println();
            
        }
       
       
        */
      
        /*
           1 
           1 2
           1 2 3
           1 2 3 4
         

        
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");    
            }System.out.println();
            
        }
        */



        /*
        1 2 3 4 
        1 2 3
        1 2
        1

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j<=5-i ; j++) {
                System.out.print(j+" ");
                
            }System.out.println();
            
        }

        */

        /*
        1 
        2 3
        4 5 6
        7 8 9 10

        int s =1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(s+" ");
                s++;
                
            }System.out.println();
            
        }

         */



//-------------------------------------------------------------------------DAY-2 (25-06-2023)---------------------------------------------------------------------------------
     
        
/*
        1
        01
        101                                     PATTERN PRINTING PROBLEM 1
        0101


        for (int i = 1; i <=4; i++) {
            for(int j =1; j<=i; j++){
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                
                else 
                        {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

*/


/* 
            * * * *
             * * * *                          PATTERN PRINTING PROBLEM 2
              * * * *
               * * * *


        // for (int i = 1; i<=4; i++) {
        //     for(int j = 1 ; j<i ;j++){
        //         System.out.print(" ");
        //     }
        //     for (int j = 4; j>0; j--) {
        //         System.out.print("* ");
                
        //     }
        //     System.out.println();
        // }

*/


/*
             * 
            * *
           * * *
          * * * *                           PATTERN PRINTING PROBLEM 3
           * * *
           * *
            *


        

        // for (int i = 1; i <=4; i++)
        // {
        //     for (int j = 4; j >i ; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print("*"+ " ");  
        //     }
        //    System.out.println(); 
        // }
        // for(int i =1 ; i<=3 ; i++){

        //     for (int j =1 ; j <=i; j++) {
        //         System.out.print(" ");
                
        //     }for (int j = 1; j <=4-i; j++) {
        //         System.out.print("*"+ " ");  
        //     }
        //     System.out.println();
        // }

*/  



//-------------------------------------------------------------------------DAY-3 (26-06-2023)---------------------------------------------------------------------------------
     



/*

                *      *
                **    **
                ***  ***
                ********                                   PATTERN PRINTING PROBLEM 1
                ***  ***
                **    **
                *      *


for (int i = 1; i <=4; i++) {
    for (int j = 1; j <=i; j++) {
        System.out.print("*");
    }
    for (int j = 1; j <= 2*(4-i); j++) {
        System.out.print(" ");
        
    }
    for (int j = 1; j <=i; j++) {
        System.out.print("*");
    }
 System.out.println();   
}

for (int i = 3; i >=1; i--) {

    for (int j = 1; j <=i; j++) {
        System.out.print("*");
    }
    for (int j = 1; j <= 2*(4-i); j++) {
        System.out.print(" ");
        
    }
    for (int j = 1; j <=i; j++) {
        System.out.print("*");
    }
 System.out.println();
    
}


*/


/*

                    * * * * 
                    * * * *                             
                    * * * *                             PATTERN PRINTING PROBLEM 2
                    * * * *

 for (int i = 1; i <=4; i++) {
    for(int j =1 ; j<=4; j++){
        System.out.print("* ");
    }
    System.out.println();
 }


*/


/*

                        * 
                        * *                             PATTERN PRINTING PROBLEM 3
                        * * *
                        * * * *

for(int i =1 ; i<=4;i++){
    for(int j = 1 ; j<=i; j++){
        System.out.print("* ");
    }
    
System.out.println();

}

*/

/*

                    ****
                    ***                         PATTERN PRINTING PROBLEM 4
                    **
                    *


for (int j = 4; j>=1; j--) {
    for(int i = 1; i<=j; i++){
        System.out.print("*");
    }
    System.out.println();
}


*/

/*
                 *
                **
               ***              PATTERN PRINTING PROBLEM 5
              ****



for (int i = 1; i <=4; i++) {
    for (int j = 1; j <=4-i; j++) {
        System.out.print(" ");
        
    }
    for (int j = 1; j <=i; j++) {
        System.out.print("*");
    }
    System.out.println();
}


*/


/*

                ****
                 ***                    PATTERN PRINTING PROBLEM 6
                  **
                   *

for (int j = 4; j>=1; j--) {
    for(int i = 1; i<=4-j+1; i++){
        System.out.print(" ");
    }
    for(int i = 1 ; i<=j; i++){
        System.out.print("*");
    }
    System.out.println();
}

*/


//-------------------------------------------------------------------------DAY-4 (28-06-2023)---------------------------------------------------------------------------------
     



/*

                    * * * * 
                    * * * 
                    * * 
                    *                           PATTERN PRINTING PROBLEM 1
                    * * 
                    * * * 
                    * * * * 


for    (int i = 1; i<=4; i++) {
    for (int j =1; j <=4-i+1; j++) {
        System.out.print("* ");
        
    }
    System.out.println();
}
for (int i = 1; i<4; i++) {
    for(int j=0 ; j<=i; j++){
        System.out.print("* ");
    }
    System.out.println();
}


*/


/*

                 * 
                * * 
               * * *                                        PATTERN PRINTING PROBLEM 2
              * * * *


for (int i = 1; i <=4; i++) {
    for (int j = 1; j <=4-i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j<=i; j++) {
        System.out.print("* ");
        
    }
    System.out.println();
}


*/


/*

                        1 2 3 4 
                         2 3 4                              PATTERN PRINTING PROBLEM 3
                          3 4
                           4


for (int i = 0; i <=4; i++) {

    for (int j = 1; j <=i; j++) {
        System.out.print(" ");
        
    }
    for (int j = 1+i; j <=4; j++) {
        System.out.print(j+" ");
        
    }
    System.out.println();
}

*/

/*

                        1 2 3 4 
                         2 3 4
                          3 4
                           4                            PATTERN PRINTING PROBLEM 4
                          3 4
                         2 3 4
                        1 2 3 4



for (int i = 0; i <4; i++) {
    for (int j = 0; j <=i; j++) {
        System.out.print(" ");
        
    }
    for (int j = 1+i; j <=4; j++) {
        System.out.print(j+" ");
        
    }
    System.out.println();
}

for (int i = 1; i <=3; i++) {
    for (int j = 1; j<=3-i; j++) {
        System.out.print(" ");
        
    }for (int j=4-i; j <=4; j++) {
        System.out.print(" "+j);
        
    }
  System.out.println();  
}

*/
 

/*


   * 
  * *
 *   *
*     *
 *   *
  * *
   *




for (int i = 1; i <=4; i++)
 {
    
    for (int j = 1; j <=4-i; j++) 
    {
        System.out.print(" ");
    }
    for (int j = 1; j <=i; j++)
    {
        if(j>1 && j<i){
            System.out.print("  ");
        }else{
            System.out.print("* ");
        }
    }
    System.out.println();

}

for (int i = 3; i>0; i--) {{
    for (int j = 3; j>i-1 ; j--) {
        System.out.print(" ");
        
    }
    for (int j = 1; j<=i; j++) 
    {
      if (j>1 && j<3 && i ==3) {
        System.out.print("  ");
        
      } else {
        System.out.print("* ");
      }
       
    }
    System.out.println();
}
    
}


*/




int n  = 3;
 
for(int i = 1; i<=n ; i++){
   for(int  j=n; j>=1; j--)
   {
    for (int j2 = n; j2 >=i; j2--) {
        System.out.print(j+" ");
    }
     
    }
    System.out.println();
}

    
}   
}
    

    



