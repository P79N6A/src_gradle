package com.taobao.accs;

import android.app.Notification;
import com.taobao.accs.ChannelService;
import com.taobao.accs.utl.ALog;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChannelService.KernelService f78882a;

    public void run() {
        try {
            ChannelService instance = ChannelService.getInstance();
            int i = this.f78882a.f78881b.getPackageManager().getPackageInfo(this.f78882a.getPackageName(), 0).applicationInfo.icon;
            if (i != 0) {
                Notification.Builder builder = new Notification.Builder(this.f78882a.f78881b);
                builder.setSmallIcon(i);
                instance.startForeground(9371, builder.build());
                Notification.Builder builder2 = new Notification.Builder(this.f78882a.f78881b);
                builder2.setSmallIcon(i);
                ChannelService.KernelService.f78880a.startForeground(9371, builder2.build());
                ChannelService.KernelService.f78880a.stopForeground(true);
            }
            ChannelService.KernelService.f78880a.stopSelf();
        } catch (Throwable th) {
            ALog.e("ChannelService", " onStartCommand run", th, new Object[0]);
        }
    }

    a(ChannelService.KernelService kernelService) {
        this.f78882a = kernelService;
    }
}
