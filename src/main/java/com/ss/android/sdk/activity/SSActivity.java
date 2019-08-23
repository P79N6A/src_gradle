package com.ss.android.sdk.activity;

import android.os.Bundle;
import com.bytedance.common.utility.ICustomToast;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.ss.android.sdk.a;
import com.ss.android.sdk.c;

public class SSActivity extends AbsActivity implements ICustomToast {

    /* renamed from: a  reason: collision with root package name */
    private c f30632a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f30633b;

    /* renamed from: c  reason: collision with root package name */
    private int f30634c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f30635d = -1;
    protected int l;

    public void overridePendingTransition(int i, int i2) {
    }

    public void dismissCustomToast() {
        if (this.f30632a != null) {
            this.f30632a.a();
        }
    }

    public void finish() {
        super.finish();
        a.b(this, this.l);
    }

    public void onResume() {
        super.onResume();
        if (this.f30632a != null) {
            this.f30632a.f30704f = false;
        }
    }

    private void a() {
        if (this.f30632a == null) {
            this.f30632a = new c(this);
            this.f30632a.a(this.f30633b);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f30632a != null) {
            c cVar = this.f30632a;
            if (!cVar.f30703e && !cVar.f30704f) {
                cVar.h.removeCallbacks(cVar.i);
                cVar.a();
                cVar.f30703e = true;
            }
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f30632a != null) {
            c cVar = this.f30632a;
            if (!cVar.f30703e && !cVar.f30704f) {
                cVar.h.removeCallbacks(cVar.i);
                cVar.a();
                cVar.f30704f = true;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30633b = false;
        a.a(this, this.l);
    }

    public void showCustomToast(String str) {
        if (isViewValid()) {
            a();
            this.f30632a.a(0, 0, str, 2000, 48);
        }
    }

    public void a(int i, int i2) {
        super.overridePendingTransition(i, i2);
    }

    public void showCustomLongToast(int i, String str) {
        if (isViewValid()) {
            a();
            this.f30632a.a(i, 0, str, 3500, 17);
        }
    }

    public void showCustomToast(int i, String str) {
        if (isViewValid()) {
            a();
            this.f30632a.a(i, 0, str, 2000, 17);
        }
    }

    public void showCustomToast(String str, int i, int i2) {
        if (isViewValid()) {
            a();
            this.f30632a.a(0, 0, str, i, i2);
        }
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        if (isViewValid()) {
            a();
            this.f30632a.a(i, 0, str, i2, i3);
        }
    }
}
