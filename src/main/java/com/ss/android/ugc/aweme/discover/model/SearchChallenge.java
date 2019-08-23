package com.ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.model.p;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

public class SearchChallenge implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_data")
    @JsonAdapter(StringJsonAdapterFactory.class)
    p adData;
    @SerializedName("challenge_info")
    Challenge challenge;
    @SerializedName("position")
    List<Position> position;
    private String requestId;

    public p getAdData() {
        return this.adData;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public List<Position> getPosition() {
        return this.position;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37076, new Class[0], Integer.TYPE)) {
            return this.challenge.getCid().hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37076, new Class[0], Integer.TYPE)).intValue();
    }

    public void setRequestId(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 37074, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 37074, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.requestId = str;
        if (this.challenge != null) {
            this.challenge.setRequestId(str);
        }
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37075, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37075, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof SearchChallenge)) {
                return false;
            }
            return TextUtils.equals(this.challenge.getCid(), ((SearchChallenge) obj).challenge.getCid());
        }
    }
}
