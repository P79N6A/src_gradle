package com.ss.android.ugc.aweme.splash;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.MainActivity;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71617a;

    /* renamed from: b  reason: collision with root package name */
    private final TransitActivity f71618b;

    p(TransitActivity transitActivity) {
        this.f71618b = transitActivity;
    }

    public final void run() {
        Intent intent;
        if (PatchProxy.isSupport(new Object[0], this, f71617a, false, 81956, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71617a, false, 81956, new Class[0], Void.TYPE);
            return;
        }
        TransitActivity transitActivity = this.f71618b;
        if (PatchProxy.isSupport(new Object[0], transitActivity, TransitActivity.f71586a, false, 81954, new Class[0], Intent.class)) {
            intent = (Intent) PatchProxy.accessDispatch(new Object[0], transitActivity, TransitActivity.f71586a, false, 81954, new Class[0], Intent.class);
        } else {
            Intent intent2 = transitActivity.getIntent();
            if (intent2 != null) {
                intent2.setExtrasClassLoader(TransitActivity.class.getClassLoader());
                intent = (Intent) intent2.getParcelableExtra("main");
                if (intent != null) {
                    intent.setExtrasClassLoader(TransitActivity.class.getClassLoader());
                }
            }
            intent = new Intent(transitActivity, MainActivity.class);
        }
        transitActivity.startActivity(intent);
        transitActivity.overridePendingTransition(0, 0);
    }
}
