package com.facebook.imagepipeline.common;

import com.facebook.common.f.b;
import com.facebook.common.internal.Preconditions;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
public final class a {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private static Pattern f23887a;
    public final int from;
    public final int to;

    public final int hashCode() {
        return b.a(this.from, this.to);
    }

    public final String toHttpRangeHeaderValue() {
        return String.format(null, "bytes=%s-%s", new Object[]{a(this.from), a(this.to)});
    }

    public final String toString() {
        return String.format(null, "%s-%s", new Object[]{a(this.from), a(this.to)});
    }

    private static String a(int i) {
        if (i == Integer.MAX_VALUE) {
            return "";
        }
        return Integer.toString(i);
    }

    public static a toMax(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return new a(0, i);
    }

    public static a from(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return new a(i, Integer.MAX_VALUE);
    }

    public final boolean contains(@Nullable a aVar) {
        if (aVar != null && this.from <= aVar.from && this.to >= aVar.to) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.from == aVar.from && this.to == aVar.to) {
            return true;
        }
        return false;
    }

    @Nullable
    public static a fromContentRangeHeader(@Nullable String str) throws IllegalArgumentException {
        boolean z;
        boolean z2;
        boolean z3;
        if (str == null) {
            return null;
        }
        if (f23887a == null) {
            f23887a = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = f23887a.split(str);
            if (split.length == 4) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            Preconditions.checkArgument(split[0].equals("bytes"));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            if (parseInt2 > parseInt) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.checkArgument(z2);
            if (parseInt3 > parseInt2) {
                z3 = true;
            } else {
                z3 = false;
            }
            Preconditions.checkArgument(z3);
            if (parseInt2 < parseInt3 - 1) {
                return new a(parseInt, parseInt2);
            }
            return new a(parseInt, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", new Object[]{str}), e2);
        }
    }

    public a(int i, int i2) {
        this.from = i;
        this.to = i2;
    }
}
