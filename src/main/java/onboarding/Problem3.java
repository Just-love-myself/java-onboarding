package onboarding;

public class Problem3 {
    public static int solution(int number) {        //최종 시간복잡도: n log n
        int answer = 0;
        for(int i=1;i<=number;i++){
            answer += callCount(i);
        }
        return answer;
    }

    private static int callCount(int num){
        //시간복잡도: log n
        //자리수 구하기
        int count = 0;

        //when
        while(true){
            if(num == 0)
                break;
            int targetNum = num % 10;
            if(targetNum == 3 || targetNum == 6 || targetNum == 9){
                count++;
            }
            num /= 10;
        }

        return count;
    }
}
