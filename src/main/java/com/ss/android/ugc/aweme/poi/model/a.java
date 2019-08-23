package com.ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import java.util.List;

public class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private AwemeRawAd mAwemeRawAd;
    private List<AwemeRawAd> mAwemeRawAds;
    @SerializedName("raw_data")
    private String rawData;
    @SerializedName("raw_datas")
    private List<String> rawDatas;
    @SerializedName("title")
    private String title;

    public AwemeRawAd getAwemeAd() {
        return this.mAwemeRawAd;
    }

    public List<AwemeRawAd> getAwemeAds() {
        return this.mAwemeRawAds;
    }

    public String getRawData() {
        return this.rawData;
    }

    public List<String> getRawDatas() {
        return this.rawDatas;
    }

    public String getTitle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 64992, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 64992, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.title)) {
            return "";
        } else {
            return this.title;
        }
    }

    public void parseRawData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 64994, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 64994, new Class[0], Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.rawData)) {
            this.mAwemeRawAd = getAwemeRawAd(this.rawData);
        }
        if (this.mAwemeRawAd == null && !CollectionUtils.isEmpty(this.rawDatas)) {
            for (String awemeRawAd : this.rawDatas) {
                AwemeRawAd awemeRawAd2 = getAwemeRawAd(awemeRawAd);
                if (awemeRawAd2 != null && !awemeRawAd2.isNewStyleAd()) {
                    this.mAwemeRawAd = awemeRawAd2;
                    return;
                }
            }
        }
    }

    public void setAwemeRawAds(List<AwemeRawAd> list) {
        this.mAwemeRawAds = list;
    }

    public void setRawData(String str) {
        this.rawData = str;
    }

    public static AwemeRawAd getAwemeRawAd(String str) {
        AwemeRawAd awemeRawAd;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 64993, new Class[]{String.class}, AwemeRawAd.class)) {
            return (AwemeRawAd) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 64993, new Class[]{String.class}, AwemeRawAd.class);
        }
        try {
            awemeRawAd = (AwemeRawAd) new Gson().fromJson(str2, new TypeToken<AwemeRawAd>() {
            }.getType());
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            awemeRawAd = null;
        }
        return awemeRawAd;
    }
}
