package com.ss.android.pushmanager.a;

import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.a;
import com.ss.android.message.b.k;
import com.ss.android.message.j;
import com.ss.android.pushmanager.f;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30480a = null;

    /* renamed from: b  reason: collision with root package name */
    public static a f30481b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f30482c = true;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f30483d;

    static Looper b() {
        if (PatchProxy.isSupport(new Object[0], null, f30480a, true, 19106, new Class[0], Looper.class)) {
            return (Looper) PatchProxy.accessDispatch(new Object[0], null, f30480a, true, 19106, new Class[0], Looper.class);
        }
        Looper looper = j.a().f2493b;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        return looper;
    }

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f30480a, true, 19102, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f30480a, true, 19102, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (f30483d == null) {
            f30483d = Boolean.valueOf(k.d(a.a()));
        }
        if (f30482c && f30483d.booleanValue()) {
            z = true;
        }
        return z;
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObject2;
        if (PatchProxy.isSupport(new Object[]{jSONObject3, jSONObject4}, null, f30480a, true, 19105, new Class[]{JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject3, jSONObject4}, null, f30480a, true, 19105, new Class[]{JSONObject.class, JSONObject.class}, Void.TYPE);
        } else if (jSONObject4 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    jSONObject3.put(next, jSONObject4.get(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    static void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2 = str;
        JSONObject jSONObject4 = jSONObject;
        JSONObject jSONObject5 = jSONObject2;
        JSONObject jSONObject6 = jSONObject3;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject4, jSONObject5, jSONObject6}, null, f30480a, true, 19103, new Class[]{String.class, JSONObject.class, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {str2, jSONObject4, jSONObject5, jSONObject6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f30480a, true, 19103, new Class[]{String.class, JSONObject.class, JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        b(str, jSONObject, jSONObject2, jSONObject3);
        if (f30481b != null) {
            f30481b.a(str2, jSONObject4, jSONObject5, jSONObject6);
        }
    }

    private static void b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2 = str;
        JSONObject jSONObject4 = jSONObject;
        JSONObject jSONObject5 = jSONObject2;
        JSONObject jSONObject6 = jSONObject3;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject4, jSONObject5, jSONObject6}, null, f30480a, true, 19104, new Class[]{String.class, JSONObject.class, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {str2, jSONObject4, jSONObject5, jSONObject6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f30480a, true, 19104, new Class[]{String.class, JSONObject.class, JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject7 = new JSONObject();
        a(jSONObject7, jSONObject4);
        a(jSONObject7, jSONObject5);
        a(jSONObject7, jSONObject6);
        f.a().a(str2, jSONObject7);
    }
}
