package com.ss.android.ugc.aweme.profile.api;

import android.text.TextUtils;
import com.bytedance.retrofit2.Call;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.i;
import com.ss.android.http.a.b.f;
import com.ss.android.ugc.aweme.app.api.a;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.api.LinkDataApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeAdStatus;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class AwemeApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61302a;

    /* renamed from: b  reason: collision with root package name */
    public static final RealApi f61303b = ((RealApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RealApi.class));

    public interface RealApi {
        @GET(a = "/aweme/v2/douplus/item/check/")
        q<AwemeAdStatus> checkItemAdStatus(@Query(a = "item_id") String str, @Query(a = "from_source") int i);

        @FormUrlEncoded
        @POST(a = "/aweme/v1/commit/dislike/item/")
        Call<BaseResponse> disLikeAweme(@Query(a = "aweme_id") String str, @FieldMap Map<String, String> map);

        @FormUrlEncoded
        @POST(a = "/aweme/v1/commit/dislike/item/")
        Call<BaseResponse> disLikeReason(@FieldMap Map<String, String> map);
    }

    public static AwemeAdStatus a(String str, int i) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f61302a, true, 67434, new Class[]{String.class, Integer.TYPE}, AwemeAdStatus.class)) {
            return (AwemeAdStatus) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f61302a, true, 67434, new Class[]{String.class, Integer.TYPE}, AwemeAdStatus.class);
        }
        try {
            return (AwemeAdStatus) f61303b.checkItemAdStatus(str2, i).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static String a(Aweme aweme, String str) throws Exception {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{aweme, str3}, null, f61302a, true, 67433, new Class[]{Aweme.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme, str3}, null, f61302a, true, 67433, new Class[]{Aweme.class, String.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("dislike_reason_id", str3);
            if (aweme.getMusic() != null) {
                str2 = aweme.getMusic().getMid();
            } else {
                str2 = "";
            }
            hashMap.put("music_id", str2);
            hashMap.put("author_id", aweme.getAuthorUid());
            f61303b.disLikeReason(hashMap).execute();
            return str3;
        }
    }

    public static FeedItemList a(boolean z, String str, String str2, int i, long j, int i2, String str3) throws Exception {
        String str4;
        int i3;
        boolean z2;
        String str5 = str;
        String str6 = str2;
        int i4 = i;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str5, str6, Integer.valueOf(i), new Long(j2), Integer.valueOf(i2), str3}, null, f61302a, true, 67431, new Class[]{Boolean.TYPE, String.class, String.class, Integer.TYPE, Long.TYPE, Integer.TYPE, String.class}, FeedItemList.class)) {
            return (FeedItemList) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str5, str6, Integer.valueOf(i), new Long(j2), Integer.valueOf(i2), str3}, null, f61302a, true, 67431, new Class[]{Boolean.TYPE, String.class, String.class, Integer.TYPE, Long.TYPE, Integer.TYPE, String.class}, FeedItemList.class);
        }
        f fVar = new f();
        if (i4 == 0) {
            str4 = "https://aweme.snssdk.com/aweme/v1/aweme/post/";
        } else {
            str4 = "https://aweme.snssdk.com/aweme/v1/aweme/favorite/";
        }
        i iVar = new i(str4);
        if (i4 == 4) {
            iVar = new i("https://aweme.snssdk.com/aweme/v1/aweme/listcollection/");
            iVar.a("cursor", j2);
        } else {
            iVar.a("max_cursor", j2);
            if ((TextUtils.isEmpty(str2) || g.b().bF().intValue() == 0) && !TextUtils.isEmpty(str)) {
                iVar.a("user_id", str5);
            }
            if (!TextUtils.isEmpty(str2)) {
                iVar.a("sec_user_id", str6);
            }
        }
        iVar.a("count", i2);
        if (z) {
            i3 = 60;
        } else {
            i3 = 0;
        }
        String a2 = iVar.a();
        Class<FeedItemList> cls = FeedItemList.class;
        if (j2 <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        FeedItemList feedItemList = (FeedItemList) a.a(i3, a2, cls, null, fVar, z2, str3);
        feedItemList.setRequestId(com.ss.android.ugc.aweme.base.api.a.a(fVar));
        com.ss.android.ugc.aweme.profile.d.a.a(i4, str5, feedItemList);
        LinkDataApi.a("personal", feedItemList.items);
        return feedItemList;
    }
}
