package com.ss.android.ugc.aweme.profile.api;

import com.ss.android.ugc.aweme.profile.model.RoomResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/api/RoomRetrofitApi;", "", "roomInfo", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/profile/model/RoomResponse;", "roomId", "", "packLevel", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface RoomRetrofitApi {
    @NotNull
    @GET(a = "/webcast/room/info/")
    Observable<RoomResponse> roomInfo(@Query(a = "room_id") long j, @Query(a = "pack_level") int i);
}
