package anet.channel;

import anet.channel.b.a;
import anetwork.channel.cache.CacheManager;

public final class h implements Runnable {
    h() {
    }

    public final void run() {
        try {
            a aVar = new a();
            aVar.a();
            CacheManager.addCache(aVar, new i(this), 1);
        } catch (Exception unused) {
        }
    }
}
