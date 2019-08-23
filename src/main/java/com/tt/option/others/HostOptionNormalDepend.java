package com.tt.option.others;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.AnyProcess;

public interface HostOptionNormalDepend {
    @AnyProcess
    boolean openLocation(@NonNull Activity activity, @Nullable String str, @Nullable String str2, double d2, double d3, int i, @Nullable String str3);
}
