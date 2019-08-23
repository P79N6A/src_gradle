package com.huawei.android.pushselfshow.richpush.html.a;

import android.media.AudioManager;
import android.media.SoundPool;
import com.huawei.android.pushagent.utils.a.e;
import java.io.PrintStream;

public class c implements SoundPool.OnLoadCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f25280a;

    c(a aVar) {
        this.f25280a = aVar;
    }

    public void onLoadComplete(SoundPool soundPool, int i, int i2) {
        PrintStream printStream = System.out;
        printStream.println("onSensorChanged and SoundPool onLoadComplete " + i);
        AudioManager audioManager = (AudioManager) this.f25280a.f25273e.getSystemService("audio");
        e.a("PushSelfShowLog", "actualVolume is " + ((float) audioManager.getStreamVolume(3)));
        float streamMaxVolume = (float) audioManager.getStreamMaxVolume(3);
        audioManager.setStreamVolume(3, (((int) streamMaxVolume) * 2) / 3, 0);
        e.a("PushSelfShowLog", "maxVolume is " + streamMaxVolume);
        soundPool.play(i, 1.0f, 1.0f, 1, 0, 1.0f);
    }
}