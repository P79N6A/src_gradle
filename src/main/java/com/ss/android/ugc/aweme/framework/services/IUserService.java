package com.ss.android.ugc.aweme.framework.services;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;

public interface IUserService {
    void clearUser();

    void enterDouyinHelper(Context context, int i);

    boolean getAuthGoods();

    User getCurrentUser();

    String getCurrentUserID();

    int getVerifyStatus();

    boolean isLogin();

    boolean isOldUser();

    boolean isUserEmpty(User user);

    void logout();

    void refreshUser();

    void setBroadcasterRoomId(long j);

    void setIsOldUser(boolean z);
}
