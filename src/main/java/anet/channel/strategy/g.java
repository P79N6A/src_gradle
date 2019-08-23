package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.strategy.c;
import anet.channel.strategy.dispatch.DispatchEvent;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.l;
import anet.channel.strategy.utils.a;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

public class g implements IStrategyInstance, HttpDispatcher.IDispatchEventListener {

    /* renamed from: a  reason: collision with root package name */
    boolean f1380a;

    /* renamed from: b  reason: collision with root package name */
    StrategyInfoHolder f1381b;

    /* renamed from: c  reason: collision with root package name */
    long f1382c;

    /* renamed from: d  reason: collision with root package name */
    CopyOnWriteArraySet<IStrategyListener> f1383d = new CopyOnWriteArraySet<>();

    /* renamed from: e  reason: collision with root package name */
    private IStrategyFilter f1384e = new h(this);

    g() {
    }

    /* access modifiers changed from: private */
    public boolean a() {
        if (this.f1381b != null) {
            return false;
        }
        ALog.w("StrategyCenter not initialized", null, "isInitialized", Boolean.valueOf(this.f1380a));
        return true;
    }

    public String getClientIp() {
        if (a()) {
            return "";
        }
        return this.f1381b.d().f1341b;
    }

    public synchronized void switchEnv() {
        m.a();
        HttpDispatcher.getInstance().switchENV();
        if (this.f1381b != null) {
            this.f1381b.b();
            this.f1381b = StrategyInfoHolder.a();
        }
    }

    public synchronized void saveData() {
        ALog.i("awcn.StrategyCenter", "saveData", null, new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f1382c > 30000) {
            this.f1382c = currentTimeMillis;
            a.a(new i(this), 500);
        }
    }

    public List<IConnStrategy> getConnStrategyListByHost(String str) {
        return getConnStrategyListByHost(str, this.f1384e);
    }

    @Deprecated
    public String getSchemeByHost(String str) {
        return getSchemeByHost(str, null);
    }

