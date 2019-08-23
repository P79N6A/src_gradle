package com.ss.android.ugc.aweme.setting;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.model.RetryPolicyItem;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64008a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f64009b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static int f64010c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static int f64011d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static int f64012e = 10800000;
    private static r g = new r();

    /* renamed from: f  reason: collision with root package name */
    public SparseArray<RetryPolicyItem> f64013f = new SparseArray<>(4);

    public interface a {
        void b();
    }

    public static r a() {
        return g;
    }

    private r() {
    }

    public final void a(int i, a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aVar2}, this, f64008a, false, 72075, new Class[]{Integer.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aVar2}, this, f64008a, false, 72075, new Class[]{Integer.TYPE, a.class}, Void.TYPE);
            return;
        }
        this.f64013f.put(i, new RetryPolicyItem(true, System.currentTimeMillis(), aVar2));
    }

    public final void a(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f64008a, false, 72080, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f64008a, false, 72080, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.f64013f.get(i) != null) {
            this.f64013f.get(i).lastResponseTime = System.currentTimeMillis();
            this.f64013f.get(i).isLoadSuccess = z;
            if (z) {
                this.f64013f.get(i).retryCount = 0;
            }
        }
    }
}
