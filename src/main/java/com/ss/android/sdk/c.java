package com.ss.android.sdk;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.ugc.aweme.C0906R;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    Dialog f30699a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f30700b;

    /* renamed from: c  reason: collision with root package name */
    TextView f30701c;

    /* renamed from: d  reason: collision with root package name */
    View f30702d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f30703e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f30704f;
    public boolean g;
    public final Handler h = new Handler();
    public final Runnable i = new Runnable() {
        public final void run() {
            c.this.a();
        }
    };

    public final void a() {
        if (!this.f30703e) {
            try {
                if (this.f30699a.isShowing()) {
                    d.a(this.f30699a);
                }
            } catch (Exception unused) {
            }
        }
    }

    @TargetApi(11)
    private void b() {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f30699a.getWindow().getDecorView().setSystemUiVisibility(5380);
        } else {
            this.f30699a.getWindow().addFlags(1024);
        }
    }

    public final void a(boolean z) {
        this.g = z;
        if (this.g) {
            b();
        } else if (Build.VERSION.SDK_INT >= 16) {
            int systemUiVisibility = this.f30699a.getWindow().getDecorView().getSystemUiVisibility();
            if ((systemUiVisibility & 5380) != 0) {
                this.f30699a.getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility ^ 5380);
            }
        } else {
            this.f30699a.getWindow().clearFlags(1024);
        }
    }

    public c(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.f30699a = new Dialog(context, C0906R.style.te);
        try {
            View inflate = from.inflate(C0906R.layout.abq, null);
            this.f30702d = inflate;
            this.f30700b = (ImageView) inflate.findViewById(C0906R.id.aq8);
            this.f30701c = (TextView) inflate.findViewById(C0906R.id.text);
            this.f30699a.setContentView(this.f30702d);
            this.f30699a.getWindow().addFlags(8);
            this.f30699a.getWindow().addFlags(32);
            this.f30699a.getWindow().addFlags(16);
            this.f30699a.getWindow().setLayout(-2, -2);
            this.f30699a.getWindow().setGravity(17);
        } catch (Throwable unused) {
        }
    }

    public void a(int i2, int i3, String str, int i4, int i5) {
        if (!this.f30703e && i4 > 0) {
            boolean z = true;
            boolean z2 = false;
            if (i2 > 0) {
                this.f30700b.setImageResource(i2);
                this.f30700b.setVisibility(0);
                z2 = true;
            } else {
                this.f30700b.setVisibility(8);
            }
            if (!StringUtils.isEmpty(str)) {
                this.f30701c.setText(str);
            } else {
                z = z2;
            }
            if (z) {
                this.h.removeCallbacks(this.i);
                a();
                try {
                    this.f30699a.getWindow().setGravity(i5);
                    if (this.g) {
                        b();
                    }
                    this.f30699a.show();
                    this.h.postDelayed(this.i, (long) i4);
                } catch (Exception unused) {
                }
            }
        }
    }
}
