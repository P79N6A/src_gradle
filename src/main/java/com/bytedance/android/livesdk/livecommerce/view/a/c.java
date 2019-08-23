package com.bytedance.android.livesdk.livecommerce.view.a;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.livecommerce.b.a;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.view.ECPriceView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class c extends FrameLayout implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16308a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f16309b;

    /* renamed from: c  reason: collision with root package name */
    private ECPriceView f16310c;

    /* renamed from: d  reason: collision with root package name */
    private HSImageView f16311d;

    public final View getBubbleView() {
        return this;
    }

    public c(@NonNull Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[]{context}, this, f16308a, false, 10850, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16308a, false, 10850, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        LayoutInflater.from(context).inflate(C0906R.layout.la, this, true);
        this.f16311d = (HSImageView) findViewById(C0906R.id.arb);
        this.f16309b = (TextView) findViewById(C0906R.id.d1h);
        this.f16310c = (ECPriceView) findViewById(C0906R.id.d1i);
    }

    public final void setPromotion(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f16308a, false, 10851, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f16308a, false, 10851, new Class[]{e.class}, Void.TYPE);
            return;
        }
        if (this.f16309b != null) {
            this.f16309b.setText(eVar.f16126a);
        }
        if (this.f16310c != null) {
            this.f16310c.setPriceText(eVar.o);
        }
        a.a(this.f16311d, eVar.n, 4);
    }
}
