package com.vivo.push;

import java.util.HashSet;
import java.util.List;

public final class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f81604a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocalAliasTagsManager f81605b;

    public final void run() {
        if (this.f81604a != null && this.f81604a.size() > 0) {
            HashSet hashSet = new HashSet();
            for (String add : this.f81604a) {
                hashSet.add(add);
            }
            this.f81605b.mSubscribeAppTagManager.delTagsSuccess(hashSet);
        }
    }

    m(LocalAliasTagsManager localAliasTagsManager, List list) {
        this.f81605b = localAliasTagsManager;
        this.f81604a = list;
    }
}
