package com.ss.android.ugc.aweme.shortvideo;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.commercialize.coupon.model.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

@Keep
public final class CreateAwemeResponse extends at implements h, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme")
    public Aweme aweme;
    @SerializedName("coupon_info")
    public c couponInfo;
    @SerializedName("log_pb")
    public LogPbBean logPbBean;
    @SerializedName("notify")
    public String[] notify;
    @SerializedName("notify_extra")
    public a notifyExtra;
    public String requestId;
    @SerializedName("share_tip_duration")
    public int shareTipDuration;

    public static final class a implements Serializable {
        @SerializedName("button_text")
        public String btnText;
        @SerializedName("text")
        public String text;
        @SerializedName("type")
        public int type;
    }

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final void setLogPbBean(LogPbBean logPbBean2) {
        this.logPbBean = logPbBean2;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }
}
