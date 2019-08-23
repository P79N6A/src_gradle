package anet.channel.f;

import android.content.SharedPreferences;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.l;

public final class f implements IStrategyListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SharedPreferences f1224a;

    f(SharedPreferences sharedPreferences) {
        this.f1224a = sharedPreferences;
    }

    public final void onStrategyUpdated(l.d dVar) {
        if (dVar != null && dVar.f1407b != null) {
            for (int i = 0; i < dVar.f1407b.length; i++) {
                String str = dVar.f1407b[i].f1398a;
                l.a[] aVarArr = dVar.f1407b[i].h;
                if (aVarArr != null && aVarArr.length > 0) {
                    for (l.a aVar : aVarArr) {
                        String str2 = aVar.f1393b;
                        if ("quic".equals(str2) || "quicplain".equals(str2)) {
                            if (!str.equals(a.f1216a)) {
                                String unused = a.f1216a = str;
                                SharedPreferences.Editor edit = this.f1224a.edit();
                                edit.putString("quic_detector_host", a.f1216a);
                                edit.apply();
                            }
                            a.a(NetworkStatusHelper.getStatus());
                            return;
                        }
                    }
                    continue;
                }
            }
        }
    }
}
