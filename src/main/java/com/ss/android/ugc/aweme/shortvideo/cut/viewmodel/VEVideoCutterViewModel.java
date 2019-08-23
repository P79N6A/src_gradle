package com.ss.android.ugc.aweme.shortvideo.cut.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEVideoCutterViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "videoPlayerControlLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEPreviewAction;", "getVideoPlayerControlLiveData", "()Landroid/arch/lifecycle/MutableLiveData;", "videoPlayerControlLiveData$delegate", "Lkotlin/Lazy;", "updatePreviewActionStatus", "", "value", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VEVideoCutterViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66598a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f66599b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(VEVideoCutterViewModel.class), "videoPlayerControlLiveData", "getVideoPlayerControlLiveData()Landroid/arch/lifecycle/MutableLiveData;"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f66600c = LazyKt.lazy(a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEPreviewAction;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<MutableLiveData<a>> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<a> invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76021, new Class[0], MutableLiveData.class)) {
                return new MutableLiveData<>();
            }
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76021, new Class[0], MutableLiveData.class);
        }
    }

    @NotNull
    public final MutableLiveData<a> a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f66598a, false, 76019, new Class[0], MutableLiveData.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f66598a, false, 76019, new Class[0], MutableLiveData.class);
        } else {
            value = this.f66600c.getValue();
        }
        return (MutableLiveData) value;
    }

    public final void a(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f66598a, false, 76020, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f66598a, false, 76020, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "value");
        a().setValue(aVar2);
    }
}
