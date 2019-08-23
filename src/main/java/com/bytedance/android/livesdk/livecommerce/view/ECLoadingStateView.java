package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ECLoadingStateView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16263a;

    /* renamed from: b  reason: collision with root package name */
    public View.OnClickListener f16264b;

    /* renamed from: c  reason: collision with root package name */
    public int f16265c = 1;

    /* renamed from: d  reason: collision with root package name */
    private TextView f16266d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f16267e;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f16263a, false, 10799, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16263a, false, 10799, new Class[0], Void.TYPE);
            return;
        }
        this.f16265c = 3;
        this.f16266d.setTextColor(getContext().getResources().getColor(C0906R.color.kz));
        this.f16266d.setText(C0906R.string.a9s);
        this.f16267e.setVisibility(0);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f16263a, false, 10798, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16263a, false, 10798, new Class[0], Void.TYPE);
            return;
        }
        this.f16265c = 1;
        this.f16266d.setTextColor(getContext().getResources().getColor(C0906R.color.l6));
        this.f16266d.setText(C0906R.string.a9c);
        this.f16267e.setVisibility(8);
    }

    public void setRetryClickListener(View.OnClickListener onClickListener) {
        this.f16264b = onClickListener;
    }

    public ECLoadingStateView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16263a, false, 10797, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16263a, false, 10797, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        setOrientation(1);
        setGravity(17);
        View.inflate(context, C0906R.layout.lp, this);
        this.f16266d = (TextView) findViewById(C0906R.id.djn);
        this.f16267e = (TextView) findViewById(C0906R.id.d_k);
        this.f16267e.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f16268a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f16268a, false, 10800, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f16268a, false, 10800, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (ECLoadingStateView.this.f16265c == 3 && ECLoadingStateView.this.f16264b != null) {
                    ECLoadingStateView.this.f16264b.onClick(view);
                }
            }
        });
    }

    public ECLoadingStateView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ECLoadingStateView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
