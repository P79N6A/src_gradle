package com.bytedance.ies.dmt.ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.ui.common.b;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.bytex.a.a.a;

public class SettingItem extends b {

    /* renamed from: a  reason: collision with root package name */
    protected FrameLayout f20508a;

    /* renamed from: b  reason: collision with root package name */
    protected ImageView f20509b;

    /* renamed from: c  reason: collision with root package name */
    protected TextView f20510c;

    /* renamed from: d  reason: collision with root package name */
    protected ImageView f20511d;

    /* access modifiers changed from: protected */
    public int getRightLayoutId() {
        return C0906R.layout.apb;
    }

    public View getRightLayout() {
        return this.f20508a;
    }

    public TextView getTxtRight() {
        return this.f20510c;
    }

    public SettingItem(Context context) {
        super(context);
    }

    public void setRightTxt(String str) {
        super.setRightTxt(str);
        this.f20510c.setText(this.f20516e);
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        super.a(context);
        this.f20509b = (ImageView) this.f20517f.findViewById(C0906R.id.b4k);
        this.f20508a = (FrameLayout) this.f20517f.findViewById(C0906R.id.cem);
        this.f20510c = (TextView) this.f20517f.findViewById(C0906R.id.dho);
        this.f20511d = (ImageView) this.f20517f.findViewById(C0906R.id.b3n);
    }

    public SettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void a(Context context, AttributeSet attributeSet) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SettingItemNormal);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            this.f20509b.setVisibility(8);
        }
        this.f20510c.setText(this.f20516e);
        if (b.a(context)) {
            i = 2130841630;
        } else {
            i = 2130841631;
        }
        Drawable a2 = a.a(getResources(), obtainStyledAttributes.getResourceId(0, i));
        if (a2 != null) {
            this.f20509b.setImageDrawable(a2);
        }
        this.f20510c.setTextColor(this.p);
        obtainStyledAttributes.recycle();
    }

    public SettingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
