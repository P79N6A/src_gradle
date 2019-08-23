package io.agora.rtc.audio;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import io.agora.rtc.internal.Logging;
import java.io.BufferedOutputStream;
import java.io.File;
import java.nio.ByteBuffer;

public class MediaCodecAudioEncoder {
    private String TAG = "MediaCodec Audio Encoder";
    private ByteBuffer mAACEncodedBuffer = ByteBuffer.allocateDirect(1024);
    private MediaCodec mAACEncoder;
    private MediaFormat mAACFormat;
    private ByteBuffer[] mAACInputBuffers;
    private ByteBuffer[] mAACOutputBuffers;
    private String mCodecString;
    private ByteBuffer[] mInputBuffers;
    private MediaCodec mMediaCodec;
    private ByteBuffer[] mOutputBuffers;
    private MediaFormat mTrackFormat;
    private File outputFile;
    private BufferedOutputStream outputStream;

    public int getAndroidVersion() {
        return Build.VERSION.SDK_INT;
    }

    public void releaseAACStreaming() {
        try {
            if (this.mAACEncoder != null) {
                this.mAACEncoder.stop();
                this.mAACEncoder.release();
                this.mAACEncoder = null;
            }
        } catch (Exception unused) {
            Logging.e(this.TAG, "Error when releasing aac encode stream");
        }
    }

    public void releaseStreaming() {
        try {
            if (this.mMediaCodec != null) {
                this.mMediaCodec.stop();
                this.mMediaCodec.release();
                this.mMediaCodec = null;
            }
            if (this.outputStream != null) {
                this.outputStream.flush();
                this.outputStream.close();
                this.outputStream = null;
            }
        } catch (Exception unused) {
            Logging.e(this.TAG, "Error when releasing aac file encoder");
        }
    }

