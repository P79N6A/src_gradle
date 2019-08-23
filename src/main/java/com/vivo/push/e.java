package com.vivo.push;

import java.util.HashSet;
import java.util.List;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f81589a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocalAliasTagsManager f81590b;

    public final void run() {
        if (this.f81589a != null && this.f81589a.size() > 0) {
            HashSet hashSet = new HashSet();
            for (String add : this.f81589a) {
                hashSet.add(add);
            }
            this.f81590b.mSubscribeAppTagManager.setTagsSuccess(hashSet);
        }
    }

    e(LocalAliasTagsManager localAliasTagsManager, List list) {
        this.f81590b = localAliasTagsManager;
        this.f81589a = list;
    }
}
