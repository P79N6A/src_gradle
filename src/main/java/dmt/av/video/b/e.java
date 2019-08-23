package dmt.av.video.b;

import com.ss.android.medialib.FaceBeautyInvoker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final class e implements FaceBeautyInvoker.OnRunningErrorCallback {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Function1 f82922a;

    e(Function1 function1) {
        this.f82922a = function1;
    }

    public final /* synthetic */ void onError(int i) {
        Intrinsics.checkExpressionValueIsNotNull(this.f82922a.invoke(Integer.valueOf(i)), "invoke(...)");
    }
}
