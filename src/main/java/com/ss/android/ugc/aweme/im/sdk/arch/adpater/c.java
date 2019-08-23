package com.ss.android.ugc.aweme.im.sdk.arch.adpater;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000eB'\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/DifferConfig;", "T", "", "diffCallback", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "backgroundThreadExecutor", "Ljava/util/concurrent/Executor;", "mainThreadExecutor", "(Landroid/support/v7/util/DiffUtil$ItemCallback;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V", "getBackgroundThreadExecutor", "()Ljava/util/concurrent/Executor;", "getDiffCallback", "()Landroid/support/v7/util/DiffUtil$ItemCallback;", "getMainThreadExecutor", "Builder", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c<T> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final DiffUtil.ItemCallback<T> f50138a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Executor f50139b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final Executor f50140c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0001\u000eB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\f\u001a\u00020\u0007J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\f\u001a\u00020\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/DifferConfig$Builder;", "T", "", "mDiffCallback", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "(Landroid/support/v7/util/DiffUtil$ItemCallback;)V", "mBackgroundThreadExecutor", "Ljava/util/concurrent/Executor;", "mMainThreadExecutor", "build", "Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/DifferConfig;", "setBackgroundThreadExecutor", "executor", "setMainThreadExecutor", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50141a;

        /* renamed from: d  reason: collision with root package name */
        public static final C0595a f50142d = new C0595a((byte) 0);

        /* renamed from: f  reason: collision with root package name */
        private static final Object f50143f = new Object();
        private static Executor g;

        /* renamed from: b  reason: collision with root package name */
        Executor f50144b;

        /* renamed from: c  reason: collision with root package name */
        Executor f50145c;

        /* renamed from: e  reason: collision with root package name */
        private final DiffUtil.ItemCallback<T> f50146e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/DifferConfig$Builder$Companion;", "", "()V", "sDiffExecutor", "Ljava/util/concurrent/Executor;", "sExecutorLock", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.c$a$a  reason: collision with other inner class name */
        public static final class C0595a {
            private C0595a() {
            }

            public /* synthetic */ C0595a(byte b2) {
                this();
            }
        }

        @NotNull
        public final c<T> a() {
            if (PatchProxy.isSupport(new Object[0], this, f50141a, false, 50168, new Class[0], c.class)) {
                return (c) PatchProxy.accessDispatch(new Object[0], this, f50141a, false, 50168, new Class[0], c.class);
            }
            if (this.f50145c == null) {
                synchronized (f50143f) {
                    if (g == null) {
                        g = d.a(2);
                    }
                }
                this.f50145c = g;
            }
            DiffUtil.ItemCallback<T> itemCallback = this.f50146e;
            Executor executor = this.f50145c;
            if (executor == null) {
                Intrinsics.throwNpe();
            }
            return new c<>(itemCallback, executor, this.f50144b, (byte) 0);
        }

        public a(@NotNull DiffUtil.ItemCallback<T> itemCallback) {
            Intrinsics.checkParameterIsNotNull(itemCallback, "mDiffCallback");
            this.f50146e = itemCallback;
        }
    }

    private c(DiffUtil.ItemCallback<T> itemCallback, Executor executor, Executor executor2) {
        this.f50138a = itemCallback;
        this.f50139b = executor;
        this.f50140c = executor2;
    }

    public /* synthetic */ c(DiffUtil.ItemCallback itemCallback, Executor executor, Executor executor2, byte b2) {
        this(itemCallback, executor, executor2);
    }
}
