package dmt.av.video;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.n.a;

public final /* synthetic */ class ae implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82883a;

    /* renamed from: b  reason: collision with root package name */
    private final ad f82884b;

    ae(ad adVar) {
        this.f82884b = adVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f82883a, false, 92090, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f82883a, false, 92090, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f82884b.A.a((a) obj);
    }
}
