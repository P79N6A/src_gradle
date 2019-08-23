package com.bytedance.lighten.loader.a;

import android.os.SystemClock;
import com.bytedance.lighten.core.f;
import com.bytedance.lighten.core.h;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.ah;
import com.facebook.imagepipeline.producers.am;
import com.facebook.imagepipeline.producers.e;
import com.facebook.imagepipeline.producers.s;
import java.util.HashMap;
import java.util.Map;

public final class c extends com.facebook.imagepipeline.producers.c<a> {

    /* renamed from: a  reason: collision with root package name */
    private h f21806a;

    public static class a extends s {

        /* renamed from: a  reason: collision with root package name */
        public f f21809a;

        public a(Consumer<b> consumer, am amVar) {
            super(consumer, amVar);
        }
    }

    public c(h hVar) {
        this.f21806a = hVar;
    }

    public final /* synthetic */ s createFetchState(Consumer consumer, am amVar) {
        a aVar = new a(consumer, amVar);
        aVar.f21809a = new f();
        return aVar;
    }

    public final /* synthetic */ void onFetchCompletion(s sVar, int i) {
        ((a) sVar).f21809a.f21789c = SystemClock.elapsedRealtime();
    }

    public final /* synthetic */ void fetch(s sVar, ah.a aVar) {
        a aVar2 = (a) sVar;
        if (aVar2 != null) {
            a aVar3 = new a(aVar);
            aVar2.f21809a.f21791e = aVar2.getUri();
            aVar2.f21809a.f21792f = new b(aVar2.mContext);
            final com.bytedance.lighten.core.b.h a2 = this.f21806a.a();
            a2.a(aVar2.f21809a, aVar3);
            aVar2.mContext.addCallbacks(new e() {
                public final void onCancellationRequested() {
                    a2.a();
                }
            });
            a2.b(aVar2.f21809a, aVar3);
        }
    }

    public final /* synthetic */ Map getExtraMap(s sVar, int i) {
        a aVar = (a) sVar;
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(aVar.f21809a.f21788b - aVar.f21809a.f21787a));
        hashMap.put("fetch_time", Long.toString(aVar.f21809a.f21789c - aVar.f21809a.f21788b));
        hashMap.put("total_time", Long.toString(aVar.f21809a.f21789c - aVar.f21809a.f21787a));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }
}
