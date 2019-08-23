package com.bytedance.android.live.base.model.user;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.a.b;
import com.bytedance.common.utility.Lists;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.ArrayList;
import java.util.List;

@Keep
public class User implements i {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("anchor_info")
    private a anchorInfo;
    @SerializedName("webcast_anchor_level")
    private b anchorLevel;
    @SerializedName("author_stats")
    private c authorInfo;
    @SerializedName("avatar_border")
    private ImageModel avatarBorder;
    @SerializedName("avatar_large")
    private ImageModel avatarLarge;
    @SerializedName("avatar_medium")
    private ImageModel avatarMedium;
    @SerializedName("avatar_thumb")
    private ImageModel avatarThumb;
    @SerializedName("avatar_url")
    private String avatarUrl;
    @SerializedName("bg_img_url")
    private String backgroundImgUrl;
    @SerializedName("badge_image_list")
    private List<ImageModel> badgeImageList;
    @SerializedName("birthday")
    private long birthday;
    @SerializedName("border")
    private d border;
    @SerializedName("minor_control")
    private e childrenManagerInfo;
    @SerializedName("city")
    private String city;
    @SerializedName("create_time")
    private long createTime;
    @SerializedName("display_id")
    public String displayId;
    @SerializedName("with_commerce_permission")
    private boolean enableShowCommerceSale;
    @SerializedName("encrypted_id")
    private String encryptedId = "";
    @SerializedName("experience")
    private int experience;
    @SerializedName("ticket_count")
    private long fanTicketCount;
    @SerializedName("fans_club")
    private FansClubMember fansClub;
    @SerializedName("follow_info")
    private g followInfo;
    @SerializedName("gender")
    private int gender;
    @SerializedName("id")
    private long id;
    @SerializedName("id_str")
    private String idStr;
    @SerializedName("income_share_percent")
    private int incomeSharePercent;
    @SerializedName("verified")
    private boolean isVerified;
    @SerializedName("level")
    private int level;
    @SerializedName("link_mic_stats")
    private int linkMicStats;
    private String logPb;
    private String mAvatarLargeStr;
    private String mAvatarMediumStr;
    private String mAvatarThumbStr;
    @SerializedName("medal")
    private ImageModel medal;
    @SerializedName("modify_time")
    private long modifyTime;
    private transient boolean neverRecharge;
    @SerializedName("new_real_time_icons")
    private List<ImageModel> newUserBadges;
    @SerializedName("nickname")
    private String nickName;
    @SerializedName("own_room")
    private a ownRoom;
    @SerializedName("total_recharge_diamond_count")
    private long payScores = -1;
    private String requestId;
    @SerializedName("room_auto_gift_thanks")
    private boolean roomAutoGiftThanks;
    @SerializedName("sec_uid")
    private String secUid;
    @SerializedName("secret")
    private int secret;
    @SerializedName("share_qrcode_uri")
    private String shareQrcodeUri;
    @SerializedName("short_id")
    private long shortId;
    @SerializedName("signature")
    private String signature;
    @SerializedName("special_id")
    private String specialId;
    @SerializedName("status")
    private int status;
    @SerializedName("telephone")
    private String telephone;
    @SerializedName("top_fans")
    private List<User> topFans;
    @SerializedName("top_vip_no")
    private int topVipNo;
    @SerializedName("user_attr")
    private k userAttr;
    @SerializedName("real_time_icons")
    private List<ImageModel> userBadges;
    @SerializedName("pay_grade")
    private m userHonor;
    @SerializedName("user_role")
    private int userRole;
    @SerializedName("verified_content")
    private String verifiedContent;
    @SerializedName("verified_reason")
    private String verifiedReason;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f7735a;
        @SerializedName("room_ids")

