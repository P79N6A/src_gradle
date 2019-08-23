package com.ss.android.ugc.aweme.poi.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.poi.model.ac;
import com.ss.android.ugc.aweme.poi.model.ae;
import com.ss.android.ugc.aweme.poi.ui.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/presenter/PoiHalfCardPresenter;", "Lcom/ss/android/ugc/aweme/common/BasePresenter;", "Lcom/ss/android/ugc/aweme/poi/model/PoiHalfCardModel;", "Lcom/ss/android/ugc/aweme/poi/ui/PoiHalfCardView;", "()V", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends com.ss.android.ugc.aweme.common.b<ae, o> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59769a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f59769a, false, 65380, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59769a, false, 65380, new Class[0], Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            a aVar = this.f2978e;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mModel");
            ((o) this.f2979f).a((ac) ((ae) aVar).getData());
        }
    }

    public final void a(@Nullable Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f59769a, false, 65381, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f59769a, false, 65381, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        o oVar = (o) this.f2979f;
        if (oVar != null) {
            oVar.c(exc2);
        }
    }
}
