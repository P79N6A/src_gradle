package com.ss.android.ugc.aweme.report.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

@Keep
public class Report extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getMessage() {
        return this.message;
    }

    public void setStatusMessage(String str) {
        this.message = str;
    }
}
