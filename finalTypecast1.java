import java.util.Scanner;

public class finalTypecast1 {       

    


       static void myMethod1(String m,double num){


                 int index=0;
                 int index1=0;
                String[] dataType = {"byte","short","int","long","float","double"};

                Scanner myobj1 = new Scanner(System.in);
		System.out.println("Which Datatype you want to convert it into");
                String dataString1 = myobj1.nextLine();

                 for(int i=0;i<=dataType.length;i++){
                    if(dataString1.equalsIgnoreCase(dataType[i])){
                          index = i;
                      // System.out.println(i);
                       break;
                       }
                  }
                
                for(int j=0;j<=dataType.length;j++){
                    if(m.equalsIgnoreCase(dataType[j])){
                          index1 = j;
                      // System.out.println(j);
                       break;
                       }
                  }

                 if (index1 < index){
                      System.out.println("It is a implicit conversion");                   
                           
                   }else{
                   System.out.println("It is a explicit conversion");
                   
                 }

                  if (dataString1.equalsIgnoreCase("double")) {
                     double myDouble = (double)num;
                     System.out.println( "  Double is  " + myDouble);
                   }
                     else if(dataString1.equalsIgnoreCase("float")) {
                     float myFloat = (float)num;
                     System.out.println( "  Float is  " + myFloat);
                   }else if(dataString1.equalsIgnoreCase("long")) {
                     long myLong = (long)num;
                     System.out.println( "  Long is  " + myLong);
                   }else if(dataString1.equalsIgnoreCase("int")) {
                     int myInt =(int) num;
                     System.out.println( "  Int is  " + myInt);
                   }else if(dataString1.equalsIgnoreCase("short")) {
                     short myShort =(short)num;
                     System.out.println( "  Short is  " + myShort);
                   }else if(dataString1.equalsIgnoreCase("byte")) {
                     byte myByte = (byte)num;
                     System.out.println( "  Byte is  " + myByte);
                   }else{
                     System.out.println( "This datatype is not compatible for TypeCasting");
                     }
}
            
            
    
                
	public static void main(String[] args) {
		
              
                //Conversion con = new Conversion();
		
		Scanner myobj = new Scanner(System.in);
		System.out.println("Which Datatype you want to enter");
                String dataString = myobj.nextLine();
               
                System.out.println("Enter the value");
                switch(dataString)
                 {
                 case "int":
		   int num1 =myobj.nextInt();
                   myMethod1(dataString,num1);
                   
                   break;
                 case "double":
                   double num2 =myobj.nextDouble();
                   myMethod1(dataString,num2);
                   break;
                 case "float":
                   float num3 =myobj.nextFloat();
                   myMethod1(dataString,num3);
                   break;
                 case "long":
                   long num4 =myobj.nextLong();
                   myMethod1(dataString,num4);
                   break;
                 case "short":
                   short num5 =myobj.nextShort();
                   myMethod1(dataString,num5);
                    break;
                 case "byte":
                   byte num6 =myobj.nextByte();
                   myMethod1(dataString,num6);
                    break;
                 default:
                    System.out.println("Not a valid datatype");
                   }
}


}

               

