package com.ss.android.ugc.aweme.wallet.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.wallet.adapter.WalletListAdapter;
import com.ss.android.ugc.aweme.wallet.model.WalletEntranceResponse;
import java.util.Map;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76563a;

    /* renamed from: b  reason: collision with root package name */
    private final WalletListAdapter.WalletItemHolder f76564b;

    /* renamed from: c  reason: collision with root package name */
    private final WalletEntranceResponse.b f76565c;

    a(WalletListAdapter.WalletItemHolder walletItemHolder, WalletEntranceResponse.b bVar) {
        this.f76564b = walletItemHolder;
        this.f76565c = bVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f76563a, false, 89797, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f76563a, false, 89797, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        WalletListAdapter.WalletItemHolder walletItemHolder = this.f76564b;
        WalletEntranceResponse.b bVar = this.f76565c;
        if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            String str = bVar.f76576f;
            String str2 = bVar.f76573c;
            if (PatchProxy.isSupport(new Object[]{str, str2}, walletItemHolder, WalletListAdapter.WalletItemHolder.f76560a, false, 89796, new Class[]{String.class, String.class}, Void.TYPE)) {
                Object[] objArr = {str, str2};
                WalletListAdapter.WalletItemHolder walletItemHolder2 = walletItemHolder;
                ChangeQuickRedirect changeQuickRedirect = WalletListAdapter.WalletItemHolder.f76560a;
                PatchProxy.accessDispatch(objArr, walletItemHolder2, changeQuickRedirect, false, 89796, new Class[]{String.class, String.class}, Void.TYPE);
                return;
            }
            if (!StringUtils.isEmpty(str2)) {
                r.a(str2, (Map) null);
            }
            h.a().a(str);
        }
    }
}
