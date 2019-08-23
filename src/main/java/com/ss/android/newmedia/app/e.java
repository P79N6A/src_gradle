package com.ss.android.newmedia.app;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Properties;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2502a;

    /* renamed from: d  reason: collision with root package name */
    private static e f2503d;

    /* renamed from: b  reason: collision with root package name */
    private Properties f2504b = new Properties();

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f2505c;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e(android.content.Context r3) {
        /*
            r2 = this;
            r2.<init>()
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r2.f2504b = r0
            org.json.JSONObject r0 = r2.b(r3)     // Catch:{ Exception -> 0x0010 }
            r2.f2505c = r0     // Catch:{ Exception -> 0x0010 }
        L_0x0010:
            java.util.Properties r0 = r2.f2504b     // Catch:{ Exception -> 0x0020 }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ Exception -> 0x0020 }
            java.lang.String r1 = "ss.properties"
            java.io.InputStream r3 = r3.open(r1)     // Catch:{ Exception -> 0x0020 }
            r0.load(r3)     // Catch:{ Exception -> 0x0020 }
            return
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.app.e.<init>(android.content.Context):void");
    }

    public static e a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f2502a, true, 18571, new Class[]{Context.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{context2}, null, f2502a, true, 18571, new Class[]{Context.class}, e.class);
        }
        if (f2503d == null) {
            synchronized (e.class) {
                if (f2503d == null) {
                    f2503d = new e(context2);
                }
            }
        }
        return f2503d;
    }

    private JSONObject b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f2502a, false, 18572, new Class[]{Context.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{context}, this, f2502a, false, 18572, new Class[]{Context.class}, JSONObject.class);
        }
        try {
            String a2 = a.a(c(context), 1903654775);
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a2);
            try {
                if (!a(jSONObject)) {
                    return null;
                }
                return jSONObject;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private String c(Context context) {
        String str;
        if (PatchProxy.isSupport(new Object[]{context}, this, f2502a, false, 18579, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, this, f2502a, false, 18579, new Class[]{Context.class}, String.class);
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            str = applicationInfo.sourceDir;
            return str;
        } catch (Throwable unused) {
            str = null;
        }
    }

    private Object a(String str) {
        Object obj;
        if (PatchProxy.isSupport(new Object[]{str}, this, f2502a, false, 18573, new Class[]{String.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str}, this, f2502a, false, 18573, new Class[]{String.class}, Object.class);
        }
        try {
            if (this.f2505c != null) {
                obj = this.f2505c.get(str);
            } else if (this.f2504b == null || !this.f2504b.containsKey(str)) {
                obj = null;
            } else {
                obj = this.f2504b.get(str);
            }
            Logger.debug();
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f2502a, false, 18578, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f2502a, false, 18578, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(jSONObject2.getString("meta_umeng_channel"))) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final String a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f2502a, false, 18574, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f2502a, false, 18574, new Class[]{String.class, String.class}, String.class);
        }
        Object a2 = a(str);
        if (!(a2 instanceof String)) {
            return str2;
        }
        return (String) a2;
    }
}
