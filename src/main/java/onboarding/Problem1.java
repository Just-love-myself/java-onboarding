package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        if(verifyNum(pobi)==false || verifyNum(crong)==false){
            answer = -1;
            return answer;
        }

        //pobi
        int pobi_left = calSum(pobi.get(0));
        int pobi_right = calSum(pobi.get(1));
        int pobiMax = Math.max(pobi_left, pobi_right);

        //crong
        int crong_left = calSum(crong.get(0));
        int crong_right = calSum(crong.get(1));
        int crongMax = Math.max(crong_left, crong_right);

        //pobi vs crong
        if(pobiMax > crongMax)
            answer = 1;
        else if (pobiMax < crongMax) {
            answer = 2;
        }
        else{
            answer = 0;
        }
        return answer;
    }

    private static boolean verifyNum(List<Integer> integerList){
        //첫 페이지, 마지막 페이지 조건달기
        if(integerList.get(0)<1||integerList.get(1)>400){
            return false;
        }
        //왼쪽페이지와 오른쪽페이지의 차이 조건 달기
        if(integerList.get(1) - integerList.get(0) != 1){
            return false;
        }
        return true;
    }

    private static int calSum(int num){
        //자리수로 연산하기
        int sumAdd = 0;
        int sumMul = 1;

        //when
        while(true){
            if(num == 0)
                break;
            sumAdd += num % 10;
            sumMul *= num % 10;
            num /= 10;
        }
        return Math.max(sumAdd, sumMul);
    }

}