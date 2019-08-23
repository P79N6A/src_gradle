package com.ss.ugc.live.a.a;

import com.ss.ugc.live.a.l;
import java.io.FileNotFoundException;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private String f78589c;

    public final void a() {
        this.f78587a.a((String) null, 1.0f);
    }

    public final void a(String str) throws FileNotFoundException {
        if (!l.a(str)) {
            throw new FileNotFoundException("Filter file not exits:" + str);
        } else if (this.f78587a != null) {
            this.f78589c = str;
            this.f78587a.a(this.f78589c, 1.0f);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }

    public final int a(String str, String str2, float f2) throws FileNotFoundException {
        if (!l.a(str)) {
            throw new FileNotFoundException("Filter file not exits:" + str);
        } else if (!l.a(str2)) {
            throw new FileNotFoundException("Filter file not exits:" + str2);
        } else if (this.f78587a != null) {
            return this.f78587a.a(str, str2, f2);
        } else {
            throw new IllegalStateException("Effect is not bind");
        }
    }
}
