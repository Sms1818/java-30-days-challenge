public class Patterns {
    /*
    1. Right Triangle
    *
    * *
    * * *
    * * * *
    */
    public static void rightTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    2. Inverted Triangle
    * * * *
    * * *
    * *
    *
    */
    
    public static void invertedRightTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    3. Pyramid
       *
      * *
     * * *
    * * * *
    */

    public static void pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    4. Number Triangle
    1
    1 2
    1 2 3
    1 2 3 4
    */

    public static void numberTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /*
    5. Floyd’s Triangle
    1
    2 3
    4 5 6
    7 8 9 10
    */

    public static void floydTriangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter++ +" ");
                
            }
            System.out.println();
        }
    }

    /*
    6. Diamond Pattern
       *
      * *
     * * *
    * * * *
     * * *
      * *
       *
    */
    
    public static void diamondPattern(int n){
        // Upper half
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower half
        for(int i=n-1;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    7. Hollow Diamond Pattern
        *
    * *
    *   *
    *     *
    *   *
    * *
        *
    */

    public static void hollowDiamondPattern(int n){
        // Upper half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        System.out.println("Right Triangle Pattern:");
        rightTriangle(5);

        System.out.println("Inverted Right Triangle Pattern:");
        invertedRightTriangle(5);

        System.out.println("Pyramid Pattern:");
        pyramid(5);

        System.out.println("Number Triangle Pattern:");
        numberTriangle(5);

        System.out.println("Floyd's Triangle Pattern:");
        floydTriangle(5);

        System.out.println("Diamond Pattern:");
        diamondPattern(5);

        System.out.println("Hollow Diamond Pattern:");
        hollowDiamondPattern(5);
    }
}
