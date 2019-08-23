package com.ss.android.ugc.gamora.recorder;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.shortvideo.gz;
import com.ss.android.ugc.aweme.tools.ao;
import com.ss.android.ugc.aweme.tools.ay;
import com.ss.android.ugc.aweme.tools.az;
import com.ss.android.ugc.aweme.tools.u;
import com.ss.android.ugc.aweme.tools.w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u000209R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0007R\u001a\u0010)\u001a\u00020*X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0007¨\u0006:"}, d2 = {"Lcom/ss/android/ugc/gamora/recorder/RecordToolbarViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "beautyConfig", "Landroid/arch/lifecycle/MutableLiveData;", "", "getBeautyConfig", "()Landroid/arch/lifecycle/MutableLiveData;", "bottomTab", "Lcom/ss/android/ugc/aweme/tools/BottomTabEvent;", "getBottomTab", "disableRecordDuration", "Lcom/ss/android/ugc/aweme/tools/SwitchDurationDisableEvent;", "getDisableRecordDuration", "flash", "Lcom/ss/android/ugc/aweme/tools/FlashChangeEvent;", "getFlash", "frontDisable", "getFrontDisable", "frontRear", "Lcom/ss/android/ugc/aweme/tools/FrontRearEvent;", "getFrontRear", "microphoneState", "Lcom/ss/android/ugc/aweme/tools/SetMicrophoneStateEvent;", "getMicrophoneState", "musicAdd", "", "getMusicAdd", "musicCleared", "", "getMusicCleared", "musicCutable", "getMusicCutable", "shakeFreeMode", "getShakeFreeMode", "speedGroupVisibility", "", "getSpeedGroupVisibility", "switchDurationConfig", "Lcom/ss/android/ugc/aweme/tools/SwitchDurationConfigEvent;", "getSwitchDurationConfig", "toolBarModule", "Lcom/ss/android/ugc/aweme/shortvideo/ToolBarModule;", "getToolBarModule", "()Lcom/ss/android/ugc/aweme/shortvideo/ToolBarModule;", "setToolBarModule", "(Lcom/ss/android/ugc/aweme/shortvideo/ToolBarModule;)V", "toolbarAdapter", "Lcom/ss/android/ugc/aweme/shortvideo/adapter/ToolBarAdapterWrapper;", "getToolbarAdapter", "()Lcom/ss/android/ugc/aweme/shortvideo/adapter/ToolBarAdapterWrapper;", "setToolbarAdapter", "(Lcom/ss/android/ugc/aweme/shortvideo/adapter/ToolBarAdapterWrapper;)V", "wideCamera", "getWideCamera", "observe", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecordToolbarViewModel extends ViewModel {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public gz f77611a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.adapter.c f77612b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final MutableLiveData<az> f77613c = new MutableLiveData<>();
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final MutableLiveData<Boolean> f77614d = new MutableLiveData<>();
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final MutableLiveData<com.ss.android.ugc.aweme.tools.f> f77615e = new MutableLiveData<>();
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final MutableLiveData<u> f77616f = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<ay> g = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<Integer> h = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<Boolean> i = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<ao> j = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<Boolean> k = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<w> l = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<Boolean> m = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<Unit> n = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<Object> o = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<Boolean> p = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/tools/SwitchDurationDisableEvent;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<az> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordToolbarViewModel f77617a;

        a(RecordToolbarViewModel recordToolbarViewModel) {
            this.f77617a = recordToolbarViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f77617a.a().a((az) obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "frontRearEvent", "Lcom/ss/android/ugc/aweme/tools/FrontRearEvent;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordToolbarViewModel f77618a;

        b(RecordToolbarViewModel recordToolbarViewModel) {
            this.f77618a = recordToolbarViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            w wVar = (w) obj;
            if (wVar != null) {
                this.f77618a.a().a(wVar.f74944a, wVar.f74945b, wVar.f74946c, wVar.f74947d);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordToolbarViewModel f77619a;

        c(RecordToolbarViewModel recordToolbarViewModel) {
            this.f77619a = recordToolbarViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f77619a.a().c(bool.booleanValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "onChanged", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordToolbarViewModel f77620a;

        d(RecordToolbarViewModel recordToolbarViewModel) {
            this.f77620a = recordToolbarViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f77620a.a().b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements Observer<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordToolbarViewModel f77621a;

        e(RecordToolbarViewModel recordToolbarViewModel) {
            this.f77621a = recordToolbarViewModel;
        }

        public final void onChanged(@Nullable Object obj) {
            this.f77621a.a().a(obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordToolbarViewModel f77622a;

        f(RecordToolbarViewModel recordToolbarViewModel) {
            this.f77622a = recordToolbarViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f77622a.a().a(bool.booleanValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class g<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordToolbarViewModel f77623a;

        g(RecordToolbarViewModel recordToolbarViewModel) {
            this.f77623a = recordToolbarViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f77623a.a().d(bool.booleanValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/tools/FlashChangeEvent;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class h<T> implements Observer<u> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordToolbarViewModel f77624a;

        h(RecordToolbarViewModel recordToolbarViewModel) {
            this.f77624a = recordToolbarViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f77624a.a().a((u) obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/tools/SwitchDurationConfigEvent;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class i<T> implements Observer<ay> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordToolbarViewModel f77625a;

        i(RecordToolbarViewModel recordToolbarViewModel) {
            this.f77625a = recordToolbarViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f77625a.a().a((ay) obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class j<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordToolbarViewModel f77626a;

        j(RecordToolbarViewModel recordToolbarViewModel) {
            this.f77626a = recordToolbarViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                this.f77626a.a().a(num.intValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class k<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordToolbarViewModel f77627a;

        k(RecordToolbarViewModel recordToolbarViewModel) {
            this.f77627a = recordToolbarViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f77627a.a().e(bool.booleanValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/tools/SetMicrophoneStateEvent;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class l<T> implements Observer<ao> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordToolbarViewModel f77628a;

        l(RecordToolbarViewModel recordToolbarViewModel) {
            this.f77628a = recordToolbarViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f77628a.a().a((ao) obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class m<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordToolbarViewModel f77629a;

        m(RecordToolbarViewModel recordToolbarViewModel) {
            this.f77629a = recordToolbarViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f77629a.a().b(bool.booleanValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bottomTabEvent", "Lcom/ss/android/ugc/aweme/tools/BottomTabEvent;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class n<T> implements Observer<com.ss.android.ugc.aweme.tools.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecordToolbarViewModel f77630a;

        n(RecordToolbarViewModel recordToolbarViewModel) {
            this.f77630a = recordToolbarViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.tools.f fVar = (com.ss.android.ugc.aweme.tools.f) obj;
            if (fVar != null) {
                this.f77630a.a().a(fVar.f74757a, fVar.f74758b, fVar.f74759c);
            }
        }
    }

    @NotNull
    public final com.ss.android.ugc.aweme.shortvideo.adapter.c a() {
        com.ss.android.ugc.aweme.shortvideo.adapter.c cVar = this.f77612b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarAdapter");
        }
        return cVar;
    }

    public final void a(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        this.f77613c.observe(lifecycleOwner, new a(this));
        this.f77614d.observe(lifecycleOwner, new g(this));
        this.f77616f.observe(lifecycleOwner, new h(this));
        this.g.observe(lifecycleOwner, new i(this));
        this.h.observe(lifecycleOwner, new j(this));
        this.i.observe(lifecycleOwner, new k(this));
        this.j.observe(lifecycleOwner, new l(this));
        this.k.observe(lifecycleOwner, new m(this));
        this.f77615e.observe(lifecycleOwner, new n(this));
        this.l.observe(lifecycleOwner, new b(this));
        this.m.observe(lifecycleOwner, new c(this));
        this.n.observe(lifecycleOwner, new d(this));
        this.o.observe(lifecycleOwner, new e(this));
        this.p.observe(lifecycleOwner, new f(this));
    }
}
