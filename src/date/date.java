package date;
import java.util.Scanner;
public class date {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("FIRST NAME:");
        String d=input.next();
        String s=d.toLowerCase();
        System.out.print("LAST NAME:");
        String d1=input.next();
        String s3=d1.toLowerCase();
        int v=s.length()-1;
        int v1=s3.length()-1;
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        char c=s.charAt(0);
        int k=(int)c;
        char c1=s3.charAt(0);
        int k1=(int)c1;
        String s1 = null,s2 = null;
        if (k>=97) {
            int value=(int)c-32;
            char n=(char)value;
             s1=String.valueOf(n);
             for (int i =1; i <=v; i++) {
            sb.append(s.charAt(i));
            
        }
            // System.out.println(s1+sb);
        }else{
            System.out.println(s);
        }
        if (k1>=97) {
             int value1=(int)c1-32;
         char n1=(char)value1;
          s2=String.valueOf(n1);
            for (int j =1; j <=v1; j++) {
            sb1.append(s3.charAt(j));
                
        }
            //System.out.println(s2+sb1);
        }else{
            System.out.println(s3);
        }
       // System.out.println(value);
       // System.out.println(s1);
      // 
       // System.out.println(s2+sb1);
       
        //System.out.println("FULL NAME:"+s1+sb+" "+s2+sb1);
        
        
       
    
        System.out.print("ENTER DATE:");
        int date=input.nextInt();
        System.out.print("ENTER MONTH:");
        String month=input.next().toLowerCase();
        System.out.print("ENTER YEAR:");
        int year=input.nextInt();
        int sub=year-1900; //96
        int div=sub/4; //24
        int b=0;
        int rem1=sub%4; //0
        int total=0;
        int p;
         switch(month){
                case "january":
                     p=+(date-14);
                     if(date<14){
                    System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-592)+" POUSH-"+(p+30));
                    }
                    else{
                    System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-592)+" MAGH-"+p);
                    }
                    if(year%4==0){
                    b=1;
                    total=date+sub+(div-1)+b;
                    }else{
                    b=1;
                    total=date+sub+div+b;
                    }
                break;
                case "february":
                      
                    if(year%4==0){
                    p=+(date-11);
                    if(date<14){
                    System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-594)+" MAGH-"+(p+29));
                    }
                    else{
                        System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-594)+" FALGUN-"+p);
                    }
                        b=4;
                        total=date+sub+(div-1)+b;
                    }else{
                         p=+(date-12);
                     if(date<14){
                    System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-594)+" MAGH-"+(p+30));
                    }
                    else{
                        System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-594)+" FALGUN-"+p);
                    }
                    b=4;
                    total=date+sub+div+b;
                    }
                break;
                case "march":
                     p=+(date-14);
                     if(date<14){
                    System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-594)+" FALGUN-"+(p+30));
                    }
                    else{
                        System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-594)+" CHOITRO-"+p);
                    }
                b=4;
                 total=date+sub+div+b;
                 break;
                case "april":
                      p=+(date-13);
                     if(date<14){
                    System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-594)+" CHOITRO-"+(p+30));
                    }
                    else{
                        System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" BOISHAKH-"+p);
                    }
                b=0;
                 total=date+sub+div+b;
                 break;
                case "may":
                    p=+(date-14);
                    if(date<14){
                    System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" boishakh-"+(p+30));
                    }
                    else{
                        System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" JOISHTHO-"+p);
                    }
                    
                b=2;
                 total=date+sub+div+b;
                 break;
                case "june":
                    p=+(date-13);
                     if(date<14){
                    System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" JOISHTHO-"+(p+30));
                    }
                    else{
                        System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" ASHAR-"+p);
                    }
                b=5;
                 total=date+sub+div+b;
                 break;
                case "july":
                     p=+(date-14);
                     if(date==13){
                    System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" ASHAR-"+(p+30));
                    }
                    else{
                        System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" SRABON-"+p);
                    }
                b=0;
                 total=date+sub+div+b;
                 break;
                case "august":
                     p=+(date-14);
                     if(date<14){
                    System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" SRABON-"+(p+30));
                    }
                    else{
                        System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" VADRO-"+p);
                    }
                b=3;
                 total=date+sub+div+b;
                 break;
                case "september":
                     p=+(date-13);
                     if(date<14){
                    System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" VADRO-"+(p+30));
                    }
                    else{
                        System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" ASHWIN-"+p);
                    }
                b=6;
                 total=date+sub+div+b;
                 break;
                case "october":
                     p=+(date-14);
                     if(date<14){
                    System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" ASHWIN-"+(p+30));
                    }
                    else{
                        System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" KARTIK-"+p);
                    }
                b=1;
                 total=date+sub+div+b;
                 break;
                 case "november":
                      p=+(date-14);
                     if(date==13){
                    System.out.println("Welcom "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" KARTIK-"+(p+30));
                    }
                    else{
                        System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" OGROHAYON-"+p);
                    }
                b=4;
                 total=date+sub+div+b;
                 break;
                case "december":
                     p=+(date-14);
                     if(date==13){
                    System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" OGROHAYON-"+(p+30));
                    }
                    else{
                        System.out.println("Welcome "+s1+sb+" "+s2+sb1+" The bangla year is: "+(year-593)+" POUSH-"+p);
                    }
                b=6;
                 total=date+sub+div+b;
                 break;
         }
                 
          int rem=total%7;
         switch(rem){
             case 0:
                 System.out.print("Saturday");
                 break;
             case 1:
                 System.out.print("Sunday");
              break;
              case 2:
                 System.out.print("Monday");
                 break;
             case 3:
                 System.out.print("Tuesday");    
                 break;
                 
              case 4:
                 System.out.print("Wednesday");
                 break;
             case 5:
                 System.out.print("Thursday");
                 break;
             case 6:
                 System.out.print("Friday");
                 break;
         }    
         System.out.println(" ");
}
    }