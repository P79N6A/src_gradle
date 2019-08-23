package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

public class Category extends c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_data")
    @JsonAdapter(StringJsonAdapterFactory.class)
    CategoryListAdInfo adData;
    @SerializedName("category_type")
    private int categoryType;
    @SerializedName("challenge_info")
    private Challenge challenge;
    @SerializedName("desc")
    private String desc;
    @SerializedName("aweme_list")
    private List<Aweme> items;
    @SerializedName("music_info")
    private Music music;
    @SerializedName("word_record")
    private Word word;

    public CategoryListAdInfo getAdData() {
        return this.adData;
    }

    public int getCategoryType() {
        return this.categoryType;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<Aweme> getItems() {
        return this.items;
    }

    public Music getMusic() {
        return this.music;
    }

    public Word getWord() {
        return this.word;
    }

    public boolean isAd() {
        if (this.adData != null) {
            return true;
        }
        return false;
    }

    public boolean isChallenge() {
        if (this.challenge != null) {
            return true;
        }
        return false;
    }

    public boolean isMusic() {
        if (this.music != null) {
            return true;
        }
        return false;
    }

    public UrlModel getClickTrackUrlList() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.clickTrackUrlList;
    }

    public String getLogExtra() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.logExtra;
    }

    public UrlModel getTrackUrlList() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.trackUrlList;
    }

    public long getCreativeId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37001, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37001, new Class[0], Long.TYPE)).longValue();
        } else if (this.adData == null) {
            return 0;
        } else {
            return this.adData.getCreativeId().longValue();
        }
    }

    public boolean isChallengeAd() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37003, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37003, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (isAd() && this.challenge != null) {
            z = true;
        }
        return z;
    }

    public boolean isPicAd() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37002, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37002, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (isAd() && this.challenge == null) {
            z = true;
        }
        return z;
    }

    public void setCategoryType(int i) {
        this.categoryType = i;
    }

    public void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setItems(List<Aweme> list) {
        this.items = list;
    }

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public void setWord(Word word2) {
        this.word = word2;
    }
}
