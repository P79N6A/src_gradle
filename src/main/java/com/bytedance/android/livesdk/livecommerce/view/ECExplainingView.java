package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ECExplainingView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16241a;

    /* renamed from: b  reason: collision with root package name */
    private b f16242b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f16243c;

    public ECExplainingView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16241a, false, 10775, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16241a, false, 10775, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        setGravity(17);
        this.f16242b = new b(context);
        int dip2Px = (int) UIUtils.dip2Px(context, 12.0f);
        this.f16242b.a();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dip2Px, dip2Px);
        layoutParams.rightMargin = (int) UIUtils.dip2Px(context, 2.0f);
        this.f16242b.setLayoutParams(layoutParams);
        this.f16242b.setWaveLineColor(context.getResources().getColor(C0906R.color.lm));
        addView(this.f16242b);
        this.f16243c = new TextView(context);
        this.f16243c.setText(C0906R.string.a98);
        this.f16243c.setTextColor(context.getResources().getColor(C0906R.color.lm));
        this.f16243c.setTextSize(1, 12.0f);
        addView(this.f16243c);
    }

    public ECExplainingView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ECExplainingView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
