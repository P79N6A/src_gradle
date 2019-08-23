package com.ss.android.ugc.aweme.shortvideo.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;

public final class MusicChoicesApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65653a;

    /* renamed from: b  reason: collision with root package name */
    static IRetrofit f65654b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: c  reason: collision with root package name */
    private static IRetrofitService f65655c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    interface RealApi {
        @GET(a = "/aweme/v1/music/choices/")
        q<MusicList> getMusicList();
    }

    public static MusicList a() throws Exception {
        if (PatchProxy.isSupport(new Object[0], null, f65653a, true, 75095, new Class[0], MusicList.class)) {
            return (MusicList) PatchProxy.accessDispatch(new Object[0], null, f65653a, true, 75095, new Class[0], MusicList.class);
        }
        try {
            return (MusicList) ((RealApi) f65654b.create(RealApi.class)).getMusicList().get();
        } catch (ExecutionException e2) {
            throw f65655c.propagateCompatibleException(e2);
        }
    }
}
