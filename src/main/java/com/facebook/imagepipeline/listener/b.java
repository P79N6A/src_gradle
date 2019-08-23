package com.facebook.imagepipeline.listener;

import com.facebook.common.logging.FLog;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public final class b implements RequestListener {

    /* renamed from: a  reason: collision with root package name */
    private final List<RequestListener> f23942a;

    public final void addRequestListener(RequestListener requestListener) {
        this.f23942a.add(requestListener);
    }

    public b(RequestListener... requestListenerArr) {
        this.f23942a = new ArrayList(requestListenerArr.length);
        for (RequestListener requestListener : requestListenerArr) {
            if (requestListener != null) {
                this.f23942a.add(requestListener);
            }
        }
    }

    public final void onRequestCancellation(String str) {
        int size = this.f23942a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f23942a.get(i).onRequestCancellation(str);
            } catch (Exception e2) {
                a("InternalListener exception in onRequestCancellation", e2);
            }
        }
    }

    public final boolean requiresExtraMap(String str) {
        int size = this.f23942a.size();
        for (int i = 0; i < size; i++) {
            if (this.f23942a.get(i).requiresExtraMap(str)) {
                return true;
            }
        }
        return false;
    }

    public b(Set<RequestListener> set) {
        this.f23942a = new ArrayList(set.size());
        for (RequestListener next : set) {
            if (next != null) {
                this.f23942a.add(next);
            }
        }
    }

    private static void a(String str, Throwable th) {
        FLog.e("ForwardingRequestListener", str, th);
    }

    public final void onProducerStart(String str, String str2) {
        int size = this.f23942a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f23942a.get(i).onProducerStart(str, str2);
            } catch (Exception e2) {
                a("InternalListener exception in onProducerStart", e2);
            }
        }
    }

    public final void onProducerEvent(String str, String str2, String str3) {
        int size = this.f23942a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f23942a.get(i).onProducerEvent(str, str2, str3);
            } catch (Exception e2) {
                a("InternalListener exception in onIntermediateChunkStart", e2);
            }
        }
    }

    public final void onProducerFinishWithCancellation(String str, String str2, @Nullable Map<String, String> map) {
        int size = this.f23942a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f23942a.get(i).onProducerFinishWithCancellation(str, str2, map);
            } catch (Exception e2) {
                a("InternalListener exception in onProducerFinishWithCancellation", e2);
            }
        }
    }

    public final void onProducerFinishWithSuccess(String str, String str2, @Nullable Map<String, String> map) {
        int size = this.f23942a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f23942a.get(i).onProducerFinishWithSuccess(str, str2, map);
            } catch (Exception e2) {
                a("InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    public final void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        int size = this.f23942a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f23942a.get(i).onRequestSuccess(imageRequest, str, z);
            } catch (Exception e2) {
                a("InternalListener exception in onRequestSuccess", e2);
            }
        }
    }

    public final void onUltimateProducerReached(String str, String str2, boolean z) {
        int size = this.f23942a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f23942a.get(i).onUltimateProducerReached(str, str2, z);
            } catch (Exception e2) {
                a("InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    public final void onProducerFinishWithFailure(String str, String str2, Throwable th, @Nullable Map<String, String> map) {
        int size = this.f23942a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f23942a.get(i).onProducerFinishWithFailure(str, str2, th, map);
            } catch (Exception e2) {
                a("InternalListener exception in onProducerFinishWithFailure", e2);
            }
        }
    }

    public final void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        int size = this.f23942a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f23942a.get(i).onRequestFailure(imageRequest, str, th, z);
            } catch (Exception e2) {
                a("InternalListener exception in onRequestFailure", e2);
            }
        }
    }

    public final void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        int size = this.f23942a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f23942a.get(i).onRequestStart(imageRequest, obj, str, z);
            } catch (Exception e2) {
                a("InternalListener exception in onRequestStart", e2);
            }
        }
    }
}
