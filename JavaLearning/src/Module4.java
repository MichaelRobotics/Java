public class Module4 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        if(isFishTasty) {
            System.out.println("Yummy");
        } else {
            System.out.println("Not Yummy");
        }
        if(isJavaFun) {
            System.out.println("Java is fun!");
        } else {
            System.out.println("Java is not fun!");
        }
        
        int HighScore = 100;
        int LowScore = 40;
        boolean isHighScore = true;
        if(HighScore > LowScore) {
            System.out.println("High Score is greater than Low Score");
        } else {
            System.out.println("Low Score is greater than High Score");
        }
        if(HighScore < LowScore && HighScore > 50) {
            System.out.println("High Score is less than Low Score and greater than 50");
        } else {
            System.out.println("High Score is greater than Low Score and less than 50");
        }           
        if(isHighScore) {
            System.out.println("High Score is true");
        } else {
            System.out.println("High Score is false");
        }
        int something  =  isHighScore ? 100 : 50;
        System.out.println(something);
        double myDouble = 20.00d;
        float mayFloat = 80.00f;
        byte myByte = 12;
        short myShort = Short.MAX_VALUE;
    }
}