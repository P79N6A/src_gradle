package com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/PixaloopMessageModule;", "Landroid/arch/lifecycle/ViewModel;", "()V", "pixaloopMessageData", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/data/PixaloopMessage;", "getPixaloopMessageData", "()Landroid/arch/lifecycle/MutableLiveData;", "pixaloopMessageData$delegate", "Lkotlin/Lazy;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PixaloopMessageModule extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69346a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f69347b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PixaloopMessageModule.class), "pixaloopMessageData", "getPixaloopMessageData()Landroid/arch/lifecycle/MutableLiveData;"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f69348c = LazyKt.lazy(a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/data/PixaloopMessage;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<MutableLiveData<c>> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        @NotNull
        public final MutableLiveData<c> invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 78916, new Class[0], MutableLiveData.class)) {
                return new MutableLiveData<>();
            }
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 78916, new Class[0], MutableLiveData.class);
        }
    }

    @NotNull
    public final MutableLiveData<c> a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f69346a, false, 78915, new Class[0], MutableLiveData.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f69346a, false, 78915, new Class[0], MutableLiveData.class);
        } else {
            value = this.f69348c.getValue();
        }
        return (MutableLiveData) value;
    }
}
