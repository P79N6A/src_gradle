package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface c {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<b> f23462a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public Map<String, Integer> f23463b = new HashMap();
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f23464a;

        /* renamed from: b  reason: collision with root package name */
        public final String f23465b;

        /* renamed from: c  reason: collision with root package name */
        public final float f23466c;

        /* renamed from: d  reason: collision with root package name */
        public final String f23467d;

        protected b(String str, String str2, float f2, String str3) {
            this.f23464a = str;
            this.f23465b = str2;
            this.f23466c = f2;
            this.f23467d = str3;
        }
    }

    /* renamed from: com.facebook.cache.disk.c$c  reason: collision with other inner class name */
    public interface C0253c {
        String a();

        long b();

        long c();
    }

    public interface d {
        BinaryResource a() throws IOException;

        void a(f fVar) throws IOException;

        boolean b();
    }

    long a(C0253c cVar) throws IOException;

    d a(String str, Object obj) throws IOException;

    boolean a();

    long b(String str) throws IOException;

    BinaryResource b(String str, Object obj) throws IOException;

    boolean b();

    void c();

    boolean c(String str, Object obj) throws IOException;

    void d() throws IOException;

    boolean d(String str, Object obj) throws IOException;

    a e() throws IOException;

    Collection<C0253c> f() throws IOException;
}
