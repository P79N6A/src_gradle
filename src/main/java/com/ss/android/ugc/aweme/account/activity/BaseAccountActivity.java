package com.ss.android.ugc.aweme.account.activity;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.base.activity.AmeSSActivity;

public class BaseAccountActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31604a;

    /* renamed from: b  reason: collision with root package name */
    protected String f31605b;

    /* renamed from: c  reason: collision with root package name */
    protected String f31606c;

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f31604a, false, 19542, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f31604a, false, 19542, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f31605b = getIntent().getStringExtra("enter_from");
        this.f31606c = getIntent().getStringExtra("enter_method");
    }
}
