package com.ss.android.medialib.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.y;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.libsdl.app.AudioRecorderInterface;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29341a;

    /* renamed from: b  reason: collision with root package name */
    public volatile b f29342b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f29343c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f29344d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f29345e;

    /* renamed from: f  reason: collision with root package name */
    public C0354a f29346f;
    AudioRecorderInterface g;
    public AtomicInteger h = new AtomicInteger(0);
    public boolean i = false;
    public boolean j = true;
    public final Object k;

    /* renamed from: com.ss.android.medialib.a.a$a  reason: collision with other inner class name */
    public interface C0354a {
        int a(byte[] bArr, int i);
    }

    public static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29347a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<a> f29348b;

        public b(a aVar) {
            this.f29348b = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f29347a, false, 16634, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f29347a, false, 16634, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            int i = message2.what;
            a aVar = (a) this.f29348b.get();
            if (aVar == null) {
                y.d("AudioDataProcessThread", "EncoderHandler.handleMessage: encoder is null");
                return;
            }
            switch (i) {
                case 0:
                    int i2 = message2.arg1;
                    int i3 = message2.arg2;
                    double doubleValue = ((Double) message2.obj).doubleValue();
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Double.valueOf(doubleValue)}, aVar, a.f29341a, false, 16633, new Class[]{Integer.TYPE, Integer.TYPE, Double.TYPE}, Void.TYPE)) {
                        a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Double.valueOf(doubleValue)}, aVar2, a.f29341a, false, 16633, new Class[]{Integer.TYPE, Integer.TYPE, Double.TYPE}, Void.TYPE);
                        break;
                    } else {
                        if (aVar.g != null) {
                            y.a("AudioDataProcessThread", "handleStartFeeding() called with: sampleRateInHz = [" + i2 + "], channels = [" + i3 + "], speed = [" + doubleValue + "]");
                            if (aVar.g.initWavFile(i2, i3, doubleValue) != 0) {
                                y.d("AudioDataProcessThread", "init wav file failed");
                                break;
                            } else {
                                aVar.j = false;
                            }
                        }
                        return;
                    }
                case 1:
                    aVar.c();
                    return;
                case 2:
                    y.a("AudioDataProcessThread", "Exit loop");
                    aVar.c();
                    removeMessages(3);
                    Looper.myLooper().quit();
                    return;
                case 3:
                    byte[] bArr = (byte[]) message2.obj;
                    int i4 = message2.arg1;
                    int decrementAndGet = aVar.h.decrementAndGet();
                    if (aVar.f29346f != null) {
                        aVar.f29346f.a(bArr, i4);
                        y.b("AudioDataProcessThread", "Buffer processed, size=" + i4 + ", " + decrementAndGet + " buffers remaining");
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0010, code lost:
        if (r3.f29345e == false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0014, code lost:
        if (r3.j != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0016, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0017, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0018, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r1 = r3.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        monitor-enter(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f29343c
            monitor-enter(r0)
            boolean r1 = r3.f29344d     // Catch:{ all -> 0x001c }
            r2 = 0
            if (r1 != 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return r2
        L_0x000a:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            java.lang.Object r1 = r3.k
            monitor-enter(r1)
            boolean r0 = r3.f29345e     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            boolean r0 = r3.j     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0017
            r2 = 1
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r2
        L_0x0019:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r0
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.a.a.a():boolean");
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f29341a, false, 16630, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29341a, false, 16630, new Class[0], Void.TYPE);
            return;
        }
        synchronized (this.f29343c) {
            if (this.f29344d) {
                this.f29342b.sendMessage(this.f29342b.obtainMessage(2));
                y.b("AudioDataProcessThread", "stop()");
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f29341a, false, 16632, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29341a, false, 16632, new Class[0], Void.TYPE);
            return;
        }
        synchronized (this.k) {
            y.a("AudioDataProcessThread", "handleStopFeeding() called");
            if (!this.j) {
                if (this.g != null) {
                    this.g.closeWavFile(this.i);
                } else {
                    y.d("AudioDataProcessThread", "handleStop: Discard wav file");
                }
                this.j = true;
                this.i = false;
                this.k.notify();
            }
        }
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f29341a, false, 16631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29341a, false, 16631, new Class[0], Void.TYPE);
            return;
        }
        Looper.prepare();
        synchronized (this.f29343c) {
            this.f29342b = new b(this);
            this.f29344d = true;
            this.f29343c.notify();
        }
        Looper.loop();
        y.b("AudioDataProcessThread", "Encoder thread exiting");
        synchronized (this.f29343c) {
            this.f29345e = false;
            this.f29344d = false;
            this.f29342b = null;
        }
    }

    public a(AudioRecorderInterface audioRecorderInterface, C0354a aVar) {
        Object obj;
        if (audioRecorderInterface != null) {
            obj = audioRecorderInterface;
        } else {
            obj = new Object();
        }
        this.k = obj;
        this.g = audioRecorderInterface;
        this.f29346f = aVar;
    }

    public final void a(int i2, double d2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Double.valueOf(d2)}, this, f29341a, false, 16626, new Class[]{Integer.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Double.valueOf(d2)}, this, f29341a, false, 16626, new Class[]{Integer.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        y.c("AudioDataProcessThread", "startFeeding");
        synchronized (this.f29343c) {
            if (!this.f29344d) {
                y.c("AudioDataProcessThread", "startFeeding not ready");
                return;
            }
            this.h.set(0);
            this.f29342b.sendMessage(this.f29342b.obtainMessage(0, i2, 2, Double.valueOf(d2)));
        }
    }

    public final void a(byte[] bArr, int i2) {
        if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i2)}, this, f29341a, false, 16629, new Class[]{byte[].class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i2)}, this, f29341a, false, 16629, new Class[]{byte[].class, Integer.TYPE}, Void.TYPE);
            return;
        }
        synchronized (this.f29343c) {
            if (this.f29344d) {
                this.h.incrementAndGet();
                this.f29342b.sendMessage(this.f29342b.obtainMessage(3, i2, 0, Arrays.copyOf(bArr, i2)));
                y.b("AudioDataProcessThread", "feed audioData");
            }
        }
    }
}
