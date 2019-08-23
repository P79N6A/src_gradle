package com.ss.android.ugc.aweme.port.in;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;

public interface al {
    @Nullable
    User a(@Nullable Intent intent);

    void a(@NonNull Fragment fragment, int i);

    void a(Fragment fragment, int i, String str, int i2);
}
