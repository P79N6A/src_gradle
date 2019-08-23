package com.ss.android.ugc.aweme.music.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.Map;

public final class MusicApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56294a;

    /* renamed from: b  reason: collision with root package name */
    public static final MusicService f56295b = ((MusicService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(MusicService.class));

    public interface MusicService {
        @GET("/aweme/v1/music/detail/")
        q<MusicDetail> queryMusic(@Query(a = "music_id") String str, @Query(a = "click_reason") int i);

        @FormUrlEncoded
        @POST("/aweme/v1/music/user/create/")
        Call<String> uploadLocalMusicInfo(@FieldMap Map<String, String> map);
    }

    public static MusicDetail a(String str, int i) throws Exception {
        String trim;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, null, f56294a, true, 59987, new Class[]{String.class, Integer.TYPE}, MusicDetail.class)) {
            return (MusicDetail) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, null, f56294a, true, 59987, new Class[]{String.class, Integer.TYPE}, MusicDetail.class);
        }
        MusicService musicService = f56295b;
        if (str == null) {
            trim = str;
        } else {
            trim = str.trim();
        }
        return (MusicDetail) musicService.queryMusic(trim, i).get();
    }
}
