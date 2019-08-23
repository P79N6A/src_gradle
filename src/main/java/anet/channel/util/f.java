package anet.channel.util;

import java.net.Inet6Address;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public int f1445a;

    /* renamed from: b  reason: collision with root package name */
    public Inet6Address f1446b;

    public String toString() {
        return this.f1446b.getHostAddress() + "/" + this.f1445a;
    }

    public f(Inet6Address inet6Address, int i) {
        this.f1445a = i;
        this.f1446b = inet6Address;
    }
}
