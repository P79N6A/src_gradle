package com.ss.android.ugc.aweme.base.activity;

import android.app.Activity;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.ies.dmt.ui.sliding.DmtSlidingPaneLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.livedata.SlideData;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/base/activity/SwipeBackHelper;", "Lcom/bytedance/ies/dmt/ui/sliding/DmtSlidingPaneLayout$PanelSlideListener;", "activity", "Landroid/app/Activity;", "useTranslucentTheme", "", "(Landroid/app/Activity;Z)V", "mActivity", "mSetTranslucentDone", "mSlideData", "Lcom/ss/android/ugc/aweme/base/livedata/SlideData;", "mSwipeListener", "Lcom/ss/android/ugc/aweme/base/activity/SwipeBackHelper$SwipeCallback;", "mUseTranslucentTheme", "slidingPaneLayout", "Lcom/bytedance/ies/dmt/ui/sliding/AmeSlidingPaneLayout;", "initSwipeBack", "", "initSwipeBackFinish", "isSupportSwipeBack", "onPanelClosed", "var1", "Landroid/view/View;", "onPanelOpened", "onPanelSlide", "var2", "", "onViewCaptured", "setSwipeCallBackListener", "listener", "SwipeCallback", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f implements DmtSlidingPaneLayout.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34516a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f34517b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f34518c;

    /* renamed from: d  reason: collision with root package name */
    public a f34519d;

    /* renamed from: e  reason: collision with root package name */
    private SlideData f34520e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f34521f;
    private com.bytedance.ies.dmt.ui.sliding.a g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/base/activity/SwipeBackHelper$SwipeCallback;", "", "onCaptured", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34522a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f34523b;

        b(f fVar) {
            this.f34523b = fVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f34522a, false, 24124, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34522a, false, 24124, new Class[0], Void.TYPE);
                return;
            }
            g.a(this.f34523b.f34518c);
            this.f34523b.f34517b = true;
        }
    }

    private final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f34516a, false, 24119, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34516a, false, 24119, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        return a2.cc();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34516a, false, 24117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34516a, false, 24117, new Class[0], Void.TYPE);
            return;
        }
        if (c()) {
            this.f34518c.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            if (this.f34521f) {
                g.a(this.f34518c);
                this.f34517b = true;
            } else {
                new Handler().postDelayed(new b(this), 1300);
            }
            b();
            Activity activity = this.f34518c;
            if (activity != null) {
                this.f34520e = (SlideData) ViewModelProviders.of((FragmentActivity) activity).get(SlideData.class);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
    }

    private final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f34516a, false, 24118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34516a, false, 24118, new Class[0], Void.TYPE);
            return;
        }
        this.g = new com.bytedance.ies.dmt.ui.sliding.a(this.f34518c);
        com.bytedance.ies.dmt.ui.sliding.a aVar = this.g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("slidingPaneLayout");
        }
        aVar.setPanelSlideListener(this);
        com.bytedance.ies.dmt.ui.sliding.a aVar2 = this.g;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("slidingPaneLayout");
        }
        aVar2.setSliderFadeColor(o.a().getColor(17170445));
        View view = new View(this.f34518c);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.ies.dmt.ui.sliding.a aVar3 = this.g;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("slidingPaneLayout");
        }
        aVar3.addView(view, 0);
        Window window = this.f34518c.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "mActivity.window");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            View childAt = viewGroup.getChildAt(0);
            if (childAt != null) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                if (viewGroup2 != null) {
                    if (com.ss.android.g.a.b()) {
                        viewGroup2.setBackgroundColor(o.a().getColor(17170443));
                    } else {
                        viewGroup2.setBackgroundColor(o.a().getColor(17170444));
                    }
                    View view2 = viewGroup2;
                    viewGroup.removeView(view2);
                    com.bytedance.ies.dmt.ui.sliding.a aVar4 = this.g;
                    if (aVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("slidingPaneLayout");
                    }
                    viewGroup.addView(aVar4);
                    com.bytedance.ies.dmt.ui.sliding.a aVar5 = this.g;
                    if (aVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("slidingPaneLayout");
                    }
                    aVar5.addView(view2, 1);
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void b(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f34516a, false, 24121, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f34516a, false, 24121, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "var1");
        SlideData slideData = this.f34520e;
        if (slideData != null) {
            MutableLiveData b2 = slideData.b();
            if (b2 != null) {
                b2.setValue(Boolean.FALSE);
            }
        }
    }

    public final void c(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f34516a, false, 24122, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f34516a, false, 24122, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "var1");
        KeyboardUtils.c(view);
        SlideData slideData = this.f34520e;
        if (slideData != null) {
            MutableLiveData b2 = slideData.b();
            if (b2 != null) {
                b2.setValue(Boolean.TRUE);
            }
        }
        if (this.f34519d != null) {
            a aVar = this.f34519d;
            if (aVar != null) {
                aVar.a();
            }
        }
        if (!this.f34517b) {
            g.a(this.f34518c);
        }
    }

    public final void a(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f34516a, false, 24123, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f34516a, false, 24123, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "var1");
        SlideData slideData = this.f34520e;
        if (slideData != null) {
            MutableLiveData b2 = slideData.b();
            if (b2 != null) {
                b2.setValue(Boolean.FALSE);
            }
        }
        this.f34518c.finish();
        this.f34518c.overridePendingTransition(0, C0906R.anim.dh);
    }

    public f(@NotNull Activity activity, boolean z) {
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f34518c = activity;
        this.f34521f = z;
    }

    public final void a(@NotNull View view, float f2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f34516a, false, 24120, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f34516a, false, 24120, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "var1");
        SlideData slideData = this.f34520e;
        if (slideData != null) {
            MutableLiveData a2 = slideData.a();
            if (a2 != null) {
                a2.setValue(Float.valueOf(f2));
            }
        }
    }
}
