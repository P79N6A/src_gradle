package com.meizu.cloud.pushsdk.b.e;

import com.meizu.cloud.pushsdk.b.c.g;
import com.meizu.cloud.pushsdk.b.c.j;
import com.meizu.cloud.pushsdk.b.d.a;
import com.meizu.cloud.pushsdk.b.g.e;
import com.meizu.cloud.pushsdk.b.g.f;
import com.meizu.cloud.pushsdk.b.g.k;
import java.io.IOException;

public class b extends j {

    /* renamed from: a  reason: collision with root package name */
    private final j f26987a;

    /* renamed from: b  reason: collision with root package name */
    private com.meizu.cloud.pushsdk.b.g.b f26988b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public d f26989c;

    public b(j jVar, a aVar) {
        this.f26987a = jVar;
        if (aVar != null) {
            this.f26989c = new d(aVar);
        }
    }

    private k a(k kVar) {
        return new e(kVar) {

            /* renamed from: a  reason: collision with root package name */
            long f26990a;

            /* renamed from: b  reason: collision with root package name */
            long f26991b;

            public void a(com.meizu.cloud.pushsdk.b.g.a aVar, long j) throws IOException {
                super.a(aVar, j);
                if (this.f26991b == 0) {
                    this.f26991b = b.this.b();
                }
                this.f26990a += j;
                if (b.this.f26989c != null) {
                    b.this.f26989c.obtainMessage(1, new com.meizu.cloud.pushsdk.b.f.a(this.f26990a, this.f26991b)).sendToTarget();
                }
            }
        };
    }

    public g a() {
        return this.f26987a.a();
    }

    public void a(com.meizu.cloud.pushsdk.b.g.b bVar) throws IOException {
        if (this.f26988b == null) {
            this.f26988b = f.a(a((k) bVar));
        }
        this.f26987a.a(this.f26988b);
        this.f26988b.flush();
    }

    public long b() throws IOException {
        return this.f26987a.b();
    }
}
