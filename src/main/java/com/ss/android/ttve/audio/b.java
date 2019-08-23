package com.ss.android.ttve.audio;

import android.media.AudioRecord;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    protected static int f31143a = -1;

    /* renamed from: b  reason: collision with root package name */
    protected static int[] f31144b = {44100, 8000, 11025, 16000, 22050};

    /* renamed from: c  reason: collision with root package name */
    protected static int f31145c = -1;

    /* renamed from: d  reason: collision with root package name */
    protected static int[] f31146d = {12, 16, 1};

    /* renamed from: e  reason: collision with root package name */
    public AudioRecord f31147e;

    /* renamed from: f  reason: collision with root package name */
    public int f31148f = -1;
    int g;
    int h = -1;
    int i = 2;
    public boolean j;
    public a k;

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        if (this.f31147e != null) {
            try {
                if (this.f31147e.getState() != 0) {
                    this.f31147e.stop();
                }
                this.f31147e.release();
            } catch (Exception unused) {
            }
            this.f31147e = null;
        }
        super.finalize();
    }

    public final void a() {
        if (this.f31147e != null) {
            try {
                if (this.f31147e.getState() != 0) {
                    this.f31147e.stop();
                }
                this.f31147e.release();
            } catch (Exception unused) {
            }
            this.f31147e = null;
        }
        if (this.k != null) {
            this.k.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r2.f31147e.getState() == 0) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r2.f31147e.stop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r2.k.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.j     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            android.media.AudioRecord r0 = r2.f31147e     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x000b
            goto L_0x0022
        L_0x000b:
            r2.j = r1     // Catch:{ all -> 0x002d }
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            android.media.AudioRecord r0 = r2.f31147e
            int r0 = r0.getState()
            if (r0 == 0) goto L_0x001b
            android.media.AudioRecord r0 = r2.f31147e
            r0.stop()
        L_0x001b:
            com.ss.android.ttve.audio.a r0 = r2.k
            r0.a()
            r0 = 1
            return r0
        L_0x0022:
            android.media.AudioRecord r0 = r2.f31147e     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002b
            android.media.AudioRecord r0 = r2.f31147e     // Catch:{ all -> 0x002d }
            r0.release()     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return r1
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.audio.b.b():boolean");
    }

    public b(a aVar) {
        this.k = aVar;
    }

    public final void a(int i2) {
        if (this.f31147e == null) {
            int i3 = -1;
            try {
                if (!(f31145c == -1 || f31143a == -1)) {
                    this.h = f31146d[f31145c];
                    this.f31148f = f31144b[f31143a];
                    this.g = AudioRecord.getMinBufferSize(this.f31148f, this.h, this.i);
                    AudioRecord audioRecord = new AudioRecord(5, this.f31148f, this.h, this.i, this.g);
                    this.f31147e = audioRecord;
                }
            } catch (Exception unused) {
            }
            if (this.f31147e == null) {
                f31145c = -1;
                int[] iArr = f31146d;
                int length = iArr.length;
                int i4 = 0;
                boolean z = false;
                while (i4 < length) {
                    this.h = iArr[i4];
                    f31145c++;
                    f31143a = i3;
                    int[] iArr2 = f31144b;
                    int length2 = iArr2.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length2) {
                            break;
                        }
                        int i6 = iArr2[i5];
                        f31143a++;
                        try {
                            this.g = AudioRecord.getMinBufferSize(i6, this.h, this.i);
                            if (this.g > 0) {
                                this.f31148f = i6;
                                AudioRecord audioRecord2 = new AudioRecord(5, this.f31148f, this.h, this.i, this.g);
                                this.f31147e = audioRecord2;
                                z = true;
                                break;
                            }
                            f31143a++;
                            i5++;
                        } catch (Exception unused2) {
                            this.f31148f = 0;
                            this.f31147e = null;
                            f31143a++;
                        }
                    }
                    if (z) {
                        break;
                    }
                    i4++;
                    i3 = -1;
                }
            }
            if (this.f31148f > 0) {
            }
        }
    }
}
