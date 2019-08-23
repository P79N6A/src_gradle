package com.ss.android.common.applog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class HotsoonReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28052a;

    public void onReceive(Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, f28052a, false, 15554, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent}, this, f28052a, false, 15554, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        try {
            String encodedSchemeSpecificPart = intent.getData().getEncodedSchemeSpecificPart();
            if (!TextUtils.isEmpty(encodedSchemeSpecificPart)) {
                UserInfo.getPackage(encodedSchemeSpecificPart);
            }
        } catch (Throwable unused) {
        }
    }
}
