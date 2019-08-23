package anet.channel;

import anet.channel.security.ISecurity;
import anet.channel.strategy.dispatch.IAmdcSign;

public class c implements IAmdcSign {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f1177a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ISecurity f1178b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SessionCenter f1179c;

    public String getAppkey() {
        return this.f1177a;
    }

    public boolean useSecurityGuard() {
        if (!this.f1178b.isSecOff()) {
            return true;
        }
        return false;
    }

    public String sign(String str) {
        return this.f1178b.sign(this.f1179c.f1132b, "HMAC_SHA1", getAppkey(), str);
    }

    c(SessionCenter sessionCenter, String str, ISecurity iSecurity) {
        this.f1179c = sessionCenter;
        this.f1177a = str;
        this.f1178b = iSecurity;
    }
}
