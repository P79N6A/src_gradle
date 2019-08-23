package com.ss.android.ad.splash.core.video2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

public final class VolumeChangeObserver {

    /* renamed from: a  reason: collision with root package name */
    public a f27796a;

    /* renamed from: b  reason: collision with root package name */
    private VolumeBroadcastReceiver f27797b;

    /* renamed from: c  reason: collision with root package name */
    private Context f27798c;

    /* renamed from: d  reason: collision with root package name */
    private AudioManager f27799d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f27800e;

    static class VolumeBroadcastReceiver extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<VolumeChangeObserver> f27801a;

        public VolumeBroadcastReceiver(VolumeChangeObserver volumeChangeObserver) {
            this.f27801a = new WeakReference<>(volumeChangeObserver);
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                VolumeChangeObserver volumeChangeObserver = (VolumeChangeObserver) this.f27801a.get();
                if (volumeChangeObserver != null) {
                    a aVar = volumeChangeObserver.f27796a;
                    if (aVar != null) {
                        int a2 = volumeChangeObserver.a();
                        if (a2 >= 0) {
                            aVar.a(a2);
                        }
                    }
                }
            }
        }
    }

    public interface a {
        void a(int i);
    }

    public final int a() {
        if (this.f27799d != null) {
            return this.f27799d.getStreamVolume(3);
        }
        return -1;
    }

    public final int b() {
        if (this.f27799d != null) {
            return this.f27799d.getStreamMaxVolume(3);
        }
        return 15;
    }

    public final void c() {
        this.f27797b = new VolumeBroadcastReceiver(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        this.f27798c.registerReceiver(this.f27797b, intentFilter);
        this.f27800e = true;
    }

    public final void d() {
        if (this.f27800e) {
            try {
                this.f27798c.unregisterReceiver(this.f27797b);
                this.f27796a = null;
                this.f27800e = false;
            } catch (Exception unused) {
            }
        }
    }

    public VolumeChangeObserver(Context context) {
        this.f27798c = context;
        this.f27799d = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }
}
