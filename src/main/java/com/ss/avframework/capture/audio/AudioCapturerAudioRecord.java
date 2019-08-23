package com.ss.avframework.capture.audio;

import android.media.AudioRecord;
import com.ss.avframework.capture.audio.AudioCapturer;
import com.ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;

public class AudioCapturerAudioRecord extends AudioCapturer {
    public static String TAG = "AudioCapturerAudioRecord";
    public AudioCapturer.AudioCaptureObserver mAudioCaptureObserver;
    public AudioRecord mAudioRecord;
    private int mAudioSource;
    private AudioRecordThread mAudioThread;
    private final int mBitWidth;
    public ByteBuffer mByteBuffer;
    public int mChannel;
    private long mHelperFirstAudioFrameTimeMs;
    public boolean mPause;
    public final int mSample;
    private int mStat;

    class AudioRecordThread extends Thread {
        private volatile boolean keepAlive = true;
        private long mUpLogTimeSeconds;

        public void stopThread() {
            AVLog.d(AudioCapturerAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r13 = this;
                r0 = -19
                android.os.Process.setThreadPriority(r0)
                long r0 = com.ss.avframework.utils.TimeUtils.nanoTime()
                r2 = 1000(0x3e8, double:4.94E-321)
                long r0 = r0 / r2
            L_0x000c:
                boolean r4 = r13.keepAlive
                if (r4 == 0) goto L_0x00ce
                r4 = -3
                com.ss.avframework.capture.audio.AudioCapturerAudioRecord r5 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.this     // Catch:{ Throwable -> 0x0026 }
                android.media.AudioRecord r5 = r5.mAudioRecord     // Catch:{ Throwable -> 0x0026 }
                com.ss.avframework.capture.audio.AudioCapturerAudioRecord r6 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.this     // Catch:{ Throwable -> 0x0026 }
                java.nio.ByteBuffer r6 = r6.mByteBuffer     // Catch:{ Throwable -> 0x0026 }
                com.ss.avframework.capture.audio.AudioCapturerAudioRecord r7 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.this     // Catch:{ Throwable -> 0x0026 }
                java.nio.ByteBuffer r7 = r7.mByteBuffer     // Catch:{ Throwable -> 0x0026 }
                int r7 = r7.capacity()     // Catch:{ Throwable -> 0x0026 }
                int r5 = r5.read(r6, r7)     // Catch:{ Throwable -> 0x0026 }
                goto L_0x0027
            L_0x0026:
                r5 = -3
            L_0x0027:
                com.ss.avframework.capture.audio.AudioCapturerAudioRecord r6 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.this
                java.nio.ByteBuffer r6 = r6.mByteBuffer
                int r6 = r6.capacity()
                if (r5 != r6) goto L_0x0053
                com.ss.avframework.capture.audio.AudioCapturerAudioRecord r4 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.this
                boolean r4 = r4.mPause
                if (r4 != 0) goto L_0x004f
                com.ss.avframework.capture.audio.AudioCapturerAudioRecord r4 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.this
                com.ss.avframework.capture.audio.AudioCapturerAudioRecord r5 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.this
                java.nio.ByteBuffer r5 = r5.mByteBuffer
                com.ss.avframework.capture.audio.AudioCapturerAudioRecord r6 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.this
                int r6 = r6.mSample
                int r6 = r6 / 100
                com.ss.avframework.capture.audio.AudioCapturerAudioRecord r7 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.this
                int r7 = r7.mSample
                com.ss.avframework.capture.audio.AudioCapturerAudioRecord r8 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.this
                int r8 = r8.mChannel
                r9 = r0
                r4.nativeOnData((java.nio.Buffer) r5, (int) r6, (int) r7, (int) r8, (long) r9)
            L_0x004f:
                r4 = 10000(0x2710, double:4.9407E-320)
                long r0 = r0 + r4
                goto L_0x000c
            L_0x0053:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "AudioRecord.read failed: "
                r6.<init>(r7)
                r6.append(r5)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.TAG
                com.ss.avframework.utils.AVLog.e(r7, r6)
                r6 = 0
                if (r5 != r4) goto L_0x008a
                r13.keepAlive = r6
                java.lang.String r4 = new java.lang.String
                java.lang.String r7 = "AudioRecord read error, invalid operation"
                r4.<init>(r7)
                java.lang.String r7 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.TAG
                com.ss.avframework.utils.AVLog.e(r7, r4)
                com.ss.avframework.capture.audio.AudioCapturerAudioRecord r7 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.this
                com.ss.avframework.capture.audio.AudioCapturer$AudioCaptureObserver r7 = r7.mAudioCaptureObserver
                if (r7 == 0) goto L_0x008a
                com.ss.avframework.capture.audio.AudioCapturerAudioRecord r7 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.this
                com.ss.avframework.capture.audio.AudioCapturer$AudioCaptureObserver r7 = r7.mAudioCaptureObserver
                r8 = -1
                java.lang.Exception r9 = new java.lang.Exception
                r9.<init>(r4)
                r7.onAudioCaptureError(r8, r9)
            L_0x008a:
                long r7 = java.lang.System.currentTimeMillis()
                long r7 = r7 / r2
                long r9 = r13.mUpLogTimeSeconds
                long r9 = r7 - r9
                r11 = 2
                int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r4 <= 0) goto L_0x000c
                com.ss.avframework.capture.audio.AudioCapturerAudioRecord r4 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.this
                android.media.AudioRecord r4 = r4.mAudioRecord
                if (r4 == 0) goto L_0x00a5
                int r4 = r4.getState()     // Catch:{ Throwable -> 0x00a5 }
                r6 = 1
                goto L_0x00a6
            L_0x00a5:
                r4 = 0
            L_0x00a6:
                r13.mUpLogTimeSeconds = r7
                java.lang.String r7 = com.ss.avframework.capture.audio.AudioCapturerAudioRecord.TAG
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r9 = "AudioRecord read error ("
                r8.<init>(r9)
                r8.append(r5)
                java.lang.String r5 = ") stat "
                r8.append(r5)
                if (r6 == 0) goto L_0x00c0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                goto L_0x00c2
            L_0x00c0:
                java.lang.String r4 = "unknown"
            L_0x00c2:
                r8.append(r4)
                java.lang.String r4 = r8.toString()
                com.ss.avframework.utils.AVLog.ioe(r7, r4)
                goto L_0x000c
            L_0x00ce:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.capture.audio.AudioCapturerAudioRecord.AudioRecordThread.run():void");
        }

