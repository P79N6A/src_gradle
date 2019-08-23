package com.ss.avframework.engine;

import com.ss.avframework.statics.StaticsReport;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;
import com.ss.avframework.utils.TEBundle;
import java.util.ArrayList;
import java.util.Iterator;

@JNINamespace("jni")
public class MediaEncodeStream extends MediaEditorStream implements StaticsReport.StaticReportInterface {
    private InternalObserver mInternalObserver = new InternalObserver();
    private long mNativeObj;
    private ArrayList<MediaTrack> mTracks = new ArrayList<>();
    private Transport mTransport;
    private VideoEncoderFactory mVideoEncoderFactory;
    private VsyncModule mVsyncModule;

    class InternalObserver extends NativeObject implements Observer {
        private Observer mObserver;

        @CalledByNative
        public void onChanged() {
        }

        public void registerObserver(Observer observer) {
            this.mObserver = observer;
        }

        public InternalObserver() {
        }

        @CalledByNative("InternalObserver")
        public void onMediaEncodeStreamEvent(int i, int i2, long j, String str) {
            if (this.mObserver != null) {
                this.mObserver.onMediaEncodeStreamEvent(i, i2, j, str);
            }
        }
    }

    public interface Observer {
        void onMediaEncodeStreamEvent(int i, int i2, long j, String str);
    }

    private native void nativeAddTrack(long j, MediaTrack mediaTrack);

    private native TEBundle nativeGetParameter(long j);

    private native boolean nativeGetStaticsReport(long j, StaticsReport staticsReport);

    private native long nativeGetVsyncModule(long j);

    private native void nativeRegisterObserver(long j, Object obj);

    private native void nativeRelease(long j);

    private native void nativeRemoveTrack(long j, MediaTrack mediaTrack);

    private native void nativeSetEstimateTimeInterval(long j, int i);

    private native void nativeSetParameter(long j, TEBundle tEBundle);

    private native void nativeStart(long j);

    private native void nativeStartRecord(long j, String str);

    private native void nativeStop(long j);

    private native void nativeStopRecord(long j);

    private static native long nativeToEditorStream(long j);

    public TEBundle getParameter() {
        return nativeGetParameter(this.mNativeObj);
    }

    public void start() {
        nativeStart(this.mNativeObj);
    }

    public void stop() {
        nativeStop(this.mNativeObj);
    }

    public void stopRecord() {
        nativeStopRecord(this.mNativeObj);
    }

    public VsyncModule getVsyncModule() {
        if (this.mVsyncModule == null) {
            this.mVsyncModule = new VsyncModule(nativeGetVsyncModule(this.mNativeObj));
        }
        return this.mVsyncModule;
    }

    public synchronized void release() {
        if (this.mNativeObj != 0) {
            stop();
            Iterator<MediaTrack> it2 = this.mTracks.iterator();
            while (it2.hasNext()) {
                MediaTrack next = it2.next();
                nativeRemoveTrack(this.mNativeObj, next);
                next.release();
                it2.remove();
            }
            if (this.mVideoEncoderFactory != null) {
                this.mVideoEncoderFactory.release();
                this.mVideoEncoderFactory = null;
            }
            if (this.mTransport != null) {
                this.mTransport = null;
            }
            if (this.mVsyncModule != null) {
                this.mVsyncModule.release();
                this.mVsyncModule = null;
            }
            nativeRelease(this.mNativeObj);
            this.mNativeObj = 0;
            this.mInternalObserver.release();
            this.mInternalObserver = null;
        }
    }

    public boolean getStaticsReport(StaticsReport staticsReport) {
        return nativeGetStaticsReport(this.mNativeObj, staticsReport);
    }

    public void registerObserver(Observer observer) {
        this.mInternalObserver.registerObserver(observer);
    }

    public void setEstimateTimeInterval(int i) {
        nativeSetEstimateTimeInterval(this.mNativeObj, i);
    }

    public void setParameter(TEBundle tEBundle) {
        nativeSetParameter(this.mNativeObj, tEBundle);
    }

    public void startRecord(String str) {
        nativeStartRecord(this.mNativeObj, str);
    }

    public void addTrack(MediaTrack mediaTrack) {
        nativeAddTrack(this.mNativeObj, mediaTrack);
        this.mTracks.add(mediaTrack);
    }

    public void removeTrack(MediaTrack mediaTrack) {
        if (this.mTracks.remove(mediaTrack)) {
            nativeRemoveTrack(this.mNativeObj, mediaTrack);
        }
    }

    public MediaEncodeStream(long j, Transport transport, VideoEncoderFactory videoEncoderFactory) {
        super(nativeToEditorStream(j));
        this.mNativeObj = j;
        this.mTransport = transport;
        this.mVideoEncoderFactory = videoEncoderFactory;
        nativeRegisterObserver(this.mNativeObj, this.mInternalObserver);
    }
}
