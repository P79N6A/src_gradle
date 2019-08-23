package com.ttnet.org.chromium.net.urlconnection;

import android.text.TextUtils;
import android.util.Pair;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.Logger;
import com.ttnet.org.chromium.base.Reflect;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.CronetException;
import com.ttnet.org.chromium.net.NetworkException;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.UrlRequest;
import com.ttnet.org.chromium.net.UrlResponseInfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.conn.ConnectTimeoutException;

public class CronetHttpURLConnection extends HttpURLConnection {
    public CookieHandler mCookieHandler = CookieHandler.getDefault();
    private final CronetEngine mCronetEngine;
    public IOException mException;
    public boolean mHasResponse;
    public CronetInputStream mInputStream = new CronetInputStream(this);
    private int mInputStreamBufferSize;
    public final MessageLoop mMessageLoop = new MessageLoop();
    public boolean mOnRedirectCalled;
    public CronetOutputStream mOutputStream;
    public UrlRequest mRequest;
    public RequestFinishedInfo mRequestFinishedInfo;
    private int mRequestFlag = 0;
    private final List<Pair<String, String>> mRequestHeaders = new ArrayList();
    public String mRequestLog;
    private int mRequestTimeout;
    private List<Map.Entry<String, String>> mResponseHeadersList;
    private Map<String, List<String>> mResponseHeadersMap;
    public UrlResponseInfo mResponseInfo;
    private int mSocketConnectTimeout;
    private int mSocketReadTimeout;
    private int mSocketWriteTimeout;

    class CronetUrlRequestCallback extends UrlRequest.Callback {
        private void setRequestEnd() {
            CronetHttpURLConnection.this.mRequestLog = CronetHttpURLConnection.this.mRequest.getRequestLog();
            try {
                if (CronetHttpURLConnection.this.mResponseInfo != null) {
                    Map<String, List<String>> allHeaders = CronetHttpURLConnection.this.getAllHeaders();
                    if (CronetHttpURLConnection.this.mCookieHandler == null) {
                        CronetHttpURLConnection.this.mCookieHandler = CookieHandler.getDefault();
                    }
                    if (CronetHttpURLConnection.this.mCookieHandler != null) {
                        CronetHttpURLConnection.this.mCookieHandler.put(CronetHttpURLConnection.this.uri(CronetHttpURLConnection.this.getURL()), allHeaders);
                    }
                }
            } catch (Exception e2) {
                if (Logger.debug()) {
                    Logger.d("CronetHttpURLConnection", "Saving cookies failed for " + CronetHttpURLConnection.this.getURL().toString() + " e = " + e2.getMessage());
                }
            }
            try {
                if (CronetHttpURLConnection.this.mException != null) {
                    String str = null;
                    if (!(CronetHttpURLConnection.this.mRequestFinishedInfo == null || CronetHttpURLConnection.this.mRequestFinishedInfo.getMetrics() == null || CronetHttpURLConnection.this.mRequestFinishedInfo.getMetrics().getPeerAddr() == null)) {
                        str = CronetHttpURLConnection.this.mRequestFinishedInfo.getMetrics().getPeerAddr() + ":" + CronetHttpURLConnection.this.mRequestFinishedInfo.getMetrics().getPeerPort();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        String message = CronetHttpURLConnection.this.mException.getMessage();
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("|");
                        if (message == null) {
                            message = "null";
                        }
                        sb.append(message);
                        Reflect.on((Object) CronetHttpURLConnection.this.mException).set("detailMessage", sb.toString());
                    }
                }
            } catch (Throwable unused) {
            }
            CronetHttpURLConnection.this.mHasResponse = true;
            CronetHttpURLConnection.this.mMessageLoop.quit();
        }

        public CronetUrlRequestCallback() {
        }

        private void setResponseDataCompleted(IOException iOException, boolean z) {
            if (CronetHttpURLConnection.this.mInputStream != null) {
                CronetHttpURLConnection.this.mInputStream.setResponseDataCompleted(iOException);
            }
            if (CronetHttpURLConnection.this.mOutputStream != null) {
                CronetHttpURLConnection.this.mOutputStream.setRequestCompleted(iOException);
            }
            CronetHttpURLConnection.this.mHasResponse = true;
            if (!z) {
                setRequestEnd();
            }
        }

        public void onMetricsCollected(UrlRequest urlRequest, RequestFinishedInfo requestFinishedInfo) {
            CronetHttpURLConnection.this.mRequestFinishedInfo = requestFinishedInfo;
            if (Logger.debug()) {
                Logger.d("CronetHttpURLConnection", "onMetricsCollected loop quit url = " + CronetHttpURLConnection.this.getURL().toString());
            }
            setRequestEnd();
        }

