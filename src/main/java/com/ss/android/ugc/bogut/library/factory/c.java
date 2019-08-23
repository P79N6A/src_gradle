package com.ss.android.ugc.bogut.library.factory;

import com.ss.android.ugc.bogut.library.a.a;
import java.util.HashMap;

public enum c {
    INSTANCE;
    
    public HashMap<String, a> idToPresenter;
    public HashMap<a, String> presenterToId;

    public final void clear() {
        this.idToPresenter.clear();
        this.presenterToId.clear();
    }

    public final <P> P getPresenter(String str) {
        return this.idToPresenter.get(str);
    }

    public final String getId(a aVar) {
        return this.presenterToId.get(aVar);
    }

    public final void add(final a aVar) {
        String str = aVar.getClass().getSimpleName() + "/" + System.nanoTime() + "/" + ((int) (Math.random() * 2.147483647E9d));
        this.idToPresenter.put(str, aVar);
        this.presenterToId.put(aVar, str);
        aVar.addOnDestroyListener(new a.C0806a() {
            public final void a() {
                c.this.idToPresenter.remove(c.this.presenterToId.remove(aVar));
            }
        });
    }
}
