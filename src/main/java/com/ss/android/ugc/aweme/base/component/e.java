package com.ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

public interface e {
    @Deprecated
    void a();

    void a(@NonNull Activity activity, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle, @Nullable f fVar);

    void a(@NonNull Fragment fragment, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle, @Nullable f fVar);

    @Deprecated
    void a(String str);
}
