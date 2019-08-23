package com.miui.camera;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static Map<a, Class> f27297a;

    public enum a {
        VIDEO_END("org.quic.camera.recording.endOfStream");
        
        private final String mName;

        public final String toString() {
            return this.mName;
        }

        public final <T> CaptureRequest.Key<T> toCaptureRequestKey() {
            return d.a(this.mName, b.f27297a.get(this));
        }

        public final <T> CaptureResult.Key<T> toCaptureResultKey() {
            return d.b(this.mName, b.f27297a.get(this));
        }

        private a(String str) {
            this.mName = str;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f27297a = hashMap;
        hashMap.put(a.VIDEO_END, Byte.TYPE);
    }
}
