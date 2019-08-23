package com.ss.android.ugc.aweme.shortvideo.upload.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005R&\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000@FX\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/upload/terminal/IncreaseRecord;", "T", "", "", "init", "(Ljava/lang/Comparable;)V", "v", "value", "getValue", "()Ljava/lang/Comparable;", "setValue", "Ljava/lang/Comparable;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a<T extends Comparable<? super T>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71004a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public T f71005b;

    public a(@NotNull T t) {
        Intrinsics.checkParameterIsNotNull(t, "init");
        this.f71005b = t;
    }

    public final void a(@NotNull T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, f71004a, false, 80831, new Class[]{Comparable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, f71004a, false, 80831, new Class[]{Comparable.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(t, NotifyType.VIBRATE);
        if (t.compareTo(this.f71005b) > 0) {
            this.f71005b = t;
        }
    }
}
