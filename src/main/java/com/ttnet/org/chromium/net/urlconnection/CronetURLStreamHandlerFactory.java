package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.net.impl.CronetEngineBase;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

public class CronetURLStreamHandlerFactory implements URLStreamHandlerFactory {
    private final CronetEngineBase mCronetEngine;

    public CronetURLStreamHandlerFactory(CronetEngineBase cronetEngineBase) {
        if (cronetEngineBase != null) {
            this.mCronetEngine = cronetEngineBase;
            return;
        }
        throw new NullPointerException("CronetEngine is null.");
    }

    public URLStreamHandler createURLStreamHandler(String str) {
        if ("http".equals(str) || "https".equals(str)) {
            return new CronetHttpURLStreamHandler(this.mCronetEngine);
        }
        return null;
    }
}
