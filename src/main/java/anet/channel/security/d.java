package anet.channel.security;

public final class d implements ISecurityFactory {
    d() {
    }

    public final ISecurity createNonSecurity(String str) {
        return new a(str);
    }

    public final ISecurity createSecurity(String str) {
        return new b(str);
    }
}
