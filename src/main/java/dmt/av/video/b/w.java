package dmt.av.video.b;

import com.ss.android.vesdk.af;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final class w implements af.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Function1 f82976a;

    w(Function1 function1) {
        this.f82976a = function1;
    }

    public final /* synthetic */ void a(int i) {
        Intrinsics.checkExpressionValueIsNotNull(this.f82976a.invoke(Integer.valueOf(i)), "invoke(...)");
    }
}
