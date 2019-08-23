package com.alipay.sdk.g;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public a f5503a;

    /* renamed from: b  reason: collision with root package name */
    public String f5504b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f5505c;

    public static List<b> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        String optString = jSONObject.optString("name", "");
        String[] strArr = null;
        if (!TextUtils.isEmpty(optString)) {
            strArr = optString.split(";");
        }
        for (int i = 0; i < strArr.length; i++) {
            a a2 = a.a(strArr[i]);
            if (a2 != a.None) {
                b bVar = new b(strArr[i], a2);
                bVar.f5505c = a(strArr[i]);
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private static String[] a(String str) {
        ArrayList arrayList = new ArrayList();
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf == -1 || lastIndexOf == -1 || lastIndexOf <= indexOf) {
            return null;
        }
        String[] split = str.substring(indexOf + 1, lastIndexOf).split(",");
        if (split != null) {
            for (int i = 0; i < split.length; i++) {
                if (!TextUtils.isEmpty(split[i])) {
                    arrayList.add(split[i].trim().replaceAll("'", "").replaceAll("\"", ""));
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private b(String str, a aVar) {
        this.f5504b = str;
        this.f5503a = aVar;
    }
}
