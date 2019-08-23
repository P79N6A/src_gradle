package dmt.av.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83031a;

    /* renamed from: b  reason: collision with root package name */
    private final ad f83032b;

    l(ad adVar) {
        this.f83032b = adVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f83031a, false, 91977, new Class[0], Object.class)) {
            return this.f83032b.q.k();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f83031a, false, 91977, new Class[0], Object.class);
    }
}
