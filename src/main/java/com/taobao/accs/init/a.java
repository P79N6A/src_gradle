package com.taobao.accs.init;

import com.taobao.accs.ACCSManager;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Launcher_CrossActivityStarted f78967a;

    public void run() {
        ACCSManager.bindApp(Launcher_InitAccs.mContext, Launcher_InitAccs.mAppkey, Launcher_InitAccs.mTtid, Launcher_InitAccs.mAppReceiver);
    }

    a(Launcher_CrossActivityStarted launcher_CrossActivityStarted) {
        this.f78967a = launcher_CrossActivityStarted;
    }
}
