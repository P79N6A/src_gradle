package com.ss.android.push.daemon;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.ss.android.push.daemon.f;

public class NativeDaemonBase {
    protected Context mContext;

    /* access modifiers changed from: protected */
    public void onDaemonDead() {
        Logger.debug();
        f.a.a().a();
    }

    public NativeDaemonBase(Context context) {
        this.mContext = context;
    }
}
