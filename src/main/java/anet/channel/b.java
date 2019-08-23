package anet.channel;

import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    Map<String, Integer> f1166a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    Map<String, SessionInfo> f1167b = new ConcurrentHashMap();

    /* access modifiers changed from: package-private */
    public Collection<SessionInfo> a() {
        return this.f1167b.values();
    }

    b() {
    }

    /* access modifiers changed from: package-private */
    public SessionInfo a(String str) {
        return this.f1167b.remove(str);
    }

    /* access modifiers changed from: package-private */
    public SessionInfo b(String str) {
        return this.f1167b.get(str);
    }

    public int c(String str) {
        Integer num;
        synchronized (this.f1166a) {
            num = this.f1166a.get(str);
        }
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public void a(SessionInfo sessionInfo) {
        if (sessionInfo == null) {
            throw new NullPointerException("info is null");
        } else if (!TextUtils.isEmpty(sessionInfo.host)) {
            this.f1167b.put(sessionInfo.host, sessionInfo);
        } else {
            throw new IllegalArgumentException("host cannot be null or empty");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f1166a) {
                this.f1166a.put(str, Integer.valueOf(i));
            }
            return;
        }
        throw new IllegalArgumentException("host cannot be null or empty");
    }
}
