package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ECHostLiveNoPromotionLayout extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16251a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f16252b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f16253c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f16254d;

    /* renamed from: e  reason: collision with root package name */
    private View.OnClickListener f16255e;

    public void setOnAddButtonClickListener(View.OnClickListener onClickListener) {
        this.f16255e = onClickListener;
    }

    public ECHostLiveNoPromotionLayout(@NonNull Context context) {
        super(context);
        a(context);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f16251a, false, 10785, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f16251a, false, 10785, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view == this.f16254d && this.f16255e != null) {
            this.f16255e.onClick(view);
        }
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16251a, false, 10783, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16251a, false, 10783, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (a.a()) {
            View.inflate(context, C0906R.layout.lt, this);
            this.f16252b = (TextView) findViewById(C0906R.id.dfg);
            this.f16254d = (TextView) findViewById(C0906R.id.d8y);
        } else {
            View.inflate(context, C0906R.layout.ls, this);
            this.f16252b = (TextView) findViewById(C0906R.id.dfg);
            this.f16253c = (TextView) findViewById(C0906R.id.dcs);
            this.f16254d = (TextView) findViewById(C0906R.id.d8y);
        }
        this.f16254d.setOnClickListener(this);
    }

    public ECHostLiveNoPromotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ECHostLiveNoPromotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
