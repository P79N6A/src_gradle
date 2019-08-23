package com.bytedance.android.livesdk.verify;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.verify.model.GetCertificationEntranceResponse;
import com.bytedance.android.livesdk.verify.model.ZhimaPollingResponse;
import com.bytedance.android.livesdk.verify.model.ZhimaStatusResponse;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface ZhimaVerifyApi {
    @GET("/webcast/certification/get_certification_entrance/")
    Observable<d<GetCertificationEntranceResponse>> getCertificationEntrance();

    @GET("/webcast/certification/get_certification_status/")
    Observable<d<ZhimaStatusResponse>> getCertificationStatus();

    @GET("/webcast/certification/query/")
    Observable<d<ZhimaPollingResponse>> queryPollingStatus(@Query(a = "zhima_token") String str, @Query(a = "transaction_id") String str2);
}
