package com.zhihu.matisse;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.support.v4.app.Fragment;
import com.ss.android.ugc.aweme.C0906R;
import com.zhihu.matisse.a.a;
import com.zhihu.matisse.internal.entity.d;
import com.zhihu.matisse.ui.MatisseActivity;
import java.util.ArrayList;
import java.util.Set;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f82622a;

    /* renamed from: b  reason: collision with root package name */
    private final d f82623b;

    public final c a(float f2) {
        this.f82623b.o = 0.85f;
        return this;
    }

    public final c b(boolean z) {
        this.f82623b.f82651f = false;
        return this;
    }

    public final c c(int i) {
        this.f82623b.f82650e = -1;
        return this;
    }

    public final c a(@StyleRes int i) {
        this.f82623b.f82649d = C0906R.style.g6;
        return this;
    }

    public final c a(a aVar) {
        this.f82623b.p = aVar;
        return this;
    }

    public final void d(int i) {
        Activity a2 = this.f82622a.a();
        if (a2 != null) {
            Intent intent = new Intent(a2, MatisseActivity.class);
            Fragment b2 = this.f82622a.b();
            if (b2 != null) {
                b2.startActivityForResult(intent, i);
            } else {
                a2.startActivityForResult(intent, i);
            }
        }
    }

    public final c a(@NonNull com.zhihu.matisse.b.a aVar) {
        if (this.f82623b.j == null) {
            this.f82623b.j = new ArrayList();
        }
        this.f82623b.j.add(aVar);
        return this;
    }

    public final c b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSelectable must be greater than or equal to one");
        } else if (this.f82623b.h > 0 || this.f82623b.i > 0) {
            throw new IllegalStateException("already set maxImageSelectable and maxVideoSelectable");
        } else {
            this.f82623b.g = i;
            return this;
        }
    }

    public final c a(boolean z) {
        this.f82623b.f82648c = true;
        return this;
    }

    c(a aVar, @NonNull Set<b> set, boolean z) {
        this.f82622a = aVar;
        d a2 = d.a();
        a2.f82646a = null;
        a2.f82647b = true;
        a2.f82648c = false;
        a2.f82649d = C0906R.style.g7;
        a2.f82650e = 0;
        a2.f82651f = false;
        a2.g = 1;
        a2.h = 0;
        a2.i = 0;
        a2.j = null;
        a2.k = false;
        a2.l = null;
        a2.m = 3;
        a2.n = 0;
        a2.o = 0.5f;
        a2.p = new com.zhihu.matisse.a.a.a();
        a2.q = true;
        a2.s = false;
        a2.t = false;
        a2.u = Integer.MAX_VALUE;
        this.f82623b = a2;
        this.f82623b.f82646a = set;
        this.f82623b.f82647b = z;
        this.f82623b.f82650e = -1;
    }
}
