package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.LiveData;
import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerListBean;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.w.b.a;
import retrofit2.http.GET;

public final class StickerProvider {

    /* renamed from: a  reason: collision with root package name */
    private static StickerAPI f69247a = ((StickerAPI) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI()).create(StickerAPI.class));

    interface StickerAPI {
        @GET(a = "/aweme/v1/face/sticker/")
        LiveData<a<FaceStickerListBean>> getStickerList();

        @GET(a = "/aweme/v1/face/sticker/")
        q<FaceStickerListBean> getStickers();
    }
}
