package programmers.level1;
//음양 더하기
public class YinYangSum {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i<absolutes.length; i++){
            if(signs[i] == true){
                answer += absolutes[i];
            }
            else{
                answer += -absolutes[i];
            }
        }
        return answer;
    }
}

