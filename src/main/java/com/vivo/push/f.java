package com.vivo.push;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ArrayList f81591a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocalAliasTagsManager f81592b;

    public final void run() {
        HashSet hashSet = new HashSet();
        Iterator it2 = this.f81591a.iterator();
        while (it2.hasNext()) {
            hashSet.add((String) it2.next());
        }
        if (this.f81592b.mSubscribeAppTagManager.setTags(hashSet)) {
            p.a().a("push_cache_sp", this.f81591a);
        }
    }

    f(LocalAliasTagsManager localAliasTagsManager, ArrayList arrayList) {
        this.f81592b = localAliasTagsManager;
        this.f81591a = arrayList;
    }
}
