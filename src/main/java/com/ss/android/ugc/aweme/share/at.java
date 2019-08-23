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
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;

public final class at {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64676a;

    /* renamed from: b  reason: collision with root package name */
    TextView f64677b;

    /* renamed from: c  reason: collision with root package name */
    protected ImageView f64678c;

    /* renamed from: d  reason: collision with root package name */
    CommerceUser f64679d;

    /* renamed from: e  reason: collision with root package name */
    private final Activity f64680e;

    /* renamed from: f  reason: collision with root package name */
    private View f64681f;

    public final Bitmap a() {
        if (PatchProxy.isSupport(new Object[0], this, f64676a, false, 73075, new Class[0], Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[0], this, f64676a, false, 73075, new Class[0], Bitmap.class);
        }
        try {
            this.f64681f.measure(View.MeasureSpec.makeMeasureSpec(BuildConfig.VERSION_CODE, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f64681f.layout(0, 0, this.f64681f.getMeasuredWidth(), this.f64681f.getMeasuredHeight());
            return a(this.f64681f);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th);
            return null;
        }
    }

    public final void a(Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{bitmap}, this, f64676a, false, 73077, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap}, this, f64676a, false, 73077, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        if (this.f64678c != null) {
            this.f64678c.setImageBitmap(bitmap);
        }
    }

    private Bitmap a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f64676a, false, 73076, new Class[]{View.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{view2}, this, f64676a, false, 73076, new Class[]{View.class}, Bitmap.class);
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

    public at(@NonNull Activity activity, CommerceUser commerceUser) {
        this.f64680e = activity;
        this.f64679d = commerceUser;
        if (PatchProxy.isSupport(new Object[0], this, f64676a, false, 73073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64676a, false, 73073, new Class[0], Void.TYPE);
            return;
        }
        this.f64681f = LayoutInflater.from(this.f64680e).inflate(C0906R.layout.rd, null);
        this.f64677b = (TextView) this.f64681f.findViewById(C0906R.id.df7);
        this.f64678c = (ImageView) this.f64681f.findViewById(C0906R.id.asf);
    }
}
