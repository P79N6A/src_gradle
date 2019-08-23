package com.bytedance.android.livesdk.livecommerce.view.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.bytedance.android.livesdk.livecommerce.view.ECPriceView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;

public final class b extends FrameLayout implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16302a;

    /* renamed from: b  reason: collision with root package name */
    Rect f16303b = new Rect(0, 0, c.f69428f, 200);

    /* renamed from: c  reason: collision with root package name */
    private TextView f16304c;

    /* renamed from: d  reason: collision with root package name */
    private ECPriceView f16305d;

    /* renamed from: e  reason: collision with root package name */
    private HSImageView f16306e;

    /* renamed from: f  reason: collision with root package name */
    private int f16307f;
    private Paint g = new Paint();
    private final Path h = new Path();

    public final View getBubbleView() {
        return this;
    }

    public final void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f16302a, false, 10848, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f16302a, false, 10848, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = ((float) measuredWidth) / 2.0f;
        this.h.moveTo(f2 - ((float) this.f16307f), (float) (measuredHeight - this.f16307f));
        this.h.lineTo(((float) this.f16307f) + f2, (float) (measuredHeight - this.f16307f));
        this.h.lineTo(f2, (float) measuredHeight);
        this.h.close();
        canvas.drawPath(this.h, this.g);
    }

    public b(@NonNull Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[]{context}, this, f16302a, false, 10846, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16302a, false, 10846, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        setWillNotDraw(false);
        this.f16307f = a.a(context, 7.0f);
        this.g.setColor(-1);
        this.g.setStyle(Paint.Style.FILL);
        this.g.setAntiAlias(true);
        LayoutInflater.from(context).inflate(C0906R.layout.l_, this, true);
        this.f16306e = (HSImageView) findViewById(C0906R.id.arb);
        this.f16304c = (TextView) findViewById(C0906R.id.d1h);
        this.f16305d = (ECPriceView) findViewById(C0906R.id.d1i);
    }

    public final void setPromotion(e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f16302a, false, 10849, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f16302a, false, 10849, new Class[]{e.class}, Void.TYPE);
            return;
        }
        if (this.f16304c != null) {
            this.f16304c.setText(eVar2.f16126a);
        }
        if (this.f16305d != null) {
            this.f16305d.setPriceText(eVar2.o);
        }
        HSImageView hSImageView = this.f16306e;
        String str = eVar2.n;
        if (PatchProxy.isSupport(new Object[]{hSImageView, str}, null, com.bytedance.android.livesdk.livecommerce.b.a.f15959a, true, 10686, new Class[]{HSImageView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hSImageView, str}, null, com.bytedance.android.livesdk.livecommerce.b.a.f15959a, true, 10686, new Class[]{HSImageView.class, String.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.livecommerce.b.a.a(hSImageView, str, 2);
    }

    public final void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f16302a, false, 10847, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f16302a, false, 10847, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + this.f16307f);
    }
}
