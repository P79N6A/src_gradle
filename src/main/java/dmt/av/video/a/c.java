package dmt.av.video.a;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82828a;

    /* renamed from: b  reason: collision with root package name */
    private final a f82829b;

    public c(a aVar) {
        this.f82829b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f82828a, false, 92159, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f82828a, false, 92159, new Class[]{i.class}, Object.class);
        }
        this.f82829b.f82816c.setValue(null);
        return null;
    }
}