        public AudioRecordThread(String str) {
            super(str);
        }
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    public void pause() {
        this.mPause = true;
    }

    public void resume() {
        this.mPause = false;
    }

    public int getAudioSource() {
        return this.mAudioSource;
    }

    public int status() {
        return this.mStat;
    }

    public int updateChannel() {
        return this.mChannel;
    }

    public synchronized void release() {
        stop();
        super.release();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void stop() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ss.avframework.capture.audio.AudioCapturerAudioRecord$AudioRecordThread r0 = r4.mAudioThread     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 == 0) goto L_0x0014
            com.ss.avframework.capture.audio.AudioCapturerAudioRecord$AudioRecordThread r0 = r4.mAudioThread     // Catch:{ all -> 0x002d }
            r0.stopThread()     // Catch:{ all -> 0x002d }
            com.ss.avframework.capture.audio.AudioCapturerAudioRecord$AudioRecordThread r0 = r4.mAudioThread     // Catch:{ InterruptedException -> 0x0012 }
            r2 = 2000(0x7d0, double:9.88E-321)
            r0.join(r2)     // Catch:{ InterruptedException -> 0x0012 }
        L_0x0012:
            r4.mAudioThread = r1     // Catch:{ all -> 0x002d }
        L_0x0014:
            android.media.AudioRecord r0 = r4.mAudioRecord     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0024
            android.media.AudioRecord r0 = r4.mAudioRecord     // Catch:{ IllegalStateException -> 0x001d }
            r0.stop()     // Catch:{ IllegalStateException -> 0x001d }
        L_0x001d:
            android.media.AudioRecord r0 = r4.mAudioRecord     // Catch:{ all -> 0x002d }
            r0.release()     // Catch:{ all -> 0x002d }
            r4.mAudioRecord = r1     // Catch:{ all -> 0x002d }
        L_0x0024:
            r4.mAudioCaptureObserver = r1     // Catch:{ all -> 0x002d }
            r0 = 2
            r4.mStat = r0     // Catch:{ all -> 0x002d }
            r4.mStat = r0     // Catch:{ all -> 0x002d }
            monitor-exit(r4)
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.capture.audio.AudioCapturerAudioRecord.stop():void");
    }

