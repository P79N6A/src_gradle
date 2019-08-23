package com.vivo.push;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ArrayList f81596a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocalAliasTagsManager f81597b;

    public final void run() {
        HashSet hashSet = new HashSet();
        Iterator it2 = this.f81596a.iterator();
        while (it2.hasNext()) {
            hashSet.add((String) it2.next());
        }
        if (this.f81597b.mSubscribeAppTagManager.delTags(hashSet)) {
            p.a().b("push_cache_sp", this.f81596a);
        }
    }

    i(LocalAliasTagsManager localAliasTagsManager, ArrayList arrayList) {
        this.f81597b = localAliasTagsManager;
        this.f81596a = arrayList;
    }
}
