package com.ss.android.ugc.aweme.setting.ui;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;

public class ReactControlSettingActivity extends BaseControlSettingActivity {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f64187e;

    public final String e() {
        return "react";
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64187e, false, 72590, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64187e, false, 72590, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64187e, false, 72591, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64187e, false, 72591, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64187e, false, 72592, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64187e, false, 72592, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64187e, false, 72587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64187e, false, 72587, new Class[0], Void.TYPE);
            return;
        }
        this.f64104b = getIntent().getIntExtra("currentSettingsValue", 0);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f64187e, false, 72588, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64187e, false, 72588, new Class[0], Void.TYPE);
            return;
        }
        this.mEveryoneItem.setTag(0);
        this.mFriendsItem.setTag(1);
        this.mOffItem.setTag(3);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f64187e, false, 72586, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64187e, false, 72586, new Class[0], Void.TYPE);
            return;
        }
        this.mTitle.setText(getString(C0906R.string.dtp));
        if (d.a().getCurUser().isSecret()) {
            a((CharSequence) getString(C0906R.string.bvh));
            if (a.c()) {
                c(getResources().getColor(C0906R.color.a3o));
            }
        }
        int i = this.f64104b;
        if (i != 3) {
            switch (i) {
                case 0:
                    a(this.mEveryoneItem);
                    return;
                case 1:
                    a(this.mFriendsItem);
                    this.mFriendsItem.setLeftText(getString(C0906R.string.bk8));
                    return;
            }
        } else {
            a(this.mOffItem);
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f64187e, false, 72589, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f64187e, false, 72589, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i != 3) {
            switch (i) {
                case 0:
                    a(this.mEveryoneItem);
                    return;
                case 1:
                    a(this.mFriendsItem);
                    return;
            }
        } else {
            a(this.mOffItem);
        }
    }
}
