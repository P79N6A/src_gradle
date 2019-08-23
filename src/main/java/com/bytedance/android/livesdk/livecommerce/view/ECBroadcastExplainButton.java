package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ECBroadcastExplainButton extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16238a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16239b = true;

    /* renamed from: c  reason: collision with root package name */
    private TextView f16240c;

    public ECBroadcastExplainButton(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16238a, false, 10772, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16238a, false, 10772, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        setGravity(17);
        this.f16240c = new TextView(context);
        a(false, true);
        addView(this.f16240c);
        if (a.a()) {
            this.f16240c.setTextSize(1, 14.0f);
            this.f16240c.setTypeface(Typeface.DEFAULT_BOLD);
            return;
        }
        this.f16240c.setTextSize(1, 13.0f);
        this.f16240c.setTypeface(Typeface.DEFAULT_BOLD);
    }

    public ECBroadcastExplainButton(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f16238a, false, 10773, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f16238a, false, 10773, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f16239b = z;
        if (this.f16239b) {
            this.f16240c.setText(C0906R.string.a9j);
            if (a.a()) {
                this.f16240c.setTextColor(getContext().getResources().getColor(C0906R.color.ll));
                setBackgroundResource(2130838613);
                return;
            }
            this.f16240c.setTextColor(getContext().getResources().getColor(C0906R.color.kz));
            setBackgroundResource(2130838612);
            return;
        }
        this.f16240c.setTextColor(-1);
        this.f16240c.setText(C0906R.string.a97);
        if (z2) {
            if (a.a()) {
                setBackgroundResource(2130838611);
            } else {
                setBackgroundResource(2130838610);
            }
        } else if (a.a()) {
            setBackgroundResource(2130838609);
        } else {
            setBackgroundResource(2130838608);
        }
    }

    public ECBroadcastExplainButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
