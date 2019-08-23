package com.ss.avframework.engine;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;
import com.ss.avframework.utils.JniCommon;

@JNINamespace("jni")
public class MediaEngineFactory {
    private long mNativeObj;

    @CalledByNative
    public static String getVersion() {
        return "4.9.0.11";
    }

    private native long nativeCreateAudioTrack(long j, AudioSource audioSource, String str);

    private native long nativeCreateMediaEncodeStream(long j, VideoEncoderFactory videoEncoderFactory, Transport transport);

    private native long nativeCreateVideoTrack(long j, VideoSource videoSource, String str);

    private static native long nativeGetMediaEngineFactory();

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
    }

    static {
        loadLibrary("ttffmpeg");
        loadLibrary("effect");
        loadLibrary("audioeffect");
        loadLibrary("yuv");
        loadLibrary("fdk-aac");
        loadLibrary("avframework");
    }

    public static MediaEngineFactory create() {
        long nativeGetMediaEngineFactory = nativeGetMediaEngineFactory();
        if (nativeGetMediaEngineFactory != 0) {
            return new MediaEngineFactory(nativeGetMediaEngineFactory);
        }
        return null;
    }

    public synchronized void release() {
        if (this.mNativeObj != 0) {
            JniCommon.nativeReleaseRef(this.mNativeObj);
            this.mNativeObj = 0;
        }
    }

    public static void setLogLevel(int i) {
        AVLog.setLevel(i);
    }

    protected MediaEngineFactory(long j) {
        this.mNativeObj = j;
    }

    private static boolean loadLibrary(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public AudioTrack createAudioTrack(AudioSource audioSource) {
        return createAudioTrack(audioSource, null);
    }

    public VideoTrack createVideoTrack(VideoSource videoSource) {
        return createVideoTrack(videoSource, null);
    }

    public AudioTrack createAudioTrack(AudioSource audioSource, String str) {
        long nativeCreateAudioTrack = nativeCreateAudioTrack(this.mNativeObj, audioSource, str);
        if (nativeCreateAudioTrack != 0) {
            return new AudioTrack(nativeCreateAudioTrack, audioSource);
        }
        return null;
    }

    public MediaEncodeStream createMediaEncodeStream(@Nullable VideoEncoderFactory videoEncoderFactory, @NonNull Transport transport) {
        long nativeCreateMediaEncodeStream = nativeCreateMediaEncodeStream(this.mNativeObj, videoEncoderFactory, transport);
        if (nativeCreateMediaEncodeStream != 0) {
            return new MediaEncodeStream(nativeCreateMediaEncodeStream, transport, videoEncoderFactory);
        }
        return null;
    }

    public VideoTrack createVideoTrack(VideoSource videoSource, String str) {
        long nativeCreateVideoTrack = nativeCreateVideoTrack(this.mNativeObj, videoSource, str);
        if (nativeCreateVideoTrack != 0) {
            return new VideoTrack(nativeCreateVideoTrack, videoSource);
        }
        return null;
    }
}
