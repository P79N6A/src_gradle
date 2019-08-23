package com.ss.android.ugc.effectmanager;

import com.ss.android.ugc.effectmanager.c.a;
import com.ss.android.ugc.effectmanager.common.d;
import com.ss.android.ugc.effectmanager.k;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private d<String, ModelInfo> f77533a;

    /* renamed from: b  reason: collision with root package name */
    private k f77534b;

    public final k a() {
        Collection<ModelInfo> collection;
        if (this.f77534b == null) {
            HashMap hashMap = new HashMap();
            for (ModelInfo modelInfo : this.f77533a.a()) {
                String name = modelInfo.getName();
                if (!hashMap.containsKey(name)) {
                    hashMap.put(name, modelInfo.getVersion());
                } else if (!((String) hashMap.get(name)).equals(modelInfo.getVersion())) {
                    throw new RuntimeException("model " + name + " has different versions in ServerTable,Please modify the file to the correct format ");
                }
            }
            this.f77534b = new k();
            d<String, k.a> dVar = new d<>();
            for (K k : this.f77533a.f77310a.keySet()) {
                Collection collection2 = this.f77533a.f77310a.get(k);
                if (collection2 == null) {
                    collection = Collections.emptyList();
                } else {
                    collection = Collections.unmodifiableCollection(collection2);
                }
                for (ModelInfo aVar : collection) {
                    dVar.a(k, new k.a(aVar));
                }
            }
            this.f77534b.f77513a = dVar;
        }
        return this.f77534b;
    }

    public n(d<String, ModelInfo> dVar) {
        this.f77533a = (d) a.a(dVar);
    }
}
