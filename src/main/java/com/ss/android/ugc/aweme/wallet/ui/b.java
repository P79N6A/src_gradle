package com.ss.android.ugc.aweme.wallet.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.wallet.model.WalletEntranceResponse;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76591a;

    /* renamed from: b  reason: collision with root package name */
    private final WalletActivity f76592b;

    /* renamed from: c  reason: collision with root package name */
    private final WalletEntranceResponse f76593c;

    b(WalletActivity walletActivity, WalletEntranceResponse walletEntranceResponse) {
        this.f76592b = walletActivity;
        this.f76593c = walletEntranceResponse;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f76591a, false, 89823, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f76591a, false, 89823, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        WalletActivity walletActivity = this.f76592b;
        WalletEntranceResponse walletEntranceResponse = this.f76593c;
        if (!a.a(view)) {
            walletActivity.a(walletEntranceResponse.getBanner().f76569a, null);
        }
    }
}
