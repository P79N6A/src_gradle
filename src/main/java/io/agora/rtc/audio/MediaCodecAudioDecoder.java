package io.agora.rtc.audio;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import io.agora.rtc.internal.Logging;
import java.nio.ByteBuffer;

public class MediaCodecAudioDecoder {
    private static int HTTP_REQUEST_TIMEOUT = 3000;
    private String TAG = "MediaCodec Audio Decoder";
    private boolean eoInputStream;
    private boolean eoOutputStream;
    private MediaCodec mAACDecoder;
    private ByteBuffer mAACOutputBuffer = ByteBuffer.allocateDirect(4096);
    private int mChannels = 2;
    private Context mContext;
    private boolean mDecodedDataReady;
    private ByteBuffer mDecodedRAWBuffer;
    private MediaExtractor mExtractor;
    private long mFileLength;
    private ByteBuffer[] mInputBuffers;
    private MediaCodec mMediaCodec;
    private ByteBuffer[] mOutputBuffers;
    private int mSampleRate = 44100;
    private MediaFormat mTrackFormat;

    public int getAndroidVersion() {
        return Build.VERSION.SDK_INT;
    }

    public int getChannelCount() {
        return this.mChannels;
    }

    public boolean getDecodeDataReadyFlag() {
        return this.mDecodedDataReady;
    }

