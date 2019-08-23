package com.ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0001/B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020!H\u0007J\u0010\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'H\u0007J\b\u0010(\u001a\u00020!H\u0007J\b\u0010)\u001a\u00020!H\u0007J\u0010\u0010*\u001a\u00020!2\b\b\u0002\u0010+\u001a\u00020\tJ\u000e\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\u001dJ\u0006\u0010.\u001a\u00020!R\u000e\u0010\b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/feature/NoOperateModeController;", "Lcom/bytedance/common/utility/collection/WeakHandler$IHandler;", "Landroid/arch/lifecycle/LifecycleObserver;", "activity", "Landroid/support/v4/app/FragmentActivity;", "rootView", "Landroid/view/View;", "(Landroid/support/v4/app/FragmentActivity;Landroid/view/View;)V", "MAX_TIME", "", "NO_OPERATION_TIME", "getActivity", "()Landroid/support/v4/app/FragmentActivity;", "isNoOperateMode", "", "()Z", "setNoOperateMode", "(Z)V", "isTrackingTouch", "setTrackingTouch", "mEnterNoOperationMode", "Ljava/lang/Runnable;", "mHandler", "Lcom/bytedance/common/utility/collection/WeakHandler;", "getMHandler", "()Lcom/bytedance/common/utility/collection/WeakHandler;", "setMHandler", "(Lcom/bytedance/common/utility/collection/WeakHandler;)V", "mNoOperationCallback", "Lcom/ss/android/ugc/aweme/longvideo/feature/NoOperateModeController$NoOperationCallback;", "getRootView", "()Landroid/view/View;", "handleMsg", "", "msg", "Landroid/os/Message;", "onDestroy", "onOperateEvent", "event", "Lcom/ss/android/ugc/aweme/longvideo/event/OperateEvent;", "onPause", "onResume", "reckonByTime", "time", "setNoOperationCallback", "noOperationCallback", "stopTime", "NoOperationCallback", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class NoOperateModeController implements LifecycleObserver, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3467a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public WeakHandler f3468b = new WeakHandler(this);

    /* renamed from: c  reason: collision with root package name */
    public a f3469c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3470d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3471e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final FragmentActivity f3472f;
    @NotNull
    public final View g;
    private final long h = 5000;
    private final long i = 60000;
    private final Runnable j = new b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/feature/NoOperateModeController$NoOperationCallback;", "", "enterNoOperationMode", "", "exitNoOperationMode", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void m();

        void n();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53920a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NoOperateModeController f53921b;

        b(NoOperateModeController noOperateModeController) {
            this.f53921b = noOperateModeController;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f53920a, false, 56704, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53920a, false, 56704, new Class[0], Void.TYPE);
                return;
            }
            a aVar = this.f53921b.f3469c;
            if (aVar != null) {
                aVar.m();
            }
            this.f53921b.f3470d = true;
        }
    }

    public final void handleMsg(@Nullable Message message) {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3467a, false, 56701, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3467a, false, 56701, new Class[0], Void.TYPE);
            return;
        }
        WeakHandler weakHandler = this.f3468b;
        if (weakHandler != null) {
            weakHandler.removeCallbacks(this.j);
        }
        if (this.f3470d) {
            a aVar = this.f3469c;
            if (aVar != null) {
                aVar.n();
            }
            this.f3470d = false;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3467a, false, 56699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3467a, false, 56699, new Class[0], Void.TYPE);
            return;
        }
        WeakHandler weakHandler = this.f3468b;
        if (weakHandler != null) {
            weakHandler.removeCallbacks(this.j);
        }
        this.f3468b = null;
        bg.d(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3467a, false, 56698, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3467a, false, 56698, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3467a, false, 56697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3467a, false, 56697, new Class[0], Void.TYPE);
            return;
        }
        a(this.h);
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f3467a, false, 56700, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f3467a, false, 56700, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        WeakHandler weakHandler = this.f3468b;
        if (weakHandler != null) {
            weakHandler.removeCallbacks(this.j);
        }
        WeakHandler weakHandler2 = this.f3468b;
        if (weakHandler2 != null) {
            weakHandler2.postDelayed(this.j, j2);
        }
    }

    @Subscribe
    public final void onOperateEvent(@NotNull com.ss.android.ugc.aweme.longvideo.a.a aVar) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3467a, false, 56702, new Class[]{com.ss.android.ugc.aweme.longvideo.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3467a, false, 56702, new Class[]{com.ss.android.ugc.aweme.longvideo.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        Lifecycle lifecycle = this.f3472f.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "activity.lifecycle");
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            if (aVar.f53875b) {
                this.f3471e = false;
            }
            if (this.f3471e) {
                a();
            } else {
                a();
                if (aVar.f53874a) {
                    j2 = this.i;
                } else {
                    j2 = this.h;
                }
                a(j2);
            }
            if (aVar.f53874a) {
                this.f3471e = true;
            }
        }
    }

    public final void a(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3467a, false, 56703, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3467a, false, 56703, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "noOperationCallback");
        this.f3469c = aVar2;
    }

    public NoOperateModeController(@NotNull FragmentActivity fragmentActivity, @NotNull View view) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f3472f = fragmentActivity;
        this.g = view;
        this.f3472f.getLifecycle().addObserver(this);
        Lifecycle lifecycle = this.f3472f.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "activity.lifecycle");
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            a(this.h);
        }
        bg.c(this);
    }
}
