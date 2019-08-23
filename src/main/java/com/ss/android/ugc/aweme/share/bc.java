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
import com.ss.android.ugc.aweme.feed.share.command.d;

public final class bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64744a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f64745b;

    /* renamed from: c  reason: collision with root package name */
    TextView f64746c;

    /* renamed from: d  reason: collision with root package name */
    TextView f64747d;

    /* renamed from: e  reason: collision with root package name */
    TextView f64748e;

    /* renamed from: f  reason: collision with root package name */
    AnimatedImageView f64749f;
    d g;
    long h;
    long i;
    private final View j = LayoutInflater.from(this.k).inflate(C0906R.layout.app, null);
    private final Activity k;

    public final Bitmap a() {
        if (PatchProxy.isSupport(new Object[0], this, f64744a, false, 73099, new Class[0], Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[0], this, f64744a, false, 73099, new Class[0], Bitmap.class);
        }
        try {
            this.j.measure(View.MeasureSpec.makeMeasureSpec(BuildConfig.VERSION_CODE, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.j.layout(0, 0, this.j.getMeasuredWidth(), this.j.getMeasuredHeight());
            return a(this.j);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th);
            return null;
        }
    }

    public bc(Activity activity) {
        this.k = activity;
        if (PatchProxy.isSupport(new Object[0], this, f64744a, false, 73096, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64744a, false, 73096, new Class[0], Void.TYPE);
            return;
        }
        this.f64745b = (ImageView) this.j.findViewById(C0906R.id.ate);
        this.f64746c = (TextView) this.j.findViewById(C0906R.id.diw);
        this.f64747d = (TextView) this.j.findViewById(C0906R.id.db6);
        this.f64748e = (TextView) this.j.findViewById(C0906R.id.d9b);
        this.f64749f = (AnimatedImageView) this.j.findViewById(C0906R.id.asf);
    }

    private Bitmap a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f64744a, false, 73100, new Class[]{View.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{view2}, this, f64744a, false, 73100, new Class[]{View.class}, Bitmap.class);
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
}
