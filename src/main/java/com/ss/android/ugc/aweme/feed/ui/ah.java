package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 .2\u00020\u0001:\u0001.B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0016J\u0006\u0010#\u001a\u00020\"J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0002J*\u0010'\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010\u00102\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u0013H\u0016J\b\u0010,\u001a\u00020\"H\u0002J\b\u0010-\u001a\u00020\"H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightPopupWindow;", "Landroid/widget/PopupWindow;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "listView", "Lcom/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightListView;", "getListView", "()Lcom/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightListView;", "setListView", "(Lcom/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightListView;)V", "mBackIv", "Landroid/widget/ImageView;", "mContainerView", "Landroid/view/View;", "mContentView", "mExpandHeight", "", "mExpandWidth", "mListViewContainer", "mParent", "mShrinkHeight", "mShrinkWidth", "mStartShowTime", "", "getMStartShowTime", "()J", "setMStartShowTime", "(J)V", "mStartX", "mStartY", "dismiss", "", "doDismiss", "hideParentWithAnim", "hideSkyLight", "initView", "showAtLocation", "parent", "gravity", "x", "y", "showParentWithAnim", "showSkyLight", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ah extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46474a;
    public static final a m = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public View f46475b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public FollowLiveSkyLightListView f46476c;

    /* renamed from: d  reason: collision with root package name */
    View f46477d;

    /* renamed from: e  reason: collision with root package name */
    public long f46478e;

    /* renamed from: f  reason: collision with root package name */
    public final int f46479f = (p.b(this.l) - u.a(24.0d));
    public final int g = u.a(147.5d);
    public final int h = u.a(53.0d);
    public final int i = u.a(28.0d);
    public int j;
    public int k;
    @NotNull
    public final Context l;
    private View n;
    private View o;
    private ImageView p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightPopupWindow$Companion;", "", "()V", "DARK_ALPHA", "", "EXPAND_HEIGHT", "", "LIGHT_ALPHA", "SHRINK_HEIGHT", "SHRINK_WIDTH", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightPopupWindow$hideParentWithAnim$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46480a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f46481b;

        b(View view) {
            this.f46481b = view;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f46480a, false, 42846, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f46480a, false, 42846, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f46481b.setVisibility(4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46482a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ah f46483b;

        c(ah ahVar) {
            this.f46483b = ahVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f46482a, false, 42847, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f46482a, false, 42847, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue() - 1.0f;
                ah.a(this.f46483b).setAlpha(0.85f - (0.70000005f * floatValue));
                float f2 = ((float) this.f46483b.f46479f) - ((((float) this.f46483b.f46479f) - ((float) this.f46483b.h)) * floatValue);
                ViewGroup.LayoutParams layoutParams = ah.a(this.f46483b).getLayoutParams();
                layoutParams.width = (int) f2;
                layoutParams.height = (int) (((float) this.f46483b.g) - ((((float) this.f46483b.g) - ((float) this.f46483b.i)) * floatValue));
                ah.a(this.f46483b).setLayoutParams(layoutParams);
                ah.a(this.f46483b).requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightPopupWindow$hideSkyLight$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ah f46485b;

        d(ah ahVar) {
            this.f46485b = ahVar;
        }

        public final void onAnimationCancel(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f46484a, false, 42849, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f46484a, false, 42849, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f46485b.a();
            this.f46485b.b();
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f46484a, false, 42848, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f46484a, false, 42848, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f46485b.a();
            this.f46485b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46486a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ah f46487b;

        e(ah ahVar) {
            this.f46487b = ahVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f46486a, false, 42850, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f46486a, false, 42850, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f46487b.dismiss();
            com.ss.android.ugc.aweme.feed.j.a aVar = com.ss.android.ugc.aweme.feed.j.a.f45560b;
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.feed.j.a.f45559a, false, 43581, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.feed.j.a.f45559a, false, 43581, new Class[0], Void.TYPE);
            } else {
                r.a("livesdk_close", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from_merge", "homepage_follow").a("enter_method", "manual_click").a("action_type", "click").f34114b);
            }
            com.ss.android.ugc.aweme.feed.j.a.f45560b.c("manual_click");
            com.ss.android.ugc.aweme.feed.j.a.f45560b.a("manual_click", System.currentTimeMillis() - this.f46487b.f46478e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46488a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ah f46489b;

        f(ah ahVar) {
            this.f46489b = ahVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f46488a, false, 42851, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f46488a, false, 42851, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() == 0) {
                float x = motionEvent.getX() + ((float) this.f46489b.j);
                float y = motionEvent.getY() + ((float) this.f46489b.k);
                int[] iArr = new int[2];
                ah.a(this.f46489b).getLocationOnScreen(iArr);
                if (x <= ((float) iArr[0]) || x >= ((float) (iArr[0] + ah.a(this.f46489b).getWidth())) || y <= ((float) iArr[1]) || y >= ((float) (iArr[1] + ah.a(this.f46489b).getHeight()))) {
                    z = true;
                }
            }
            if (z) {
                this.f46489b.dismiss();
                com.ss.android.ugc.aweme.feed.j.a.f45560b.c("auto_show");
                com.ss.android.ugc.aweme.feed.j.a.f45560b.a("auto_show", System.currentTimeMillis() - this.f46489b.f46478e);
            }
            return z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightPopupWindow$showParentWithAnim$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46490a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f46491b;

        g(View view) {
            this.f46491b = view;
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f46490a, false, 42852, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f46490a, false, 42852, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f46491b.setVisibility(0);
            com.ss.android.ugc.aweme.feed.j.a.f45560b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46492a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ah f46493b;

        h(ah ahVar) {
            this.f46493b = ahVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f46492a, false, 42853, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f46492a, false, 42853, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue() - 1.0f;
                ah.a(this.f46493b).setAlpha((0.70000005f * floatValue) + 0.15f);
                float f2 = ((float) this.f46493b.h) + ((((float) this.f46493b.f46479f) - ((float) this.f46493b.h)) * floatValue);
                ViewGroup.LayoutParams layoutParams = ah.a(this.f46493b).getLayoutParams();
                layoutParams.width = (int) f2;
                layoutParams.height = (int) (((float) this.f46493b.i) + ((((float) this.f46493b.g) - ((float) this.f46493b.i)) * floatValue));
                ah.a(this.f46493b).setLayoutParams(layoutParams);
                ah.a(this.f46493b).requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightPopupWindow$showSkyLight$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46494a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ah f46495b;

        i(ah ahVar) {
            this.f46495b = ahVar;
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f46494a, false, 42854, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f46494a, false, 42854, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            ah ahVar = this.f46495b;
            if (PatchProxy.isSupport(new Object[0], ahVar, ah.f46474a, false, 42841, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], ahVar, ah.f46474a, false, 42841, new Class[0], Void.TYPE);
                return;
            }
            View view = ahVar.f46477d;
            if (view != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
                Intrinsics.checkExpressionValueIsNotNull(ofFloat, "alpha");
                ofFloat.setDuration(100);
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.addListener(new b(view));
                ofFloat.start();
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f46474a, false, 42844, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46474a, false, 42844, new Class[0], Void.TYPE);
            return;
        }
        ai.a(this);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46474a, false, 42842, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46474a, false, 42842, new Class[0], Void.TYPE);
            return;
        }
        View view = this.f46477d;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "alpha");
            ofFloat.setDuration(100);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addListener(new g(view));
            ofFloat.start();
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f46474a, false, 42839, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46474a, false, 42839, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f46474a, false, 42843, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46474a, false, 42843, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 2.0f});
        ofFloat.addUpdateListener(new c(this));
        ofFloat.addListener(new d(this));
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "valueAnimator");
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.start();
    }

    public static final /* synthetic */ View a(ah ahVar) {
        View view = ahVar.f46475b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainerView");
        }
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ah(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.l = context;
        if (PatchProxy.isSupport(new Object[0], this, f46474a, false, 42837, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46474a, false, 42837, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(this.l).inflate(C0906R.layout.abr, null, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…ve_skylight, null, false)");
        this.n = inflate;
        View view = this.n;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentView");
        }
        setContentView(view);
        View view2 = this.n;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentView");
        }
        View findViewById = view2.findViewById(C0906R.id.cgk);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mContentView.findViewByI…id.rl_skylight_container)");
        this.f46475b = findViewById;
        View view3 = this.n;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentView");
        }
        View findViewById2 = view3.findViewById(C0906R.id.bh0);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mContentView.findViewByI…id.ll_listView_container)");
        this.o = findViewById2;
        View view4 = this.n;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentView");
        }
        View findViewById3 = view4.findViewById(C0906R.id.bcx);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mContentView.findViewByI…id.list_skylight_style_c)");
        this.f46476c = (FollowLiveSkyLightListView) findViewById3;
        View view5 = this.n;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentView");
        }
        View findViewById4 = view5.findViewById(C0906R.id.b56);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "mContentView.findViewByI…v_skylight_style_c_arrow)");
        this.p = (ImageView) findViewById4;
        setWidth(this.f46479f);
        setHeight(this.g);
        View view6 = this.o;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListViewContainer");
        }
        ViewGroup.LayoutParams layoutParams = view6.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = this.f46479f;
            View view7 = this.o;
            if (view7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mListViewContainer");
            }
            view7.setLayoutParams(marginLayoutParams);
            setBackgroundDrawable(new ColorDrawable(this.l.getResources().getColor(C0906R.color.a7l)));
            setFocusable(true);
            setOutsideTouchable(true);
            ImageView imageView = this.p;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBackIv");
            }
            imageView.setOnClickListener(new e(this));
            setTouchInterceptor(new f(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void showAtLocation(@Nullable View view, int i2, int i3, int i4) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f46474a, false, 42838, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f46474a, false, 42838, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.showAtLocation(view, i2, i3, i4);
        this.f46477d = view2;
        this.j = i3;
        this.k = i4;
        this.f46478e = System.currentTimeMillis();
        if (PatchProxy.isSupport(new Object[0], this, f46474a, false, 42840, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46474a, false, 42840, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 2.0f});
        ofFloat.addUpdateListener(new h(this));
        ofFloat.addListener(new i(this));
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "valueAnimator");
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.start();
    }
}
