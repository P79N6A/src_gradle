package com.ss.android.ugc.graph;

import android.support.annotation.NonNull;
import com.ss.android.ugc.graph.e;
import java.util.HashMap;
import java.util.Map;

public class a implements e.c {
    public Map<String, e.c> sDelegateMap = new HashMap();

    public <T> T load(Object obj, Class<T> cls) {
        return null;
    }

    a() {
    }

    /* access modifiers changed from: package-private */
    public void put(a aVar) {
        if (aVar != null) {
            this.sDelegateMap.putAll(aVar.sDelegateMap);
        }
    }

    static String generateComponentDelegateName(@NonNull Class cls) {
        String name = cls.getName();
        return "com.ss.android.ugc.graph.ComponentDelegateHolder" + Math.abs(name.trim().hashCode());
    }

    /* access modifiers changed from: package-private */
    public void put(Class cls, e.c cVar) {
        this.sDelegateMap.put(generateComponentDelegateName(cls), cVar);
    }
}
