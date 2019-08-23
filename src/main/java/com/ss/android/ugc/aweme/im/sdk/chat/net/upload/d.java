package com.ss.android.ugc.aweme.im.sdk.chat.net.upload;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public final class d implements Serializable {
    @SerializedName("fatal_item_ids")
    public List<String> fatalTimeIds;
    @SerializedName("logid")
    String logid;
    @SerializedName("now")
    public long now;
}
