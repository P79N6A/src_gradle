package com.loc;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    static HashSet<String> f25845a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    public static byte[] f25846b = "FDF1F436161AEF5B".getBytes();

    /* renamed from: c  reason: collision with root package name */
    public static byte[] f25847c = "0102030405060708".getBytes();

    /* renamed from: d  reason: collision with root package name */
    public static String f25848d = "SOCRASH";

    /* renamed from: f  reason: collision with root package name */
    static final String f25849f = "SOCRASH";

    /* renamed from: e  reason: collision with root package name */
    File[] f25850e;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f25851a;

        /* renamed from: b  reason: collision with root package name */
        public String f25852b;

        /* renamed from: c  reason: collision with root package name */
        public String f25853c;

        /* renamed from: d  reason: collision with root package name */
        public String f25854d;

        /* renamed from: e  reason: collision with root package name */
        public String f25855e;

        public a() {
        }

        private a(String str, String str2, String str3, String str4, String str5) {
            this.f25851a = str;
            this.f25852b = str2;
            this.f25853c = str3;
            this.f25854d = str4;
            this.f25855e = str5;
        }

        public static List<a> a(String str) {
            if (TextUtils.isEmpty(str)) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(b(jSONArray.getString(i)));
                }
            } catch (Throwable th) {
                com.google.a.a.a.a.a.a.b(th);
            }
            return arrayList;
        }

        private static a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return new a();
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a(jSONObject.optString("mk", ""), jSONObject.optString("ak", ""), jSONObject.optString("bk", ""), jSONObject.optString("ik", ""), jSONObject.optString("nk", ""));
                return aVar;
            } catch (Throwable unused) {
                return new a();
            }
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        int f25856a;

        /* renamed from: b  reason: collision with root package name */
        String f25857b;
    }

    static void a(Context context, byte[] bArr) {
        if (context != null) {
            try {
                String str = new String(bArr, "ISO-8859-1");
                if (str.indexOf("{\"") > 0 && str.indexOf("\"}") > 0) {
                    JSONObject jSONObject = new JSONObject(str.substring(str.indexOf("{\""), str.lastIndexOf("\"}") + 2));
                    String optString = jSONObject.optString("ik");
                    String optString2 = jSONObject.optString("jk");
                    if (!TextUtils.isEmpty(optString2)) {
                        List<a> a2 = a.a(optString);
                        for (int i = 0; i < a2.size(); i++) {
                            a aVar = a2.get(i);
                            if (optString2.contains(aVar.f25855e)) {
                                a(context, aVar);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                com.google.a.a.a.a.a.a.b(th);
            }
        }
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr.length != 16) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    static byte[] a(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            byte[] a2 = dd.a("a1f5886b7153004c5c99559f5261676f".getBytes(), bArr, "nFy1THrhajaZzz8U".getBytes());
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[(a2.length - 16)];
            System.arraycopy(a2, 0, bArr2, 0, 16);
            System.arraycopy(a2, 16, bArr3, 0, a2.length - 16);
            return !a(de.a(bArr3, "MD5"), bArr2) ? new byte[0] : bArr3;
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean a(List<b> list, String str) {
        for (b next : list) {
            if (next.f25857b.equals(str)) {
                next.f25856a++;
                return true;
            }
        }
        return false;
    }

    private static void a(Context context, a aVar) throws JSONException {
        if (!TextUtils.isEmpty(aVar.f25852b) && !TextUtils.isEmpty(aVar.f25853c) && !TextUtils.isEmpty(aVar.f25854d)) {
            int i = 0;
            SharedPreferences a2 = c.a(context, de.b("SO_DYNAMIC_FILE_KEY"), 0);
            String string = a2.getString("SO_ERROR_KEY", "");
            if (string.length() % 2 != 0) {
                string = PushConstants.PUSH_TYPE_NOTIFY.concat(String.valueOf(string));
            }
            byte[] bArr = new byte[(string.length() / 2)];
            for (int i2 = 0; i2 < bArr.length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) Integer.parseInt(string.substring(i3, i3 + 2), 16);
            }
            JSONArray jSONArray = new JSONArray(di.a(dj.b(bArr)));
            while (i < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (!jSONObject.opt("mk").equals(aVar.f25851a) || !jSONObject.opt("ak").equals(aVar.f25852b) || !jSONObject.opt("bk").equals(aVar.f25853c) || !jSONObject.opt("ik").equals(aVar.f25854d) || !jSONObject.opt("nk").equals(aVar.f25855e)) {
                    i++;
                } else {
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("mk", aVar.f25851a);
            jSONObject2.putOpt("ak", aVar.f25852b);
            jSONObject2.putOpt("bk", aVar.f25853c);
            jSONObject2.putOpt("ik", aVar.f25854d);
            jSONObject2.putOpt("nk", aVar.f25855e);
            jSONArray.put(jSONObject2);
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("SO_ERROR_KEY", di.g(dj.a(di.a(jSONArray.toString()))));
            edit.commit();
        }
    }
}
