package com.ss.android.medialib.f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.f;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29664a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f29665b = f.class.getSimpleName();

    public static Pair<Integer, Integer> a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f29664a, true, 17817, new Class[]{Context.class}, Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[]{context2}, null, f29664a, true, 17817, new Class[]{Context.class}, Pair.class);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            packageManager.hasSystemFeature("android.hardware.audio.low_latency");
        }
        if (packageManager != null) {
            packageManager.hasSystemFeature("android.hardware.audio.pro");
        }
        int i = 256;
        int i2 = 44100;
        if (Build.VERSION.SDK_INT >= 17) {
            AudioManager audioManager = (AudioManager) context2.getSystemService("audio");
            i2 = a(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"), 44100);
            i = a(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER"), 256);
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i));
    }

    private static int a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, null, f29664a, true, 17818, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, null, f29664a, true, 17818, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (TextUtils.isEmpty(str)) {
            return i;
        } else {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
                return i;
            }
        }
    }
}
