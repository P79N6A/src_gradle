package com.ss.android.ugc.aweme.detail.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.detail.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020&J\u0010\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020&H\u0002J\b\u0010,\u001a\u00020&H\u0002J\b\u0010-\u001a\u00020&H\u0016J\b\u0010.\u001a\u00020&H\u0016J\b\u0010/\u001a\u00020&H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR&\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!¨\u00060"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/animator/DetailFragmentNewAnimatorImpl;", "Lcom/ss/android/ugc/aweme/detail/IDetailFragmentAnimator;", "context", "Landroid/content/Context;", "viewGroup", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "getContext", "()Landroid/content/Context;", "value", "", "couldShowRecord", "getCouldShowRecord", "()Z", "setCouldShowRecord", "(Z)V", "hasMovedToNextAnimStep", "getHasMovedToNextAnimStep", "setHasMovedToNextAnimStep", "isAnimatingToNextState", "setAnimatingToNextState", "isAnimatingToPreviousState", "setAnimatingToPreviousState", "recordButtonInitialBreatheAnimator", "Lcom/ss/android/ugc/aweme/detail/IDetailRecordButtonAnimator;", "getRecordButtonInitialBreatheAnimator", "()Lcom/ss/android/ugc/aweme/detail/IDetailRecordButtonAnimator;", "recordButtonScaleInAnimator", "Lcom/ss/android/ugc/aweme/detail/IDetailRecordButtonReversibleAnimator;", "getRecordButtonScaleInAnimator", "()Lcom/ss/android/ugc/aweme/detail/IDetailRecordButtonReversibleAnimator;", "recordButtonViewGroup", "getRecordButtonViewGroup", "()Landroid/view/ViewGroup;", "recordRingScaleAnimator", "getRecordRingScaleAnimator", "getViewGroup", "moveBackToInitialAnimStep", "", "moveToNextAnimStep", "onPageSelected", "position", "", "onRecordButtonPressedIn", "onRecordButtonPressedOut", "onSlidedown", "onSlideup", "start", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements com.ss.android.ugc.aweme.detail.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41099a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f41100b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.detail.b f41101c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.detail.c f41102d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.detail.c f41103e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f41104f;
    public boolean g;
    public boolean h;
    @NotNull
    public final Context i;
    @NotNull
    public final ViewGroup j;
    private boolean k = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34677, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34677, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.f41102d.c(new Function0<Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ a this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34678, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34678, new Class[0], Void.TYPE);
                        return;
                    }
                    this.this$0.this$0.f41101c.a(b.a.C0530a.INSTANCE);
                    this.this$0.this$0.f41104f = false;
                    this.this$0.this$0.h = false;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34679, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34679, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.f41103e.a(new Function0<Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    this.this$0.this$0.f41104f = true;
                    this.this$0.this$0.g = false;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/detail/animator/DetailFragmentNewAnimatorImpl$onRecordButtonPressedOut$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.detail.a.c$c  reason: collision with other inner class name */
    public static final class C0528c implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41107a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f41108b;

        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        public final void onAnimationStart(@Nullable Animation animation) {
        }

        C0528c(c cVar) {
            this.f41108b = cVar;
        }

        public final void onAnimationEnd(@Nullable Animation animation) {
            if (PatchProxy.isSupport(new Object[]{animation}, this, f41107a, false, 34680, new Class[]{Animation.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animation}, this, f41107a, false, 34680, new Class[]{Animation.class}, Void.TYPE);
                return;
            }
            if (!this.f41108b.f41104f) {
                this.f41108b.f41101c.a(b.a.C0530a.INSTANCE);
            }
        }
    }

    private boolean d() {
        return this.k;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f41099a, false, 34668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41099a, false, 34668, new Class[0], Void.TYPE);
            return;
        }
        View findViewById = this.f41100b.findViewById(C0906R.id.cus);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        this.f41101c.a(b.a.C0530a.INSTANCE);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f41099a, false, 34669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41099a, false, 34669, new Class[0], Void.TYPE);
            return;
        }
        e();
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f41099a, false, 34673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41099a, false, 34673, new Class[0], Void.TYPE);
            return;
        }
        if (d() && this.f41104f && !this.h) {
            this.f41100b.clearAnimation();
            this.h = true;
            this.f41103e.c(new a(this));
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f41099a, false, 34670, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41099a, false, 34670, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f41099a, false, 34672, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41099a, false, 34672, new Class[0], Void.TYPE);
            return;
        }
        if (d() && !this.f41104f && !this.g) {
            this.f41100b.clearAnimation();
            this.f41101c.b(b.a.C0531b.INSTANCE);
            this.g = true;
            this.f41102d.a(new b(this));
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f41099a, false, 34671, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f41099a, false, 34671, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        e();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f41099a, false, 34667, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f41099a, false, 34667, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41100b.setVisibility(8);
        this.k = false;
    }

    public c(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
        this.i = context;
        this.j = viewGroup;
        View findViewById = this.j.findViewById(C0906R.id.cup);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "this.viewGroup.findViewById(R.id.start_record)");
        this.f41100b = (ViewGroup) findViewById;
        this.f41101c = new e(this.i, this.f41100b);
        this.f41102d = new f(this.i, this.f41100b);
        this.f41103e = new g(this.i, this.f41100b);
        this.f41100b.setOnTouchListener(new View.OnTouchListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41105a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f41106b;

            {
                this.f41106b = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                if (PatchProxy.isSupport(new Object[]{view, motionEvent2}, this, f41105a, false, 34676, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent2}, this, f41105a, false, 34676, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                Intrinsics.checkExpressionValueIsNotNull(motionEvent2, "event");
                switch (motionEvent.getAction()) {
                    case 0:
                        c cVar = this.f41106b;
                        if (!PatchProxy.isSupport(new Object[0], cVar, c.f41099a, false, 34674, new Class[0], Void.TYPE)) {
                            cVar.f41100b.clearAnimation();
                            if (!cVar.f41104f) {
                                cVar.f41101c.b(b.a.C0531b.INSTANCE);
                            }
                            cVar.f41100b.startAnimation(AnimationUtils.loadAnimation(cVar.i, C0906R.anim.dj));
                            break;
                        } else {
                            PatchProxy.accessDispatch(new Object[0], cVar, c.f41099a, false, 34674, new Class[0], Void.TYPE);
                            break;
                        }
                    case 1:
                        c cVar2 = this.f41106b;
                        if (!PatchProxy.isSupport(new Object[0], cVar2, c.f41099a, false, 34675, new Class[0], Void.TYPE)) {
                            cVar2.f41100b.clearAnimation();
                            Animation loadAnimation = AnimationUtils.loadAnimation(cVar2.i, C0906R.anim.dk);
                            loadAnimation.setAnimationListener(new C0528c(cVar2));
                            cVar2.f41100b.startAnimation(loadAnimation);
                            break;
                        } else {
                            PatchProxy.accessDispatch(new Object[0], cVar2, c.f41099a, false, 34675, new Class[0], Void.TYPE);
                            break;
                        }
                }
                return false;
            }
        });
    }
}
