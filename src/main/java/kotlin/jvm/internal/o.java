package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\f\u001a~\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00112(\u0010\u0012\u001a$\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0013H\b¢\u0006\u0002\u0010\u0014\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"EMPTY", "", "", "[Ljava/lang/Object;", "MAX_SIZE", "", "collectionToArray", "collection", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "toArrayImpl", "empty", "Lkotlin/Function0;", "alloc", "Lkotlin/Function1;", "trim", "Lkotlin/Function2;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 1, 15})
@JvmName
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f83595a = new Object[0];

    @NotNull
    @JvmName
    public static final Object[] a(@NotNull Collection<?> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "collection");
        int size = collection.size();
        if (size == 0) {
            return f83595a;
        }
        Iterator<?> it2 = collection.iterator();
        if (!it2.hasNext()) {
            return f83595a;
        }
        Object[] objArr = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr[i] = it2.next();
            if (i2 >= objArr.length) {
                if (!it2.hasNext()) {
                    return objArr;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    if (i2 < 2147483645) {
                        i3 = 2147483645;
                    } else {
                        throw new OutOfMemoryError();
                    }
                }
                objArr = Arrays.copyOf(objArr, i3);
                Intrinsics.checkExpressionValueIsNotNull(objArr, "Arrays.copyOf(result, newSize)");
            } else if (!it2.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr, i2);
                Intrinsics.checkExpressionValueIsNotNull(copyOf, "Arrays.copyOf(result, size)");
                return copyOf;
            }
            i = i2;
        }
    }

    @NotNull
    @JvmName
    public static final Object[] a(@NotNull Collection<?> collection, @Nullable Object[] objArr) {
        Object[] objArr2;
        Intrinsics.checkParameterIsNotNull(collection, "collection");
        if (objArr != null) {
            int size = collection.size();
            int i = 0;
            if (size == 0) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
                return objArr;
            }
            Iterator<?> it2 = collection.iterator();
            if (!it2.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
                return objArr;
            }
            if (size <= objArr.length) {
                objArr2 = objArr;
            } else {
                Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                if (newInstance != null) {
                    objArr2 = (Object[]) newInstance;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
            while (true) {
                int i2 = i + 1;
                objArr2[i] = it2.next();
                if (i2 >= objArr2.length) {
                    if (!it2.hasNext()) {
                        return objArr2;
                    }
                    int i3 = ((i2 * 3) + 1) >>> 1;
                    if (i3 <= i2) {
                        if (i2 < 2147483645) {
                            i3 = 2147483645;
                        } else {
                            throw new OutOfMemoryError();
                        }
                    }
                    objArr2 = Arrays.copyOf(objArr2, i3);
                    Intrinsics.checkExpressionValueIsNotNull(objArr2, "Arrays.copyOf(result, newSize)");
                } else if (!it2.hasNext()) {
                    if (objArr2 == objArr) {
                        objArr[i2] = null;
                        return objArr;
                    }
                    Object[] copyOf = Arrays.copyOf(objArr2, i2);
                    Intrinsics.checkExpressionValueIsNotNull(copyOf, "Arrays.copyOf(result, size)");
                    return copyOf;
                }
                i = i2;
            }
        } else {
            throw new NullPointerException();
        }
    }
}
