package com.ss.android.ugc.aweme.video.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.framework.e.g;
import com.ss.android.ugc.playerkit.a.b;

public final /* synthetic */ class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76058a;

    /* renamed from: b  reason: collision with root package name */
    static final b f76059b = new e();

    private e() {
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f76058a, false, 89333, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f76058a, false, 89333, new Class[]{String.class}, Void.TYPE);
            return;
        }
        g.a(i.a().getContext(), str2);
    }
}
