package com.ss.android.ugc.aweme.crossplatform.platform.rn;

import android.content.Context;
import android.preference.PreferenceManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.AppContext;
import com.ss.android.ugc.aweme.app.AwemeAppData;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40882a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile l f40883c;

    /* renamed from: b  reason: collision with root package name */
    public String f40884b;

    private l() {
        AppContext c2 = AwemeAppData.p().c();
        if (c2 != null) {
            Context context = c2.getContext();
            if (context != null) {
                this.f40884b = PreferenceManager.getDefaultSharedPreferences(context).getString("rn_debug_source_url_safe_host", null);
            }
        }
    }

    public static l a() {
        if (PatchProxy.isSupport(new Object[0], null, f40882a, true, 34364, new Class[0], l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[0], null, f40882a, true, 34364, new Class[0], l.class);
        }
        if (f40883c == null) {
            synchronized (l.class) {
                if (f40883c == null) {
                    f40883c = new l();
                }
            }
        }
        return f40883c;
    }
}
