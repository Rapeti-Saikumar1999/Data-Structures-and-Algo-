// output - System.out.print("hello world")
// way 2(println) = System.out.println('Hello world'); -> prints in next line
// way 3("\n") - System.out.print("Hello world\n") -> prints in next line


//question 1 - pattern using output statement
*
**
***
****
//Solution
public class Main {
  public static void main(String[] args) {
      System.out.println("*\n**\n***\n****\n");
  }
}



// java is a typed language 
//primitive: byte(8 bits),short, int(4 bytes), char(2 bytes), boolean(1 byte), long(8 bytes), float(4 bytes), double(8 bytes)
//non-primitive: strings, arrays, class , object, interface


//how to take input
Scanner sc = new Scanner(System.in) ->// System.in --- taking input from system
String name = sc.next() // next() -- is a function used to get user input
// next function will take only word
String name1 = sc.nextLine() // takes the full line
// nextInt()
//nextFloat()
// nextLong()
// nextDouble()

//conditional statements
if(condition){

}
else if(condition){

}
else{

}


switch(value) // use switch instead of using more no of if-else statements
{
    case 1:
        break;
    case 2:
        break;
    default:
        //statement
}


//loops - to do repetitive tasks
// loops are used to execute the block of statements repetitively untill a certain condition met. it contains initialization , condition check, increment
//for-loop
for(int i=0;i<10;i++)
{
    System.out.println(i);
}

//while loop
while(condition)
{
    System.out.println();
}

//do-while
do{
    System.out.println();
}while(condition);   // here termination is mandatory


//prime number 
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
boolean prime=true;
for(int i=2;i<n;i++){
  if(n%i==0)
  {
    prime=false;
    break;
  }
}

if(prime){
  if(n==1)
  {
    System.out.println("neither prime nor cpmposite");
  }else{
  System.out.println("prime");

  }
}
else{
  System.out.println("not prime");
}

  }
}


//pattern problems analysis
//for rows - consider outer loop
//for columns - consider inner loop

//pattern1- solid rectangle
*****
*****
*****
*****

public class Main {
  public static void main(String[] args) {
    for(int i=1;i<=4;i++)
    {
      for(int j=1;j<=5;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}


//pattern2 - hollow rectangle
*****
*   *
*   *
*****
 public static void main(String[] args) {
    for(int i=1;i<=4;i++)
    {
      for(int j=1;j<=5;j++)
      {
        if(i==1||i==4||j==1||j==5)
        {
        System.out.print("*");

        }
        else{
        System.out.print(" ");

        }
      }
      System.out.println();
    }
  }


  //patter 3- half pyramid
*
**
***
****
public static void main(String[] args) {
    for(int i=1;i<=4;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //pattern 4- inverted half pyramid
****
***
**
*
 public static void main(String[] args) {
    for(int i=4;i>=1;i--)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }

//pattern 5- inverted half pyramid rotated 180deg
   *
  **
 ***
****
int n=4;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n-i;j++)
      {
        System.out.print(" ");
      }

      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }

      System.out.println();
    }


//pattern 6- half pyraamid with number
1 
1 2 
1 2 3 
1 2 3 4 
for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(j+" ");
      }

      System.out.println();
    }

//pattern 7 - inverted half pyramid witth numbers
1 2 3 4 
1 2 3 
1 2 
1 
 for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n-i+1;j++)
      {
        System.out.print(j+" ");
      }
      System.out.println();
    }


//pattern 8 - flyod's triangle
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
    int n=5;
    int number=1;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(number+" ");
        number++;
      }
      System.out.println();
    }


//pattern 9 - 0-1 traingle
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
int n=5;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        int sum=i+j;
        if(sum%2==0)
        {
          System.out.print("1 ");//for even
        }else{
          System.out.print("0 ");//for odd
        }
      }
      System.out.println();
    }

//pattern 10 - rhombus
    *****
   ***** 
  *****  
 *****   
