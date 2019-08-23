package com.bytedance.android.monitor.webview;

import java.util.Map;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f18843a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f18844b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, JSONObject> f18845c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, JSONObject> f18846d;

    /* renamed from: e  reason: collision with root package name */
    public a f18847e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f18848a;

        /* renamed from: b  reason: collision with root package name */
        public int f18849b;

        /* renamed from: c  reason: collision with root package name */
        public int f18850c;

        public final String toString() {
            return "ErrorCountData{httpErrorCount=" + this.f18848a + ", jsErrorCount=" + this.f18849b + ", resourceErrorCount=" + this.f18850c + '}';
        }
    }

    public final String toString() {
        return "TTLiveWebViewMonitorData{navigationData=" + this.f18843a + ", resourceData=" + this.f18844b + ", httpErrMap=" + this.f18845c + ", resourceErrMap=" + this.f18846d + ", errorCountData=" + this.f18847e + '}';
    }
}
