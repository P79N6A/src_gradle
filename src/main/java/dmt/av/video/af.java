package dmt.av.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.m;

public final /* synthetic */ class af implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82885a;

    /* renamed from: b  reason: collision with root package name */
    private final ad f82886b;

    af(ad adVar) {
        this.f82886b = adVar;
    }

    public final void a(int i, int i2, float f2, String str) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f82885a, false, 92091, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f82885a, false, 92091, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
            return;
        }
        ad adVar = this.f82886b;
        if (i == 4119 && !adVar.z) {
            if (i2 == 1) {
                z = true;
            }
            adVar.a(z, true);
        }
    }
}
