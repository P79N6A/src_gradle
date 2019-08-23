package com.bytedance.frameworks.baselib.a;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.ea;
import java.util.List;

public abstract class b {

    /* renamed from: b  reason: collision with root package name */
    public String f19676b;

    /* renamed from: c  reason: collision with root package name */
    public C0157b f19677c;

    /* renamed from: d  reason: collision with root package name */
    protected e f19678d;

    /* renamed from: e  reason: collision with root package name */
    public String f19679e;

    /* renamed from: f  reason: collision with root package name */
    public c f19680f;
    public long g;
    public long h;

    public static abstract class a implements C0157b {
        public int c() {
            return 4;
        }

        public long d() {
            return ea.f66827f;
        }
    }

    /* renamed from: com.bytedance.frameworks.baselib.a.b$b  reason: collision with other inner class name */
    public interface C0157b {
        String a();

        List<String> b();

        int c();

        long d();
    }

    public interface c {
        boolean a();

        long b();

        boolean c();

        long d();
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(String str, byte[] bArr);

    private boolean a(byte[] bArr) {
        return this.f19678d.a(this.f19676b, bArr);
    }

    public final boolean a(String str) {
        return a(d.a(str));
    }

    public b(Context context, C0157b bVar, c cVar) {
        this.f19677c = bVar;
        this.f19680f = cVar;
        if (this.f19677c == null) {
            throw new IllegalArgumentException("config is null.");
        } else if (this.f19680f != null) {
            this.f19676b = bVar.a();
            if (!TextUtils.isEmpty(this.f19676b)) {
                this.f19678d = e.a(context);
                e eVar = this.f19678d;
                String str = this.f19676b;
                if (!eVar.a()) {
                    eVar.f19688a.put(str, this);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("type is empty.");
        } else {
            throw new IllegalArgumentException("responseConfig is null");
        }
    }
}
