package com.ss.android.ugc.aweme.detail.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.detail.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u000f\u001a\u00020\u00102\u0010\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u00100\u0012j\u0002`\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00102\u0010\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u00100\u0012j\u0002`\u0013H\u0016J\u001a\u0010\u0015\u001a\u00020\u00102\u0010\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u00100\u0012j\u0002`\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordRingScaleAnimatorImpl;", "Lcom/ss/android/ugc/aweme/detail/IDetailRecordButtonReversibleAnimator;", "context", "Landroid/content/Context;", "viewGroup", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "getContext", "()Landroid/content/Context;", "ringView", "Landroid/view/View;", "getRingView", "()Landroid/view/View;", "getViewGroup", "()Landroid/view/ViewGroup;", "reverse", "", "callback", "Lkotlin/Function0;", "Lcom/ss/android/ugc/aweme/detail/AnimationCallback;", "start", "stop", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41147a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final View f41148b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Context f41149c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f41150d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/detail/animator/DetailRecordRingScaleAnimatorImpl$reverse$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41151a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f41152b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function0 f41153c;

        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        public final void onAnimationStart(@Nullable Animation animation) {
        }

        public final void onAnimationEnd(@Nullable Animation animation) {
            if (PatchProxy.isSupport(new Object[]{animation}, this, f41151a, false, 34723, new Class[]{Animation.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animation}, this, f41151a, false, 34723, new Class[]{Animation.class}, Void.TYPE);
                return;
            }
            this.f41152b.f41148b.setVisibility(8);
            this.f41153c.invoke();
        }

        a(g gVar, Function0 function0) {
            this.f41152b = gVar;
            this.f41153c = function0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/detail/animator/DetailRecordRingScaleAnimatorImpl$start$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41154a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f41155b;

        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        public final void onAnimationStart(@Nullable Animation animation) {
        }

        b(Function0 function0) {
            this.f41155b = function0;
        }

        public final void onAnimationEnd(@Nullable Animation animation) {
            if (PatchProxy.isSupport(new Object[]{animation}, this, f41154a, false, 34724, new Class[]{Animation.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animation}, this, f41154a, false, 34724, new Class[]{Animation.class}, Void.TYPE);
                return;
            }
            this.f41155b.invoke();
        }
    }

    public final void a(@NotNull Function0<Unit> function0) {
        if (PatchProxy.isSupport(new Object[]{function0}, this, f41147a, false, 34720, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function0}, this, f41147a, false, 34720, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        if (this.f41148b.getAnimation() != null) {
            this.f41148b.clearAnimation();
        }
        this.f41148b.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f41149c, C0906R.anim.dm);
        loadAnimation.setAnimationListener(new b(function0));
        this.f41148b.startAnimation(loadAnimation);
    }

    public final void b(@NotNull Function0<Unit> function0) {
        if (PatchProxy.isSupport(new Object[]{function0}, this, f41147a, false, 34721, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function0}, this, f41147a, false, 34721, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        this.f41148b.clearAnimation();
        this.f41148b.setVisibility(8);
    }

    public final void c(@NotNull Function0<Unit> function0) {
        if (PatchProxy.isSupport(new Object[]{function0}, this, f41147a, false, 34722, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function0}, this, f41147a, false, 34722, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        if (this.f41148b.getAnimation() != null) {
            this.f41148b.clearAnimation();
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f41149c, C0906R.anim.dn);
        loadAnimation.setAnimationListener(new a(this, function0));
        this.f41148b.startAnimation(loadAnimation);
    }

    public g(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
        this.f41149c = context;
        this.f41150d = viewGroup;
        View findViewById = this.f41150d.findViewById(C0906R.id.cus);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "this.viewGroup.findViewB…id.start_record_out_ring)");
        this.f41148b = findViewById;
    }
}
