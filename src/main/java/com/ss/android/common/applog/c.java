package com.ss.android.common.applog;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.AppContext;
import com.ss.android.d.d;

public class c implements d.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28129a;

    /* renamed from: b  reason: collision with root package name */
    private static c f28130b;

    class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28131a;

        /* renamed from: b  reason: collision with root package name */
        public int f28132b;

        /* renamed from: c  reason: collision with root package name */
        public String f28133c;

        /* renamed from: d  reason: collision with root package name */
        public String f28134d;

        /* renamed from: e  reason: collision with root package name */
        public String f28135e;

        /* access modifiers changed from: package-private */
        public final boolean a(a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f28131a, false, 15280, new Class[]{a.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f28131a, false, 15280, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
            } else if (aVar != null && this.f28132b == aVar.f28132b && TextUtils.equals(this.f28133c, aVar.f28133c) && TextUtils.equals(this.f28134d, aVar.f28134d) && TextUtils.equals(this.f28135e, aVar.f28135e)) {
                return true;
            } else {
                return false;
            }
        }

        private a(int i, String str, String str2, String str3) {
            this.f28132b = i;
            this.f28133c = str;
            this.f28134d = str2;
            this.f28135e = str3;
        }

        /* synthetic */ a(c cVar, int i, String str, String str2, String str3, byte b2) {
            this(i, str, str2, str3);
        }
    }

    private c() {
    }

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f28129a, true, 15268, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f28129a, true, 15268, new Class[0], c.class);
        }
        if (f28130b == null) {
            synchronized (c.class) {
                if (f28130b == null) {
                    f28130b = new c();
                }
            }
        }
        return f28130b;
    }

    private boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f28129a, false, 15274, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f28129a, false, 15274, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return d().a(e());
    }

    private a d() {
        if (PatchProxy.isSupport(new Object[0], this, f28129a, false, 15277, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f28129a, false, 15277, new Class[0], a.class);
        }
        String installId = AppLog.getInstallId();
        String serverDeviceId = AppLog.getServerDeviceId();
        AppContext appContext = AppLog.getAppContext();
        a aVar = new a(this, appContext.getVersionCode(), appContext.getTweakedChannel(), installId, serverDeviceId, (byte) 0);
        return aVar;
    }

    private a e() {
        if (PatchProxy.isSupport(new Object[0], this, f28129a, false, 15278, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f28129a, false, 15278, new Class[0], a.class);
        }
        SharedPreferences c2 = c("applog_api_cache");
        if (c2 == null) {
            return null;
        }
        a aVar = new a(this, c2.getInt("app_version", -1), c2.getString("channel", ""), c2.getString("iid", ""), c2.getString("did", ""), (byte) 0);
        return aVar;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f28129a, false, 15275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28129a, false, 15275, new Class[0], Void.TYPE);
            return;
        }
        a(d());
    }

    public final String b(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f28129a, false, 15271, new Class[]{String.class}, String.class)) {
            return a(str);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f28129a, false, 15271, new Class[]{String.class}, String.class);
    }

    private void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f28129a, false, 15276, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f28129a, false, 15276, new Class[]{a.class}, Void.TYPE);
            return;
        }
        SharedPreferences c2 = c("applog_api_cache");
        if (c2 != null) {
            c2.edit().putInt("app_version", aVar2.f28132b).putString("channel", aVar2.f28133c).putString("iid", aVar2.f28134d).putString("did", aVar2.f28135e).apply();
        }
    }

    public final SharedPreferences c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f28129a, false, 15279, new Class[]{String.class}, SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[]{str2}, this, f28129a, false, 15279, new Class[]{String.class}, SharedPreferences.class);
        } else if (AppLog.getAppContext() == null || AppLog.getAppContext().getContext() == null) {
            return null;
        } else {
            return com.ss.android.ugc.aweme.q.c.a(AppLog.getAppContext().getContext(), str2, 0);
        }
    }

    public final String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f28129a, false, 15270, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f28129a, false, 15270, new Class[]{String.class}, String.class);
        } else if (!TextUtils.isEmpty(str) && c()) {
            return a(str2, "is_activated", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } else {
            return str2;
        }
    }

    public final String a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f28129a, false, 15272, new Class[]{String.class, String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f28129a, false, 15272, new Class[]{String.class, String.class, String.class}, String.class);
        }
        StringBuilder sb = new StringBuilder(str4);
        if (str4.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(str5);
        sb.append("=");
        sb.append(str6);
        return sb.toString();
    }
}
