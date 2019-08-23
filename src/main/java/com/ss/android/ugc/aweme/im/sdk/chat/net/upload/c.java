package com.ss.android.ugc.aweme.im.sdk.chat.net.upload;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.Required;
import java.io.Serializable;

public class c implements Serializable {
    @SerializedName("app_key")
    public String appKey;
    @SerializedName("authorization")
    @Required
    public String authorization;
    @SerializedName("expire_at")
    public long expireAt;
    @SerializedName("file_host_name")
    public String fileHostName;
    @SerializedName("file_retry_count")
    public int fileRetryCount;
    @SerializedName("image_host_name")
    public String imageHostName;
    @SerializedName("max_fail_time")
    public int maxFailTime;
    @SerializedName("max_fail_time_enabled")
    public boolean maxFailTimeEnabled;
    @SerializedName("rw_timeout")
    public int rwTimeout;
    @SerializedName("socket_number")
    public int socketNumber;
}
