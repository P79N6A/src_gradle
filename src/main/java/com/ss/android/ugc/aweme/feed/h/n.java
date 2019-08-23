package com.ss.android.ugc.aweme.feed.h;

import android.content.Context;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.b;

public final class n extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45511a;

    /* renamed from: b  reason: collision with root package name */
    private Context f45512b;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45511a, false, 42051, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45511a, false, 42051, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        UIUtils.displayToast(this.f45512b, (int) C0906R.string.c3x);
    }

    public n(Context context) {
        this.f45512b = context;
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f45511a, false, 42052, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f45511a, false, 42052, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
    }
}
