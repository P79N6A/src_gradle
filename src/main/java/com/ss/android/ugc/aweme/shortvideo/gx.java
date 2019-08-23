package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.ss.android.ugc.aweme.tools.AVApi;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;

public final /* synthetic */ class gx implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68015a;

    /* renamed from: b  reason: collision with root package name */
    static final Callable f68016b = new gx();

    private gx() {
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f68015a, false, 74774, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f68015a, false, 74774, new Class[0], Object.class);
        }
        IRetrofit createNewRetrofit = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI());
        l.a(((TTUploaderService.RetrofitService) createNewRetrofit.create(TTUploaderService.RetrofitService.class)).getUploadAuthKeyConfig(new LinkedHashMap(0)), new TTUploaderService.a(0), v.a());
        return null;
    }
}
