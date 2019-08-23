package com.ss.android.ugc.aweme.discover.hitrank;

import a.i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.RoundShadowLayout;
import com.ss.android.ugc.aweme.message.model.SimpleUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.BaseProfileFragment;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002()B\u0005¢\u0006\u0002\u0010\u0004J\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u0012J\u0012\u0010#\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010%\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010&\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u0012J\u0012\u0010'\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hitrank/ProfileHitRankHelper;", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/discover/hitrank/RankModel;", "Landroid/arch/lifecycle/LifecycleObserver;", "()V", "activity", "Landroid/support/v4/app/FragmentActivity;", "activityViewModel", "Lcom/ss/android/ugc/aweme/discover/hitrank/RankViewModel;", "isNotCompletedBefore", "", "lastTimeRefresh", "", "getLastTimeRefresh", "()J", "setLastTimeRefresh", "(J)V", "mUser", "Lcom/ss/android/ugc/aweme/profile/model/User;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "parent", "Landroid/widget/FrameLayout;", "shadowLayout", "Lcom/ss/android/ugc/aweme/common/widget/RoundShadowLayout;", "textView", "Landroid/widget/TextView;", "view", "Landroid/view/View;", "attach", "", "fragment", "Lcom/ss/android/ugc/aweme/profile/ui/BaseProfileFragment;", "bindUser", "user", "onChanged", "t", "refreshData", "setSimpleUser", "shouldShowTag", "Companion", "HitRankTagTouchListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProfileHitRankHelper implements LifecycleObserver, Observer<d> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42354a;
    public static final float k = ((float) u.a(16.0d));
    public static final a l = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public long f42355b;

    /* renamed from: c  reason: collision with root package name */
    public FragmentActivity f42356c;

    /* renamed from: d  reason: collision with root package name */
    public RankViewModel f42357d;

    /* renamed from: e  reason: collision with root package name */
    public View f42358e;

    /* renamed from: f  reason: collision with root package name */
    public FrameLayout f42359f;
    public LifecycleOwner g;
    public TextView h;
    public RoundShadowLayout i;
    public User j;
    private boolean m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hitrank/ProfileHitRankHelper$Companion;", "", "()V", "MAX_DX", "", "getMAX_DX", "()F", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public static float a() {
            return ProfileHitRankHelper.k;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\b¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hitrank/ProfileHitRankHelper$HitRankTagTouchListener;", "Landroid/view/View$OnTouchListener;", "(Lcom/ss/android/ugc/aweme/discover/hitrank/ProfileHitRankHelper;)V", "downX", "", "getDownX", "()F", "setDownX", "(F)V", "downY", "getDownY", "setDownY", "lastX", "getLastX", "setLastX", "lastY", "getLastY", "setLastY", "move", "", "getMove", "()Z", "setMove", "(Z)V", "touchSlop", "", "getTouchSlop", "()I", "viewOriginX", "getViewOriginX", "setViewOriginX", "onTouch", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42360a;

        /* renamed from: b  reason: collision with root package name */
        public float f42361b;

        /* renamed from: c  reason: collision with root package name */
        public float f42362c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f42363d;

        /* renamed from: e  reason: collision with root package name */
        public float f42364e = -1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f42365f;
        public float g;
        public final int h = u.a(2.0d);

        public b() {
        }

        public final boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f42360a, false, 36386, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f42360a, false, 36386, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() == 0) {
                this.f42361b = motionEvent.getRawX();
                this.f42362c = motionEvent.getRawY();
                this.f42365f = motionEvent.getRawX();
                this.g = motionEvent.getRawY();
                this.f42363d = false;
                if (this.f42364e == -1.0f) {
                    this.f42364e = view.getX();
                }
            } else if (motionEvent.getAction() == 1) {
                boolean z2 = this.f42363d;
                if (z2) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "x", new float[]{this.f42364e});
                    Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
                    ofFloat.setDuration((long) ((Math.abs(view.getX() - this.f42364e) / a.a()) * 200.0f));
                    ofFloat.start();
                }
                z = z2;
            } else if (motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getRawX() - this.f42365f) > ((float) this.h) || Math.abs(motionEvent.getRawY() - this.g) > ((float) this.h)) {
                    this.f42363d = true;
                }
                float rawX = motionEvent.getRawX() - this.f42361b;
                float rawY = motionEvent.getRawY() - this.f42362c;
                float abs = rawX * (1.0f - (Math.abs(view.getX() - this.f42364e) / a.a()));
                if (view.getX() + abs > this.f42364e) {
                    abs = this.f42364e - view.getX();
                } else if (view.getX() + abs < this.f42364e - a.a()) {
                    abs = (this.f42364e - a.a()) - view.getX();
                }
                if (view.getY() + rawY < 0.0f) {
                    rawY = -view.getY();
                } else if (view.getY() + rawY + ((float) view.getHeight()) > ((float) ProfileHitRankHelper.a(ProfileHitRankHelper.this).getHeight())) {
                    rawY = (((float) ProfileHitRankHelper.a(ProfileHitRankHelper.this).getHeight()) - view.getY()) - ((float) view.getHeight());
                }
                view.setTranslationX(view.getTranslationX() + ((float) ((int) abs)));
                view.setTranslationY(view.getTranslationY() + ((float) ((int) rawY)));
                this.f42362c = motionEvent.getRawY();
                this.f42361b = motionEvent.getRawX();
                z = true;
            }
            return z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/discover/hitrank/ProfileHitRankHelper$attach$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42366a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileHitRankHelper f42367b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseProfileFragment f42368c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FrameLayout f42369d;

        public final void onGlobalLayout() {
            if (PatchProxy.isSupport(new Object[0], this, f42366a, false, 36387, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42366a, false, 36387, new Class[0], Void.TYPE);
                return;
            }
            View view = this.f42368c.getView();
            if (view != null) {
                View findViewById = view.findViewById(C0906R.id.a5r);
                if (findViewById != null) {
                    ProfileHitRankHelper.b(this.f42367b).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int i = v.b(findViewById).top - v.b((View) this.f42369d).top;
                    ViewGroup.LayoutParams layoutParams = ProfileHitRankHelper.b(this.f42367b).getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = (int) (((float) (i + u.a(16.0d))) - (ProfileHitRankHelper.c(this.f42367b).getShadowRadius() + Math.abs(ProfileHitRankHelper.c(this.f42367b).getShadowDy())));
                        ProfileHitRankHelper.b(this.f42367b).setLayoutParams(marginLayoutParams);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }

        public c(ProfileHitRankHelper profileHitRankHelper, BaseProfileFragment baseProfileFragment, FrameLayout frameLayout) {
            this.f42367b = profileHitRankHelper;
            this.f42368c = baseProfileFragment;
            this.f42369d = frameLayout;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42370a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f42371b;

        d(User user) {
            this.f42371b = user;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            if (PatchProxy.isSupport(new Object[]{view}, this, f42370a, false, 36388, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42370a, false, 36388, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "others_homepage");
            User user = this.f42371b;
            String str3 = null;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            r.a("hit_board_click", (Map) a2.a("to_user_id", str).f34114b);
            h a3 = h.a();
            User user2 = this.f42371b;
            if (user2 != null) {
                str2 = user2.getUid();
            } else {
                str2 = null;
            }
            User user3 = this.f42371b;
            if (user3 != null) {
                str3 = user3.getSecUid();
            }
            a3.a(c.a("others_homepage", str2, str3));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/discover/hitrank/ProfileHitRankHelper$onChanged$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42372a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileHitRankHelper f42373b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f42374c;

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f42372a, false, 36389, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f42372a, false, 36389, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            super.onAnimationEnd(animator);
            LifecycleOwner lifecycleOwner = this.f42373b.g;
            if (lifecycleOwner == null) {
                Intrinsics.throwUninitializedPropertyAccessException("owner");
            }
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "owner.lifecycle");
            if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(ProfileHitRankHelper.b(this.f42373b), "translationX", new float[]{this.f42374c, 0.0f}).setDuration(300);
                Intrinsics.checkExpressionValueIsNotNull(duration, "show");
                duration.setStartDelay(200);
                duration.start();
                TextView textView = this.f42373b.h;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textView");
                }
                textView.setText(C0906R.string.alg);
            }
        }

        e(ProfileHitRankHelper profileHitRankHelper, float f2) {
            this.f42373b = profileHitRankHelper;
            this.f42374c = f2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class f<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42375a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileHitRankHelper f42376b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f42377c;

        f(ProfileHitRankHelper profileHitRankHelper, User user) {
            this.f42376b = profileHitRankHelper;
            this.f42377c = user;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f42375a, false, 36390, new Class[0], Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[0], this, f42375a, false, 36390, new Class[0], Void.class);
            }
            RankViewModel rankViewModel = this.f42376b.f42357d;
            if (rankViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activityViewModel");
            }
            User user = this.f42377c;
            if (user == null) {
                Intrinsics.throwNpe();
            }
            rankViewModel.a(user.getUid(), this.f42377c.getSecUid());
            return null;
        }
    }

    public static final /* synthetic */ FrameLayout a(ProfileHitRankHelper profileHitRankHelper) {
        FrameLayout frameLayout = profileHitRankHelper.f42359f;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parent");
        }
        return frameLayout;
    }

    public static final /* synthetic */ View b(ProfileHitRankHelper profileHitRankHelper) {
        View view = profileHitRankHelper.f42358e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        return view;
    }

    public static final /* synthetic */ RoundShadowLayout c(ProfileHitRankHelper profileHitRankHelper) {
        RoundShadowLayout roundShadowLayout = profileHitRankHelper.i;
        if (roundShadowLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowLayout");
        }
        return roundShadowLayout;
    }

    public final void a(@Nullable User user) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{user}, this, f42354a, false, 36382, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f42354a, false, 36382, new Class[]{User.class}, Void.TYPE);
            return;
        }
        View view = this.f42358e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        view.setVisibility(8);
        if (user != null) {
            this.j = user;
            View view2 = this.f42358e;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("view");
            }
            view2.setOnClickListener(new d(user));
            if (PatchProxy.isSupport(new Object[]{user}, this, f42354a, false, 36384, new Class[]{User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user}, this, f42354a, false, 36384, new Class[]{User.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[]{user}, this, f42354a, false, 36385, new Class[]{User.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f42354a, false, 36385, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
            } else if (!com.ss.android.g.a.a()) {
                IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                if (a2.isLogin() && user != null && user.isStar() && user.getStarBillboardRank() > 0) {
                    z = true;
                }
            }
            if (z) {
                if (System.currentTimeMillis() - this.f42355b > 1000) {
                    i.a((Callable<TResult>) new f<TResult>(this, user));
                }
                this.f42355b = System.currentTimeMillis();
            }
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        d dVar = (d) obj;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f42354a, false, 36380, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f42354a, false, 36380, new Class[]{d.class}, Void.TYPE);
        } else if (dVar != null && dVar.f42389a != -2 && dVar.f42389a != -1) {
            SimpleUser simpleUser = (SimpleUser) CollectionsKt.firstOrNull((List<? extends T>) dVar.f42390b.getUserList());
            if (simpleUser != null) {
                b taskInfo = simpleUser.getTaskInfo();
                View view = this.f42358e;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("view");
                }
                view.setVisibility(0);
                if (taskInfo.getCompeletedTaskCnt() != taskInfo.getTotalTaskCnt()) {
                    this.m = true;
                    TextView textView = this.h;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textView");
                    }
                    FragmentActivity fragmentActivity = this.f42356c;
                    if (fragmentActivity == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(PushConstants.INTENT_ACTIVITY_NAME);
                    }
                    String string = fragmentActivity.getString(C0906R.string.cnd);
                    Intrinsics.checkExpressionValueIsNotNull(string, "activity.getString(R.string.today_hitrank)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(taskInfo.getCompeletedTaskCnt()), Integer.valueOf(taskInfo.getTotalTaskCnt())}, 2));
                    Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                    textView.setText(format);
                } else if (this.m) {
                    this.m = false;
                    View view2 = this.f42358e;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("view");
                    }
                    float width = ((float) view2.getWidth()) * 1.0f;
                    View view3 = this.f42358e;
                    if (view3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("view");
                    }
                    ObjectAnimator duration = ObjectAnimator.ofFloat(view3, "translationX", new float[]{0.0f, width}).setDuration(300);
                    duration.addListener(new e(this, width));
                    Intrinsics.checkExpressionValueIsNotNull(duration, "hide");
                    duration.setStartDelay(600);
                    duration.start();
                } else {
                    TextView textView2 = this.h;
                    if (textView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textView");
                    }
                    textView2.setText(C0906R.string.alg);
                }
            }
        }
    }
}
