package com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ(\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "faceStickerBeanLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerWrapper;", "stickerMessageLiveData", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/StickerMessage;", "cancelSelectSticker", "", "faceStickerBean", "Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;", "getFaceStickerBean", "Landroid/arch/lifecycle/LiveData;", "getStickerMessage", "onMessageReceived", "messageType", "", "arg1", "arg2", "arg3", "", "selectSticker", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FaceStickerViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70287a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableLiveData<i> f70288b = new MutableLiveData<>();

    /* renamed from: c  reason: collision with root package name */
    private final MutableLiveData<g> f70289c = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    public static final class a<V> implements Callable<Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70290a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FaceStickerViewModel f70291b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f70292c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f70293d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f70294e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f70295f;

        public a(FaceStickerViewModel faceStickerViewModel, int i, int i2, int i3, String str) {
            this.f70291b = faceStickerViewModel;
            this.f70292c = i;
            this.f70293d = i2;
            this.f70294e = i3;
            this.f70295f = str;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f70290a, false, 79929, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70290a, false, 79929, new Class[0], Void.TYPE);
            } else {
                this.f70291b.f70288b.setValue(new i(this.f70292c, this.f70293d, this.f70294e, this.f70295f));
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<g> a() {
        return this.f70289c;
    }

    @NotNull
    public final LiveData<i> b() {
        return this.f70288b;
    }

    public final void a(@NotNull FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f70287a, false, 79926, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f70287a, false, 79926, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(faceStickerBean2, "faceStickerBean");
        this.f70289c.setValue(new h(faceStickerBean2));
    }

    public final void b(@NotNull FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f70287a, false, 79927, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f70287a, false, 79927, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(faceStickerBean2, "faceStickerBean");
        this.f70289c.setValue(new a(faceStickerBean2));
    }
}
