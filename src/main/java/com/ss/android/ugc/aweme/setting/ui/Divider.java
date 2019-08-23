package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/ui/Divider;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "txtLeft", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "underLine", "Landroid/view/View;", "view", "getBaseStyle", "", "initView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class Divider extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64142a;

    /* renamed from: b  reason: collision with root package name */
    private View f64143b;

    /* renamed from: c  reason: collision with root package name */
    private DmtTextView f64144c;

    /* renamed from: d  reason: collision with root package name */
    private View f64145d;

    @JvmOverloads
    public Divider(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public Divider(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Divider(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        DmtTextView dmtTextView;
        View view;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        Intrinsics.checkParameterIsNotNull(context, "context");
        ViewGroup.LayoutParams layoutParams = null;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f64142a, false, 72466, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f64142a, false, 72466, new Class[]{Context.class}, Void.TYPE);
        } else {
            this.f64143b = View.inflate(context, C0906R.layout.ap5, this);
            View view2 = this.f64143b;
            if (view2 != null) {
                dmtTextView = (DmtTextView) view2.findViewById(C0906R.id.ddn);
            } else {
                dmtTextView = null;
            }
            this.f64144c = dmtTextView;
            View view3 = this.f64143b;
            if (view3 != null) {
                view = view3.findViewById(C0906R.id.dnx);
            } else {
                view = null;
            }
            this.f64145d = view;
            View view4 = this.f64143b;
            if (view4 != null) {
                view4.setBackgroundColor(c.b(getContext()));
            }
        }
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f64142a, false, 72467, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f64142a, false, 72467, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, R$styleable.Divider);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            View view5 = this.f64145d;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        }
        View view6 = this.f64145d;
        if (view6 != null) {
            view6.setBackgroundColor(c.d(context));
        }
        View view7 = this.f64143b;
        if (view7 != null) {
            view7.setBackgroundColor(c.b(context));
        }
        CharSequence string = obtainStyledAttributes.getString(1);
        if (!TextUtils.isEmpty(string)) {
            DmtTextView dmtTextView2 = this.f64144c;
            if (dmtTextView2 != null) {
                dmtTextView2.setText(string);
            }
            DmtTextView dmtTextView3 = this.f64144c;
            if (dmtTextView3 != null) {
                dmtTextView3.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.f20595b);
            }
        } else {
            DmtTextView dmtTextView4 = this.f64144c;
            if (dmtTextView4 != null) {
                dmtTextView4.setVisibility(8);
            }
            View view8 = this.f64145d;
            layoutParams = view8 != null ? view8.getLayoutParams() : layoutParams;
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) UIUtils.dip2Px(getContext(), 8.0f);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        DmtTextView dmtTextView5 = this.f64144c;
        if (dmtTextView5 != null) {
            dmtTextView5.setTextColor(c.c(getContext()));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Divider(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
