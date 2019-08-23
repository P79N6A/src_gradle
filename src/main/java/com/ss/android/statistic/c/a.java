package com.ss.android.statistic.c;

import android.content.Context;
import android.support.annotation.NonNull;
import com.ss.android.common.applog.AppLog;

public final class a implements b {
    public final void a(@NonNull Context context) {
        AppLog.onResume(context);
    }

    public final void b(@NonNull Context context) {
        AppLog.onPause(context);
    }
}
