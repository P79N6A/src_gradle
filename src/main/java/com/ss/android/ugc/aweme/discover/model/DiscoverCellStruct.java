package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R \u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR \u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010!R\u001e\u0010\"\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010!\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b&\u0010\u0013R\u0011\u0010'\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010\u0013R \u0010)\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0011\u00102\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b3\u0010\u0013R \u00104\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0013\"\u0004\b6\u0010\u0015R\u001e\u00107\u001a\u00020-8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010/\"\u0004\b9\u00101¨\u0006:"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/DiscoverCellStruct;", "", "()V", "avatarUrl", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getAvatarUrl", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setAvatarUrl", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "awemeList", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getAwemeList", "()Ljava/util/List;", "setAwemeList", "(Ljava/util/List;)V", "buttonName", "", "getButtonName", "()Ljava/lang/String;", "setButtonName", "(Ljava/lang/String;)V", "cellId", "getCellId", "setCellId", "coverUrl", "getCoverUrl", "setCoverUrl", "desc", "getDesc", "setDesc", "isCommerceChallenge", "", "()Z", "isRecommend", "setRecommend", "(Z)V", "mobIdKey", "getMobIdKey", "playListType", "getPlayListType", "refUrl", "getRefUrl", "setRefUrl", "subtype", "", "getSubtype", "()I", "setSubtype", "(I)V", "subtypeValue", "getSubtypeValue", "title", "getTitle", "setTitle", "type", "getType", "setType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiscoverCellStruct {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avatar_url")
    @Nullable
    public UrlModel avatarUrl;
    @SerializedName("aweme_list")
    @Nullable
    public List<? extends Aweme> awemeList;
    @SerializedName("button_name")
    @Nullable
    public String buttonName;
    @SerializedName("cell_id")
    @Nullable
    public String cellId;
    @SerializedName("cover_url")
    @Nullable
    public UrlModel coverUrl;
    @SerializedName("desc")
    @Nullable
    public String desc;
    @SerializedName("is_recommend")
    public boolean isRecommend;
    @SerializedName("ref_url")
    @Nullable
    public String refUrl;
    @SerializedName("subtype")
    public int subtype;
    @SerializedName("title")
    @Nullable
    public String title;
    @SerializedName("type")
    public int type;

    public final boolean isCommerceChallenge() {
        if (this.subtype == 4) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getMobIdKey() {
        int i = this.subtype;
        if (i == 3) {
            return "playlist_tag_id";
        }
        if (i == 8) {
            return "playlist_artist";
        }
        switch (i) {
            case 5:
                return "playlist_music_id";
            case 6:
                return "playlist_uid";
            default:
                return "playlist_id";
        }
    }

    @NotNull
    public final String getPlayListType() {
        int i = this.subtype;
        if (i == 8) {
            return "artist";
        }
        switch (i) {
            case 0:
                return "normal_playlist";
            case 1:
                return "sticker";
            case 2:
                return PushConstants.INTENT_ACTIVITY_NAME;
            case 3:
            case 4:
                return "challenge";
            case 5:
                return "music";
            default:
                return AllStoryActivity.f73306b;
        }
    }

    @NotNull
    public final String getSubtypeValue() {
        switch (this.subtype) {
            case 0:
                return "normal_playlist";
            case 1:
                return "sticker";
            case 2:
                return PushConstants.INTENT_ACTIVITY_NAME;
            case 3:
            case 4:
                return "challenge";
            case 5:
                return "music";
            case 6:
                return AllStoryActivity.f73306b;
            case 8:
                return "artist";
            default:
                return "unknown_type";
        }
    }
}
