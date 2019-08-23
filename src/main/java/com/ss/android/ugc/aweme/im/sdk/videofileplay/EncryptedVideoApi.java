package com.ss.android.ugc.aweme.im.sdk.videofileplay;

import a.i;
import com.ss.android.ugc.aweme.im.sdk.videofileplay.a.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/EncryptedVideoApi;", "", "getVideoPlayUrl", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/model/VideoUrlResponse;", "tosKey", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface EncryptedVideoApi {
    @NotNull
    @GET(a = "maya/story/video_play_url/")
    i<b> getVideoPlayUrl(@NotNull @Query(a = "tos_key", b = true) String str);
}
