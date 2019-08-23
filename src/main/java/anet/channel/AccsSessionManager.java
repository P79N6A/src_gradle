package anet.channel;

import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IStrategyInstance;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class AccsSessionManager {

    /* renamed from: a  reason: collision with root package name */
    SessionCenter f1100a;

    /* renamed from: b  reason: collision with root package name */
    Set<String> f1101b = Collections.EMPTY_SET;

    private boolean a() {
        if (!GlobalAppRuntimeInfo.isAppBackground() && NetworkStatusHelper.isConnected()) {
            return true;
        }
        return false;
    }

    public synchronized void checkAndStartSession() {
        String str;
        Collection<SessionInfo> a2 = this.f1100a.g.a();
        Set<String> set = Collections.EMPTY_SET;
        if (!a2.isEmpty()) {
            set = new TreeSet<>();
        }
        for (SessionInfo sessionInfo : a2) {
            if (sessionInfo.isKeepAlive) {
                IStrategyInstance instance = StrategyCenter.getInstance();
                String str2 = sessionInfo.host;
                if (sessionInfo.isAccs) {
                    str = "https";
                } else {
                    str = "http";
                }
                set.add(StringUtils.concatString(instance.getSchemeByHost(str2, str), "://", sessionInfo.host));
            }
        }
        for (String next : this.f1101b) {
            if (!set.contains(next)) {
                a(next);
            }
        }
        if (a()) {
            for (String next2 : set) {
                try {
                    this.f1100a.get(next2, ConnType.TypeLevel.SPDY, 0);
                } catch (Exception unused) {
                    ALog.e("start session failed", null, "host", next2);
                }
            }
            this.f1101b = set;
        }
    }

    AccsSessionManager(SessionCenter sessionCenter) {
        this.f1100a = sessionCenter;
    }

    private void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            ALog.d("awcn.AccsSessionManager", "closeSessions", this.f1100a.f1133c, "host", str);
            this.f1100a.a(str).b(false);
        }
    }

    public synchronized void forceCloseSession(boolean z) {
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.AccsSessionManager", "forceCloseSession", this.f1100a.f1133c, "reCreate", Boolean.valueOf(z));
        }
        for (String a2 : this.f1101b) {
            a(a2);
        }
        if (z) {
            checkAndStartSession();
        }
    }
}
