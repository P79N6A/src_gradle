package com.ss.avframework.livestreamv2.filter;

import android.content.Context;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.ss.avframework.engine.AudioProcessor;
import com.ss.avframework.karaoke.VEKaraokeProcessor;
import com.ss.avframework.karaoke.coexist.audioeffect.EqualizerParams;
import com.ss.avframework.karaoke.coexist.audioeffect.Reverb2Params;
import com.ss.avframework.livestreamv2.filter.AudioEffectProcessor;
import com.ss.avframework.utils.AVLog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class KaraokeAudioProcess extends AudioProcessor implements VEKaraokeProcessor.OnAudioProcessedListener, VEKaraokeProcessor.OnBgmPlayEndListener {
    public static String TAG = "KGeAudioProcess";
    private String mBGMMusic;
    private Object mBMGFence = new Object();
    private WrapperBuffers mBuffers;
    private AudioEffectProcessor.Callback mCallback;
    private Context mContext;
    private boolean mDRCEnable = false;
    private EqualizerParams mEqualIzerParams = EqualizerParams.Presets.NONE;
    private long mInTotalSize;
    private VEKaraokeProcessor mKaraokeProcessor;
    private int mMusicPitch = 0;
    private float mMusicVolume = 1.0f;
    private long mOutTotalSize;
    private Reverb2Params mReverb2Params = Reverb2Params.Presets.NONE;
    private float mVoiceVolume = 1.0f;

    public interface WrapperBuffer {
        Buffer buffer();

        int channel();

        int sample();

        long timestamp();
    }

    class WrapperBuffers {
        private ArrayList<Cell> mBuffers;
        int mChannel;
        int mSample;
        int mSamplePerChannel;
        private ArrayList<Long> mTimestampUs;
        private int mTotalSize;

        class Cell {
            int channel;
            byte[] data;
            int offset;
            int sample;
            int size;

            public Cell(byte[] bArr, int i, int i2, int i3) {
                this.data = bArr;
                this.channel = i2;
                this.size = i;
                this.sample = i3;
            }
        }

        public WrapperBuffer dequeue() {
            return dequeue(this.mSample, this.mChannel, this.mSamplePerChannel);
        }

        public void release() {
            clean();
            synchronized (this) {
                this.mBuffers = null;
                notifyAll();
            }
        }

        public WrapperBuffer tryDequeue() {
            return tryDequeue(this.mSample, this.mChannel, this.mSamplePerChannel);
        }

        public void clean() {
            synchronized (this) {
                this.mBuffers.clear();
                this.mTimestampUs.clear();
                this.mTotalSize = 0;
            }
        }

        public void addTimestampUs(long j) {
            synchronized (this) {
                this.mTimestampUs.add(Long.valueOf(j));
            }
        }

        public WrapperBuffers() {
            this.mBuffers = new ArrayList<>();
            this.mTimestampUs = new ArrayList<>();
            this.mTotalSize = 0;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000a */
        /* JADX WARNING: Removed duplicated region for block: B:2:0x000a A[LOOP:0: B:2:0x000a->B:19:0x000a, LOOP_START, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess.WrapperBuffer dequeue(int r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = r5 * r4
                int r5 = r5 * 2
                int r0 = r2.mTotalSize
                int r0 = r0 / r5
                int r5 = r5 * r0
                monitor-enter(r2)
            L_0x000a:
                java.util.ArrayList<com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess$WrapperBuffers$Cell> r1 = r2.mBuffers     // Catch:{ all -> 0x001f }
                if (r1 == 0) goto L_0x001c
                int r1 = r2.mTotalSize     // Catch:{ all -> 0x001f }
                if (r5 >= r1) goto L_0x0018
                com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess$WrapperBuffer r3 = r2.concatLocked(r5, r3, r4, r0)     // Catch:{ all -> 0x001f }
                monitor-exit(r2)     // Catch:{ all -> 0x001f }
                return r3
            L_0x0018:
                r2.wait()     // Catch:{ InterruptedException -> 0x000a }
                goto L_0x000a
            L_0x001c:
                monitor-exit(r2)     // Catch:{ all -> 0x001f }
                r3 = 0
                return r3
            L_0x001f:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x001f }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess.WrapperBuffers.dequeue(int, int, int):com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess$WrapperBuffer");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess.WrapperBuffer tryDequeue(int r5, int r6, int r7) {
            /*
                r4 = this;
                int r7 = r7 * r6
                int r7 = r7 * 2
                monitor-enter(r4)
                int r0 = r4.mTotalSize     // Catch:{ all -> 0x0030 }
                int r0 = r0 / r7
                r1 = 4
                if (r0 <= r1) goto L_0x000c
                r0 = 4
            L_0x000c:
                java.lang.String r1 = com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess.TAG     // Catch:{ all -> 0x0030 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
                java.lang.String r3 = "Peek packet "
                r2.<init>(r3)     // Catch:{ all -> 0x0030 }
                r2.append(r0)     // Catch:{ all -> 0x0030 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0030 }
                com.ss.avframework.utils.AVLog.w(r1, r2)     // Catch:{ all -> 0x0030 }
                int r7 = r7 * r0
                if (r7 <= 0) goto L_0x002d
                int r1 = r4.mTotalSize     // Catch:{ all -> 0x0030 }
                if (r7 > r1) goto L_0x002d
                com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess$WrapperBuffer r5 = r4.concatLocked(r7, r5, r6, r0)     // Catch:{ all -> 0x0030 }
                monitor-exit(r4)     // Catch:{ all -> 0x0030 }
                return r5
            L_0x002d:
                monitor-exit(r4)     // Catch:{ all -> 0x0030 }
                r5 = 0
                return r5
            L_0x0030:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0030 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess.WrapperBuffers.tryDequeue(int, int, int):com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess$WrapperBuffer");
        }

        public WrapperBuffers(KaraokeAudioProcess karaokeAudioProcess, int i, int i2, int i3) {
            this();
            this.mChannel = i2;
            this.mSample = i;
            this.mSamplePerChannel = i3;
        }

        public void queue(byte[] bArr, int i, int i2, int i3) {
            synchronized (this) {
                Cell cell = new Cell(bArr, i, i2, i3);
                this.mBuffers.add(cell);
                this.mTotalSize += i;
            }
        }

        private WrapperBuffer concatLocked(int i, int i2, int i3, int i4) {
            if (i > this.mTotalSize) {
                return null;
            }
            if (this.mTimestampUs.size() > 0) {
                final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
                int i5 = 0;
                while (i5 < i) {
                    Cell cell = this.mBuffers.get(0);
                    if (cell.sample == i2 && cell.channel == i3) {
                        int i6 = i - i5;
                        if (cell.size > i6) {
                            allocateDirect.put(cell.data, cell.offset, i6);
                            cell.offset += i6;
                            cell.size -= i6;
                            i5 += i6;
                            if (cell.size < 0) {
                                throw new AndroidRuntimeException("Cell data size exception offset " + cell.offset + " data len " + cell.data.length + " size " + cell.size);
                            }
                        } else {
                            allocateDirect.put(cell.data, cell.offset, cell.size);
                            this.mBuffers.remove(0);
                            i5 += cell.size;
                        }
                    } else {
                        throw new AndroidRuntimeException("Sample or channel error");
                    }
                }
                this.mTotalSize -= i5;
                if (i5 == i) {
                    final long longValue = this.mTimestampUs.remove(0).longValue();
                    int i7 = i4 - 1;
                    while (i7 > 0) {
                        if (this.mTimestampUs.size() > 0) {
                            this.mTimestampUs.remove(0);
                            i7--;
                        } else {
                            throw new AndroidRuntimeException("BUG, remove timestamp size " + i7);
                        }
                    }
                    AVLog.w(KaraokeAudioProcess.TAG, "total size " + this.mTotalSize + " timestamp size " + this.mTimestampUs.size());
                    final int i8 = i2;
                    final int i9 = i3;
                    AnonymousClass1 r1 = new WrapperBuffer() {
                        public Buffer buffer() {
                            return allocateDirect;
                        }

                        public int channel() {
                            return i9;
                        }

                        public int sample() {
                            return i8;
                        }

                        public long timestamp() {
                            return longValue;
                        }
                    };
                    return r1;
                }
                throw new AndroidRuntimeException("Concat audio faild. writesize " + i5 + " reqSize " + i);
            }
            throw new AndroidRuntimeException("Timestamp bug!");
        }
    }

    public void pause() {
        if (this.mKaraokeProcessor != null) {
            this.mKaraokeProcessor.pause();
        }
    }

    public void resume() {
        if (this.mKaraokeProcessor != null) {
            this.mKaraokeProcessor.resume();
        }
    }

    static {
        System.loadLibrary("ttffmpeg");
        System.loadLibrary("yuv");
        System.loadLibrary("effect");
        System.loadLibrary("live-karaoke");
    }

    public void start() {
        AVLog.d(TAG, "start karaoke.");
        synchronized (this.mBMGFence) {
            if (this.mKaraokeProcessor != null) {
                this.mKaraokeProcessor.start();
            }
        }
    }

    public void stop() {
        AVLog.d(TAG, "stop karaoke.");
        synchronized (this.mBMGFence) {
            if (this.mKaraokeProcessor != null) {
                this.mKaraokeProcessor.stop();
            }
        }
    }

    private void setupDefaultParameters_l() {
        if (this.mKaraokeProcessor != null) {
            this.mKaraokeProcessor.setAudioEq(this.mEqualIzerParams);
            this.mKaraokeProcessor.setAudioReverb(this.mReverb2Params);
            this.mKaraokeProcessor.setMusicPitch(this.mMusicPitch);
            this.mKaraokeProcessor.setBGMVolume(this.mMusicVolume);
            this.mKaraokeProcessor.setVoiceVolume(this.mVoiceVolume);
            this.mKaraokeProcessor.setDRCEnable(this.mDRCEnable);
            if (this.mBGMMusic != null) {
                this.mKaraokeProcessor.setBgmPath(this.mBGMMusic);
            }
        }
    }

    public synchronized void release() {
        AVLog.d(TAG, "release karaoke.");
        synchronized (this.mBMGFence) {
            if (this.mBuffers != null) {
                this.mBuffers.release();
                this.mBuffers = null;
            }
            if (this.mKaraokeProcessor != null) {
                this.mKaraokeProcessor.stop();
                this.mKaraokeProcessor.release();
                this.mKaraokeProcessor = null;
            }
        }
        super.release();
    }

    public void setBGMProgressListener(AudioEffectProcessor.Callback callback) {
        this.mCallback = callback;
    }

    public void onComplete(boolean z) {
        AudioEffectProcessor.Callback callback = this.mCallback;
        if (callback != null && z) {
            callback.stop();
        }
    }

    public void setAudioEq(Object obj) {
        if (obj != null && (obj instanceof EqualizerParams)) {
            this.mEqualIzerParams = (EqualizerParams) obj;
            synchronized (this.mBMGFence) {
                if (this.mKaraokeProcessor != null) {
                    this.mKaraokeProcessor.setAudioEq(this.mEqualIzerParams);
                }
            }
        }
    }

    public void setAudioReverb(Object obj) {
        if (obj != null && (obj instanceof Reverb2Params)) {
            this.mReverb2Params = (Reverb2Params) obj;
            synchronized (this.mBMGFence) {
                if (this.mKaraokeProcessor != null) {
                    this.mKaraokeProcessor.setAudioReverb(this.mReverb2Params);
                }
            }
        }
    }

    public void setBGMVolume(float f2) {
        this.mMusicVolume = f2;
        synchronized (this.mBMGFence) {
            if (this.mKaraokeProcessor != null) {
                this.mKaraokeProcessor.setBGMVolume(f2);
            }
        }
    }

    public void setDRCEnable(boolean z) {
        this.mDRCEnable = z;
        synchronized (this.mBMGFence) {
            if (this.mKaraokeProcessor != null) {
                this.mKaraokeProcessor.setDRCEnable(z);
            }
        }
    }

    public synchronized void setMusicPitch(int i) {
        this.mMusicPitch = i;
        synchronized (this.mBMGFence) {
            if (this.mKaraokeProcessor != null) {
                this.mKaraokeProcessor.setMusicPitch(this.mMusicPitch);
            }
        }
    }

    public void setVoiceVolume(float f2) {
        this.mVoiceVolume = f2;
        synchronized (this.mBMGFence) {
            if (this.mKaraokeProcessor != null) {
                this.mKaraokeProcessor.setVoiceVolume(f2);
            }
        }
    }

    public KaraokeAudioProcess(Context context) {
        this.mContext = context;
        this.mBuffers = new WrapperBuffers();
    }

    public void setBGMMusic(String str) {
        this.mBGMMusic = str;
        synchronized (this.mBMGFence) {
            if (this.mKaraokeProcessor != null) {
                this.mKaraokeProcessor.stop();
                if (!TextUtils.isEmpty(str)) {
                    this.mKaraokeProcessor.setBgmPath(str);
                    this.mKaraokeProcessor.start();
                }
            }
        }
        if (!TextUtils.isEmpty(str) && this.mCallback != null) {
            this.mCallback.start();
        }
    }

    public void setBGMMusic(String str, long j) {
        this.mBGMMusic = str;
        synchronized (this.mBMGFence) {
            if (this.mKaraokeProcessor != null) {
                this.mKaraokeProcessor.stop();
                if (!TextUtils.isEmpty(str)) {
                    this.mKaraokeProcessor.setBgmPath(str);
                    this.mKaraokeProcessor.setBgmStart(j);
                    this.mKaraokeProcessor.start();
                    if (this.mCallback != null) {
                        this.mCallback.start();
                    }
                }
            }
        }
    }

    public void onAudioProcessed(byte[] bArr, int i, int i2) {
        AudioEffectProcessor.Callback callback = this.mCallback;
        if (!(i2 == 0 || callback == null)) {
            callback.onProgress((long) i2);
        }
        onAudioProcessed(bArr, i, this.mKaraokeProcessor.getSampleRate(), this.mKaraokeProcessor.getChannels());
    }

    /* access modifiers changed from: protected */
    public void onAudioProcessed(byte[] bArr, int i, int i2, int i3) {
        WrapperBuffers wrapperBuffers = this.mBuffers;
        this.mOutTotalSize += (long) i;
        if (wrapperBuffers != null) {
            wrapperBuffers.queue(bArr, i, i3, i2);
        }
    }

    public KaraokeAudioProcess(Context context, int i, int i2, int i3) {
        this.mContext = context;
        this.mBuffers = new WrapperBuffers(this, i, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e9, code lost:
        r1.mBuffers.addTimestampUs(r5);
        r2 = r1.mBuffers.tryDequeue(r3, r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f4, code lost:
        if (r10 != false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f6, code lost:
        if (r2 != null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f8, code lost:
        new java.lang.Exception("Karaoke post frame failed with return origin audio frame");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ff, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0100, code lost:
        if (r2 != null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0103, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0108, code lost:
        return r2.buffer();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.nio.Buffer process(java.nio.Buffer r17, int r18, int r19, int r20, long r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            java.lang.Object r7 = r1.mBMGFence
            monitor-enter(r7)
            com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess$WrapperBuffers r8 = r1.mBuffers     // Catch:{ all -> 0x0109 }
            if (r8 != 0) goto L_0x001c
            java.lang.String r2 = TAG     // Catch:{ all -> 0x0109 }
            java.lang.String r3 = "Already release on Karaoke audio process"
            com.ss.avframework.utils.AVLog.d(r2, r3)     // Catch:{ all -> 0x0109 }
            monitor-exit(r7)     // Catch:{ all -> 0x0109 }
            return r0
        L_0x001c:
            com.ss.avframework.karaoke.VEKaraokeProcessor r8 = r1.mKaraokeProcessor     // Catch:{ all -> 0x0109 }
            r9 = 0
            if (r8 == 0) goto L_0x0038
            com.ss.avframework.karaoke.VEKaraokeProcessor r8 = r1.mKaraokeProcessor     // Catch:{ all -> 0x0109 }
            int r8 = r8.getChannels()     // Catch:{ all -> 0x0109 }
            if (r8 != r4) goto L_0x0031
            com.ss.avframework.karaoke.VEKaraokeProcessor r8 = r1.mKaraokeProcessor     // Catch:{ all -> 0x0109 }
            int r8 = r8.getSampleRate()     // Catch:{ all -> 0x0109 }
            if (r8 == r3) goto L_0x0038
        L_0x0031:
            com.ss.avframework.karaoke.VEKaraokeProcessor r8 = r1.mKaraokeProcessor     // Catch:{ all -> 0x0109 }
            r8.stop()     // Catch:{ all -> 0x0109 }
            r1.mKaraokeProcessor = r9     // Catch:{ all -> 0x0109 }
        L_0x0038:
            com.ss.avframework.karaoke.VEKaraokeProcessor r8 = r1.mKaraokeProcessor     // Catch:{ all -> 0x0109 }
            if (r8 != 0) goto L_0x0069
            com.ss.avframework.karaoke.VEKaraokeProcessor r8 = new com.ss.avframework.karaoke.VEKaraokeProcessor     // Catch:{ all -> 0x0109 }
            android.content.Context r10 = r1.mContext     // Catch:{ all -> 0x0109 }
            r8.<init>(r10, r3, r4)     // Catch:{ all -> 0x0109 }
            r1.mKaraokeProcessor = r8     // Catch:{ all -> 0x0109 }
            com.ss.avframework.karaoke.VEKaraokeProcessor r8 = r1.mKaraokeProcessor     // Catch:{ all -> 0x0109 }
            r10 = 1
            r8.setOutputWithBgm(r10)     // Catch:{ all -> 0x0109 }
            com.ss.avframework.karaoke.VEKaraokeProcessor r8 = r1.mKaraokeProcessor     // Catch:{ all -> 0x0109 }
            r8.setOnAudioProcessedListener(r1)     // Catch:{ all -> 0x0109 }
            com.ss.avframework.karaoke.VEKaraokeProcessor r8 = r1.mKaraokeProcessor     // Catch:{ all -> 0x0109 }
            r8.setOnBgmPlayEndListener(r1)     // Catch:{ all -> 0x0109 }
            r16.setupDefaultParameters_l()     // Catch:{ all -> 0x0109 }
            com.ss.avframework.karaoke.VEKaraokeProcessor r8 = r1.mKaraokeProcessor     // Catch:{ all -> 0x0109 }
            boolean r8 = r8.start()     // Catch:{ all -> 0x0109 }
            if (r8 == 0) goto L_0x0061
            goto L_0x0069
        L_0x0061:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException     // Catch:{ all -> 0x0109 }
            java.lang.String r2 = "Start karaoke failed"
            r0.<init>(r2)     // Catch:{ all -> 0x0109 }
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x0069:
            com.ss.avframework.karaoke.VEKaraokeProcessor r8 = r1.mKaraokeProcessor     // Catch:{ all -> 0x0109 }
            r10 = 0
            if (r8 == 0) goto L_0x00e8
            boolean r8 = r0 instanceof java.nio.ByteBuffer     // Catch:{ all -> 0x0109 }
            if (r8 == 0) goto L_0x0082
            r8 = r0
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8     // Catch:{ all -> 0x0109 }
            int r11 = r8.capacity()     // Catch:{ all -> 0x0109 }
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x0109 }
            r8.position(r10)     // Catch:{ all -> 0x0109 }
            r8.get(r11)     // Catch:{ all -> 0x0109 }
            goto L_0x0083
        L_0x0082:
            r11 = r9
        L_0x0083:
            if (r11 == 0) goto L_0x00e0
            com.ss.avframework.karaoke.VEKaraokeProcessor r8 = r1.mKaraokeProcessor     // Catch:{ all -> 0x0109 }
            int r10 = r11.length     // Catch:{ all -> 0x0109 }
            boolean r10 = r8.enqueueAudio(r11, r10)     // Catch:{ all -> 0x0109 }
            long r11 = r1.mInTotalSize     // Catch:{ all -> 0x0109 }
            int r8 = r17.capacity()     // Catch:{ all -> 0x0109 }
            long r13 = (long) r8     // Catch:{ all -> 0x0109 }
            long r11 = r11 + r13
            r1.mInTotalSize = r11     // Catch:{ all -> 0x0109 }
            long r11 = r1.mInTotalSize     // Catch:{ all -> 0x0109 }
            long r13 = r1.mOutTotalSize     // Catch:{ all -> 0x0109 }
            java.lang.String r8 = TAG     // Catch:{ all -> 0x0109 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0109 }
            java.lang.String r9 = "STONE in VS out "
            r15.<init>(r9)     // Catch:{ all -> 0x0109 }
            r15.append(r11)     // Catch:{ all -> 0x0109 }
            java.lang.String r9 = " VS "
            r15.append(r9)     // Catch:{ all -> 0x0109 }
            r15.append(r13)     // Catch:{ all -> 0x0109 }
            java.lang.String r9 = "("
            r15.append(r9)     // Catch:{ all -> 0x0109 }
            r9 = 0
            long r11 = r11 - r13
            r15.append(r11)     // Catch:{ all -> 0x0109 }
            java.lang.String r9 = ") samplePerChannel "
            r15.append(r9)     // Catch:{ all -> 0x0109 }
            r15.append(r2)     // Catch:{ all -> 0x0109 }
            java.lang.String r9 = " sample "
            r15.append(r9)     // Catch:{ all -> 0x0109 }
            r15.append(r3)     // Catch:{ all -> 0x0109 }
            java.lang.String r9 = " channel "
            r15.append(r9)     // Catch:{ all -> 0x0109 }
            r15.append(r4)     // Catch:{ all -> 0x0109 }
            java.lang.String r9 = " timestamp "
            r15.append(r9)     // Catch:{ all -> 0x0109 }
            r15.append(r5)     // Catch:{ all -> 0x0109 }
            java.lang.String r9 = r15.toString()     // Catch:{ all -> 0x0109 }
            com.ss.avframework.utils.AVLog.e(r8, r9)     // Catch:{ all -> 0x0109 }
            goto L_0x00e8
        L_0x00e0:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException     // Catch:{ all -> 0x0109 }
            java.lang.String r2 = "buffer is null"
            r0.<init>(r2)     // Catch:{ all -> 0x0109 }
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x00e8:
            monitor-exit(r7)     // Catch:{ all -> 0x0109 }
            com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess$WrapperBuffers r7 = r1.mBuffers
            r7.addTimestampUs(r5)
            com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess$WrapperBuffers r5 = r1.mBuffers
            com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess$WrapperBuffer r2 = r5.tryDequeue(r3, r4, r2)
            if (r10 != 0) goto L_0x0100
            if (r2 != 0) goto L_0x0100
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "Karaoke post frame failed with return origin audio frame"
            r2.<init>(r3)
            return r0
        L_0x0100:
            if (r2 != 0) goto L_0x0104
            r0 = 0
            return r0
        L_0x0104:
            java.nio.Buffer r0 = r2.buffer()
            return r0
        L_0x0109:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0109 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.filter.KaraokeAudioProcess.process(java.nio.Buffer, int, int, int, long):java.nio.Buffer");
    }
}
