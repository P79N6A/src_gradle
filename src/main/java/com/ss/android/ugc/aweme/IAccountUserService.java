package com.ss.android.ugc.aweme;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.sdk.account.k.b;
import com.ss.android.http.a.b.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

@Keep
public interface IAccountUserService {

    @Retention(RetentionPolicy.CLASS)
    public @interface UserChangeType {
    }

    public interface a {
        void a(@UserChangeType int i, @Nullable User user, @Nullable User user2, @Nullable Bundle bundle);
    }

    void accountUserClear();

    void addUserChangeListener(@NonNull a aVar);

    @NonNull
    List<String> allUidList();

    void checkIn();

    void clear(String str);

    void delete(String str, String str2);

    com.ss.android.ugc.aweme.user.a findSignificanUserInfo(String str);

    boolean getAuthGoods();

    String getAvatarUrl();

    User getCurUser();

    FollowerDetail getCurUserFollowDetail(String str);

    String getCurUserId();

    String getLastUid();

    String getNickName();

    String getSessionKey();

    int getVerifyStatus();

    boolean hasCommerceVideoRights();

    boolean hasUpdated();

    void init();

    boolean isLogin();

    boolean isNewUser();

    boolean isNullUid(String str);

    boolean isOldUser();

    boolean isOnCommerceWhiteList();

    boolean isUserEmpty(User user);

    User queryUser(String str, boolean z) throws Exception;

    void queryUser();

    void queryUser(Handler handler);

    void queryUserSync(User user);

    void refreshPassportUserInfo();

    void registerNotice(String str, int i);

    void removeUserChangeListener(@NonNull a aVar);

    void setCurUser(User user);

    void setUserBanned();

    void setUserLogicDelete(String str);

    void setWithCommerceNewbieTask(boolean z);

    boolean shouldRefresh();

    void syncWeiboBindStatus(Handler handler, boolean z);

    void updateAllowStatus(Handler handler, int i);

    void updateAvatarUri(Handler handler, String str);

    void updateBirthday(Handler handler, String str, @User.BirthdayHideLevel int i);

    void updateCoverUri(Handler handler, String str, int i);

    void updateCurAllowStatus(int i);

    void updateCurAvatar(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3);

    void updateCurAwemeCount(int i);

    void updateCurBirthday(String str, @User.BirthdayHideLevel int i);

    void updateCurCanChangeSchoolInfo(boolean z);

    void updateCurCover(List<UrlModel> list);

    void updateCurDongtaiCount(int i);

    void updateCurFavoritingCount(int i);

    void updateCurFollowerCount(int i);

    void updateCurFollowingCount(int i);

    void updateCurGender(int i, int i2);

    void updateCurHideFollowingFollowerList(int i);

    void updateCurHideSearch(boolean z);

    void updateCurNickname(String str);

    void updateCurSchoolInfo(String str, String str2, String str3, int i, int i2);

    void updateCurSecret(boolean z);

    void updateCurSignature(String str);

    void updateCurUser(User user);

    void updateCurUserId(String str);

    void updateFbExpireTime();

    void updateGender(Handler handler, Map<String, String> map);

    void updateHasFacebookToken(boolean z);

    void updateHasTwitterToken(boolean z);

    void updateHasYoutubeToken(boolean z);

    void updateId(Handler handler, String str);

    void updateInsId(Handler handler, String str);

    void updateInsId(String str);

    void updateLanguage(Handler handler, String str);

    void updateLeaveTime(long j);

    void updateLocation(Handler handler, Map<String, String> map);

    void updateMinor(boolean z);

    void updateNickName(Handler handler, String str);

    void updateNotifyPrivateAccount(int i);

    void updateSchool(Handler handler, Map<String, String> map);

    void updateSecret(Handler handler, boolean z);

    void updateShieldCommentNotice(int i);

    void updateShieldDiggNotice(int i);

    void updateShieldFollowNotice(int i);

    void updateSignature(Handler handler, String str);

    void updateTwExpireTime();

    void updateUserInfo(Handler handler, Map<String, String> map);

    void updateUserInfo(@Nullable b bVar);

    void updateWeiboBindStatus(boolean z);

    void updateWeiboName(String str);

    void updateYoutubeExpireTime();

    void uploadAvatar(Handler handler, String str, int i, String str2, List<e> list);

    void uploadCommerceHeadImage(Handler handler, String str, int i, String str2, String str3);

    void uploadCover(Handler handler, String str, int i, String str2);

    void uploadVideoAvatar(Handler handler, String str, int i, String str2);
}
