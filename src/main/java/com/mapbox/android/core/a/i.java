package com.mapbox.android.core.a;

import android.content.Context;
import android.support.annotation.NonNull;
import com.mapbox.android.core.a.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    private static final List<f.a> f25930b = new ArrayList<f.a>() {
        {
            add(f.a.GOOGLE_PLAY_SERVICES);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private Map<f.a, f> f25931a;

    @NonNull
    public final f a() {
        f fVar = this.f25931a.get(f.a.ANDROID);
        for (f.a aVar : f25930b) {
            f fVar2 = this.f25931a.get(aVar);
            if (fVar2 != null) {
                return fVar2;
            }
        }
        return fVar;
    }

    public i(Context context) {
        a(context);
    }

    private void a(Context context) {
        this.f25931a = new HashMap();
        c cVar = new c();
        HashMap hashMap = new HashMap();
        hashMap.put(f.a.GOOGLE_PLAY_SERVICES, new e(cVar));
        hashMap.put(f.a.ANDROID, new b());
        for (Map.Entry entry : hashMap.entrySet()) {
            j jVar = (j) entry.getValue();
            if (jVar.a()) {
                this.f25931a.put(entry.getKey(), jVar.a(context));
            }
        }
    }
}
