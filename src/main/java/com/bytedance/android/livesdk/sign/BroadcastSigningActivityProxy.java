package com.bytedance.android.livesdk.sign;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;

public class BroadcastSigningActivityProxy extends LiveActivityProxy {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17221a;

    /* renamed from: b  reason: collision with root package name */
    private String f17222b;

    /* renamed from: c  reason: collision with root package name */
    private BroadcastSigningFragment f17223c;

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f17221a, false, 13322, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17221a, false, 13322, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.f1870f.setContentView(C0906R.layout.aen);
        this.f17223c = new BroadcastSigningFragment();
        if (PatchProxy.isSupport(new Object[0], this, f17221a, false, 13323, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17221a, false, 13323, new Class[0], Void.TYPE);
            return;
        }
        this.f17222b = this.f1870f.getIntent().getStringExtra(PushConstants.WEB_URL);
        if (TextUtils.isEmpty(this.f17222b)) {
            this.f1870f.finish();
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("bundle_user_webview_title", true);
        this.f17223c.setArguments(bundle);
        bundle.putString(PushConstants.WEB_URL, this.f17222b);
        FragmentTransaction beginTransaction = this.f1870f.getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(C0906R.id.yx, this.f17223c);
        beginTransaction.commitAllowingStateLoss();
    }

    public BroadcastSigningActivityProxy(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
}
