package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.BuildConfig;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64612a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f64613b;

    /* renamed from: c  reason: collision with root package name */
    TextView f64614c;

    /* renamed from: d  reason: collision with root package name */
    TextView f64615d;

    /* renamed from: e  reason: collision with root package name */
    AnimatedImageView f64616e;

    /* renamed from: f  reason: collision with root package name */
    bt f64617f;
    long g;
    long h;
    private final View i;
    private final Activity j;
    private TextView k;

    public final Bitmap a() {
        if (PatchProxy.isSupport(new Object[0], this, f64612a, false, 73027, new Class[0], Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[0], this, f64612a, false, 73027, new Class[0], Bitmap.class);
        }
        try {
            this.i.measure(View.MeasureSpec.makeMeasureSpec(BuildConfig.VERSION_CODE, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.i.layout(0, 0, this.i.getMeasuredWidth(), this.i.getMeasuredHeight());
            return a(this.i);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th);
            return null;
        }
    }

    private Bitmap a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f64612a, false, 73028, new Class[]{View.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{view2}, this, f64612a, false, 73028, new Class[]{View.class}, Bitmap.class);
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Exception e2) {
            ExceptionMonitor.ensureNotReachHere((Throwable) e2);
            return null;
        }
    }

    public ae(Activity activity, bt btVar) {
        int i2;
        this.j = activity;
        this.f64617f = btVar;
        LayoutInflater from = LayoutInflater.from(this.j);
        if (this.f64617f.f64823a == 5) {
            i2 = C0906R.layout.a_7;
        } else {
            i2 = C0906R.layout.app;
        }
        this.i = from.inflate(i2, null);
        if (PatchProxy.isSupport(new Object[0], this, f64612a, false, 73023, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64612a, false, 73023, new Class[0], Void.TYPE);
            return;
        }
        this.f64613b = (ImageView) this.i.findViewById(C0906R.id.ate);
        this.k = (TextView) this.i.findViewById(C0906R.id.diw);
        this.f64614c = (TextView) this.i.findViewById(C0906R.id.db6);
        this.f64615d = (TextView) this.i.findViewById(C0906R.id.d9b);
        this.f64616e = (AnimatedImageView) this.i.findViewById(C0906R.id.asf);
        this.f64614c.setTextColor(this.j.getResources().getColor(C0906R.color.i3));
    }
}
