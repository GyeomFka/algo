package Chapter3._3C;

public class Task3 {

    public static void main(String[] args) {
//        final String INAUGURAL_SPEECH = "show me the money, food for thought, power overwhelming. artist baby. life is short, artist work nunu.";
        final String INAUGURAL_SPEECH = "aAd vfac cdDd aBbgzca bed aCbd baccd ";
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

        System.out.println("A : " + aCnt);
        System.out.println("B : " + bCnt);
        System.out.println("C : " + cCnt);
        System.out.println("D : " + dCnt);

    }

}
