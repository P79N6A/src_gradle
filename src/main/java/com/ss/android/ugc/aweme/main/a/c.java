package com.ss.android.ugc.aweme.main.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010$\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0005H\u0002J\b\u0010'\u001a\u00020%H\u0016J\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020%J\b\u0010.\u001a\u00020%H\u0002J\b\u0010/\u001a\u00020%H\u0007J\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u00020%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lcom/ss/android/ugc/aweme/main/bubble/NinePatchIconBubble;", "Landroid/widget/PopupWindow;", "context", "Landroid/content/Context;", "anchorView", "Landroid/view/View;", "text", "", "iconUrl", "Lcom/ss/android/ugc/aweme/global/config/settings/pojo/UrlModel;", "dismissDisplay", "", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Lcom/ss/android/ugc/aweme/global/config/settings/pojo/UrlModel;I)V", "getAnchorView", "()Landroid/view/View;", "contentTv", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "getDismissDisplay", "()I", "dismissRunnable", "Ljava/lang/Runnable;", "extraPopHeight", "icon", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getIconUrl", "()Lcom/ss/android/ugc/aweme/global/config/settings/pojo/UrlModel;", "popupHeight", "popupWidth", "rootContainer", "Landroid/widget/FrameLayout;", "getText", "()Ljava/lang/String;", "xOffset", "getXOffset", "setXOffset", "(I)V", "calculateLocate", "", "view", "dismiss", "dismissAnimator", "Landroid/animation/Animator;", "dismissDelayed", "delayMillis", "", "playShowAnimation", "remeasure", "show", "showAnimation", "Landroid/animation/AnimatorSet;", "superDismiss", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54299a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f54300b = new C0628c(this);

    /* renamed from: c  reason: collision with root package name */
    public int f54301c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f54302d;

    /* renamed from: e  reason: collision with root package name */
    public final int f54303e;

    /* renamed from: f  reason: collision with root package name */
    public int f54304f;
    @NotNull
    public final View g;
    @NotNull
    public final String h;
    @Nullable
    public final UrlModel i;
    public final int j;
    private int k;
    private final DmtTextView l;
    private final RemoteImageView m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/main/bubble/NinePatchIconBubble$1$1", "Lcom/facebook/drawee/controller/BaseControllerListener;", "Lcom/facebook/imagepipeline/image/ImageInfo;", "onFailure", "", "id", "", "throwable", "", "onFinalImageSet", "imageInfo", "animatable", "Landroid/graphics/drawable/Animatable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends BaseControllerListener<ImageInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54305a;

        public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
        }

        a() {
        }

        public final void onFailure(@Nullable String str, @Nullable Throwable th) {
            if (PatchProxy.isSupport(new Object[]{str, th}, this, f54305a, false, 57972, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, th}, this, f54305a, false, 57972, new Class[]{String.class, Throwable.class}, Void.TYPE);
                return;
            }
            super.onFailure(str, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/main/bubble/NinePatchIconBubble$dismiss$adaper$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54306a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f54307b;

        b(c cVar) {
            this.f54307b = cVar;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f54306a, false, 57974, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f54306a, false, 57974, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            c cVar = this.f54307b;
            if (PatchProxy.isSupport(new Object[0], cVar, c.f54299a, false, 57966, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f54299a, false, 57966, new Class[0], Void.TYPE);
                return;
            }
            d.a(cVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.main.a.c$c  reason: collision with other inner class name */
    static final class C0628c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f54309b;

        C0628c(c cVar) {
            this.f54309b = cVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f54308a, false, 57975, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54308a, false, 57975, new Class[0], Void.TYPE);
                return;
            }
            this.f54309b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54310a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f54311b;

        public d(c cVar) {
            this.f54311b = cVar;
        }

        public final void run() {
            AnimatorSet animatorSet;
            if (PatchProxy.isSupport(new Object[0], this, f54310a, false, 57976, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54310a, false, 57976, new Class[0], Void.TYPE);
                return;
            }
            c cVar = this.f54311b;
            if (PatchProxy.isSupport(new Object[0], cVar, c.f54299a, false, 57963, new Class[0], AnimatorSet.class)) {
                animatorSet = (AnimatorSet) PatchProxy.accessDispatch(new Object[0], cVar, c.f54299a, false, 57963, new Class[0], AnimatorSet.class);
            } else {
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(cVar.f54302d, "scaleX", new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(cVar.f54302d, "scaleY", new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(cVar.f54302d, "alpha", new float[]{0.0f, 1.0f})});
                animatorSet2.setDuration(300);
                animatorSet = animatorSet2;
            }
            animatorSet.start();
        }
    }

    public final void dismiss() {
        Animator animator;
        if (PatchProxy.isSupport(new Object[0], this, f54299a, false, 57967, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54299a, false, 57967, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f54299a, false, 57964, new Class[0], Animator.class)) {
            animator = (Animator) PatchProxy.accessDispatch(new Object[0], this, f54299a, false, 57964, new Class[0], Animator.class);
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f54302d, "scaleX", new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f54302d, "scaleY", new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f54302d, "alpha", new float[]{1.0f, 0.0f})});
            animatorSet.setDuration(300);
            animator = animatorSet;
        }
        animator.addListener(new b(this));
        animator.start();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, @NotNull View view, @NotNull String str, @Nullable UrlModel urlModel, int i2) {
        super(context);
        int i3;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.g = view;
        this.h = str;
        this.i = urlModel;
        this.j = i2;
        if (com.ss.android.g.a.a()) {
            i3 = -8;
        } else {
            i3 = -1;
        }
        this.f54303e = (int) com.ss.android.ttve.utils.c.a(context, (float) i3);
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.aaw, null);
        View findViewById = inflate.findViewById(C0906R.id.da0);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.tv_content)");
        this.l = (DmtTextView) findViewById;
        View findViewById2 = inflate.findViewById(C0906R.id.pe);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.bubble_icon)");
        this.m = (RemoteImageView) findViewById2;
        if (com.ss.android.g.a.b()) {
            this.l.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.g);
        } else {
            this.l.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.f20594a);
        }
        this.l.setText(this.h);
        View findViewById3 = inflate.findViewById(C0906R.id.ag1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.fl_root_container)");
        this.f54302d = (FrameLayout) findViewById3;
        setContentView(inflate);
        if (this.i != null) {
            try {
                com.ss.android.ugc.aweme.base.model.UrlModel urlModel2 = new com.ss.android.ugc.aweme.base.model.UrlModel();
                urlModel2.setUri(this.i.getUri());
                urlModel2.setUrlList(this.i.getUrlList());
                com.ss.android.ugc.aweme.base.c.a(this.m, urlModel2, (ControllerListener<ImageInfo>) new a<ImageInfo>());
                this.m.setVisibility(0);
            } catch (com.bytedance.ies.a e2) {
                Integer.valueOf(Log.e("fission", e2.toString()));
            }
        }
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        this.f54301c = inflate.getMeasuredHeight();
        this.k = inflate.getMeasuredWidth();
        View view2 = this.g;
        if (PatchProxy.isSupport(new Object[]{context, view2}, this, f54299a, false, 57970, new Class[]{Context.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, view2}, this, f54299a, false, 57970, new Class[]{Context.class, View.class}, Void.TYPE);
            return;
        }
        float a2 = com.ss.android.ttve.utils.c.a(context, 10.0f);
        View contentView = getContentView();
        Intrinsics.checkExpressionValueIsNotNull(contentView, "contentView");
        int measuredWidth = contentView.getMeasuredWidth();
        View contentView2 = getContentView();
        Intrinsics.checkExpressionValueIsNotNull(contentView2, "contentView");
        int measuredHeight = contentView2.getMeasuredHeight();
        ImageView imageView = (ImageView) getContentView().findViewById(C0906R.id.ayy);
        ImageView imageView2 = (ImageView) getContentView().findViewById(C0906R.id.ayz);
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int a3 = com.ss.android.ttve.utils.c.a(context);
        int width = iArr[0] + (view2.getWidth() / 2);
        this.f54304f = 0;
        int i4 = measuredWidth / 2;
        float f2 = (float) width;
        if (((float) i4) + a2 > f2) {
            this.f54304f = (int) (a2 - ((float) iArr[0]));
            Intrinsics.checkExpressionValueIsNotNull(imageView, "left");
            imageView.getLayoutParams().width = (int) (f2 - a2);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "right");
            imageView2.getLayoutParams().width = measuredWidth - imageView.getLayoutParams().width;
        } else {
            float f3 = ((float) a3) - a2;
            if (((float) (width + i4)) > f3) {
                this.f54304f = (int) (f3 - ((float) (iArr[0] + measuredWidth)));
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "right");
                imageView2.getLayoutParams().width = (int) (f3 - f2);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "left");
                imageView.getLayoutParams().width = measuredWidth - imageView2.getLayoutParams().width;
            } else {
                this.f54304f = (view2.getWidth() - measuredWidth) / 2;
                Intrinsics.checkExpressionValueIsNotNull(imageView, "left");
                imageView.getLayoutParams().width = i4;
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "right");
                imageView2.getLayoutParams().width = i4;
            }
        }
        imageView.getLayoutParams().height = measuredHeight;
        imageView2.getLayoutParams().height = measuredHeight;
        if (PatchProxy.isSupport(new Object[0], this, f54299a, false, 57969, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54299a, false, 57969, new Class[0], Void.TYPE);
        } else {
            getContentView().measure(0, 0);
            View contentView3 = getContentView();
            Intrinsics.checkExpressionValueIsNotNull(contentView3, "contentView");
            this.f54301c = contentView3.getMeasuredHeight();
            View contentView4 = getContentView();
            Intrinsics.checkExpressionValueIsNotNull(contentView4, "contentView");
            this.k = contentView4.getMeasuredWidth();
        }
        this.f54302d.setPivotX((float) imageView.getMeasuredWidth());
        this.f54302d.setPivotY((float) measuredHeight);
    }
}
