package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.a;
import com.bytedance.retrofit2.http.GET;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'¨\u0006\u0006"}, d2 = {"Lcom/bytedance/android/livesdk/chatroom/api/CoverApi;", "", "anchorCoverStatus", "Lio/reactivex/Observable;", "Lcom/bytedance/android/live/core/network/response/Response;", "Lcom/bytedance/android/livesdk/chatroom/model/AnchorCover;", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public interface CoverApi {
    @NotNull
    @GET("/webcast/room/anchor_cover_status/")
    Observable<d<a>> anchorCoverStatus();
}
