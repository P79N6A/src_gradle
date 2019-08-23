package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import org.json.JSONObject;

public class CardStruct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("card_data")
    private Object cardData;
    @SerializedName("card_style")
    int cardStyle;
    @SerializedName("card_type")
    int cardType;
    @SerializedName("card_url")
    String cardUrl;
    @SerializedName("show_duration")
    private int showDuration;
    @SerializedName("show_seconds")
    int showSeconds;

    public interface IStatusCode {
    }

    public int getCardStyle() {
        return this.cardStyle;
    }

    public int getCardType() {
        return this.cardType;
    }

    public String getCardUrl() {
        return this.cardUrl;
    }

    public int getShowDuration() {
        return this.showDuration;
    }

    public int getShowSeconds() {
        return this.showSeconds;
    }

    public JSONObject getCardData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41450, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41450, new Class[0], JSONObject.class);
        }
        try {
            return new JSONObject(new Gson().toJson(this.cardData));
        } catch (Exception unused) {
            return null;
        }
    }
}
