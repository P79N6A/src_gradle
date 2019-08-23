package com.ss.ttvideoengine.fetcher;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.net.TTHTTPNetwork;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.utils.Error;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class VideoInfoFetcher {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mApiString;
    public boolean mCancelled;
    private Handler mHandler = new MyHandler(this);
    public FetcherListener mListener;
    private TTVNetClient mNetworkSession;
    private int mRetryIndex;
    private int mType;
    public VideoModel mVideoModel;

    public interface FetcherListener {
        void onCompletion(VideoModel videoModel, Error error);

        void onLog(String str);

        void onRetry(Error error);

        void onStatusException(int i);
    }

    static class MyHandler extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<VideoInfoFetcher> mFetcherRef;

        public MyHandler(VideoInfoFetcher videoInfoFetcher) {
            this.mFetcherRef = new WeakReference<>(videoInfoFetcher);
        }

        public void handleMessage(Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, changeQuickRedirect, false, 91464, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, changeQuickRedirect, false, 91464, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            VideoInfoFetcher videoInfoFetcher = (VideoInfoFetcher) this.mFetcherRef.get();
            if (videoInfoFetcher != null) {
                FetcherListener fetcherListener = videoInfoFetcher.mListener;
                if (fetcherListener != null) {
                    if (videoInfoFetcher.mCancelled) {
                        fetcherListener.onLog("fetcher is cancelled");
                        return;
                    }
                    switch (message2.what) {
                        case 0:
                            fetcherListener.onRetry((Error) message2.obj);
                            return;
                        case 1:
                            fetcherListener.onCompletion(null, (Error) message2.obj);
                            return;
                        case 2:
                            VideoModel videoModel = (VideoModel) message2.obj;
                            videoInfoFetcher.mVideoModel = videoModel;
                            fetcherListener.onCompletion(videoModel, null);
                            return;
                        case 3:
                            fetcherListener.onStatusException(message2.arg1);
                            break;
                    }
                }
            }
        }
    }

    private void _fetchInfoInternal() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91456, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91456, new Class[0], Void.TYPE);
            return;
        }
        this.mNetworkSession.startTask(this.mApiString, new TTVNetClient.CompletionListener() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void onCompletion(JSONObject jSONObject, Error error) {
                if (PatchProxy.isSupport(new Object[]{jSONObject, error}, this, changeQuickRedirect, false, 91463, new Class[]{JSONObject.class, Error.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{jSONObject, error}, this, changeQuickRedirect, false, 91463, new Class[]{JSONObject.class, Error.class}, Void.TYPE);
                } else if (jSONObject == null || error != null) {
                    VideoInfoFetcher.this._retryIfNeeded(error);
                } else {
                    VideoInfoFetcher.this._getInfoSuccess(jSONObject);
                }
            }
        });
    }

    public void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91455, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91455, new Class[0], Void.TYPE);
            return;
        }
        synchronized (this) {
            this.mHandler.removeCallbacksAndMessages(null);
            if (this.mListener != null) {
                this.mListener.onLog("fetcher cancelled");
                if (!this.mCancelled) {
                    this.mCancelled = true;
                    this.mNetworkSession.cancel();
                }
            }
        }
    }

    public void setListener(FetcherListener fetcherListener) {
        this.mListener = fetcherListener;
    }

    public void setPlayType(int i) {
        this.mType = i;
    }

    public VideoInfoFetcher(TTVNetClient tTVNetClient) {
        if (tTVNetClient == null) {
            this.mNetworkSession = new TTHTTPNetwork();
        } else {
            this.mNetworkSession = tTVNetClient;
        }
    }

    private void _notifyError(Error error) {
        if (PatchProxy.isSupport(new Object[]{error}, this, changeQuickRedirect, false, 91460, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error}, this, changeQuickRedirect, false, 91460, new Class[]{Error.class}, Void.TYPE);
            return;
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, error));
    }

    private void _notifyShouldRetry(Error error) {
        if (PatchProxy.isSupport(new Object[]{error}, this, changeQuickRedirect, false, 91459, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error}, this, changeQuickRedirect, false, 91459, new Class[]{Error.class}, Void.TYPE);
            return;
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(0, error));
    }

    private void _notifySuccess(VideoModel videoModel) {
        if (PatchProxy.isSupport(new Object[]{videoModel}, this, changeQuickRedirect, false, 91461, new Class[]{VideoModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoModel}, this, changeQuickRedirect, false, 91461, new Class[]{VideoModel.class}, Void.TYPE);
            return;
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, videoModel));
    }

    public void fetchInfo(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91454, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91454, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.mApiString = str;
        this.mRetryIndex = 0;
        _fetchInfoInternal();
    }

    private void _notifyException(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91462, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91462, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, i, 0));
    }

    public void _getInfoSuccess(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 91457, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 91457, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            if (!this.mCancelled) {
                VideoModel videoModel = new VideoModel();
                videoModel.extractFields(jSONObject);
                if (jSONObject.optInt("code") == 0) {
                    _notifySuccess(videoModel);
                } else if (videoModel.videoRef == null || videoModel.videoRef.mStatus == 10 || this.mType != 0) {
                    _notifyError(new Error("kTTVideoErrorDomainFetchingInfo", -9998, jSONObject.toString()));
                } else {
                    _notifyException(videoModel.videoRef.mStatus);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _retryIfNeeded(com.ss.ttvideoengine.utils.Error r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<com.ss.ttvideoengine.utils.Error> r2 = com.ss.ttvideoengine.utils.Error.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 91458(0x16542, float:1.2816E-40)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 91458(0x16542, float:1.2816E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<com.ss.ttvideoengine.utils.Error> r0 = com.ss.ttvideoengine.utils.Error.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0032:
            monitor-enter(r10)
            boolean r1 = r10.mCancelled     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0039
            monitor-exit(r10)     // Catch:{ all -> 0x0063 }
            return
        L_0x0039:
            r1 = -9994(0xffffffffffffd8f6, float:NaN)
            if (r11 == 0) goto L_0x0047
            com.ss.ttvideoengine.utils.Error r2 = new com.ss.ttvideoengine.utils.Error     // Catch:{ all -> 0x0063 }
            java.lang.String r3 = "kTTVideoErrorDomainFetchingInfo"
            java.lang.String r0 = r11.description     // Catch:{ all -> 0x0063 }
            r2.<init>((java.lang.String) r3, (int) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0063 }
            goto L_0x004e
        L_0x0047:
            com.ss.ttvideoengine.utils.Error r2 = new com.ss.ttvideoengine.utils.Error     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "kTTVideoErrorDomainFetchingInfo"
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0063 }
        L_0x004e:
            int r0 = r10.mRetryIndex     // Catch:{ all -> 0x0063 }
            if (r0 > 0) goto L_0x005e
            r10._notifyShouldRetry(r2)     // Catch:{ all -> 0x0063 }
            int r0 = r10.mRetryIndex     // Catch:{ all -> 0x0063 }
            int r0 = r0 + r8
            r10.mRetryIndex = r0     // Catch:{ all -> 0x0063 }
            r10._fetchInfoInternal()     // Catch:{ all -> 0x0063 }
            goto L_0x0061
        L_0x005e:
            r10._notifyError(r2)     // Catch:{ all -> 0x0063 }
        L_0x0061:
            monitor-exit(r10)     // Catch:{ all -> 0x0063 }
            return
        L_0x0063:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0063 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.fetcher.VideoInfoFetcher._retryIfNeeded(com.ss.ttvideoengine.utils.Error):void");
    }
}