    private void startRecording() {
        AVLog.d(TAG, "startRecording");
        try {
            this.mAudioRecord.startRecording();
            if (this.mAudioRecord.getRecordingState() != 3) {
                IllegalStateException illegalStateException = new IllegalStateException("AudioRecord.startRecording failed - incorrect state :" + this.mAudioRecord.getRecordingState());
                AVLog.w(TAG, illegalStateException.getMessage());
                AVLog.ioe(TAG, illegalStateException.getMessage());
            }
            this.mAudioThread = new AudioRecordThread("AudioRecordJavaThread");
            this.mAudioThread.start();
            this.mStat = 1;
        } catch (IllegalStateException e2) {
            throw new IllegalStateException("AudioRecord.startRecording failed: " + e2.getMessage());
        }
    }

    public void start() {
        int channelCountToConfiguration = channelCountToConfiguration(this.mChannel);
        int minBufferSize = AudioRecord.getMinBufferSize(this.mSample, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            throw new IllegalStateException("AudioRecord.getMinBufferSize failed: " + minBufferSize);
        }
        String str = TAG;
        AVLog.d(str, "AudioRecord.getMinBufferSize: " + minBufferSize);
        this.mByteBuffer = ByteBuffer.allocateDirect(this.mChannel * (this.mBitWidth / 8) * (this.mSample / 100));
        if (this.mByteBuffer.hasArray()) {
            String str2 = TAG;
            AVLog.d(str2, "byteBuffer.capacity: " + this.mByteBuffer.capacity());
            int max = Math.max(minBufferSize * 2, this.mByteBuffer.capacity());
            String str3 = TAG;
            AVLog.d(str3, "bufferSizeInBytes: " + max);
            try {
                AudioRecord audioRecord = new AudioRecord(this.mAudioSource, this.mSample, channelCountToConfiguration, 2, max);
                this.mAudioRecord = audioRecord;
                if (this.mAudioRecord == null || this.mAudioRecord.getState() != 1) {
                    throw new IllegalStateException("Failed to create a new AudioRecord instance");
                }
                startRecording();
            } catch (IllegalArgumentException e2) {
                if (this.mChannel != 1) {
                    if (this.mAudioRecord != null) {
                        this.mAudioRecord.release();
                    }
                    this.mChannel = 1;
                    AVLog.d(TAG, "AudioRecord trying mono...");
                    start();
                    return;
                }
                throw new IllegalStateException("AudioRecord ctor error: " + e2.getMessage());
            }
        } else {
            throw new IllegalStateException("ByteBuffer does not have backing array.");
        }
    }

    public AudioCapturerAudioRecord(int i, int i2, int i3) {
        this(1, i, i2, i3, null);
    }

    public AudioCapturerAudioRecord(int i, int i2, int i3, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this(1, i, i2, i3, audioCaptureObserver);
    }

    public AudioCapturerAudioRecord(int i, int i2, int i3, int i4, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mSample = i2;
        this.mChannel = i3;
        this.mBitWidth = i4;
        this.mAudioSource = i;
        this.mAudioCaptureObserver = audioCaptureObserver;
        pause();
    }
}
