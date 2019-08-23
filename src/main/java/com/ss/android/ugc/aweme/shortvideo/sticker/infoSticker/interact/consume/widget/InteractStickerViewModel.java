package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u0018J&\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u0002H\u0016H\u0002¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0007J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\u001e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140!H\u0007J&\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140!2\u0006\u0010\"\u001a\u00020\u000bH\u0007J0\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00072\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u001dH\u0007J(\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00072\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010!2\u0006\u0010#\u001a\u00020\u001dH\u0007J\u001e\u0010$\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140!H\u0007J(\u0010$\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00072\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010!2\u0006\u0010#\u001a\u00020\u001dH\u0007J\b\u0010%\u001a\u00020&H\u0014J\u0010\u0010'\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010)J\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\bJ\u0018\u0010+\u001a\u00020\u00002\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010!H\u0007J \u0010+\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00072\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010!H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R.\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b`\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R6\u0010\u0012\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0006j\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/widget/InteractStickerViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "handler", "Landroid/os/Handler;", "mDataStore", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "mLifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "getMLifecycleOwner", "()Landroid/arch/lifecycle/LifecycleOwner;", "setMLifecycleOwner", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "mainThread", "Ljava/lang/Thread;", "mliveDataMap", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "get", "T", "key", "(Ljava/lang/String;)Ljava/lang/Object;", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getLiveData", "has", "", "isMainThread", "observe", "observer", "Landroid/arch/lifecycle/Observer;", "lifecycleOwner", "notifyWhenObserve", "observeForever", "onCleared", "", "put", "bundle", "Landroid/os/Bundle;", "data", "removeObserver", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class InteractStickerViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70066a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public LifecycleOwner f70067b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, Object> f70068c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, b<com.ss.android.ugc.aweme.arch.widgets.base.a>> f70069d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private Thread f70070e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f70071f = new Handler(Looper.getMainLooper());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70072a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InteractStickerViewModel f70073b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f70074c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f70075d;

        a(InteractStickerViewModel interactStickerViewModel, String str, Object obj) {
            this.f70073b = interactStickerViewModel;
            this.f70074c = str;
            this.f70075d = obj;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f70072a, false, 79757, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70072a, false, 79757, new Class[0], Void.TYPE);
                return;
            }
            this.f70073b.a(this.f70074c, this.f70075d);
        }
    }

    public final void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f70066a, false, 79754, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70066a, false, 79754, new Class[0], Void.TYPE);
            return;
        }
        this.f70068c.clear();
        this.f70069d.clear();
        this.f70067b = null;
    }

    private final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f70066a, false, 79755, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f70066a, false, 79755, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f70070e == null) {
            this.f70070e = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == this.f70070e) {
            z = true;
        }
        return z;
    }

    @Nullable
    public final <T> T a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f70066a, false, 79742, new Class[]{String.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str2}, this, f70066a, false, 79742, new Class[]{String.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "key");
        T t = this.f70068c.get(str2);
        if (t != null) {
            return t;
        }
        return null;
    }

    @NotNull
    public final InteractStickerViewModel a(@NotNull String str, @Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{str, obj}, this, f70066a, false, 79741, new Class[]{String.class, Object.class}, InteractStickerViewModel.class)) {
            return (InteractStickerViewModel) PatchProxy.accessDispatch(new Object[]{str, obj}, this, f70066a, false, 79741, new Class[]{String.class, Object.class}, InteractStickerViewModel.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (!a()) {
            this.f70071f.post(new a(this, str, obj));
            return this;
        }
        this.f70068c.put(str, obj);
        b bVar = this.f70069d.get(str);
        if (bVar != null) {
            bVar.setValue(new com.ss.android.ugc.aweme.arch.widgets.base.a(str, obj));
        }
        return this;
    }

    @NotNull
    @MainThread
    public final InteractStickerViewModel a(@NotNull String str, @NotNull Observer<com.ss.android.ugc.aweme.arch.widgets.base.a> observer) {
        b bVar;
        String str2 = str;
        Observer<com.ss.android.ugc.aweme.arch.widgets.base.a> observer2 = observer;
        if (PatchProxy.isSupport(new Object[]{str2, observer2}, this, f70066a, false, 79745, new Class[]{String.class, Observer.class}, InteractStickerViewModel.class)) {
            return (InteractStickerViewModel) PatchProxy.accessDispatch(new Object[]{str2, observer2}, this, f70066a, false, 79745, new Class[]{String.class, Observer.class}, InteractStickerViewModel.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(observer2, "observer");
        if (PatchProxy.isSupport(new Object[]{str2, observer2, (byte) 0}, this, f70066a, false, 79746, new Class[]{String.class, Observer.class, Boolean.TYPE}, InteractStickerViewModel.class)) {
            return (InteractStickerViewModel) PatchProxy.accessDispatch(new Object[]{str2, observer2, (byte) 0}, this, f70066a, false, 79746, new Class[]{String.class, Observer.class, Boolean.TYPE}, InteractStickerViewModel.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (TextUtils.isEmpty(str2) || observer2 == null) {
            return this;
        }
        if (PatchProxy.isSupport(new Object[]{str2}, this, f70066a, false, 79751, new Class[]{String.class}, b.class)) {
            bVar = (b) PatchProxy.accessDispatch(new Object[]{str2}, this, f70066a, false, 79751, new Class[]{String.class}, b.class);
        } else {
            bVar = this.f70069d.get(str);
            if (bVar == null) {
                bVar = new b();
                if (this.f70068c.containsKey(str)) {
                    bVar.setValue(new com.ss.android.ugc.aweme.arch.widgets.base.a(str, this.f70068c.get(str)));
                }
                this.f70069d.put(str, bVar);
            }
        }
        LifecycleOwner lifecycleOwner = this.f70067b;
        if (lifecycleOwner == null) {
            Intrinsics.throwNpe();
        }
        bVar.a(lifecycleOwner, observer2, false);
        return this;
    }
}
