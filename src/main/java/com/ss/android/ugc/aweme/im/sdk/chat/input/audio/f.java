package com.ss.android.ugc.aweme.im.sdk.chat.input.audio;

import android.media.MediaRecorder;
import android.os.CountDownTimer;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.util.concurrent.ExecutorService;

public final class f implements MediaRecorder.OnErrorListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50399a;

    /* renamed from: b  reason: collision with root package name */
    public MediaRecorder f50400b;

    /* renamed from: c  reason: collision with root package name */
    public CountDownTimer f50401c;

    /* renamed from: d  reason: collision with root package name */
    public int f50402d = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f50403e;

    /* renamed from: f  reason: collision with root package name */
    public j f50404f;
    ExecutorService g;
    public long h;
    public File i;
    public long j;

    public f() {
        try {
            this.g = g.a();
            this.f50400b = new MediaRecorder();
        } catch (Exception unused) {
        }
    }

    public final int a(int i2) {
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{5}, this, f50399a, false, 50731, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{5}, this, f50399a, false, 50731, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.f50400b == null) {
            i3 = 0;
        } else {
            i3 = this.f50400b.getMaxAmplitude() / 600;
        }
        if (i3 > 1) {
            i4 = (int) (Math.log10((double) i3) * 20.0d);
        }
        if (i4 == 0) {
            return 1;
        }
        return i4 / 5;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50399a, false, 50730, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50399a, false, 50730, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            if (this.f50400b != null) {
                this.f50400b.reset();
                this.f50400b.release();
                this.f50400b = null;
            }
        } catch (Exception unused) {
        }
        if (this.g != null && z) {
            this.g.shutdown();
            this.g = null;
        }
    }

    public final void a(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50399a, false, 50728, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50399a, false, 50728, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f50403e) {
            if (this.g == null || this.g.isShutdown() || this.g.isTerminated()) {
                this.g = g.a();
            }
            this.g.submit(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50407a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f50407a, false, 50734, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50407a, false, 50734, new Class[0], Void.TYPE);
                        return;
                    }
                    f.this.f50401c.cancel();
                    try {
                        f.this.f50400b.stop();
                        f.this.f50400b.reset();
                    } catch (Exception unused) {
                    }
                    f.this.j = SystemClock.uptimeMillis() - f.this.h;
                    f.this.f50403e = false;
                    if (f.this.j < ((long) f.this.f50402d)) {
                        if (f.this.i != null) {
                            f.this.i.delete();
                        }
                        if (f.this.f50404f != null) {
                            f.this.f50404f.a(-1);
                        }
                    } else if (z) {
                        if (f.this.i != null) {
                            f.this.i.delete();
                        }
                        if (f.this.f50404f != null) {
                            f.this.f50404f.c();
                        }
                    } else if (f.this.f50404f != null) {
                        f.this.f50404f.b();
                    }
                }
            });
        }
    }

    public final void onError(MediaRecorder mediaRecorder, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{mediaRecorder, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f50399a, false, 50732, new Class[]{MediaRecorder.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mediaRecorder, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f50399a, false, 50732, new Class[]{MediaRecorder.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f50400b != null) {
            try {
                this.f50400b.reset();
            } catch (Exception unused) {
            }
        }
        if (this.i != null) {
            this.i.delete();
        }
        this.f50403e = false;
        if (this.f50404f != null) {
            int i4 = i2;
            this.f50404f.a(i2);
        }
    }
}
