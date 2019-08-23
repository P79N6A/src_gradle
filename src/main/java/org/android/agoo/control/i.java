package org.android.agoo.control;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public class i implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseIntentService f84017a;

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }

    i(BaseIntentService baseIntentService) {
        this.f84017a = baseIntentService;
    }
}
