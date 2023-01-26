package onboarding;

public class Problem4 {
    public static String solution(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        char convertedCh;
        //문자열 문자 추출 후, 변환
        for(int i=0; i<word.length();i++){
            char ch = word.charAt(i);
            int asciiCode = (int)ch;
            //소문자
            if(asciiCode>=97 && asciiCode<=122){
                //변환
                asciiCode = 219 - asciiCode;
                convertedCh = (char)asciiCode;
                stringBuilder.append(convertedCh);
            }
            //대문자
            else if(asciiCode>=65 && asciiCode<=90){
                //변환
                asciiCode = 155 - asciiCode;
                convertedCh = (char)asciiCode;
                stringBuilder.append(convertedCh);
            }
            //알파벳 외 문자
            else{
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}
