package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
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
import com.ss.android.ugc.aweme.commerce.service.models.h;

public final class an {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64648a;

    /* renamed from: b  reason: collision with root package name */
    TextView f64649b;

    /* renamed from: c  reason: collision with root package name */
    TextView f64650c;

    /* renamed from: d  reason: collision with root package name */
    AnimatedImageView f64651d;

    /* renamed from: e  reason: collision with root package name */
    protected ImageView f64652e;

    /* renamed from: f  reason: collision with root package name */
    h f64653f;
    private final Activity g;
    private View h;

    public final Bitmap a() {
        if (PatchProxy.isSupport(new Object[0], this, f64648a, false, 73053, new Class[0], Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[0], this, f64648a, false, 73053, new Class[0], Bitmap.class);
        }
        try {
            this.h.measure(View.MeasureSpec.makeMeasureSpec(BuildConfig.VERSION_CODE, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.h.layout(0, 0, this.h.getMeasuredWidth(), this.h.getMeasuredHeight());
            return a(this.h);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th);
            return null;
        }
    }

    public final void a(Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{bitmap}, this, f64648a, false, 73055, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap}, this, f64648a, false, 73055, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        if (this.f64652e != null) {
            this.f64652e.setImageBitmap(bitmap);
        }
    }

    private Bitmap a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f64648a, false, 73054, new Class[]{View.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{view2}, this, f64648a, false, 73054, new Class[]{View.class}, Bitmap.class);
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

    public an(@NonNull Activity activity, h hVar) {
        this.g = activity;
        this.f64653f = hVar;
        if (PatchProxy.isSupport(new Object[0], this, f64648a, false, 73051, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64648a, false, 73051, new Class[0], Void.TYPE);
            return;
        }
        this.h = LayoutInflater.from(this.g).inflate(C0906R.layout.rc, null);
        this.f64649b = (TextView) this.h.findViewById(C0906R.id.dkk);
        this.f64650c = (TextView) this.h.findViewById(C0906R.id.dgk);
        this.f64651d = (AnimatedImageView) this.h.findViewById(C0906R.id.asf);
        this.f64652e = (ImageView) this.h.findViewById(C0906R.id.ate);
    }
}
