package anet.channel.strategy;

import java.util.concurrent.ConcurrentHashMap;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f1351a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f1352b = true;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static c f1353a = new c();

        private a() {
        }
    }

    public void a(boolean z) {
        this.f1352b = z;
    }

    public void b(String str) {
        this.f1351a.put(str, "http");
    }

    public String a(String str) {
        if (!this.f1352b) {
            return null;
        }
        String str2 = this.f1351a.get(str);
        if (str2 == null) {
            str2 = "https";
            this.f1351a.put(str, str2);
        }
        return str2;
    }
}
