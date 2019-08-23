package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0014\u001a\u00020\tJ\u0006\u0010\u0015\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0010\u0010!\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010 J\u0010\u0010#\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010$\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010 J\u000e\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(J\"\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010*J\u000e\u0010,\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(J\"\u0010,\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010*R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/VideoFloatingCard;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionButton", "Landroid/widget/FrameLayout;", "actionTitleView", "Landroid/widget/TextView;", "closeView", "Landroid/widget/ImageView;", "descView", "iconView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "ivBackground", "ivButtonBackground", "titleView", "getButton", "getCloseView", "init", "", "setButtonBackground", "urlModel", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setButtonBackgroundColors", "colors", "", "setButtonText", "text", "", "setDesc", "desc", "setIcon", "setTitle", "title", "translationOutScreen", "duration", "", "startAction", "Ljava/lang/Runnable;", "endAction", "translationToScreen", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoFloatingCard extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46330a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f46331b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f46332c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteImageView f46333d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f46334e;

    /* renamed from: f  reason: collision with root package name */
    private FrameLayout f46335f;
    private TextView g;
    private ImageView h;
    private RemoteImageView i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f46337b;

        a(Runnable runnable) {
            this.f46337b = runnable;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f46336a, false, 43247, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f46336a, false, 43247, new Class[0], Void.TYPE);
                return;
            }
            Runnable runnable = this.f46337b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f46339b;

        b(Runnable runnable) {
            this.f46339b = runnable;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f46338a, false, 43248, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f46338a, false, 43248, new Class[0], Void.TYPE);
                return;
            }
            Runnable runnable = this.f46339b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46340a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f46341b;

        public c(Runnable runnable) {
            this.f46341b = runnable;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f46340a, false, 43249, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f46340a, false, 43249, new Class[0], Void.TYPE);
                return;
            }
            Runnable runnable = this.f46341b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46342a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f46343b;

        public d(Runnable runnable) {
            this.f46343b = runnable;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f46342a, false, 43250, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f46342a, false, 43250, new Class[0], Void.TYPE);
                return;
            }
            Runnable runnable = this.f46343b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @NotNull
    public final FrameLayout getButton() {
        if (PatchProxy.isSupport(new Object[0], this, f46330a, false, 43244, new Class[0], FrameLayout.class)) {
            return (FrameLayout) PatchProxy.accessDispatch(new Object[0], this, f46330a, false, 43244, new Class[0], FrameLayout.class);
        }
        FrameLayout frameLayout = this.f46335f;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionButton");
        }
        return frameLayout;
    }

    @NotNull
    public final ImageView getCloseView() {
        if (PatchProxy.isSupport(new Object[0], this, f46330a, false, 43243, new Class[0], ImageView.class)) {
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, f46330a, false, 43243, new Class[0], ImageView.class);
        }
        ImageView imageView = this.f46334e;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeView");
        }
        return imageView;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VideoFloatingCard(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setButtonBackground(@Nullable UrlModel urlModel) {
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{urlModel2}, this, f46330a, false, 43238, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel2}, this, f46330a, false, 43238, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        RemoteImageView remoteImageView = this.i;
        if (remoteImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivButtonBackground");
        }
        com.ss.android.ugc.aweme.base.c.b(remoteImageView, urlModel2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setButtonBackgroundColors(@org.jetbrains.annotations.NotNull int[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f46330a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<int[]> r3 = int[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 43236(0xa8e4, float:6.0587E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f46330a
            r13 = 0
            r14 = 43236(0xa8e4, float:6.0587E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            java.lang.String r2 = "colors"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r3 = com.ss.android.ugc.aweme.base.utils.u.a((double) r3)
            float r3 = (float) r3
            r4 = 8
            float[] r4 = new float[r4]
            r5 = 0
            r4[r9] = r5
            r4[r1] = r5
            r1 = 2
            r4[r1] = r5
            r1 = 3
            r4[r1] = r5
            r1 = 4
            r4[r1] = r3
            r1 = 5
            r4[r1] = r3
            r1 = 6
            r4[r1] = r3
            r1 = 7
            r4[r1] = r3
            r2.setCornerRadii(r4)
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            r2.setOrientation(r1)
            r2.setColors(r0)
            r0 = r17
            android.widget.FrameLayout r1 = r0.f46335f
            if (r1 != 0) goto L_0x0078
            java.lang.String r3 = "actionButton"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0078:
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r1.setBackground(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard.setButtonBackgroundColors(int[]):void");
    }

    public final void setButtonText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f46330a, false, 43237, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f46330a, false, 43237, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        TextView textView = this.g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionTitleView");
        }
        textView.setText(charSequence2);
    }

    public final void setDesc(@Nullable CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f46330a, false, 43234, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f46330a, false, 43234, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        TextView textView = this.f46332c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("descView");
        }
        textView.setText(charSequence2);
    }

    public final void setIcon(@Nullable UrlModel urlModel) {
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{urlModel2}, this, f46330a, false, 43235, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel2}, this, f46330a, false, 43235, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        RemoteImageView remoteImageView = this.f46333d;
        if (remoteImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconView");
        }
        com.ss.android.ugc.aweme.base.c.b(remoteImageView, urlModel2);
    }

    public final void setTitle(@Nullable CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f46330a, false, 43233, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f46330a, false, 43233, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        TextView textView = this.f46331b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        textView.setText(charSequence2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoFloatingCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[0], this, f46330a, false, 43232, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46330a, false, 43232, new Class[0], Void.TYPE);
            return;
        }
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(C0906R.layout.asd, this, true);
        View findViewById = findViewById(C0906R.id.dkk);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.tv_title)");
        this.f46331b = (TextView) findViewById;
        View findViewById2 = findViewById(C0906R.id.dau);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.tv_desc)");
        this.f46332c = (TextView) findViewById2;
        View findViewById3 = findViewById(C0906R.id.b2_);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.iv_icon)");
        this.f46333d = (RemoteImageView) findViewById3;
        View findViewById4 = findViewById(C0906R.id.azy);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.iv_close)");
        this.f46334e = (ImageView) findViewById4;
        View findViewById5 = findViewById(C0906R.id.nn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.btn_action)");
        this.f46335f = (FrameLayout) findViewById5;
        View findViewById6 = findViewById(C0906R.id.d9r);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.tv_btn_title)");
        this.g = (TextView) findViewById6;
        View findViewById7 = findViewById(C0906R.id.ayx);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.iv_background)");
        this.h = (ImageView) findViewById7;
        View findViewById8 = findViewById(C0906R.id.azg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "findViewById(R.id.iv_button_bg)");
        this.i = (RemoteImageView) findViewById8;
    }

    public final void a(long j, @Nullable Runnable runnable, @Nullable Runnable runnable2) {
        long j2 = j;
        Runnable runnable3 = runnable2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), null, runnable3}, this, f46330a, false, 43242, new Class[]{Long.TYPE, Runnable.class, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), null, runnable3}, this, f46330a, false, 43242, new Class[]{Long.TYPE, Runnable.class, Runnable.class}, Void.TYPE);
            return;
        }
        animate().translationX(-((float) v.b((View) this).right)).alpha(0.0f).withStartAction(new a(null)).setDuration(j2).withEndAction(new b(runnable3)).start();
    }
}
