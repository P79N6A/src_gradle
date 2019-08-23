package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ECHostCouponView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16247a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f16248b;

    public ECHostCouponView(Context context) {
        super(context);
        a(context);
    }

    public void setCouponText(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f16247a, false, 10780, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f16247a, false, 10780, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f16248b.setText(str2);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16247a, false, 10779, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16247a, false, 10779, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f16248b = new TextView(context);
        this.f16248b.setLayoutParams(new LinearLayout.LayoutParams(-2, (int) UIUtils.dip2Px(context, 16.0f)));
        this.f16248b.setGravity(17);
        this.f16248b.setTextSize(1, 10.0f);
        int dip2Px = (int) UIUtils.dip2Px(context, 4.0f);
        this.f16248b.setPadding(dip2Px, 0, dip2Px, 0);
        addView(this.f16248b);
        if (a.a()) {
            setBackgroundResource(2130838622);
            this.f16248b.setTextColor(context.getResources().getColor(C0906R.color.ll));
            return;
        }
        setBackgroundResource(2130838621);
        this.f16248b.setTextColor(context.getResources().getColor(C0906R.color.lf));
    }

    public ECHostCouponView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ECHostCouponView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
