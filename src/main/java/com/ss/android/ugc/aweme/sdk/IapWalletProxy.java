package com.ss.android.ugc.aweme.sdk;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

@Keep
public class IapWalletProxy implements IIapWalletProxy {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void cashOut(Context context, String str) {
    }

    public void openWallet(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71017, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71017, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        openWallet(context2, "page_index");
    }

    public void openWallet(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, changeQuickRedirect, false, 71018, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, changeQuickRedirect, false, 71018, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        IWalletMainProxy iWalletMainProxy = (IWalletMainProxy) ServiceManager.get().getService(IWalletMainProxy.class);
        iWalletMainProxy.openSchema(context2, iWalletMainProxy.getSchema(str2));
    }
}
