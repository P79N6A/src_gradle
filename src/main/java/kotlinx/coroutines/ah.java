package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
public final /* synthetic */ class ah {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f83793a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f83794b;

    static {
        int[] iArr = new int[ag.values().length];
        f83793a = iArr;
        iArr[ag.DEFAULT.ordinal()] = 1;
        f83793a[ag.ATOMIC.ordinal()] = 2;
        f83793a[ag.UNDISPATCHED.ordinal()] = 3;
        f83793a[ag.LAZY.ordinal()] = 4;
        int[] iArr2 = new int[ag.values().length];
        f83794b = iArr2;
        iArr2[ag.DEFAULT.ordinal()] = 1;
        f83794b[ag.ATOMIC.ordinal()] = 2;
        f83794b[ag.UNDISPATCHED.ordinal()] = 3;
        f83794b[ag.LAZY.ordinal()] = 4;
    }
}
