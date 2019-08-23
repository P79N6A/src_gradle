package com.ss.android.ugc.aweme.commercialize.symphony;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002()B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010!\u001a\u00020\"H\u0007J\u0006\u0010#\u001a\u00020\"J\u0012\u0010$\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\"H\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/symphony/AdDislikeLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "iDislike", "Lcom/ss/android/ugc/aweme/commercialize/symphony/AdDislikeLayout$IDislike;", "getIDislike", "()Lcom/ss/android/ugc/aweme/commercialize/symphony/AdDislikeLayout$IDislike;", "setIDislike", "(Lcom/ss/android/ugc/aweme/commercialize/symphony/AdDislikeLayout$IDislike;)V", "iDislikeClick", "Lcom/ss/android/ugc/aweme/commercialize/symphony/AdDislikeLayout$IDislikeClick;", "getIDislikeClick", "()Lcom/ss/android/ugc/aweme/commercialize/symphony/AdDislikeLayout$IDislikeClick;", "setIDislikeClick", "(Lcom/ss/android/ugc/aweme/commercialize/symphony/AdDislikeLayout$IDislikeClick;)V", "lastY", "getLastY", "()I", "setLastY", "(I)V", "lowerLimitPx", "optionHeightPx", "translationYDistance", "", "translationYDown2Up", "", "upperLimitPx", "enterDislike", "", "exitDislike", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "showNotSupportToast", "IDislike", "IDislikeClick", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AdDislikeLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39501a;

    /* renamed from: b  reason: collision with root package name */
    boolean f39502b;

    /* renamed from: c  reason: collision with root package name */
    final float f39503c;

    /* renamed from: d  reason: collision with root package name */
    int f39504d;

    /* renamed from: e  reason: collision with root package name */
    int f39505e;

    /* renamed from: f  reason: collision with root package name */
    int f39506f;
    @Nullable
    a g;
    int h;
    @Nullable
    private b i;
    private HashMap j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/symphony/AdDislikeLayout$IDislike;", "", "onDismiss", "", "onShow", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a();

        void b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/symphony/AdDislikeLayout$IDislikeClick;", "", "onClickDislike", "", "onToggleAutoPlay", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a();

        void b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/commercialize/symphony/AdDislikeLayout$exitDislike$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39517a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdDislikeLayout f39518b;

        c(AdDislikeLayout adDislikeLayout) {
            this.f39518b = adDislikeLayout;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f39517a, false, 32086, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f39517a, false, 32086, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            LinearLayout linearLayout = (LinearLayout) this.f39518b.a(C0906R.id.d3a);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "titleAndOptions");
            linearLayout.setVisibility(8);
            View a2 = this.f39518b.a(C0906R.id.aez);
            Intrinsics.checkExpressionValueIsNotNull(a2, "flDislikeBg");
            a2.setVisibility(8);
            a iDislike = this.f39518b.getIDislike();
            if (iDislike != null) {
                iDislike.a();
            }
            super.onAnimationEnd(animator);
        }
    }

    @JvmOverloads
    public AdDislikeLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public AdDislikeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f39501a, false, 32079, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f39501a, false, 32079, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.j == null) {
            this.j = new HashMap();
        }
        View view = (View) this.j.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.j.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    @Nullable
    public final a getIDislike() {
        return this.g;
    }

    @Nullable
    public final b getIDislikeClick() {
        return this.i;
    }

    public final int getLastY() {
        return this.h;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39501a, false, 32075, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39501a, false, 32075, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.c_, 0).a();
    }

    public final void b() {
        ObjectAnimator objectAnimator;
        if (PatchProxy.isSupport(new Object[0], this, f39501a, false, 32077, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39501a, false, 32077, new Class[0], Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a(C0906R.id.aez), "alpha", new float[]{1.0f, 0.0f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "fadeInBg");
        ofFloat.setDuration(150);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((LinearLayout) a(C0906R.id.d3a), "alpha", new float[]{1.0f, 0.0f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat2, "fadeInContent");
        ofFloat2.setDuration(200);
        if (this.f39502b) {
            objectAnimator = ObjectAnimator.ofFloat((LinearLayout) a(C0906R.id.d3a), "translationY", new float[]{0.0f, this.f39503c});
            Intrinsics.checkExpressionValueIsNotNull(objectAnimator, "ObjectAnimator.ofFloat(t…0f, translationYDistance)");
        } else {
            objectAnimator = ObjectAnimator.ofFloat((LinearLayout) a(C0906R.id.d3a), "translationY", new float[]{this.f39503c, 0.0f});
            Intrinsics.checkExpressionValueIsNotNull(objectAnimator, "ObjectAnimator.ofFloat(t…translationYDistance, 0f)");
        }
        ObjectAnimator duration = objectAnimator.setDuration(250);
        Intrinsics.checkExpressionValueIsNotNull(duration, "jumpContent.setDuration(250)");
        duration.setInterpolator(new com.bytedance.ies.dmt.ui.c.b());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(objectAnimator);
        animatorSet.start();
        animatorSet.addListener(new c(this));
    }

    public final void setIDislike(@Nullable a aVar) {
        this.g = aVar;
    }

    public final void setIDislikeClick(@Nullable b bVar) {
        this.i = bVar;
    }

    public final void setLastY(int i2) {
        this.h = i2;
    }

    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f39501a, false, 32078, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f39501a, false, 32078, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent != null) {
            i2 = (int) motionEvent.getY();
        }
        this.h = i2;
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AdDislikeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        Resources resources;
        int i4;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f39502b = true;
        this.f39503c = (float) u.a(70.0d);
        this.f39504d = u.a(60.0d);
        Resources resources2 = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources2, "context.resources");
        this.f39505e = resources2.getDisplayMetrics().heightPixels - this.f39504d;
        if (com.ss.android.g.a.a()) {
            i3 = 230;
        } else {
            i3 = 210;
        }
        this.f39506f = u.a((double) i3);
        LayoutInflater.from(context).inflate(C0906R.layout.es, this, true);
        a(C0906R.id.aez).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39507a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AdDislikeLayout f39508b;

            {
                this.f39508b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f39507a, false, 32081, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f39507a, false, 32081, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                this.f39508b.b();
            }
        });
        ((TextView) a(C0906R.id.a5i)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39509a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AdDislikeLayout f39510b;

            {
                this.f39510b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f39509a, false, 32082, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f39509a, false, 32082, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                this.f39510b.b();
                b iDislikeClick = this.f39510b.getIDislikeClick();
                if (iDislikeClick != null) {
                    iDislikeClick.a();
                }
            }
        });
        ((TextView) a(C0906R.id.a5i)).setOnTouchListener(new b());
        ((TextView) a(C0906R.id.gz)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39511a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AdDislikeLayout f39512b;

            {
                this.f39512b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f39511a, false, 32083, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f39511a, false, 32083, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                this.f39512b.b();
                b iDislikeClick = this.f39512b.getIDislikeClick();
                if (iDislikeClick != null) {
                    iDislikeClick.b();
                }
            }
        });
        ((TextView) a(C0906R.id.gz)).setOnTouchListener(new b());
        ((TextView) a(C0906R.id.cj8)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39513a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AdDislikeLayout f39514b;

            {
                this.f39514b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f39513a, false, 32084, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f39513a, false, 32084, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                this.f39514b.b();
                this.f39514b.a();
            }
        });
        ((TextView) a(C0906R.id.cj8)).setOnTouchListener(new b());
        ((TextView) a(C0906R.id.u2)).setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39515a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AdDislikeLayout f39516b;

            {
                this.f39516b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f39515a, false, 32085, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f39515a, false, 32085, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                this.f39516b.b();
                this.f39516b.a();
            }
        });
        ((TextView) a(C0906R.id.u2)).setOnTouchListener(new b());
        TextView textView = (TextView) a(C0906R.id.u2);
        if (com.ss.android.g.a.b()) {
            resources = getResources();
            i4 = 2130839772;
        } else {
            resources = getResources();
            i4 = 2130839761;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(null, com.ss.android.ugc.bytex.a.a.a.a(resources, i4), null, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AdDislikeLayout(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
