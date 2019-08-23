package com.ss.android.ugc.aweme.app.d;

import com.facebook.d.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34107a;

    public static void a(String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str8}, null, f34107a, true, 23465, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str5, str6, str7, str8};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f34107a, true, 23465, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", b.a().b().toString());
            jSONObject.put("netWorkSpeed", (int) b.a().c());
            jSONObject.put("errorDesc", str7);
            jSONObject.put("errorUrl", str8);
            n.a(str5, str6, jSONObject);
        } catch (Exception unused) {
        }
    }

    public static void a(String str, String str2, String str3, int i, String str4, String str5) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        if (PatchProxy.isSupport(new Object[]{str6, str7, str8, Integer.valueOf(i), str9, str10}, null, f34107a, true, 23466, new Class[]{String.class, String.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str6, str7, str8, Integer.valueOf(i), str9, str10};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f34107a, true, 23466, new Class[]{String.class, String.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", b.a().b().toString());
            jSONObject.put("netWorkSpeed", (int) b.a().c());
            jSONObject.put("errorDesc", str8);
            jSONObject.put("errorCode", String.valueOf(i));
            jSONObject.put("errorUrl", str9);
            jSONObject.put("from", str10);
            n.a(str6, str7, jSONObject);
        } catch (Exception unused) {
        }
    }
}
