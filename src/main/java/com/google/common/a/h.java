package com.google.common.a;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.Iterator;

@GwtCompatible
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f24404a;

    public static h a(String str) {
        return new h(str);
    }

    private h(String str) {
        this.f24404a = (String) m.a(str);
    }

    private static CharSequence a(Object obj) {
        m.a(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public final String a(Iterable<?> iterable) {
        return a(new StringBuilder(), iterable.iterator()).toString();
    }

    @CanIgnoreReturnValue
    private StringBuilder a(StringBuilder sb, Iterator<?> it2) {
        try {
            m.a(sb);
            if (it2.hasNext()) {
                sb.append(a((Object) it2.next()));
                while (it2.hasNext()) {
                    sb.append(this.f24404a);
                    sb.append(a((Object) it2.next()));
                }
            }
            return sb;
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
