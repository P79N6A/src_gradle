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
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class bn {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64803a;

    /* renamed from: b  reason: collision with root package name */
    final Activity f64804b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f64805c;

    /* renamed from: d  reason: collision with root package name */
    TextView f64806d;

    /* renamed from: e  reason: collision with root package name */
    TextView f64807e;

    /* renamed from: f  reason: collision with root package name */
    TextView f64808f;
    AnimatedImageView g;
    User h;
    long i;
    long j;
    private final View k;

    public final Bitmap a() {
        if (PatchProxy.isSupport(new Object[0], this, f64803a, false, 73169, new Class[0], Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[0], this, f64803a, false, 73169, new Class[0], Bitmap.class);
        }
        try {
            this.k.measure(View.MeasureSpec.makeMeasureSpec(BuildConfig.VERSION_CODE, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.k.layout(0, 0, this.k.getMeasuredWidth(), this.k.getMeasuredHeight());
            return a(this.k);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th);
            return null;
        }
    }

    private Bitmap a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f64803a, false, 73170, new Class[]{View.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{view2}, this, f64803a, false, 73170, new Class[]{View.class}, Bitmap.class);
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

    public bn(Activity activity) {
        this.f64804b = activity;
        if (AbTestManager.a().bh()) {
            this.k = LayoutInflater.from(this.f64804b).inflate(C0906R.layout.app, null);
        } else {
            this.k = LayoutInflater.from(this.f64804b).inflate(C0906R.layout.apo, null);
        }
        if (PatchProxy.isSupport(new Object[0], this, f64803a, false, 73163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64803a, false, 73163, new Class[0], Void.TYPE);
            return;
        }
        this.f64805c = (ImageView) this.k.findViewById(C0906R.id.ate);
        this.f64806d = (TextView) this.k.findViewById(C0906R.id.diw);
        this.f64807e = (TextView) this.k.findViewById(C0906R.id.db6);
        this.f64808f = (TextView) this.k.findViewById(C0906R.id.d9b);
        this.g = (AnimatedImageView) this.k.findViewById(C0906R.id.asf);
    }
}
