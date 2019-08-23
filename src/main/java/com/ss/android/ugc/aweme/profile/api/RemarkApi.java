package com.ss.android.ugc.aweme.profile.api;

import a.i;
import com.ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RemarkApi {
    @FormUrlEncoded
    @POST(a = "/aweme/v1/user/remark/name/")
    i<CommitRemarkNameResponse> commitRemarkName(@Field(a = "remark_name") String str, @Field(a = "user_id") String str2, @Field(a = "sec_user_id") String str3);

    @FormUrlEncoded
    @POST(a = "/aweme/v1/user/contact/book/remark/name/")
    i<CommitRemarkNameResponse> getContackBookRemarkName(@Field(a = "user_id") String str, @Field(a = "sec_user_id") String str2);
}
