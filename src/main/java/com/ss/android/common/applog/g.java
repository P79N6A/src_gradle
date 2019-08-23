package com.ss.android.common.applog;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.AppContext;
import com.ss.android.ugc.aweme.q.c;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28152a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f28153b = true;
    private static g l;

    /* renamed from: c  reason: collision with root package name */
    public String f28154c = "";

    /* renamed from: d  reason: collision with root package name */
    String f28155d = "";

    /* renamed from: e  reason: collision with root package name */
    long f28156e = -1;

    /* renamed from: f  reason: collision with root package name */
    int f28157f = -1;
    long g = -1;
    public boolean h;
    public boolean i;
    public AtomicBoolean j = new AtomicBoolean(false);
    WeakReference<Context> k;

    public final JSONObject b() {
        if (PatchProxy.isSupport(new Object[0], this, f28152a, false, 15486, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f28152a, false, 15486, new Class[0], JSONObject.class);
        } else if (StringUtils.isEmpty(this.f28155d)) {
            return null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!StringUtils.isEmpty(this.f28155d)) {
                    jSONObject.put("system_record_channel", this.f28155d);
                }
            } catch (Exception unused) {
            }
            return jSONObject;
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f28152a, false, 15493, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28152a, false, 15493, new Class[0], Void.TYPE);
            return;
        }
        Logger.debug();
        try {
            File file = new File("/system/app");
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (File file2 : listFiles) {
                    if (file2.exists() && i2 < 5) {
                        arrayList.add(Long.valueOf(file2.lastModified() / 1000));
                        i2++;
                    }
                }
                Collections.sort(arrayList);
                this.g = ((Long) arrayList.get(arrayList.size() / 2)).longValue();
                Logger.debug();
            }
        } catch (Exception unused) {
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f28152a, false, 15495, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28152a, false, 15495, new Class[0], Void.TYPE);
        } else if (this.k.get() != null) {
            Context context = (Context) this.k.get();
            JSONObject a2 = a(context).a();
            if (a2 != null) {
                try {
                    Logger.debug();
                    synchronized ("custom_channels") {
                        a2.put("has_send_app_info", this.h);
                        SharedPreferences.Editor edit = c.a(context, "custom_channels", 0).edit();
                        edit.putString("app_install_info", a2.toString());
                        SharedPrefsEditorCompat.apply(edit);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f28152a, false, 15496, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28152a, false, 15496, new Class[0], Void.TYPE);
        } else if (this.k.get() != null) {
            Context context = (Context) this.k.get();
            try {
                synchronized ("custom_channels") {
                    JSONObject jSONObject = new JSONObject(c.a(context, "custom_channels", 0).getString("app_install_info", ""));
                    a(context).a(jSONObject);
                    Logger.debug();
                    this.h = jSONObject.optBoolean("has_send_app_info", false);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final JSONObject a() {
        if (PatchProxy.isSupport(new Object[0], this, f28152a, false, 15485, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f28152a, false, 15485, new Class[0], JSONObject.class);
        } else if (StringUtils.isEmpty(this.f28154c) && StringUtils.isEmpty(this.f28155d) && this.f28156e == -1 && this.f28157f == -1 && this.g == -1) {
            return null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!StringUtils.isEmpty(this.f28154c)) {
                    jSONObject.put("app_channel", this.f28154c);
                }
                if (!StringUtils.isEmpty(this.f28155d)) {
                    jSONObject.put("system_record_channel", this.f28155d);
                }
                if (this.f28156e != -1) {
                    jSONObject.put("apk_create_time", this.f28156e);
                }
                if (this.f28157f != -1) {
                    jSONObject.put("apk_shuffix_num", this.f28157f);
                }
                if (this.g != -1) {
                    jSONObject.put("system_create_time", this.g);
                }
            } catch (Exception unused) {
            }
            return jSONObject;
        }
    }

    private g(Context context) {
        this.k = new WeakReference<>(context.getApplicationContext());
    }

    static long a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f28152a, true, 15494, new Class[]{String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, null, f28152a, true, 15494, new Class[]{String.class}, Long.TYPE)).longValue();
        }
        long j2 = -1;
        if (StringUtils.isEmpty(str)) {
            return -1;
        }
        try {
            File file = new File(str2);
            if (file.exists()) {
                j2 = file.lastModified();
            }
        } catch (Exception unused) {
        }
        return j2;
    }

    public static g a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f28152a, true, 15483, new Class[]{Context.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{context2}, null, f28152a, true, 15483, new Class[]{Context.class}, g.class);
        }
        if (l == null) {
            synchronized (g.class) {
                if (l == null) {
                    l = new g(context2);
                }
            }
        }
        return l;
    }

    private void a(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f28152a, false, 15484, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f28152a, false, 15484, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            this.f28154c = jSONObject.optString("app_channel", "");
            this.f28155d = jSONObject.optString("system_record_channel", "");
            this.f28156e = jSONObject.optLong("apk_create_time", -1);
            this.f28157f = jSONObject.optInt("apk_shuffix_num", -1);
            this.g = jSONObject.optLong("system_create_time", -1);
        } catch (Exception unused) {
        }
    }

    public final void a(AppContext appContext) {
        if (PatchProxy.isSupport(new Object[]{appContext}, this, f28152a, false, 15489, new Class[]{AppContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appContext}, this, f28152a, false, 15489, new Class[]{AppContext.class}, Void.TYPE);
        } else if (appContext != null) {
            this.f28154c = appContext.getChannel();
            d();
        }
    }
}
