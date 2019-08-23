package com.ss.android.ugc.aweme.im.sdk.arch.adpater;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.util.DiffUtil;
import android.support.v7.util.ListUpdateCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001cB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\tJ\u0015\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u001e\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u0018\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tJ(\u0010\u0019\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/AsyncListDiffer;", "T", "", "mUpdateCallback", "Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/ExtendedListUpdateCallback;", "mConfig", "Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/DifferConfig;", "(Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/ExtendedListUpdateCallback;Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/DifferConfig;)V", "mList", "", "mMainThreadExecutor", "Ljava/util/concurrent/Executor;", "mMaxScheduledGeneration", "", "getCurrentList", "getItem", "position", "(I)Ljava/lang/Object;", "getItemCount", "latchList", "", "newList", "diffResult", "Landroid/support/v7/util/DiffUtil$DiffResult;", "notifyDataSetChanged", "submitList", "callback", "Lkotlin/Function0;", "MainThreadExecutor", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50120a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f50121b;

    /* renamed from: c  reason: collision with root package name */
    public int f50122c;

    /* renamed from: d  reason: collision with root package name */
    List<? extends T> f50123d;

    /* renamed from: e  reason: collision with root package name */
    final ExtendedListUpdateCallback f50124e;

    /* renamed from: f  reason: collision with root package name */
    public final c<T> f50125f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/AsyncListDiffer$MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "()V", "handler", "Landroid/os/Handler;", "execute", "", "command", "Ljava/lang/Runnable;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.a$a  reason: collision with other inner class name */
    public static final class C0594a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50126a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f50127b = new Handler(Looper.getMainLooper());

        public final void execute(@Nullable Runnable runnable) {
            Runnable runnable2 = runnable;
            if (PatchProxy.isSupport(new Object[]{runnable2}, this, f50126a, false, 50147, new Class[]{Runnable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{runnable2}, this, f50126a, false, 50147, new Class[]{Runnable.class}, Void.TYPE);
                return;
            }
            this.f50127b.post(runnable2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50128a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f50129b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f50130c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f50131d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f50132e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Function0 f50133f;

        b(a aVar, List list, List list2, int i, Function0 function0) {
            this.f50129b = aVar;
            this.f50130c = list;
            this.f50131d = list2;
            this.f50132e = i;
            this.f50133f = function0;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f50128a, false, 50148, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50128a, false, 50148, new Class[0], Void.TYPE);
                return;
            }
            final DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new AsyncListDiffer$submitList$1$result$1(this));
            Intrinsics.checkExpressionValueIsNotNull(calculateDiff, "DiffUtil.calculateDiff(o…                       })");
            this.f50129b.f50121b.execute(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50134a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f50135b;

                {
                    this.f50135b = r1;
                }

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f50134a, false, 50149, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50134a, false, 50149, new Class[0], Void.TYPE);
                        return;
                    }
                    if (this.f50135b.f50129b.f50122c == this.f50135b.f50132e) {
                        a aVar = this.f50135b.f50129b;
                        List<? extends T> list = this.f50135b.f50131d;
                        DiffUtil.DiffResult diffResult = calculateDiff;
                        if (PatchProxy.isSupport(new Object[]{list, diffResult}, aVar, a.f50120a, false, 50146, new Class[]{List.class, DiffUtil.DiffResult.class}, Void.TYPE)) {
                            a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{list, diffResult}, aVar2, a.f50120a, false, 50146, new Class[]{List.class, DiffUtil.DiffResult.class}, Void.TYPE);
                        } else {
                            aVar.f50123d = list;
                            diffResult.dispatchUpdatesTo((ListUpdateCallback) aVar.f50124e);
                        }
                    }
                    Function0 function0 = this.f50135b.f50133f;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
        }
    }

    public a(@NotNull ExtendedListUpdateCallback extendedListUpdateCallback, @NotNull c<T> cVar) {
        Intrinsics.checkParameterIsNotNull(extendedListUpdateCallback, "mUpdateCallback");
        Intrinsics.checkParameterIsNotNull(cVar, "mConfig");
        this.f50124e = extendedListUpdateCallback;
        this.f50125f = cVar;
        this.f50121b = this.f50125f.f50140c == null ? new C0594a() : this.f50125f.f50140c;
    }
}