    public long getFileLength() {
        return this.mFileLength;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public long getCurrentFilePosition() {
        return this.mExtractor.getSampleTime();
    }

    public void releaseAACStreaming() {
        try {
            if (this.mAACDecoder != null) {
                this.mAACDecoder.stop();
                this.mAACDecoder.release();
                this.mAACDecoder = null;
            }
        } catch (Exception unused) {
            Logging.e(this.TAG, "Error when releasing aac decode stream");
        }
    }

    public void rewindStreaming() {
        try {
            this.mExtractor.seekTo(0, 1);
            this.mMediaCodec.flush();
        } catch (Exception unused) {
            Logging.e(this.TAG, "Error when rewinding audio file stream");
        }
        this.eoInputStream = false;
        this.eoOutputStream = false;
        this.mDecodedDataReady = false;
    }

    private boolean checkInfoChange() {
        boolean z;
        try {
            MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            int integer2 = outputFormat.getInteger("channel-count");
            if (this.mSampleRate == integer) {
                if (this.mChannels == integer2) {
                    z = false;
                    this.mSampleRate = integer;
                    this.mChannels = integer2;
                    return z;
                }
            }
            z = true;
            this.mSampleRate = integer;
            this.mChannels = integer2;
            return z;
        } catch (Exception unused) {
            Logging.e(this.TAG, "Error when checking file's new format");
            return false;
        }
    }

    public void releaseStreaming() {
        try {
            if (this.mMediaCodec != null) {
                this.mMediaCodec.stop();
                this.mMediaCodec.release();
                this.mMediaCodec = null;
            }
            if (this.mExtractor != null) {
                this.mExtractor.release();
                this.mExtractor = null;
            }
        } catch (Exception unused) {
            Logging.e(this.TAG, "Error when releasing audio file stream");
        }
        this.eoOutputStream = false;
        this.eoInputStream = false;
    }

    public boolean checkAACSupported() {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT < 21) {
                int codecCount = MediaCodecList.getCodecCount();
                int i = 0;
                while (true) {
                    if (i >= codecCount) {
                        break;
                    }
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    if (!codecInfoAt.isEncoder() && codecInfoAt.getName().toLowerCase().contains("nvidia")) {
                        break;
                    }
                    i++;
                }
            } else {
                MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
                int length = codecInfos.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    MediaCodecInfo mediaCodecInfo = codecInfos[i2];
                    if (!mediaCodecInfo.isEncoder() && mediaCodecInfo.getName().toLowerCase().contains("nvidia")) {
                        break;
                    }
                    i2++;
                }
                return z;
            }
            z = true;
            return z;
        } catch (Exception unused) {
            Logging.e(this.TAG, "Error when checking aac codec availability");
            return false;
        }
    }

    public boolean decodeFrame() {
        ByteBuffer byteBuffer;
        int i;
        try {
            if (!this.eoInputStream) {
                int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(0);
                if (dequeueInputBuffer >= 0) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        byteBuffer = this.mMediaCodec.getInputBuffer(dequeueInputBuffer);
                    } else {
                        this.mInputBuffers = this.mMediaCodec.getInputBuffers();
                        byteBuffer = this.mInputBuffers[dequeueInputBuffer];
                    }
                    int readSampleData = this.mExtractor.readSampleData(byteBuffer, 0);
                    if (readSampleData <= 0) {
                        this.eoInputStream = true;
                        i = 0;
                    } else {
                        i = readSampleData;
                    }
                    long sampleTime = this.mExtractor.getSampleTime();
                    int sampleFlags = this.mExtractor.getSampleFlags();
                    if (this.eoInputStream) {
                        sampleFlags |= 4;
                    }
                    this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, i, sampleTime, sampleFlags);
                    this.mExtractor.advance();
                }
            }
            if (!this.eoOutputStream) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, 0);
                this.mDecodedDataReady = false;
                switch (dequeueOutputBuffer) {
                    case -3:
                    case -2:
                    case -1:
                        break;
                    default:
                        if (dequeueOutputBuffer >= 0) {
                            if ((bufferInfo.flags & 4) == 4) {
                                this.eoOutputStream = true;
                            }
                            if (Build.VERSION.SDK_INT >= 21) {
                                cloneByteBuffer(this.mMediaCodec.getOutputBuffer(dequeueOutputBuffer));
                            } else {
                                this.mOutputBuffers = this.mMediaCodec.getOutputBuffers();
                                cloneByteBufferByLength(this.mOutputBuffers[dequeueOutputBuffer], bufferInfo.size);
                            }
                            this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                            this.mDecodedDataReady = true;
                            break;
                        }
                        break;
                }
            }
        } catch (Exception unused) {
            Logging.e(this.TAG, "Error when decoding audio file stream");
        }
        return this.eoOutputStream;
    }

    public void setCurrentFilePosition(long j) {
        this.mExtractor.seekTo(j, 2);
    }

    private void cloneByteBuffer(ByteBuffer byteBuffer) {
        try {
            if (this.mDecodedRAWBuffer == null || this.mDecodedRAWBuffer.limit() != byteBuffer.limit()) {
                if (this.mDecodedRAWBuffer != null) {
                    this.mDecodedRAWBuffer.clear();
                    this.mDecodedRAWBuffer = null;
                }
                this.mDecodedRAWBuffer = ByteBuffer.allocateDirect(byteBuffer.limit());
            }
            this.mDecodedRAWBuffer.position(0);
            this.mDecodedRAWBuffer.put(byteBuffer);
        } catch (Exception unused) {
        }
    }

    public boolean createAACStreaming(int i) {
        try {
            this.mAACDecoder = MediaCodec.createDecoderByType("audio/mp4a-latm");
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, 1);
            createAudioFormat.setInteger("sample-rate", i);
            createAudioFormat.setInteger("channel-count", 1);
            createAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(new byte[]{18, -120}));
            this.mAACDecoder.configure(createAudioFormat, null, null, 0);
            if (this.mAACDecoder != null) {
                this.mAACDecoder.start();
            }
            return true;
        } catch (Exception unused) {
            Logging.e(this.TAG, "Error when creating aac decode stream");
            return false;
        }
    }

    public int decodeAACFrame(byte[] bArr) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int i = 0;
        try {
            int dequeueInputBuffer = this.mAACDecoder.dequeueInputBuffer(200);
            if (dequeueInputBuffer >= 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer2 = this.mAACDecoder.getInputBuffer(dequeueInputBuffer);
                } else {
                    byteBuffer2 = this.mAACDecoder.getInputBuffers()[dequeueInputBuffer];
                }
                byteBuffer2.clear();
                byteBuffer2.put(bArr);
                this.mAACDecoder.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, 0, 0);
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mAACDecoder.dequeueOutputBuffer(bufferInfo, 0);
            switch (dequeueOutputBuffer) {
                case -3:
                case -2:
                case -1:
                    return 0;
                default:
                    if (dequeueOutputBuffer >= 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            byteBuffer = this.mAACDecoder.getOutputBuffer(dequeueOutputBuffer);
                        } else {
                            byteBuffer = this.mAACDecoder.getOutputBuffers()[dequeueOutputBuffer];
                        }
                        int i2 = bufferInfo.size;
                        try {
                            this.mAACOutputBuffer.position(0);
                            byteBuffer.limit(i2);
                            this.mAACOutputBuffer.put(byteBuffer);
                            this.mAACDecoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                            return i2;
                        } catch (Exception unused) {
                            i = i2;
                            break;
                        }
                    } else {
                        return 0;
                    }
            }
        } catch (Exception unused2) {
        }
        Logging.e(this.TAG, "Error when decoding aac stream");
        return i;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0082 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean createStreaming(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = r7.TAG     // Catch:{ Exception -> 0x011b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011b }
            java.lang.String r3 = "Try to decode audio file : "
            r2.<init>(r3)     // Catch:{ Exception -> 0x011b }
            r2.append(r8)     // Catch:{ Exception -> 0x011b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x011b }
            io.agora.rtc.internal.Logging.i(r1, r2)     // Catch:{ Exception -> 0x011b }
            java.lang.String r1 = "/assets/"
            boolean r2 = r8.startsWith(r1)     // Catch:{ Exception -> 0x011b }
            java.lang.String r3 = r8.toLowerCase()     // Catch:{ Exception -> 0x011b }
            java.lang.String r4 = "http"
            boolean r3 = r3.startsWith(r4)     // Catch:{ Exception -> 0x011b }
            android.media.MediaExtractor r4 = new android.media.MediaExtractor     // Catch:{ Exception -> 0x011b }
            r4.<init>()     // Catch:{ Exception -> 0x011b }
            r7.mExtractor = r4     // Catch:{ Exception -> 0x011b }
            if (r2 == 0) goto L_0x0056
            android.content.Context r2 = r7.mContext     // Catch:{ Exception -> 0x011b }
            if (r2 != 0) goto L_0x0032
            return r0
        L_0x0032:
            android.content.Context r2 = r7.mContext     // Catch:{ Exception -> 0x011b }
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ Exception -> 0x011b }
            int r1 = r1.length()     // Catch:{ Exception -> 0x011b }
            java.lang.String r8 = r8.substring(r1)     // Catch:{ Exception -> 0x011b }
            android.content.res.AssetFileDescriptor r8 = r2.openFd(r8)     // Catch:{ Exception -> 0x011b }
            android.media.MediaExtractor r1 = r7.mExtractor     // Catch:{ Exception -> 0x011b }
            java.io.FileDescriptor r2 = r8.getFileDescriptor()     // Catch:{ Exception -> 0x011b }
            long r3 = r8.getStartOffset()     // Catch:{ Exception -> 0x011b }
            long r5 = r8.getLength()     // Catch:{ Exception -> 0x011b }
            r1.setDataSource(r2, r3, r5)     // Catch:{ Exception -> 0x011b }
            goto L_0x00af
        L_0x0056:
            if (r3 == 0) goto L_0x00aa
            java.net.HttpURLConnection.setFollowRedirects(r0)     // Catch:{ SocketTimeoutException -> 0x0096, IOException -> 0x0082 }
            java.net.URL r1 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x0096, IOException -> 0x0082 }
            r1.<init>(r8)     // Catch:{ SocketTimeoutException -> 0x0096, IOException -> 0x0082 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ SocketTimeoutException -> 0x0096, IOException -> 0x0082 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ SocketTimeoutException -> 0x0096, IOException -> 0x0082 }
            int r2 = HTTP_REQUEST_TIMEOUT     // Catch:{ SocketTimeoutException -> 0x0096, IOException -> 0x0082 }
            r1.setConnectTimeout(r2)     // Catch:{ SocketTimeoutException -> 0x0096, IOException -> 0x0082 }
            int r2 = HTTP_REQUEST_TIMEOUT     // Catch:{ SocketTimeoutException -> 0x0096, IOException -> 0x0082 }
            r1.setReadTimeout(r2)     // Catch:{ SocketTimeoutException -> 0x0096, IOException -> 0x0082 }
            r1.connect()     // Catch:{ SocketTimeoutException -> 0x0096, IOException -> 0x0082 }
            int r1 = r1.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0096, IOException -> 0x0082 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x0081
            android.media.MediaExtractor r1 = r7.mExtractor     // Catch:{ SocketTimeoutException -> 0x0096, IOException -> 0x0082 }
            r1.setDataSource(r8)     // Catch:{ SocketTimeoutException -> 0x0096, IOException -> 0x0082 }
            goto L_0x00af
        L_0x0081:
            return r0
        L_0x0082:
            java.lang.String r1 = r7.TAG     // Catch:{ Exception -> 0x011b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011b }
            java.lang.String r3 = "Connect IOException on URL : "
            r2.<init>(r3)     // Catch:{ Exception -> 0x011b }
            r2.append(r8)     // Catch:{ Exception -> 0x011b }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x011b }
            io.agora.rtc.internal.Logging.e(r1, r8)     // Catch:{ Exception -> 0x011b }
            return r0
        L_0x0096:
            java.lang.String r1 = r7.TAG     // Catch:{ Exception -> 0x011b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011b }
            java.lang.String r3 = "Connect timeout on URL : "
            r2.<init>(r3)     // Catch:{ Exception -> 0x011b }
            r2.append(r8)     // Catch:{ Exception -> 0x011b }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x011b }
            io.agora.rtc.internal.Logging.e(r1, r8)     // Catch:{ Exception -> 0x011b }
            return r0
        L_0x00aa:
            android.media.MediaExtractor r1 = r7.mExtractor     // Catch:{ Exception -> 0x011b }
            r1.setDataSource(r8)     // Catch:{ Exception -> 0x011b }
        L_0x00af:
            android.media.MediaExtractor r8 = r7.mExtractor     // Catch:{ Exception -> 0x011b }
            int r8 = r8.getTrackCount()     // Catch:{ Exception -> 0x011b }
            r1 = 0
        L_0x00b6:
            if (r1 >= r8) goto L_0x00c0
            android.media.MediaExtractor r2 = r7.mExtractor     // Catch:{ Exception -> 0x011b }
            r2.unselectTrack(r1)     // Catch:{ Exception -> 0x011b }
            int r1 = r1 + 1
            goto L_0x00b6
        L_0x00c0:
            r1 = 0
        L_0x00c1:
            if (r1 >= r8) goto L_0x00f2
            android.media.MediaExtractor r2 = r7.mExtractor     // Catch:{ Exception -> 0x011b }
            android.media.MediaFormat r2 = r2.getTrackFormat(r1)     // Catch:{ Exception -> 0x011b }
            r7.mTrackFormat = r2     // Catch:{ Exception -> 0x011b }
            android.media.MediaFormat r2 = r7.mTrackFormat     // Catch:{ Exception -> 0x011b }
            java.lang.String r3 = "mime"
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x011b }
            java.lang.String r3 = "audio/"
            boolean r3 = r2.contains(r3)     // Catch:{ Exception -> 0x011b }
            if (r3 == 0) goto L_0x00ef
            android.media.MediaExtractor r8 = r7.mExtractor     // Catch:{ Exception -> 0x011b }
            r8.selectTrack(r1)     // Catch:{ Exception -> 0x011b }
            android.media.MediaCodec r8 = android.media.MediaCodec.createDecoderByType(r2)     // Catch:{ Exception -> 0x011b }
            r7.mMediaCodec = r8     // Catch:{ Exception -> 0x011b }
            android.media.MediaCodec r8 = r7.mMediaCodec     // Catch:{ Exception -> 0x011b }
            android.media.MediaFormat r1 = r7.mTrackFormat     // Catch:{ Exception -> 0x011b }
            r2 = 0
            r8.configure(r1, r2, r2, r0)     // Catch:{ Exception -> 0x011b }
            goto L_0x00f2
        L_0x00ef:
            int r1 = r1 + 1
            goto L_0x00c1
        L_0x00f2:
            android.media.MediaCodec r8 = r7.mMediaCodec     // Catch:{ Exception -> 0x011b }
            if (r8 == 0) goto L_0x00fb
            android.media.MediaCodec r8 = r7.mMediaCodec     // Catch:{ Exception -> 0x011b }
            r8.start()     // Catch:{ Exception -> 0x011b }
        L_0x00fb:
            android.media.MediaFormat r8 = r7.mTrackFormat     // Catch:{ Exception -> 0x011b }
            java.lang.String r1 = "channel-count"
            int r8 = r8.getInteger(r1)     // Catch:{ Exception -> 0x011b }
            r7.mChannels = r8     // Catch:{ Exception -> 0x011b }
            android.media.MediaFormat r8 = r7.mTrackFormat     // Catch:{ Exception -> 0x011b }
            java.lang.String r1 = "sample-rate"
            int r8 = r8.getInteger(r1)     // Catch:{ Exception -> 0x011b }
            r7.mSampleRate = r8     // Catch:{ Exception -> 0x011b }
            android.media.MediaFormat r8 = r7.mTrackFormat     // Catch:{ Exception -> 0x011b }
            java.lang.String r1 = "durationUs"
            long r1 = r8.getLong(r1)     // Catch:{ Exception -> 0x011b }
            r7.mFileLength = r1     // Catch:{ Exception -> 0x011b }
            r8 = 1
            return r8
        L_0x011b:
            java.lang.String r8 = r7.TAG
            java.lang.String r1 = "Error when creating aac audio file decoder"
            io.agora.rtc.internal.Logging.e(r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.audio.MediaCodecAudioDecoder.createStreaming(java.lang.String):boolean");
    }

    private void cloneByteBufferByLength(ByteBuffer byteBuffer, int i) {
        try {
            if (this.mDecodedRAWBuffer == null || this.mDecodedRAWBuffer.capacity() < i) {
                if (this.mDecodedRAWBuffer != null) {
                    this.mDecodedRAWBuffer.clear();
                    this.mDecodedRAWBuffer = null;
                }
                this.mDecodedRAWBuffer = ByteBuffer.allocateDirect(i);
            }
            this.mDecodedRAWBuffer.position(0);
            byteBuffer.limit(i);
            this.mDecodedRAWBuffer.put(byteBuffer);
        } catch (Exception unused) {
        }
    }
}