    private void touch(File file) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception unused) {
        }
    }

    public void setChannelCount(int i) {
        try {
            this.mTrackFormat.setInteger("channel-count", i);
        } catch (Exception unused) {
            Logging.e(this.TAG, "Error when setting aac file encoder channel count");
        }
    }

    public void setSampleRate(int i) {
        try {
            this.mTrackFormat.setInteger("sample-rate", i);
        } catch (Exception unused) {
            Logging.e(this.TAG, "Error when setting aac file encoder sample rate");
        }
    }

    public boolean setAACEncodeBitrate(int i) {
        String str = this.TAG;
        Logging.w(str, "Set hw aac bitrate = " + i);
        try {
            if (this.mAACEncoder != null) {
                this.mAACEncoder.stop();
                this.mAACFormat.setInteger("bitrate", i);
                this.mAACEncoder.configure(this.mAACFormat, null, null, 1);
                this.mAACEncoder.start();
            }
            return true;
        } catch (Exception unused) {
            Logging.e(this.TAG, "Error when setting aac encode bitrate");
            return false;
        }
    }

    public int encodeAACFrame(byte[] bArr) {
        ByteBuffer byteBuffer;
        int i;
        ByteBuffer byteBuffer2;
        int i2 = 0;
        try {
            int dequeueInputBuffer = this.mAACEncoder.dequeueInputBuffer(2000);
            if (dequeueInputBuffer != -1) {
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer2 = this.mAACEncoder.getInputBuffer(dequeueInputBuffer);
                } else {
                    this.mAACInputBuffers = this.mAACEncoder.getInputBuffers();
                    byteBuffer2 = this.mAACInputBuffers[dequeueInputBuffer];
                }
                byteBuffer2.clear();
                byteBuffer2.put(bArr);
                this.mAACEncoder.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, 0, 0);
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mAACEncoder.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer < 0) {
                return 0;
            }
            int i3 = bufferInfo.size;
            if (Build.VERSION.SDK_INT >= 21) {
                byteBuffer = this.mAACEncoder.getOutputBuffer(dequeueOutputBuffer);
            } else {
                this.mAACOutputBuffers = this.mAACEncoder.getOutputBuffers();
                byteBuffer = this.mAACOutputBuffers[dequeueOutputBuffer];
            }
            if ((bufferInfo.flags & 2) == 2) {
                i = 0;
            } else {
                i = bufferInfo.size;
            }
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + i3);
                this.mAACEncodedBuffer.position(0);
                this.mAACEncodedBuffer.put(byteBuffer);
                this.mAACEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                return i;
            } catch (Exception unused) {
                i2 = i;
                Logging.e(this.TAG, "Error when encoding aac stream");
                return i2;
            }
        } catch (Exception unused2) {
            Logging.e(this.TAG, "Error when encoding aac stream");
            return i2;
        }
    }

    public void encodeFrame(byte[] bArr) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        try {
            int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(2000);
            if (dequeueInputBuffer != -1) {
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer2 = this.mMediaCodec.getInputBuffer(dequeueInputBuffer);
                } else {
                    this.mInputBuffers = this.mMediaCodec.getInputBuffers();
                    byteBuffer2 = this.mInputBuffers[dequeueInputBuffer];
                }
                byteBuffer2.clear();
                byteBuffer2.put(bArr);
                this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, 0, 0);
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            while (dequeueOutputBuffer >= 0) {
                int i = bufferInfo.size;
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer = this.mMediaCodec.getOutputBuffer(dequeueOutputBuffer);
                } else {
                    this.mOutputBuffers = this.mMediaCodec.getOutputBuffers();
                    byteBuffer = this.mOutputBuffers[dequeueOutputBuffer];
                }
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + i);
                if (this.mCodecString == "audio/mp4a-latm") {
                    int i2 = i + 7;
                    byte[] bArr2 = new byte[i2];
                    addADTStoPacket(bArr2, i2);
                    byteBuffer.get(bArr2, 7, i);
                    byteBuffer.position(bufferInfo.offset);
                    this.outputStream.write(bArr2, 0, bArr2.length);
                } else if (this.mCodecString == "audio/3gpp" || this.mCodecString == "audio/amr-wb") {
                    byte[] bArr3 = new byte[i];
                    byteBuffer.get(bArr3, 0, i);
                    byteBuffer.position(bufferInfo.offset);
                    this.outputStream.write(bArr3, 0, bArr3.length);
                }
                this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            }
        } catch (Exception unused) {
            Logging.e(this.TAG, "Error when encoding aac file");
        }
    }

    private void addADTStoPacket(byte[] bArr, int i) {
        bArr[0] = -1;
        bArr[1] = -7;
        bArr[2] = 84;
        bArr[3] = (byte) ((i >> 11) + 64);
        bArr[4] = (byte) ((i & 2047) >> 3);
        bArr[5] = (byte) (((i & 7) << 5) + 31);
        bArr[6] = -4;
    }

    public boolean createAACStreaming(int i, int i2, int i3) {
        try {
            String str = this.TAG;
            Logging.i(str, "Encoding aac with fs = " + i + ", bitrate = " + i3);
            this.mAACEncoder = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.mAACFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
            this.mAACFormat.setInteger("aac-profile", 2);
            this.mAACFormat.setInteger("sample-rate", i);
            this.mAACFormat.setInteger("channel-count", i2);
            this.mAACFormat.setInteger("bitrate", i3);
            this.mAACEncoder.configure(this.mAACFormat, null, null, 1);
            if (this.mAACEncoder != null) {
                this.mAACEncoder.start();
            }
            return true;
        } catch (Exception unused) {
            Logging.e(this.TAG, "Error when creating aac encode stream");
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:1|2|(2:4|(1:6)(2:7|(11:9|12|19|(1:21)|22|23|24|25|26|(1:28)(2:29|(1:31))|32)(1:13)))|14|(1:16)(1:(1:18))|19|(0)|22|23|24|25|26|(0)(0)|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00f9 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d3 A[Catch:{ Exception -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ff A[Catch:{ Exception -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010b A[Catch:{ Exception -> 0x011e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean createStreaming(java.lang.String r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = r4.TAG     // Catch:{ Exception -> 0x011e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e }
            java.lang.String r3 = "Recording aac with fs = "
            r2.<init>(r3)     // Catch:{ Exception -> 0x011e }
            r2.append(r6)     // Catch:{ Exception -> 0x011e }
            java.lang.String r3 = ", ch = "
            r2.append(r3)     // Catch:{ Exception -> 0x011e }
            r2.append(r7)     // Catch:{ Exception -> 0x011e }
            java.lang.String r3 = ", quality = "
            r2.append(r3)     // Catch:{ Exception -> 0x011e }
            r2.append(r8)     // Catch:{ Exception -> 0x011e }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x011e }
            io.agora.rtc.internal.Logging.i(r1, r2)     // Catch:{ Exception -> 0x011e }
            int r1 = r5.length()     // Catch:{ Exception -> 0x011e }
            int r1 = r1 + -3
            java.lang.String r1 = r5.substring(r1)     // Catch:{ Exception -> 0x011e }
            java.lang.String r2 = "3gp"
            boolean r2 = r1.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x011e }
            r3 = 16000(0x3e80, float:2.2421E-41)
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = "amr"
            boolean r2 = r1.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x011e }
            if (r2 == 0) goto L_0x0041
            goto L_0x0085
        L_0x0041:
            java.lang.String r2 = "aac"
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch:{ Exception -> 0x011e }
            if (r1 == 0) goto L_0x0084
            switch(r8) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0050;
                default: goto L_0x004c;
            }     // Catch:{ Exception -> 0x011e }
        L_0x004c:
            r3 = 50000(0xc350, float:7.0065E-41)
            goto L_0x0052
        L_0x0050:
            r3 = 25000(0x61a8, float:3.5032E-41)
        L_0x0052:
            java.lang.String r8 = "audio/mp4a-latm"
            android.media.MediaCodec r8 = android.media.MediaCodec.createEncoderByType(r8)     // Catch:{ Exception -> 0x011e }
            r4.mMediaCodec = r8     // Catch:{ Exception -> 0x011e }
            java.lang.String r8 = "audio/mp4a-latm"
            android.media.MediaFormat r8 = android.media.MediaFormat.createAudioFormat(r8, r6, r7)     // Catch:{ Exception -> 0x011e }
            r4.mTrackFormat = r8     // Catch:{ Exception -> 0x011e }
            android.media.MediaFormat r8 = r4.mTrackFormat     // Catch:{ Exception -> 0x011e }
            java.lang.String r1 = "aac-profile"
            r2 = 2
            r8.setInteger(r1, r2)     // Catch:{ Exception -> 0x011e }
            android.media.MediaFormat r8 = r4.mTrackFormat     // Catch:{ Exception -> 0x011e }
            java.lang.String r1 = "sample-rate"
            r8.setInteger(r1, r6)     // Catch:{ Exception -> 0x011e }
            android.media.MediaFormat r6 = r4.mTrackFormat     // Catch:{ Exception -> 0x011e }
            java.lang.String r8 = "channel-count"
            r6.setInteger(r8, r7)     // Catch:{ Exception -> 0x011e }
            android.media.MediaFormat r6 = r4.mTrackFormat     // Catch:{ Exception -> 0x011e }
            java.lang.String r7 = "bitrate"
            r6.setInteger(r7, r3)     // Catch:{ Exception -> 0x011e }
            java.lang.String r6 = "audio/mp4a-latm"
            r4.mCodecString = r6     // Catch:{ Exception -> 0x011e }
            goto L_0x00c6
        L_0x0084:
            return r0
        L_0x0085:
            r8 = 8000(0x1f40, float:1.121E-41)
            if (r6 != r8) goto L_0x00a7
            java.lang.String r8 = "audio/3gpp"
            android.media.MediaCodec r8 = android.media.MediaCodec.createEncoderByType(r8)     // Catch:{ Exception -> 0x011e }
            r4.mMediaCodec = r8     // Catch:{ Exception -> 0x011e }
            java.lang.String r8 = "audio/3gpp"
            android.media.MediaFormat r6 = android.media.MediaFormat.createAudioFormat(r8, r6, r7)     // Catch:{ Exception -> 0x011e }
            r4.mTrackFormat = r6     // Catch:{ Exception -> 0x011e }
            android.media.MediaFormat r6 = r4.mTrackFormat     // Catch:{ Exception -> 0x011e }
            java.lang.String r7 = "bitrate"
            r8 = 12200(0x2fa8, float:1.7096E-41)
            r6.setInteger(r7, r8)     // Catch:{ Exception -> 0x011e }
            java.lang.String r6 = "audio/3gpp"
            r4.mCodecString = r6     // Catch:{ Exception -> 0x011e }
            goto L_0x00c6
        L_0x00a7:
            if (r6 != r3) goto L_0x00c6
            java.lang.String r8 = "audio/amr-wb"
            android.media.MediaCodec r8 = android.media.MediaCodec.createEncoderByType(r8)     // Catch:{ Exception -> 0x011e }
            r4.mMediaCodec = r8     // Catch:{ Exception -> 0x011e }
            java.lang.String r8 = "audio/amr-wb"
            android.media.MediaFormat r6 = android.media.MediaFormat.createAudioFormat(r8, r6, r7)     // Catch:{ Exception -> 0x011e }
            r4.mTrackFormat = r6     // Catch:{ Exception -> 0x011e }
            android.media.MediaFormat r6 = r4.mTrackFormat     // Catch:{ Exception -> 0x011e }
            java.lang.String r7 = "bitrate"
            r8 = 23850(0x5d2a, float:3.3421E-41)
            r6.setInteger(r7, r8)     // Catch:{ Exception -> 0x011e }
            java.lang.String r6 = "audio/amr-wb"
            r4.mCodecString = r6     // Catch:{ Exception -> 0x011e }
        L_0x00c6:
            android.media.MediaCodec r6 = r4.mMediaCodec     // Catch:{ Exception -> 0x011e }
            android.media.MediaFormat r7 = r4.mTrackFormat     // Catch:{ Exception -> 0x011e }
            r8 = 1
            r1 = 0
            r6.configure(r7, r1, r1, r8)     // Catch:{ Exception -> 0x011e }
            android.media.MediaCodec r6 = r4.mMediaCodec     // Catch:{ Exception -> 0x011e }
            if (r6 == 0) goto L_0x00d8
            android.media.MediaCodec r6 = r4.mMediaCodec     // Catch:{ Exception -> 0x011e }
            r6.start()     // Catch:{ Exception -> 0x011e }
        L_0x00d8:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x011e }
            r6.<init>(r5)     // Catch:{ Exception -> 0x011e }
            r4.outputFile = r6     // Catch:{ Exception -> 0x011e }
            java.io.File r5 = r4.outputFile     // Catch:{ Exception -> 0x011e }
            r4.touch(r5)     // Catch:{ Exception -> 0x011e }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00f9 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00f9 }
            java.io.File r7 = r4.outputFile     // Catch:{ Exception -> 0x00f9 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00f9 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00f9 }
            r4.outputStream = r5     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r5 = r4.TAG     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r6 = "outputStream initialized"
            io.agora.rtc.internal.Logging.i(r5, r6)     // Catch:{ Exception -> 0x00f9 }
        L_0x00f9:
            java.lang.String r5 = r4.mCodecString     // Catch:{ Exception -> 0x011e }
            java.lang.String r6 = "audio/3gpp"
            if (r5 != r6) goto L_0x010b
            r5 = 6
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x011e }
            r5 = {35, 33, 65, 77, 82, 10} // fill-array     // Catch:{ Exception -> 0x011e }
            java.io.BufferedOutputStream r6 = r4.outputStream     // Catch:{ Exception -> 0x011e }
            r6.write(r5)     // Catch:{ Exception -> 0x011e }
            goto L_0x011d
        L_0x010b:
            java.lang.String r5 = r4.mCodecString     // Catch:{ Exception -> 0x011e }
            java.lang.String r6 = "audio/amr-wb"
            if (r5 != r6) goto L_0x011d
            r5 = 9
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x011e }
            r5 = {35, 33, 65, 77, 82, 45, 87, 66, 10} // fill-array     // Catch:{ Exception -> 0x011e }
            java.io.BufferedOutputStream r6 = r4.outputStream     // Catch:{ Exception -> 0x011e }
            r6.write(r5)     // Catch:{ Exception -> 0x011e }
        L_0x011d:
            return r8
        L_0x011e:
            java.lang.String r5 = r4.TAG
            java.lang.String r6 = "Error when creating aac file encoder"
            io.agora.rtc.internal.Logging.e(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.audio.MediaCodecAudioEncoder.createStreaming(java.lang.String, int, int, int):boolean");
    }
}
