package com.ss.android.ugc.aweme.sdk.wallet.module.withdraw;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import com.alipay.sdk.app.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class AliPayAuth implements IAuth {
    public static ChangeQuickRedirect changeQuickRedirect;

    private int checkAuthResult(String str) throws Exception {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71074, new Class[]{String.class}, Integer.TYPE)) {
            return AliPayApiImpl.checkBindResult(1, 0, str2).status_code;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71074, new Class[]{String.class}, Integer.TYPE)).intValue();
    }

    static final /* synthetic */ Void lambda$auth$1$AliPayAuth(IWalletService.a aVar, i iVar) throws Exception {
        if (iVar.b()) {
            aVar.onSuccess((JSONObject) iVar.e());
        } else {
            aVar.onFail(iVar.f());
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ JSONObject lambda$auth$0$AliPayAuth(Activity activity, String str) throws Exception {
        int checkAuthResult = checkAuthResult(new a(activity).a(str, true));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("auth_result", checkAuthResult);
        return jSONObject;
    }

    public void auth(Context context, String str, IWalletService.a aVar) {
        Activity activity;
        Context context2 = context;
        String str2 = str;
        IWalletService.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, str2, aVar2}, this, changeQuickRedirect, false, 71073, new Class[]{Context.class, String.class, IWalletService.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, aVar2}, this, changeQuickRedirect, false, 71073, new Class[]{Context.class, String.class, IWalletService.a.class}, Void.TYPE);
            return;
        }
        if (context2 instanceof Activity) {
            activity = (Activity) context2;
        } else {
            activity = null;
        }
        if (activity == null) {
            aVar2.onFail(new Exception("context is null"));
        } else {
            i.a((Callable<TResult>) new AliPayAuth$$Lambda$0<TResult>(this, activity, str2)).a((g<TResult, TContinuationResult>) new AliPayAuth$$Lambda$1<TResult,TContinuationResult>(aVar2));
        }
    }
}
