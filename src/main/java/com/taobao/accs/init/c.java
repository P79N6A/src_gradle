package com.taobao.accs.init;

import com.taobao.accs.ACCSManager;

public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Launcher_InitAccs f78969a;

    public void run() {
        ACCSManager.bindApp(Launcher_InitAccs.mContext, Launcher_InitAccs.mAppkey, Launcher_InitAccs.mTtid, Launcher_InitAccs.mAppReceiver);
        Launcher_InitAccs.mIsInited = true;
    }

    c(Launcher_InitAccs launcher_InitAccs) {
        this.f78969a = launcher_InitAccs;
    }
}