        /* renamed from: b  reason: collision with root package name */
        List<Long> f7736b;
    }

    public boolean childrenManagerForbidWalletFunctions() {
        return false;
    }

    public a getAnchorInfo() {
        return this.anchorInfo;
    }

    public b getAnchorLevel() {
        return this.anchorLevel;
    }

    public c getAuthorInfo() {
        return this.authorInfo;
    }

    public ImageModel getAvatarBorder() {
        return this.avatarBorder;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getBackgroundImgUrl() {
        return this.backgroundImgUrl;
    }

    public List<ImageModel> getBadgeImageList() {
        return this.badgeImageList;
    }

    public long getBirthday() {
        return this.birthday;
    }

    public d getBorder() {
        return this.border;
    }

    public String getCity() {
        return this.city;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getEncryptedId() {
        return this.encryptedId;
    }

    public int getExperience() {
        return this.experience;
    }

    public long getFanTicketCount() {
        return this.fanTicketCount;
    }

    public FansClubMember getFansClub() {
        return this.fansClub;
    }

    public g getFollowInfo() {
        return this.followInfo;
    }

    public int getGender() {
        return this.gender;
    }

    public long getId() {
        return this.id;
    }

    public int getIncomeSharePercent() {
        return this.incomeSharePercent;
    }

    public int getLevel() {
        return this.level;
    }

    public int getLinkMicStats() {
        return this.linkMicStats;
    }

    public String getLogPb() {
        return this.logPb;
    }

    public ImageModel getMedal() {
        return this.medal;
    }

    public long getModifyTime() {
        return this.modifyTime;
    }

    public String getNickName() {
        return this.nickName;
    }

    public a getOwnRoom() {
        return this.ownRoom;
    }

    public long getPayScores() {
        return this.payScores;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public boolean getRoomAutoGiftThanks() {
        return this.roomAutoGiftThanks;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public int getSecret() {
        return this.secret;
    }

    public String getShareQrcodeUri() {
        return this.shareQrcodeUri;
    }

    public long getShortId() {
        return this.shortId;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSpecialId() {
        return this.specialId;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public List<User> getTopFans() {
        return this.topFans;
    }

    public int getTopVipNo() {
        return this.topVipNo;
    }

    public k getUserAttr() {
        return this.userAttr;
    }

    public List<ImageModel> getUserBadges() {
        return this.userBadges;
    }

    public m getUserHonor() {
        return this.userHonor;
    }

    public int getUserRole() {
        return this.userRole;
    }

    public String getVerifiedContent() {
        return this.verifiedContent;
    }

    public String getVerifiedReason() {
        return this.verifiedReason;
    }

    public boolean isEnableShowCommerceSale() {
        return this.enableShowCommerceSale;
    }

    public boolean isNeverRecharge() {
        return this.neverRecharge;
    }

    public boolean isVerified() {
        return this.isVerified;
    }

    public boolean childrenManagerForbidCreateLiveRoom() {
        if (this.childrenManagerInfo == null || !this.childrenManagerInfo.f7755d) {
            return false;
        }
        return true;
    }

    public boolean isFollowing() {
        if (this.followInfo == null) {
            return false;
        }
        if (this.followInfo.f7764d == 2 || this.followInfo.f7764d == 1) {
            return true;
        }
        return false;
    }

    public String getIdStr() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 108, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 108, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.idStr)) {
            return String.valueOf(this.id);
        } else {
            return this.idStr;
        }
    }

    public List<ImageModel> getNewUserBadges() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 115, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 115, new Class[0], List.class);
        } else if (this.newUserBadges == null || this.newUserBadges.isEmpty()) {
            return this.userBadges;
        } else {
            return this.newUserBadges;
        }
    }

    public boolean isWithCommercePermission() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 109, new Class[0], Boolean.TYPE)) {
            return isEnableShowCommerceSale();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 109, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public ImageModel getAvatarLarge() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 113, new Class[0], ImageModel.class)) {
            return (ImageModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 113, new Class[0], ImageModel.class);
        }
        try {
            if (this.avatarLarge == null && !TextUtils.isEmpty(this.mAvatarLargeStr)) {
                this.avatarLarge = (ImageModel) com.bytedance.android.live.a.a().fromJson(this.mAvatarLargeStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarLarge;
    }

    public ImageModel getAvatarMedium() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, SearchJediMixFeedAdapter.f42516e, new Class[0], ImageModel.class)) {
            return (ImageModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, SearchJediMixFeedAdapter.f42516e, new Class[0], ImageModel.class);
        }
        try {
            if (this.avatarMedium == null && !TextUtils.isEmpty(this.mAvatarMediumStr)) {
                this.avatarMedium = (ImageModel) com.bytedance.android.live.a.a().fromJson(this.mAvatarMediumStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarMedium;
    }

    public ImageModel getAvatarThumb() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 111, new Class[0], ImageModel.class)) {
            return (ImageModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 111, new Class[0], ImageModel.class);
        }
        try {
            if (this.avatarThumb == null && !TextUtils.isEmpty(this.mAvatarThumbStr)) {
                this.avatarThumb = (ImageModel) com.bytedance.android.live.a.a().fromJson(this.mAvatarThumbStr, ImageModel.class);
            }
        } catch (Exception unused) {
        }
        return this.avatarThumb;
    }

    public long getLiveRoomId() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 114, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 114, new Class[0], Long.TYPE)).longValue();
        } else if (this.ownRoom == null) {
            return 0;
        } else {
            a aVar = this.ownRoom;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f7735a, false, 120, new Class[0], Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[0], aVar, a.f7735a, false, 120, new Class[0], Long.TYPE)).longValue();
            } else if (Lists.isEmpty(aVar.f7736b)) {
                return 0;
            } else {
                return aVar.f7736b.get(0).longValue();
            }
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 119, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 119, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.nickName != null) {
            i = this.nickName.hashCode();
        } else {
            i = 0;
        }
        int i25 = ((i * 31) + this.gender) * 31;
        if (this.signature != null) {
            i2 = this.signature.hashCode();
        } else {
            i2 = 0;
        }
        int i26 = (((((((i25 + i2) * 31) + this.level) * 31) + ((int) (this.id ^ (this.id >>> 32)))) * 31) + ((int) (this.createTime ^ (this.createTime >>> 32)))) * 31;
        if (this.city != null) {
            i3 = this.city.hashCode();
        } else {
            i3 = 0;
        }
        int i27 = (((i26 + i3) * 31) + ((int) (this.birthday ^ (this.birthday >>> 32)))) * 31;
        if (this.avatarThumb != null) {
            i4 = this.avatarThumb.hashCode();
        } else {
            i4 = 0;
        }
        int i28 = (i27 + i4) * 31;
        if (this.avatarMedium != null) {
            i5 = this.avatarMedium.hashCode();
        } else {
            i5 = 0;
        }
        int i29 = (i28 + i5) * 31;
        if (this.avatarLarge != null) {
            i6 = this.avatarLarge.hashCode();
        } else {
            i6 = 0;
        }
        int i30 = (i29 + i6) * 31;
        if (this.avatarUrl != null) {
            i7 = this.avatarUrl.hashCode();
        } else {
            i7 = 0;
        }
        int i31 = (i30 + i7) * 31;
        if (this.topFans != null) {
            i8 = this.topFans.hashCode();
        } else {
            i8 = 0;
        }
        int i32 = (i31 + i8) * 31;
        if (this.idStr != null) {
            i9 = this.idStr.hashCode();
        } else {
            i9 = 0;
        }
        int i33 = (((((((i32 + i9) * 31) + ((int) (this.shortId ^ (this.shortId >>> 32)))) * 31) + ((int) (this.fanTicketCount ^ (this.fanTicketCount >>> 32)))) * 31) + (this.isVerified ? 1 : 0)) * 31;
        if (this.verifiedReason != null) {
            i10 = this.verifiedReason.hashCode();
        } else {
            i10 = 0;
        }
        int i34 = (((i33 + i10) * 31) + this.topVipNo) * 31;
        if (this.userHonor != null) {
            i11 = this.userHonor.hashCode();
        } else {
            i11 = 0;
        }
        int i35 = (i34 + i11) * 31;
        if (this.anchorLevel != null) {
            i12 = this.anchorLevel.hashCode();
        } else {
            i12 = 0;
        }
        int i36 = (i35 + i12) * 31;
        if (this.userBadges != null) {
            i13 = this.userBadges.hashCode();
        } else {
            i13 = 0;
        }
        int i37 = (i36 + i13) * 31;
        if (this.newUserBadges != null) {
            i14 = this.newUserBadges.hashCode();
        } else {
            i14 = 0;
        }
        int i38 = (((i37 + i14) * 31) + this.linkMicStats) * 31;
        if (this.mAvatarThumbStr != null) {
            i15 = this.mAvatarThumbStr.hashCode();
        } else {
            i15 = 0;
        }
        int i39 = (i38 + i15) * 31;
        if (this.mAvatarMediumStr != null) {
            i16 = this.mAvatarMediumStr.hashCode();
        } else {
            i16 = 0;
        }
        int i40 = (i39 + i16) * 31;
        if (this.mAvatarLargeStr != null) {
            i17 = this.mAvatarLargeStr.hashCode();
        } else {
            i17 = 0;
        }
        int i41 = (((i40 + i17) * 31) + (this.enableShowCommerceSale ? 1 : 0)) * 31;
        if (this.backgroundImgUrl != null) {
            i18 = this.backgroundImgUrl.hashCode();
        } else {
            i18 = 0;
        }
        int i42 = (i41 + i18) * 31;
        if (this.telephone != null) {
            i19 = this.telephone.hashCode();
        } else {
            i19 = 0;
        }
        int i43 = (((((((((i42 + i19) * 31) + this.experience) * 31) + this.status) * 31) + ((int) (this.modifyTime ^ (this.modifyTime >>> 32)))) * 31) + this.secret) * 31;
        if (this.shareQrcodeUri != null) {
            i20 = this.shareQrcodeUri.hashCode();
        } else {
            i20 = 0;
        }
        int i44 = (((i43 + i20) * 31) + this.incomeSharePercent) * 31;
        if (this.badgeImageList != null) {
            i21 = this.badgeImageList.hashCode();
        } else {
            i21 = 0;
        }
        int i45 = (i44 + i21) * 31;
        if (this.followInfo != null) {
            i22 = this.followInfo.hashCode();
        } else {
            i22 = 0;
        }
        int i46 = (i45 + i22) * 31;
        if (this.userAttr != null) {
            i23 = this.userAttr.hashCode();
        } else {
            i23 = 0;
        }
        int i47 = (i46 + i23) * 31;
        if (this.anchorInfo != null) {
            i24 = this.anchorInfo.hashCode();
        }
        return i47 + i24;
    }

    public void setAVatarMediumStr(String str) {
        this.mAvatarMediumStr = str;
    }

    public void setAnchorInfo(a aVar) {
        this.anchorInfo = aVar;
    }

    public void setAnchorLevel(b bVar) {
        this.anchorLevel = bVar;
    }

    public void setAuthorInfo(c cVar) {
        this.authorInfo = cVar;
    }

    public void setAvatarBorder(ImageModel imageModel) {
        this.avatarBorder = imageModel;
    }

    public void setAvatarLarge(ImageModel imageModel) {
        this.avatarLarge = imageModel;
    }

    public void setAvatarLargeStr(String str) {
        this.mAvatarLargeStr = str;
    }

    public void setAvatarMedium(ImageModel imageModel) {
        this.avatarMedium = imageModel;
    }

    public void setAvatarThumb(ImageModel imageModel) {
        this.avatarThumb = imageModel;
    }

    public void setAvatarThumbStr(String str) {
        this.mAvatarThumbStr = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setBackgroundImgUrl(String str) {
        this.backgroundImgUrl = str;
    }

    public void setBadgeImageList(List<ImageModel> list) {
        this.badgeImageList = list;
    }

    public void setBirthday(long j) {
        this.birthday = j;
    }

    public void setBorder(d dVar) {
        this.border = dVar;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setEnableShowCommerceSale(boolean z) {
        this.enableShowCommerceSale = z;
    }

    public void setEncryptedId(String str) {
        this.encryptedId = str;
    }

    public void setExperience(int i) {
        this.experience = i;
    }

    public void setFanTicketCount(long j) {
        this.fanTicketCount = j;
    }

    public void setFansClub(FansClubMember fansClubMember) {
        this.fansClub = fansClubMember;
    }

    public void setFollowInfo(g gVar) {
        this.followInfo = gVar;
    }

    public void setGender(int i) {
        this.gender = i;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setIncomeSharePercent(int i) {
        this.incomeSharePercent = i;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    @SerializedName("link_mic_stats")
    public void setLinkMicStats(int i) {
        this.linkMicStats = i;
    }

    public void setLogPb(String str) {
        this.logPb = str;
    }

    public void setMedal(ImageModel imageModel) {
        this.medal = imageModel;
    }

    public void setModifyTime(long j) {
        this.modifyTime = j;
    }

    public void setNeverRecharge(boolean z) {
        this.neverRecharge = z;
    }

    public void setNewUserBadges(List<ImageModel> list) {
        this.newUserBadges = list;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setRoomAutoGiftThanks(boolean z) {
        this.roomAutoGiftThanks = z;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSecret(int i) {
        this.secret = i;
    }

    public void setShareQrcodeUri(String str) {
        this.shareQrcodeUri = str;
    }

    public void setShortId(long j) {
        this.shortId = j;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSpecialId(String str) {
        this.specialId = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTelephone(String str) {
        this.telephone = str;
    }

    public void setTopFans(List<User> list) {
        this.topFans = list;
    }

    public void setTopVipNo(int i) {
        this.topVipNo = i;
    }

    public void setUserAttr(k kVar) {
        this.userAttr = kVar;
    }

    public void setUserBadges(List<ImageModel> list) {
        this.userBadges = list;
    }

    public void setUserHonor(m mVar) {
        this.userHonor = mVar;
    }

    public void setUserRole(int i) {
        this.userRole = i;
    }

    public void setVerified(boolean z) {
        this.isVerified = z;
    }

    public void setVerifiedContent(String str) {
        this.verifiedContent = str;
    }

    public void setVerifiedReason(String str) {
        this.verifiedReason = str;
    }

    public void setFollowStatus(int i) {
        if (this.followInfo != null) {
            this.followInfo.f7764d = (long) i;
        }
    }

    public void setPayScores(long j) {
        this.payScores = j;
        if (j > 0) {
            this.neverRecharge = false;
        }
    }

    public void setWithCommercePermission(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 110, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 110, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        setEnableShowCommerceSale(z);
    }

    public static User from(@Nullable i iVar) {
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{iVar2}, null, changeQuickRedirect, true, 117, new Class[]{i.class}, User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[]{iVar2}, null, changeQuickRedirect, true, 117, new Class[]{i.class}, User.class);
        } else if (iVar2 == null) {
            return null;
        } else {
            if (iVar2 instanceof User) {
                Gson a2 = com.bytedance.android.live.a.a();
                return (User) a2.fromJson(a2.toJson((Object) iVar2), User.class);
            }
            User user = new User();
            user.initWith(iVar2);
            return user;
        }
    }

    private void initWith(@NonNull i iVar) {
        ArrayList arrayList;
        m mVar;
        b bVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, changeQuickRedirect, false, 116, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, changeQuickRedirect, false, 116, new Class[]{i.class}, Void.TYPE);
            return;
        }
        this.enableShowCommerceSale = iVar.isEnableShowCommerceSale();
        this.fanTicketCount = iVar.getFanTicketCount();
        this.shortId = iVar.getShortId();
        this.avatarUrl = iVar.getAvatarUrl();
        this.avatarThumb = iVar.getAvatarThumb();
        this.avatarMedium = iVar.getAvatarMedium();
        this.avatarLarge = iVar.getAvatarLarge();
        this.city = iVar.getCity();
        this.birthday = iVar.getBirthday();
        this.nickName = iVar.getNickName();
        this.gender = iVar.getGender();
        this.signature = iVar.getSignature();
        this.level = iVar.getLevel();
        this.id = iVar.getId();
        ArrayList arrayList5 = null;
        if (iVar.getTopFans() != null) {
            arrayList = new ArrayList(iVar.getTopFans());
        } else {
            arrayList = null;
        }
        this.topFans = arrayList;
        this.isVerified = iVar.isVerified();
        this.verifiedReason = iVar.getVerifiedReason();
        this.topVipNo = iVar.getTopVipNo();
        b userHonor2 = iVar.getUserHonor();
        if (PatchProxy.isSupport(new Object[]{userHonor2}, null, m.f7778a, true, 123, new Class[]{b.class}, m.class)) {
            mVar = (m) PatchProxy.accessDispatch(new Object[]{userHonor2}, null, m.f7778a, true, 123, new Class[]{b.class}, m.class);
        } else if (userHonor2 == null) {
            mVar = null;
        } else if (userHonor2 instanceof m) {
            Gson a2 = com.bytedance.android.live.a.a();
            mVar = (m) a2.fromJson(a2.toJson((Object) userHonor2), m.class);
        } else {
            m mVar2 = new m();
            if (PatchProxy.isSupport(new Object[]{userHonor2}, mVar2, m.f7778a, false, 122, new Class[]{b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userHonor2}, mVar2, m.f7778a, false, 122, new Class[]{b.class}, Void.TYPE);
            } else {
                mVar2.f7779b = userHonor2.a();
                mVar2.f7780c = userHonor2.b();
                mVar2.f7781d = userHonor2.c();
                mVar2.f7782e = userHonor2.d();
                mVar2.f7783f = userHonor2.e();
                mVar2.g = userHonor2.f();
                mVar2.h = userHonor2.g();
                mVar2.i = userHonor2.h();
                mVar2.j = userHonor2.i();
                mVar2.k = userHonor2.l();
                mVar2.l = userHonor2.j();
                mVar2.o = userHonor2.m();
                mVar2.m = userHonor2.n();
                mVar2.n = userHonor2.k();
                if (userHonor2.o() != null) {
                    arrayList4 = new ArrayList(userHonor2.o());
                } else {
                    arrayList4 = null;
                }
                mVar2.p = arrayList4;
                mVar2.q = userHonor2.p();
                mVar2.r = userHonor2.q();
                mVar2.s = userHonor2.r();
                mVar2.t = userHonor2.s();
                mVar2.u = userHonor2.t();
            }
            mVar = mVar2;
        }
        this.userHonor = mVar;
        com.bytedance.android.live.base.model.user.a.a anchorLevel2 = iVar.getAnchorLevel();
        if (PatchProxy.isSupport(new Object[]{anchorLevel2}, null, b.f7740a, true, 73, new Class[]{com.bytedance.android.live.base.model.user.a.a.class}, b.class)) {
            bVar = (b) PatchProxy.accessDispatch(new Object[]{anchorLevel2}, null, b.f7740a, true, 73, new Class[]{com.bytedance.android.live.base.model.user.a.a.class}, b.class);
        } else if (anchorLevel2 == null) {
            bVar = null;
        } else if (anchorLevel2 instanceof b) {
            bVar = (b) anchorLevel2;
        } else {
            b bVar2 = new b();
            if (PatchProxy.isSupport(new Object[]{anchorLevel2}, bVar2, b.f7740a, false, 72, new Class[]{com.bytedance.android.live.base.model.user.a.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{anchorLevel2}, bVar2, b.f7740a, false, 72, new Class[]{com.bytedance.android.live.base.model.user.a.a.class}, Void.TYPE);
            } else {
                bVar2.f7741b = anchorLevel2.a();
                bVar2.f7742c = anchorLevel2.b();
                bVar2.f7743d = anchorLevel2.c();
                bVar2.f7744e = anchorLevel2.d();
                bVar2.f7745f = anchorLevel2.e();
                bVar2.g = anchorLevel2.f();
                bVar2.h = anchorLevel2.g();
                bVar2.i = anchorLevel2.h();
                bVar2.j = anchorLevel2.i();
                bVar2.k = anchorLevel2.j();
                bVar2.l = anchorLevel2.k();
                bVar2.m = anchorLevel2.l();
                bVar2.n = anchorLevel2.m();
            }
            bVar = bVar2;
        }
        this.anchorLevel = bVar;
        this.createTime = iVar.getCreateTime();
        this.ownRoom = iVar.getOwnRoom();
        this.linkMicStats = iVar.getLinkMicStats();
        if (iVar.getUserBadges() != null) {
            arrayList2 = new ArrayList(iVar.getUserBadges());
        } else {
            arrayList2 = null;
        }
        this.userBadges = arrayList2;
        if (iVar.getNewUserBadges() != null) {
            arrayList3 = new ArrayList(iVar.getNewUserBadges());
        } else {
            arrayList3 = null;
        }
        this.newUserBadges = arrayList3;
        this.backgroundImgUrl = iVar.getBackgroundImgUrl();
        this.telephone = iVar.getTelephone();
        this.experience = iVar.getExperience();
        this.status = iVar.getStatus();
        this.modifyTime = iVar.getModifyTime();
        this.secret = iVar.getSecret();
        this.shareQrcodeUri = iVar.getShareQrcodeUri();
        this.incomeSharePercent = iVar.getIncomeSharePercent();
        if (iVar.getBadgeImageList() != null) {
            arrayList5 = new ArrayList(iVar.getBadgeImageList());
        }
        this.badgeImageList = arrayList5;
        this.followInfo = iVar.getFollowInfo();
        this.userAttr = iVar.getUserAttr();
        this.anchorInfo = iVar.getAnchorInfo();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 118, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 118, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            User user = (User) obj;
            if (this.gender != user.gender || this.level != user.level || this.id != user.id || this.createTime != user.createTime || this.birthday != user.birthday || this.shortId != user.shortId || this.fanTicketCount != user.fanTicketCount || this.isVerified != user.isVerified || this.topVipNo != user.topVipNo || getLiveRoomId() != user.getLiveRoomId() || this.linkMicStats != user.linkMicStats || this.enableShowCommerceSale != user.enableShowCommerceSale) {
                return false;
            }
            if (this.nickName == null ? user.nickName != null : !this.nickName.equals(user.nickName)) {
                return false;
            }
            if (this.signature == null ? user.signature != null : !this.signature.equals(user.signature)) {
                return false;
            }
            if (this.city == null ? user.city != null : !this.city.equals(user.city)) {
                return false;
            }
            if (this.avatarThumb == null ? user.avatarThumb != null : !this.avatarThumb.equals(user.avatarThumb)) {
                return false;
            }
            if (this.avatarMedium == null ? user.avatarMedium != null : !this.avatarMedium.equals(user.avatarMedium)) {
                return false;
            }
            if (this.avatarLarge == null ? user.avatarLarge != null : !this.avatarLarge.equals(user.avatarLarge)) {
                return false;
            }
            if (this.avatarUrl == null ? user.avatarUrl != null : !this.avatarUrl.equals(user.avatarUrl)) {
                return false;
            }
            if (this.topFans == null ? user.topFans != null : !this.topFans.equals(user.topFans)) {
                return false;
            }
            if (this.idStr == null ? user.idStr != null : !this.idStr.equals(user.idStr)) {
                return false;
            }
            if (this.verifiedReason == null ? user.verifiedReason != null : !this.verifiedReason.equals(user.verifiedReason)) {
                return false;
            }
            if (this.userHonor == null ? user.userHonor != null : !this.userHonor.equals(user.userHonor)) {
                return false;
            }
            if (this.anchorLevel == null ? user.anchorLevel != null : !this.anchorLevel.equals(user.anchorLevel)) {
                return false;
            }
            if (this.userBadges == null ? user.userBadges != null : !this.userBadges.equals(user.userBadges)) {
                return false;
            }
            if (this.newUserBadges == null ? user.newUserBadges != null : !this.newUserBadges.equals(user.newUserBadges)) {
                return false;
            }
            if (this.mAvatarThumbStr == null ? user.mAvatarThumbStr != null : !this.mAvatarThumbStr.equals(user.mAvatarThumbStr)) {
                return false;
            }
            if (this.mAvatarMediumStr == null ? user.mAvatarMediumStr != null : !this.mAvatarMediumStr.equals(user.mAvatarMediumStr)) {
                return false;
            }
            if (this.mAvatarLargeStr == null ? user.mAvatarLargeStr != null : !this.mAvatarLargeStr.equals(user.mAvatarLargeStr)) {
                return false;
            }
            if (this.backgroundImgUrl == null ? user.backgroundImgUrl != null : !this.backgroundImgUrl.equals(user.backgroundImgUrl)) {
                return false;
            }
            if (this.telephone == null ? user.telephone != null : !this.telephone.equals(user.telephone)) {
                return false;
            }
            if (this.experience != user.experience || this.status != user.status || this.modifyTime != user.modifyTime || this.secret != user.secret) {
                return false;
            }
            if (this.shareQrcodeUri == null ? user.shareQrcodeUri != null : !this.shareQrcodeUri.equals(user.shareQrcodeUri)) {
                return false;
            }
            if (this.incomeSharePercent != user.incomeSharePercent) {
                return false;
            }
            if (this.badgeImageList == null ? user.badgeImageList != null : !this.badgeImageList.equals(user.badgeImageList)) {
                return false;
            }
            if (this.followInfo == null ? user.followInfo != null : !this.followInfo.equals(user.followInfo)) {
                return false;
            }
            if (this.userAttr == null ? user.userAttr != null : !this.userAttr.equals(user.userAttr)) {
                return false;
            }
            if (this.anchorInfo != null) {
                return this.anchorInfo.equals(user.anchorInfo);
            }
            if (user.anchorInfo == null) {
                return true;
            }
            return false;
        }
    }
}
