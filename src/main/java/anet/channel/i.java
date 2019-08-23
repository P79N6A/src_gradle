package anet.channel;

import anetwork.channel.cache.CachePrediction;
import java.util.Map;

public class i implements CachePrediction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f1234a;

    i(h hVar) {
        this.f1234a = hVar;
    }

    public boolean handleCache(String str, Map<String, String> map) {
        return "weex".equals(map.get("f-refer"));
    }
}
