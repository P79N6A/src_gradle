package com.bytedance.android.livesdk.wallet;

import android.os.Bundle;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.c.a;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public class LiveBillingActivityProxy extends LiveActivityProxy {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17786a;

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f17786a, false, 13990, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17786a, false, 13990, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        HashMap hashMap = new HashMap();
        if (c() != null) {
            Bundle extras = c().getExtras();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    String string = extras.getString(str);
                    if (string == null) {
                        string = "";
                    }
                    hashMap.put(str, string);
                }
            }
        }
        if (((a) j.q().k().a(a.class)) != null) {
            new Bundle();
        }
    }
}
