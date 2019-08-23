package com.ss.android.ugc.aweme.commerce.preview.refresh;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37638a;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f37639b;

    /* renamed from: c  reason: collision with root package name */
    byte f37640c;

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f37638a, false, 29179, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37638a, false, 29179, new Class[0], Void.TYPE);
            return;
        }
        if (this.f37639b != null) {
            this.f37639b.run();
        }
        this.f37640c = 2;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f37638a, false, 29177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37638a, false, 29177, new Class[0], Void.TYPE);
            return;
        }
        a(null);
    }

    private void a(Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f37638a, false, 29178, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f37638a, false, 29178, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        switch (this.f37640c) {
            case 0:
                this.f37640c = 1;
                run();
                return;
            case 1:
                return;
            case 2:
                b();
                break;
        }
    }
}
