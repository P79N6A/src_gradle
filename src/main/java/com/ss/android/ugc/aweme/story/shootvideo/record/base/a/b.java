package com.ss.android.ugc.aweme.story.shootvideo.record.base.a;

import android.arch.lifecycle.MutableLiveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/delegate/StickerVisibleStateChangeDelegate;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/StickerModule$OnVisibilityListener;", "stateChange", "Landroid/arch/lifecycle/MutableLiveData;", "", "(Landroid/arch/lifecycle/MutableLiveData;)V", "onDismiss", "", "onShow", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements StickerModule.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73884a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableLiveData<Boolean> f73885b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f73884a, false, 85896, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73884a, false, 85896, new Class[0], Void.TYPE);
            return;
        }
        this.f73885b.setValue(Boolean.TRUE);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f73884a, false, 85897, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73884a, false, 85897, new Class[0], Void.TYPE);
            return;
        }
        this.f73885b.setValue(Boolean.FALSE);
    }

    public b(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkParameterIsNotNull(mutableLiveData, "stateChange");
        this.f73885b = mutableLiveData;
    }
}
