package com.vivo.push;

import java.util.List;

public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f81602a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocalAliasTagsManager f81603b;

    public final void run() {
        if (this.f81602a != null && this.f81602a.size() > 0) {
            this.f81603b.mSubscribeAppAliasManager.delAliasSuccess((String) this.f81602a.get(0));
        }
    }

    l(LocalAliasTagsManager localAliasTagsManager, List list) {
        this.f81603b = localAliasTagsManager;
        this.f81602a = list;
    }
}
