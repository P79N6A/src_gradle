package com.ss.android.ugc.aweme.setting.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.model.BlackList;
import com.ss.android.ugc.aweme.setting.model.ChatAuthority;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class BlackApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63835a;

    /* renamed from: b  reason: collision with root package name */
    static BlackApi f63836b = ((BlackApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(BlackApi.class));

    interface BlackApi {
        @GET(a = "https://aweme.snssdk.com/aweme/v1/user/block/list/")
        q<BlackList> fetchBlackList(@Query(a = "index") int i, @Query(a = "count") int i2, @Query(a = "source") int i3);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/user/settings/")
        q<ChatAuthority> getChatAuthority();

        @GET(a = "https://aweme.snssdk.com/aweme/v1/im/set/chatpriv/")
        q<BaseResponse> setChatAuthority(@Query(a = "val") int i);
    }

    public static BlackList a(int i, int i2, int i3) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), 10, Integer.valueOf(i3)}, null, f63835a, true, 72141, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, BlackList.class)) {
            return (BlackList) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), 10, Integer.valueOf(i3)}, null, f63835a, true, 72141, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, BlackList.class);
        }
        try {
            return (BlackList) f63836b.fetchBlackList(i, 10, i3).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }
}
