package com.ss.android.ugc.aweme.shortvideo.ui;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0007R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/ui/AudioFocusManager;", "Landroid/arch/lifecycle/LifecycleObserver;", "host", "Landroid/support/v7/app/AppCompatActivity;", "(Landroid/support/v7/app/AppCompatActivity;)V", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "audioManager$delegate", "Lkotlin/Lazy;", "counter", "Lcom/ss/android/ugc/aweme/shortvideo/ui/SharedReferenceCounter;", "getHost", "()Landroid/support/v7/app/AppCompatActivity;", "onStart", "", "onStop", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AudioFocusManager implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4019a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f4020b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AudioFocusManager.class), "audioManager", "getAudioManager()Landroid/media/AudioManager;"))};

    /* renamed from: d  reason: collision with root package name */
    public static final a f4021d = new a((byte) 0);
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final AppCompatActivity f4022c;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f4023e;

    /* renamed from: f  reason: collision with root package name */
    private final y f4024f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/ui/AudioFocusManager$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/shortvideo/ui/AudioFocusManager;", "host", "Landroid/support/v7/app/AppCompatActivity;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70444a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final AudioFocusManager a(@NotNull AppCompatActivity appCompatActivity) {
            AppCompatActivity appCompatActivity2 = appCompatActivity;
            if (PatchProxy.isSupport(new Object[]{appCompatActivity2}, this, f70444a, false, 80121, new Class[]{AppCompatActivity.class}, AudioFocusManager.class)) {
                return (AudioFocusManager) PatchProxy.accessDispatch(new Object[]{appCompatActivity2}, this, f70444a, false, 80121, new Class[]{AppCompatActivity.class}, AudioFocusManager.class);
            }
            Intrinsics.checkParameterIsNotNull(appCompatActivity2, "host");
            return new AudioFocusManager(appCompatActivity2, (byte) 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/media/AudioManager;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<AudioManager> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ AudioFocusManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AudioFocusManager audioFocusManager) {
            super(0);
            this.this$0 = audioFocusManager;
        }

        @NotNull
        public final AudioManager invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80122, new Class[0], AudioManager.class)) {
                return (AudioManager) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80122, new Class[0], AudioManager.class);
            }
            Object systemService = this.this$0.f4022c.getApplicationContext().getSystemService("audio");
            if (systemService != null) {
                return (AudioManager) systemService;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.media.AudioManager");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ AudioFocusManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AudioFocusManager audioFocusManager) {
            super(0);
            this.this$0 = audioFocusManager;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80123, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80123, new Class[0], Void.TYPE);
                return;
            }
            try {
                this.this$0.a().requestAudioFocus(null, 3, 1);
            } catch (Throwable unused) {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ AudioFocusManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AudioFocusManager audioFocusManager) {
            super(0);
            this.this$0 = audioFocusManager;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80124, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80124, new Class[0], Void.TYPE);
                return;
            }
            try {
                this.this$0.a().abandonAudioFocus(null);
            } catch (Throwable unused) {
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final AudioFocusManager a(@NotNull AppCompatActivity appCompatActivity) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        if (!PatchProxy.isSupport(new Object[]{appCompatActivity2}, null, f4019a, true, 80120, new Class[]{AppCompatActivity.class}, AudioFocusManager.class)) {
            return f4021d.a(appCompatActivity2);
        }
        return (AudioFocusManager) PatchProxy.accessDispatch(new Object[]{appCompatActivity2}, null, f4019a, true, 80120, new Class[]{AppCompatActivity.class}, AudioFocusManager.class);
    }

    public final AudioManager a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f4019a, false, 80117, new Class[0], AudioManager.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f4019a, false, 80117, new Class[0], AudioManager.class);
        } else {
            value = this.f4023e.getValue();
        }
        return (AudioManager) value;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f4019a, false, 80119, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4019a, false, 80119, new Class[0], Void.TYPE);
            return;
        }
        y yVar = this.f4024f;
        if (PatchProxy.isSupport(new Object[0], yVar, y.f70934a, false, 80330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], yVar, y.f70934a, false, 80330, new Class[0], Void.TYPE);
            return;
        }
        int i = y.f70935d + 1;
        y.f70935d = i;
        if (i == 1) {
            Function0<Unit> function0 = yVar.f70937b;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f4019a, false, 80118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4019a, false, 80118, new Class[0], Void.TYPE);
            return;
        }
        y yVar = this.f4024f;
        if (PatchProxy.isSupport(new Object[0], yVar, y.f70934a, false, 80331, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], yVar, y.f70934a, false, 80331, new Class[0], Void.TYPE);
            return;
        }
        int i = y.f70935d - 1;
        y.f70935d = i;
        if (i == 0) {
            Function0<Unit> function0 = yVar.f70938c;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    private AudioFocusManager(AppCompatActivity appCompatActivity) {
        this.f4022c = appCompatActivity;
        this.f4022c.getLifecycle().addObserver(this);
        this.f4023e = LazyKt.lazy(new b(this));
        this.f4024f = new y(new c(this), new d(this));
    }

    public /* synthetic */ AudioFocusManager(AppCompatActivity appCompatActivity, byte b2) {
        this(appCompatActivity);
    }
}
