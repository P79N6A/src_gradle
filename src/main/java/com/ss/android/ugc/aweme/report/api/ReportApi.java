package com.ss.android.ugc.aweme.report.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.ss.android.ugc.aweme.report.model.Report;

public interface ReportApi {
    @GET("/aweme/v1/aweme/feedback/reasons/")
    Call<Report> getReportReason(@Query(a = "report_type") String str);

    @GET("/aweme/v1/aweme/feedback/")
    Call<Report> report(@Query(a = "object_id") String str, @Query(a = "owner_id") String str2, @Query(a = "report_type") String str3, @Query(a = "reason") int i);

    @GET("/aweme/v2/community/discipline/vote/")
    Call<Report> voteForCommunityDiscipline(@Query(a = "item_id") String str, @Query(a = "vote_type") int i);
}
