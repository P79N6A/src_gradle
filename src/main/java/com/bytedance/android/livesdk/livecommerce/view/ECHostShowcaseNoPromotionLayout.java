package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ECHostShowcaseNoPromotionLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16260a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f16261b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f16262c;

    public ECHostShowcaseNoPromotionLayout(@NonNull Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16260a, false, 10789, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16260a, false, 10789, new Class[]{Context.class}, Void.TYPE);
        } else if (a.a()) {
            View inflate = LayoutInflater.from(context).inflate(C0906R.layout.lr, this, true);
            this.f16261b = (TextView) inflate.findViewById(C0906R.id.dfg);
            this.f16262c = (TextView) inflate.findViewById(C0906R.id.dcs);
        } else {
            View inflate2 = LayoutInflater.from(context).inflate(C0906R.layout.lq, this, true);
            this.f16261b = (TextView) inflate2.findViewById(C0906R.id.dfg);
            this.f16262c = (TextView) inflate2.findViewById(C0906R.id.dcs);
        }
    }

    public ECHostShowcaseNoPromotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ECHostShowcaseNoPromotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
