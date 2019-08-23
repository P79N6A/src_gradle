package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 U2\u00020\u0001:\u0001UB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010.\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u00100\u001a\u00020/2\u0006\u00101\u001a\u000202J\u0018\u00103\u001a\u00020/2\u0006\u00104\u001a\u00020,2\b\u00105\u001a\u0004\u0018\u000106J\u0010\u00107\u001a\u00020/2\b\u00108\u001a\u0004\u0018\u00010\nJ \u00107\u001a\u00020/2\b\u00108\u001a\u0004\u0018\u00010\n2\u0006\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u0007J\u0010\u0010;\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u00010<J\u0010\u0010;\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u00010,J\u0016\u0010=\u001a\u00020/2\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u0007J\u000e\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020\u0017J\b\u0010B\u001a\u00020/H\u0002J\u000e\u0010C\u001a\u00020/2\u0006\u0010D\u001a\u00020\u0017J\u001a\u0010E\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0006\u0010F\u001a\u00020/J\u0016\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020\u00172\u0006\u0010I\u001a\u00020\u0017J\u000e\u0010J\u001a\u00020/2\u0006\u0010K\u001a\u00020\u0017J\u0010\u0010L\u001a\u00020/2\b\u0010M\u001a\u0004\u0018\u00010,J\u0006\u0010N\u001a\u00020/J\u000e\u0010O\u001a\u00020/2\u0006\u0010K\u001a\u00020\u0017J\u000e\u0010P\u001a\u00020/2\u0006\u0010K\u001a\u00020\u0017J\u000e\u0010Q\u001a\u00020/2\u0006\u0010?\u001a\u00020\u0007J\u0006\u0010R\u001a\u00020/J\u0006\u0010S\u001a\u00020/J\u0006\u0010T\u001a\u00020/R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0001X.¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/ss/android/ugc/aweme/themechange/base/AVDmtImageTextView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bgDrawable", "Landroid/graphics/drawable/Drawable;", "borderView", "Landroid/view/View;", "borderWidth", "dmtTextView", "Lcom/ss/android/ugc/aweme/themechange/base/AVDmtTextView;", "dotView", "imageView", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerImageView;", "imageViewHeight", "imageViewWidth", "imgPadding", "isCircleImageView", "", "isOldPanelStyle", "isShowBgDrawable", "isShowBorder", "isShowDotOnImageView", "isShowDotView", "()Z", "isShowDownloadIcon", "isShowText", "isTextMarquee", "loadingImageView", "Landroid/widget/ImageView;", "loadingRotateAnim", "Landroid/view/animation/Animation;", "localDrawable", "placeHolderDrawable", "placeHolderImgDrawableColor", "getPlaceHolderImgDrawableColor", "()I", "roundRadius", "textContent", "", "textLayout", "addView", "", "alphaImageView", "alpha", "", "bindGifView", "url", "config", "Landroid/graphics/Bitmap$Config;", "bindIconImageViewDrawable", "drawable", "changeColor", "padding", "bindIconImageViewUrl", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "changeDownloadState", "state", "progress", "clickStatus", "isStatus", "configView", "enableGifAnimate", "enable", "init", "setBgDrawable", "setForceClip", "forceClip", "invalidate", "setShowDownloadIcon", "show", "setText", "str", "setTextMarquee", "showOrHideDotView", "showOrHideLoadingView", "stateDownloadProgress", "stateDownloaded", "stateDownloading", "stateNotDownload", "Companion", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AVDmtImageTextView extends LinearLayout {
    private static final int A = b.f74588d;
    private static final int B = b.f74587c;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74552a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f74553d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public StickerImageView f74554b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f74555c;

    /* renamed from: e  reason: collision with root package name */
    private AVDmtTextView f74556e;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout f74557f;
    private ImageView g;
    private View h;
    private View i;
    private int j;
    private int k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;
    private Animation r;
    private boolean s;
    private boolean t;
    private Drawable u;
    private String v;
    private int w;
    private Drawable x;
    private boolean y;
    private boolean z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/themechange/base/AVDmtImageTextView$Companion;", "", "()V", "BORDER_WIDTH", "", "PLACE_HOLDER_COLOR_BLACK", "PLACE_HOLDER_COLOR_WHITE", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @JvmOverloads
    public AVDmtImageTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public AVDmtImageTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1, (byte) 0}, this, f74552a, false, 86777, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1, (byte) 0}, this, f74552a, false, 86777, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        StickerImageView stickerImageView = this.f74554b;
        if (stickerImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        }
        stickerImageView.a(true, false);
    }

    public final boolean a() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f74552a, false, 86762, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74552a, false, 86762, new Class[0], Boolean.TYPE)).booleanValue();
        }
        View view = this.i;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dotView");
        }
        if (view.getVisibility() == 0) {
            z2 = true;
        }
        return z2;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f74552a, false, 86780, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74552a, false, 86780, new Class[0], Void.TYPE);
            return;
        }
        StickerImageView stickerImageView = this.f74554b;
        if (stickerImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        }
        stickerImageView.a();
    }

    private final int getPlaceHolderImgDrawableColor() {
        if (PatchProxy.isSupport(new Object[0], this, f74552a, false, 86761, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f74552a, false, 86761, new Class[0], Integer.TYPE)).intValue();
        } else if (b.f74589e.d()) {
            return B;
        } else {
            if (!com.ss.android.g.a.b() || this.q) {
                return B;
            }
            return A;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74552a, false, 86768, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74552a, false, 86768, new Class[0], Void.TYPE);
            return;
        }
        this.y = true;
        AVDmtTextView aVDmtTextView = this.f74556e;
        if (aVDmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
        }
        aVDmtTextView.setSingleLine();
        AVDmtTextView aVDmtTextView2 = this.f74556e;
        if (aVDmtTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
        }
        aVDmtTextView2.setHorizontalFadingEdgeEnabled(true);
        AVDmtTextView aVDmtTextView3 = this.f74556e;
        if (aVDmtTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
        }
        aVDmtTextView3.setFadingEdgeLength((int) UIUtils.dip2Px(getContext(), 4.0f));
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f74552a, false, 86769, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f74552a, false, 86769, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        StickerImageView stickerImageView = this.f74554b;
        if (stickerImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        }
        stickerImageView.setAlpha(f2);
    }

    public final void c(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74552a, false, 86779, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74552a, false, 86779, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.i;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dotView");
        }
        if (!z2) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final void setShowDownloadIcon(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74552a, false, 86784, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74552a, false, 86784, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        StickerImageView stickerImageView = this.f74554b;
        if (stickerImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        }
        stickerImageView.setShowDownloadIcon(z2);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74552a, false, 86782, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74552a, false, 86782, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        StickerImageView stickerImageView = this.f74554b;
        if (stickerImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        }
        stickerImageView.a(i2);
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74552a, false, 86778, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74552a, false, 86778, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z2) {
            ImageView imageView = this.g;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingImageView");
            }
            imageView.clearAnimation();
            ImageView imageView2 = this.g;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingImageView");
            }
            imageView2.setVisibility(0);
            ImageView imageView3 = this.g;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingImageView");
            }
            imageView3.startAnimation(this.r);
        } else {
            ImageView imageView4 = this.g;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingImageView");
            }
            imageView4.setVisibility(8);
            ImageView imageView5 = this.g;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingImageView");
            }
            imageView5.clearAnimation();
        }
    }

    public final void setText(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f74552a, false, 86766, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f74552a, false, 86766, new Class[]{String.class}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            AVDmtTextView aVDmtTextView = this.f74556e;
            if (aVDmtTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
            }
            if (((int) aVDmtTextView.getPaint().measureText(str)) <= this.j) {
                AVDmtTextView aVDmtTextView2 = this.f74556e;
                if (aVDmtTextView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
                }
                aVDmtTextView2.setGravity(17);
            } else if (this.y) {
                AVDmtTextView aVDmtTextView3 = this.f74556e;
                if (aVDmtTextView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
                }
                aVDmtTextView3.setGravity(3);
            } else {
                AVDmtTextView aVDmtTextView4 = this.f74556e;
                if (aVDmtTextView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
                }
                aVDmtTextView4.setGravity(17);
            }
            LinearLayout linearLayout = this.f74557f;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textLayout");
            }
            linearLayout.setVisibility(0);
            AVDmtTextView aVDmtTextView5 = this.f74556e;
            if (aVDmtTextView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
            }
            aVDmtTextView5.setVisibility(0);
            AVDmtTextView aVDmtTextView6 = this.f74556e;
            if (aVDmtTextView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
            }
            aVDmtTextView6.setText(charSequence);
        }
    }

    public final void a(@Nullable Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f74552a, false, 86774, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f74552a, false, 86774, new Class[]{Drawable.class}, Void.TYPE);
        } else if (drawable2 != null) {
            StickerImageView stickerImageView = this.f74554b;
            if (stickerImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
            }
            stickerImageView.a(drawable2);
        }
    }

    public final void a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f74552a, false, 86770, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f74552a, false, 86770, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str2)) {
            StickerImageView stickerImageView = this.f74554b;
            if (stickerImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
            }
            stickerImageView.a(str2);
        }
    }

    public final void a(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74552a, false, 86767, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f74552a, false, 86767, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.o) {
            AVDmtTextView aVDmtTextView = this.f74556e;
            if (aVDmtTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
            }
            aVDmtTextView.a(z2);
            AVDmtTextView aVDmtTextView2 = this.f74556e;
            if (aVDmtTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
            }
            aVDmtTextView2.setSelected(z2);
        }
        if (this.n) {
            View view = this.h;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("borderView");
            }
            if (!z2) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        if (!z2 || !this.y) {
            AVDmtTextView aVDmtTextView3 = this.f74556e;
            if (aVDmtTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
            }
            aVDmtTextView3.setEllipsize(null);
            return;
        }
        AVDmtTextView aVDmtTextView4 = this.f74556e;
        if (aVDmtTextView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
        }
        aVDmtTextView4.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AVDmtImageTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Drawable drawable;
        int i3;
        int i4;
        int i5;
        int i6;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        Intrinsics.checkParameterIsNotNull(context2, "context");
        this.t = true;
        this.y = true;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f74552a, false, 86763, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f74552a, false, 86763, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        setOrientation(1);
        this.p = (int) UIUtils.dip2Px(context2, 2.0f);
        this.r = AnimationUtils.loadAnimation(context2, C0906R.anim.cf);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, R$styleable.AVDmtView);
            this.j = (int) obtainStyledAttributes.getDimension(16, 0.0f);
            this.k = (int) obtainStyledAttributes.getDimension(15, 0.0f);
            this.l = obtainStyledAttributes.getBoolean(7, false);
            this.m = (int) obtainStyledAttributes.getDimension(24, 0.0f);
            this.n = obtainStyledAttributes.getBoolean(10, true);
            this.o = obtainStyledAttributes.getBoolean(13, true);
            this.s = obtainStyledAttributes.getBoolean(12, true);
            this.t = obtainStyledAttributes.getBoolean(11, true);
            this.v = obtainStyledAttributes.getString(32);
            this.u = obtainStyledAttributes.getDrawable(20);
            this.w = (int) obtainStyledAttributes.getDimension(22, 0.0f);
            this.q = obtainStyledAttributes.getBoolean(21, false);
            this.y = obtainStyledAttributes.getBoolean(29, true);
            this.z = obtainStyledAttributes.getBoolean(27, false);
            this.x = obtainStyledAttributes.getDrawable(23);
            this.x = b.f74589e.a(this.x, b.f74589e.a(this.q));
            obtainStyledAttributes.recycle();
        }
        if (PatchProxy.isSupport(new Object[]{context2}, this, f74552a, false, 86764, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f74552a, false, 86764, new Class[]{Context.class}, Void.TYPE);
        } else {
            this.f74554b = new StickerImageView(context2, null, 2, null);
            AVDmtTextView aVDmtTextView = new AVDmtTextView(context, null, 0, 6, null);
            this.f74556e = aVDmtTextView;
            this.h = new View(context2);
            FrameLayout frameLayout = new FrameLayout(context2);
            if (this.n) {
                i6 = (this.p * 2) + this.j;
                i5 = (this.p * 2) + this.k;
            } else {
                i6 = this.j;
                i5 = this.k;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, i5);
            layoutParams.gravity = 1;
            frameLayout.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.j, this.k);
            layoutParams2.gravity = 17;
            StickerImageView stickerImageView = this.f74554b;
            if (stickerImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
            }
            stickerImageView.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i6, i5);
            View view = this.h;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("borderView");
            }
            view.setLayoutParams(layoutParams3);
            this.g = new ImageView(context2);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 17;
            ImageView imageView = this.g;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingImageView");
            }
            imageView.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838769));
            ImageView imageView2 = this.g;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingImageView");
            }
            imageView2.setLayoutParams(layoutParams4);
            StickerImageView stickerImageView2 = this.f74554b;
            if (stickerImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
            }
            frameLayout.addView(stickerImageView2);
            View view2 = this.h;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("borderView");
            }
            frameLayout.addView(view2);
            ImageView imageView3 = this.g;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingImageView");
            }
            frameLayout.addView(imageView3);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(this.j, -2);
            layoutParams5.gravity = 1;
            layoutParams5.topMargin = (int) UIUtils.dip2Px(getContext(), 4.0f);
            this.f74557f = new LinearLayout(context2);
            LinearLayout linearLayout = this.f74557f;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textLayout");
            }
            linearLayout.setLayoutParams(layoutParams5);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.weight = 1.0f;
            layoutParams6.gravity = 1;
            AVDmtTextView aVDmtTextView2 = this.f74556e;
            if (aVDmtTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
            }
            aVDmtTextView2.setLayoutParams(layoutParams6);
            AVDmtTextView aVDmtTextView3 = this.f74556e;
            if (aVDmtTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
            }
            aVDmtTextView3.setGravity(17);
            LinearLayout linearLayout2 = this.f74557f;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textLayout");
            }
            AVDmtTextView aVDmtTextView4 = this.f74556e;
            if (aVDmtTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
            }
            linearLayout2.addView(aVDmtTextView4);
            this.i = new View(context2);
            int dip2Px = (int) UIUtils.dip2Px(context2, 6.0f);
            if (this.t) {
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(dip2Px, dip2Px);
                layoutParams7.gravity = 53;
                View view3 = this.i;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dotView");
                }
                view3.setLayoutParams(layoutParams7);
                View view4 = this.i;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dotView");
                }
                frameLayout.addView(view4);
            } else {
                LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(dip2Px, dip2Px);
                layoutParams8.gravity = 53;
                layoutParams8.weight = 0.0f;
                View view5 = this.i;
                if (view5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dotView");
                }
                view5.setLayoutParams(layoutParams8);
                LinearLayout linearLayout3 = this.f74557f;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textLayout");
                }
                View view6 = this.i;
                if (view6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dotView");
                }
                linearLayout3.addView(view6);
            }
            addView(frameLayout);
            LinearLayout linearLayout4 = this.f74557f;
            if (linearLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textLayout");
            }
            addView(linearLayout4);
        }
        if (PatchProxy.isSupport(new Object[0], this, f74552a, false, 86765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74552a, false, 86765, new Class[0], Void.TYPE);
            return;
        }
        RoundingParams roundingParams = new RoundingParams();
        GenericDraweeHierarchy build = new GenericDraweeHierarchyBuilder(getResources()).build();
        int placeHolderImgDrawableColor = getPlaceHolderImgDrawableColor();
        int color = getResources().getColor(C0906R.color.a1w);
        if (this.l) {
            roundingParams.setRoundAsCircle(true);
            Intrinsics.checkExpressionValueIsNotNull(build, "hierarchy");
            build.setRoundingParams(roundingParams);
            drawable = bc.a(color, 0, this.p);
            Intrinsics.checkExpressionValueIsNotNull(drawable, "DmtDesignDrawableFactory…TRANSPARENT, borderWidth)");
            if (this.x == null) {
                this.x = bc.a(placeHolderImgDrawableColor, placeHolderImgDrawableColor, 0);
            }
            this.f74555c = bc.a(placeHolderImgDrawableColor, placeHolderImgDrawableColor, 0);
        } else {
            roundingParams.setRoundAsCircle(false);
            roundingParams.setCornersRadius((float) this.m);
            drawable = bc.a(color, 0, this.p, this.m);
            Intrinsics.checkExpressionValueIsNotNull(drawable, "DmtDesignDrawableFactory…borderWidth, roundRadius)");
            if (this.x == null) {
                this.x = bc.a(placeHolderImgDrawableColor, placeHolderImgDrawableColor, 0, this.m);
            }
            this.f74555c = bc.a(placeHolderImgDrawableColor, placeHolderImgDrawableColor, 0, this.m);
        }
        Intrinsics.checkExpressionValueIsNotNull(build, "hierarchy");
        build.setRoundingParams(roundingParams);
        build.setPlaceholderImage(this.x);
        build.setFailureImage(this.x);
        StickerImageView stickerImageView3 = this.f74554b;
        if (stickerImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        }
        stickerImageView3.setImageHierarchy(build);
        StickerImageView stickerImageView4 = this.f74554b;
        if (stickerImageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        }
        boolean z2 = this.s;
        int i7 = 8;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, stickerImageView4, StickerImageView.f69223a, false, 78692, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, stickerImageView4, StickerImageView.f69223a, false, 78692, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            ImageView imageView4 = stickerImageView4.f69225c;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("downloadImg");
            }
            if (z2) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageView4.setVisibility(i4);
        }
        StickerImageView stickerImageView5 = this.f74554b;
        if (stickerImageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        }
        stickerImageView5.setPadding(this.w, this.w, this.w, this.w);
        if (this.z) {
            StickerImageView stickerImageView6 = this.f74554b;
            if (stickerImageView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
            }
            stickerImageView6.setBackground(this.f74555c);
        }
        View view7 = this.h;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("borderView");
        }
        view7.setBackground(drawable);
        View view8 = this.h;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("borderView");
        }
        view8.setVisibility(8);
        ImageView imageView5 = this.g;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingImageView");
        }
        imageView5.setVisibility(8);
        LinearLayout linearLayout5 = this.f74557f;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textLayout");
        }
        if (this.o) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        linearLayout5.setVisibility(i3);
        AVDmtTextView aVDmtTextView5 = this.f74556e;
        if (aVDmtTextView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
        }
        aVDmtTextView5.setVisibility(this.o ? 0 : i7);
        if (this.y) {
            b();
        }
        AVDmtTextView aVDmtTextView6 = this.f74556e;
        if (aVDmtTextView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
        }
        if (PatchProxy.isSupport(new Object[0], aVDmtTextView6, AVDmtTextView.f74573a, false, 86835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVDmtTextView6, AVDmtTextView.f74573a, false, 86835, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            aVDmtTextView6.setTextSize(12.0f);
            aVDmtTextView6.a();
        } else {
            aVDmtTextView6.setTextSize(11.0f);
            aVDmtTextView6.setTypeface(Typeface.defaultFromStyle(0));
        }
        AVDmtTextView aVDmtTextView7 = this.f74556e;
        if (aVDmtTextView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dmtTextView");
        }
        aVDmtTextView7.setOldPanelStyle(this.q);
        Drawable a2 = bc.a(color, color, this.p);
        View view9 = this.i;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dotView");
        }
        view9.setBackground(a2);
        c(false);
        if (this.u != null) {
            this.u = b.f74589e.a(this.u, this.q);
            StickerImageView stickerImageView7 = this.f74554b;
            if (stickerImageView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
            }
            stickerImageView7.setIconImageViewScaleType(ScalingUtils.ScaleType.CENTER_CROP);
            StickerImageView stickerImageView8 = this.f74554b;
            if (stickerImageView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
            }
            stickerImageView8.a(this.u);
            StickerImageView stickerImageView9 = this.f74554b;
            if (stickerImageView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
            }
            stickerImageView9.setBackground(this.f74555c);
        }
        if (!TextUtils.isEmpty(this.v)) {
            setText(this.v);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AVDmtImageTextView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
