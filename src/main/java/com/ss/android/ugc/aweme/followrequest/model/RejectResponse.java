package com.ss.android.ugc.aweme.followrequest.model;

import android.support.annotation.Keep;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.api.Required;

@Keep
public class RejectResponse extends BaseResponse {
    @Required
    public int reject_status = 1;
}
