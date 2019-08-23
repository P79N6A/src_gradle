package com.ss.android.ugc.aweme.account.base.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.common.utility.ICustomToast;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.framework.e.d;

public class AmeSSActivity extends AmeActivity implements ICustomToast {
    public static ChangeQuickRedirect m;

    /* renamed from: a  reason: collision with root package name */
    private d f31699a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f31700b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f31701c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f31702d = true;

    /* renamed from: e  reason: collision with root package name */
    private int f31703e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f31704f = -1;
    public a n;

    public interface a {
        void a(int i, int i2, Intent intent);
    }

    public boolean isRegisterEventBus() {
        return false;
    }

    public void dismissCustomToast() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 19683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 19683, new Class[0], Void.TYPE);
            return;
        }
        if (this.f31699a != null) {
            this.f31699a.d();
        }
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 19676, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 19676, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 19671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 19671, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f31699a != null) {
            this.f31699a.a();
        }
        this.n = null;
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 19672, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 19672, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.f31699a != null) {
            this.f31699a.b();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 19673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 19673, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.f31699a != null) {
            this.f31699a.c();
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 19674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 19674, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.f31702d = false;
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 19675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 19675, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
    }

    private boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 19682, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, m, false, 19682, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return false;
        } else {
            if (this.f31699a == null) {
                this.f31699a = new d(this);
                this.f31699a.h = this.f31700b;
            }
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, m, false, 19670, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, m, false, 19670, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        try {
            super.onCreate(bundle);
            try {
                this.f31700b = false;
            } catch (Resources.NotFoundException unused) {
            }
        } catch (Resources.NotFoundException unused2) {
        }
    }

    public void showImeOnce(final View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, m, false, 19684, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, m, false, 19684, new Class[]{View.class}, Void.TYPE);
        } else if (!this.f31701c) {
            final View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
            view.setOnFocusChangeListener(new View.OnFocusChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f31705a;

                public final void onFocusChange(View view, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f31705a, false, 19686, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f31705a, false, 19686, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    view.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f31709a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f31709a, false, 19687, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f31709a, false, 19687, new Class[0], Void.TYPE);
                            } else if (AmeSSActivity.this.isViewValid()) {
                                InputMethodManager inputMethodManager = (InputMethodManager) AmeSSActivity.this.getSystemService("input_method");
                                if (inputMethodManager != null) {
                                    inputMethodManager.showSoftInput(view, 1);
                                }
                            }
                        }
                    });
                    if (onFocusChangeListener != null) {
                        onFocusChangeListener.onFocusChange(view, z);
                    }
                }
            });
            view.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f31711a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f31711a, false, 19688, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f31711a, false, 19688, new Class[0], Void.TYPE);
                        return;
                    }
                    view.requestFocus();
                }
            });
            this.f31701c = true;
        }
    }

    public void showCustomToast(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, m, false, 19677, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, m, false, 19677, new Class[]{String.class}, Void.TYPE);
        } else if (a()) {
            this.f31699a.a(str2);
        }
    }

    @Deprecated
    public final void a(int i, int i2) {
        super.overridePendingTransition(C0906R.anim.r, 0);
    }

    public void showCustomLongToast(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, m, false, 19678, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, m, false, 19678, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (a()) {
            this.f31699a.a(i, str2);
        }
    }

    public void showCustomToast(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, m, false, 19680, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, m, false, 19680, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (a()) {
            this.f31699a.b(i, str2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, m, false, 19685, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, m, false, 19685, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.n != null) {
            int i3 = i;
            int i4 = i2;
            this.n.a(i, i2, intent2);
        }
    }

    public void showCustomToast(String str, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, m, false, 19679, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, m, false, 19679, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (a()) {
            this.f31699a.a(str2, i, i2);
        }
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, m, false, 19681, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, m, false, 19681, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (a()) {
            this.f31699a.a(i, str2, i2, i3);
        }
    }
}
