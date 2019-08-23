package com.ss.avframework.livestreamv2.interact.video;

import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.ss.avframework.livestreamv2.interact.model.Config;
import com.zego.zegoavkit2.entities.VideoFrame;
import com.zego.zegoavkit2.enums.VideoExternalRenderType;
import com.zego.zegoavkit2.enums.VideoPixelFormat;
import com.zego.zegoavkit2.videorender.IZegoExternalRenderCallback2;
import com.zego.zegoavkit2.videorender.ZegoExternalVideoRender;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ZegoVideoSink implements IZegoExternalRenderCallback2 {
    private Object mBufferFence;
    private List<IndexedFrameBuffer> mBufferList;
    private EngineCallback mCallback;
    private Object mInteractFence;
    private List<Integer> mInteractIdList;
    private volatile boolean started;
    private ZegoExternalVideoRender videoRender = new ZegoExternalVideoRender();

    /* renamed from: com.ss.avframework.livestreamv2.interact.video.ZegoVideoSink$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$zego$zegoavkit2$enums$VideoPixelFormat = new int[VideoPixelFormat.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.zego.zegoavkit2.enums.VideoPixelFormat[] r0 = com.zego.zegoavkit2.enums.VideoPixelFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$zego$zegoavkit2$enums$VideoPixelFormat = r0
                int[] r0 = $SwitchMap$com$zego$zegoavkit2$enums$VideoPixelFormat     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.zego.zegoavkit2.enums.VideoPixelFormat r1 = com.zego.zegoavkit2.enums.VideoPixelFormat.PIXEL_FORMAT_I420     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$zego$zegoavkit2$enums$VideoPixelFormat     // Catch:{ NoSuchFieldError -> 0x001f }
                com.zego.zegoavkit2.enums.VideoPixelFormat r1 = com.zego.zegoavkit2.enums.VideoPixelFormat.PIXEL_FORMAT_NV12     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$zego$zegoavkit2$enums$VideoPixelFormat     // Catch:{ NoSuchFieldError -> 0x002a }
                com.zego.zegoavkit2.enums.VideoPixelFormat r1 = com.zego.zegoavkit2.enums.VideoPixelFormat.PIXEL_FORMAT_NV21     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$zego$zegoavkit2$enums$VideoPixelFormat     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.zego.zegoavkit2.enums.VideoPixelFormat r1 = com.zego.zegoavkit2.enums.VideoPixelFormat.PIXEL_FORMAT_RGBA32     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = $SwitchMap$com$zego$zegoavkit2$enums$VideoPixelFormat     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.zego.zegoavkit2.enums.VideoPixelFormat r1 = com.zego.zegoavkit2.enums.VideoPixelFormat.PIXEL_FORMAT_BGRA32     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = $SwitchMap$com$zego$zegoavkit2$enums$VideoPixelFormat     // Catch:{ NoSuchFieldError -> 0x004b }
                com.zego.zegoavkit2.enums.VideoPixelFormat r1 = com.zego.zegoavkit2.enums.VideoPixelFormat.PIXEL_FORMAT_ARGB32     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = $SwitchMap$com$zego$zegoavkit2$enums$VideoPixelFormat     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.zego.zegoavkit2.enums.VideoPixelFormat r1 = com.zego.zegoavkit2.enums.VideoPixelFormat.PIXEL_FORMAT_ABGR32     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.interact.video.ZegoVideoSink.AnonymousClass1.<clinit>():void");
        }
    }

    class IndexedFrameBuffer {
        public int[] mBufferLens;
        public VideoFrame mFrame;
        public boolean mInUse;
        public int mIndex;
        public ByteBuffer mOutputBuffer;

        private IndexedFrameBuffer() {
            this.mFrame = new VideoFrame();
            this.mBufferLens = new int[4];
            this.mIndex = -1;
            this.mInUse = false;
        }

        /* synthetic */ IndexedFrameBuffer(ZegoVideoSink zegoVideoSink, AnonymousClass1 r2) {
            this();
        }
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public void release() {
        if (this.started) {
            stop();
        }
        this.videoRender.setZegoExternalRenderCallback2(null);
    }

    private IndexedFrameBuffer getAvailableFrameBuffer() {
        synchronized (this.mBufferFence) {
            for (IndexedFrameBuffer next : this.mBufferList) {
                if (!next.mInUse) {
                    next.mInUse = true;
                    return next;
                }
            }
            if (this.mBufferList.size() >= 10) {
                return null;
            }
            IndexedFrameBuffer indexedFrameBuffer = new IndexedFrameBuffer(this, null);
            indexedFrameBuffer.mIndex = this.mBufferList.size();
            this.mBufferList.add(indexedFrameBuffer);
            indexedFrameBuffer.mInUse = true;
            return indexedFrameBuffer;
        }
    }

    public static void enableExternalVideoRender(boolean z) {
        ZegoExternalVideoRender.enableExternalRender(z, VideoExternalRenderType.DECODE_RENDER);
    }

    public ZegoVideoSink(EngineCallback engineCallback) {
        this.mCallback = engineCallback;
        this.videoRender.setZegoExternalRenderCallback2(this);
        this.mBufferList = new ArrayList();
        this.mBufferFence = new Object();
        this.mInteractIdList = new ArrayList();
        this.mInteractFence = new Object();
    }

    private Config.VideoOutputFormat getZegoVideoOutputFormat(VideoPixelFormat videoPixelFormat) {
        switch (AnonymousClass1.$SwitchMap$com$zego$zegoavkit2$enums$VideoPixelFormat[videoPixelFormat.ordinal()]) {
            case 1:
                return Config.VideoOutputFormat.PIXEL_FORMAT_I420;
            case 2:
                return Config.VideoOutputFormat.PIXEL_FORMAT_NV12;
            case 3:
                return Config.VideoOutputFormat.PIXEL_FORMAT_NV21;
            case 4:
                return Config.VideoOutputFormat.PIXEL_FORMAT_RGBA32;
            case 5:
                return Config.VideoOutputFormat.PIXEL_FORMAT_BGRA32;
            case 6:
                return Config.VideoOutputFormat.PIXEL_FORMAT_ARGB32;
            case e.l:
                return Config.VideoOutputFormat.PIXEL_FORMAT_ABGR32;
            default:
                return Config.VideoOutputFormat.PIXEL_FORMAT_UNKNOWN;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.zego.zegoavkit2.entities.VideoFrame getInputBuffer(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.started
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Object r0 = r3.mBufferFence
            monitor-enter(r0)
            if (r4 < 0) goto L_0x0021
            java.util.List<com.ss.avframework.livestreamv2.interact.video.ZegoVideoSink$IndexedFrameBuffer> r2 = r3.mBufferList     // Catch:{ all -> 0x001f }
            int r2 = r2.size()     // Catch:{ all -> 0x001f }
            if (r4 >= r2) goto L_0x0021
            java.util.List<com.ss.avframework.livestreamv2.interact.video.ZegoVideoSink$IndexedFrameBuffer> r1 = r3.mBufferList     // Catch:{ all -> 0x001f }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x001f }
            com.ss.avframework.livestreamv2.interact.video.ZegoVideoSink$IndexedFrameBuffer r4 = (com.ss.avframework.livestreamv2.interact.video.ZegoVideoSink.IndexedFrameBuffer) r4     // Catch:{ all -> 0x001f }
            com.zego.zegoavkit2.entities.VideoFrame r4 = r4.mFrame     // Catch:{ all -> 0x001f }
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return r4
        L_0x001f:
            r4 = move-exception
            goto L_0x0023
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return r1
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.interact.video.ZegoVideoSink.getInputBuffer(int):com.zego.zegoavkit2.entities.VideoFrame");
    }

    public void onUserJoined(int i) {
        synchronized (this.mInteractFence) {
            for (Integer intValue : this.mInteractIdList) {
                if (intValue.intValue() == i) {
                    return;
                }
            }
            this.mInteractIdList.add(Integer.valueOf(i));
        }
    }

    public void onUserLeaved(int i) {
        synchronized (this.mInteractFence) {
            Iterator<Integer> it2 = this.mInteractIdList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Integer next = it2.next();
                if (next.intValue() == i) {
                    this.mInteractIdList.remove(next);
                    break;
                }
            }
        }
    }

    public static void enableInternalVideoRender(boolean z, String str) {
        ZegoExternalVideoRender.enableVideoRender(z, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r14 != com.zego.zegoavkit2.enums.VideoPixelFormat.PIXEL_FORMAT_I420) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r13 = java.lang.Integer.valueOf(com.ss.avframework.livestreamv2.interact.engine.ZegoEngine.splitInteractIdFromStreamId(r13)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r13 > 0) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0149 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void queueInputBuffer(int r12, java.lang.String r13, com.zego.zegoavkit2.enums.VideoPixelFormat r14) {
        /*
            r11 = this;
            boolean r0 = r11.started
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object r0 = r11.mBufferFence
            monitor-enter(r0)
            if (r12 < 0) goto L_0x0152
            java.util.List<com.ss.avframework.livestreamv2.interact.video.ZegoVideoSink$IndexedFrameBuffer> r1 = r11.mBufferList     // Catch:{ all -> 0x0150 }
            int r1 = r1.size()     // Catch:{ all -> 0x0150 }
            if (r12 < r1) goto L_0x0014
            goto L_0x0152
        L_0x0014:
            java.util.List<com.ss.avframework.livestreamv2.interact.video.ZegoVideoSink$IndexedFrameBuffer> r1 = r11.mBufferList     // Catch:{ all -> 0x0150 }
            java.lang.Object r12 = r1.get(r12)     // Catch:{ all -> 0x0150 }
            com.ss.avframework.livestreamv2.interact.video.ZegoVideoSink$IndexedFrameBuffer r12 = (com.ss.avframework.livestreamv2.interact.video.ZegoVideoSink.IndexedFrameBuffer) r12     // Catch:{ all -> 0x0150 }
            monitor-exit(r0)     // Catch:{ all -> 0x0150 }
            com.zego.zegoavkit2.enums.VideoPixelFormat r0 = com.zego.zegoavkit2.enums.VideoPixelFormat.PIXEL_FORMAT_I420
            r1 = 0
            if (r14 != r0) goto L_0x0146
            java.lang.String r13 = com.ss.avframework.livestreamv2.interact.engine.ZegoEngine.splitInteractIdFromStreamId(r13)     // Catch:{ Exception -> 0x0034 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0034 }
            int r13 = r13.intValue()     // Catch:{ Exception -> 0x0034 }
            if (r13 > 0) goto L_0x0032
            goto L_0x0146
        L_0x0032:
            r3 = r13
            goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            java.lang.Object r13 = r11.mInteractFence
            monitor-enter(r13)
            java.util.List<java.lang.Integer> r0 = r11.mInteractIdList     // Catch:{ all -> 0x0143 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0143 }
        L_0x003e:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0143 }
            r4 = 1
            if (r2 == 0) goto L_0x0053
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0143 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0143 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0143 }
            if (r2 != r3) goto L_0x003e
            r0 = 1
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            if (r0 != 0) goto L_0x0059
            monitor-exit(r13)     // Catch:{ all -> 0x0143 }
            goto L_0x0146
        L_0x0059:
            monitor-exit(r13)     // Catch:{ all -> 0x0143 }
            com.zego.zegoavkit2.entities.VideoFrame r13 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            int r13 = r13.width     // Catch:{ Exception -> 0x0146 }
            com.zego.zegoavkit2.entities.VideoFrame r0 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            int r0 = r0.height     // Catch:{ Exception -> 0x0146 }
            int r13 = r13 * r0
            r0 = 3
            int r13 = r13 * 3
            int r13 = r13 / 2
            java.nio.ByteBuffer r2 = r12.mOutputBuffer     // Catch:{ Exception -> 0x0146 }
            if (r2 == 0) goto L_0x0075
            java.nio.ByteBuffer r2 = r12.mOutputBuffer     // Catch:{ Exception -> 0x0146 }
            int r2 = r2.capacity()     // Catch:{ Exception -> 0x0146 }
            if (r2 >= r13) goto L_0x007b
        L_0x0075:
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.allocateDirect(r13)     // Catch:{ Exception -> 0x0146 }
            r12.mOutputBuffer = r13     // Catch:{ Exception -> 0x0146 }
        L_0x007b:
            java.nio.ByteBuffer r13 = r12.mOutputBuffer     // Catch:{ Exception -> 0x0146 }
            r13.clear()     // Catch:{ Exception -> 0x0146 }
            java.nio.ByteBuffer r13 = r12.mOutputBuffer     // Catch:{ Exception -> 0x0146 }
            byte[] r13 = r13.array()     // Catch:{ Exception -> 0x0146 }
            java.nio.ByteBuffer r2 = r12.mOutputBuffer     // Catch:{ Exception -> 0x0146 }
            int r2 = r2.arrayOffset()     // Catch:{ Exception -> 0x0146 }
            java.nio.ByteBuffer r5 = r12.mOutputBuffer     // Catch:{ Exception -> 0x0146 }
            int r5 = r5.position()     // Catch:{ Exception -> 0x0146 }
            int r2 = r2 + r5
            com.zego.zegoavkit2.entities.VideoFrame r5 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            java.nio.ByteBuffer[] r5 = r5.byteBuffers     // Catch:{ Exception -> 0x0146 }
            r5 = r5[r1]     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x00d9
            com.zego.zegoavkit2.entities.VideoFrame r5 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            java.nio.ByteBuffer[] r5 = r5.byteBuffers     // Catch:{ Exception -> 0x0146 }
            r5 = r5[r1]     // Catch:{ Exception -> 0x0146 }
            byte[] r5 = r5.array()     // Catch:{ Exception -> 0x0146 }
            com.zego.zegoavkit2.entities.VideoFrame r6 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            java.nio.ByteBuffer[] r6 = r6.byteBuffers     // Catch:{ Exception -> 0x0146 }
            r6 = r6[r1]     // Catch:{ Exception -> 0x0146 }
            int r6 = r6.arrayOffset()     // Catch:{ Exception -> 0x0146 }
            com.zego.zegoavkit2.entities.VideoFrame r7 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            java.nio.ByteBuffer[] r7 = r7.byteBuffers     // Catch:{ Exception -> 0x0146 }
            r7 = r7[r1]     // Catch:{ Exception -> 0x0146 }
            int r7 = r7.position()     // Catch:{ Exception -> 0x0146 }
            int r6 = r6 + r7
            r7 = r2
            r2 = 0
        L_0x00bc:
            com.zego.zegoavkit2.entities.VideoFrame r8 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            int r8 = r8.height     // Catch:{ Exception -> 0x0146 }
            if (r2 >= r8) goto L_0x00d8
            com.zego.zegoavkit2.entities.VideoFrame r8 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            int r8 = r8.width     // Catch:{ Exception -> 0x0146 }
            java.lang.System.arraycopy(r5, r6, r13, r7, r8)     // Catch:{ Exception -> 0x0146 }
            com.zego.zegoavkit2.entities.VideoFrame r8 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            int r8 = r8.width     // Catch:{ Exception -> 0x0146 }
            int r7 = r7 + r8
            com.zego.zegoavkit2.entities.VideoFrame r8 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            int[] r8 = r8.strides     // Catch:{ Exception -> 0x0146 }
            r8 = r8[r1]     // Catch:{ Exception -> 0x0146 }
            int r6 = r6 + r8
            int r2 = r2 + 1
            goto L_0x00bc
        L_0x00d8:
            r2 = r7
        L_0x00d9:
            if (r4 >= r0) goto L_0x012a
            com.zego.zegoavkit2.entities.VideoFrame r5 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            java.nio.ByteBuffer[] r5 = r5.byteBuffers     // Catch:{ Exception -> 0x0146 }
            r5 = r5[r4]     // Catch:{ Exception -> 0x0146 }
            if (r5 == 0) goto L_0x0127
            com.zego.zegoavkit2.entities.VideoFrame r5 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            java.nio.ByteBuffer[] r5 = r5.byteBuffers     // Catch:{ Exception -> 0x0146 }
            r5 = r5[r4]     // Catch:{ Exception -> 0x0146 }
            byte[] r5 = r5.array()     // Catch:{ Exception -> 0x0146 }
            com.zego.zegoavkit2.entities.VideoFrame r6 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            java.nio.ByteBuffer[] r6 = r6.byteBuffers     // Catch:{ Exception -> 0x0146 }
            r6 = r6[r4]     // Catch:{ Exception -> 0x0146 }
            int r6 = r6.arrayOffset()     // Catch:{ Exception -> 0x0146 }
            com.zego.zegoavkit2.entities.VideoFrame r7 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            java.nio.ByteBuffer[] r7 = r7.byteBuffers     // Catch:{ Exception -> 0x0146 }
            r7 = r7[r4]     // Catch:{ Exception -> 0x0146 }
            int r7 = r7.position()     // Catch:{ Exception -> 0x0146 }
            int r6 = r6 + r7
            r7 = r2
            r2 = 0
        L_0x0104:
            com.zego.zegoavkit2.entities.VideoFrame r8 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            int r8 = r8.height     // Catch:{ Exception -> 0x0146 }
            int r8 = r8 / 2
            if (r2 >= r8) goto L_0x0126
            com.zego.zegoavkit2.entities.VideoFrame r8 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            int r8 = r8.width     // Catch:{ Exception -> 0x0146 }
            int r8 = r8 / 2
            java.lang.System.arraycopy(r5, r6, r13, r7, r8)     // Catch:{ Exception -> 0x0146 }
            com.zego.zegoavkit2.entities.VideoFrame r8 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            int r8 = r8.width     // Catch:{ Exception -> 0x0146 }
            int r8 = r8 / 2
            int r7 = r7 + r8
            com.zego.zegoavkit2.entities.VideoFrame r8 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            int[] r8 = r8.strides     // Catch:{ Exception -> 0x0146 }
            r8 = r8[r4]     // Catch:{ Exception -> 0x0146 }
            int r6 = r6 + r8
            int r2 = r2 + 1
            goto L_0x0104
        L_0x0126:
            r2 = r7
        L_0x0127:
            int r4 = r4 + 1
            goto L_0x00d9
        L_0x012a:
            com.ss.avframework.livestreamv2.interact.callback.EngineCallback r2 = r11.mCallback     // Catch:{ Exception -> 0x0146 }
            java.nio.ByteBuffer r4 = r12.mOutputBuffer     // Catch:{ Exception -> 0x0146 }
            com.ss.avframework.livestreamv2.interact.model.Config$VideoOutputFormat r5 = r11.getZegoVideoOutputFormat(r14)     // Catch:{ Exception -> 0x0146 }
            com.zego.zegoavkit2.entities.VideoFrame r13 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            int r6 = r13.width     // Catch:{ Exception -> 0x0146 }
            com.zego.zegoavkit2.entities.VideoFrame r13 = r12.mFrame     // Catch:{ Exception -> 0x0146 }
            int r7 = r13.height     // Catch:{ Exception -> 0x0146 }
            r8 = 0
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0146 }
            r2.onReceiveVideoBufferFrame(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0146
        L_0x0143:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0143 }
            throw r12
        L_0x0146:
            java.lang.Object r13 = r11.mBufferFence
            monitor-enter(r13)
            r12.mInUse = r1     // Catch:{ all -> 0x014d }
            monitor-exit(r13)     // Catch:{ all -> 0x014d }
            return
        L_0x014d:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x014d }
            throw r12
        L_0x0150:
            r12 = move-exception
            goto L_0x0154
        L_0x0152:
            monitor-exit(r0)     // Catch:{ all -> 0x0150 }
            return
        L_0x0154:
            monitor-exit(r0)     // Catch:{ all -> 0x0150 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.interact.video.ZegoVideoSink.queueInputBuffer(int, java.lang.String, com.zego.zegoavkit2.enums.VideoPixelFormat):void");
    }

    public int dequeueInputBuffer(int i, int i2, int[] iArr, int[] iArr2) {
        if (!this.started) {
            return -1;
        }
        IndexedFrameBuffer availableFrameBuffer = getAvailableFrameBuffer();
        if (availableFrameBuffer == null) {
            return -2;
        }
        availableFrameBuffer.mFrame.width = i;
        availableFrameBuffer.mFrame.height = i2;
        int i3 = 0;
        int i4 = 0;
        while (i4 < iArr.length && i4 < availableFrameBuffer.mFrame.strides.length) {
            availableFrameBuffer.mFrame.strides[i4] = iArr[i4];
            i4++;
        }
        while (i3 < iArr2.length && i3 < availableFrameBuffer.mFrame.byteBuffers.length) {
            if (availableFrameBuffer.mBufferLens[i3] < iArr2[i3]) {
                availableFrameBuffer.mBufferLens[i3] = iArr2[i3];
                availableFrameBuffer.mFrame.byteBuffers[i3] = ByteBuffer.allocateDirect(iArr2[i3]);
            }
            if (availableFrameBuffer.mFrame.byteBuffers[i3] != null) {
                availableFrameBuffer.mFrame.byteBuffers[i3].clear();
            }
            i3++;
        }
        return availableFrameBuffer.mIndex;
    }
}
