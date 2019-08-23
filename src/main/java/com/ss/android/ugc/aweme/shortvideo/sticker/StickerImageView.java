package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.views.CircleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001a\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0016\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\fJ\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0016\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fJ\u0010\u0010&\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010(J\u0010\u0010)\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010+J\u000e\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\fJ\u000e\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\fJ\u000e\u00100\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u00101\u001a\u00020\u0012J\u0006\u00102\u001a\u00020\u0012J\u0006\u00103\u001a\u00020\u0012J\u0006\u00104\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerImageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "downloadImg", "Landroid/widget/ImageView;", "iconImageView", "Lcom/ss/android/ugc/aweme/views/CircleDraweeView;", "isShowDownloadIcon", "", "mRootView", "Landroid/view/View;", "progressView", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/AVCircleProgressView;", "bindGif", "", "url", "", "config", "Landroid/graphics/Bitmap$Config;", "bindIconImageViewDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "bindIconImageViewUrl", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "changeDownloadState", "state", "", "progress", "enableAnimate", "anim", "initView", "setForceClip", "clip", "invalidate", "setIconImageViewScaleType", "scaleType", "Lcom/facebook/drawee/drawable/ScalingUtils$ScaleType;", "setImageHierarchy", "hierarchy", "Lcom/facebook/drawee/generic/GenericDraweeHierarchy;", "setShowDownloadIcon", "show", "showOrHideDownloadIcon", "isShow", "stateDownloadProgress", "stateDownloaded", "stateDownloading", "stateNotDownload", "statePrefetch", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StickerImageView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69223a;

    /* renamed from: b  reason: collision with root package name */
    public CircleDraweeView f69224b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f69225c;

    /* renamed from: d  reason: collision with root package name */
    private AVCircleProgressView f69226d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f69227e;

    /* renamed from: f  reason: collision with root package name */
    private View f69228f;

    @JvmOverloads
    public StickerImageView(@NotNull Context context) {
        this(context, null, 2, null);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69223a, false, 78685, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69223a, false, 78685, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        CircleDraweeView circleDraweeView = this.f69224b;
        if (circleDraweeView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconImageView");
        }
        circleDraweeView.a(z);
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f69223a, false, 78686, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f69223a, false, 78686, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        CircleDraweeView circleDraweeView = this.f69224b;
        if (circleDraweeView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconImageView");
        }
        circleDraweeView.a(z, z2);
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f69223a, false, 78691, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69223a, false, 78691, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.f69225c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadImg");
        }
        imageView.setVisibility(4);
        AVCircleProgressView aVCircleProgressView = this.f69226d;
        if (aVCircleProgressView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
        }
        aVCircleProgressView.setVisibility(4);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f69223a, false, 78687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69223a, false, 78687, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.f69225c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadImg");
        }
        imageView.setVisibility(4);
        AVCircleProgressView aVCircleProgressView = this.f69226d;
        if (aVCircleProgressView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
        }
        aVCircleProgressView.setVisibility(4);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f69223a, false, 78688, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69223a, false, 78688, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.f69225c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadImg");
        }
        imageView.setVisibility(4);
        AVCircleProgressView aVCircleProgressView = this.f69226d;
        if (aVCircleProgressView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
        }
        aVCircleProgressView.setVisibility(0);
        AVCircleProgressView aVCircleProgressView2 = this.f69226d;
        if (aVCircleProgressView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
        }
        aVCircleProgressView2.setProgress(0);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f69223a, false, 78690, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69223a, false, 78690, new Class[0], Void.TYPE);
            return;
        }
        if (this.f69227e) {
            ImageView imageView = this.f69225c;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("downloadImg");
            }
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = this.f69225c;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("downloadImg");
            }
            imageView2.setVisibility(4);
        }
        AVCircleProgressView aVCircleProgressView = this.f69226d;
        if (aVCircleProgressView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
        }
        aVCircleProgressView.setVisibility(4);
    }

    public final void setShowDownloadIcon(boolean z) {
        this.f69227e = z;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69223a, false, 78689, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69223a, false, 78689, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ImageView imageView = this.f69225c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadImg");
        }
        imageView.setVisibility(4);
        AVCircleProgressView aVCircleProgressView = this.f69226d;
        if (aVCircleProgressView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
        }
        if (aVCircleProgressView.getVisibility() != 0) {
            AVCircleProgressView aVCircleProgressView2 = this.f69226d;
            if (aVCircleProgressView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressView");
            }
            aVCircleProgressView2.setVisibility(0);
        }
        AVCircleProgressView aVCircleProgressView3 = this.f69226d;
        if (aVCircleProgressView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
        }
        aVCircleProgressView3.setProgress(i);
    }

    public final void setIconImageViewScaleType(@Nullable ScalingUtils.ScaleType scaleType) {
        ScalingUtils.ScaleType scaleType2 = scaleType;
        if (PatchProxy.isSupport(new Object[]{scaleType2}, this, f69223a, false, 78684, new Class[]{ScalingUtils.ScaleType.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{scaleType2}, this, f69223a, false, 78684, new Class[]{ScalingUtils.ScaleType.class}, Void.TYPE);
            return;
        }
        CircleDraweeView circleDraweeView = this.f69224b;
        if (circleDraweeView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconImageView");
        }
        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) circleDraweeView.getHierarchy();
        Intrinsics.checkExpressionValueIsNotNull(genericDraweeHierarchy, "iconImageView.hierarchy");
        genericDraweeHierarchy.setActualImageScaleType(scaleType2);
    }

    public final void setImageHierarchy(@Nullable GenericDraweeHierarchy genericDraweeHierarchy) {
        if (PatchProxy.isSupport(new Object[]{genericDraweeHierarchy}, this, f69223a, false, 78683, new Class[]{GenericDraweeHierarchy.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{genericDraweeHierarchy}, this, f69223a, false, 78683, new Class[]{GenericDraweeHierarchy.class}, Void.TYPE);
            return;
        }
        CircleDraweeView circleDraweeView = this.f69224b;
        if (circleDraweeView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconImageView");
        }
        circleDraweeView.setHierarchy(genericDraweeHierarchy);
    }

    public final void a(@Nullable Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f69223a, false, 78679, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f69223a, false, 78679, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        CircleDraweeView circleDraweeView = this.f69224b;
        if (circleDraweeView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconImageView");
        }
        circleDraweeView.setImageDrawable(drawable2);
    }

    public final void a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f69223a, false, 78680, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f69223a, false, 78680, new Class[]{String.class}, Void.TYPE);
            return;
        }
        CircleDraweeView circleDraweeView = this.f69224b;
        if (circleDraweeView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconImageView");
        }
        c.a((RemoteImageView) circleDraweeView, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0054, code lost:
        r0 = r17;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r18, int r19) {
        /*
            r17 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r8 = 0
            r1[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r9 = 1
            r1[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f69223a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r8] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 78678(0x13356, float:1.10251E-40)
            r2 = r17
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0051
            java.lang.Object[] r10 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r10[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r10[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r12 = f69223a
            r13 = 0
            r14 = 78678(0x13356, float:1.10251E-40)
            java.lang.Class[] r15 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r15[r8] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0051:
            switch(r18) {
                case 1: goto L_0x0071;
                case 2: goto L_0x006b;
                case 3: goto L_0x0065;
                case 4: goto L_0x005f;
                case 5: goto L_0x0057;
                default: goto L_0x0054;
            }
        L_0x0054:
            r0 = r17
            goto L_0x0077
        L_0x0057:
            r0 = r17
            r1 = r19
            r0.a((int) r1)
            return
        L_0x005f:
            r0 = r17
            r17.d()
            goto L_0x0077
        L_0x0065:
            r0 = r17
            r17.c()
            return
        L_0x006b:
            r0 = r17
            r17.b()
            return
        L_0x0071:
            r0 = r17
            r17.a()
            return
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.StickerImageView.a(int, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StickerImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[]{context}, this, f69223a, false, 78677, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f69223a, false, 78677, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.a1i, null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…ut_av_sticker_view, null)");
        this.f69228f = inflate;
        View view = this.f69228f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById = view.findViewById(C0906R.id.atq);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R.id.img_sticker_icon)");
        this.f69224b = (CircleDraweeView) findViewById;
        View view2 = this.f69228f;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById2 = view2.findViewById(C0906R.id.ats);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.findViewById(R.id.img_sticker_loading)");
        this.f69225c = (ImageView) findViewById2;
        View view3 = this.f69228f;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById3 = view3.findViewById(C0906R.id.b2w);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mRootView.findViewById(R.id.iv_loading)");
        this.f69226d = (AVCircleProgressView) findViewById3;
        if (a.b()) {
            AVCircleProgressView aVCircleProgressView = this.f69226d;
            if (aVCircleProgressView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressView");
            }
            aVCircleProgressView.setBgCircleColor(536870912);
        } else {
            AVCircleProgressView aVCircleProgressView2 = this.f69226d;
            if (aVCircleProgressView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressView");
            }
            aVCircleProgressView2.setBgCircleColor(637534208);
        }
        AVCircleProgressView aVCircleProgressView3 = this.f69226d;
        if (aVCircleProgressView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
        }
        aVCircleProgressView3.setProgressColor(-1);
        AVCircleProgressView aVCircleProgressView4 = this.f69226d;
        if (aVCircleProgressView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
        }
        aVCircleProgressView4.setMaxProgress(100);
        AVCircleProgressView aVCircleProgressView5 = this.f69226d;
        if (aVCircleProgressView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
        }
        aVCircleProgressView5.setCircleWidth((int) UIUtils.dip2Px(context, 2.0f));
        AVCircleProgressView aVCircleProgressView6 = this.f69226d;
        if (aVCircleProgressView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressView");
        }
        aVCircleProgressView6.setBgCircleWidth((int) UIUtils.dip2Px(context, 3.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View view4 = this.f69228f;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view4.setLayoutParams(layoutParams);
        View view5 = this.f69228f;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        addView(view5);
    }

    public final void a(@Nullable String str, @Nullable Bitmap.Config config) {
        String str2 = str;
        Bitmap.Config config2 = config;
        if (PatchProxy.isSupport(new Object[]{str2, config2}, this, f69223a, false, 78682, new Class[]{String.class, Bitmap.Config.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, config2}, this, f69223a, false, 78682, new Class[]{String.class, Bitmap.Config.class}, Void.TYPE);
            return;
        }
        CircleDraweeView circleDraweeView = this.f69224b;
        if (circleDraweeView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconImageView");
        }
        circleDraweeView.a(str2, config2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickerImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