    public String getCNameByHost(String str) {
        if (a() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f1381b.d().getCnameByHost(str);
    }

    public String getUnitByHost(String str) {
        if (a()) {
            return null;
        }
        return this.f1381b.f1330b.b(str);
    }

    public void registerListener(IStrategyListener iStrategyListener) {
        ALog.e("awcn.StrategyCenter", "registerListener", null, "listener", this.f1383d);
        if (iStrategyListener != null) {
            this.f1383d.add(iStrategyListener);
        }
    }

    public void unregisterListener(IStrategyListener iStrategyListener) {
        ALog.e("awcn.StrategyCenter", "unregisterListener", null, "listener", this.f1383d);
        this.f1383d.remove(iStrategyListener);
    }

    public void forceRefreshStrategy(String str) {
        if (!a() && !TextUtils.isEmpty(str)) {
            ALog.i("awcn.StrategyCenter", "force refresh strategy", null, "host", str);
            this.f1381b.d().a(str, true);
        }
    }

    public String getFormalizeUrl(String str) {
        HttpUrl parse = HttpUrl.parse(str);
        if (parse == null) {
            ALog.e("awcn.StrategyCenter", "url is invalid.", null, "URL", str);
            return null;
        }
        String urlString = parse.urlString();
        try {
            String schemeByHost = getSchemeByHost(parse.host(), parse.scheme());
            if (!schemeByHost.equalsIgnoreCase(parse.scheme())) {
                urlString = StringUtils.concatString(schemeByHost, ":", str.substring(str.indexOf("//")));
            }
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.StrategyCenter", "", null, "raw", StringUtils.simplifyString(str, SearchJediMixFeedAdapter.f42517f), "ret", StringUtils.simplifyString(urlString, SearchJediMixFeedAdapter.f42517f));
            }
        } catch (Exception e2) {
            ALog.e("awcn.StrategyCenter", "getFormalizeUrl failed", null, e2, "raw", str);
        }
        return urlString;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void initialize(android.content.Context r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f1380a     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0040
            if (r6 != 0) goto L_0x0008
            goto L_0x0040
        L_0x0008:
            r0 = 0
            r1 = 0
            java.lang.String r2 = "awcn.StrategyCenter"
            java.lang.String r3 = "StrategyCenter initialize started."
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0034 }
            anet.channel.util.ALog.i(r2, r3, r1, r4)     // Catch:{ Exception -> 0x0034 }
            anet.channel.strategy.dispatch.a.a((android.content.Context) r6)     // Catch:{ Exception -> 0x0034 }
            anet.channel.strategy.m.a((android.content.Context) r6)     // Catch:{ Exception -> 0x0034 }
            anet.channel.strategy.dispatch.HttpDispatcher r6 = anet.channel.strategy.dispatch.HttpDispatcher.getInstance()     // Catch:{ Exception -> 0x0034 }
            r6.addListener(r5)     // Catch:{ Exception -> 0x0034 }
            anet.channel.strategy.StrategyInfoHolder r6 = anet.channel.strategy.StrategyInfoHolder.a()     // Catch:{ Exception -> 0x0034 }
            r5.f1381b = r6     // Catch:{ Exception -> 0x0034 }
            r6 = 1
            r5.f1380a = r6     // Catch:{ Exception -> 0x0034 }
            java.lang.String r6 = "awcn.StrategyCenter"
            java.lang.String r2 = "StrategyCenter initialize finished."
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0034 }
            anet.channel.util.ALog.i(r6, r2, r1, r3)     // Catch:{ Exception -> 0x0034 }
            monitor-exit(r5)
            return
        L_0x0034:
            r6 = move-exception
            java.lang.String r2 = "awcn.StrategyCenter"
            java.lang.String r3 = "StrategyCenter initialize failed."
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0042 }
            anet.channel.util.ALog.e(r2, r3, r1, r6, r0)     // Catch:{ all -> 0x0042 }
            monitor-exit(r5)
            return
        L_0x0040:
            monitor-exit(r5)
            return
        L_0x0042:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.g.initialize(android.content.Context):void");
    }

    public void onEvent(DispatchEvent dispatchEvent) {
        if (dispatchEvent.eventType == 1 && this.f1381b != null) {
            ALog.d("awcn.StrategyCenter", "receive amdc event", null, new Object[0]);
            l.d a2 = l.a((JSONObject) dispatchEvent.extraObject);
            if (a2 != null) {
                this.f1381b.a(a2);
                saveData();
                Iterator<IStrategyListener> it2 = this.f1383d.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().onStrategyUpdated(a2);
                    } catch (Exception e2) {
                        ALog.e("awcn.StrategyCenter", "onStrategyUpdated failed", null, e2, new Object[0]);
                    }
                }
            }
        }
    }

    public String getSchemeByHost(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (a()) {
            return str2;
        }
        String a2 = this.f1381b.f1330b.a(str);
        if (a2 != null || TextUtils.isEmpty(str2)) {
            str2 = a2;
        }
        if (str2 == null) {
            str2 = c.a.f1353a.a(str);
            if (str2 == null) {
                str2 = "http";
            }
        }
        ALog.d("awcn.StrategyCenter", "getSchemeByHost", null, "host", str, "scheme", str2);
        return str2;
    }

    public List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter) {
        boolean z;
        if (TextUtils.isEmpty(str) || a()) {
            return Collections.EMPTY_LIST;
        }
        String cnameByHost = this.f1381b.d().getCnameByHost(str);
        if (!TextUtils.isEmpty(cnameByHost)) {
            str = cnameByHost;
        }
        List<IConnStrategy> queryByHost = this.f1381b.d().queryByHost(str);
        if (queryByHost.isEmpty()) {
            queryByHost = this.f1381b.f1331c.a(str);
        }
        if (queryByHost.isEmpty() || iStrategyFilter == null) {
            ALog.d("getConnStrategyListByHost", null, "host", str, "result", queryByHost);
            return queryByHost;
        }
        if (!AwcnConfig.isIpv6Enable() || (AwcnConfig.isIpv6BlackListEnable() && this.f1381b.d().a(str, AwcnConfig.getIpv6BlackListTtl()))) {
            z = true;
        } else {
            z = false;
        }
        ListIterator<IConnStrategy> listIterator = queryByHost.listIterator();
        while (listIterator.hasNext()) {
            IConnStrategy next = listIterator.next();
            if (!iStrategyFilter.accept(next)) {
                listIterator.remove();
            }
            if (z && anet.channel.strategy.utils.c.b(next.getIp())) {
                listIterator.remove();
            }
        }
        if (ALog.isPrintLog(1)) {
            ALog.d("getConnStrategyListByHost", null, "host", str, "result", queryByHost);
        }
        return queryByHost;
    }

    public void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if (!a() && iConnStrategy != null && (iConnStrategy instanceof IPConnStrategy)) {
            IPConnStrategy iPConnStrategy = (IPConnStrategy) iConnStrategy;
            if (iPConnStrategy.f1318b == 1) {
                this.f1381b.f1331c.a(str, iConnStrategy, connEvent);
            } else if (iPConnStrategy.f1318b == 0) {
                this.f1381b.d().a(str, iConnStrategy, connEvent);
            }
        }
    }
}
