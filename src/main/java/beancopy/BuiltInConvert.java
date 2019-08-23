package beancopy;

import com.squareup.wire.WireEnum;

public class BuiltInConvert {
    public static boolean Boolean2Z(Boolean bool) {
        return Boolean2Z(bool, false);
    }

    public static char Character2C(Character ch) {
        return Character2C(ch, 0);
    }

    public static double Double2D(Double d2) {
        return Double2D(d2, 0.0d);
    }

    public static float Float2F(Float f2) {
        return Float2F(f2, 0.0f);
    }

    public static int Integer2I(Integer num) {
        return Integer2I(num, 0);
    }

    public static long Long2J(Long l) {
        return Long2J(l, 0);
    }

    public static short Short2S(Short sh) {
        return Short2S(sh, 0);
    }

    public static byte Byte2B(Byte b2, byte b3) {
        if (b2 == null) {
            return b3;
        }
        return b2.byteValue();
    }

    public static float Double2F(Double d2, float f2) {
        if (d2 == null) {
            return f2;
        }
        return d2.floatValue();
    }

    public static int Double2I(Double d2, int i) {
        if (d2 == null) {
            return i;
        }
        return d2.intValue();
    }

    public static long Double2J(Double d2, long j) {
        if (d2 == null) {
            return j;
        }
        return d2.longValue();
    }

    public static double Float2D(Float f2, double d2) {
        if (f2 == null) {
            return d2;
        }
        return f2.doubleValue();
    }

    public static long Integer2J(Integer num, long j) {
        if (num == null) {
            return j;
        }
        return num.longValue();
    }

    public static int WireEnum2I(WireEnum wireEnum, int i) {
        if (wireEnum == null) {
            return i;
        }
        return wireEnum.getValue();
    }

    public static int Boolean2I(Boolean bool, int i) {
        if (bool == null) {
            return i;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 0;
    }

    public static boolean Boolean2Z(Boolean bool, boolean z) {
        if (bool == null) {
            return z;
        }
        return bool.booleanValue();
    }

    public static char Character2C(Character ch, char c2) {
        if (ch == null) {
            return c2;
        }
        return ch.charValue();
    }

    public static double Double2D(Double d2, double d3) {
        if (d2 == null) {
            return d3;
        }
        return d2.doubleValue();
    }

    public static Float Double2Float(Double d2, float f2) {
        if (d2 != null) {
            f2 = d2.floatValue();
        }
        return Float.valueOf(f2);
    }

    public static Integer Double2Integer(Double d2, Integer num) {
        int i;
        if (d2 == null) {
            i = num.intValue();
        } else {
            i = d2.intValue();
        }
        return Integer.valueOf(i);
    }

    public static Long Double2Long(Double d2, Long l) {
        long j;
        if (d2 == null) {
            j = l.longValue();
        } else {
            j = d2.longValue();
        }
        return Long.valueOf(j);
    }

    public static Double Float2Double(Float f2, Double d2) {
        double d3;
        if (f2 == null) {
            d3 = d2.doubleValue();
        } else {
            d3 = f2.doubleValue();
        }
        return Double.valueOf(d3);
    }

    public static float Float2F(Float f2, float f3) {
        if (f2 == null) {
            return f3;
        }
        return f2.floatValue();
    }

    public static int Integer2I(Integer num, int i) {
        if (num == null) {
            return i;
        }
        return num.intValue();
    }

    public static Long Integer2Long(Integer num, Long l) {
        long j;
        if (num == null) {
            j = l.longValue();
        } else {
            j = num.longValue();
        }
        return Long.valueOf(j);
    }

    public static boolean Integer2Z(Integer num, boolean z) {
        if (num == null) {
            return z;
        }
        if (num.intValue() != 0) {
            return true;
        }
        return false;
    }

    public static long Long2J(Long l, long j) {
        if (l == null) {
            return j;
        }
        return l.longValue();
    }

    public static String Number2String(Byte b2, String str) {
        if (b2 == null) {
            return str;
        }
        return String.valueOf(b2.byteValue());
    }

    public static short Short2S(Short sh, short s) {
        if (sh == null) {
            return s;
        }
        return sh.shortValue();
    }

    public static Integer WireEnum2Integer(WireEnum wireEnum, Integer num) {
        int i;
        if (wireEnum == null) {
            i = num.intValue();
        } else {
            i = wireEnum.getValue();
        }
        return Integer.valueOf(i);
    }

    public static long WireEnum2J(WireEnum wireEnum, long j) {
        if (wireEnum == null) {
            return j;
        }
        return (long) wireEnum.getValue();
    }

    public static boolean WireEnum2Z(WireEnum wireEnum, boolean z) {
        if (wireEnum == null) {
            return z;
        }
        if (wireEnum.getValue() != 0) {
            return true;
        }
        return false;
    }

    public static String Number2String(Double d2, String str) {
        if (d2 == null) {
            return str;
        }
        return String.valueOf(d2.doubleValue());
    }

    public static Long WireEnum2Long(WireEnum wireEnum, Long l) {
        long j;
        if (wireEnum == null) {
            j = l.longValue();
        } else {
            j = (long) wireEnum.getValue();
        }
        return Long.valueOf(j);
    }

    public static String Number2String(Float f2, String str) {
        if (f2 == null) {
            return str;
        }
        return String.valueOf(f2.floatValue());
    }

    public static String Number2String(Integer num, String str) {
        if (num == null) {
            return str;
        }
        return String.valueOf(num.intValue());
    }

    public static String Number2String(Short sh, String str) {
        if (sh == null) {
            return str;
        }
        return String.valueOf(sh.shortValue());
    }
}
