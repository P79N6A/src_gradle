package com.taobao.accs.init;

import com.taobao.accs.ACCSManager;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Launcher_CrossActivityStopped f78968a;

    public void run() {
        ACCSManager.bindApp(Launcher_InitAccs.mContext, Launcher_InitAccs.mAppkey, Launcher_InitAccs.mTtid, Launcher_InitAccs.mAppReceiver);
    }

    b(Launcher_CrossActivityStopped launcher_CrossActivityStopped) {
        this.f78968a = launcher_CrossActivityStopped;
    }
}
