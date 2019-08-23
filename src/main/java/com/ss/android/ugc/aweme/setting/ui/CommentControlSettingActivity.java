package com.ss.android.ugc.aweme.setting.ui;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class CommentControlSettingActivity extends BaseControlSettingActivity {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f64133e;

    public final String e() {
        return "comment";
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64133e, false, 72448, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64133e, false, 72448, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64133e, false, 72449, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64133e, false, 72449, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64133e, false, 72450, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64133e, false, 72450, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64133e, false, 72444, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64133e, false, 72444, new Class[0], Void.TYPE);
            return;
        }
        this.f64104b = getIntent().getIntExtra("currentSettingsValue", 0);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f64133e, false, 72446, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64133e, false, 72446, new Class[0], Void.TYPE);
            return;
        }
        this.mEveryoneItem.setTag(0);
        this.mFriendsItem.setTag(1);
        this.mOffItem.setTag(3);
    }

    public final void b() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f64133e, false, 72445, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64133e, false, 72445, new Class[0], Void.TYPE);
            return;
        }
        this.mTitle.setText(getString(C0906R.string.v3));
        String[] stringArray = getResources().getStringArray(C0906R.array.h);
        if (stringArray == null || stringArray.length != 4) {
            z = false;
        } else {
            z = true;
        }
        int i = this.f64104b;
        if (i != 3) {
            switch (i) {
                case 0:
                    a(this.mEveryoneItem);
                    if (z) {
                        this.mEveryoneItem.setLeftText(stringArray[0]);
                        return;
                    }
                    break;
                case 1:
                    a(this.mFriendsItem);
                    if (z) {
                        this.mFriendsItem.setLeftText(stringArray[1]);
                        return;
                    }
                    break;
            }
        } else {
            a(this.mOffItem);
            if (z) {
                this.mOffItem.setLeftText(stringArray[3]);
            }
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f64133e, false, 72447, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f64133e, false, 72447, new Class[]{Integer.TYPE}, Void.TYPE);
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
