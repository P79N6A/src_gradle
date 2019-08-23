package com.ss.ugc.live.a.a;

import com.ss.ugc.live.a.l;
import java.io.FileNotFoundException;

public final class d extends a {
    public final void a() {
        if (this.f78587a != null) {
            this.f78587a.a((String) null);
            return;
        }
        throw new IllegalStateException("Effect is not bind");
    }

    public final void a(boolean z) {
        if (this.f78587a != null) {
            this.f78587a.a(z);
            return;
        }
        throw new IllegalStateException("Effect is not bind");
    }

    public final void a(String[] strArr) {
        int i;
        if (this.f78587a != null) {
            c cVar = this.f78587a;
            if (strArr != null) {
                i = strArr.length;
            } else {
                i = 0;
            }
            cVar.a(strArr, i);
            return;
        }
        throw new IllegalStateException("Effect is not bind");
    }

    public final void a(String str, boolean z) throws FileNotFoundException {
        if (!l.a(str)) {
            throw new FileNotFoundException("Filter file not exists:" + str);
        } else if (this.f78587a != null) {
            this.f78587a.a(str, z);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }

    public final void a(String str, String str2, float f2) throws FileNotFoundException {
        if (!l.a(str)) {
            throw new FileNotFoundException("Filter file not exists:" + str);
        } else if (this.f78587a != null) {
            this.f78587a.b(str, str2, f2);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }

    public final void a(String str, String str2, boolean z) {
        if ("".equals(str)) {
            throw new RuntimeException("renderCacheKey is Null");
        } else if ("".equals(str2)) {
            throw new RuntimeException("resPath is Null");
        } else if (this.f78587a != null) {
            this.f78587a.a(str, str2, z);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }
}
