package com.ss.android.ugc.aweme.shortvideo.sticker.unlock;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public final class UnlockStickerApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70191a;

    /* renamed from: b  reason: collision with root package name */
    static final RetrofitApi f70192b = ((RetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RetrofitApi.class));

    interface RetrofitApi {
        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v1/ug/event/record/")
        q<g> unlockSticker(@Field(a = "event_type") int i, @Field(a = "extra") String str);
    }

    public static q<g> a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f70191a, true, 79849, new Class[]{String.class}, q.class)) {
            return f70192b.unlockSticker(1, str2);
        }
        return (q) PatchProxy.accessDispatch(new Object[]{str2}, null, f70191a, true, 79849, new Class[]{String.class}, q.class);
    }
}
