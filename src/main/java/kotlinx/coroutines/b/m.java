package kotlinx.coroutines.b;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.u;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u00068\u0000X\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\u00068\u0000X\u0004¢\u0006\u0002\n\u0000\"\u0012\u0010\n\u001a\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"BLOCKING_DEFAULT_PARALLELISM", "", "CORE_POOL_SIZE", "DEFAULT_SCHEDULER_NAME", "", "IDLE_WORKER_KEEP_ALIVE_NS", "", "MAX_POOL_SIZE", "QUEUE_SIZE_OFFLOAD_THRESHOLD", "WORK_STEALING_TIME_RESOLUTION_NS", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/TimeSource;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class m {
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public static final long f83863a = u.a("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public static final int f83864b = u.a("kotlinx.coroutines.scheduler.offload.threshold", 96, 0, (int) SearchJediMixFeedAdapter.f42517f, 4);
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public static final int f83865c = u.a("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12);
    @JvmField

    /* renamed from: d  reason: collision with root package name */
    public static final int f83866d = u.a("kotlinx.coroutines.scheduler.core.pool.size", RangesKt.coerceAtLeast(u.a(), 2), 1, 0, 8);
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public static final int f83867e = u.a("kotlinx.coroutines.scheduler.max.pool.size", RangesKt.coerceIn(u.a() * SearchJediMixFeedAdapter.f42517f, f83866d, 2097150), 0, 2097150, 4);
    @JvmField

    /* renamed from: f  reason: collision with root package name */
    public static final long f83868f = TimeUnit.SECONDS.toNanos(u.a("kotlinx.coroutines.scheduler.keep.alive.sec", 5, 1, Long.MAX_VALUE));
    @NotNull
    @JvmField
    public static n g = g.f83858a;
}
