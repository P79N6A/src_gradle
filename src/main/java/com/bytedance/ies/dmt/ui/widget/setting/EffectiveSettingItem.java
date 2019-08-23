package com.bytedance.ies.dmt.ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.ui.common.b;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.bytex.a.a.a;

public class EffectiveSettingItem extends a {

    /* renamed from: a  reason: collision with root package name */
    protected ImageView f20503a;

    /* renamed from: b  reason: collision with root package name */
    protected TextView f20504b;

    /* renamed from: c  reason: collision with root package name */
    protected ImageView f20505c;

    /* renamed from: d  reason: collision with root package name */
    boolean f20506d;

    /* renamed from: e  reason: collision with root package name */
    int f20507e;

    public TextView getTxtRight() {
        return this.f20504b;
    }

    public final void c() {
        this.f20505c.setVisibility(8);
    }

    public void b() {
        int i;
        if (b.a(getContext())) {
            i = 2130841599;
        } else {
            i = 2130841598;
        }
        if (TextUtils.isEmpty(this.f20504b.getText())) {
            this.f20505c.setVisibility(0);
            this.f20505c.setImageDrawable(a.a(getResources(), i));
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.f20503a = (ImageView) findViewById(C0906R.id.b4k);
        this.f20504b = (TextView) findViewById(C0906R.id.dho);
        this.f20505c = (ImageView) findViewById(C0906R.id.b3n);
        if (this.f20506d) {
            this.f20503a.setVisibility(8);
        }
        this.f20504b.setText(this.f20513f);
        Drawable a2 = a.a(getResources(), this.f20507e);
        if (a2 != null) {
            this.f20503a.setImageDrawable(a2);
        }
        this.f20504b.setTextColor(this.l);
    }

    public EffectiveSettingItem(Context context) {
        super(context);
    }

    public void setRightTxt(String str) {
        super.setRightTxt(str);
        this.f20504b.setText(this.f20513f);
    }

    public EffectiveSettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, AttributeSet attributeSet) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SettingItemNormal);
        this.f20506d = obtainStyledAttributes.getBoolean(3, false);
        if (b.a(context)) {
            i = 2130841630;
        } else {
            i = 2130841631;
        }
        this.f20507e = obtainStyledAttributes.getResourceId(0, i);
        obtainStyledAttributes.recycle();
    }

    public EffectiveSettingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
