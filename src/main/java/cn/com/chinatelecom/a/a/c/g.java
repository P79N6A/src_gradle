package cn.com.chinatelecom.a.a.c;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1692a = "g";

    public static String a(Map<String, String> map) {
        return a(map, "&");
    }

    public static String c(String str, String str2) {
        try {
            return a.c(str, str2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(String str, String str2) {
        byte[] bArr;
        try {
            String a2 = i.a(i.b(str2));
            if (str != null) {
                if (a2 != null) {
                    byte[] a3 = i.a(str);
                    byte[] a4 = i.a(a2);
                    if (!(a3 == null || a3.length == 0)) {
                        if (a4 != null) {
                            bArr = j.a(j.a(j.a(a3, false), j.a(a4, false)), true);
                            return new String(bArr, "UTF-8");
                        }
                    }
                    bArr = null;
                    return new String(bArr, "UTF-8");
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        if (map != null && !map.isEmpty()) {
            if (TextUtils.isEmpty(str)) {
                str = "&";
            }
            for (Map.Entry next : map.entrySet()) {
                sb.append((String) next.getKey());
                sb.append("=");
                sb.append((String) next.getValue());
                sb.append(str);
            }
            sb = sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String a(String str, String str2) {
        byte[] bArr;
        try {
            String a2 = i.a(i.b(str2));
            if (str != null) {
                if (a2 != null) {
                    byte[] bytes = str.getBytes("UTF-8");
                    byte[] a3 = i.a(a2);
                    if (!(bytes == null || bytes.length == 0)) {
                        if (a3 != null) {
                            int[] a4 = j.a(bytes, true);
                            int[] a5 = j.a(a3, false);
                            int length = a4.length - 1;
                            if (length > 0) {
                                if (a5.length < 4) {
                                    int[] iArr = new int[4];
                                    System.arraycopy(a5, 0, iArr, 0, a5.length);
                                    a5 = iArr;
                                }
                                int i = (52 / (length + 1)) + 6;
                                int i2 = a4[length];
                                int i3 = 0;
                                while (true) {
                                    int i4 = i - 1;
                                    if (i <= 0) {
                                        break;
                                    }
                                    i3 -= 1640531527;
                                    int i5 = (i3 >>> 2) & 3;
                                    int i6 = i2;
                                    int i7 = 0;
                                    while (i7 < length) {
                                        int i8 = i7 + 1;
                                        int i9 = a4[i8];
                                        i6 = ((((i6 >>> 5) ^ (i9 << 2)) + ((i9 >>> 3) ^ (i6 << 4))) ^ ((i9 ^ i3) + (i6 ^ a5[(i7 & 3) ^ i5]))) + a4[i7];
                                        a4[i7] = i6;
                                        i7 = i8;
                                    }
                                    int i10 = a4[0];
                                    i2 = a4[length] + ((((i6 >>> 5) ^ (i10 << 2)) + ((i10 >>> 3) ^ (i6 << 4))) ^ ((i10 ^ i3) + (a5[i5 ^ (i7 & 3)] ^ i6)));
                                    a4[length] = i2;
                                    i = i4;
                                }
                            }
                            bArr = j.a(a4, false);
                            return i.a(bArr);
                        }
                    }
                    bArr = null;
                    return i.a(bArr);
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String b(Map<String, String> map, String str) {
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, String>>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            }
        });
        String str2 = "";
        while (arrayList.iterator().hasNext()) {
            str2 = str2 + ((String) ((Map.Entry) r0.next()).getValue());
        }
        return f.a(f.a(str2, str));
    }

    public static String a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        return a(c(str, str2, str3, str4, str5, map));
    }

    public static String b(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                hashMap.put((String) next.getKey(), (String) next.getValue());
            }
        }
        hashMap.put("clientId", str4);
        hashMap.put("clientType", str);
        hashMap.put("format", str2);
        hashMap.put("version", str3);
        hashMap.put("sign", b((Map<String, String>) hashMap, str5));
        return a(hashMap);
    }

    private static HashMap<String, String> c(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        String str6;
        if (map == null || map.isEmpty()) {
            str6 = "";
        } else {
            str6 = a(a(map), str5);
        }
        String a2 = f.a(f.a(str4 + str + str2 + str3 + str6, str5));
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("appId", str4);
        hashMap.put("clientType", str);
        hashMap.put("format", str2);
        hashMap.put("version", str3);
        hashMap.put("paras", str6);
        hashMap.put("sign", a2);
        return hashMap;
    }
}
