package com.bytedance.android.livesdk.utils;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import com.bytedance.android.live.core.utils.ac;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.Set;

public final class AudioFocusUtil {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17521a;

    /* renamed from: b  reason: collision with root package name */
    public static ComponentName f17522b = new ComponentName(b().getPackageName(), MediaButtonReceiver.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static AudioManager f17523c = ((AudioManager) b().getSystemService("audio"));

    /* renamed from: d  reason: collision with root package name */
    public static AudioManager.OnAudioFocusChangeListener f17524d = new AudioManager.OnAudioFocusChangeListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17526a;

        public final void onAudioFocusChange(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f17526a, false, 13635, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f17526a, false, 13635, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            for (AudioManager.OnAudioFocusChangeListener onAudioFocusChange : new HashSet(AudioFocusUtil.f17525e)) {
                onAudioFocusChange.onAudioFocusChange(i);
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    public static final Set<AudioManager.OnAudioFocusChangeListener> f17525e = new HashSet();

    static class MediaButtonReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
        }

        private MediaButtonReceiver() {
        }
    }

    private static Context b() {
        if (PatchProxy.isSupport(new Object[0], null, f17521a, true, 13632, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], null, f17521a, true, 13632, new Class[0], Context.class);
        }
        return ac.e();
    }

    public static int a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f17521a, true, 13630, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f17521a, true, 13630, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            i = f17523c.requestAudioFocus(f17524d, 3, 2);
            if (i == 1) {
                try {
                    f17523c.registerMediaButtonEventReceiver(f17522b);
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            i = 0;
        }
        return i;
    }

    public static void a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = onAudioFocusChangeListener;
        if (PatchProxy.isSupport(new Object[]{onAudioFocusChangeListener2}, null, f17521a, true, 13634, new Class[]{AudioManager.OnAudioFocusChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onAudioFocusChangeListener2}, null, f17521a, true, 13634, new Class[]{AudioManager.OnAudioFocusChangeListener.class}, Void.TYPE);
            return;
        }
        f17525e.remove(onAudioFocusChangeListener2);
    }
}
