package homework.strings;

import homework.strings.StringHW;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringHWTest {
    private static String actual;
    private static String expected;

    @Test
    public void EngLowerCaseReverseTest() {
        actual = StringHW.EngLowerCaseReverse();
        expected = "zyxwvutsrqponmlkjihgfedcba";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EngUpperCaseTest() {
        actual = StringHW.EngUpperCase();
        expected = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RuLowerCaseTest() {
        actual = StringHW.RuLowerCase();
        expected = "абвгдежзийклмнопрстуфхцчшщъыьэюя";
        Assertions.assertArrayEquals(new String[]{expected}, new String[]{actual});
    }

    @Test
    public void test_integer_to_String() {
        actual = StringHW.intToString(5);
        expected = "5";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_double_to_String() {
        actual = StringHW.doubleToStr(5.0);
        expected = "5.0";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_string_to_Integer() {
        int actual = StringHW.stringToInt("5");
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_string_to_Double() {
        double actual = StringHW.strToDouble("5.0");
        double expected = 5.0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_shortestWord() {
        int actual = StringHW.lengthOfSmallestWord("car apple id fox");
        int expected = 2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_add_spaceS() {
        actual = StringHW.addSpaces("cara?apple.id fox");
        expected = "cara? apple. id fox";
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void test_getUniqueChar() {
        String actual = StringHW.getUniqueChar("Five hjh Five bhbh");
        String expected = "Five hjb";
        Assertions.assertEquals(actual, expected);
    }
        @Test
        public void test_amountOfWords() {
            int actual = StringHW.amountOfWords("Five hjh Five bhbh");
            int expected = 4;
            Assertions.assertEquals(actual, expected);
        }
        @Test
        public void test_deletePosition() {
            String actual = StringHW.deletePosition("Five hjh Five bhbh",4,6);
            String expected = "Fiveive bhbh";
            Assertions.assertEquals(actual, expected);
        }
        @Test
        public void test_reverse(){
            String actual = StringHW.reverse("qwertyuiop");
            String expected = "poiuytrewq";
            Assertions.assertEquals(actual, expected);
        }

        @Test
        public void deleteLastWord() {
            String actual = StringHW.deleteLastWord("Five hjh Five bhbh");
            String expected = "Five hjh Five";
            Assertions.assertEquals(actual, expected);
        }

    }