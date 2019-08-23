package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import com.ss.android.ugc.bytex.a.a.a;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\u001a\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0007J\u0010\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0007J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/themechange/base/AVDmtHorizontalImageTextLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "avDmtImageView", "Lcom/ss/android/ugc/aweme/themechange/base/AVDmtImageView;", "avDmtTextView", "Lcom/ss/android/ugc/aweme/themechange/base/AVDmtTextView;", "imgDrawable", "Landroid/graphics/drawable/Drawable;", "isCurSelected", "", "isShowText", "isShowTextLanguage", "padding", "textContent", "", "addView", "", "boldText", "configView", "init", "setImageRes", "res", "setText", "text", "setTextSize", "size", "showText", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AVDmtHorizontalImageTextLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74546a;

    /* renamed from: b  reason: collision with root package name */
    public AVDmtTextView f74547b;

    /* renamed from: c  reason: collision with root package name */
    private AVDmtImageView f74548c;

    /* renamed from: d  reason: collision with root package name */
    private String f74549d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f74550e;

    /* renamed from: f  reason: collision with root package name */
    private int f74551f;
    private boolean g;
    private boolean h;
    private boolean i;

    @JvmOverloads
    public AVDmtHorizontalImageTextLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public AVDmtHorizontalImageTextLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setImageRes(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74546a, false, 86758, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74546a, false, 86758, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        AVDmtImageView aVDmtImageView = this.f74548c;
        if (aVDmtImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avDmtImageView");
        }
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        aVDmtImageView.setImageDrawable(a.a(context.getResources(), i2));
    }

    public final void setText(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f74546a, false, 86754, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f74546a, false, 86754, new Class[]{String.class}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            AVDmtTextView aVDmtTextView = this.f74547b;
            if (aVDmtTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avDmtTextView");
            }
            aVDmtTextView.setText(charSequence);
        }
    }

    public final void setTextSize(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74546a, false, 86755, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74546a, false, 86755, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        AVDmtTextView aVDmtTextView = this.f74547b;
        if (aVDmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avDmtTextView");
        }
        aVDmtTextView.setTextSize((float) i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AVDmtHorizontalImageTextLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.i = true;
        Drawable a2 = b.f74589e.a(context, attributeSet);
        if (a2 != null) {
            setBackground(a2);
        }
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f74546a, false, 86751, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f74546a, false, 86751, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            this.f74549d = obtainStyledAttributes.getString(32);
            this.f74550e = obtainStyledAttributes.getDrawable(20);
            this.f74551f = (int) obtainStyledAttributes.getDimension(22, 0.0f);
            this.g = obtainStyledAttributes.getBoolean(9, false);
            this.h = obtainStyledAttributes.getBoolean(14, false);
            obtainStyledAttributes.recycle();
        }
        if (this.h) {
            this.i = !com.ss.android.g.a.a();
        }
        if (PatchProxy.isSupport(new Object[]{context2}, this, f74546a, false, 86752, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f74546a, false, 86752, new Class[]{Context.class}, Void.TYPE);
        } else {
            AVDmtTextView aVDmtTextView = new AVDmtTextView(context, null, 0, 6, null);
            this.f74547b = aVDmtTextView;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = (int) UIUtils.dip2Px(context, 8.0f);
            layoutParams.gravity = 16;
            AVDmtTextView aVDmtTextView2 = this.f74547b;
            if (aVDmtTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avDmtTextView");
            }
            aVDmtTextView2.setLayoutParams(layoutParams);
            AVDmtImageView aVDmtImageView = new AVDmtImageView(context, null, 0, 6, null);
            this.f74548c = aVDmtImageView;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 16;
            if (!this.i) {
                layoutParams2.rightMargin = (int) UIUtils.dip2Px(getContext(), 12.0f);
                layoutParams2.leftMargin = layoutParams2.rightMargin;
            }
            AVDmtImageView aVDmtImageView2 = this.f74548c;
            if (aVDmtImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avDmtImageView");
            }
            aVDmtImageView2.setLayoutParams(layoutParams2);
            AVDmtImageView aVDmtImageView3 = this.f74548c;
            if (aVDmtImageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avDmtImageView");
            }
            addView(aVDmtImageView3);
            AVDmtTextView aVDmtTextView3 = this.f74547b;
            if (aVDmtTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avDmtTextView");
            }
            addView(aVDmtTextView3);
        }
        if (PatchProxy.isSupport(new Object[0], this, f74546a, false, 86753, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74546a, false, 86753, new Class[0], Void.TYPE);
            return;
        }
        setPadding(this.f74551f, this.f74551f, this.f74551f, this.f74551f);
        setGravity(17);
        AVDmtTextView aVDmtTextView4 = this.f74547b;
        if (aVDmtTextView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avDmtTextView");
        }
        aVDmtTextView4.setTextSize(13.0f);
        AVDmtTextView aVDmtTextView5 = this.f74547b;
        if (aVDmtTextView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avDmtTextView");
        }
        aVDmtTextView5.setMaxLines(1);
        AVDmtTextView aVDmtTextView6 = this.f74547b;
        if (aVDmtTextView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avDmtTextView");
        }
        aVDmtTextView6.setEllipsize(TextUtils.TruncateAt.END);
        AVDmtTextView aVDmtTextView7 = this.f74547b;
        if (aVDmtTextView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avDmtTextView");
        }
        aVDmtTextView7.setVisibility(8);
        if (!TextUtils.isEmpty(this.f74549d)) {
            AVDmtTextView aVDmtTextView8 = this.f74547b;
            if (aVDmtTextView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avDmtTextView");
            }
            aVDmtTextView8.setText(this.f74549d);
        }
        AVDmtImageView aVDmtImageView4 = this.f74548c;
        if (aVDmtImageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avDmtImageView");
        }
        aVDmtImageView4.setSelected(this.g);
        if (this.f74550e != null) {
            AVDmtImageView aVDmtImageView5 = this.f74548c;
            if (aVDmtImageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avDmtImageView");
            }
            aVDmtImageView5.setImageDrawable(this.f74550e);
        }
        if (this.i) {
            AVDmtTextView aVDmtTextView9 = this.f74547b;
            if (aVDmtTextView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avDmtTextView");
            }
            aVDmtTextView9.setVisibility(0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AVDmtHorizontalImageTextLayout(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
