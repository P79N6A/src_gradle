package com.ss.android.ugc.aweme.story.base;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.common.utility.ICustomToast;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.framework.e.d;

public class StorySSActivity extends AmeActivity implements ICustomToast {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71881a;

    /* renamed from: b  reason: collision with root package name */
    public a f71882b;

    /* renamed from: c  reason: collision with root package name */
    private d f71883c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f71884d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f71885e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f71886f = true;
    private int g = -1;
    private int h = -1;

    public interface a {
    }

    public void dismissCustomToast() {
        if (PatchProxy.isSupport(new Object[0], this, f71881a, false, 82189, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71881a, false, 82189, new Class[0], Void.TYPE);
            return;
        }
        if (this.f71883c != null) {
            this.f71883c.d();
        }
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f71881a, false, 82181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71881a, false, 82181, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f71881a, false, 82177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71881a, false, 82177, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f71883c != null) {
            this.f71883c.a();
        }
        this.f71882b = null;
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f71881a, false, 82178, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71881a, false, 82178, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.f71883c != null) {
            this.f71883c.b();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f71881a, false, 82179, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71881a, false, 82179, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.f71883c != null) {
            this.f71883c.c();
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f71881a, false, 82180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71881a, false, 82180, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.f71886f = false;
    }

    public void supportFinishAfterTransition() {
        if (PatchProxy.isSupport(new Object[0], this, f71881a, false, 82182, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71881a, false, 82182, new Class[0], Void.TYPE);
            return;
        }
        super.supportFinishAfterTransition();
    }

    private boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f71881a, false, 82188, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f71881a, false, 82188, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return false;
        } else {
            if (this.f71883c == null) {
                this.f71883c = new d(this);
                this.f71883c.h = this.f71884d;
            }
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f71881a, false, 82176, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f71881a, false, 82176, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        try {
            super.onCreate(bundle);
            this.f71884d = false;
            overridePendingTransition(0, 0);
        } catch (Resources.NotFoundException unused) {
        }
    }

    public void showImeOnce(final View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f71881a, false, 82190, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f71881a, false, 82190, new Class[]{View.class}, Void.TYPE);
        } else if (!this.f71885e) {
            final View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
            view.setOnFocusChangeListener(new View.OnFocusChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71887a;

                public final void onFocusChange(View view, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f71887a, false, 82192, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f71887a, false, 82192, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    view.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f71891a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f71891a, false, 82193, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f71891a, false, 82193, new Class[0], Void.TYPE);
                            } else if (StorySSActivity.this.isViewValid()) {
                                InputMethodManager inputMethodManager = (InputMethodManager) StorySSActivity.this.getSystemService("input_method");
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
                public static ChangeQuickRedirect f71893a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f71893a, false, 82194, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f71893a, false, 82194, new Class[0], Void.TYPE);
                        return;
                    }
                    view.requestFocus();
                }
            });
            this.f71885e = true;
        }
    }

    public void showCustomToast(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f71881a, false, 82183, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f71881a, false, 82183, new Class[]{String.class}, Void.TYPE);
        } else if (a()) {
            this.f71883c.a(str2);
        }
    }

    public void showCustomLongToast(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f71881a, false, 82184, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f71881a, false, 82184, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (a()) {
            this.f71883c.a(i, str2);
        }
    }

    public void showCustomToast(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f71881a, false, 82186, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f71881a, false, 82186, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (a()) {
            this.f71883c.b(i, str2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f71881a, false, 82191, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f71881a, false, 82191, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void showCustomToast(String str, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f71881a, false, 82185, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f71881a, false, 82185, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (a()) {
            this.f71883c.a(str2, i, i2);
        }
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71881a, false, 82187, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71881a, false, 82187, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (a()) {
            this.f71883c.a(i, str2, i2, i3);
        }
    }
}
