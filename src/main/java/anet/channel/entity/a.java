package anet.channel.entity;

import anet.channel.strategy.IConnStrategy;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final IConnStrategy f1203a;

    /* renamed from: b  reason: collision with root package name */
    public int f1204b;

    /* renamed from: c  reason: collision with root package name */
    public int f1205c;

    /* renamed from: d  reason: collision with root package name */
    private String f1206d;

    /* renamed from: e  reason: collision with root package name */
    private String f1207e;

    public String f() {
        return this.f1206d;
    }

    public String h() {
        return this.f1207e;
    }

    public String a() {
        if (this.f1203a != null) {
            return this.f1203a.getIp();
        }
        return null;
    }

    public int b() {
        if (this.f1203a != null) {
            return this.f1203a.getPort();
        }
        return 0;
    }

    public int g() {
        if (this.f1203a != null) {
            return this.f1203a.getHeartbeat();
        }
        return 45000;
    }

    public ConnType c() {
        if (this.f1203a != null) {
            return ConnType.valueOf(this.f1203a.getProtocol());
        }
        return ConnType.HTTP;
    }

    public int d() {
        if (this.f1203a == null || this.f1203a.getConnectionTimeout() == 0) {
            return 20000;
        }
        return this.f1203a.getConnectionTimeout();
    }

    public int e() {
        if (this.f1203a == null || this.f1203a.getReadTimeout() == 0) {
            return 20000;
        }
        return this.f1203a.getReadTimeout();
    }

    public String toString() {
        return "ConnInfo [ip=" + a() + ",port=" + b() + ",type=" + c() + ",hb" + g() + "]";
    }

    public a(String str, String str2, IConnStrategy iConnStrategy) {
        this.f1203a = iConnStrategy;
        this.f1206d = str;
        this.f1207e = str2;
    }
}
