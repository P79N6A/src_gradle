package com.ss.android.ugc.aweme.poi.ui.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.poi.model.ax;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/upload/PoiUploadImgPresenter;", "Lcom/ss/android/ugc/aweme/common/BasePresenter;", "Lcom/ss/android/ugc/aweme/poi/ui/upload/PoiUploadImageModel;", "Lcom/ss/android/ugc/aweme/poi/ui/upload/PoiUploadImgView;", "()V", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends b<a, e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60962a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60962a, false, 66765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60962a, false, 66765, new Class[0], Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            a aVar = this.f2978e;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mModel");
            ax axVar = (ax) ((a) aVar).getData();
            Intrinsics.checkExpressionValueIsNotNull(axVar, "mModel.data");
            ((e) this.f2979f).a(axVar);
        }
    }

    public final void a(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60962a, false, 66766, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60962a, false, 66766, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            ((e) this.f2979f).a(exc);
        }
    }
}
