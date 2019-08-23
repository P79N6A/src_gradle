package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.shortvideo.bc;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0005J\u001a\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\nJ\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u00152\b\b\u0001\u0010 \u001a\u00020\nJ\u0010\u0010\u001f\u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0005J\u0006\u0010$\u001a\u00020\u0015J\u0016\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/themechange/base/AVDmtTabItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "oldPanel", "", "(Landroid/content/Context;Z)V", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dotView", "Landroid/view/View;", "iconImgView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "selectColor", "textView", "Lcom/ss/android/ugc/aweme/themechange/base/AVDmtTextView;", "unSelectColor", "changeTabColor", "", "color", "init", "selected", "isSelected", "setImageUrl", "url", "", "localResId", "setSelected", "setText", "stringRes", "str", "showOrHideDotView", "isShow", "updatePaddingForFilterPage", "updateSizeForEffectEditPage", "position", "count", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74579a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f74580b;

    /* renamed from: c  reason: collision with root package name */
    private AVDmtTextView f74581c;

    /* renamed from: d  reason: collision with root package name */
    private View f74582d;

    /* renamed from: e  reason: collision with root package name */
    private int f74583e;

    /* renamed from: f  reason: collision with root package name */
    private int f74584f;
    private boolean g;

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74579a, false, 86811, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74579a, false, 86811, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            if (z) {
                AVDmtTextView aVDmtTextView = this.f74581c;
                if (aVDmtTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textView");
                }
                aVDmtTextView.a();
                AVDmtTextView aVDmtTextView2 = this.f74581c;
                if (aVDmtTextView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textView");
                }
                aVDmtTextView2.setTypeface(Typeface.defaultFromStyle(1));
                return;
            }
            AVDmtTextView aVDmtTextView3 = this.f74581c;
            if (aVDmtTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(0));
        }
    }

    public final void b(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74579a, false, 86813, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74579a, false, 86813, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.f74582d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dotView");
        }
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void setText(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74579a, false, 86809, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74579a, false, 86809, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        setText(context.getResources().getString(i));
    }

    public final void setSelected(boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74579a, false, 86814, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74579a, false, 86814, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setSelected(z);
        if (z) {
            i = this.f74583e;
        } else {
            i = this.f74584f;
        }
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74579a, false, 86810, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74579a, false, 86810, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            AVDmtTextView aVDmtTextView = this.f74581c;
            if (aVDmtTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textView");
            }
            aVDmtTextView.setTextColor(i2);
            RemoteImageView remoteImageView = this.f74580b;
            if (remoteImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconImgView");
            }
            remoteImageView.setImageAlpha(Color.alpha(i2));
        }
        a(z);
    }

    public final void setText(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f74579a, false, 86808, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f74579a, false, 86808, new Class[]{String.class}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            AVDmtTextView aVDmtTextView = this.f74581c;
            if (aVDmtTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textView");
            }
            aVDmtTextView.setVisibility(0);
            RemoteImageView remoteImageView = this.f74580b;
            if (remoteImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconImgView");
            }
            remoteImageView.setVisibility(8);
            AVDmtTextView aVDmtTextView2 = this.f74581c;
            if (aVDmtTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textView");
            }
            aVDmtTextView2.setText(charSequence);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, boolean z) {
        this(context, null, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.g = z;
        this.f74583e = b.f74589e.a(z);
        this.f74584f = b.a(this.f74583e);
    }

    public final void a(@Nullable String str, @DrawableRes int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f74579a, false, 86812, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f74579a, false, 86812, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            AVDmtTextView aVDmtTextView = this.f74581c;
            if (aVDmtTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textView");
            }
            aVDmtTextView.setVisibility(8);
            RemoteImageView remoteImageView = this.f74580b;
            if (remoteImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconImgView");
            }
            remoteImageView.setVisibility(0);
            if (str == null) {
                Intrinsics.throwNpe();
            }
            if (StringsKt.startsWith$default(str, "res://", false, 2, null)) {
                RemoteImageView remoteImageView2 = this.f74580b;
                if (remoteImageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("iconImgView");
                }
                remoteImageView2.setImageDrawable(b.f74589e.a(getContext(), i, this.g));
                return;
            }
            RemoteImageView remoteImageView3 = this.f74580b;
            if (remoteImageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconImgView");
            }
            c.a(remoteImageView3, str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, null, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f74583e = -1;
        this.f74584f = -1;
        if (PatchProxy.isSupport(new Object[]{context}, this, f74579a, false, 86807, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f74579a, false, 86807, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.se, this, true);
        View findViewById = inflate.findViewById(C0906R.id.cyw);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.tab_item_img)");
        this.f74580b = (RemoteImageView) findViewById;
        View findViewById2 = inflate.findViewById(C0906R.id.cyx);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.tab_item_text)");
        this.f74581c = (AVDmtTextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0906R.id.cyv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.tab_item_dot)");
        this.f74582d = findViewById3;
        int color = context.getResources().getColor(C0906R.color.a1w);
        View view = this.f74582d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dotView");
        }
        view.setBackground(bc.a(color, color, 0));
        AVDmtTextView aVDmtTextView = this.f74581c;
        if (aVDmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textView");
        }
        aVDmtTextView.setTextSize(15.0f);
        if (com.ss.android.g.a.a()) {
            AVDmtTextView aVDmtTextView2 = this.f74581c;
            if (aVDmtTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textView");
            }
            aVDmtTextView2.a();
        } else {
            AVDmtTextView aVDmtTextView3 = this.f74581c;
            if (aVDmtTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(0));
        }
        AVDmtTextView aVDmtTextView4 = this.f74581c;
        if (aVDmtTextView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textView");
        }
        aVDmtTextView4.setSingleLine();
        AVDmtTextView aVDmtTextView5 = this.f74581c;
        if (aVDmtTextView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textView");
        }
        aVDmtTextView5.setEllipsize(TextUtils.TruncateAt.END);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
    }
}
