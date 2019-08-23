package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.ao;
import kotlinx.coroutines.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\"H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0000X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "handler", "Landroid/os/Handler;", "name", "", "(Landroid/os/Handler;Ljava/lang/String;)V", "invokeImmediately", "", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "_immediate", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "equals", "other", "", "hashCode", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "isDispatchNeeded", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "kotlinx-coroutines-android"}, k = 1, mv = {1, 1, 13})
public final class b extends c implements ao {
    private volatile b _immediate;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final b f83802a;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f83803c;

    /* renamed from: d  reason: collision with root package name */
    private final String f83804d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f83805e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "kotlinx/coroutines/RunnableKt$Runnable$1"}, k = 3, mv = {1, 1, 13})
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f83806a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f83807b;

        public a(b bVar, k kVar) {
            this.f83806a = bVar;
            this.f83807b = kVar;
        }

        public final void run() {
            this.f83807b.a(this.f83806a, Unit.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 13})
    /* renamed from: kotlinx.coroutines.android.b$b  reason: collision with other inner class name */
    static final class C0898b extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ Runnable $block;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0898b(b bVar, Runnable runnable) {
            super(1);
            this.this$0 = bVar;
            this.$block = runnable;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Throwable th) {
            this.this$0.f83803c.removeCallbacks(this.$block);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f83803c);
    }

    @NotNull
    public final String toString() {
        if (this.f83804d == null) {
            String handler = this.f83803c.toString();
            Intrinsics.checkExpressionValueIsNotNull(handler, "handler.toString()");
            return handler;
        } else if (!this.f83805e) {
            return this.f83804d;
        } else {
            return this.f83804d + " [immediate]";
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof b) || ((b) obj).f83803c != this.f83803c) {
            return false;
        }
        return true;
    }

    public final boolean a(@NotNull e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        if (!this.f83805e || (!Intrinsics.areEqual((Object) Looper.myLooper(), (Object) this.f83803c.getLooper()))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
        Intrinsics.checkParameterIsNotNull(handler, "handler");
    }

    public final void a(@NotNull e eVar, @NotNull Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        Intrinsics.checkParameterIsNotNull(runnable, "block");
        this.f83803c.post(runnable);
    }

    public final void a(long j, @NotNull k<? super Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "continuation");
        Runnable aVar = new a(this, kVar);
        this.f83803c.postDelayed(aVar, RangesKt.coerceAtMost(j, 4611686018427387903L));
        kVar.a(new C0898b(this, aVar));
    }

    private b(Handler handler, String str, boolean z) {
        super((byte) 0);
        b bVar;
        this.f83803c = handler;
        this.f83804d = str;
        this.f83805e = z;
        if (this.f83805e) {
            bVar = this;
        } else {
            bVar = null;
        }
        this._immediate = bVar;
        b bVar2 = this._immediate;
        if (bVar2 == null) {
            bVar2 = new b(this.f83803c, this.f83804d, true);
            this._immediate = bVar2;
        }
        this.f83802a = bVar2;
    }
}
