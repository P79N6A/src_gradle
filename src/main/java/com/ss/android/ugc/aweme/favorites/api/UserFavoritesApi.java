package com.ss.android.ugc.aweme.favorites.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.favorites.a.h;
import com.ss.android.ugc.aweme.favorites.model.b;
import com.ss.android.ugc.aweme.favorites.model.c;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.a;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class UserFavoritesApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44269a;

    /* renamed from: b  reason: collision with root package name */
    public static final RetrofitApi f44270b = ((RetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RetrofitApi.class));

    public interface RetrofitApi {
        @GET(a = "/aweme/v1/aweme/collect/")
        i<BaseResponse> collectAweme(@Query(a = "aweme_id") String str, @Query(a = "action") int i);

        @GET(a = "/aweme/v1/challenge/collect/")
        i<BaseResponse> collectChallenge(@Query(a = "ch_id") String str, @Query(a = "action") int i);

        @GET(a = "/aweme/v1/music/collect/")
        i<BaseResponse> collectMusic(@Query(a = "music_id") String str, @Query(a = "action") int i);

        @GET(a = "/aweme/v1/poi/collect/")
        i<BaseResponse> collectPoi(@Query(a = "poi_id") String str, @Query(a = "action") int i);

        @GET(a = "/aweme/v1/aweme/listcollection/")
        i<BaseResponse> fetchCollectAwemeList(@Query(a = "cursor") int i, @Query(a = "count") int i2);

        @GET(a = "/aweme/v1/challenge/listcollection/")
        i<b> fetchCollectChallengeList(@Query(a = "cursor") int i, @Query(a = "count") int i2);

        @GET(a = "/aweme/v1/music/listcollection/")
        i<BaseResponse> fetchCollectMusicList(@Query(a = "cursor") int i, @Query(a = "count") int i2);

        @GET(a = "/aweme/v1/poi/listcollection/")
        i<c> fetchCollectPoiList(@Query(a = "cursor") int i, @Query(a = "count") int i2, @Query(a = "longitude") String str, @Query(a = "latitude") String str2);

        @GET(a = "/aweme/v1/sticker/listcollection/")
        i<h> fetchStickerList(@Query(a = "cursor") int i, @Query(a = "count") int i2);
    }

    public static b b(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f44269a, true, 39426, new Class[]{Integer.TYPE, Integer.TYPE}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f44269a, true, 39426, new Class[]{Integer.TYPE, Integer.TYPE}, b.class);
        }
        i<b> fetchCollectChallengeList = f44270b.fetchCollectChallengeList(i, i2);
        try {
            fetchCollectChallengeList.g();
        } catch (InterruptedException unused) {
        }
        if (fetchCollectChallengeList.d()) {
            try {
                throw fetchCollectChallengeList.f();
            } catch (Exception unused2) {
            }
        }
        return (b) fetchCollectChallengeList.e();
    }

    public static h c(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f44269a, true, 39427, new Class[]{Integer.TYPE, Integer.TYPE}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f44269a, true, 39427, new Class[]{Integer.TYPE, Integer.TYPE}, h.class);
        }
        i<h> fetchStickerList = f44270b.fetchStickerList(i, i2);
        try {
            fetchStickerList.g();
        } catch (InterruptedException unused) {
        }
        if (fetchStickerList.d()) {
            try {
                throw fetchStickerList.f();
            } catch (Exception unused2) {
            }
        }
        return (h) fetchStickerList.e();
    }

    public static c a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f44269a, true, 39425, new Class[]{Integer.TYPE, Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, f44269a, true, 39425, new Class[]{Integer.TYPE, Integer.TYPE}, c.class);
        }
        a f2 = af.a(d.a()).f();
        String str = "";
        String str2 = "";
        if (f2 != null) {
            str = String.valueOf(f2.longitude);
            str2 = String.valueOf(f2.latitude);
        }
        i<c> fetchCollectPoiList = f44270b.fetchCollectPoiList(i, i2, str, str2);
        try {
            fetchCollectPoiList.g();
        } catch (InterruptedException unused) {
        }
        if (fetchCollectPoiList.d()) {
            try {
                throw fetchCollectPoiList.f();
            } catch (Exception unused2) {
            }
        }
        return (c) fetchCollectPoiList.e();
    }
}
