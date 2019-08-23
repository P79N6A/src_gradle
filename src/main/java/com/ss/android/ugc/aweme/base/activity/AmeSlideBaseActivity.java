package com.ss.android.ugc.aweme.base.activity;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AmeSlideBaseActivity extends AmeBaseActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2718a;

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2718a, false, 24107, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2718a, false, 24107, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        new f(this, false).a();
    }
}
