package kotlinx.coroutines.b;

import kotlin.Metadata;
import kotlinx.coroutines.b.a;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
public final /* synthetic */ class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f83845a;

    static {
        int[] iArr = new int[a.c.values().length];
        f83845a = iArr;
        iArr[a.c.PARKING.ordinal()] = 1;
        f83845a[a.c.BLOCKING.ordinal()] = 2;
        f83845a[a.c.CPU_ACQUIRED.ordinal()] = 3;
        f83845a[a.c.RETIRING.ordinal()] = 4;
        f83845a[a.c.TERMINATED.ordinal()] = 5;
    }
}
