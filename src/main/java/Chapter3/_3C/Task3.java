package Chapter3._3C;

public class Task3 {

    public static void main(String[] args) {
//        final String INAUGURAL_SPEECH = "show me the money, food for thought, power overwhelming. artist baby. life is short, artist work nunu.";
        final String INAUGURAL_SPEECH = "abcd efg h i jklmn opqr s t  uvwxyz";
        final int noBlankLength = INAUGURAL_SPEECH.replaceAll(" ","").length();
        final int stringLength = INAUGURAL_SPEECH.length();

        String upperStr = INAUGURAL_SPEECH.toUpperCase();

        int aCnt = 0;
        int bCnt = 0;
        int cCnt = 0;
        int dCnt = 0;

        for(int i = 0; i < stringLength; i++ ) {
            switch ( upperStr.charAt(i) ) {
                case 'A' :
                    aCnt++;
                    break;
                case 'B' :
                    bCnt++;
                    break;
                case 'C' :
                    cCnt++;
                    break;
                case 'D' :
                    dCnt++;
                    break;
            }
        }

        System.out.println("A: " + aCnt + "개, " + Double.parseDouble(String.format("%.2f", (double)aCnt / noBlankLength * 100)) + "%");
        System.out.println("B: " + bCnt + "개, " + Double.parseDouble(String.format("%.2f", (double)bCnt / noBlankLength * 100)) + "%");
        System.out.println("C: " + cCnt + "개, " + Double.parseDouble(String.format("%.2f", (double)cCnt / noBlankLength * 100)) + "%");
        System.out.println("D: " + dCnt + "개, " + Double.parseDouble(String.format("%.2f", (double)dCnt / noBlankLength * 100)) + "%");

    }

}
