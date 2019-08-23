package org.android.spdy;

import java.util.Map;

public class SpdyDataProvider {
    byte[] data;
    public boolean finished = true;
    Map<String, String> postBody;

    public SpdyDataProvider(Map<String, String> map) {
        this.postBody = map;
    }

    public SpdyDataProvider(byte[] bArr) {
        this.data = bArr;
    }
}
