package dmt.av.video.a;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.j;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82830a;

    /* renamed from: b  reason: collision with root package name */
    private final a f82831b;

    /* renamed from: c  reason: collision with root package name */
    private final j f82832c;

    public d(a aVar, j jVar) {
        this.f82831b = aVar;
        this.f82832c = jVar;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f82830a, false, 92160, new Class[]{i.class}, Object.class)) {
            return this.f82831b.a(this.f82832c, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f82830a, false, 92160, new Class[]{i.class}, Object.class);
    }
}
