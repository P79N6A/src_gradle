package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Extra {
    @SerializedName("fatal_item_ids")
    public List<String> fatalItemIds;
    public long now;
}
