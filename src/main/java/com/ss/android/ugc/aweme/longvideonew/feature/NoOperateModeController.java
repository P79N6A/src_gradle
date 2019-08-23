package com.ss.android.ugc.aweme.longvideonew.feature;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0007J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0007J\b\u0010$\u001a\u00020\u001dH\u0007J\b\u0010%\u001a\u00020\u001dH\u0007J\u0010\u0010&\u001a\u00020\u001d2\b\b\u0002\u0010'\u001a\u00020\u0007J\u000e\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001bJ\u0006\u0010*\u001a\u00020\u001dR\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/feature/NoOperateModeController;", "Lcom/bytedance/common/utility/collection/WeakHandler$IHandler;", "Landroid/arch/lifecycle/LifecycleObserver;", "activity", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "(Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;)V", "MAX_TIME", "", "NO_OPERATION_TIME", "getActivity", "()Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "isNoOperateMode", "", "()Z", "setNoOperateMode", "(Z)V", "isTrackingTouch", "setTrackingTouch", "mEnterNoOperationMode", "Ljava/lang/Runnable;", "mHandler", "Lcom/bytedance/common/utility/collection/WeakHandler;", "getMHandler", "()Lcom/bytedance/common/utility/collection/WeakHandler;", "setMHandler", "(Lcom/bytedance/common/utility/collection/WeakHandler;)V", "mNoOperationCallback", "Lcom/ss/android/ugc/aweme/longvideonew/feature/NoOperateModeController$NoOperationCallback;", "handleMsg", "", "msg", "Landroid/os/Message;", "onDestroy", "onOperateEvent", "event", "Lcom/ss/android/ugc/aweme/longvideo/event/OperateEvent;", "onPause", "onResume", "reckonByTime", "time", "setNoOperationCallback", "noOperationCallback", "stopTime", "NoOperationCallback", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class NoOperateModeController implements LifecycleObserver, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3488a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public WeakHandler f3489b = new WeakHandler(this);

    /* renamed from: c  reason: collision with root package name */
    public a f3490c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3491d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3492e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final AmeSSActivity f3493f;
    private final long g = 3000;
    private final long h = 60000;
    private final Runnable i = new b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/feature/NoOperateModeController$NoOperationCallback;", "", "enterNoOperationMode", "", "exitNoOperationMode", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void b();

        void c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54042a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NoOperateModeController f54043b;

        b(NoOperateModeController noOperateModeController) {
            this.f54043b = noOperateModeController;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f54042a, false, 56911, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54042a, false, 56911, new Class[0], Void.TYPE);
                return;
            }
            a aVar = this.f54043b.f3490c;
            if (aVar != null) {
                aVar.b();
            }
            this.f54043b.f3491d = true;
        }
    }

    public final void handleMsg(@Nullable Message message) {
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3488a, false, 56908, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3488a, false, 56908, new Class[0], Void.TYPE);
            return;
        }
        WeakHandler weakHandler = this.f3489b;
        if (weakHandler != null) {
            weakHandler.removeCallbacks(this.i);
        }
        if (this.f3491d) {
            a aVar = this.f3490c;
            if (aVar != null) {
                aVar.c();
            }
            this.f3491d = false;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3488a, false, 56906, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3488a, false, 56906, new Class[0], Void.TYPE);
            return;
        }
        WeakHandler weakHandler = this.f3489b;
        if (weakHandler != null) {
            weakHandler.removeCallbacks(this.i);
        }
        this.f3489b = null;
        bg.d(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3488a, false, 56905, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3488a, false, 56905, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3488a, false, 56904, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3488a, false, 56904, new Class[0], Void.TYPE);
            return;
        }
        a(this.g);
    }

    public NoOperateModeController(@NotNull AmeSSActivity ameSSActivity) {
        Intrinsics.checkParameterIsNotNull(ameSSActivity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f3493f = ameSSActivity;
        this.f3493f.getLifecycle().addObserver(this);
        Lifecycle lifecycle = this.f3493f.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "activity.lifecycle");
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            a(this.g);
        }
        bg.c(this);
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f3488a, false, 56907, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f3488a, false, 56907, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        WeakHandler weakHandler = this.f3489b;
        if (weakHandler != null) {
            weakHandler.removeCallbacks(this.i);
        }
        WeakHandler weakHandler2 = this.f3489b;
        if (weakHandler2 != null) {
            weakHandler2.postDelayed(this.i, j);
        }
    }

    @Subscribe
    public final void onOperateEvent(@NotNull com.ss.android.ugc.aweme.longvideo.a.a aVar) {
        long j;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3488a, false, 56909, new Class[]{com.ss.android.ugc.aweme.longvideo.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3488a, false, 56909, new Class[]{com.ss.android.ugc.aweme.longvideo.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        Lifecycle lifecycle = this.f3493f.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "activity.lifecycle");
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            if (aVar.f53875b) {
                this.f3492e = false;
            }
            if (this.f3492e) {
                a();
            } else {
                a();
                if (aVar.f53874a) {
                    j = this.h;
                } else {
                    j = this.g;
                }
                a(j);
            }
            if (aVar.f53874a) {
                this.f3492e = true;
            }
        }
    }
}
