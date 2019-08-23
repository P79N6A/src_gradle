package anet.channel.strategy.dispatch;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

public class HttpDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private CopyOnWriteArraySet<IDispatchEventListener> f1356a;

    /* renamed from: b  reason: collision with root package name */
    private b f1357b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f1358c;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f1359d;

    /* renamed from: e  reason: collision with root package name */
    private Set<String> f1360e;

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f1361f;

    public interface IDispatchEventListener {
        void onEvent(DispatchEvent dispatchEvent);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static HttpDispatcher f1362a = new HttpDispatcher();

        private a() {
        }
    }

    public static HttpDispatcher getInstance() {
        return a.f1362a;
    }

    public synchronized Set<String> getInitHosts() {
        a();
        return new HashSet(this.f1360e);
    }

    public void switchENV() {
        this.f1359d.clear();
        this.f1360e.clear();
        this.f1361f.set(false);
    }

    private HttpDispatcher() {
        this.f1356a = new CopyOnWriteArraySet<>();
        this.f1357b = new b();
        this.f1358c = true;
        this.f1359d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f1360e = new TreeSet();
        this.f1361f = new AtomicBoolean();
        a();
    }

    private void a() {
        if (!this.f1361f.get() && GlobalAppRuntimeInfo.getContext() != null && this.f1361f.compareAndSet(false, true)) {
            this.f1360e.add(DispatchConstants.getAmdcServerDomain());
            if (GlobalAppRuntimeInfo.isTargetProcess()) {
                this.f1360e.addAll(Arrays.asList(DispatchConstants.initHostArray));
            }
        }
    }

    public void setEnable(boolean z) {
        this.f1358c = z;
    }

    public void addListener(IDispatchEventListener iDispatchEventListener) {
        this.f1356a.add(iDispatchEventListener);
    }

    public void removeListener(IDispatchEventListener iDispatchEventListener) {
        this.f1356a.remove(iDispatchEventListener);
    }

    public static void setInitHosts(List<String> list) {
        if (list != null) {
            DispatchConstants.initHostArray = (String[]) list.toArray(new String[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(DispatchEvent dispatchEvent) {
        Iterator<IDispatchEventListener> it2 = this.f1356a.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onEvent(dispatchEvent);
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void addHosts(List<String> list) {
        if (list != null) {
            this.f1360e.addAll(list);
            this.f1359d.clear();
        }
    }

    public boolean isInitHostsChanged(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean contains = this.f1359d.contains(str);
        if (!contains) {
            this.f1359d.add(str);
        }
        if (!contains) {
            return true;
        }
        return false;
    }

    public void sendAmdcRequest(Set<String> set, int i) {
        if (!this.f1358c || set == null || set.isEmpty()) {
            ALog.e("awcn.HttpDispatcher", "invalid parameter", null, new Object[0]);
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i("awcn.HttpDispatcher", "sendAmdcRequest", null, "hosts", set.toString());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("hosts", set);
        hashMap.put("cv", String.valueOf(i));
        this.f1357b.a((Map<String, Object>) hashMap);
    }
}
