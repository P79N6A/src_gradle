package com.ss.android.ugc.aweme.wxapi;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.activity.SSActivity;

public class WXStubActivity extends SSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76938a;

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f76938a, false, 90155, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f76938a, false, 90155, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        finish();
        overridePendingTransition(0, 0);
    }
}
