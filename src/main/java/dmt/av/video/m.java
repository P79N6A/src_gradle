package dmt.av.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.k;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83033a;

    /* renamed from: b  reason: collision with root package name */
    private final k.AnonymousClass1.AnonymousClass2 f83034b;

    /* renamed from: c  reason: collision with root package name */
    private final int f83035c;

    /* renamed from: d  reason: collision with root package name */
    private final int f83036d;

    /* renamed from: e  reason: collision with root package name */
    private final float f83037e;

    m(k.AnonymousClass1.AnonymousClass2 r1, int i, int i2, float f2) {
        this.f83034b = r1;
        this.f83035c = i;
        this.f83036d = i2;
        this.f83037e = f2;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f83033a, false, 91978, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f83033a, false, 91978, new Class[0], Object.class);
        }
        k.AnonymousClass1.AnonymousClass2 r0 = this.f83034b;
        int i = this.f83035c;
        int i2 = this.f83036d;
        float f2 = this.f83037e;
        List<String> list = k.this.f83013c;
        list.add("type:" + i + " ext:" + i2 + " f:" + f2);
        return null;
    }
}
