package kotlin;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f83541a;

    static {
        int[] iArr = new int[LazyThreadSafetyMode.values().length];
        f83541a = iArr;
        iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
        f83541a[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
        f83541a[LazyThreadSafetyMode.NONE.ordinal()] = 3;
    }
}
