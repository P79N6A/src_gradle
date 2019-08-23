package com.bytedance.common.utility;

import android.text.TextUtils;
import android.util.Base64;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.UnsupportedEncodingException;
import java.lang.Character;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

public class StringUtils {
    public static boolean isEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static String strEncode(String str) {
        if (!isEmpty(str)) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return str;
    }

    public static String trimString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.trim();
    }

    public static String clean(String str) {
        int indexOf = str.indexOf(34);
        int lastIndexOf = str.lastIndexOf(34);
        if (indexOf < 0 || lastIndexOf <= indexOf) {
            return str;
        }
        return str.substring(indexOf + 1, lastIndexOf).trim();
    }

    public static String getShortDateTime(String str) {
        int indexOf = str.indexOf(45) + 1;
        int lastIndexOf = str.lastIndexOf(58);
        if (indexOf <= 0 || lastIndexOf <= 0) {
            return str;
        }
        return str.substring(indexOf, lastIndexOf);
    }

    public static String encryptWithXor(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5);
            }
            return DigestUtils.toHexString(bytes, 0, bytes.length);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String handleAdClickTrackUrl(String str) {
        if (isEmpty(str)) {
            return str;
        }
        try {
            String replace = str.replace("[ss_random]", String.valueOf(new Random().nextLong()));
            try {
                return replace.replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return replace;
            }
        } catch (Exception unused2) {
            return str;
        }
    }

    public static boolean isChinese(char c2) {
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c2);
        if (of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.GENERAL_PUNCTUATION || of == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || of == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
            return true;
        }
        return false;
    }

    public static String mapToString(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                String str = map.get(next);
                if (!isEmpty(next) && !isEmpty(str)) {
                    jSONObject.put(next, str);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String removeBlank(String str) {
        if (isEmpty(str)) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }

    public static String toDBC(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (isChinese(charArray[i])) {
                if (charArray[i] == 12288) {
                    charArray[i] = ' ';
                } else if (charArray[i] > 65280 && charArray[i] < 65375) {
                    charArray[i] = (char) (charArray[i] - 65248);
                }
            }
        }
        return new String(charArray);
    }

    public static String toSBC(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                charArray[i] = 12288;
            } else if (charArray[i] < 127 && charArray[i] > ' ') {
                charArray[i] = (char) (charArray[i] + 65248);
            }
        }
        return new String(charArray);
    }

    public static String bytesToHuman(long j) {
        long[] jArr = {1099511627776L, 1073741824, 1048576, 1024, 1};
        int i = 0;
        String[] strArr = {"TB", "GB", "MB", "KB", "B"};
        if (j < 1) {
            return "0 " + strArr[4];
        }
        String str = null;
        while (true) {
            if (i >= 5) {
                break;
            }
            long j2 = jArr[i];
            if (j >= j2) {
                str = format(j, j2, strArr[i]);
                break;
            }
            i++;
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A[SYNTHETIC, Splitter:B:21:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042 A[Catch:{ Throwable -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004a A[SYNTHETIC, Splitter:B:31:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004f A[Catch:{ Throwable -> 0x0052 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String compressWithGzip(java.lang.String r5) throws java.io.IOException {
        /*
            boolean r0 = isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0046, all -> 0x0038 }
            int r2 = r5.length()     // Catch:{ Throwable -> 0x0046, all -> 0x0038 }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0046, all -> 0x0038 }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ Throwable -> 0x0036, all -> 0x0033 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x0036, all -> 0x0033 }
            byte[] r5 = r5.getBytes()     // Catch:{ Throwable -> 0x0048, all -> 0x0031 }
            r2.write(r5)     // Catch:{ Throwable -> 0x0048, all -> 0x0031 }
            r2.close()     // Catch:{ Throwable -> 0x0048, all -> 0x0031 }
            byte[] r5 = r0.toByteArray()     // Catch:{ Throwable -> 0x0048, all -> 0x0031 }
            r3 = 0
            int r4 = r5.length     // Catch:{ Throwable -> 0x0048, all -> 0x0031 }
            java.lang.String r5 = com.bytedance.common.utility.DigestUtils.toHexString(r5, r3, r4)     // Catch:{ Throwable -> 0x0048, all -> 0x0031 }
            r2.close()     // Catch:{ Throwable -> 0x0030 }
            r0.close()     // Catch:{ Throwable -> 0x0030 }
        L_0x0030:
            return r5
        L_0x0031:
            r5 = move-exception
            goto L_0x003b
        L_0x0033:
            r5 = move-exception
            r2 = r1
            goto L_0x003b
        L_0x0036:
            r2 = r1
            goto L_0x0048
        L_0x0038:
            r5 = move-exception
            r0 = r1
            r2 = r0
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            r2.close()     // Catch:{ Throwable -> 0x0045 }
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            r0.close()     // Catch:{ Throwable -> 0x0045 }
        L_0x0045:
            throw r5
        L_0x0046:
            r0 = r1
            r2 = r0
        L_0x0048:
            if (r2 == 0) goto L_0x004d
            r2.close()     // Catch:{ Throwable -> 0x0052 }
        L_0x004d:
            if (r0 == 0) goto L_0x0052
            r0.close()     // Catch:{ Throwable -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.StringUtils.compressWithGzip(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0059 A[SYNTHETIC, Splitter:B:33:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005e A[Catch:{ Throwable -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0063 A[Catch:{ Throwable -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006c A[SYNTHETIC, Splitter:B:45:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0071 A[Catch:{ Throwable -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0076 A[Catch:{ Throwable -> 0x0079 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String decompressWithGzip(java.lang.String r6) throws java.io.IOException {
        /*
            boolean r0 = isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            byte[] r6 = com.bytedance.common.utility.DigestUtils.hexStringToBytes(r6)     // Catch:{ Throwable -> 0x0067, all -> 0x0054 }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ Throwable -> 0x0067, all -> 0x0054 }
            r0.<init>(r6)     // Catch:{ Throwable -> 0x0067, all -> 0x0054 }
            java.util.zip.GZIPInputStream r6 = new java.util.zip.GZIPInputStream     // Catch:{ Throwable -> 0x0051, all -> 0x004d }
            r6.<init>(r0)     // Catch:{ Throwable -> 0x0051, all -> 0x004d }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x004b, all -> 0x0045 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x004b, all -> 0x0045 }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r6, r4)     // Catch:{ Throwable -> 0x004b, all -> 0x0045 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x004b, all -> 0x0045 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x006a, all -> 0x003f }
            r3.<init>()     // Catch:{ Throwable -> 0x006a, all -> 0x003f }
        L_0x0027:
            java.lang.String r4 = r2.readLine()     // Catch:{ Throwable -> 0x006a, all -> 0x003f }
            if (r4 == 0) goto L_0x0031
            r3.append(r4)     // Catch:{ Throwable -> 0x006a, all -> 0x003f }
            goto L_0x0027
        L_0x0031:
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x006a, all -> 0x003f }
            r2.close()     // Catch:{ Throwable -> 0x003e }
            r6.close()     // Catch:{ Throwable -> 0x003e }
            r0.close()     // Catch:{ Throwable -> 0x003e }
        L_0x003e:
            return r3
        L_0x003f:
            r1 = move-exception
            r5 = r0
            r0 = r6
            r6 = r1
            r1 = r2
            goto L_0x0049
        L_0x0045:
            r2 = move-exception
            r5 = r0
            r0 = r6
            r6 = r2
        L_0x0049:
            r2 = r5
            goto L_0x0057
        L_0x004b:
            r2 = r1
            goto L_0x006a
        L_0x004d:
            r6 = move-exception
            r2 = r0
            r0 = r1
            goto L_0x0057
        L_0x0051:
            r6 = r1
            r2 = r6
            goto L_0x006a
        L_0x0054:
            r6 = move-exception
            r0 = r1
            r2 = r0
        L_0x0057:
            if (r1 == 0) goto L_0x005c
            r1.close()     // Catch:{ Throwable -> 0x0066 }
        L_0x005c:
            if (r0 == 0) goto L_0x0061
            r0.close()     // Catch:{ Throwable -> 0x0066 }
        L_0x0061:
            if (r2 == 0) goto L_0x0066
            r2.close()     // Catch:{ Throwable -> 0x0066 }
        L_0x0066:
            throw r6
        L_0x0067:
            r6 = r1
            r0 = r6
            r2 = r0
        L_0x006a:
            if (r2 == 0) goto L_0x006f
            r2.close()     // Catch:{ Throwable -> 0x0079 }
        L_0x006f:
            if (r6 == 0) goto L_0x0074
            r6.close()     // Catch:{ Throwable -> 0x0079 }
        L_0x0074:
            if (r0 == 0) goto L_0x0079
            r0.close()     // Catch:{ Throwable -> 0x0079 }
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.StringUtils.decompressWithGzip(java.lang.String):java.lang.String");
    }

    public static HashMap<String, String> parseResponse(String str) {
        String[] split = str.substring(str.indexOf(123) + 1, str.lastIndexOf(125)).split(",");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].trim();
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (String split2 : split) {
            String[] split3 = split2.split(":", 2);
            hashMap.put(clean(split3[0]), clean(split3[1]));
        }
        return hashMap;
    }

    public static boolean equal(String str, String str2) {
        if ((!isEmpty(str) || !isEmpty(str2)) && (str == null || !str.equals(str2))) {
            return false;
        }
        return true;
    }

    public static String decryptWithXor(String str, Boolean... boolArr) {
        byte[] bArr;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (boolArr == null || boolArr.length <= 0 || !boolArr[0].booleanValue()) {
                bArr = DigestUtils.hexStringToBytes(str);
            } else {
                bArr = Base64.decode(str, 0);
            }
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ 5);
            }
            return new String(bArr, 0, bArr.length, "UTF-8");
        } catch (Exception unused) {
            return str;
        }
    }

    public static String ellipsize(String str, int i) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= str.length()) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt <= 0 || charAt > 255) {
                i3 += 2;
            } else {
                i3++;
            }
            if (i3 > i) {
                sb.append("...");
                break;
            }
            sb.append(charAt);
            i2++;
        }
        return sb.toString();
    }

    public static Map<String, String> stringToMap(String str, Map<String, String> map) {
        if (isEmpty(str) || map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                if (!isEmpty(next) && !isEmpty(string)) {
                    map.put(next, string);
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    private static String format(long j, long j2, String str) {
        double d2;
        if (j2 > 1) {
            double d3 = (double) j;
            double d4 = (double) j2;
            Double.isNaN(d3);
            Double.isNaN(d4);
            d2 = d3 / d4;
        } else {
            d2 = (double) j;
        }
        return new DecimalFormat("#.##").format(d2) + " " + str;
    }

    public static void escapeEcmaScript(StringBuilder sb, String str, boolean z) {
        if (z) {
            sb.append("\"");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case 8:
                    sb.append("\\b");
                    break;
                case 9:
                    sb.append("\\t");
                    break;
                case 10:
                    sb.append("\\n");
                    break;
                case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                    sb.append("\\f");
                    break;
                case 13:
                    sb.append("\\r");
                    break;
                case '\"':
                case '\\':
                    sb.append('\\');
                    sb.append(charAt);
                    break;
                case 8232:
                case 8233:
                    sb.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                    break;
                default:
                    if (charAt > 31) {
                        sb.append(charAt);
                        break;
                    } else {
                        sb.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                        break;
                    }
            }
        }
        if (z) {
            sb.append("\"");
        }
    }
}
