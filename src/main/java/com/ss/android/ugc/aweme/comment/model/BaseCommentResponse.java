package com.ss.android.ugc.aweme.comment.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/comment/model/BaseCommentResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "()V", "logPd", "Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "getLogPd", "()Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class BaseCommentResponse extends BaseResponse {
    @SerializedName("log_pb")
    @Nullable
    public final LogPbBean logPd;
}
