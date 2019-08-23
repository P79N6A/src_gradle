package com.ss.android.ugc.aweme.setting.ui;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.e.a;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64444a;

    /* renamed from: b  reason: collision with root package name */
    private final SettingAccountAndSafetyActivity f64445b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64446c;

    q(SettingAccountAndSafetyActivity settingAccountAndSafetyActivity, a aVar) {
        this.f64445b = settingAccountAndSafetyActivity;
        this.f64446c = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f64444a, false, 72624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64444a, false, 72624, new Class[0], Void.TYPE);
            return;
        }
        SettingAccountAndSafetyActivity settingAccountAndSafetyActivity = this.f64445b;
        a aVar = this.f64446c;
        if (settingAccountAndSafetyActivity.isViewValid() && !TextUtils.isEmpty(aVar.f31839a)) {
            settingAccountAndSafetyActivity.f3860b = true;
            settingAccountAndSafetyActivity.mAwmePwdItem.setVisibility(0);
            String str = aVar.f31839a;
            settingAccountAndSafetyActivity.f3861c = str;
            settingAccountAndSafetyActivity.mBindPhoneItem.setRightText(str);
            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(settingAccountAndSafetyActivity.getResources(), 2130839275);
            a2.setBounds(0, 0, a2.getMinimumWidth() + 2, a2.getMinimumHeight());
            ((TextView) settingAccountAndSafetyActivity.mBindPhoneItem.findViewById(C0906R.id.dlv)).setCompoundDrawables(a2, null, null, null);
        }
    }
}
