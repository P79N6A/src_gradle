package com.airbnb.lottie.c;

import android.support.annotation.CheckResult;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class e {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public f f4795a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f4796b;

    private boolean a() {
        return this.f4796b.get(this.f4796b.size() - 1).equals("**");
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f4796b);
        sb.append(",resolved=");
        if (this.f4795a != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    private static boolean b(String str) {
        return str.equals("__container");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final e a(f fVar) {
        e eVar = new e(this);
        eVar.f4795a = fVar;
        return eVar;
    }

    public e(String... strArr) {
        this.f4796b = Arrays.asList(strArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @CheckResult
    public final e a(String str) {
        e eVar = new e(this);
        eVar.f4796b.add(str);
        return eVar;
    }

    private e(e eVar) {
        this.f4796b = new ArrayList(eVar.f4796b);
        this.f4795a = eVar.f4795a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final int b(String str, int i) {
        if (b(str)) {
            return 0;
        }
        if (!this.f4796b.get(i).equals("**")) {
            return 1;
        }
        if (i != this.f4796b.size() - 1 && this.f4796b.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean d(String str, int i) {
        if (!str.equals("__container") && i >= this.f4796b.size() - 1 && !this.f4796b.get(i).equals("**")) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean a(String str, int i) {
        if (b(str)) {
            return true;
        }
        if (i >= this.f4796b.size()) {
            return false;
        }
        if (this.f4796b.get(i).equals(str) || this.f4796b.get(i).equals("**") || this.f4796b.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean c(String str, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (i >= this.f4796b.size()) {
            return false;
        }
        if (i == this.f4796b.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.f4796b.get(i);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((z || (i == this.f4796b.size() - 2 && a())) && z3) {
                return true;
            }
            return false;
        }
        if (z || !this.f4796b.get(i + 1).equals(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (i == this.f4796b.size() - 2 || (i == this.f4796b.size() - 3 && a())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f4796b.size() - 1) {
                return false;
            }
            return this.f4796b.get(i2).equals(str);
        }
    }
}
