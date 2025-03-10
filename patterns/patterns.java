package patterns;

public class patterns {
    public static void main(String args[]){
        int count = 5;
        // for(int i = 0; i < count; i++){
        //     for(int j = 0; j < i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j < count; j++){
        //         if(i == 0 || ((i > 0 && i <= count - 2) && (j == 0 || j == count- 1)) || i == count - 1){
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i = count; i > 0; i--){
        //     for(int j = 0; j < i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j < count; j++){
        //         if(i == count || ((i > 1 && i <= count - 1) && (j == 0 || j == count- 1)) || i == 1){
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i = 0; i < count; i++){
        //     for(int j = 0; j < i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = count; j > i; j--){
        //         System.out.print("*");
        //     }
        //     if(i == count - 1){
        //         System.out.println();
        //         for(i = 0; i < count -1; i++){
        //             for(int j = 0; j < count - (i + 2); j++){
        //                 System.out.print(" ");
        //             }
        //             for(int j = 0; j < i + 2; j++){
        //                 System.out.print("*");
        //             }
        //             System.out.println();
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i = 0; i < count; i++){
        //     for(int j = 0; j < i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j < count - i; j++){
        //         System.out.print("* ");
        //     }
        //     if( i == count - 1){
        //         System.out.println();
        //         for( i = 0; i < count; i++){
        //             for(int j = 0; j < count - (i + 1); j++){
        //                 System.out.print(" ");
        //             }
        //             for(int j = 0; j < i + 1; j++){
        //                 System.out.print("* ");
        //             }
        //             System.out.println();
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i = 0; i < count; i++){
        //     for(int j = 0; j < i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 0; j < count - i; j++){
        //         if(i == 0 || j == 0|| j == count - (i + 1)){
        //             System.out.print("* ");
        //         } else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        //     if(i == count - 1){
        //         for(i = 0; i < count; i++){
        //             for(int j = 0; j < count - (i + 1); j++){
        //                 System.out.print(" ");
        //             }
        //             for(int j = 0; j <= i; j++ ){
        //                 if(i == count - 1 || j == 0 || j == i){
        //                     System.out.print("* ");
        //                 } else{
        //                     System.out.print("  ");
        //                 }
        //             }
        //             System.out.println();
        //         }
        //     }
        // }
        
        // for(int i = 0; i < count; i++){
        //     for(int j = 0; j <= i; j++ ){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     if(i == count - 1){
        //         for( int x = count - 1; x > 0; x--){
        //             for(int j = 0; j < x; j++){
        //                 System.out.print("*");
        //             }
        //             System.out.println();
        //         }
        //     }
        // }
    
        for(int i = 0; i < count; i++){
            for(int j = 0; j < count - (i + 1); j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
            if(i == count - 1){
                for(int x = 0; x < count - 1; x++){
                    for(int j = 0; j <= x; j++ ){
                        System.out.print(" ");
                    }
                    for(int j = 0; j < count - (x + 1); j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}
