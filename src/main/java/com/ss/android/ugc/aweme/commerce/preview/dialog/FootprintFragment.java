package com.ss.android.ugc.aweme.commerce.preview.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u0012\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002J\u0012\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\nH\u0016J\u001a\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010'\u001a\u00020\n2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010)\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/dialog/FootprintFragment;", "Landroid/support/v4/app/DialogFragment;", "()V", "backgroundView", "Landroid/view/View;", "contentView", "contentViewHeight", "", "dialogShowCompleteListener", "Lkotlin/Function0;", "", "isAnimatorEnd", "", "mImmersionBar", "Lcom/gyf/barlibrary/ImmersionBar;", "viewGroup", "Landroid/widget/FrameLayout;", "dismissAllowingStateLoss", "initAnimatorListener", "valueAnimator", "Landroid/animation/ValueAnimator;", "isShow", "initView", "context", "Landroid/content/Context;", "initWindow", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "setContent", "setOnDialogShowCompleteListener", "listener", "startContentViewAnimation", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FootprintFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37357a;
    public static final a g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f37358b;

    /* renamed from: c  reason: collision with root package name */
    public int f37359c;

    /* renamed from: d  reason: collision with root package name */
    public View f37360d;

    /* renamed from: e  reason: collision with root package name */
    public View f37361e;

    /* renamed from: f  reason: collision with root package name */
    public Function0<Unit> f37362f;
    private FrameLayout h;
    private ImmersionBar i;
    private HashMap j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/dialog/FootprintFragment$Companion;", "", "()V", "ANIMATOR_DURATION", "", "BACKGROUND_ALPHA", "", "WINDOW_RATIO", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37363a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FootprintFragment f37364b;

        b(FootprintFragment footprintFragment) {
            this.f37364b = footprintFragment;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f37363a, false, 28893, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f37363a, false, 28893, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                View view = this.f37364b.f37361e;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("backgroundView");
                }
                view.setAlpha(0.5f * floatValue);
                View view2 = this.f37364b.f37360d;
                if (view2 != null) {
                    View view3 = this.f37364b.f37360d;
                    if (view3 != null) {
                        layoutParams = view3.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if (layoutParams != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.setMargins(0, (int) (((float) this.f37364b.f37359c) * (floatValue - 1.0f)), 0, 0);
                        view2.setLayoutParams(layoutParams2);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/dialog/FootprintFragment$initAnimatorListener$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37365a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FootprintFragment f37366b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f37367c;

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f37365a, false, 28894, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f37365a, false, 28894, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            super.onAnimationStart(animator);
            this.f37366b.f37358b = false;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f37365a, false, 28895, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f37365a, false, 28895, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            super.onAnimationEnd(animator);
            this.f37366b.f37358b = true;
            if (this.f37367c) {
                Function0<Unit> function0 = this.f37366b.f37362f;
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                this.f37366b.dismissAllowingStateLoss();
            }
        }

        c(FootprintFragment footprintFragment, boolean z) {
            this.f37366b = footprintFragment;
            this.f37367c = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/commerce/preview/dialog/FootprintFragment$initView$2$1"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37368a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FootprintFragment f37369b;

        d(FootprintFragment footprintFragment) {
            this.f37369b = footprintFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37368a, false, 28896, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37368a, false, 28896, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f37369b.f37358b) {
                this.f37369b.a(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37370a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FootprintFragment f37371b;

        e(FootprintFragment footprintFragment) {
            this.f37371b = footprintFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f37370a, false, 28897, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37370a, false, 28897, new Class[0], Void.TYPE);
                return;
            }
            this.f37371b.a(true);
        }
    }

    public final void dismissAllowingStateLoss() {
        if (PatchProxy.isSupport(new Object[0], this, f37357a, false, 28890, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37357a, false, 28890, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.dismissAllowingStateLoss();
        } catch (Exception unused) {
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f37357a, false, 28883, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37357a, false, 28883, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar immersionBar = this.i;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f37357a, false, 28892, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37357a, false, 28892, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.clear();
        }
    }

    public final void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f37357a, false, 28882, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f37357a, false, 28882, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.i = ImmersionBar.with((DialogFragment) this, getDialog()).statusBarDarkFont(true);
        ImmersionBar immersionBar = this.i;
        if (immersionBar != null) {
            immersionBar.init();
        }
    }

    public final void a(boolean z) {
        float[] fArr;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37357a, false, 28884, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37357a, false, 28884, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = new float[]{1.0f, 0.0f};
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "valueAnimator");
        ofFloat.setDuration(200);
        if (PatchProxy.isSupport(new Object[]{ofFloat, Byte.valueOf(z)}, this, f37357a, false, 28888, new Class[]{ValueAnimator.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ofFloat, Byte.valueOf(z)}, this, f37357a, false, 28888, new Class[]{ValueAnimator.class, Boolean.TYPE}, Void.TYPE);
        } else {
            View view = this.f37360d;
            if (view != null) {
                view.setPadding(0, UIUtils.getStatusBarHeight(getContext()), 0, 0);
            }
            ofFloat.addUpdateListener(new b(this));
            ofFloat.addListener(new c(this, z));
        }
        ofFloat.start();
    }

    public final void onAttach(@Nullable Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f37357a, false, 28879, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f37357a, false, 28879, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        if (PatchProxy.isSupport(new Object[]{context}, this, f37357a, false, 28886, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f37357a, false, 28886, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (context != null) {
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
            int i2 = resources.getDisplayMetrics().widthPixels;
            this.f37359c = ((int) (((float) i2) * 0.664f)) + UIUtils.getStatusBarHeight(context);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(0);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.h = frameLayout;
            View view = new View(context);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(-16777216);
            view.setAlpha(0.0f);
            view.setOnClickListener(new d(this));
            this.f37361e = view;
            if (this.f37360d == null) {
                dismissAllowingStateLoss();
            }
            View view2 = this.f37360d;
            if (view2 != null) {
                view2.setLayoutParams(new FrameLayout.LayoutParams(i2, this.f37359c));
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    ((FrameLayout.LayoutParams) layoutParams).setMargins(0, -this.f37359c, 0, 0);
                    view2.setBackgroundColor(-1);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f37357a, false, 28881, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f37357a, false, 28881, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f37357a, false, 28887, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37357a, false, 28887, new Class[0], Void.TYPE);
        } else {
            Dialog dialog = getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setDimAmount(0.0f);
                }
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                Window window2 = dialog2.getWindow();
                if (window2 != null) {
                    View decorView = window2.getDecorView();
                    if (decorView != null) {
                        decorView.setPadding(0, 0, 0, 0);
                    }
                }
            }
            Dialog dialog3 = getDialog();
            if (dialog3 != null) {
                Window window3 = dialog3.getWindow();
                if (window3 != null) {
                    window3.setBackgroundDrawableResource(17170445);
                }
            }
            Dialog dialog4 = getDialog();
            if (dialog4 != null) {
                Window window4 = dialog4.getWindow();
                if (window4 != null) {
                    window4.setLayout(-1, -1);
                }
            }
        }
        View view2 = this.f37360d;
        if (view2 != null) {
            view2.post(new e(this));
        }
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewParent viewParent;
        ViewParent viewParent2;
        LayoutInflater layoutInflater2 = layoutInflater;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup, bundle}, this, f37357a, false, 28880, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup, bundle}, this, f37357a, false, 28880, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View view = this.f37361e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backgroundView");
        }
        if (view.getParent() != null) {
            View view2 = this.f37361e;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("backgroundView");
            }
            ViewParent parent = view2.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            if (viewGroup2 != null) {
                View view3 = this.f37361e;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("backgroundView");
                }
                viewGroup2.removeView(view3);
            }
        }
        View view4 = this.f37360d;
        if (view4 != null) {
            viewParent = view4.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent != null) {
            View view5 = this.f37360d;
            if (view5 != null) {
                viewParent2 = view5.getParent();
            } else {
                viewParent2 = null;
            }
            if (!(viewParent2 instanceof ViewGroup)) {
                viewParent2 = null;
            }
            ViewGroup viewGroup3 = (ViewGroup) viewParent2;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this.f37360d);
            }
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewGroup");
        }
        View view6 = this.f37361e;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backgroundView");
        }
        frameLayout.addView(view6);
        if (this.f37360d != null) {
            FrameLayout frameLayout2 = this.h;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewGroup");
            }
            frameLayout2.addView(this.f37360d);
        }
        FrameLayout frameLayout3 = this.h;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewGroup");
        }
        return frameLayout3;
    }
}
