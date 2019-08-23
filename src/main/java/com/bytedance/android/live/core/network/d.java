package com.bytedance.android.live.core.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7860a;

    /* renamed from: d  reason: collision with root package name */
    public static final d f7861d = new d(a.RUNNING, null);

    /* renamed from: e  reason: collision with root package name */
    public static final d f7862e = new d(a.SUCCESS, null);

    /* renamed from: b  reason: collision with root package name */
    public a f7863b;

    /* renamed from: c  reason: collision with root package name */
    public Throwable f7864c;

    public enum a {
        RUNNING(0),
        SUCCESS(1),
        FAILED(-1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int mStatus;

        private a(int i) {
            this.mStatus = i;
        }
    }

    public final boolean a() {
        if (this.f7863b == a.RUNNING) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f7863b == a.FAILED) {
            return true;
        }
        return false;
    }

    public static d a(Throwable th) {
        Throwable th2 = th;
        if (!PatchProxy.isSupport(new Object[]{th2}, null, f7860a, true, 409, new Class[]{Throwable.class}, d.class)) {
            return new d(a.FAILED, th2);
        }
        return (d) PatchProxy.accessDispatch(new Object[]{th2}, null, f7860a, true, 409, new Class[]{Throwable.class}, d.class);
    }

    private d(a aVar, Throwable th) {
        this.f7863b = aVar;
        this.f7864c = th;
    }
}
