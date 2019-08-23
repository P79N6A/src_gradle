package com.ss.android.ugc.aweme.profile.presenter;

import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

public interface m extends o {
    void onFollowFail(Exception exc);

    void onFollowSuccess(FollowStatus followStatus);
}
