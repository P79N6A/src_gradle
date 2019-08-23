package com.ss.android.ugc.aweme.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34394a;

    /* renamed from: b  reason: collision with root package name */
    static AudioManager f34395b;

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f34396c = com.ss.android.ugc.aweme.g.a.a();

    public static int b(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f34394a, true, 23875, new Class[]{Context.class}, Integer.TYPE)) {
            return a(context2, 3);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f34394a, true, 23875, new Class[]{Context.class}, Integer.TYPE)).intValue();
    }

    public static int a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f34394a, true, 23874, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f34394a, true, 23874, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (f(context)) {
            return -1;
        } else {
            return f34395b.getStreamMaxVolume(3);
        }
    }

    public static boolean c(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f34394a, true, 23877, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f34394a, true, 23877, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (!f(context) && f34395b.getRingerMode() == 2) {
            return true;
        } else {
            return false;
        }
    }

    static boolean f(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f34394a, true, 23883, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f34394a, true, 23883, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (f34395b == null) {
            try {
                f34395b = (AudioManager) context.getApplicationContext().getSystemService("audio");
            } catch (Exception unused) {
            }
        }
        if (f34395b == null) {
            return true;
        }
        return false;
    }

    public static boolean d(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f34394a, true, 23880, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f34394a, true, 23880, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (f(context)) {
            return false;
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                AudioDeviceInfo[] devices = f34395b.getDevices(2);
                if (devices == null) {
                    return false;
                }
                for (AudioDeviceInfo type : devices) {
                    int type2 = type.getType();
                    if (type2 == 3 || type2 == 4 || type2 == 7 || type2 == 8) {
                        return true;
                    }
                }
                return false;
            } else if (f34395b.isWiredHeadsetOn() || f34395b.isBluetoothScoOn() || f34395b.isBluetoothA2dpOn()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean e(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f34394a, true, 23881, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f34394a, true, 23881, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{context2, 3}, null, f34394a, true, 23882, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, 3}, null, f34394a, true, 23882, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (a(context2, 3) == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static int a(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, null, f34394a, true, 23876, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, null, f34394a, true, 23876, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (f(context)) {
            return -1;
        } else {
            try {
                return f34395b.getStreamVolume(i);
            } catch (Exception unused) {
                return -1;
            }
        }
    }

    public static void a(Context context, boolean z) {
        int i;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, null, f34394a, true, 23879, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, null, f34394a, true, 23879, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
        } else if (!f(context)) {
            try {
                if (Build.VERSION.SDK_INT > 23) {
                    AudioManager audioManager = f34395b;
                    if (z2) {
                        i = -100;
                    } else {
                        i = 100;
                    }
                    audioManager.adjustStreamVolume(3, i, 0);
                    return;
                }
                f34395b.setStreamMute(3, z2);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
        }
    }

    public static boolean b(Context context, int i, int i2) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), 8}, null, f34394a, true, 23873, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), 8}, null, f34394a, true, 23873, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        a(context);
        b(context);
        return a(context2, b(context) + i, 8);
    }

    public static boolean a(Context context, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2)}, null, f34394a, true, 23872, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2)}, null, f34394a, true, 23872, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (f(context)) {
            return false;
        } else {
            try {
                f34395b.setStreamVolume(3, i, i2);
                return true;
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                return false;
            }
        }
    }
}