        public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            if (Logger.debug()) {
                Logger.d("CronetHttpURLConnection", "onResponseStarted loop quit url = " + CronetHttpURLConnection.this.getURL().toString());
            }
            CronetHttpURLConnection.this.mMessageLoop.quit();
        }

        public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            if (Logger.debug()) {
                Logger.d("CronetHttpURLConnection", "onSucceeded url = " + CronetHttpURLConnection.this.getURL().toString());
            }
            setResponseDataCompleted(null, true);
        }

        public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            if (Logger.debug()) {
                Logger.d("CronetHttpURLConnection", "onCanceled loop quit url = " + CronetHttpURLConnection.this.getURL().toString());
            }
            if (CronetHttpURLConnection.this.mException == null) {
                CronetHttpURLConnection.this.mException = new IOException("request canceled");
            }
            setResponseDataCompleted(CronetHttpURLConnection.this.mException, false);
        }

        public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            if (Logger.debug()) {
                Logger.d("CronetHttpURLConnection", "onReadCompleted loop quit url = " + CronetHttpURLConnection.this.getURL().toString());
            }
            CronetHttpURLConnection.this.mMessageLoop.quit();
        }

        public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            if (cronetException != null) {
                CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
                CronetHttpURLConnection.this.mException = CronetHttpURLConnection.this.tryConvertCronetException(cronetException);
                if (Logger.debug()) {
                    Logger.d("CronetHttpURLConnection", "onFailed url = " + CronetHttpURLConnection.this.getURL().toString());
                }
                setResponseDataCompleted(CronetHttpURLConnection.this.mException, true);
                return;
            }
            throw new IllegalStateException("Exception cannot be null in onFailed.");
        }

        public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            CronetHttpURLConnection.this.mOnRedirectCalled = true;
            try {
                URL url = new URL(str);
                if (CronetHttpURLConnection.this.instanceFollowRedirects) {
                    URL unused = CronetHttpURLConnection.this.url = url;
                    if (CronetHttpURLConnection.this.mRequest != null) {
                        CronetHttpURLConnection.this.mRequest.followRedirect();
                    }
                    return;
                }
            } catch (MalformedURLException unused2) {
            }
            CronetHttpURLConnection.this.mResponseInfo = urlResponseInfo;
            if (CronetHttpURLConnection.this.mRequest != null) {
                CronetHttpURLConnection.this.mRequest.stopRedirect();
            }
            if (Logger.debug()) {
                Logger.d("CronetHttpURLConnection", "onRedirectReceived loop quit url = " + CronetHttpURLConnection.this.getURL().toString());
            }
        }
    }

    public boolean usingProxy() {
        return false;
    }

    public int getInputStreamBufferSize() {
        return this.mInputStreamBufferSize;
    }

    public RequestFinishedInfo getRequestFinishedInfo() {
        return this.mRequestFinishedInfo;
    }

    private boolean isChunkedUpload() {
        if (this.chunkLength > 0) {
            return true;
        }
        return false;
    }

    public void connect() throws IOException {
        getOutputStream();
        startRequest();
    }

    public void disconnect() {
        if (this.connected && this.mRequest != null) {
            this.mRequest.cancel();
        }
    }

    public Map<String, List<String>> getHeaderFields() {
        try {
            getResponse();
            return getAllHeaders();
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    public String getRequestLog() {
        if (this.mRequestLog != null) {
            return this.mRequestLog;
        }
        return "";
    }

    public int getResponseCode() throws IOException {
        getResponse();
        return this.mResponseInfo.getHttpStatusCode();
    }

    public String getResponseMessage() throws IOException {
        getResponse();
        return this.mResponseInfo.getHttpStatusText();
    }

    public void onUploadTimeout() {
        if (this.mRequest != null) {
            this.mRequest.appTimeout();
        }
    }

    private void checkHasResponse() throws IOException {
        if (!this.mHasResponse) {
            throw new IllegalStateException("No response.");
        } else if (this.mException != null) {
            throw this.mException;
        } else if (this.mResponseInfo == null) {
            throw new NullPointerException("Response info is null when there is no exception.");
        }
    }

    private long getStreamingModeContentLength() {
        long j = (long) this.fixedContentLength;
        try {
            long j2 = getClass().getField("fixedContentLengthLong").getLong(this);
            if (j2 != -1) {
                return j2;
            }
            return j;
        } catch (Exception unused) {
            return j;
        }
    }

    public InputStream getErrorStream() {
        try {
            getResponse();
            if (this.mResponseInfo.getHttpStatusCode() >= 400) {
                return this.mInputStream;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    private List<Map.Entry<String, String>> getAllHeadersAsList() {
        if (this.mResponseHeadersList != null) {
            return this.mResponseHeadersList;
        }
        this.mResponseHeadersList = new ArrayList();
        for (Map.Entry<String, String> simpleImmutableEntry : this.mResponseInfo.getAllHeadersAsList()) {
            this.mResponseHeadersList.add(new AbstractMap.SimpleImmutableEntry(simpleImmutableEntry));
        }
        this.mResponseHeadersList = Collections.unmodifiableList(this.mResponseHeadersList);
        return this.mResponseHeadersList;
    }

    public InputStream getInputStream() throws IOException {
        getResponse();
        if (!this.instanceFollowRedirects && this.mOnRedirectCalled) {
            throw new IOException("Cannot read response body of a redirect.");
        } else if (this.mResponseInfo.getHttpStatusCode() < 400) {
            return this.mInputStream;
        } else {
            throw new FileNotFoundException(this.url.toString());
        }
    }

    private void getResponse() throws IOException {
        if (this.mOutputStream != null) {
            this.mOutputStream.checkReceivedEnoughContent();
            if (isChunkedUpload()) {
                this.mOutputStream.close();
            }
        }
        if (!this.mHasResponse) {
            startRequest();
            if (Logger.debug()) {
                Logger.d("CronetHttpURLConnection", "getResponse loop url = " + getURL().toString());
            }
            cronet_loop(getConnectTimeout() + getReadTimeout());
            this.mHasResponse = true;
        }
        checkHasResponse();
    }

    public Map<String, List<String>> getAllHeaders() {
        if (this.mResponseHeadersMap != null) {
            return this.mResponseHeadersMap;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry next : getAllHeadersAsList()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(next.getKey())) {
                arrayList.addAll((Collection) treeMap.get(next.getKey()));
            }
            arrayList.add(next.getValue());
            treeMap.put(next.getKey(), Collections.unmodifiableList(arrayList));
        }
        this.mResponseHeadersMap = Collections.unmodifiableMap(treeMap);
        return this.mResponseHeadersMap;
    }

    public Map<String, List<String>> getRequestProperties() {
        if (!this.connected) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Pair next : this.mRequestHeaders) {
                if (!treeMap.containsKey(next.first)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next.second);
                    treeMap.put(next.first, Collections.unmodifiableList(arrayList));
                } else {
                    throw new IllegalStateException("Should not have multiple values.");
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }
        throw new IllegalStateException("Cannot access request headers after connection is set.");
    }

    public OutputStream getOutputStream() throws IOException {
        if (this.mOutputStream == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            } else if (isChunkedUpload()) {
                this.mOutputStream = new CronetChunkedOutputStream(this, this.chunkLength, this.mMessageLoop);
                startRequest();
            } else {
                long streamingModeContentLength = getStreamingModeContentLength();
                if (streamingModeContentLength != -1) {
                    this.mOutputStream = new CronetFixedModeOutputStream(this, streamingModeContentLength, this.mMessageLoop);
                    if (streamingModeContentLength == 0) {
                        setFixedLengthStreamingMode((int) this.mOutputStream.getUploadDataProvider().getLength());
                        if (getRequestProperty("Content-Length") == null) {
                            addRequestProperty("Content-Length", Long.toString(this.mOutputStream.getUploadDataProvider().getLength()));
                        } else {
                            setRequestProperty("Content-Length", Long.toString(this.mOutputStream.getUploadDataProvider().getLength()));
                        }
                    }
                    startRequest();
                } else {
                    Log.d("CronetHttpURLConnection", "Outputstream is being buffered in memory.");
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.mOutputStream = new CronetBufferedOutputStream(this);
                    } else {
                        this.mOutputStream = new CronetBufferedOutputStream(this, Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.mOutputStream;
    }

    private void startRequest() throws IOException {
        if (!this.connected) {
            if (Logger.debug()) {
                Logger.d("CronetHttpURLConnection", "start request url = " + getURL().toString());
            }
            UrlRequest.Builder newUrlRequestBuilder = this.mCronetEngine.newUrlRequestBuilder(getURL().toString(), new CronetUrlRequestCallback(), this.mMessageLoop);
            if (this.doOutput) {
                if (this.method.equals("GET")) {
                    this.method = "POST";
                }
                if (this.mOutputStream != null) {
                    newUrlRequestBuilder.setUploadDataProvider(this.mOutputStream.getUploadDataProvider(), this.mMessageLoop);
                    if (getRequestProperty("Content-Length") == null && !isChunkedUpload()) {
                        addRequestProperty("Content-Length", Long.toString(this.mOutputStream.getUploadDataProvider().getLength()));
                    }
                    this.mOutputStream.setConnected();
                } else if (getRequestProperty("Content-Length") == null) {
                    addRequestProperty("Content-Length", PushConstants.PUSH_TYPE_NOTIFY);
                }
                if (getRequestProperty("Content-Type") == null) {
                    addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                }
            }
            HashMap hashMap = new HashMap();
            if (this.mRequestHeaders != null) {
                for (Pair next : this.mRequestHeaders) {
                    String str = (String) next.first;
                    String str2 = (String) next.second;
                    List list = (List) hashMap.get(str);
                    if (list == null) {
                        list = new LinkedList();
                    }
                    list.add(str2);
                    hashMap.put(str, list);
                }
            }
            Map<String, List<String>> map = null;
            try {
                if (this.mCookieHandler == null) {
                    this.mCookieHandler = CookieHandler.getDefault();
                }
                if (this.mCookieHandler != null) {
                    map = this.mCookieHandler.get(uri(getURL()), hashMap);
                }
            } catch (Exception e2) {
                if (Logger.debug()) {
                    Logger.d("CronetHttpURLConnection", "Loading cookies failed for " + getURL().toString() + " e = " + e2.getMessage());
                }
            }
            if (map != null && map.size() > 0) {
                for (Map.Entry next2 : map.entrySet()) {
                    String str3 = (String) next2.getKey();
                    StringBuilder sb = new StringBuilder();
                    if (("X-SS-Cookie".equalsIgnoreCase(str3) || "Cookie".equalsIgnoreCase(str3) || "Cookie2".equalsIgnoreCase(str3)) && !((List) next2.getValue()).isEmpty()) {
                        int i = 0;
                        for (String str4 : (List) next2.getValue()) {
                            if (i > 0) {
                                sb.append("; ");
                            }
                            sb.append(str4);
                            i++;
                        }
                        newUrlRequestBuilder.addHeader(str3, sb.toString());
                    }
                }
            }
            for (Pair next3 : this.mRequestHeaders) {
                newUrlRequestBuilder.addHeader((String) next3.first, (String) next3.second);
            }
            if (!getUseCaches()) {
                newUrlRequestBuilder.disableCache();
            }
            newUrlRequestBuilder.setHttpMethod(this.method);
            newUrlRequestBuilder.setSocketConnectTimeout(this.mSocketConnectTimeout);
            newUrlRequestBuilder.setSocketReadTimeout(this.mSocketReadTimeout);
            newUrlRequestBuilder.setSocketWriteTimeout(this.mSocketWriteTimeout);
            newUrlRequestBuilder.setRequestTimeout(this.mRequestTimeout);
            this.connected = true;
            this.mRequest = newUrlRequestBuilder.build();
            if (this.mRequestFlag != 0) {
                this.mRequest.setRequestFlag(this.mRequestFlag);
            }
            this.mRequest.start();
        }
    }

    public void setConnectTimeout(int i) {
        super.setConnectTimeout(i);
    }

    public void setInputStreamBufferSize(int i) {
        this.mInputStreamBufferSize = i;
    }

    public void setRequestFlag(int i) {
        this.mRequestFlag = i;
    }

    public void setRequestTimeout(int i) {
        this.mRequestTimeout = i;
    }

    public void setSocketConnectTimeout(int i) {
        this.mSocketConnectTimeout = i;
    }

    public void setSocketReadTimeout(int i) {
        this.mSocketReadTimeout = i;
    }

    public void setSocketWriteTimeout(int i) {
        this.mSocketWriteTimeout = i;
    }

    public final String getHeaderField(int i) {
        Map.Entry<String, String> headerFieldEntry = getHeaderFieldEntry(i);
        if (headerFieldEntry == null) {
            return null;
        }
        return headerFieldEntry.getValue();
    }

    public final String getHeaderFieldKey(int i) {
        Map.Entry<String, String> headerFieldEntry = getHeaderFieldEntry(i);
        if (headerFieldEntry == null) {
            return null;
        }
        return headerFieldEntry.getKey();
    }

    private Map.Entry<String, String> getHeaderFieldEntry(int i) {
        try {
            getResponse();
            List<Map.Entry<String, String>> allHeadersAsList = getAllHeadersAsList();
            if (i >= allHeadersAsList.size()) {
                return null;
            }
            return allHeadersAsList.get(i);
        } catch (IOException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void getMoreData(ByteBuffer byteBuffer) throws IOException {
        if (this.mRequest != null) {
            this.mRequest.read(byteBuffer);
            cronet_loop(getReadTimeout());
        }
    }

    public String getRequestProperty(String str) {
        int findRequestProperty = findRequestProperty(str);
        if (findRequestProperty >= 0) {
            return (String) this.mRequestHeaders.get(findRequestProperty).second;
        }
        return null;
    }

    private int findRequestProperty(String str) {
        for (int i = 0; i < this.mRequestHeaders.size(); i++) {
            if (((String) this.mRequestHeaders.get(i).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    public final String getHeaderField(String str) {
        try {
            getResponse();
            Map<String, List<String>> allHeaders = getAllHeaders();
            if (!allHeaders.containsKey(str)) {
                return null;
            }
            List list = allHeaders.get(str);
            return (String) list.get(list.size() - 1);
        } catch (IOException unused) {
            return null;
        }
    }

    public void setException(IOException iOException) {
        if (this.mInputStream != null) {
            this.mInputStream.setResponseDataCompleted(iOException);
        }
        if (this.mOutputStream != null) {
            this.mOutputStream.setRequestCompleted(iOException);
        }
        this.mHasResponse = true;
        this.mException = iOException;
        if (this.mRequest != null) {
            this.mRequest.cancel();
        }
    }

    public URI uri(URL url) {
        if (url == null) {
            return null;
        }
        String url2 = url.toString();
        try {
            return new URI(url2);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(url2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                try {
                    return URI.create(url2.substring(0, url2.indexOf("?")));
                } catch (Exception unused2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }

    private void cronet_loop(int i) throws IOException {
        try {
            this.mMessageLoop.loop(i);
        } catch (SocketTimeoutException unused) {
            if (this.mRequest != null) {
                this.mRequest.appTimeout();
                this.mMessageLoop.reset();
                this.mMessageLoop.loop(i / 2);
            }
        } catch (Exception e2) {
            setException(new IOException("Unexpected request usage, caught in CronetHttpURLConnection, caused by " + e2));
            if (this.mRequest != null) {
                this.mMessageLoop.reset();
                this.mMessageLoop.loop(i / 2);
            }
        }
    }

    public IOException tryConvertCronetException(CronetException cronetException) {
        IOException iOException;
        if (!(cronetException instanceof NetworkException)) {
            return cronetException;
        }
        switch (((NetworkException) cronetException).getErrorCode()) {
            case 1:
                iOException = new UnknownHostException(cronetException.getMessage());
                break;
            case 2:
            case 3:
                iOException = new ConnectException(cronetException.getMessage());
                break;
            case 4:
                iOException = new SocketTimeoutException(cronetException.getMessage());
                break;
            case 5:
            case e.l:
                iOException = new ConnectException(cronetException.getMessage());
                break;
            case 6:
                iOException = new ConnectTimeoutException(cronetException.getMessage());
                break;
            case 8:
                iOException = new SocketException("reset by peer " + cronetException.getMessage());
                break;
            case 9:
                iOException = new NoRouteToHostException(cronetException.getMessage());
                break;
            default:
                iOException = cronetException;
                break;
        }
        return iOException;
    }

    public final void addRequestProperty(String str, String str2) {
        setRequestPropertyInternal(str, str2, false);
    }

    public final void setRequestProperty(String str, String str2) {
        setRequestPropertyInternal(str, str2, true);
    }

    public CronetHttpURLConnection(URL url, CronetEngine cronetEngine) {
        super(url);
        this.mCronetEngine = cronetEngine;
    }

    private final void setRequestPropertyInternal(String str, String str2, boolean z) {
        if (!this.connected) {
            int findRequestProperty = findRequestProperty(str);
            if (findRequestProperty >= 0) {
                if (z) {
                    this.mRequestHeaders.remove(findRequestProperty);
                } else {
                    throw new UnsupportedOperationException("Cannot add multiple headers of the same key, " + str + ". crbug.com/432719.");
                }
            }
            this.mRequestHeaders.add(Pair.create(str, str2));
            return;
        }
        throw new IllegalStateException("Cannot modify request property after connection is made.");
    }
}
