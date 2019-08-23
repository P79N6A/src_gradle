package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.net.impl.CronetEngineBase;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public class CronetHttpURLStreamHandler extends URLStreamHandler {
    private final CronetEngineBase mCronetEngine;

    public CronetHttpURLStreamHandler(CronetEngineBase cronetEngineBase) {
        this.mCronetEngine = cronetEngineBase;
    }

    public URLConnection openConnection(URL url) throws IOException {
        return this.mCronetEngine.openConnection(url);
    }

    public URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        return this.mCronetEngine.openConnection(url, proxy);
    }
}
