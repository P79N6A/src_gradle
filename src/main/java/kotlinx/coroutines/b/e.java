package kotlinx.coroutines.b;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.j;
import kotlinx.coroutines.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/scheduling/GlobalQueue;", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "Lkotlinx/coroutines/scheduling/Task;", "()V", "removeFirstWithModeOrNull", "mode", "Lkotlinx/coroutines/scheduling/TaskMode;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class e extends j<i> {
    public e() {
        super(false);
    }

    @Nullable
    public final i a(@NotNull l lVar) {
        Object obj;
        Object obj2;
        Intrinsics.checkParameterIsNotNull(lVar, "mode");
        while (true) {
            k kVar = (k) this._cur$internal;
            while (true) {
                long j = kVar._state$internal;
                obj = null;
                if ((1152921504606846976L & j) == 0) {
                    boolean z = false;
                    int i = (int) ((1073741823 & j) >> 0);
                    if ((((int) ((1152921503533105152L & j) >> 30)) & kVar.f83937a) != (kVar.f83937a & i)) {
                        obj2 = kVar.f83938c.get(kVar.f83937a & i);
                        if (obj2 != null) {
                            if (obj2 instanceof k.b) {
                                break;
                            }
                            if (((i) obj2).e() == lVar) {
                                z = true;
                            }
                            if (!z) {
                                break;
                            }
                            int i2 = (i + 1) & 1073741823;
                            if (k.f83934b.compareAndSet(kVar, j, k.f83936f.a(j, i2))) {
                                kVar.f83938c.set(kVar.f83937a & i, null);
                                break;
                            } else if (kVar.f83939d) {
                                k kVar2 = kVar;
                                do {
                                    kVar2 = kVar2.a(i, i2);
                                } while (kVar2 != null);
                                break;
                            }
                        } else if (kVar.f83939d) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    obj = k.f83935e;
                    break;
                }
            }
            obj = obj2;
            if (obj != k.f83935e) {
                return (i) obj;
            }
            j.f83933a.compareAndSet(this, kVar, kVar.c());
        }
    }
}
