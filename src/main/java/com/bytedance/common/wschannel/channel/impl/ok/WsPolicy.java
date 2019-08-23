package com.bytedance.common.wschannel.channel.impl.ok;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.wschannel.channel.impl.ok.policy.HeartBeatPolicy;
import com.bytedance.common.wschannel.channel.impl.ok.policy.RetryPolicy;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Response;

public class WsPolicy {
    private final HeartBeatPolicy mHeartBeatPolicy;
    private int mIndex;
    private RetryPolicy mRetryPolicy;
    private String mTargetUrl;
    private final List<String> mUrls = new ArrayList();

    /* access modifiers changed from: package-private */
    public synchronized void reset() {
        this.mRetryPolicy.reset();
        this.mTargetUrl = null;
        this.mIndex = 0;
    }

    private synchronized String getNextUrl() {
        int i = this.mIndex + 1;
        this.mIndex = i;
        if (this.mUrls.size() <= i) {
            return "";
        }
        this.mTargetUrl = this.mUrls.get(i);
        return this.mTargetUrl;
    }

    public synchronized String getUrl() {
        if (StringUtils.isEmpty(this.mTargetUrl) && this.mUrls.size() > this.mIndex) {
            this.mTargetUrl = this.mUrls.get(this.mIndex);
        }
        return this.mTargetUrl;
    }

    /* access modifiers changed from: package-private */
    public synchronized Pair<String, Long> getRetryUrlAndInterval(Response response) {
        String url;
        long retryIntervalWithResponse;
        url = getUrl();
        retryIntervalWithResponse = this.mRetryPolicy.getRetryIntervalWithResponse(response);
        if (retryIntervalWithResponse == -1) {
            this.mRetryPolicy.reset();
            url = getNextUrl();
            if (!TextUtils.isEmpty(url)) {
                retryIntervalWithResponse = this.mRetryPolicy.getRandomInterval();
            }
        }
        return new Pair<>(url, Long.valueOf(retryIntervalWithResponse));
    }

    WsPolicy(List<String> list, RetryPolicy retryPolicy, HeartBeatPolicy heartBeatPolicy) {
        if (list != null) {
            this.mUrls.addAll(list);
        }
        this.mRetryPolicy = retryPolicy;
        this.mHeartBeatPolicy = heartBeatPolicy;
        reset();
    }
}
