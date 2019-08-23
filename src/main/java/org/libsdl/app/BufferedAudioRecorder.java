package org.libsdl.app;

import android.media.AudioRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.a.a;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.vesdk.y;

public class BufferedAudioRecorder {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    protected static int channelConfigOffset = -1;
    protected static int[] channelConfigSuggested = {12, 16, 1};
    protected static int sampleRateOffset = -1;
    protected static int[] sampleRateSuggested = {44100, 8000, 11025, 16000, 22050};
    AudioRecord audio;
    int audioFormat = 2;
    int audioSource = 1;
    int bufferSizeInBytes;
    int channelConfig = -1;
    boolean isRecording;
    boolean isStopped;
    MediaRecordPresenter mMediaRecordPresenter;
    a mProcessThread;
    int sampleRateInHz = -1;

    class AudioRecorderRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private double speed;
        boolean startFeeding;

        public void run() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92392, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92392, new Class[0], Void.TYPE);
                return;
            }
            byte[] bArr = new byte[BufferedAudioRecorder.this.bufferSizeInBytes];
            BufferedAudioRecorder.this.isStopped = false;
            BufferedAudioRecorder.this.mProcessThread = new a(BufferedAudioRecorder.this.mMediaRecordPresenter, BufferedAudioRecorder.this.mMediaRecordPresenter);
            a aVar = BufferedAudioRecorder.this.mProcessThread;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f29341a, false, 16625, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f29341a, false, 16625, new Class[0], Void.TYPE);
            } else {
                y.a("AudioDataProcessThread", y.a() + ": " + y.c());
                synchronized (aVar.f29343c) {
                    if (aVar.f29345e) {
                        y.c("AudioDataProcessThread", "thread already running");
                    } else {
                        aVar.f29345e = true;
                        new Thread(aVar, "AudioDataProcessThread").start();
                        while (!aVar.f29344d) {
                            try {
                                aVar.f29343c.wait();
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
            if (this.startFeeding) {
                BufferedAudioRecorder.this.mProcessThread.a(BufferedAudioRecorder.this.sampleRateInHz, this.speed);
            }
            try {
                if (BufferedAudioRecorder.this.audio != null && BufferedAudioRecorder.this.audio.getState() != 0) {
                    BufferedAudioRecorder.this.audio.startRecording();
                    if (BufferedAudioRecorder.this.audio == null || BufferedAudioRecorder.this.audio.getRecordingState() == 3) {
                        int i = 0;
                        boolean z = false;
                        while (BufferedAudioRecorder.this.isRecording) {
                            if (BufferedAudioRecorder.this.audio != null) {
                                i = BufferedAudioRecorder.this.audio.read(bArr, 0, BufferedAudioRecorder.this.bufferSizeInBytes);
                            }
                            if (-3 == i) {
                                y.d("BufferedAudioRecorder", "bad audio buffer len " + i);
                            } else if (i > 0) {
                                try {
                                    if (BufferedAudioRecorder.this.isRecording) {
                                        BufferedAudioRecorder.this.mMediaRecordPresenter.addPCMData(bArr, i);
                                    }
                                    if (BufferedAudioRecorder.this.mProcessThread.a() && !BufferedAudioRecorder.this.isStopped) {
                                        BufferedAudioRecorder.this.mProcessThread.a(bArr, i);
                                    }
                                } catch (Exception unused2) {
                                }
                            } else {
                                if (!(BufferedAudioRecorder.this.audio == null || BufferedAudioRecorder.this.audio.getRecordingState() == 3 || z)) {
                                    BufferedAudioRecorder.this.mMediaRecordPresenter.recordStatus(false);
                                    z = true;
                                }
                                Thread.sleep(50);
                            }
                        }
                        return;
                    }
                    BufferedAudioRecorder.this.mMediaRecordPresenter.recordStatus(false);
                    y.d("BufferedAudioRecorder", "audio starRecording failed! Stop immediately!");
                    BufferedAudioRecorder.this.unInit();
                }
            } catch (Exception e2) {
                try {
                    if (BufferedAudioRecorder.this.audio != null) {
                        BufferedAudioRecorder.this.audio.release();
                    }
                } catch (Exception unused3) {
                }
                BufferedAudioRecorder.this.audio = null;
                y.d("BufferedAudioRecorder", "audio recording failed!" + e2);
            }
        }

        public AudioRecorderRunnable(double d2, boolean z) {
            this.speed = d2;
            this.startFeeding = z;
        }
    }

    public int getChannelCount(int i) {
        return 16 == i ? 1 : 2;
    }

    public void markRecordStop() {
        synchronized (this) {
            this.isStopped = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r0.i = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void discard() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 92386(0x168e2, float:1.2946E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 92386(0x168e2, float:1.2946E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.medialib.a.a r0 = r9.mProcessThread
            if (r0 == 0) goto L_0x003c
            com.ss.android.medialib.a.a r0 = r9.mProcessThread
            java.lang.Object r1 = r0.f29343c
            monitor-enter(r1)
            boolean r2 = r0.f29344d     // Catch:{ all -> 0x0039 }
            if (r2 != 0) goto L_0x0034
            monitor-exit(r1)     // Catch:{ all -> 0x0039 }
            return
        L_0x0034:
            monitor-exit(r1)     // Catch:{ all -> 0x0039 }
            r1 = 1
            r0.i = r1
            goto L_0x003c
        L_0x0039:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0039 }
            throw r0
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.discard():void");
    }

    public void finalize() throws Throwable {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92382, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92382, new Class[0], Void.TYPE);
            return;
        }
        if (this.audio != null) {
            try {
                if (this.audio.getState() != 0) {
                    this.audio.stop();
                }
                this.audio.release();
            } catch (Exception unused) {
            }
            this.audio = null;
        }
        super.finalize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isProcessing() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x003f }
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect     // Catch:{ all -> 0x003f }
            r4 = 0
            r5 = 92390(0x168e6, float:1.29466E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x003f }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003f }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002e
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x003f }
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect     // Catch:{ all -> 0x003f }
            r5 = 0
            r6 = 92390(0x168e6, float:1.29466E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x003f }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003f }
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003f }
            monitor-exit(r9)
            return r0
        L_0x002e:
            com.ss.android.medialib.a.a r1 = r9.mProcessThread     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            com.ss.android.medialib.a.a r1 = r9.mProcessThread     // Catch:{ all -> 0x003f }
            boolean r1 = r1.a()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            r0 = 1
            monitor-exit(r9)
            return r0
        L_0x003d:
            monitor-exit(r9)
            return r0
        L_0x003f:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.isProcessing():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean stopRecording() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 92387(0x168e3, float:1.29462E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 92387(0x168e3, float:1.29462E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002c:
            monitor-enter(r9)
            boolean r1 = r9.isRecording     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x0033
            monitor-exit(r9)     // Catch:{ all -> 0x005c }
            return r0
        L_0x0033:
            r9.isRecording = r0     // Catch:{ all -> 0x005c }
            android.media.AudioRecord r0 = r9.audio     // Catch:{ all -> 0x005c }
            r1 = 1
            if (r0 == 0) goto L_0x004a
            android.media.AudioRecord r0 = r9.audio     // Catch:{ all -> 0x005c }
            int r0 = r0.getState()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0051
            if (r0 == r1) goto L_0x0051
            android.media.AudioRecord r0 = r9.audio     // Catch:{ all -> 0x005c }
            r0.stop()     // Catch:{ all -> 0x005c }
            goto L_0x0051
        L_0x004a:
            java.lang.String r0 = "BufferedAudioRecorder"
            java.lang.String r2 = "未启动音频模块但调用stopRecording"
            com.ss.android.medialib.common.c.c(r0, r2)     // Catch:{ all -> 0x005c }
        L_0x0051:
            com.ss.android.medialib.a.a r0 = r9.mProcessThread     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x005a
            com.ss.android.medialib.a.a r0 = r9.mProcessThread     // Catch:{ all -> 0x005c }
            r0.b()     // Catch:{ all -> 0x005c }
        L_0x005a:
            monitor-exit(r9)     // Catch:{ all -> 0x005c }
            return r1
        L_0x005c:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x005c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.stopRecording():boolean");
    }

    public void unInit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92384, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92384, new Class[0], Void.TYPE);
            return;
        }
        if (this.isRecording) {
            stopRecording();
        }
        synchronized (this) {
            if (this.audio != null) {
                try {
                    int state = this.audio.getState();
                    if (!(state == 0 || state == 1)) {
                        this.audio.stop();
                    }
                    this.audio.release();
                } catch (Exception unused) {
                }
                this.audio = null;
            }
        }
        y.a("BufferedAudioRecorder", "unInit()");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r1.j == false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void waitUtilAudioProcessDone() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 92391(0x168e7, float:1.29467E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 92391(0x168e7, float:1.29467E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.medialib.a.a r1 = r9.mProcessThread
            if (r1 == 0) goto L_0x007e
            com.ss.android.medialib.a.a r1 = r9.mProcessThread
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.medialib.a.a.f29341a
            r5 = 0
            r6 = 16628(0x40f4, float:2.3301E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004d
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.medialib.a.a.f29341a
            r5 = 0
            r6 = 16628(0x40f4, float:2.3301E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x004d:
            java.lang.Object r0 = r1.k
            monitor-enter(r0)
            java.lang.Object r2 = r1.f29343c     // Catch:{ all -> 0x007b }
            monitor-enter(r2)     // Catch:{ all -> 0x007b }
            com.ss.android.medialib.a.a$b r3 = r1.f29342b     // Catch:{ all -> 0x0078 }
            r4 = 1
            boolean r3 = r3.hasMessages(r4)     // Catch:{ all -> 0x0078 }
            monitor-exit(r2)     // Catch:{ all -> 0x0078 }
            if (r3 != 0) goto L_0x0061
            boolean r2 = r1.j     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x0076
        L_0x0061:
            java.lang.String r2 = "AudioDataProcessThread"
            java.lang.String r3 = "waiting audio process start"
            com.ss.android.medialib.common.c.a(r2, r3)     // Catch:{ all -> 0x007b }
            java.lang.Object r1 = r1.k     // Catch:{ InterruptedException -> 0x006f }
            r2 = 5000(0x1388, double:2.4703E-320)
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x006f }
        L_0x006f:
            java.lang.String r1 = "AudioDataProcessThread"
            java.lang.String r2 = "waiting audio process done"
            com.ss.android.medialib.common.c.a(r1, r2)     // Catch:{ all -> 0x007b }
        L_0x0076:
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            return
        L_0x0078:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0078 }
            throw r1     // Catch:{ all -> 0x007b }
        L_0x007b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            throw r1
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.waitUtilAudioProcessDone():void");
    }

    public boolean stopFeeding() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92389, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92389, new Class[0], Boolean.TYPE)).booleanValue();
        }
        y.a("BufferedAudioRecorder", "stopFeeding() called");
        if (this.isRecording && this.audio == null) {
            y.d("BufferedAudioRecorder", "stopFeeding: 状态异常，重置状态");
            this.isRecording = false;
            this.isStopped = true;
            if (this.mProcessThread != null) {
                this.mProcessThread.b();
            }
            return false;
        } else if (!this.isRecording || this.mProcessThread == null) {
            y.d("BufferedAudioRecorder", "stopFeeding 失败，请先调用startRecording");
            return false;
        } else if (!this.mProcessThread.a()) {
            y.d("BufferedAudioRecorder", "stopFeeding 失败，请先startFeeding再stopFeeding");
            return false;
        } else {
            a aVar = this.mProcessThread;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f29341a, false, 16627, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f29341a, false, 16627, new Class[0], Void.TYPE);
            } else {
                y.c("AudioDataProcessThread", "stopFeeding");
                synchronized (aVar.f29343c) {
                    if (!aVar.f29344d) {
                        y.c("AudioDataProcessThread", "startFeeding not ready");
                    } else {
                        aVar.f29342b.sendMessage(aVar.f29342b.obtainMessage(1));
                    }
                }
            }
            return true;
        }
    }

    public BufferedAudioRecorder(MediaRecordPresenter mediaRecordPresenter) {
        this.mMediaRecordPresenter = mediaRecordPresenter;
    }

    public boolean startFeeding(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, changeQuickRedirect, false, 92388, new Class[]{Double.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, changeQuickRedirect, false, 92388, new Class[]{Double.TYPE}, Boolean.TYPE)).booleanValue();
        }
        y.a("BufferedAudioRecorder", "startFeeding() called with: speed = [" + d2 + "]");
        if (!this.isRecording || this.mProcessThread == null) {
            y.c("BufferedAudioRecorder", "startFeeding 录音未启动，将先启动startRecording");
            startRecording(d2, true);
            return true;
        } else if (this.mProcessThread.a()) {
            y.c("BufferedAudioRecorder", "startFeeding 失败，已经调用过一次了");
            return false;
        } else {
            this.isStopped = false;
            this.mProcessThread.a(this.sampleRateInHz, d2);
            return true;
        }
    }

    public void init(int i) {
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 92383, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 92383, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.audioSource = i;
        if (this.audio != null) {
            y.d("BufferedAudioRecorder", "second time audio init(), skip");
            return;
        }
        int i6 = -1;
        try {
            if (!(channelConfigOffset == -1 || sampleRateOffset == -1)) {
                this.channelConfig = channelConfigSuggested[channelConfigOffset];
                this.sampleRateInHz = sampleRateSuggested[sampleRateOffset];
                this.bufferSizeInBytes = AudioRecord.getMinBufferSize(this.sampleRateInHz, this.channelConfig, this.audioFormat);
                AudioRecord audioRecord = new AudioRecord(i, this.sampleRateInHz, this.channelConfig, this.audioFormat, this.bufferSizeInBytes);
                this.audio = audioRecord;
            }
        } catch (Exception e2) {
            y.d("BufferedAudioRecorder", "使用预设配置" + channelConfigOffset + "," + sampleRateOffset + "实例化audio recorder失败，重新测试配置。" + e2);
            this.audio = null;
            this.mMediaRecordPresenter.lackPermission();
        }
        if (this.audio == null) {
            channelConfigOffset = -1;
            int[] iArr2 = channelConfigSuggested;
            int length = iArr2.length;
            int i7 = 0;
            boolean z = false;
            while (i7 < length) {
                this.channelConfig = iArr2[i7];
                channelConfigOffset++;
                sampleRateOffset = i6;
                int[] iArr3 = sampleRateSuggested;
                int length2 = iArr3.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length2) {
                        break;
                    }
                    int i9 = iArr3[i8];
                    sampleRateOffset++;
                    try {
                        this.bufferSizeInBytes = AudioRecord.getMinBufferSize(i9, this.channelConfig, this.audioFormat);
                        y.d("BufferedAudioRecorder", "试用hz " + i9 + " " + this.channelConfig + " " + this.audioFormat);
                        if (this.bufferSizeInBytes > 0) {
                            this.sampleRateInHz = i9;
                            int i10 = this.sampleRateInHz;
                            r11 = r11;
                            i5 = i9;
                            i3 = i8;
                            int i11 = i10;
                            i4 = length2;
                            iArr = iArr3;
                            try {
                                AudioRecord audioRecord2 = new AudioRecord(i, i11, this.channelConfig, this.audioFormat, this.bufferSizeInBytes);
                                this.audio = audioRecord2;
                                z = true;
                                break;
                            } catch (Exception e3) {
                                e = e3;
                                this.sampleRateInHz = 0;
                                this.audio = null;
                                y.d("BufferedAudioRecorder", "apply audio record sample rate " + i5 + " failed: " + e.getMessage());
                                sampleRateOffset = sampleRateOffset + 1;
                                i8 = i3 + 1;
                                length2 = i4;
                                iArr3 = iArr;
                            }
                        } else {
                            int i12 = i9;
                            i3 = i8;
                            i4 = length2;
                            iArr = iArr3;
                            sampleRateOffset++;
                            i8 = i3 + 1;
                            length2 = i4;
                            iArr3 = iArr;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        i5 = i9;
                        i3 = i8;
                        i4 = length2;
                        iArr = iArr3;
                        this.sampleRateInHz = 0;
                        this.audio = null;
                        y.d("BufferedAudioRecorder", "apply audio record sample rate " + i5 + " failed: " + e.getMessage());
                        sampleRateOffset = sampleRateOffset + 1;
                        i8 = i3 + 1;
                        length2 = i4;
                        iArr3 = iArr;
                    }
                }
                if (z) {
                    break;
                }
                i7++;
                i6 = -1;
            }
        }
        if (this.sampleRateInHz <= 0) {
            y.d("BufferedAudioRecorder", "!Init audio recorder failed, hz " + this.sampleRateInHz);
            return;
        }
        if (this.channelConfig == 16) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        MediaRecordPresenter mediaRecordPresenter = this.mMediaRecordPresenter;
        int i13 = this.sampleRateInHz;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i13), Integer.valueOf(i2)}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17604, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i13), Integer.valueOf(i2)}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17604, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            y.a(MediaRecordPresenter.f29729b, "initAudioConfig");
            mediaRecordPresenter.j.initAudioConfig(i13, i2);
        }
        y.d("BufferedAudioRecorder", "Init audio recorder succeed, apply audio record sample rate " + this.sampleRateInHz + " buffer " + this.bufferSizeInBytes + " state " + this.audio.getState());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startRecording(double r15, boolean r17) {
        /*
            r14 = this;
            r8 = r14
            r9 = r15
            r0 = r17
            r11 = 2
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Double r2 = java.lang.Double.valueOf(r15)
            r12 = 0
            r1[r12] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r17)
            r13 = 1
            r1[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class r2 = java.lang.Double.TYPE
            r6[r12] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r13] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 92385(0x168e1, float:1.29459E-40)
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0053
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Double r2 = java.lang.Double.valueOf(r15)
            r1[r12] = r2
            java.lang.Byte r0 = java.lang.Byte.valueOf(r17)
            r1[r13] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 92385(0x168e1, float:1.29459E-40)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class r0 = java.lang.Double.TYPE
            r6[r12] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r13] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0053:
            java.lang.String r1 = "BufferedAudioRecorder"
            java.lang.String r2 = "startRecording() called"
            com.ss.android.vesdk.y.a(r1, r2)
            monitor-enter(r14)
            boolean r1 = r8.isRecording     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x006d
            java.lang.String r1 = "BufferedAudioRecorder"
            java.lang.String r2 = "recorder is started"
            com.ss.android.vesdk.y.c(r1, r2)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x006b
            r14.startFeeding(r15)     // Catch:{ all -> 0x00b1 }
        L_0x006b:
            monitor-exit(r14)     // Catch:{ all -> 0x00b1 }
            return
        L_0x006d:
            android.media.AudioRecord r1 = r8.audio     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x0083
            int r1 = r8.audioSource     // Catch:{ all -> 0x00b1 }
            r14.init(r1)     // Catch:{ all -> 0x00b1 }
            android.media.AudioRecord r1 = r8.audio     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x0083
            java.lang.String r0 = "BufferedAudioRecorder"
            java.lang.String r1 = "recorder is null"
            com.ss.android.vesdk.y.d(r0, r1)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r14)     // Catch:{ all -> 0x00b1 }
            return
        L_0x0083:
            r8.isRecording = r13     // Catch:{ all -> 0x00b1 }
            monitor-exit(r14)     // Catch:{ all -> 0x00b1 }
            java.lang.Thread r1 = new java.lang.Thread     // Catch:{ OutOfMemoryError -> 0x0094 }
            org.libsdl.app.BufferedAudioRecorder$AudioRecorderRunnable r2 = new org.libsdl.app.BufferedAudioRecorder$AudioRecorderRunnable     // Catch:{ OutOfMemoryError -> 0x0094 }
            r2.<init>(r9, r0)     // Catch:{ OutOfMemoryError -> 0x0094 }
            r1.<init>(r2)     // Catch:{ OutOfMemoryError -> 0x0094 }
            r1.start()     // Catch:{ OutOfMemoryError -> 0x0094 }
            return
        L_0x0094:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            r1.gc()
            r1 = 100
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00a0 }
        L_0x00a0:
            java.lang.System.runFinalization()
            java.lang.Thread r1 = new java.lang.Thread
            org.libsdl.app.BufferedAudioRecorder$AudioRecorderRunnable r2 = new org.libsdl.app.BufferedAudioRecorder$AudioRecorderRunnable
            r2.<init>(r9, r0)
            r1.<init>(r2)
            r1.start()
            return
        L_0x00b1:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00b1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.startRecording(double, boolean):void");
    }
}
