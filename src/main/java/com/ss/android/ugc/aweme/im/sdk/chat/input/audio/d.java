package com.ss.android.ugc.aweme.im.sdk.chat.input.audio;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.PowerManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.concurrent.ExecutorService;

public final class d implements SensorEventListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50383a;

    /* renamed from: b  reason: collision with root package name */
    Context f50384b;

    /* renamed from: c  reason: collision with root package name */
    public MediaPlayer f50385c;

    /* renamed from: d  reason: collision with root package name */
    public j f50386d;

    /* renamed from: e  reason: collision with root package name */
    public k f50387e;

    /* renamed from: f  reason: collision with root package name */
    public ExecutorService f50388f;
    File g;
    volatile boolean h = true;
    AudioManager i;
    public SensorManager j;
    Sensor k;
    PowerManager l;
    public PowerManager.WakeLock m;
    public boolean n;
    public AudioManager.OnAudioFocusChangeListener o;
    int p;
    private long q = 60000;

    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    private boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f50383a, false, 50714, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50383a, false, 50714, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if (this.f50385c != null && this.f50385c.isPlaying()) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50383a, false, 50709, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50383a, false, 50709, new Class[0], Void.TYPE);
            return;
        }
        a(false);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50383a, false, 50711, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50383a, false, 50711, new Class[0], Void.TYPE);
            return;
        }
        if (!this.h) {
            this.h = true;
            if (this.m != null) {
                this.m.setReferenceCounted(false);
                this.m.release();
            }
        }
        d();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f50383a, false, 50719, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50383a, false, 50719, new Class[0], Void.TYPE);
            return;
        }
        if (this.n && this.i != null) {
            this.i.abandonAudioFocus(this.o);
            this.n = false;
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f50383a, false, 50718, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50383a, false, 50718, new Class[0], Void.TYPE);
            return;
        }
        if (this.i == null) {
            this.i = (AudioManager) this.f50384b.getSystemService("audio");
        }
        if (!this.n && this.i != null && this.i.requestAudioFocus(this.o, 3, 2) == 1) {
            this.n = true;
        }
    }

    public d(Context context) {
        this.f50384b = context;
        this.f50388f = e.a();
        if (PatchProxy.isSupport(new Object[0], this, f50383a, false, 50704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50383a, false, 50704, new Class[0], Void.TYPE);
            return;
        }
        this.o = new AudioManager.OnAudioFocusChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50389a;

            public final void onAudioFocusChange(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50389a, false, 50720, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50389a, false, 50720, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                switch (i) {
                    case -3:
                        d.this.n = false;
                        d.this.a();
                        break;
                    case -2:
                        d.this.n = false;
                        d.this.a();
                        return;
                    case -1:
                        d.this.n = false;
                        d.this.a();
                        return;
                    case 1:
                        d.this.n = true;
                        return;
                    case 2:
                        d.this.n = true;
                        return;
                    case 3:
                        d.this.n = true;
                        return;
                }
            }
        };
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, f50383a, false, 50715, new Class[]{MediaPlayer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, f50383a, false, 50715, new Class[]{MediaPlayer.class}, Void.TYPE);
            return;
        }
        if (this.f50387e != null) {
            this.f50387e.c();
        }
    }

    private void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50383a, false, 50705, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50383a, false, 50705, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z != this.h) {
            this.h = z;
            this.p = 0;
            a(this.g, true);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50383a, false, 50710, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50383a, false, 50710, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z || this.h) {
            if (this.j != null) {
                this.j.unregisterListener(this);
            }
            if (!e()) {
                b();
                return;
            }
            if (this.f50388f == null || this.f50388f.isShutdown() || this.f50388f.isTerminated()) {
                this.f50388f = e.a();
            }
            this.f50388f.submit(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50393a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f50393a, false, 50722, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50393a, false, 50722, new Class[0], Void.TYPE);
                        return;
                    }
                    try {
                        d.this.f50385c.stop();
                        d.this.f50387e.d();
                        d.this.b();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void b(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50383a, false, 50713, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50383a, false, 50713, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f50388f.submit(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50395a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f50395a, false, 50723, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50395a, false, 50723, new Class[0], Void.TYPE);
                    return;
                }
                try {
                    if (d.this.f50385c != null) {
                        d.this.f50385c.reset();
                        d.this.f50385c.release();
                        d.this.f50385c = null;
                        d.this.o = null;
                    }
                } catch (Exception unused) {
                }
                if (z) {
                    if (d.this.j != null) {
                        d.this.j.unregisterListener(d.this);
                    }
                    if (d.this.m != null && d.this.m.isHeld()) {
                        d.this.m.release();
                        d.this.m = null;
                    }
                    if (d.this.f50388f != null) {
                        d.this.f50388f.shutdown();
                        d.this.f50388f = null;
                    }
                }
            }
        });
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (PatchProxy.isSupport(new Object[]{sensorEvent}, this, f50383a, false, 50717, new Class[]{SensorEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sensorEvent}, this, f50383a, false, 50717, new Class[]{SensorEvent.class}, Void.TYPE);
        } else if (e()) {
            if (0.0f != sensorEvent.values[0]) {
                c(true);
                if (this.m != null) {
                    this.m.setReferenceCounted(false);
                    this.m.release();
                }
            } else if (this.i == null || !this.i.isWiredHeadsetOn()) {
                c(false);
                if (this.m != null && !this.m.isHeld()) {
                    this.m.acquire(this.q);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(File file, boolean z) {
        if (PatchProxy.isSupport(new Object[]{file, (byte) 1}, this, f50383a, false, 50708, new Class[]{File.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file, (byte) 1}, this, f50383a, false, 50708, new Class[]{File.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        e();
        if (file == null || !file.exists() || !file.isFile()) {
            if (this.f50386d != null) {
                this.f50386d.a(-1);
            }
            return;
        }
        if (!file.equals(this.g)) {
            this.p = 0;
        }
        this.g = file;
        if (this.f50386d != null) {
            this.f50386d.a();
        }
        if (this.f50388f == null || this.f50388f.isShutdown() || this.f50388f.isTerminated()) {
            this.f50388f = e.a();
        }
        this.f50388f.submit(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50391a;

            /* JADX WARNING: Can't wrap try/catch for region: R(2:50|51) */
            /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
                r0.b(false);
             */
            /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0123 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r16 = this;
                    r7 = r16
                    r8 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    com.meituan.robust.ChangeQuickRedirect r2 = f50391a
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 50721(0xc621, float:7.1075E-41)
                    r1 = r16
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0029
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    com.meituan.robust.ChangeQuickRedirect r2 = f50391a
                    r3 = 0
                    r4 = 50721(0xc621, float:7.1075E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r16
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0029:
                    com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d r0 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d.this     // Catch:{ Exception -> 0x0133 }
                    java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0133 }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d.f50383a     // Catch:{ Exception -> 0x0133 }
                    r12 = 0
                    r13 = 50706(0xc612, float:7.1054E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0133 }
                    java.lang.Class r15 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0133 }
                    r10 = r0
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0133 }
                    if (r1 == 0) goto L_0x0051
                    java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0133 }
                    com.meituan.robust.ChangeQuickRedirect r10 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d.f50383a     // Catch:{ Exception -> 0x0133 }
                    r11 = 0
                    r12 = 50706(0xc612, float:7.1054E-41)
                    java.lang.Class[] r13 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0133 }
                    java.lang.Class r14 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0133 }
                    r8 = r1
                    r9 = r0
                    com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0133 }
                    goto L_0x0126
                L_0x0051:
                    android.media.AudioManager r1 = r0.i     // Catch:{ Exception -> 0x0133 }
                    if (r1 != 0) goto L_0x0061
                    android.content.Context r1 = r0.f50384b     // Catch:{ Exception -> 0x0133 }
                    java.lang.String r2 = "audio"
                    java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x0133 }
                    android.media.AudioManager r1 = (android.media.AudioManager) r1     // Catch:{ Exception -> 0x0133 }
                    r0.i = r1     // Catch:{ Exception -> 0x0133 }
                L_0x0061:
                    android.hardware.SensorManager r1 = r0.j     // Catch:{ Exception -> 0x0133 }
                    if (r1 != 0) goto L_0x0071
                    android.content.Context r1 = r0.f50384b     // Catch:{ Exception -> 0x0133 }
                    java.lang.String r2 = "sensor"
                    java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x0133 }
                    android.hardware.SensorManager r1 = (android.hardware.SensorManager) r1     // Catch:{ Exception -> 0x0133 }
                    r0.j = r1     // Catch:{ Exception -> 0x0133 }
                L_0x0071:
                    android.hardware.SensorManager r1 = r0.j     // Catch:{ Exception -> 0x0133 }
                    if (r1 == 0) goto L_0x0083
                    android.hardware.Sensor r1 = r0.k     // Catch:{ Exception -> 0x0133 }
                    if (r1 != 0) goto L_0x0083
                    android.hardware.SensorManager r1 = r0.j     // Catch:{ Exception -> 0x0133 }
                    r2 = 8
                    android.hardware.Sensor r1 = r1.getDefaultSensor(r2)     // Catch:{ Exception -> 0x0133 }
                    r0.k = r1     // Catch:{ Exception -> 0x0133 }
                L_0x0083:
                    android.os.PowerManager r1 = r0.l     // Catch:{ Exception -> 0x0133 }
                    if (r1 != 0) goto L_0x0093
                    android.content.Context r1 = r0.f50384b     // Catch:{ Exception -> 0x0133 }
                    java.lang.String r2 = "power"
                    java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x0133 }
                    android.os.PowerManager r1 = (android.os.PowerManager) r1     // Catch:{ Exception -> 0x0133 }
                    r0.l = r1     // Catch:{ Exception -> 0x0133 }
                L_0x0093:
                    android.os.PowerManager r1 = r0.l     // Catch:{ Exception -> 0x0133 }
                    if (r1 == 0) goto L_0x00ad
                    android.os.PowerManager$WakeLock r1 = r0.m     // Catch:{ Exception -> 0x0133 }
                    if (r1 != 0) goto L_0x00ad
                    int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0133 }
                    r2 = 21
                    if (r1 < r2) goto L_0x00ad
                    android.os.PowerManager r1 = r0.l     // Catch:{ Exception -> 0x0133 }
                    r2 = 32
                    java.lang.String r3 = "Aweme-IM:audio_player_lock"
                    android.os.PowerManager$WakeLock r1 = r1.newWakeLock(r2, r3)     // Catch:{ Exception -> 0x0133 }
                    r0.m = r1     // Catch:{ Exception -> 0x0133 }
                L_0x00ad:
                    android.hardware.SensorManager r1 = r0.j     // Catch:{ Exception -> 0x0133 }
                    r2 = 3
                    if (r1 == 0) goto L_0x00bd
                    android.hardware.Sensor r1 = r0.k     // Catch:{ Exception -> 0x0133 }
                    if (r1 == 0) goto L_0x00bd
                    android.hardware.SensorManager r1 = r0.j     // Catch:{ Exception -> 0x0133 }
                    android.hardware.Sensor r3 = r0.k     // Catch:{ Exception -> 0x0133 }
                    r1.registerListener(r0, r3, r2)     // Catch:{ Exception -> 0x0133 }
                L_0x00bd:
                    android.media.AudioManager r1 = r0.i     // Catch:{ Exception -> 0x0133 }
                    if (r1 == 0) goto L_0x00dc
                    boolean r1 = r0.h     // Catch:{ Exception -> 0x0133 }
                    if (r1 == 0) goto L_0x00d1
                    android.media.AudioManager r1 = r0.i     // Catch:{ Exception -> 0x0133 }
                    r3 = 1
                    r1.setSpeakerphoneOn(r3)     // Catch:{ Exception -> 0x0133 }
                    android.media.AudioManager r1 = r0.i     // Catch:{ Exception -> 0x0133 }
                    r1.setMode(r8)     // Catch:{ Exception -> 0x0133 }
                    goto L_0x00dc
                L_0x00d1:
                    android.media.AudioManager r1 = r0.i     // Catch:{ Exception -> 0x0133 }
                    r1.setSpeakerphoneOn(r8)     // Catch:{ Exception -> 0x0133 }
                    android.media.AudioManager r1 = r0.i     // Catch:{ Exception -> 0x0133 }
                    r3 = 2
                    r1.setMode(r3)     // Catch:{ Exception -> 0x0133 }
                L_0x00dc:
                    android.media.MediaPlayer r1 = r0.f50385c     // Catch:{ Exception -> 0x0133 }
                    if (r1 != 0) goto L_0x00fe
                    android.media.MediaPlayer r1 = new android.media.MediaPlayer     // Catch:{ Exception -> 0x0133 }
                    r1.<init>()     // Catch:{ Exception -> 0x0133 }
                    r0.f50385c = r1     // Catch:{ Exception -> 0x0133 }
                    android.media.MediaPlayer r1 = r0.f50385c     // Catch:{ Exception -> 0x0133 }
                    r3 = 1065353216(0x3f800000, float:1.0)
                    r1.setVolume(r3, r3)     // Catch:{ Exception -> 0x0133 }
                    android.media.MediaPlayer r1 = r0.f50385c     // Catch:{ Exception -> 0x0133 }
                    r1.setLooping(r8)     // Catch:{ Exception -> 0x0133 }
                    android.media.MediaPlayer r1 = r0.f50385c     // Catch:{ Exception -> 0x0133 }
                    r1.setOnErrorListener(r0)     // Catch:{ Exception -> 0x0133 }
                    android.media.MediaPlayer r1 = r0.f50385c     // Catch:{ Exception -> 0x0133 }
                    r1.setOnCompletionListener(r0)     // Catch:{ Exception -> 0x0133 }
                    goto L_0x0103
                L_0x00fe:
                    android.media.MediaPlayer r1 = r0.f50385c     // Catch:{ Exception -> 0x0133 }
                    r1.reset()     // Catch:{ Exception -> 0x0133 }
                L_0x0103:
                    android.media.MediaPlayer r1 = r0.f50385c     // Catch:{ Exception -> 0x0123 }
                    java.io.File r3 = r0.g     // Catch:{ Exception -> 0x0123 }
                    java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0123 }
                    r1.setDataSource(r3)     // Catch:{ Exception -> 0x0123 }
                    boolean r1 = r0.h     // Catch:{ Exception -> 0x0123 }
                    if (r1 == 0) goto L_0x0118
                    android.media.MediaPlayer r1 = r0.f50385c     // Catch:{ Exception -> 0x0123 }
                    r1.setAudioStreamType(r2)     // Catch:{ Exception -> 0x0123 }
                    goto L_0x011d
                L_0x0118:
                    android.media.MediaPlayer r1 = r0.f50385c     // Catch:{ Exception -> 0x0123 }
                    r1.setAudioStreamType(r8)     // Catch:{ Exception -> 0x0123 }
                L_0x011d:
                    android.media.MediaPlayer r1 = r0.f50385c     // Catch:{ Exception -> 0x0123 }
                    r1.prepare()     // Catch:{ Exception -> 0x0123 }
                    goto L_0x0126
                L_0x0123:
                    r0.b(r8)     // Catch:{ Exception -> 0x0133 }
                L_0x0126:
                    com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d r0 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d.this     // Catch:{ Exception -> 0x0133 }
                    r0.c()     // Catch:{ Exception -> 0x0133 }
                    com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d r0 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d.this     // Catch:{ Exception -> 0x0133 }
                    android.media.MediaPlayer r0 = r0.f50385c     // Catch:{ Exception -> 0x0133 }
                    r0.start()     // Catch:{ Exception -> 0x0133 }
                    return
                L_0x0133:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.d.AnonymousClass2.run():void");
            }
        });
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f50383a, false, 50716, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f50383a, false, 50716, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        this.p++;
        if (this.p > 5) {
            onCompletion(mediaPlayer);
        } else {
            mediaPlayer.release();
            this.f50385c = null;
            a(this.g, true);
        }
        return true;
    }
}
