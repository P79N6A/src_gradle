package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class x implements Serializable {
    @SerializedName("button_text")
    public String buttonText;
    @SerializedName("button_url")
    public String buttonUrl;
    @SerializedName("ext_id")
    public String extId;
    @SerializedName("id")
    public long id;
    @SerializedName("image_url")
    public UrlModel imageUrl;
    @SerializedName("name")
    public String name;
    @SerializedName("onsale")
    public String onSale;
    @SerializedName("price")
    public String price;
    @SerializedName("url")
    public String url;
}
