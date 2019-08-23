package com.ss.android.ugc.aweme.framework.e;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48498a;

    /* renamed from: b  reason: collision with root package name */
    Dialog f48499b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f48500c;

    /* renamed from: d  reason: collision with root package name */
    TextView f48501d;

    /* renamed from: e  reason: collision with root package name */
    View f48502e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f48503f;
    boolean g;
    public boolean h;
    final Handler i = new Handler();
    final Runnable j = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48504a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f48504a, false, 45975, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48504a, false, 45975, new Class[0], Void.TYPE);
                return;
            }
            d.this.d();
        }
    };

    public final void c() {
        this.g = false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f48498a, false, 45972, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48498a, false, 45972, new Class[0], Void.TYPE);
        } else if (!this.f48503f && !this.g) {
            this.i.removeCallbacks(this.j);
            d();
            this.f48503f = true;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f48498a, false, 45973, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48498a, false, 45973, new Class[0], Void.TYPE);
        } else if (!this.f48503f && !this.g) {
            this.i.removeCallbacks(this.j);
            d();
            this.g = true;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f48498a, false, 45974, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48498a, false, 45974, new Class[0], Void.TYPE);
        } else if (!this.f48503f) {
            try {
                if (this.f48499b.isShowing()) {
                    e.a(this.f48499b);
                }
            } catch (Exception unused) {
            }
        }
    }

    @TargetApi(11)
    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f48498a, false, 45959, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48498a, false, 45959, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.f48499b.getWindow().getDecorView().setSystemUiVisibility(5380);
        } else {
            this.f48499b.getWindow().setFlags(1024, 1024);
        }
    }

    public d(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.f48499b = new Dialog(context, C0906R.style.te);
        try {
            View inflate = from.inflate(C0906R.layout.abq, null);
            this.f48502e = inflate;
            this.f48500c = (ImageView) inflate.findViewById(C0906R.id.aq8);
            this.f48501d = (TextView) inflate.findViewById(C0906R.id.text);
            double width = (double) ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth();
            Double.isNaN(width);
            this.f48501d.setMaxWidth((int) ((width * 0.68d) - 80.0d));
            this.f48499b.setContentView(this.f48502e);
            this.f48499b.getWindow().addFlags(8);
            this.f48499b.getWindow().addFlags(32);
            this.f48499b.getWindow().addFlags(16);
            this.f48499b.getWindow().setLayout(-2, -2);
            this.f48499b.getWindow().setGravity(17);
        } catch (Throwable unused) {
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f48498a, false, 45960, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f48498a, false, 45960, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(null, 0, 0, str, 2000, 17);
    }

    public final void a(int i2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f48498a, false, 45965, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i2), str};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f48498a, false, 45965, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(null, i2, 0, str, 3500, 17);
    }

    public final void b(int i2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f48498a, false, 45966, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i2), str};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f48498a, false, 45966, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(null, i2, 0, str, 2000, 17);
    }

    public final void a(String str, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f48498a, false, 45962, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, Integer.valueOf(i2), Integer.valueOf(i3)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f48498a, false, 45962, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(null, 0, 0, str, i2, i3);
    }

    public final void a(int i2, String str, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f48498a, false, 45968, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f48498a, false, 45968, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(null, i2, 0, str, i3, i4);
    }

    public void a(View view, int i2, int i3, String str, int i4, int i5) {
        int i6 = i2;
        String str2 = str;
        int i7 = i4;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{null, Integer.valueOf(i2), 0, str2, Integer.valueOf(i4), Integer.valueOf(i5)}, this, f48498a, false, 45971, new Class[]{View.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null, Integer.valueOf(i2), 0, str2, Integer.valueOf(i4), Integer.valueOf(i5)}, this, f48498a, false, 45971, new Class[]{View.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!this.f48503f && i7 > 0) {
            if (i6 > 0) {
                this.f48500c.setImageResource(i6);
                this.f48500c.setVisibility(0);
                z = true;
            } else {
                this.f48500c.setVisibility(8);
            }
            if (!StringUtils.isEmpty(str)) {
                this.f48501d.setText(str2);
                z = true;
            }
            if (z) {
                this.i.removeCallbacks(this.j);
                d();
                try {
                    this.f48499b.getWindow().setGravity(17);
                    if (this.h) {
                        e();
                    }
                    this.f48499b.show();
                    this.i.postDelayed(this.j, (long) i7);
                } catch (Exception unused) {
                }
            }
        }
    }
}
