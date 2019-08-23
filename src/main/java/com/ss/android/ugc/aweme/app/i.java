package com.ss.android.ugc.aweme.app;

import android.app.Application;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.AppContext;
import com.ss.android.g.a;
import com.ss.android.newmedia.app.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.awemepushapi.b;

public class i implements AppContext, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2653a;
    private static i m;

    /* renamed from: b  reason: collision with root package name */
    public Application f2654b;

    /* renamed from: c  reason: collision with root package name */
    String f2655c = "unknown";

    /* renamed from: d  reason: collision with root package name */
    String f2656d;

    /* renamed from: e  reason: collision with root package name */
    String f2657e;

    /* renamed from: f  reason: collision with root package name */
    int f2658f = -1;
    int g = -1;
    int h = -1;
    String i = "";
    private String j;
    private boolean k;
    private String l;

    public static String b() {
        return "1128";
    }

    public String getAbClient() {
        return null;
    }

    public String getAbFeature() {
        return null;
    }

    public long getAbFlag() {
        return 0;
    }

    public String getAbGroup() {
        return null;
    }

    public int getAid() {
        return 1128;
    }

    public String getAppName() {
        return "aweme";
    }

    public String getFeedbackAppKey() {
        return "aweme-android";
    }

    public Context getContext() {
        return this.f2654b;
    }

    public String getManifestVersion() {
        return this.i;
    }

    public int getManifestVersionCode() {
        return this.h;
    }

    public int getUpdateVersionCode() {
        return this.g;
    }

    public String getVersion() {
        return this.f2657e;
    }

    public int getVersionCode() {
        return this.f2658f;
    }

    public String getTweakedChannel() {
        if (this.f2656d != null) {
            return this.f2656d;
        }
        return this.f2655c;
    }

    private i() {
    }

    public static i a() {
        if (PatchProxy.isSupport(new Object[0], null, f2653a, true, 22253, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], null, f2653a, true, 22253, new Class[0], i.class);
        }
        if (m == null) {
            synchronized (i.class) {
                if (m == null) {
                    m = new i();
                }
            }
        }
        return m;
    }

    public String getAbVersion() {
        if (PatchProxy.isSupport(new Object[0], this, f2653a, false, 22258, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2653a, false, 22258, new Class[0], String.class);
        } else if (a.a()) {
            return this.f2657e;
        } else {
            return null;
        }
    }

    @Deprecated
    public String getDeviceId() {
        if (this.j != null) {
            return this.j;
        }
        try {
            this.j = ((TelephonyManager) this.f2654b.getSystemService("phone")).getDeviceId();
        } catch (Exception unused) {
        }
        if (this.j == null) {
            this.j = "";
        }
        return this.j;
    }

    public String getStringAppName() {
        if (PatchProxy.isSupport(new Object[0], this, f2653a, false, 22256, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2653a, false, 22256, new Class[0], String.class);
        }
        if (TextUtils.isEmpty(this.l)) {
            try {
                this.l = this.f2654b.getString(C0906R.string.ak);
            } catch (Throwable unused) {
            }
        }
        return this.l;
    }

    public String getChannel() {
        if (PatchProxy.isSupport(new Object[0], this, f2653a, false, 22257, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2653a, false, 22257, new Class[0], String.class);
        }
        if (!this.k) {
            this.k = true;
            String str = null;
            try {
                str = e.a((Context) this.f2654b).a("meta_umeng_channel", "");
            } catch (Exception unused) {
            }
            if (str != null && str.length() > 0) {
                this.f2655c = str;
            }
        }
        return this.f2655c;
    }
}
