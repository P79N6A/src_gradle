package a;

import java.util.Locale;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final f f1040a;

    public final boolean a() {
        return this.f1040a.a();
    }

    public final String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(this.f1040a.a())});
    }

    d(f fVar) {
        this.f1040a = fVar;
    }
}
