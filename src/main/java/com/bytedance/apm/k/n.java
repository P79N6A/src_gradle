package com.bytedance.apm.k;

import android.app.PendingIntent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.apm.d;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n {
    public static String a(Object[] objArr) {
        int a2 = b.a(objArr, PendingIntent.class);
        if (a2 >= 0) {
            PendingIntent pendingIntent = objArr[a2];
            if (pendingIntent != null) {
                return f.a(pendingIntent);
            }
        }
        return "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[Catch:{ Exception -> 0x0031 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0015 A[Catch:{ Exception -> 0x0031 }] */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> a(org.json.JSONObject r5, java.lang.String r6) {
        /*
            r0 = 0
            org.json.JSONArray r5 = r5.optJSONArray(r6)     // Catch:{ Exception -> 0x0031 }
            r6 = 0
            if (r5 == 0) goto L_0x0011
            int r1 = r5.length()     // Catch:{ Exception -> 0x0031 }
            if (r1 != 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r1 = 0
            goto L_0x0012
        L_0x0011:
            r1 = 1
        L_0x0012:
            if (r1 == 0) goto L_0x0015
            return r0
        L_0x0015:
            int r1 = r5.length()     // Catch:{ Exception -> 0x0031 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0031 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0031 }
        L_0x001e:
            if (r6 >= r1) goto L_0x0030
            java.lang.String r3 = r5.getString(r6)     // Catch:{ Exception -> 0x0031 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0031 }
            if (r4 != 0) goto L_0x002d
            r2.add(r3)     // Catch:{ Exception -> 0x0031 }
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x001e
        L_0x0030:
            return r2
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.k.n.a(org.json.JSONObject, java.lang.String):java.util.List");
    }

    @Nullable
    public static List<Pattern> b(JSONObject jSONObject, String str) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    String string = optJSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(Pattern.compile(string));
                    }
                }
                return arrayList;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean a(String str, List<String> list) {
        if (i.a(list) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String host = Uri.parse(str).getHost();
            for (String equalsIgnoreCase : list) {
                if (host.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            d.a().a(th, "ParseUtils: isHostEquals");
        }
        return false;
    }

    public static boolean a(String str, List<String> list, List<Pattern> list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!i.a(list)) {
            for (String contains : list) {
                if (str.contains(contains)) {
                    return true;
                }
            }
        }
        try {
            String path = new URI(str).getPath();
            if (!i.a(list2)) {
                for (Pattern matcher : list2) {
                    if (matcher.matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
