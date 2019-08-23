package dmt.av.video.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82840a;

    @TargetClass
    @Proxy
    static ExecutorService a() {
        return PatchProxy.isSupport(new Object[0], null, f82840a, true, 92164, new Class[0], ExecutorService.class) ? (ExecutorService) PatchProxy.accessDispatch(new Object[0], null, f82840a, true, 92164, new Class[0], ExecutorService.class) : h.a(m.a(p.FIXED).a(1).a());
    }
}
