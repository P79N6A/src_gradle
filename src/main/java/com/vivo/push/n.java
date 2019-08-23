package com.vivo.push;

import java.util.List;

public final class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f81614a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocalAliasTagsManager f81615b;

    public final void run() {
        if (this.f81614a != null && this.f81614a.size() > 0) {
            this.f81615b.mSubscribeAppAliasManager.setAliasSuccess((String) this.f81614a.get(0));
        }
    }

    n(LocalAliasTagsManager localAliasTagsManager, List list) {
        this.f81615b = localAliasTagsManager;
        this.f81614a = list;
    }
}
