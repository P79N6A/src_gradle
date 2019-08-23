package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ECHostLivingView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16256a;

    /* renamed from: b  reason: collision with root package name */
    private b f16257b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f16258c;

    public ECHostLivingView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16256a, false, 10786, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16256a, false, 10786, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        setGravity(17);
        this.f16257b = new b(context);
        int dip2Px = (int) UIUtils.dip2Px(context, 13.0f);
        this.f16257b.a();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dip2Px, dip2Px);
        layoutParams.rightMargin = (int) UIUtils.dip2Px(context, 2.0f);
        this.f16257b.setLayoutParams(layoutParams);
        addView(this.f16257b);
        this.f16258c = new TextView(context);
        this.f16258c.setText(C0906R.string.a9k);
        this.f16258c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f16258c.setTextSize(1, 13.0f);
        addView(this.f16258c);
        if (a.a()) {
            this.f16257b.setWaveLineColor(context.getResources().getColor(C0906R.color.ll));
            this.f16258c.setTextColor(context.getResources().getColor(C0906R.color.ll));
            return;
        }
        this.f16257b.setWaveLineColor(context.getResources().getColor(C0906R.color.lf));
        this.f16258c.setTextColor(context.getResources().getColor(C0906R.color.lf));
    }

    public ECHostLivingView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ECHostLivingView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
