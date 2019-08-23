package com.meizu.cloud.pushsdk.b.c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class b extends j {

    /* renamed from: a  reason: collision with root package name */
    private static final g f26907a = g.a("application/x-www-form-urlencoded");

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f26908b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f26909c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f26910a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f26911b = new ArrayList();

        public final a a(String str, String str2) {
            this.f26910a.add(f.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            this.f26911b.add(f.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true));
            return this;
        }

        public final b a() {
            return new b(this.f26910a, this.f26911b);
        }

        public final a b(String str, String str2) {
            this.f26910a.add(f.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            this.f26911b.add(f.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true));
            return this;
        }
    }

    private b(List<String> list, List<String> list2) {
        this.f26908b = m.a(list);
        this.f26909c = m.a(list2);
    }

    private long a(com.meizu.cloud.pushsdk.b.g.b bVar, boolean z) {
        com.meizu.cloud.pushsdk.b.g.a aVar = z ? new com.meizu.cloud.pushsdk.b.g.a() : bVar.b();
        int size = this.f26908b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                aVar.b(38);
            }
            aVar.b(this.f26908b.get(i));
            aVar.b(61);
            aVar.b(this.f26909c.get(i));
        }
        if (!z) {
            return 0;
        }
        long a2 = aVar.a();
        aVar.j();
        return a2;
    }

    public g a() {
        return f26907a;
    }

    public void a(com.meizu.cloud.pushsdk.b.g.b bVar) throws IOException {
        a(bVar, false);
    }

    public long b() {
        return a(null, true);
    }
}
