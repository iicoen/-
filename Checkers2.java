
import java.io.IOException;
import java.util.Arrays;

import java.util.Scanner;

public class Checkers2 {

    char black = 9940;///9940///
    char white = 9898;///9898///
    char eb = 9926;///9926////1565///95///9949///10060///9899
    char ew = eb;
    char kb = 10060;///9818///9742///10060
    char kw = 9917;///9812//9743///9917
    int bl = 12;
    int wh = 12;
    boolean btorn;


    char[][] mat = {{ew, black, ew, black, ew, black, ew, black, '1'}
            , {black, ew, black, ew, black, ew, black, ew, '2'}
            , {ew, black, ew, black, ew, black, ew, black, '3'}
            , {eb, ew, eb, ew, eb, ew, eb, ew, '4'}
            , {ew, eb, ew, eb, ew, eb, ew, eb, '5'}
            , {white, ew, white, ew, white, ew, white, ew, '6'}
            , {ew, white, ew, white, ew, white, ew, white, '7'}
            , {white, ew, white, ew, white, ew, white, ew, '8'}
            , {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', '@'}};


    public boolean b = true;
    public boolean btor2 = false;
    public boolean bsr = false;
    public String s = "D43456E5";
    public String tn = "iuguk";
    public String s2 = "D43456E5";
    int i1;
    int j1;
    int i2;
    int j2;
    int i3;
    int j3;
    //    String []str= {"E8    B5","A8    C6","C6    E8","E4    C6","C6    D5","A6    B7","G4    F3","B5    A6","E6    G4","C4    B5","F7    E6","B3    C4","C8    D7","A2    B3","E8    F7","H3    F5","E6    G4","G8    E6","H5    F7","F7    G6","B3    A4","D7    C6","G2    E4","E4    F3","C2    B3","D5    E4","G4    F5","B7    D5","A4    C6","C6    B5","G4    E5","E6    G4","C4    E6","E2    C4","B5    D3","D3    C4","E6    D5","G4    H5","G6    F5","F3    G4","A6    B5","B3    A4"};
//    String[] str = {"D1    F3", "F3    E2", "C6    B7", "G4    H3", "B5    C6", "H5    G4", "A4    B5", "G6    H5", "B5    E2", "B5    D2", "H7    G6", "E8    B5", "A8    C6", "C6    E8", "E4    C6", "C6    D5", "A6    B7", "G4    F3", "B5    A6", "E6    G4", "C4    B5", "F7    E6", "B3    C4", "C8    D7", "A2    B3", "E8    F7", "H3    F5", "E6    G4", "G8    E6", "H5    F7", "F7    G6", "B3    A4", "D7    C6", "G2    E4", "E4    F3", "C2    B3", "D5    E4", "G4    F5", "B7    D5", "A4    C6", "C6    B5", "G4    E5", "E6    G4", "C4    E6", "E2    C4", "B5    D3", "D3    C4", "E6    D5", "G4    H5", "G6    F5", "F3    G4", "A6    B5", "B3    A4"};
    String[]str={"D7C8","A6B5","E8D7","A2B1","H5E8","B7A6","D1H5","C8B7","H5D1","B3A2","E8H5","A4B3","H5E8","B5A4","D1H5","B5A4","A6B5","A4D1","B7A6","D1A4","G2F1","H5D1","H3G2","D1H5","G4H3","A4D1","H5G4","H5G6","E8A4","A6B5","F7E8","G2H1","G6F7","F3G2","F5G6","G8H7","G4F5","H7G6","H3G4","E4F3","G2H3","G6H5","H1G2","E8G6","D5F7","D7E6","C4D5","G6E4","B3C4","F7G6","A2B3","F1D3","G4F5","F7G6","F7G6","D3F1","H3G4","G6H5","C2B3","F1D3","B1C2","D1A4","F3D1","D1E2","E2F1","E2G1","C2B3","C4E2","E6C4","C4D5","D5F3","F3E4","D5E4","C6D5","B3C4","A6B5"};
    int bdika = str.length;
    int k = 0;
    String[] vv = new String[k];

    public void vvvv() throws IOException {///פונקצייה לאגירת המהלכים במערך סטרינגים
        k++;
        String[] vh = new String[k];
        vh[0] = s;
        for (int i = 1; i < vh.length; i++) {
            vh[i] = vv[i - 1];
        }
        vv = vh;

//        Writer cc=new Writer();
//        cc.bb(vv);

    }
    public static void main(String[] args) throws IOException {
        Checkers2 aa=new Checkers2();
        aa.fank1();
    }
    public boolean stop() {//פונקצייה לעצירת המשחק והדפסת המהלכים במערך
        if (s.equals("עצור") || s.equals("עצירה") || s.equals("מנוחה") || s.equals("הפסקה") || s.equals("עצירה זמנית") || s.equals("לנוח")
                || s.equals("under arrest") || s.equals("stop") || s.equals("rest") ||
                s.equals("Pause") || s.equals("temporary stop") || s.equals("To rest")||s.equals("STOP") ||s.equals("GMUR"))  {
            return true;
        }
        return false;
    }

    public void hrtg() {///פונקציה להוספת כלים ללוח לצורך בדיקת תיקו
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (mat[i][j] == eb) mat[i][j] = black;
            }
        }
    }
    public static void reverseArray(String[]arr){
        for (int i = 0; i < arr.length/2 ; i++) {
            String temp;
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    public void fank1() throws IOException {
        Scanner in = new Scanner(System.in);
//        System.out.println(Arrays.toString(str));

//        reverseArray(str);
//        System.out.println(Arrays.toString(str));

        System.out.println("אוקיי, אני מניח שאתה מכיר את הכללים בא נכיר לך את כלי המשחק:");
        System.out.println("חייל שחור:" + black + " חייל לבן: " + white + " מלך שחור: " + kb + " מלך לבן: " + kw);
        Checkers e = new Checkers();//מופע של משחק חדש
        b = true;
        while (true) {
            System.out.println("זה מצב הלוח עכשיו:");
            PrintBoard();
            if (bl == 0 || wh == 0) {////תנאי עצירה בשחקן מנצח
                if (bl > 0) {
                    System.out.println("השחור ניצח");
                }
                if (wh > 0) {
                    System.out.println("הלבן ניצח");
                }
                break;
            }
            if (draw()) {
                System.out.println("המשחק הסתיים בתיקו");
                break;
            }
            if (b) {
                System.out.println("שחור הכנס מהלך משחק בבקשה");
            } else {
                System.out.println("לבן הכנס מהלך משחק בבקשה");
            }
//            if (bdika >0) {s=str[bdika-1];bdika--;
//                System.out.println(s);}
//            else {
            s2=s;
            s = in.nextLine();
//            vvvv();
//            }///קבלת סטרינג- מהלך משחק - חדש

            if (s.length() < 4) {
                System.out.println("המהלך שלך לא באורך המתאים");
                continue;}
            if (stop()) {
                System.out.println(Arrays.toString(vv));
                break;}
            bbb();////השמה לשדות לפי הסטרינג החדש
            if (!LimitsStr()) {
                System.out.println("המהלך שלך מחוץ לגבולות");
                continue;}
            if (btor2 && !s.substring(0, 2).equals(tn.substring(s.length()-2))) {
                System.out.println("בתור נוסף אתה צריך להמשיך להשתמש באותו חייל !");
                continue;}
            if (btor2 && (oneStep() || kingMoveHunger())) {
                System.out.println("בתור נוסף אתה חייב לאכול !");
                continue;}
            if (!BlackWhiteEat()) {
                System.out.println("לא תורך עכשיו !");
                continue;}
            if ((oneStep() || twoSteps() || kingMove() || kingMoveHunger()) && cameVoid()) {
                placement();///השמה
                if (btorn && (AnotherTurn() || AnotherTurnk())) {///בדיקה אם יש תור נוסף פונק 1 למלך ו 1 לחייל
                    System.out.println("יש לך תור נוסף");
                    tn = s;////סטרינג שומר את התור הקודם לבדוק שבתור נוסף הולך עם אותו החייל
                    btor2 = true;
                    continue;
                } else {
                    btor2 = false;}
                if (b) b = false;///החלפת תורות בסיום התור
                else b = true;
//                e.bsr = e.AnotherTurnsr() || e.AnotherTurnk();//בדיקה אם יוכל לאכול לצורך שריפה
                continue;
            } else {
                System.out.println("מהלך לא תקין !");continue;}
        }
        System.out.println(Arrays.toString(vv));
    }


    public boolean draw() {///פונקציית תיקו
        int bl1 = bl;
        int wh1 = wh;
//        System.out.println(wh);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (b) {
                    if ((mat[i][j] == black)) if (stuckSoldier(i, j)) bl1--;
                    else return false;
                    if (mat[i][j] == kb) if (stuckKing(i, j)) bl1--;
                    else return false;
                    if (bl1 == 0) return true;
                }
                if (!b) {
                    if ((mat[i][j] == white)) if (stuckSoldier(i, j)) wh1--;
                    else return false;
                    if (mat[i][j] == kw) if (stuckKing(i, j)) wh1--;
                    else return false;
                    if (wh1 == 0) return true;
                }

            }
        }
        return false;
    }

    public boolean stuckKing(int i, int j) {///מלך תקוע לצורך תיקו
        if ((matfnnn(i + 1, j + 1) && matfnnn(i + 2, j + 2) || !matf1(i + 1, j + 1)) &&
                matfnnn(i + 1, j - 1) && (matfnnn(i + 2, j - 2) || !matf1(i + 1, j - 1)) &&
                matfnnn(i - 1, j - 1) && (matfnnn(i - 2, j - 2) || !matf1(i - 1, j - 1)) &&
                matfnnn(i - 1, j + 1) && (matfnnn(i - 2, j + 2) || !matf1(i - 1, j + 1)))
            return true;///מחזיר אמת אם אא ללכת לכל ה 8 אופציות
        return false;
    }
    public boolean stuckSoldier(int i, int j) {///חייל תקוע לצורך תיקו
        if (!btor2) {
            if (b)
                //            if (matfnnn(i + 1, j + 1) && matfnnn(i + 1, j - 1) && matfnnn(i + 2, j + 2) && matfnnn(i + 2, j - 2))
                if ((matfnnn(i + 1, j + 1) && matfnnn(i + 2, j + 2) || !matf1(i + 1, j + 1)) &&
                        matfnnn(i + 1, j - 1) && (matfnnn(i + 2, j - 2) || !matf1(i + 1, j - 1)))
                    return true;///מחזיר אמת אם אא ללכת לכל הארבע אופציות בחייל
            if (!b)
//            if (matfnnn(i - 1, j - 1) && matfnnn(i - 1, j + 1) && matfnnn(i - 2, j - 2) && matfnnn(i - 2, j + 2))
                if (matfnnn(i - 1, j - 1) && (matfnnn(i - 2, j - 2) || !matf1(i - 1, j - 1)) &&
                        matfnnn(i - 1, j + 1) && (matfnnn(i - 2, j + 2) || !matf1(i - 1, j + 1)))
                    return true;///מחזיר אמת אם אא ללכת לכל הארבע אופציות בחייל
        }
        if (btor2) {
            if (stuckKing(i, j)) return true;
//            if ((matfnnn(i + 1, j + 1) && matfnnn(i + 2, j + 2) || !matf1(i + 1, j + 1)) &&
//                    matfnnn(i + 1, j - 1) && (matfnnn(i + 2, j - 2) || !matf1(i + 1, j - 1)) &&
//                    matfnnn(i - 1, j - 1) && (matfnnn(i - 2, j - 2) || !matf1(i - 1, j - 1)) &&
//                    matfnnn(i - 1, j + 1) && (matfnnn(i - 2, j + 2) || !matf1(i - 1, j + 1)))
//                return true;///מחזיר אמת אם אא ללכת לכל ה 8 אופציות
        }
        return false;
    }
    public boolean matfnnn(int i, int j) {//נחזיר אמת אם אא ללכת לשם או כי מחוץ לגבולות או כי לא ריק- לצורך תיקו
        if (!Limits(i, j))
            return true;
        if (mat[i][j] != eb) return true;return false;
    }
    public void bbb() {////פונקציית השמה - סוג של בנאי
        i1 = s.charAt(1) - 49;
        j1 = s.charAt(0) - 65;
        i2 = s.charAt(s.length() - 1) - 49;
        j2 = s.charAt(s.length() - 2) - 65;}

    public boolean Burn() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (b)
                    if ((mat[i][j] == black && soldierBurned(i, j)) || (mat[i][j] == kb && KingBurned(i, j))) {
                        i3 = i;
                        j3 = j;
                        return true;
                    }
                if (!b)
                    if ((mat[i][j] == white && soldierBurned(i, j)) || (mat[i][j] == kw && KingBurned(i, j))) {
                        i3 = i;
                        j3 = j;
                        return true;}}}return false;}
    public boolean KingBurned(int i2, int j2) {///פונקציית שריפת מלך
        if (mat[i2][j2] != kb && mat[i2][j2] != kw)///אם הוא לא מלך
            return false;
        for (int i = 1; i < 7; i++) {///ריצה עד המקסימום
            if (matfn(i2 + i, j2 + i, eb)) {///מפגש עם הפעם הראשונה שלא ריק או שיש אפשרות אכילה או ברייק כי מיצינו את אפשרויות האכילה =אא לדלג שניים יחד
                if (matf1(i2 + i, j2 + i))
                    if (matf(i2 + i + 1, j2 + i + 1, eb))
                        return true;
                break;
            }
        }
        for (int i = 1; i < 7; i++) {//
            if (matfn(i2 - i, j2 - i, eb)) {//
                if (matf1(i2 - i, j2 - i))
                    if (matf(i2 - i - 1, j2 - i - 1, eb))
                        return true;
                break;}}
        for (int i = 1; i < 7; i++) {//
            if (matfn(i2 + i, j2 - i, eb)) {//
                if (matf1(i2 + i, j2 - i))
                    if (matf(i2 + i + 1, j2 - i - 1, eb))
                        return true;
                break;}}
        for (int i = 1; i < 7; i++) {//
            if (matfn(i2 - i, j2 + i, eb)) {//
                if (matf1(i2 - i, j2 + i))
                    if (matf(i2 - i - 1, j2 + i + 1, eb))
                        return true;
                break;}}
        return false;}
    public boolean soldierBurned(int i, int j) {// //תור נוסף לחייל לצורך שריפה
        if (b) {
            if (matf1(i + 1, j + 1) && matf(i + 2, j + 2, eb))///אם לכיוון הזה יש לו מה לאכול וגם יש לו אחכ ריק
                return true;
            if (matf1(i + 1, j - 1) && matf(i + 2, j - 2, eb))
                return true;}
        if (!b) {
            if (matf1(i - 1, j + 1) && matf(i - 2, j + 2, eb))
                return true;
            if (matf1(i - 1, j - 1) && matf(i - 2, j - 2, eb))
                return true;}
        return false;}

    public boolean kingMoveHunger() {// /פונקצייה למהלך מלך כשלא אוכל
        if (mat[i1][j1] != kb && mat[i1][j1] != kw)//אם הוא לא מלך
            return false;
//        if ((!btor2&&b&&i1>i2)||(!btor2&&!b&&i1<i2))///אם הלך הפוך כשלא תור שני
//            return false;
        if (Math.abs(i2 - i1) != Math.abs(j2 - j1))////בדיקה אם הוא לא באלכסון שלו
            return false;

        if (i2 > i1 && j2 > j1) {
            for (int i = 1; i < Math.abs(i2 - i1); i++) {
                if (mat[i2 - i][j2 - i] != eb)
                    return false;}}

        if (i2 > i1 && j2 < j1) {
            for (int i = 1; i < Math.abs(i2 - i1); i++) {
                if (mat[i2 - i][j2 + i] != eb)
                    return false;}}

        if (i2 < i1 && j2 < j1) {
            for (int i = 1; i < Math.abs(i2 - i1); i++) {
                if (mat[i2 + i][j2 + i] != eb)
                    return false;}}
        if (i2 < i1 && j2 > j1) {
            for (int i = 1; i < Math.abs(i2 - i1); i++) {
                if (mat[i2 + i][j2 - i] != eb)
                    return false;}}
        btorn = false;
        return true;}
    public boolean kingMove() {// /פונקצייה למהלך מלך כשאוכל
        if (mat[i1][j1] != kb && mat[i1][j1] != kw)//אם הוא לא מלך
            return false;
//        if ((!btor2&&b&&i1>i2)||(!btor2&&!b&&i1<i2))///אם הלך הפוך כשלא תור שני
//            return false;
        if (Math.abs(i2 - i1) != Math.abs(j2 - j1))////בדיקה אם הוא לא באלכסון שלו
            return false;

        if (i2 > i1 && j2 > j1) {
            if (!matf1(i2 - 1, j2 - 1))
                return false;
            for (int i = 2; i < Math.abs(i2 - i1); i++) {
                if (mat[i2 - i][j2 - i] != eb)
                    return false;}}
        if (i2 > i1 && j2 < j1) {
            if (!matf1(i2 - 1, j2 + 1))
                return false;
            for (int i = 2; i < Math.abs(i2 - i1); i++) {
                if (mat[i2 - i][j2 + i] != eb)
                    return false;}}
        if (i2 < i1 && j2 < j1) {
            if (!matf1(i2 + 1, j2 + 1))
                return false;
            for (int i = 2; i < Math.abs(i2 - i1); i++) {
                if (mat[i2 + i][j2 + i] != eb)
                    return false;}}
        if (i2 < i1 && j2 > j1) {
            if (!matf1(i2 + 1, j2 - 1))
                return false;
            for (int i = 2; i < Math.abs(i2 - i1); i++) {
                if (mat[i2 + i][j2 - i] != eb)
                    return false;}}
        btorn = true;
        return true;}
    public int avi(){
        i1 = s.charAt(1) - 49;
        j1 = s.charAt(0) - 65;
        i2 = s.charAt(s.length() - 1) - 49;
        j2 = s.charAt(s.length() - 2) - 65;
        if (i1>i2&&j1>j2)return 1;
        if (i1>i2&&j1<j2)return 2;
        if (i1<i2&&j1<j2)return 3;
        if (i1<i2&&j1>j2)return 4;return 0;
    }
    public boolean AnotherTurnk() {///פונקציית תור נוסף של מלך
        if (mat[i2][j2] != kb && mat[i2][j2] != kw)///אם הוא לא מלך
            return false;
        for (int i = 1; i < 7; i++) {///ריצה עד המקסימום
            if (matfn(i2 + i, j2 + i, eb)) {///מפגש עם הפעם הראשונה שלא ריק או שיש אפשרות אכילה או ברייק כי מיצינו את אפשרויות האכילה =אא לדלג שניים יחד
                if (matf1(i2 + i, j2 + i))
                    if (matf(i2 + i + 1, j2 + i + 1, eb))
                        return true;
                break;}}
        for (int i = 1; i < 7; i++) {//
            if (matfn(i2 - i, j2 - i, eb)) {//
                if (matf1(i2 - i, j2 - i))
                    if (matf(i2 - i - 1, j2 - i - 1, eb))
                        return true;
                break;}}
        for (int i = 1; i < 7; i++) {//
            if (matfn(i2 + i, j2 - i, eb)) {//
                if (matf1(i2 + i, j2 - i))
                    if (matf(i2 + i + 1, j2 - i - 1, eb))
                        return true;
                break;}}
        for (int i = 1; i < 7; i++) {//
            if (matfn(i2 - i, j2 + i, eb)) {//
                if (matf1(i2 - i, j2 + i))
                    if (matf(i2 - i - 1, j2 + i + 1, eb))
                        return true;
                break;}}
        return false;}
    public boolean Limits(int i, int j) {// בדיקת גבולות  של I J
        if (i < 0 || i > 7)
            return false;
        if (j < 0 || j > 7)
            return false;
        return true;}
    public boolean LimitsStr() {// בדיקת גבולות  של סטרינג

        if (Limits(i1, j1) && Limits(i2, j2))
            return true;
        return false;}
    public boolean AnotherTurn() {////תור נוסף
        if (matf1(i2 + 1, j2 + 1) && matf(i2 + 2, j2 + 2, eb))///אם לכיוון הזה יש לו מה לאכול וגם יש לו אחכ ריק
            return true;
        if (matf1(i2 - 1, j2 + 1) && matf(i2 - 2, j2 + 2, eb))
            return true;
        if (matf1(i2 - 1, j2 - 1) && matf(i2 - 2, j2 - 2, eb))
            return true;
        if (matf1(i2 + 1, j2 - 1) && matf(i2 + 2, j2 - 2, eb))
            return true;
        return false;}
    public boolean matf(int i, int j, char ch) {///שלב א בדיקת גבולות IJ שלב ב בדיקת התו האם רצוי
        if (!Limits(i, j))
            return false;
        if (mat[i][j] != ch)
            return false;
        return true;}
    public boolean matf1(int i, int j) {///שלב א בדיקת גבולות IJ שלב ב בדיקת התו האם אכיל לפי מצבנו
        if (!Limits(i, j))
            return false;
        if ((b && mat[i][j] == white) || (b && mat[i][j] == kw) || (!b && mat[i][j] == black) || (!b && mat[i][j] == kb))
            return true;
        return false;}
    public boolean matfn(int i, int j, char ch) {///שלב א בדיקת גבולות IJ שלב ב בדיקת התו האם לא רצוי
        if (!Limits(i, j))
            return false;
        if (mat[i][j] != ch)
            return true;
        return false;}
    public boolean oneStep() {//  מה יש באינדקס והאם הלך צעד אחד תקין באלכסון
        if (btor2)///אם הוא בתור שני א"א ללכת צעד בודד רק לאכול
            return false;
        if ((b && i1 == i2 - 1 && j1 == j2 + 1) || (b && i1 == i2 - 1 && j1 == j2 - 1))///צעד אחד תמיד רק קדימה
        {
            btorn = false;
            return true;}
        if (!b && i1 == i2 + 1 && j1 == j2 + 1 || !b && i1 == i2 + 1 && j1 == j2 - 1) {
            btorn = false;
            return true;}
        return false;}
    public boolean twoSteps() {//  מה יש באינדקס והאם הלך 2 צעדים תקינים באלכסון
        if ((!btor2 && b && i1 > i2) || (!btor2 && !b && i1 < i2))///אם הלך הפוך כשלא תור שני
            return false;
        if (Math.abs(i2 - i1) != 2)////אם לא הלך 2 צעדים
            return false;
        if ((b && mat[(i1 + i2) / 2][(j1 + j2) / 2] == white) || (b && mat[(i1 + i2) / 2][(j1 + j2) / 2] == kw))// /אפשר להשתמש בקיצור בפונק  matf1 !!!
        {
            btorn = true;
            return true;}
        if ((!b && mat[(i1 + i2) / 2][(j1 + j2) / 2] == black) || (!b && mat[(i1 + i2) / 2][(j1 + j2) / 2] == kb)) {
            btorn = true;
            return true;}
        return false;}
    public char WhatIs() {///מה יש במיקום הזה!!אפשר לקצר או למחוק
        return mat[i1][j1];
    }
    public boolean BlackWhiteEat() {//האם שחור ולבן תורם לזוז
        char p = WhatIs();
        if ((b && p == black) || (b && p == kb) || (!b && p == white) || (!b && p == kw))
            return true;
        return false;}
    public boolean cameVoid() {///האם בא למקום נכון
        if (mat[i2][j2] != eb) return false;
        return true;}
    public void placement() {//השמה
        if (Burn() && (oneStep() || kingMoveHunger())) {
            System.out.println("נשרף לך חייל");
            mat[i3][j3] = eb;///שריפה
            if (b) {
                bl--;
            }//הורדה במספר את השחקן שנשרף
            else {
                wh--;
            }
//            if (i3==i1&&j3==j1)return;//אם מי שיכל לאכול ונשרף הוא אותו אחד שביקש לצעוד בלי לאכול תעצור כאן//מיותר לכאורה
        }
        mat[i2][j2] = mat[i1][j1];//עשה את המהלך המתבקש
        mat[i1][j1] = eb;
        if (!b && i2 == 0) mat[i2][j2] = kw;////השמה למלכות
        if (b && i2 == 7) mat[i2][j2] = kb;
        if (btorn) {///אם לא הלך צעד אחד אלא יותר וגם לא הלך מלך בלי לאכול
            if (i1 < i2) {///תאכל אחד מתחת איפה שבא
                if (j1 < j2) {
                    mat[i2 - 1][j2 - 1] = eb;
                } else {
                    mat[i2 - 1][j2 + 1] = eb;
                }
            } else if (j1 > j2) {
                mat[i2 + 1][j2 + 1] = eb;
            } else {
                mat[i2 + 1][j2 - 1] = eb;
            }
            if (!b) {
                bl--;
            }///הורדה במספר את השחקן שנאכל
            else {
                wh--;}}}
    public void PrintBoard() {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + "\t");}
            System.out.println();}}}