package dmt.av.video.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.j;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82823a;

    /* renamed from: b  reason: collision with root package name */
    private final a f82824b;

    /* renamed from: c  reason: collision with root package name */
    private final j f82825c;

    /* renamed from: d  reason: collision with root package name */
    private final j f82826d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f82827e;

    public b(a aVar, j jVar, j jVar2, boolean z) {
        this.f82824b = aVar;
        this.f82825c = jVar;
        this.f82826d = jVar2;
        this.f82827e = z;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f82823a, false, 92158, new Class[0], Object.class)) {
            return this.f82824b.b(this.f82825c, this.f82826d, this.f82827e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f82823a, false, 92158, new Class[0], Object.class);
    }
}
