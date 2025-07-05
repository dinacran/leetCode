import java.io.IO;

void main(){

    IO.println(pushDominoes("L.L.R."));
    IO.println(pushDominoes("L.L.....R."));
    IO.println(pushDominoes("L.L..LR.R."));

}

public String pushDominoes(String dominoes) {

    char[] dom = dominoes.toCharArray();
    int length = dom.length;

    int i = 0;
    char temp = '.';
    int count = 0;

    while(i < length - 1){

        while(i < length && (dom[i] == '.' || dom[i] == 'R')){
            if(dom[i] == 'R') {
                temp = 'R';
                count = 0;
            }
            else{
                dom[i] = temp;
                count++;
            }
            i++;
        }

        if(i < length && dom[i] == 'L'){

            if(count > 0 && temp == 'R'){

                int h = count / 2; 

                int j = i - 1;

                if(count % 2 == 0){
                    while(h > 0){
                        dom[j--] = 'L';
                        h--;
                    }
                }else{
                    while(h > 0){
                        dom[j--] = 'L';
                        h--;
                    }
                    dom[j] = '.';
                }
            }else{
                int j = i - 1;
                while(j >= 0 && dom[j] == '.'){
                    dom[j--] = 'L';
                }
            }
            count = 0;
            temp = '.';
        }
        // i++;
    }
    return new String(dom);
}

// public String pushDominoes(String dominoes) {

//     char[] doms = dominoes.toCharArray();
//     int length = doms.length;

//     for(int i = 0; i < length; i++){
        
//         if(doms[i] == '.'){
//             int j = i;
//             while(j < length - 1 && doms[j] == '.'){
//                 j++;
//             }

//             if(i == 0 || doms[i-1] == 'L'){
//                 if(doms[j] == 'L'){
//                     while(j > i){
//                         doms[--j] = 'L';
//                     }
//                 }
//             }
//             else if(j == length-1){
//                 if(doms[i-1] == 'R')
//                 while(j >= i)
//                 doms[j--] = 'R';

//             }

//             else if(doms[j] == doms[i-1]){
//                 char t = doms[j];
//                 while(j >= i){
//                     doms[j--] = t;
//                 }

//             }
//             else if(doms[j] == 'L' && doms[i-1] == 'R'){
//                 int k = (j - i)/2;

//                 while(k > 0){
//                     doms[i++] = 'R';
//                     doms[--j] = 'L';
//                     k--;

//                 }
//             }            
//         }    
//     }    
//     return new String(doms);
// }




  // int k = (j - i)/2;

            // if(doms[j] == 'L'){
            //     while(k > 0){
            //         doms[--j] = 'L';
            //         k--;
            //     }
            // }

            // j = i;

            // // while(j > 0 && doms[j] == '.'){
            // //     j--;
            // // }

            // // if(doms[j] == 'R'){
            // //     while(j-1 < i){

            // //         doms[++j] = 'R';

            // //     }
            // // }

            // if(i == 0){

            //     if(doms[i+1] == 'L') doms[i] = 'L';

            // }   
            // else if( i == length - 1){
            //     if(doms[i-1] == 'R') doms[i] = 'R';

            // }         
            // else if((doms[i-1] == 'R' && doms[i+1] == 'L') || doms[i-1] == 'R' && doms[i+1] == 'L'){

            // }
            // else if(doms[i - 1] == 'R'){
            //     doms[i] = 'R';
            // }
            // else if(doms[i + 1] =='L'){
            //     doms[i] = 'L';
            // }