package com.ss.android.ugc.aweme.effectplatform;

import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.mime.TypedInput;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.effectmanager.common.a;
import com.ss.android.ugc.effectmanager.common.d.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;

public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43871a;

    public final InputStream a(a aVar) {
        SsResponse ssResponse;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f43871a, false, 39013, new Class[]{a.class}, InputStream.class)) {
            return (InputStream) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f43871a, false, 39013, new Class[]{a.class}, InputStream.class);
        }
        InputStream inputStream = null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Pair parseUrl = UrlUtils.parseUrl(aVar2.f77265a, linkedHashMap);
            String str = (String) parseUrl.second;
            EffectNetworkAPI effectNetworkAPI = (EffectNetworkAPI) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit((String) parseUrl.first).create(EffectNetworkAPI.class);
            if ("POST".equals(aVar2.f77266b)) {
                ssResponse = effectNetworkAPI.doPost(true, Integer.MAX_VALUE, str, aVar2.f77269e).execute();
            } else {
                ssResponse = effectNetworkAPI.doGet(true, Integer.MAX_VALUE, str, linkedHashMap).execute();
            }
            if (ssResponse.isSuccessful()) {
                InputStream in = ((TypedInput) ssResponse.body()).in();
                try {
                    aVar2.f77267c = ((TypedInput) ssResponse.body()).length();
                    inputStream = in;
                } catch (IOException e2) {
                    e = e2;
                    inputStream = in;
                    aVar2.g = e.getMessage();
                    return inputStream;
                } catch (Exception e3) {
                    e = e3;
                    inputStream = in;
                    aVar2.g = e.getMessage();
                    return inputStream;
                }
            }
        } catch (IOException e4) {
            e = e4;
            aVar2.g = e.getMessage();
            return inputStream;
        } catch (Exception e5) {
            e = e5;
            aVar2.g = e.getMessage();
            return inputStream;
        }
        return inputStream;
    }
}
