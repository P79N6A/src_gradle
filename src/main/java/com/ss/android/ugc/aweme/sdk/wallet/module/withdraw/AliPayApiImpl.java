package com.ss.android.ugc.aweme.sdk.wallet.module.withdraw;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public class AliPayApiImpl {
    private static AliPayApi aliPayApi;
    public static ChangeQuickRedirect changeQuickRedirect;

    AliPayApiImpl() {
    }

    static {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        if (iRetrofitService != null) {
            aliPayApi = (AliPayApi) iRetrofitService.createNewRetrofit("https://aweme.snssdk.com/aweme/v1/").create(AliPayApi.class);
        }
    }

    static BaseResponse checkBindResult(int i, int i2, String str) throws Exception {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, null, changeQuickRedirect, true, 71072, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, BaseResponse.class)) {
            return (BaseResponse) aliPayApi.checkBindResult(i, i2, str2).get();
        }
        return (BaseResponse) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, null, changeQuickRedirect, true, 71072, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, BaseResponse.class);
    }
}
