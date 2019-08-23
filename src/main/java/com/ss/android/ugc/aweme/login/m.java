package com.ss.android.ugc.aweme.login;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.plugin.c;
import com.ss.android.ugc.aweme.setting.model.AwemeSettings;
import com.ss.android.ugc.aweme.setting.o;

public final /* synthetic */ class m implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53775a;

    /* renamed from: b  reason: collision with root package name */
    static final o.a f53776b = new m();

    private m() {
    }

    public final void a(AwemeSettings awemeSettings) {
        if (PatchProxy.isSupport(new Object[]{awemeSettings}, this, f53775a, false, 56377, new Class[]{AwemeSettings.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeSettings}, this, f53775a, false, 56377, new Class[]{AwemeSettings.class}, Void.TYPE);
            return;
        }
        c.a(d.a());
    }
}
