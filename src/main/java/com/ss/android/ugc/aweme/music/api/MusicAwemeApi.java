package com.ss.android.ugc.aweme.music.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.Url;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.ss.android.ugc.aweme.music.presenter.b;
import io.reactivex.Observable;
import java.util.Map;

public final class MusicAwemeApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56296a;

    /* renamed from: b  reason: collision with root package name */
    public static final MusicService f56297b = ((MusicService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(MusicService.class));

    public interface MusicService {
        @FormUrlEncoded
        @POST("/aweme/v1/music/update/")
        Observable<b.a> alterMusicTitle(@Field(a = "music_id") String str, @Field(a = "title") String str2);

        @FormUrlEncoded
        @POST("/aweme/v1/music/create/")
        Call<String> createMusic(@FieldMap Map<String, String> map);

        @GET("/aweme/v1/music/collection/")
        q<MusicCollection> fetchMusicCollection(@Query(a = "cursor") long j, @Query(a = "count") int i);

        @GET("/aweme/v1/music/pick/")
        q<MusicList> fetchMusicHotList(@Query(a = "radio_cursor") long j);

        @GET("/aweme/v1/music/list/")
        q<MusicList> fetchMusicList(@Query(a = "mc_id") String str, @Query(a = "cursor") long j, @Query(a = "count") int i);

        @GET("/aweme/v1/original/music/list/")
        q<OriginalMusicList> fetchOriginalMusicList(@Query(a = "user_id") String str, @Query(a = "cursor") int i, @Query(a = "count") int i2);

        @GET("/aweme/v1/user/music/collect/")
        q<CollectedMusicList> fetchUserCollectedMusicList(@Query(a = "cursor") int i, @Query(a = "count") int i2);

        @GET
        q<MusicAwemeList> queryMusicAwemeList(@Url String str, @Query(a = "music_id") String str2, @Query(a = "cursor") long j, @Query(a = "count") int i, @Query(a = "type") int i2);

        @GET("/aweme/v1/music/partner/detail/")
        q<MusicDetail> queryPartnerMusic(@Query(a = "partner_music_id") String str, @Query(a = "partner_name") String str2);
    }

    public static MusicList a(String str, int i, int i2) throws Exception {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f56296a, true, 59992, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, MusicList.class)) {
            return (MusicList) f56297b.fetchMusicList(str2, (long) i, i2).get();
        }
        return (MusicList) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f56296a, true, 59992, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, MusicList.class);
    }
}
