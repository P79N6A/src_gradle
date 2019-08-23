package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

public interface i {

    public enum a {
        Login,
        Logout,
        Update;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    boolean childrenManagerForbidCreateLiveRoom();

    boolean childrenManagerForbidWalletFunctions();

    a getAnchorInfo();

    com.bytedance.android.live.base.model.user.a.a getAnchorLevel();

    ImageModel getAvatarLarge();

    ImageModel getAvatarMedium();

    ImageModel getAvatarThumb();

    String getAvatarUrl();

    String getBackgroundImgUrl();

    List<ImageModel> getBadgeImageList();

    long getBirthday();

    String getCity();

    long getCreateTime();

    int getExperience();

    long getFanTicketCount();

    g getFollowInfo();

    int getGender();

    long getId();

    int getIncomeSharePercent();

    int getLevel();

    int getLinkMicStats();

    long getModifyTime();

    List<ImageModel> getNewUserBadges();

    String getNickName();

    User.a getOwnRoom();

    long getPayScores();

    String getSecUid();

    int getSecret();

    String getShareQrcodeUri();

    long getShortId();

    String getSignature();

    int getStatus();

    String getTelephone();

    List<User> getTopFans();

    int getTopVipNo();

    k getUserAttr();

    List<ImageModel> getUserBadges();

    b getUserHonor();

    String getVerifiedReason();

    boolean isEnableShowCommerceSale();

    boolean isFollowing();

    boolean isVerified();

    boolean isWithCommercePermission();

    void setFollowStatus(int i);
}
