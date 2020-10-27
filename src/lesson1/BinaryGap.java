package lesson1;

// Binary gap task
// Description:
// https://app.codility.com/programmers/lessons/1-iterations/binary_gap/

class BinaryGap {
    public int solution(int N) {
        String binaryRep = Integer.toBinaryString(N);
        int maxGap = 0;
        String[] words = binaryRep.split("1");
        for(int i=0; i < words.length-1; i++){
//          System.out.println(words[i]);
            if(words[i].length()>maxGap ){
                maxGap = words[i].length();
            }
        }
        if(binaryRep.charAt(binaryRep.length()-1)=='1'){
            if(words.length > 0 && words[words.length-1].length()>maxGap ){
                maxGap = words[words.length-1].length();
            }
        }
//      System.out.println("lenght: " + words.length);
        return maxGap;
    }
}
