package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;

public class DownloadControlSettingActivity extends BaseControlSettingActivity {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f64162e;

    public final String e() {
        return "download_setting";
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64162e, false, 72524, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64162e, false, 72524, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64162e, false, 72525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64162e, false, 72525, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64162e, false, 72526, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64162e, false, 72526, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void X_() {
        if (PatchProxy.isSupport(new Object[0], this, f64162e, false, 72521, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64162e, false, 72521, new Class[0], Void.TYPE);
            return;
        }
        a.b((Context) this, (int) C0906R.string.bge).a();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64162e, false, 72518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64162e, false, 72518, new Class[0], Void.TYPE);
            return;
        }
        this.f64104b = getIntent().getIntExtra("currentSettingsValue", 0);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f64162e, false, 72522, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64162e, false, 72522, new Class[0], Void.TYPE);
            return;
        }
        this.mEveryoneItem.setTag(0);
        this.mOffItem.setTag(3);
        if (!com.ss.android.g.a.a()) {
            this.mFriendsItem.setTag(1);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f64162e, false, 72519, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64162e, false, 72519, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.b()) {
            this.mTitle.setText(getString(C0906R.string.ej));
            this.mEveryoneItem.setLeftText(getString(C0906R.string.a7f));
        } else {
            this.mTitle.setText(getString(C0906R.string.a7d));
        }
        if (com.ss.android.g.a.a()) {
            this.mFriendsItem.setVisibility(8);
        }
        if (((Boolean) SharePrefCache.inst().getIsShowAllowDownloadTipSetting().c()).booleanValue()) {
            a((CharSequence) getString(C0906R.string.ek));
        }
        int i = this.f64104b;
        if (i != 3) {
            switch (i) {
                case 0:
                    a(this.mEveryoneItem);
                    return;
                case 1:
                    if (!com.ss.android.g.a.a()) {
                        a(this.mFriendsItem);
                        return;
                    }
                    break;
            }
        }
        a(this.mOffItem);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f64162e, false, 72523, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f64162e, false, 72523, new Class[]{Integer.TYPE}, Void.TYPE);
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

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64162e, false, 72520, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64162e, false, 72520, new Class[]{View.class}, Void.TYPE);
        } else if (view != null) {
            boolean isSecret = d.a().getCurUser().isSecret();
            int intValue = ((Integer) view.getTag()).intValue();
            if (!isSecret || !(intValue == 0 || intValue == 1)) {
                super.onClick(view);
                return;
            }
            a.c((Context) this, (int) C0906R.string.br2).a();
        }
    }
}
