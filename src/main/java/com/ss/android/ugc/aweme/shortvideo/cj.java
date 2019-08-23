package com.ss.android.ugc.aweme.shortvideo;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class cj implements s<at> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66012a;

    /* renamed from: b  reason: collision with root package name */
    s<at> f66013b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f66014c = new Handler(Looper.getMainLooper());

    cj(s<at> sVar) {
        this.f66013b = sVar;
    }

    public final void a(at atVar) {
        if (PatchProxy.isSupport(new Object[]{atVar}, this, f66012a, false, 74215, new Class[]{at.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{atVar}, this, f66012a, false, 74215, new Class[]{at.class}, Void.TYPE);
            return;
        }
        this.f66014c.post(new cl(this, atVar));
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66012a, false, 74214, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66012a, false, 74214, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f66013b.a(i);
        } else {
            this.f66014c.post(new ck(this, i));
        }
    }

    public final void a(hn hnVar) {
        if (PatchProxy.isSupport(new Object[]{hnVar}, this, f66012a, false, 74216, new Class[]{hn.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hnVar}, this, f66012a, false, 74216, new Class[]{hn.class}, Void.TYPE);
            return;
        }
        this.f66014c.post(new cm(this, hnVar));
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f66012a, false, 74217, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f66012a, false, 74217, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f66014c.post(new cn(this, str));
    }
}
