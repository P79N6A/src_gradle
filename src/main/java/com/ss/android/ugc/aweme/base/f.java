package com.ss.android.ugc.aweme.base;

import android.net.Uri;
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

public class f extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34736a;

    /* renamed from: b  reason: collision with root package name */
    private static ExecutorService f34737b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, List<String>> f34738c = new ArrayMap();

    /* renamed from: d  reason: collision with root package name */
    private int f34739d;

    /* renamed from: e  reason: collision with root package name */
    private long f34740e = -1;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34736a, false, 24001, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34736a, false, 24001, new Class[0], Void.TYPE);
        } else if (f34737b == null) {
            synchronized (f.class) {
                if (f34737b == null) {
                    f34737b = j.a(1, i.f34749b);
                }
            }
        }
    }

    public void onRequestCancellation(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34736a, false, 23998, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34736a, false, 23998, new Class[]{String.class}, Void.TYPE);
            return;
        }
        super.onRequestCancellation(str);
        this.f34738c.remove(str2);
    }

    public final void a(ImageRequestBuilder imageRequestBuilder) {
        if (PatchProxy.isSupport(new Object[]{imageRequestBuilder}, this, f34736a, false, 23995, new Class[]{ImageRequestBuilder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageRequestBuilder}, this, f34736a, false, 23995, new Class[]{ImageRequestBuilder.class}, Void.TYPE);
            return;
        }
        this.f34739d++;
        imageRequestBuilder.setRequestListener(this);
    }

    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, map}, this, f34736a, false, 23996, new Class[]{String.class, String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, map}, this, f34736a, false, 23996, new Class[]{String.class, String.class, Map.class}, Void.TYPE);
            return;
        }
        super.onProducerFinishWithSuccess(str, str2, map);
        List list = this.f34738c.get(str3);
        if (list != null) {
            list.add(str4);
        }
    }

    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        long j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{imageRequest, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34736a, false, 24000, new Class[]{ImageRequest.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageRequest, str2, Byte.valueOf(z)}, this, f34736a, false, 24000, new Class[]{ImageRequest.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onRequestSuccess(imageRequest, str, z);
        List remove = this.f34738c.remove(str2);
        if (remove != null) {
            boolean contains = remove.contains("NetworkFetchProducer");
            Uri sourceUri = imageRequest.getSourceUri();
            if (this.f34740e > 0) {
                j = System.currentTimeMillis() - this.f34740e;
                this.f34740e = -1;
            } else {
                j = -1;
            }
            a();
            f34737b.submit(new h(sourceUri, j, contains));
        }
    }

    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{imageRequest, obj, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34736a, false, 23997, new Class[]{ImageRequest.class, Object.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageRequest, obj, str2, Byte.valueOf(z)}, this, f34736a, false, 23997, new Class[]{ImageRequest.class, Object.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onRequestStart(imageRequest, obj, str, z);
        this.f34738c.put(str2, new LinkedList());
        if (this.f34740e == -1) {
            this.f34740e = System.currentTimeMillis();
        }
    }

    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        ImageRequest imageRequest2 = imageRequest;
        String str2 = str;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{imageRequest2, str2, th2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f34736a, false, 23999, new Class[]{ImageRequest.class, String.class, Throwable.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageRequest2, str2, th2, Byte.valueOf(z)}, this, f34736a, false, 23999, new Class[]{ImageRequest.class, String.class, Throwable.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onRequestFailure(imageRequest, str, th, z);
        this.f34738c.remove(str2);
        int i = this.f34739d - 1;
        this.f34739d = i;
        if (i == 0) {
            a();
            f34737b.submit(new g(imageRequest2, th2));
        }
    }
}
