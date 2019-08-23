package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0012\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J*\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/UnloginDiggToastWindow;", "Landroid/widget/PopupWindow;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dismissRunnable", "Ljava/lang/Runnable;", "animaIn", "", "safeDismiss", "setOnDismissListener", "onDismissListener", "Landroid/widget/PopupWindow$OnDismissListener;", "showAtLocation", "parent", "Landroid/view/View;", "gravity", "", "x", "y", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class bb extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46555a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f46556b = new b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bb f46558b;

        a(bb bbVar) {
            this.f46558b = bbVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f46557a, false, 43083, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f46557a, false, 43083, new Class[0], Void.TYPE);
                return;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                View contentView = this.f46558b.getContentView();
                Intrinsics.checkExpressionValueIsNotNull(contentView, "contentView");
                LinearLayout linearLayout = (LinearLayout) contentView.findViewById(C0906R.id.kt);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "contentView.bg_view");
                Drawable background = linearLayout.getBackground();
                if (background != null) {
                    View contentView2 = this.f46558b.getContentView();
                    Intrinsics.checkExpressionValueIsNotNull(contentView2, "contentView");
                    LinearLayout linearLayout2 = (LinearLayout) contentView2.findViewById(C0906R.id.kt);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "contentView.bg_view");
                    ObjectAnimator duration = ObjectAnimator.ofArgb((GradientDrawable) background, "color", new int[]{0, linearLayout2.getResources().getColor(C0906R.color.hu)}).setDuration(300);
                    View contentView3 = this.f46558b.getContentView();
                    Intrinsics.checkExpressionValueIsNotNull(contentView3, "contentView");
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat((ImageView) contentView3.findViewById(C0906R.id.aq8), "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
                    View contentView4 = this.f46558b.getContentView();
                    Intrinsics.checkExpressionValueIsNotNull(contentView4, "contentView");
                    ObjectAnimator duration3 = ObjectAnimator.ofFloat((DmtTextView) contentView4.findViewById(C0906R.id.a3m), "alpha", new float[]{0.0f, 1.0f}).setDuration(300);
                    Intrinsics.checkExpressionValueIsNotNull(duration3, "descAnima");
                    duration3.setStartDelay(150);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{duration, duration2, duration3});
                    animatorSet.start();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bb f46560b;

        b(bb bbVar) {
            this.f46560b = bbVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f46559a, false, 43084, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f46559a, false, 43084, new Class[0], Void.TYPE);
                return;
            }
            this.f46560b.a();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46555a, false, 43082, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46555a, false, 43082, new Class[0], Void.TYPE);
            return;
        }
        try {
            dismiss();
        } catch (Exception unused) {
        }
    }

    public bb(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        setContentView(LayoutInflater.from(context).inflate(C0906R.layout.abo, null));
        setWidth((int) UIUtils.dip2Px(context, 180.0f));
        setHeight(-2);
        setAnimationStyle(C0906R.style.wy);
    }

    public final void setOnDismissListener(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        if (PatchProxy.isSupport(new Object[]{onDismissListener}, this, f46555a, false, 43080, new Class[]{PopupWindow.OnDismissListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onDismissListener}, this, f46555a, false, 43080, new Class[]{PopupWindow.OnDismissListener.class}, Void.TYPE);
            return;
        }
        super.setOnDismissListener(onDismissListener);
        getContentView().removeCallbacks(this.f46556b);
    }

    public final void showAtLocation(@Nullable View view, int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f46555a, false, 43079, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f46555a, false, 43079, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.showAtLocation(view, i, i2, i3);
        if (PatchProxy.isSupport(new Object[0], this, f46555a, false, 43081, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46555a, false, 43081, new Class[0], Void.TYPE);
        } else {
            getContentView().post(new a(this));
        }
        getContentView().removeCallbacks(this.f46556b);
        getContentView().postDelayed(this.f46556b, 3000);
    }
}
