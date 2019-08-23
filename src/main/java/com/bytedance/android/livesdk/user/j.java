package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.a;
import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.live.base.model.user.d;
import com.bytedance.android.live.base.model.user.g;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.base.model.user.k;
import com.bytedance.android.live.base.model.user.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class j extends User implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17456a;

    public final boolean childrenManagerForbidCreateLiveRoom() {
        return false;
    }

    public final boolean childrenManagerForbidWalletFunctions() {
        return false;
    }

    public final a getAnchorInfo() {
        return null;
    }

    public final b getAnchorLevel() {
        return null;
    }

    public final ImageModel getAvatarLarge() {
        return null;
    }

    public final ImageModel getAvatarMedium() {
        return null;
    }

    public final ImageModel getAvatarThumb() {
        return null;
    }

    public final String getAvatarUrl() {
        return null;
    }

    public final String getBackgroundImgUrl() {
        return null;
    }

    public final List<ImageModel> getBadgeImageList() {
        return null;
    }

    public final long getBirthday() {
        return 0;
    }

    public final d getBorder() {
        return null;
    }

    public final String getCity() {
        return null;
    }

    public final long getCreateTime() {
        return 0;
    }

    public final int getExperience() {
        return 0;
    }

    public final long getFanTicketCount() {
        return 0;
    }

    public final g getFollowInfo() {
        return null;
    }

    public final int getGender() {
        return 0;
    }

    public final long getId() {
        return 0;
    }

    public final int getIncomeSharePercent() {
        return 0;
    }

    public final int getLevel() {
        return 0;
    }

    public final int getLinkMicStats() {
        return 0;
    }

    public final long getLiveRoomId() {
        return 0;
    }

    public final String getLogPb() {
        return null;
    }

    public final ImageModel getMedal() {
        return null;
    }

    public final long getModifyTime() {
        return 0;
    }

    public final List<ImageModel> getNewUserBadges() {
        return null;
    }

    public final String getNickName() {
        return null;
    }

    public final long getPayScores() {
        return 0;
    }

    public final String getRequestId() {
        return null;
    }

    public final String getSecUid() {
        return null;
    }

    public final int getSecret() {
        return 0;
    }

    public final String getShareQrcodeUri() {
        return null;
    }

    public final long getShortId() {
        return 0;
    }

    public final String getSignature() {
        return null;
    }

    public final String getSpecialId() {
        return null;
    }

    public final int getStatus() {
        return 0;
    }

    public final String getTelephone() {
        return null;
    }

    public final List<User> getTopFans() {
        return null;
    }

    public final int getTopVipNo() {
        return 0;
    }

    public final k getUserAttr() {
        return null;
    }

    public final List<ImageModel> getUserBadges() {
        return null;
    }

    public final m getUserHonor() {
        return null;
    }

    public final String getVerifiedReason() {
        return null;
    }

    public final boolean isEnableShowCommerceSale() {
        return false;
    }

    public final boolean isFollowing() {
        return false;
    }

    public final boolean isVerified() {
        return false;
    }

    public final void setAnchorInfo(a aVar) {
    }

    public final void setBadgeImageList(List<ImageModel> list) {
    }

    public final void setExperience(int i) {
    }

    public final void setFollowInfo(g gVar) {
    }

    public final void setFollowStatus(int i) {
    }

    public final void setIncomeSharePercent(int i) {
    }

    public final void setLogPb(String str) {
    }

    public final void setModifyTime(long j) {
    }

    public final void setRequestId(String str) {
    }

    public final void setSecret(int i) {
    }

    public final void setShareQrcodeUri(String str) {
    }

    public final void setStatus(int i) {
    }

    public final void setTelephone(String str) {
    }

    public final void setUserAttr(k kVar) {
    }

    public final User.a getOwnRoom() {
        if (!PatchProxy.isSupport(new Object[0], this, f17456a, false, 13538, new Class[0], User.a.class)) {
            return new User.a();
        }
        return (User.a) PatchProxy.accessDispatch(new Object[0], this, f17456a, false, 13538, new Class[0], User.a.class);
    }

    public final boolean isWithCommercePermission() {
        if (!PatchProxy.isSupport(new Object[0], this, f17456a, false, 13537, new Class[0], Boolean.TYPE)) {
            return isEnableShowCommerceSale();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f17456a, false, 13537, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
