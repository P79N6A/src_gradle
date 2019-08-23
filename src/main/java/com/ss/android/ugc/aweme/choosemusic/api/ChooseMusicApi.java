package com.ss.android.ugc.aweme.choosemusic.api;

import a.i;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.challenge.ChallengeType;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.choosemusic.d.t;
import com.ss.android.ugc.aweme.choosemusic.d.v;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import com.ss.android.ugc.aweme.music.model.MusicList;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class ChooseMusicApi {

    /* renamed from: a  reason: collision with root package name */
    static API f35797a = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(API.class));

    public interface API {
        @GET(a = "/aweme/v1/music/collect/")
        i<BaseResponse> collectMusic(@Query(a = "music_id") String str, @Query(a = "action") int i);

        @GET(a = "/aweme/v1/challenge/detail/")
        i<ChallengeDetail> fetchChallengeDetail(@Query(a = "ch_id") String str, @Query(a = "hashtag_name") String str2, @ChallengeType.TYPE @Query(a = "query_type") int i, @Query(a = "click_reason") int i2);

        @GET(a = "/aweme/v1/commerce/challenge/detail/")
        i<ChallengeDetail> fetchCommerceChallengeDetail(@Query(a = "ch_id") String str, @Query(a = "hashtag_name") String str2, @ChallengeType.TYPE @Query(a = "query_type") int i, @Query(a = "click_reason") int i2);

        @GET(a = "/aweme/v1/hot/music/")
        i<MusicList> getHotMusicList(@Query(a = "cursor") int i, @Query(a = "count") int i2);

        @GET(a = "/aweme/v1/music/collection/")
        i<MusicCollection> getMusicSheet(@Query(a = "cursor") int i, @Query(a = "count") int i2);

        @GET(a = "/aweme/v1/music/recommend/by/video/")
        i<MusicList> getRecommenMusicListFromAI(@Query(a = "cursor") int i, @Query(a = "count") int i2, @Query(a = "from") String str, @Query(a = "zip_uri") String str2, @Query(a = "music_ailab_ab") String str3, @Query(a = "creation_id") String str4);

        @GET(a = "/aweme/v1/sticker/music")
        i<MusicList> getStickerMusic(@Query(a = "sticker") String str);

        @GET(a = "/aweme/v1/music/collection/feed/")
        i<t> musicCollectionFeed(@Query(a = "cursor") Integer num, @Query(a = "count") Integer num2);

        @GET(a = "/aweme/v1/music/list/")
        i<MusicList> musicList(@Query(a = "mc_id") String str, @Query(a = "cursor") int i, @Query(a = "count") int i2);

        @GET(a = "/aweme/v1/music/pick/")
        i<v> musicPick(@Query(a = "radio_cursor") Integer num, @Query(a = "extra_music_ids") String str);

        @GET(a = "/aweme/v1/user/music/collect/")
        i<CollectedMusicList> userCollectedMusicList(@Query(a = "cursor") int i, @Query(a = "count") int i2);
    }

    public static API a() {
        return f35797a;
    }
}
