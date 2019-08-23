package com.ss.android.ugc.aweme.setting.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64454a;

    /* renamed from: b  reason: collision with root package name */
    private final TestSettingActivity f64455b;

    w(TestSettingActivity testSettingActivity) {
        this.f64455b = testSettingActivity;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f64454a, false, 72820, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f64454a, false, 72820, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        TestSettingActivity testSettingActivity = this.f64455b;
        if (i2 != 6 && i2 != 0) {
            return false;
        }
        testSettingActivity.c();
        return true;
    }
}
