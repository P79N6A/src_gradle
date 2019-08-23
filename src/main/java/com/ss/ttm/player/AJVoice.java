package com.ss.ttm.player;

import android.annotation.SuppressLint;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.ttm.utils.AVLogger;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class AJVoice implements AudioTrack.OnPlaybackPositionUpdateListener {
    private static final int SDK_INT = Build.VERSION.SDK_INT;
    private static final String TAG = "AJVoice";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String mDeviceName = null;
    private static boolean mNeedReleaseWorkAround = false;
    private long forceResetWorkaroundTimeMs = -9223372036854775807L;
    private Method getLatencyMethod;
    private long lastRawPlaybackHeadPosition;
    private int mAudioFormat = 2;
    private AudioManager mAudioManager;
    private AudioTrack mAudioTrack;
    private int mBlockSize = 2048;
    private int mBufferSizeMs;
    private int mChannels = 2;
    private int mChannelsLayout;
    private int mFrameSamples;
    private long mLastGetLatencyMs;
    private int mLatencyMs;
    private float mLeftVolume = -1.0f;
    private int mMaxVolume;
    private byte[] mMinBytes;
    private long mNativeObject;
    private TTPlayer mPlayer;
    private int mSampleBytes = 2;
    private int mSampleFormat;
    private int mSampleRate = 44100;
    private int mSerial = -1;
    private long mStartTime;
    private volatile boolean mStoped = true;
    private int mTrackBufferSize;
    private long mWrittenPcmBytes;

    public void onMarkerReached(AudioTrack audioTrack) {
    }

    public void onPeriodicNotification(AudioTrack audioTrack) {
    }

    public int getMaxVolume() {
        return this.mMaxVolume;
    }

    public int getTrackBufferSize() {
        return this.mTrackBufferSize;
    }

    public AJVoice() {
        if (mDeviceName == null) {
            String str = Build.DEVICE;
            mDeviceName = str;
            if (str.equals("OnePlus6T")) {
                mNeedReleaseWorkAround = true;
            }
        }
    }

    private long getPlaybackBytes() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90597, new Class[0], Long.TYPE)) {
            return getPlaybackHeadPosition() * ((long) getPcmFrameSize(this.mAudioFormat, this.mChannels));
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90597, new Class[0], Long.TYPE)).longValue();
    }

    private long getPlaybackPositionMs() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90596, new Class[0], Long.TYPE)) {
            return (getPlaybackHeadPosition() * 1000) / ((long) this.mSampleRate);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90596, new Class[0], Long.TYPE)).longValue();
    }

    public void close() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90580, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90580, new Class[0], Void.TYPE);
            return;
        }
        if (this.mAudioTrack != null) {
            final AudioTrack audioTrack = this.mAudioTrack;
            this.mAudioTrack = null;
            try {
                new Thread() {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    public void run() {
                        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90600, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90600, new Class[0], Void.TYPE);
                            return;
                        }
                        AJVoice.this.releaseTrack(audioTrack);
                    }
                }.start();
            } catch (Throwable unused) {
                releaseTrack(audioTrack);
            }
        }
    }

    public void pause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90582, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.mAudioTrack.pause();
        } catch (Throwable unused) {
        }
    }

    public void resume() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90583, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90583, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.mAudioTrack.play();
        } catch (Throwable unused) {
        }
    }

    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90584, new Class[0], Void.TYPE);
        } else if (!this.mStoped) {
            this.mStoped = true;
            try {
                this.mAudioTrack.pause();
            } catch (Throwable unused) {
            }
        }
    }

    private long getPlaybackHeadPosition() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90594, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90594, new Class[0], Long.TYPE)).longValue();
        }
        int playState = this.mAudioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.mAudioTrack.getPlaybackHeadPosition());
        if (playbackHeadPosition == 0 && this.lastRawPlaybackHeadPosition > 0 && playState == 3) {
            if (this.forceResetWorkaroundTimeMs == -9223372036854775807L) {
                this.forceResetWorkaroundTimeMs = SystemClock.elapsedRealtime();
            }
            return this.lastRawPlaybackHeadPosition;
        }
        this.forceResetWorkaroundTimeMs = -9223372036854775807L;
        this.lastRawPlaybackHeadPosition = playbackHeadPosition;
        return playbackHeadPosition;
    }

    private long getWrittenDurationMs() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90595, new Class[0], Long.TYPE)) {
            return ((this.mWrittenPcmBytes / ((long) getPcmFrameSize(this.mAudioFormat, this.mChannels))) * 1000) / ((long) this.mSampleRate);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90595, new Class[0], Long.TYPE)).longValue();
    }

    private boolean needsReset() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90593, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90593, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.forceResetWorkaroundTimeMs == -9223372036854775807L || this.mWrittenPcmBytes <= 0 || SystemClock.elapsedRealtime() - this.forceResetWorkaroundTimeMs < 200) {
            return false;
        } else {
            return true;
        }
    }

    private int reset() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90591, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90591, new Class[0], Integer.TYPE)).intValue();
        }
        this.mWrittenPcmBytes = 0;
        this.mLatencyMs = 0;
        this.forceResetWorkaroundTimeMs = -9223372036854775807L;
        this.mLastGetLatencyMs = 0;
        this.lastRawPlaybackHeadPosition = 0;
        AudioTrack audioTrack = this.mAudioTrack;
        this.mAudioTrack = null;
        try {
            audioTrack.flush();
            audioTrack.release();
        } catch (Exception unused) {
        } catch (Throwable th) {
            reconfigure();
            throw th;
        }
        return reconfigure();
    }

    public int getEOSDelayMs() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90598, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90598, new Class[0], Integer.TYPE)).intValue();
        }
        long writtenDurationMs = getWrittenDurationMs();
        long playbackPositionMs = getPlaybackPositionMs();
        if (getLatency() > 0) {
            j = (long) (this.mLatencyMs - this.mBufferSizeMs);
        } else {
            j = 0;
        }
        return (int) ((writtenDurationMs - playbackPositionMs) + j);
    }

    public int getLatency() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90592, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90592, new Class[0], Integer.TYPE)).intValue();
        }
        getPlaybackHeadPosition();
        if (this.getLatencyMethod != null) {
            long nanoTime = System.nanoTime() / 1000000;
            if (nanoTime - this.mLastGetLatencyMs > 500) {
                try {
                    this.mLatencyMs = ((Integer) this.getLatencyMethod.invoke(this.mAudioTrack, null)).intValue();
                    this.mLatencyMs = Math.max(this.mLatencyMs, 0);
                    if (this.mLatencyMs > 5000) {
                        this.mLatencyMs = 0;
                    }
                } catch (Exception unused) {
                    this.getLatencyMethod = null;
                }
                this.mLastGetLatencyMs = nanoTime;
            }
        }
        return this.mLatencyMs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float getVolume() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Float.TYPE
            r4 = 0
            r5 = 90589(0x161dd, float:1.26942E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 90589(0x161dd, float:1.26942E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Float.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
        L_0x002c:
            com.ss.ttm.player.TTPlayer r1 = r9.mPlayer
            if (r1 == 0) goto L_0x004d
            float r1 = r9.mLeftVolume
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x004d
            android.media.AudioManager r1 = r9.mAudioManager
            if (r1 == 0) goto L_0x004d
            android.media.AudioManager r1 = r9.mAudioManager     // Catch:{ Exception -> 0x004d }
            r2 = 3
            int r1 = r1.getStreamMaxVolume(r2)     // Catch:{ Exception -> 0x004d }
            android.media.AudioManager r3 = r9.mAudioManager     // Catch:{ Exception -> 0x004b }
            int r2 = r3.getStreamVolume(r2)     // Catch:{ Exception -> 0x004b }
            r0 = r2
            goto L_0x004e
        L_0x004b:
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            if (r0 < 0) goto L_0x0052
            float r0 = (float) r0
            return r0
        L_0x0052:
            if (r1 <= 0) goto L_0x0058
            int r1 = r1 / 4
            float r0 = (float) r1
            return r0
        L_0x0058:
            r0 = 1092616192(0x41200000, float:10.0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJVoice.getVolume():float");
    }

    public int start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90581, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90581, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mAudioTrack == null) {
            return -2;
        } else {
            this.mStoped = false;
            try {
                this.mAudioTrack.play();
                this.mSerial = -1;
                if (mNeedReleaseWorkAround) {
                    this.mStartTime = SystemClock.elapsedRealtime();
                }
                return 0;
            } catch (Throwable unused) {
                return -3;
            }
        }
    }

    private int reconfigure() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90590, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90590, new Class[0], Integer.TYPE)).intValue();
        }
        this.mAudioManager = (AudioManager) this.mPlayer.getContext().getSystemService("audio");
        if (this.mAudioManager != null) {
            this.mMaxVolume = this.mAudioManager.getStreamMaxVolume(3);
        }
        this.mChannelsLayout = getAudioTrackChannelConfig(this.mChannels);
        if (this.mChannelsLayout == 0) {
            AVLogger.k(TAG, String.format("not supoort channel:%d", new Object[]{Integer.valueOf(this.mChannels)}));
            return -1;
        }
        if (this.mSampleBytes == 1) {
            this.mAudioFormat = 3;
        } else if (this.mSampleBytes != 2) {
            return -12;
        } else {
            this.mAudioFormat = 2;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(this.mSampleRate, this.mChannelsLayout, this.mAudioFormat);
        if (minBufferSize <= 0) {
            return minBufferSize;
        }
        this.mTrackBufferSize = minBufferSize;
        try {
            this.mMinBytes = new byte[minBufferSize];
            this.mBufferSizeMs = ((this.mTrackBufferSize / getPcmFrameSize(this.mAudioFormat, this.mChannels)) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) / this.mSampleRate;
            AudioTrack audioTrack = new AudioTrack(3, this.mSampleRate, this.mChannelsLayout, this.mAudioFormat, minBufferSize, 1);
            this.mAudioTrack = audioTrack;
            if (this.mAudioTrack.getState() == 1) {
                return 0;
            }
            try {
                this.mAudioTrack.release();
                this.mAudioTrack = null;
                return -3;
            } catch (Exception unused) {
                this.mAudioTrack = null;
                return -3;
            } catch (Throwable unused2) {
                this.mAudioTrack = null;
                return -3;
            }
        } catch (OutOfMemoryError unused3) {
            return -10;
        }
    }

    public static int getAudioTrackChannelConfig(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case e.l:
                return 1276;
            case 8:
                if (Build.VERSION.SDK_INT < 23 && Build.VERSION.SDK_INT < 21) {
                    return 0;
                }
                return 6396;
            default:
                return 0;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0052 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void releaseTrack(android.media.AudioTrack r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.media.AudioTrack> r3 = android.media.AudioTrack.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 90579(0x161d3, float:1.26928E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 90579(0x161d3, float:1.26928E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.media.AudioTrack> r0 = android.media.AudioTrack.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            if (r18 != 0) goto L_0x0037
            return
        L_0x0037:
            boolean r1 = mNeedReleaseWorkAround     // Catch:{ Exception -> 0x0050 }
            if (r1 == 0) goto L_0x0050
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0050 }
            r3 = r17
            long r4 = r3.mStartTime     // Catch:{ Exception -> 0x0052 }
            r6 = 0
            long r1 = r1 - r4
            r4 = 80
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0052
            long r4 = r4 - r1
            java.lang.Thread.sleep(r4)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0052
        L_0x0050:
            r3 = r17
        L_0x0052:
            r18.flush()     // Catch:{ Exception -> 0x0059 }
            r18.release()     // Catch:{ Exception -> 0x0059 }
            return
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJVoice.releaseTrack(android.media.AudioTrack):void");
    }

    public static int getPcmFrameSize(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 90599, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 90599, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        switch (i) {
            case 2:
                return i2 * 2;
            case 3:
                return i2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public int open(long j, TTPlayer tTPlayer) {
        long j2 = j;
        TTPlayer tTPlayer2 = tTPlayer;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), tTPlayer2}, this, changeQuickRedirect, false, 90578, new Class[]{Long.TYPE, TTPlayer.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), tTPlayer2}, this, changeQuickRedirect, false, 90578, new Class[]{Long.TYPE, TTPlayer.class}, Integer.TYPE)).intValue();
        }
        this.mPlayer = tTPlayer2;
        int reconfigure = reconfigure();
        if (reconfigure == 0) {
            if (this.mLeftVolume != -1.0f) {
                setVolume(this.mLeftVolume, this.mLeftVolume);
            }
            if (Build.VERSION.SDK_INT >= 18) {
                try {
                    this.getLatencyMethod = AudioTrack.class.getMethod("getLatency", null);
                } catch (NoSuchMethodException unused) {
                }
            }
        }
        return reconfigure;
    }

    public void setTrackVolume(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90587, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90587, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.mAudioTrack != null) {
            this.mAudioTrack.setStereoVolume(f2, f3);
        }
    }

    public void setVolume(float f2, float f3) {
        float f4;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90588, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 90588, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        try {
            if (((float) this.mMaxVolume) < f2) {
                f4 = (float) this.mMaxVolume;
            } else {
                f4 = f2;
            }
            if (f3 == -1048575.0f && this.mAudioTrack != null) {
                this.mAudioTrack.setStereoVolume(f4, f3);
            } else if (this.mAudioManager != null) {
                this.mAudioManager.setStreamVolume(3, (int) f4, 0);
            }
            this.mLeftVolume = f4;
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"NewApi"})
    public int write(ByteBuffer byteBuffer, int i) {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (PatchProxy.isSupport(new Object[]{byteBuffer2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90586, new Class[]{ByteBuffer.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{byteBuffer2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 90586, new Class[]{ByteBuffer.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (byteBuffer2 == null) {
            AVLogger.e(TAG, "buffer is nullpoint");
            return -1;
        } else if (this.mAudioTrack.write(byteBuffer2, 0, byteBuffer.capacity()) != byteBuffer.capacity()) {
            return -1;
        } else {
            byteBuffer.flip();
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int write(byte[] r16, int r17, int r18, int r19) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = r19
            r10 = 4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r12 = 1
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r13 = 2
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r14 = 3
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r3 = 0
            r4 = 90585(0x161d9, float:1.26937E-40)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x007d
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 90585(0x161d9, float:1.26937E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x007d:
            if (r8 == 0) goto L_0x00be
            int r0 = r8.length
            if (r0 != 0) goto L_0x0083
            goto L_0x00be
        L_0x0083:
            boolean r0 = r7.mStoped
            if (r0 == 0) goto L_0x0088
            return r11
        L_0x0088:
            int r0 = r7.mSerial
            if (r0 == r9) goto L_0x009b
            r7.mSerial = r9
            long r0 = r7.mWrittenPcmBytes
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x009b
            android.media.AudioTrack r0 = r7.mAudioTrack
            r0.flush()
        L_0x009b:
            android.media.AudioTrack r0 = r7.mAudioTrack     // Catch:{ Exception -> 0x00bc }
            r1 = r17
            r2 = r18
            int r0 = r0.write(r8, r1, r2)     // Catch:{ Exception -> 0x00bc }
            if (r0 >= 0) goto L_0x00a8
            return r0
        L_0x00a8:
            long r1 = r7.mWrittenPcmBytes
            long r3 = (long) r0
            long r1 = r1 + r3
            r7.mWrittenPcmBytes = r1
            boolean r1 = r15.needsReset()
            if (r1 == 0) goto L_0x00b8
            int r11 = r15.reset()
        L_0x00b8:
            if (r11 != 0) goto L_0x00bb
            return r0
        L_0x00bb:
            return r11
        L_0x00bc:
            r0 = -1
            return r0
        L_0x00be:
            java.lang.String r0 = TAG
            java.lang.String r1 = "buffer is nullpoint"
            com.ss.ttm.utils.AVLogger.e(r0, r1)
            r0 = -10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.AJVoice.write(byte[], int, int, int):int");
    }

    public void setSampleInfo(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mSampleRate = i2;
        this.mChannels = i3;
        this.mBlockSize = i4;
        this.mSampleBytes = i6;
        this.mSampleFormat = i;
        this.mFrameSamples = i5;
    }
}
