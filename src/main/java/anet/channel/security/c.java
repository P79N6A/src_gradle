package anet.channel.security;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ISecurityFactory f1284a;

    public static ISecurityFactory a() {
        if (f1284a == null) {
            f1284a = new d();
        }
        return f1284a;
    }
}
