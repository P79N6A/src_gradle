package dmt.av.video;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class z implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83085a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditFragment f83086b;

    z(VEVideoPublishEditFragment vEVideoPublishEditFragment) {
        this.f83086b = vEVideoPublishEditFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f83085a, false, 92064, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f83085a, false, 92064, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VEVideoPublishEditFragment vEVideoPublishEditFragment = this.f83086b;
        w wVar = (w) obj;
        if (wVar.g == 1) {
            vEVideoPublishEditFragment.a(false, wVar.h, wVar.f83077d, wVar.f83078e, wVar.f83079f, wVar.f83075b, wVar.f83076c);
        } else if (wVar.g == 0) {
            vEVideoPublishEditFragment.a(true, wVar.h, wVar.f83077d, wVar.f83078e, wVar.f83079f, wVar.f83075b, wVar.f83076c);
        }
        if (vEVideoPublishEditFragment.f82764e != null) {
            vEVideoPublishEditFragment.f82764e.a(wVar);
        }
    }
}
