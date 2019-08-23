package com.bytedance.android.livesdkapi;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import com.meituan.robust.ChangeQuickRedirect;

public abstract class a extends Binder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: com.bytedance.android.livesdkapi.a$a  reason: collision with other inner class name */
    public interface C0130a {
        void a();
    }

    public abstract void bindService(Service service);

    public abstract boolean isLiveFinished();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate();

    public abstract void onDestroy();

    public void setData(Intent intent, boolean z) {
    }

    public abstract void setLiveStatusListener(C0130a aVar);

    public abstract void startAudio();

    public abstract void startBgActivity();

    public abstract boolean startStream(boolean z);

    public abstract void stopAudio();

    public abstract void stopService();

    public abstract void stopStream(int i);

    public abstract void unBindService(Service service);
}
