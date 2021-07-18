/*
* ==> BREAK STATEMENT
* ==> Block naming
*
* */
// import java.lang.*;

class Program11Demo{
    public static void main(String args[]){
        boolean x = true;

        block1:{
            block2:{
                block3:{
                    System.out.println("Block 3");
                    if(x)
                        break block2;
                }
                System.out.println("Block 2");
            }
            System.out.println("Block 1");
        }
        System.out.println("Out of all blocks");
    }
}
