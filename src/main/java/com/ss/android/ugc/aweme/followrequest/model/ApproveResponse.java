package com.ss.android.ugc.aweme.followrequest.model;

import android.support.annotation.Keep;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.api.Required;

@Keep
public class ApproveResponse extends BaseResponse {
    @Required
    public int approve_status = 1;
}
