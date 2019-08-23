package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.ies.g.b;
import com.bytedance.ies.geckoclient.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class y implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53492a;

    /* renamed from: b  reason: collision with root package name */
    static final b f53493b = new y();

    private y() {
    }

    public final boolean a(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f53492a, false, 55862, new Class[]{String.class}, Boolean.TYPE)) {
            return f.c(str);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f53492a, false, 55862, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }
}
