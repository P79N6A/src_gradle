package com.vivo.push;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f81587a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocalAliasTagsManager f81588b;

    public final void run() {
        if (this.f81588b.mSubscribeAppAliasManager.setAlias(this.f81587a)) {
            p.a().a("push_cache_sp", this.f81587a);
        }
    }

    d(LocalAliasTagsManager localAliasTagsManager, String str) {
        this.f81588b = localAliasTagsManager;
        this.f81587a = str;
    }
}
