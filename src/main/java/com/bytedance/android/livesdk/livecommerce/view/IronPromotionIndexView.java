package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class IronPromotionIndexView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16285a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f16286b;

    public IronPromotionIndexView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16285a, false, 10838, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16285a, false, 10838, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        setGravity(17);
        if (a.a()) {
            setBackgroundResource(2130838644);
        } else {
            setBackgroundResource(2130838643);
        }
        this.f16286b = new TextView(context);
        this.f16286b.setTextSize(1, 14.0f);
        this.f16286b.setTextColor(-1);
        this.f16286b.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f16286b.setLayoutParams(layoutParams);
        addView(this.f16286b);
    }

    public void setIndex(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f16285a, false, 10839, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f16285a, false, 10839, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f16286b.setText(String.valueOf(i));
    }

    public IronPromotionIndexView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public IronPromotionIndexView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
