package com.ss.android.ugc.aweme.plugin.ui;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59377a;

    /* renamed from: b  reason: collision with root package name */
    public static final IPluginService.a f59378b = new C0668a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.plugin.ui.a$a  reason: collision with other inner class name */
    static class C0668a implements IPluginService.a {
        public final void a(String str) {
        }

        public final void b(String str) {
        }

        private C0668a() {
        }

        /* synthetic */ C0668a(byte b2) {
            this();
        }
    }

    public static boolean a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f59377a, true, 64663, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f59377a, true, 64663, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        SharedPreferences a2 = c.a(context2, "plugin_visit_log", 0);
        boolean z = a2.getBoolean(str2, false);
        try {
            a2.edit().putBoolean(str2, true).apply();
        } catch (Throwable unused) {
        }
        if (!z) {
            return true;
        }
        return false;
    }
}
