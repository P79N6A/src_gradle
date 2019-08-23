package com.ss.android.ugc.aweme.fastimage;

import android.net.Uri;
import android.support.v4.util.ArrayMap;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.ReactInstance;
import com.ss.android.ugc.aweme.framework.b.a;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public final class c implements RequestListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44174a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<String>> f44175b = new ArrayMap();

    /* renamed from: c  reason: collision with root package name */
    private int f44176c;

    /* renamed from: d  reason: collision with root package name */
    private long f44177d = -1;

    public final void onProducerEvent(String str, String str2, String str3) {
    }

    public final void onProducerFinishWithCancellation(String str, String str2, @Nullable Map<String, String> map) {
    }

    public final void onProducerFinishWithFailure(String str, String str2, Throwable th, @Nullable Map<String, String> map) {
    }

    public final void onProducerStart(String str, String str2) {
    }

    public final void onUltimateProducerReached(String str, String str2, boolean z) {
    }

    public final boolean requiresExtraMap(String str) {
        return false;
    }

    public final void a(ImageRequestBuilder imageRequestBuilder) {
        if (PatchProxy.isSupport(new Object[]{imageRequestBuilder}, this, f44174a, false, 39346, new Class[]{ImageRequestBuilder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageRequestBuilder}, this, f44174a, false, 39346, new Class[]{ImageRequestBuilder.class}, Void.TYPE);
            return;
        }
        this.f44176c++;
        imageRequestBuilder.setRequestListener(this);
    }

    public final void onRequestCancellation(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f44174a, false, 39349, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f44174a, false, 39349, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f44175b.remove(str2);
    }

    public final void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, map}, this, f44174a, false, 39347, new Class[]{String.class, String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, map}, this, f44174a, false, 39347, new Class[]{String.class, String.class, Map.class}, Void.TYPE);
            return;
        }
        List list = this.f44175b.get(str3);
        if (list != null) {
            list.add(str4);
        }
    }

    public final void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{imageRequest, str3, Byte.valueOf(z ? (byte) 1 : 0)}, this, f44174a, false, 39351, new Class[]{ImageRequest.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageRequest, str3, Byte.valueOf(z)}, this, f44174a, false, 39351, new Class[]{ImageRequest.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        List remove = this.f44175b.remove(str);
        if (remove != null) {
            boolean contains = remove.contains("NetworkFetchProducer");
            Uri sourceUri = imageRequest.getSourceUri();
            if (this.f44177d > 0) {
                System.currentTimeMillis();
                this.f44177d = -1;
            }
            if (ReactInstance.getConfig() != null) {
                a config = ReactInstance.getConfig();
                if (sourceUri != null) {
                    str2 = sourceUri.toString();
                } else {
                    str2 = "";
                }
                config.a(str2, !contains);
            }
        }
    }

    public final void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{imageRequest, obj, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f44174a, false, 39348, new Class[]{ImageRequest.class, Object.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageRequest, obj, str2, Byte.valueOf(z)}, this, f44174a, false, 39348, new Class[]{ImageRequest.class, Object.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f44175b.put(str2, new LinkedList());
        if (this.f44177d == -1) {
            this.f44177d = System.currentTimeMillis();
        }
    }

    public final void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{imageRequest, str3, th, Byte.valueOf(z ? (byte) 1 : 0)}, this, f44174a, false, 39350, new Class[]{ImageRequest.class, String.class, Throwable.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageRequest, str3, th, Byte.valueOf(z)}, this, f44174a, false, 39350, new Class[]{ImageRequest.class, String.class, Throwable.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f44175b.remove(str3);
        int i = this.f44176c - 1;
        this.f44176c = i;
        if (i == 0 && ReactInstance.getConfig() != null) {
            a config = ReactInstance.getConfig();
            if (imageRequest.getSourceUri() != null) {
                str2 = imageRequest.getSourceUri().toString();
            } else {
                str2 = "";
            }
            config.a(str2);
        }
    }
}
