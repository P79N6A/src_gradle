package com.vivo.push;

public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f81594a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocalAliasTagsManager f81595b;

    public final void run() {
        if (this.f81595b.mSubscribeAppAliasManager.delAlias(this.f81594a)) {
            p.a().b("push_cache_sp", this.f81594a);
        }
    }

    h(LocalAliasTagsManager localAliasTagsManager, String str) {
        this.f81595b = localAliasTagsManager;
        this.f81594a = str;
    }
}
