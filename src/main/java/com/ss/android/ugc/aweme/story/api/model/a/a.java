package com.ss.android.ugc.aweme.story.api.model.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public final class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad")
    com.ss.android.ugc.aweme.story.api.model.a.a.a ad;
    @SerializedName("card")
    int cardType;

    public final com.ss.android.ugc.aweme.story.api.model.a.a.a getAd() {
        return this.ad;
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final void setAd(com.ss.android.ugc.aweme.story.api.model.a.a.a aVar) {
        this.ad = aVar;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }
}
