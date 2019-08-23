package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

public class AdDefaultSearchStruct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    @SerializedName("ad_data")
    @JsonAdapter(StringJsonAdapterFactory.class)
    private AwemeRawAd adData;
    @SerializedName("default_word")
    private String defaultWord;
    @SerializedName("position")
    private int position;
    @SerializedName("search_word")
    private String searchWord;

    public AwemeRawAd getAdData() {
        return this.adData;
    }

    public String getDefaultWord() {
        return this.defaultWord;
    }

    public int getPosition() {
        return this.position;
    }

    public String getSearchWord() {
        return this.searchWord;
    }
}
