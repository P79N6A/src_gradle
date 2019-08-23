package dmt.av.video.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.j;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82833a;

    /* renamed from: b  reason: collision with root package name */
    private final a f82834b;

    /* renamed from: c  reason: collision with root package name */
    private final j f82835c;

    /* renamed from: d  reason: collision with root package name */
    private final j f82836d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f82837e;

    public e(a aVar, j jVar, j jVar2, boolean z) {
        this.f82834b = aVar;
        this.f82835c = jVar;
        this.f82836d = jVar2;
        this.f82837e = z;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f82833a, false, 92161, new Class[0], Object.class)) {
            return this.f82834b.a(this.f82835c, this.f82836d, this.f82837e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f82833a, false, 92161, new Class[0], Object.class);
    }
}
