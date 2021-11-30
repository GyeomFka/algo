package Chapter2._2J_match_fixing;

/*
* @ int[] data
* @ int n = data.length
* @ int k = n중에서 연속된 k의 갯수
* */
public class _2J_Main {

    private int oddCase;
    private int evenCase;
    private int[] result;

    public void getEachCase(int[] data, int k) {
        int dataLength = data.length;
        result = new int[dataLength - k + 1];
        int rangeSum = 0;

        for(int i = 0; i <= dataLength - k; i++) {
            for(int j = i; j < i + k; j++) {
                rangeSum += data[j];
            }
            result[i] = rangeSum;
            rangeSum = 0;
        }

        analyzeResult(result);
    }

    private void analyzeResult(int[] result) {
        int dataLength = result.length;

        for(int i = 0; i < dataLength; i++) {
            if(result[i]%2 == 0) {
                evenCase++;
            } else {
                oddCase++;
            }
        }
    }

    public int getOddCase() {
        return this.oddCase;
    }

    public int getEvenCase() {
        return this.evenCase;
    }

    public int[] getResult() {
        return result;
    }
}
