package com.bytedance.android.live.core.utils.fresco;

import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.util.ArrayMap;
import com.facebook.imagepipeline.listener.a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8272a;

    /* renamed from: b  reason: collision with root package name */
    private static ExecutorService f8273b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, List<String>> f8274c = new ArrayMap();

    /* renamed from: d  reason: collision with root package name */
    private int f8275d;

    /* renamed from: e  reason: collision with root package name */
    private long f8276e = -1;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f8272a, false, 1385, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8272a, false, 1385, new Class[0], Void.TYPE);
        } else if (f8273b == null) {
            synchronized (c.class) {
                if (f8273b == null) {
                    f8273b = g.a(1, f.f8284b);
                }
            }
        }
    }

    public void onRequestCancellation(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f8272a, false, 1382, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f8272a, false, 1382, new Class[]{String.class}, Void.TYPE);
            return;
        }
        super.onRequestCancellation(str);
        this.f8274c.remove(str2);
    }

    public final void a(ImageRequestBuilder imageRequestBuilder) {
        if (PatchProxy.isSupport(new Object[]{imageRequestBuilder}, this, f8272a, false, 1379, new Class[]{ImageRequestBuilder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageRequestBuilder}, this, f8272a, false, 1379, new Class[]{ImageRequestBuilder.class}, Void.TYPE);
            return;
        }
        this.f8275d++;
        imageRequestBuilder.setRequestListener(this);
    }

    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, map}, this, f8272a, false, 1380, new Class[]{String.class, String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, map}, this, f8272a, false, 1380, new Class[]{String.class, String.class, Map.class}, Void.TYPE);
            return;
        }
        super.onProducerFinishWithSuccess(str, str2, map);
        List list = this.f8274c.get(str3);
        if (list != null) {
            list.add(str4);
        }
    }

    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        long j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{imageRequest, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f8272a, false, 1384, new Class[]{ImageRequest.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageRequest, str2, Byte.valueOf(z)}, this, f8272a, false, 1384, new Class[]{ImageRequest.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onRequestSuccess(imageRequest, str, z);
        List remove = this.f8274c.remove(str2);
        if (remove != null && remove.contains("NetworkFetchProducer")) {
            Uri sourceUri = imageRequest.getSourceUri();
            if (this.f8276e > 0) {
                j = SystemClock.elapsedRealtime() - this.f8276e;
                this.f8276e = -1;
            } else {
                j = -1;
            }
            a();
            f8273b.submit(new e(sourceUri, j));
        }
    }

    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{imageRequest, obj, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f8272a, false, 1381, new Class[]{ImageRequest.class, Object.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageRequest, obj, str2, Byte.valueOf(z)}, this, f8272a, false, 1381, new Class[]{ImageRequest.class, Object.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onRequestStart(imageRequest, obj, str, z);
        this.f8274c.put(str2, new LinkedList());
        if (this.f8276e == -1) {
            this.f8276e = SystemClock.elapsedRealtime();
        }
    }

    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        ImageRequest imageRequest2 = imageRequest;
        String str2 = str;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{imageRequest2, str2, th2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f8272a, false, 1383, new Class[]{ImageRequest.class, String.class, Throwable.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageRequest2, str2, th2, Byte.valueOf(z)}, this, f8272a, false, 1383, new Class[]{ImageRequest.class, String.class, Throwable.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onRequestFailure(imageRequest, str, th, z);
        this.f8274c.remove(str2);
        int i = this.f8275d - 1;
        this.f8275d = i;
        if (i == 0) {
            a();
            f8273b.submit(new d(th2, imageRequest2));
        }
    }
}
