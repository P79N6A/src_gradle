package com.tencent.open.a;

import java.io.File;

public final class d {

    public static final class a {
        public static final boolean a(int i, int i2) {
            return i2 == (i & i2);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public File f79666a;

        /* renamed from: b  reason: collision with root package name */
        public long f79667b;

        /* renamed from: c  reason: collision with root package name */
        public long f79668c;

        public final String toString() {
            return String.format("[%s : %d / %d]", new Object[]{this.f79666a.getAbsolutePath(), Long.valueOf(this.f79668c), Long.valueOf(this.f79667b)});
        }
    }
}
