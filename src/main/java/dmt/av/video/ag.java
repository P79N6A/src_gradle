package dmt.av.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.m;
import dmt.av.video.ad;

public final /* synthetic */ class ag implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82887a;

    /* renamed from: b  reason: collision with root package name */
    private final ad.AnonymousClass1 f82888b;

    ag(ad.AnonymousClass1 r1) {
        this.f82888b = r1;
    }

    public final void a(int i, int i2, float f2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f82887a, false, 92093, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f82887a, false, 92093, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.f82888b.a(i);
    }
}
