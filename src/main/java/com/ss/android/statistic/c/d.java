package com.ss.android.statistic.c;

import android.content.Context;
import android.support.annotation.NonNull;
import com.umeng.analytics.MobclickAgent;

public final class d implements b {
    public final void a(@NonNull Context context) {
        MobclickAgent.onResume(context);
    }

    public final void b(@NonNull Context context) {
        MobclickAgent.onPause(context);
    }
}
