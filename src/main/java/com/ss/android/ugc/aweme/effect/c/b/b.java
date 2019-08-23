package com.ss.android.ugc.aweme.effect.c.b;

import android.support.annotation.IntRange;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007J\u001a\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&J\u0006\u0010'\u001a\u00020\u0019J\u0010\u0010(\u001a\u00020$2\b\b\u0001\u0010)\u001a\u00020\u0019J\u001c\u0010*\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H$J\u001c\u0010+\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0014J\b\u0010,\u001a\u00020\u000fH\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u00028\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u0004\u0018\u00018\u0001X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/persistence/task/SerialTask;", "Param", "Target", "", "mTaskId", "", "mParam", "(Ljava/lang/String;Ljava/lang/Object;)V", "error", "Lcom/ss/android/ugc/aweme/effect/persistence/task/TaskExceptionWrapper;", "getError", "()Lcom/ss/android/ugc/aweme/effect/persistence/task/TaskExceptionWrapper;", "setError", "(Lcom/ss/android/ugc/aweme/effect/persistence/task/TaskExceptionWrapper;)V", "isHighPriority", "", "()Z", "setHighPriority", "(Z)V", "getMParam", "()Ljava/lang/Object;", "setMParam", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "mRetryCount", "", "getMRetryCount", "()I", "setMRetryCount", "(I)V", "mState", "Ljava/util/concurrent/atomic/AtomicInteger;", "result", "getResult", "setResult", "exec", "", "callback", "Lcom/ss/android/ugc/aweme/effect/persistence/callback/ISerialTaskExecCallback;", "getTaskState", "markState", "state", "onExec", "onSkip", "shouldSkip", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class b<Param, Target> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43728a;

    /* renamed from: b  reason: collision with root package name */
    public int f43729b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f43730c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public Target f43731d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public e f43732e;

    /* renamed from: f  reason: collision with root package name */
    public Param f43733f;
    private AtomicInteger g = new AtomicInteger(-1);
    private String h;

    public abstract void a(@NotNull com.ss.android.ugc.aweme.effect.c.a.b<Param, Target> bVar);

    public boolean a() {
        return false;
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f43728a, false, 38901, new Class[0], Integer.TYPE)) {
            return this.g.get();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43728a, false, 38901, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(@IntRange(from = 0, to = 4) int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43728a, false, 38900, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43728a, false, 38900, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.set(i);
    }

    public void b(@NotNull com.ss.android.ugc.aweme.effect.c.a.b<Param, Target> bVar) {
        com.ss.android.ugc.aweme.effect.c.a.b<Param, Target> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f43728a, false, 38899, new Class[]{com.ss.android.ugc.aweme.effect.c.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f43728a, false, 38899, new Class[]{com.ss.android.ugc.aweme.effect.c.a.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "callback");
        bVar2.b(this);
    }

    public b(@NotNull String str, Param param) {
        Intrinsics.checkParameterIsNotNull(str, "mTaskId");
        this.h = str;
        this.f43733f = param;
        a(0);
    }
}
