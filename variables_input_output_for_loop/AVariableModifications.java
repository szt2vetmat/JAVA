public class AVariableModifications {
    public static void main(String[] args) {
        int a = 3;
        // increase the value of variable "a" by 10 and print the new value
        a+=10;
        System.out.println("1.Feladat");
        System.out.println("Az eredmeny: "+a);


        int b = 100;
        // decrease the value of b by 7 and print the new value
        System.out.println("2.Feladat");
        b-=7;
        System.out.println("Az eredmeny: "+b);

        int c = 44;
        // double the value of c and print the new value
        System.out.println("3.Feladat");
        int eredmeny=0;
        eredmeny=c*2;
        System.out.println("Az eredmeny: "+eredmeny);

        int d = 125;
        // divide the value of d by 5 and print the new value
        System.out.println("4.Feladat");
        int eredmeny2=0;
        eredmeny2=d/5;
        System.out.println("Az eredmeny: "+eredmeny2);

        int e = 8;
        // cube the value of e and print the new value
        System.out.println("5.Feladat");
        int eredmeny3=0;
        eredmeny3=(int)Math.pow(e,3);
        System.out.println("The cube of 'e' is: " + eredmeny3);

        int f1 = 123;
        int f2 = 345;
        // determine if f1 is greater than f2 (print as a boolean)
        System.out.println("6.Feladat");
        if (f1 > f2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int g1 = 350;
        int g2 = 200;
        // determine if double the value of g2 is greater
        // than g1 (print as a boolean)
        System.out.println("7.Feladat");
        if(g2*2>g1){
            System.out.println("false");
        } else {
            System.out.println("true");
        }


        int h = 135798745;
        System.out.println("8.Feladat");
        // determine if h has 11 as a divisor (print as a boolean)
        if (h % 11 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        int i1 = 10;
        int i2 = 3;
        // determine if i1 is greater than i2 squared and smaller than i2 cubed
        // (print as a boolean)
        System.out.println("9.Feladat");
        if(i1>Math.pow(i2,2) && i1<Math.pow(i2,3)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        int j = 1521;
        // determine if j is divisible by 3 or 5 (print as a boolean)
        System.out.println("10.Feladat");
        if (j % 3 == 0 || j % 5 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
