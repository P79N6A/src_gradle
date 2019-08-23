package kotlinx.coroutines;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class cf {
    @TargetClass
    @Proxy
    static ScheduledExecutorService a(int i, ThreadFactory threadFactory) {
        return (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(i).a(threadFactory).a());
    }
}