*****
int n=5;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n-i;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=n;j++)
      {
        System.out.print("*");
      }
    //   for(int j=1;j<=i-1;j++)
    //   {
    //     System.out.print(" ");
    //   }
      System.out.println();
    }

//pattern 11 - palindrome pyramid
    1
   212
  32123
 4321234
543212345
for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n-i;j++) //spaces
      {
        System.out.print(" ");
      }
      for(int j=i;j>=1;j--)
      {
        System.out.print(j);
      }
      for(int j=2;j<=i;j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }

//pattern 12 - butter fly
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *


//first half of butterfly
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++) //stars
    {
      System.out.print("*");
    }
    for(int j=1;j<=2*(n-i);j++)//spaces
    {
      System.out.print(" ");
    }
    for(int j=1;j<=i;j++) //stars
    {
      System.out.print("*");
    }
    System.out.println();
    }


    //second half butterfly
    for(int i=n;i>=1;i--)
    {
      for(int j=1;j<=i;j++) //stars
    {
      System.out.print("*");
    }
    for(int j=1;j<=2*(n-i);j++)//spaces
    {
      System.out.print(" ");
    }
    for(int j=1;j<=i;j++) //stars
    {
      System.out.print("*");
    }
    System.out.println();
    }

// pattern 13 - pyramid number
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
int n=5;
    
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n-i;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++)
      {
        System.out.print(i+" ");
      }
      System.out.println();
    }

//pattern 14 - diamond pattern
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
  for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n-i;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i=n;i>=1;i--)
    {
      for(int j=1;j<=n-i;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }


// pattern 15 - hollow butterfly
*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *
import java.io.*;
public class Main {
  public static void main(String[] args) {
      int n=5;
      for(int i=1;i<=n;i++) //outer loop 
      { 
        System.out.print("*");
        for(int j=1;j<=i-2;j++)
        {
        System.out.print(" ");
        }
        if(i>1)
        {
        System.out.print("*");
        }

        for(int j=1;j<=2*(n-i);j++)
        {
        System.out.print(" ");
        }
        System.out.print("*");
        for(int j=1;j<=i-2;j++)
        {
        System.out.print(" ");
        }
        if(i>1)
        {
        System.out.print("*");
        }
        System.out.println();

      }for(int i=n;i>=1;i--) //outer loop 
      { 
        System.out.print("*");
        for(int j=1;j<=i-2;j++)
        {
        System.out.print(" ");
        }
        if(i>1)
        {
        System.out.print("*");
        }

        for(int j=1;j<=2*(n-i);j++)
        {
        System.out.print(" ");
        }
        System.out.print("*");
        for(int j=1;j<=i-2;j++)
        {
        System.out.print(" ");
        }
        if(i>1)
        {
        System.out.print("*");
        }
        System.out.println();

      }
  }
}


//pattern 16 - hollow rhombus
    *****
   *   *
  *   *
 *   *
*****
  int n=5;
  for(int i=1;i<=n;i++)
  {
    
for(int k=1;k<=n-i;k++)
      {
        System.out.print(" ");
        
      }
    for(int j=1;j<=n;j++)
    {
      
      if(i==1 || i==n || j==1 || j==n)
      {
        System.out.print("*");
      }
      else
      {
        System.out.print(" ");
      }
    }
    System.out.println();
  }


//functions
syntax:   

public static returnType functionName(args)
{
//opertions
}

returnType: int , string, float, void(no return)
args : type name

//example 1 - to print name using functions
import java.io.*;
import java.util.*;
public class Main {
  public static void printName(String name)
  {
    System.out.println(name);
    return;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String name = sc.nextLine();
    printName(name);
    
  }
 
}

//exampe 2 - to print sum of two number
public class Main {
  public static int calSum(int a, int b)
    {
      int sum = a+b;
      return sum;
    }
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = calSum(a,b);
    System.out.println(sum); 
  }
}