package com.ss.android.ugc.aweme.cloudcontrol.c.a;

import android.app.Activity;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.p;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36235a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36236b;

    /* renamed from: c  reason: collision with root package name */
    private final String f36237c;

    c(String str, String str2) {
        this.f36236b = str;
        this.f36237c = str2;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f36235a, false, 27069, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36235a, false, 27069, new Class[0], Void.TYPE);
            return;
        }
        String str = this.f36236b;
        String str2 = this.f36237c;
        Activity e2 = p.a().e();
        a.a(e2).setTitle((int) C0906R.string.do6).setMessage((CharSequence) str2).setPositiveButton((int) C0906R.string.b4h, (DialogInterface.OnClickListener) new d(str, e2)).setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).show();
    }
}
