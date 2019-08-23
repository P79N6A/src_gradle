package com.ss.android.ugc.aweme.login;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.plugin.c;
import com.ss.android.ugc.aweme.setting.model.AwemeSettings;
import com.ss.android.ugc.aweme.setting.o;

public final /* synthetic */ class l implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53773a;

    /* renamed from: b  reason: collision with root package name */
    static final o.a f53774b = new l();

    private l() {
    }

    public final void a(AwemeSettings awemeSettings) {
        if (PatchProxy.isSupport(new Object[]{awemeSettings}, this, f53773a, false, 56376, new Class[]{AwemeSettings.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeSettings}, this, f53773a, false, 56376, new Class[]{AwemeSettings.class}, Void.TYPE);
            return;
        }
        c.a(d.a());
    }
}
