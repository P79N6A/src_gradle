package com.google.common.a;

import com.google.common.annotations.GwtCompatible;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class j extends e {
    public static int a(@NullableDecl Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static boolean a(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
