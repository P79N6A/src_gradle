package com.ss.android.newmedia.logsdk;

import android.util.Pair;
import com.bytedance.common.utility.CommonHttpException;
import com.bytedance.common.utility.NetworkClient;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Url;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.http.a;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.http.a.a.b;
import com.ss.android.ugc.aweme.app.api.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class AppLogNetworkClient extends NetworkClient {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2511a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2512b = 1024;

    interface AppLogGetApi {
        @GET
        Call<String> getResponse(@Url String str, @MaxLength int i);
    }

    interface AppLogPostApi {
        @FormUrlEncoded
        @POST
        Call<String> getResponse(@Url String str, @FieldMap Map<String, String> map, @MaxLength int i);
    }

    public final String get(String str, Map<String, String> map, NetworkClient.ReqContext reqContext) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, map, reqContext}, this, f2511a, false, 18652, new Class[]{String.class, Map.class, NetworkClient.ReqContext.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, map, reqContext}, this, f2511a, false, 18652, new Class[]{String.class, Map.class, NetworkClient.ReqContext.class}, String.class);
        } else if (str2 == null) {
            return null;
        } else {
            try {
                return (String) ((AppLogGetApi) m.a("https://aweme.snssdk.com", null).create(AppLogGetApi.class)).getResponse(str2, 204800).execute().body();
            } catch (b e2) {
                throw new CommonHttpException(e2.getStatusCode(), e2.getMessage());
            } catch (Exception e3) {
                throw new CommonHttpException(0, e3.getMessage());
            }
        }
    }

    public final String post(String str, List<Pair<String, String>> list, Map<String, String> map, NetworkClient.ReqContext reqContext) throws CommonHttpException {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, list, map, reqContext}, this, f2511a, false, 18653, new Class[]{String.class, List.class, Map.class, NetworkClient.ReqContext.class}, String.class)) {
            Object[] objArr = {str2, list, map, reqContext};
            return (String) PatchProxy.accessDispatch(objArr, this, f2511a, false, 18653, new Class[]{String.class, List.class, Map.class, NetworkClient.ReqContext.class}, String.class);
        } else if (str2 == null) {
            return null;
        } else {
            HashMap hashMap = new HashMap();
            for (Pair next : list) {
                hashMap.put(next.first, next.second);
            }
            try {
                return (String) ((AppLogPostApi) m.a("https://aweme.snssdk.com", null).create(AppLogPostApi.class)).getResponse(str2, hashMap, 204800).execute().body();
            } catch (b e2) {
                throw new CommonHttpException(e2.getStatusCode(), e2.getMessage());
            } catch (Exception e3) {
                throw new CommonHttpException(0, e3.getMessage());
            }
        }
    }

    public final String post(String str, byte[] bArr, Map<String, String> map, NetworkClient.ReqContext reqContext) throws CommonHttpException {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str, bArr, map2, reqContext}, this, f2511a, false, 18654, new Class[]{String.class, byte[].class, Map.class, NetworkClient.ReqContext.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, bArr, map2, reqContext}, this, f2511a, false, 18654, new Class[]{String.class, byte[].class, Map.class, NetworkClient.ReqContext.class}, String.class);
        }
        String filterUrl = NetworkUtils.filterUrl(str);
        if (filterUrl == null) {
            return null;
        }
        try {
            com.ss.android.common.http.b a2 = a.a();
            if (a2 == null) {
                return null;
            }
            if (map2 != null) {
                return a2.a(0, 204800, filterUrl, bArr, map2.get("Content-Encoding"), map2.get("Content-Type"));
            }
            return a2.a(0, 204800, filterUrl, bArr, (String) null, (String) null);
        } catch (b e2) {
            throw new CommonHttpException(e2.getStatusCode(), e2.getMessage());
        } catch (Exception e3) {
            throw new CommonHttpException(0, e3.getMessage());
        }
    }
}
