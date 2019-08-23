package com.ss.android.ugc.aweme.feed.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.feed.model.NoticeResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public final class FeedSelfseeNoticeApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45055a;

    /* renamed from: b  reason: collision with root package name */
    private static FeedSelfseeNotice f45056b = ((FeedSelfseeNotice) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(FeedSelfseeNotice.class));

    public interface FeedSelfseeNotice {
        @FormUrlEncoded
        @POST(a = "/aweme/v2/aweme/review/notice/")
        q<NoticeResponse> getNotice(@Field(a = "aweme_id") String str);
    }

    public static NoticeResponse a(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f45055a, true, 40885, new Class[]{String.class}, NoticeResponse.class)) {
            return (NoticeResponse) PatchProxy.accessDispatch(new Object[]{str2}, null, f45055a, true, 40885, new Class[]{String.class}, NoticeResponse.class);
        }
        try {
            return (NoticeResponse) f45056b.getNotice(str2).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }
}
