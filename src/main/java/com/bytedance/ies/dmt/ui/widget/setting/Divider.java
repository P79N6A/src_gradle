package com.bytedance.ies.dmt.ui.widget.setting;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.c;
import com.ss.android.ugc.aweme.C0906R;

public class Divider extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f20500a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f20501b;

    /* renamed from: c  reason: collision with root package name */
    private View f20502c;

    public Divider(Context context) {
        this(context, null);
    }

    public Divider(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Divider(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.f20500a = View.inflate(context, C0906R.layout.ap5, this);
        this.f20501b = (TextView) this.f20500a.findViewById(C0906R.id.ddn);
        this.f20502c = this.f20500a.findViewById(C0906R.id.dnx);
        this.f20500a.setBackgroundColor(c.b(getContext()));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Divider);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.f20502c.setVisibility(8);
        }
        this.f20502c.setBackgroundColor(c.d(context));
        this.f20500a.setBackgroundColor(c.b(context));
        String string = obtainStyledAttributes.getString(1);
        if (!TextUtils.isEmpty(string)) {
            this.f20501b.setText(string);
        } else {
            this.f20501b.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.f20502c.getLayoutParams()).bottomMargin = (int) UIUtils.dip2Px(getContext(), 8.0f);
        }
        TextView textView = this.f20501b;
        Resources resources = context.getResources();
        if (b.a(context)) {
            i2 = C0906R.color.akc;
        } else {
            i2 = C0906R.color.anh;
        }
        textView.setTextColor(resources.getColor(i2));
        obtainStyledAttributes.recycle();
    }
}
