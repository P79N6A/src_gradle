package kotlin;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0000H\u0002J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lkotlin/KotlinVersion;", "", "major", "", "minor", "(II)V", "patch", "(III)V", "getMajor", "()I", "getMinor", "getPatch", "version", "compareTo", "other", "equals", "", "", "hashCode", "isAtLeast", "toString", "", "versionOf", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class g implements Comparable<g> {
    @NotNull
    @JvmField

    /* renamed from: d  reason: collision with root package name */
    public static final g f83535d = new g(1, 3, 41);

    /* renamed from: e  reason: collision with root package name */
    public static final a f83536e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f83537a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final int f83538b = 3;

    /* renamed from: c  reason: collision with root package name */
    public final int f83539c = 41;

    /* renamed from: f  reason: collision with root package name */
    private final int f83540f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/KotlinVersion$Companion;", "", "()V", "CURRENT", "Lkotlin/KotlinVersion;", "MAX_COMPONENT_VALUE", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int hashCode() {
        return this.f83540f;
    }

    @NotNull
    public final String toString() {
        return this.f83537a + '.' + this.f83538b + '.' + this.f83539c;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        g gVar = (g) obj;
        Intrinsics.checkParameterIsNotNull(gVar, "other");
        return this.f83540f - gVar.f83540f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            obj = null;
        }
        g gVar = (g) obj;
        if (gVar != null && this.f83540f == gVar.f83540f) {
            return true;
        }
        return false;
    }

    public final boolean a(int i, int i2, int i3) {
        if (this.f83537a > i || (this.f83537a == i && (this.f83538b > i2 || (this.f83538b == i2 && this.f83539c >= i3)))) {
            return true;
        }
        return false;
    }

    private g(int i, int i2, int i3) {
        boolean z = true;
        int i4 = this.f83537a;
        int i5 = this.f83538b;
        int i6 = this.f83539c;
        if ((i4 < 0 || 255 < i4 || i5 < 0 || 255 < i5 || i6 < 0 || 255 < i6) ? false : z) {
            this.f83540f = (i4 << 16) + (i5 << 8) + i6;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i4 + '.' + i5 + '.' + i6).toString());
    }
}
