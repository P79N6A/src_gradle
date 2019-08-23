package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.github.a.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ah {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75494a;

    public static boolean a(char c2) {
        if (!PatchProxy.isSupport(new Object[]{Character.valueOf(c2)}, null, f75494a, true, 88061, new Class[]{Character.TYPE}, Boolean.TYPE)) {
            return Character.isDigit(c2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Character.valueOf(c2)}, null, f75494a, true, 88061, new Class[]{Character.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public static String b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75494a, true, 88066, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f75494a, true, 88066, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                sb.append(a.a(str2.charAt(i)).charAt(0));
            }
            return sb.toString();
        }
    }

    public static String c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f75494a, true, 88067, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f75494a, true, 88067, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            String trim = str.trim();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < trim.length(); i++) {
                sb.append(a.a(trim.charAt(i)));
            }
            return sb.toString();
        }
    }

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75494a, true, 88063, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f75494a, true, 88063, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Matcher matcher = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)").matcher(str2);
        if (!matcher.find() || str2.indexOf(matcher.group()) != 0) {
            return false;
        }
        return true;
    }

    public static boolean b(char c2) {
        if (!PatchProxy.isSupport(new Object[]{Character.valueOf(c2)}, null, f75494a, true, 88062, new Class[]{Character.TYPE}, Boolean.TYPE)) {
            return Pattern.compile("[\\p{P}\\p{S}\\p{Z}]").matcher(String.valueOf(c2)).matches();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Character.valueOf(c2)}, null, f75494a, true, 88062, new Class[]{Character.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public static String d(String str) {
        int i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75494a, true, 88068, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f75494a, true, 88068, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            int i3 = 0;
            while (i2 < 12) {
                if (i3 < str.length()) {
                    if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i3)}, null, f75494a, true, 88069, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
                        i = ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i3)}, null, f75494a, true, 88069, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
                    } else {
                        char charAt = str2.charAt(i3);
                        if (Character.isUpperCase(charAt)) {
                            i = str2.charAt(i3) - 'A';
                        } else if (Character.isLowerCase(charAt)) {
                            i = (str2.charAt(i3) - 'a') + 26;
                            if (i3 == 0) {
                                i -= 26;
                            }
                        } else if (a(charAt)) {
                            i = (str2.charAt(i3) - '0') + 52;
                        } else if (b(charAt)) {
                            i = 62;
                        } else if (a(str2.substring(i3))) {
                            i = 64;
                        } else {
                            i = 63;
                        }
                    }
                } else {
                    i = 0;
                }
                if (i < 10) {
                    sb.append(PushConstants.PUSH_TYPE_NOTIFY);
                }
                if (i == 64) {
                    i3++;
                }
                sb.append(String.valueOf(i));
                i2++;
                i3++;
            }
            return sb.toString();
        }
    }

    public static String a(String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str8}, null, f75494a, true, 88071, new Class[]{String.class, String.class, String.class, String.class}, String.class)) {
            Object[] objArr = {str5, str6, str7, str8};
            return (String) PatchProxy.accessDispatch(objArr, null, f75494a, true, 88071, new Class[]{String.class, String.class, String.class, String.class}, String.class);
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || str5.contains(str8)) {
            return str8;
        } else {
            String lowerCase = c(str4).toLowerCase();
            StringBuilder sb = new StringBuilder();
            int indexOf = str7.indexOf(lowerCase);
            int indexOf2 = str6.indexOf(lowerCase);
            if (indexOf2 != -1) {
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    int length = a.a(str5.charAt(i)).toLowerCase().length() + i3;
                    if (i3 >= indexOf2 && i3 < lowerCase.length() + indexOf2) {
                        sb.append(str5.charAt(i));
                        i2++;
                    } else if (length > indexOf2 && length <= lowerCase.length() + indexOf2) {
                        sb.append(str5.charAt(i));
                        i2++;
                    } else if (indexOf2 > i3 && indexOf2 < length) {
                        sb.append(str5.charAt(i));
                        i2++;
                    }
                    i++;
                    i3 = length;
                }
                i = i2;
            }
            if (indexOf != -1 && lowerCase.length() > i) {
                return str5.substring(indexOf, lowerCase.length() + indexOf);
            }
            if (!TextUtils.isEmpty(sb.toString())) {
                return sb.toString();
            }
            return lowerCase;
        }
    }
}
