package com.ss.android.ugc.aweme.discover.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.Required;
import com.ss.android.ugc.aweme.base.api.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.c.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.dj;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Keep
public class Challenge extends c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("allow_upload_cover")
    public int allowUploadCover;
    @SerializedName("cha_attrs")
    public List<String> attrs;
    @SerializedName("author")
    public User author;
    @SerializedName("background_image_url")
    public UrlModel backgroundImageUrl;
    @Nullable
    @SerializedName("category_cover_info")
    public CategoryCoverStruct categoryCover;
    @SerializedName("announcement_info")
    public ChallengeAnnouncement challengeAnnouncement;
    @SerializedName("cover_photo")
    public String challengeBgUrl;
    @SerializedName("disclaimer")
    public ChallengeDisclaimer challengeDisclaimer;
    @SerializedName("cha_name")
    public String challengeName;
    @SerializedName("hashtag_profile")
    public String challengeProfileUrl;
    @SerializedName("sticker_detail")
    @JsonAdapter(a.class)
    public String challengeStickerDetail;
    @SerializedName("cid")
    @Required
    public String cid;
    @SerializedName("collect_stat")
    public int collectStatus;
    @SerializedName("banner_list")
    public List<CommerceChallengeBanner> commerceChallengeBannerList;
    @SerializedName("commerce_sub_type")
    public int commerceSubType = 0;
    @SerializedName("connect_music")
    public List<Music> connectMusics;
    @SerializedName("content_type")
    public int contentType;
    @SerializedName("cover_item")
    public UrlModel coverItem;
    @SerializedName("desc")
    @JsonAdapter(dj.class)
    public String desc;
    @SerializedName("inquiry")
    public InquiryStruct inquiryStruct;
    @SerializedName("is_challenge")
    public int isChallenge;
    @SerializedName("is_commerce")
    public boolean isCommerceAndValid;
    @SerializedName("is_hot_search")
    public int isHotSearch;
    @SerializedName("link_action")
    public String linkAction;
    @SerializedName("link_text")
    public String linkText;
    @SerializedName("link_title")
    public String linkTitle;
    @SerializedName("link_type")
    public int linkType;
    @SerializedName("module_type")
    public int moduleType;
    @SerializedName("label_origin_author")
    public String originAuthor;
    @SerializedName("is_pgcshow")
    public boolean pgcshow;
    @SerializedName("profile_tag")
    public String profileTagUrl;
    @SerializedName("related_challenges")
    public List<Challenge> relatedChallenges = new ArrayList();
    public String requestId;
    @SerializedName("schema")
    public String schema;
    @SerializedName("share_info")
    public ShareInfo shareInfo;
    @SerializedName("show_items")
    public List<ShowItemsStruct> showItems;
    @SerializedName("sticker_id")
    public String stickerId;
    @SerializedName("sub_type")
    public int subType;
    @SerializedName("button")
    public ChallengeTransform transfrom;
    @SerializedName("type")
    public int type;
    @SerializedName("user_count")
    public int userCount;
    @SerializedName("view_count")
    public long viewCount = -1;

    public interface ChallengeSubType {
    }

    public List<String> getAttrs() {
        return this.attrs;
    }

    public User getAuthor() {
        return this.author;
    }

    public UrlModel getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    @Nullable
    public CategoryCoverStruct getCategoryCover() {
        return this.categoryCover;
    }

    public ChallengeAnnouncement getChallengeAnnouncement() {
        return this.challengeAnnouncement;
    }

    public String getChallengeBgUrl() {
        return this.challengeBgUrl;
    }

    public ChallengeDisclaimer getChallengeDisclaimer() {
        return this.challengeDisclaimer;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getChallengeProfileUrl() {
        return this.challengeProfileUrl;
    }

    public String getChallengeStickerDetail() {
        return this.challengeStickerDetail;
    }

    public String getCid() {
        return this.cid;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public List<Music> getConnectMusics() {
        return this.connectMusics;
    }

    public int getContentType() {
        return this.contentType;
    }

    public UrlModel getCoverItem() {
        return this.coverItem;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getLinkAction() {
        return this.linkAction;
    }

    public String getLinkText() {
        return this.linkText;
    }

    public String getLinkTitle() {
        return this.linkTitle;
    }

    public int getModuleType() {
        return this.moduleType;
    }

    public String getProfileTagUrl() {
        return this.profileTagUrl;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getSchema() {
        return this.schema;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getSubType() {
        return this.subType;
    }

    public ChallengeTransform getTransfrom() {
        return this.transfrom;
    }

    public int getType() {
        return this.type;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getViewCount() {
        return this.viewCount;
    }

    public boolean isCommerceAndValid() {
        return this.isCommerceAndValid;
    }

    public boolean isPgcshow() {
        return this.pgcshow;
    }

    public boolean allowUploadCover() {
        if (this.allowUploadCover == 1) {
            return true;
        }
        return false;
    }

    public boolean isChallenge() {
        if (this.isChallenge == 1) {
            return true;
        }
        return false;
    }

    public boolean isCommerce() {
        if (this.subType == 1) {
            return true;
        }
        return false;
    }

    public boolean isTrending() {
        if (this.isHotSearch == 1) {
            return true;
        }
        return false;
    }

    public boolean isLinkActionAsOpenUrl() {
        if (this.linkType == 7) {
            return true;
        }
        return false;
    }

    public long getDisplayCount() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37009, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37009, new Class[0], Long.TYPE)).longValue();
        }
        long viewCount2 = getViewCount();
        if (viewCount2 >= 0) {
            return viewCount2;
        }
        return (long) getUserCount();
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37011, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37011, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.cid != null) {
            i = this.cid.hashCode();
        }
        return i;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setBackgroundImageUrl(UrlModel urlModel) {
        this.backgroundImageUrl = urlModel;
    }

    public void setChallengeAnnouncement(ChallengeAnnouncement challengeAnnouncement2) {
        this.challengeAnnouncement = challengeAnnouncement2;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setCommerce(boolean z) {
        this.isCommerceAndValid = z;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setLinkAction(String str) {
        this.linkAction = str;
    }

    public void setLinkText(String str) {
        this.linkText = str;
    }

    public void setLinkTitle(String str) {
        this.linkTitle = str;
    }

    public void setOriginAuthor(String str) {
        this.originAuthor = str;
    }

    public void setRelatedChallenges(List<Challenge> list) {
        this.relatedChallenges = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setShareInfo(ShareInfo shareInfo2) {
        this.shareInfo = shareInfo2;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37010, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37010, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof Challenge)) {
                return false;
            }
            return TextUtils.equals(this.cid, ((Challenge) obj).cid);
        }
    }
}
