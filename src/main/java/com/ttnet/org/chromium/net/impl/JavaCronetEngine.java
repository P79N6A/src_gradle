package com.ttnet.org.chromium.net.impl;

import android.os.Process;
import com.bytedance.common.utility.concurrent.SimpleThreadFactory;
import com.ss.android.downloadlib.c.a.b;
import com.ss.android.socialbase.downloader.d.a;
import com.ss.android.ugc.aweme.thread.h;
import com.ttnet.org.chromium.net.BidirectionalStream;
import com.ttnet.org.chromium.net.ExperimentalBidirectionalStream;
import com.ttnet.org.chromium.net.NetworkQualityRttListener;
import com.ttnet.org.chromium.net.NetworkQualityThroughputListener;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.TTEventListener;
import com.ttnet.org.chromium.net.TTMonitorProvider;
import com.ttnet.org.chromium.net.TTWebsocketConnection;
import com.ttnet.org.chromium.net.UrlRequest;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class JavaCronetEngine extends CronetEngineBase {
    private final ExecutorService mExecutorService = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newCachedThreadPool(new ThreadFactory() {
        public Thread newThread(final Runnable runnable) {
            return Executors.defaultThreadFactory().newThread(new Runnable() {
                public void run() {
                    Thread.currentThread().setName("JavaCronetEngine");
                    Process.setThreadPriority(9);
                    runnable.run();
                }
            });
        }
    });
    private final String mUserAgent;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newCachedThreadPool(ThreadFactory threadFactory) {
            return ((threadFactory instanceof SimpleThreadFactory) || (threadFactory instanceof b) || (threadFactory instanceof a)) ? h.c() : Executors.newCachedThreadPool(threadFactory);
        }
    }

    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    public final TTWebsocketConnection createWebsocketConnection(TTWebsocketConnection.Callback callback, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z) {
        return null;
    }

    public final TTWebsocketConnection createWebsocketConnection(TTWebsocketConnection.Callback callback, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        return null;
    }

    public final String getCertVerifierData(long j) {
        return "";
    }

    public final int getDownstreamThroughputKbps() {
        return -1;
    }

    public final int getEffectiveConnectionType() {
        return 0;
    }

    public final byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    public final int getHttpRttMs() {
        return -1;
    }

    public final int getTransportRttMs() {
        return -1;
    }

    public final void registerAppInfoProvider(TTAppInfoProvider tTAppInfoProvider) {
    }

    public final void registerAppMonitorProvider(TTMonitorProvider tTMonitorProvider) {
    }

    public final void registerEventListener(TTEventListener tTEventListener) {
    }

    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public final void startNetLogToDisk(String str, boolean z, int i) {
    }

    public final void startNetLogToFile(String str, boolean z) {
    }

    public final void stopNetLog() {
    }

    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new URLStreamHandlerFactory() {
            public URLStreamHandler createURLStreamHandler(String str) {
                return null;
            }
        };
    }

    public final void shutdown() {
        this.mExecutorService.shutdown();
    }

    public final String getVersionString() {
        return "CronetHttpURLConnection/" + ImplVersion.getVersion();
    }

    public final URLConnection openConnection(URL url) throws IOException {
        return url.openConnection();
    }

    public JavaCronetEngine(String str) {
        this.mUserAgent = str;
    }

    public final URLConnection openConnection(URL url, java.net.Proxy proxy) throws IOException {
        return url.openConnection(proxy);
    }

    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }

    /* access modifiers changed from: protected */
    public final ExperimentalBidirectionalStream createBidirectionalStream(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List<Map.Entry<String, String>> list, int i, boolean z, Collection<Object> collection) {
        throw new UnsupportedOperationException("Can't create a bidi stream - httpurlconnection doesn't have those APIs");
    }

    public final UrlRequestBase createRequest(String str, UrlRequest.Callback callback, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2, boolean z3) {
        JavaUrlRequest javaUrlRequest = new JavaUrlRequest(callback, this.mExecutorService, executor, str, this.mUserAgent, z3);
        return javaUrlRequest;
    }
}
