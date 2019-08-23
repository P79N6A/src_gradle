package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

public class SearchMix extends SearchApiResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme_list")
    public List<Aweme> awemeList;
    @SerializedName("challenge_list")
    public List<SearchChallenge> challengeList;
    @SerializedName("cursor")
    public int cursor;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("has_top_user")
    public boolean hasTopUser;
    @SerializedName("modules")
    public List<String> modulesList;
    @SerializedName("music_list")
    public List<Music> musicLists;
    @SerializedName("poi_info_list")
    public List<SearchPoi> poiList;
    @SerializedName("user_list")
    public List<SearchUser> users;

    public boolean isAllEmpty() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37104, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37104, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!CollectionUtils.isEmpty(this.users) || !CollectionUtils.isEmpty(this.musicLists) || !CollectionUtils.isEmpty(this.challengeList) || !CollectionUtils.isEmpty(this.awemeList)) {
            return false;
        } else {
            return true;
        }
    }
}
