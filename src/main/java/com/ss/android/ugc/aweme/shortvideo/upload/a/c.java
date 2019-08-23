package com.ss.android.ugc.aweme.shortvideo.upload.a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.hf;
import com.ss.android.ugc.aweme.shortvideo.hl;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.ttuploader.TTUploadSpeedProber;
import com.ss.ttuploader.TTUploadSpeedProberListener;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/upload/speedprobe/UploadSpeedProbe;", "", "()V", "IS_DEBUG", "", "LOG_TAG", "", "STATE_CODE_CANCEL", "", "STATE_CODE_ERROR", "STATE_CODE_NOT_START", "lastProbeResult", "probeEndTime", "probeStartTime", "speedProbe", "Lcom/ss/ttuploader/TTUploadSpeedProber;", "stateMachine", "Lcom/ss/android/ugc/aweme/shortvideo/upload/speedprobe/UploadSpeedProbe$StateMachine;", "getSpeed", "Lcom/ss/android/ugc/aweme/shortvideo/upload/speedprobe/UploadSpeedInfo;", "log", "", "msg", "important", "start", "applicationContext", "Landroid/content/Context;", "tryInitData", "FetchAuthKeyConfigFailException", "State", "StateMachine", "UploadSpeedProbeFailException", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70970a;
    /* access modifiers changed from: package-private */
    @SuppressLint({"StaticFieldLeak", "CI_StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    public static TTUploadSpeedProber f70971b;

    /* renamed from: c  reason: collision with root package name */
    public static C0738c f70972c;

    /* renamed from: d  reason: collision with root package name */
    public static long f70973d = -4;

    /* renamed from: e  reason: collision with root package name */
    static long f70974e = -4;

    /* renamed from: f  reason: collision with root package name */
    static long f70975f = -4;
    public static final c g = new c();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/upload/speedprobe/UploadSpeedProbe$FetchAuthKeyConfigFailException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends RuntimeException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str) {
            super(str);
            Intrinsics.checkParameterIsNotNull(str, "message");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str, @NotNull Throwable th) {
            super(str, th);
            Intrinsics.checkParameterIsNotNull(str, "message");
            Intrinsics.checkParameterIsNotNull(th, "cause");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/upload/speedprobe/UploadSpeedProbe$State;", "", "(Ljava/lang/String;I)V", "NOT_START", "RUNNING", "SUCCESS", "CANCEL", "FAILED", "TIME_OUT", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public enum b {
        NOT_START,
        RUNNING,
        SUCCESS,
        CANCEL,
        FAILED,
        TIME_OUT;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u0012\u001a\u00020\u0004R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/upload/speedprobe/UploadSpeedProbe$StateMachine;", "", "realStart", "Lkotlin/Function0;", "", "realCancel", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "startInvokeFilter", "Lcom/ss/android/ugc/aweme/shortvideo/upload/speedprobe/InvokeFilter;", "<set-?>", "Lcom/ss/android/ugc/aweme/shortvideo/upload/speedprobe/UploadSpeedProbe$State;", "state", "getState", "()Lcom/ss/android/ugc/aweme/shortvideo/upload/speedprobe/UploadSpeedProbe$State;", "cancel", "getMinProbeGap", "", "onComplete", "start", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.a.c$c  reason: collision with other inner class name */
    public static final class C0738c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70976a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public b f70977b = b.NOT_START;

        /* renamed from: c  reason: collision with root package name */
        public final a f70978c = new a(a(), false);

        /* renamed from: d  reason: collision with root package name */
        public final Function0<Unit> f70979d;

        /* renamed from: e  reason: collision with root package name */
        public final Function0<Unit> f70980e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"startAction", "", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.a.c$c$a */
        public static final class a extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ C0738c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C0738c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            public final void invoke() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80811, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80811, new Class[0], Void.TYPE);
                    return;
                }
                this.this$0.f70977b = b.RUNNING;
                this.this$0.f70979d.invoke();
            }
        }

        public final int a() {
            if (!PatchProxy.isSupport(new Object[0], this, f70976a, false, 80807, new Class[0], Integer.TYPE)) {
                return com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.UploadSpeedProbeMinGap);
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f70976a, false, 80807, new Class[0], Integer.TYPE)).intValue();
        }

        public final void a(@NotNull b bVar) {
            b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f70976a, false, 80810, new Class[]{b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2}, this, f70976a, false, 80810, new Class[]{b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(bVar2, "state");
            if (d.f70998c[this.f70977b.ordinal()] == 1) {
                if (bVar2 == b.SUCCESS) {
                    a aVar = this.f70978c;
                    if (PatchProxy.isSupport(new Object[0], aVar, a.f70964a, false, 80796, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aVar, a.f70964a, false, 80796, new Class[0], Void.TYPE);
                    } else {
                        aVar.f70966b = System.currentTimeMillis();
                    }
                }
                this.f70977b = bVar2;
            }
        }

        public C0738c(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkParameterIsNotNull(function0, "realStart");
            Intrinsics.checkParameterIsNotNull(function02, "realCancel");
            this.f70979d = function0;
            this.f70980e = function02;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/upload/speedprobe/UploadSpeedProbe$UploadSpeedProbeFailException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "errorCode", "", "(I)V", "getErrorCode", "()I", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends RuntimeException {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int errorCode;

        public final int getErrorCode() {
            return this.errorCode;
        }

        public d(int i) {
            this.errorCode = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"getInfo", "Lcom/ss/android/ugc/aweme/shortvideo/upload/speedprobe/UploadSpeedInfo;", "speed", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class e extends Lambda implements Function1<Long, b> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).longValue());
        }

        @NotNull
        public final b invoke(long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 80812, new Class[]{Long.TYPE}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 80812, new Class[]{Long.TYPE}, b.class);
            }
            c cVar = c.g;
            long j3 = c.f70974e;
            c cVar2 = c.g;
            b bVar = new b(j, j3, c.f70975f);
            return bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"createGetConfigSingle", "Lio/reactivex/Single;", "Lcom/ss/android/ugc/aweme/shortvideo/UploadAuthKeyConfig;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<Single<hf>> {
        public static final f INSTANCE = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(0);
        }

        @NotNull
        public final Single<hf> invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80813, new Class[0], Single.class)) {
                return (Single) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80813, new Class[0], Single.class);
            }
            Single<hf> create = Single.create(AnonymousClass1.f70982b);
            Intrinsics.checkExpressionValueIsNotNull(create, "Single.create<UploadAuth…Executor())\n            }");
            return create;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"createStartProbeSingle", "Lio/reactivex/Single;", "", "config", "Lcom/ss/android/ugc/aweme/shortvideo/UploadAuthKeyConfig;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class g extends Lambda implements Function1<hf, Single<Long>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Context $applicationContext;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super(1);
            this.$applicationContext = context;
        }

        @NotNull
        public final Single<Long> invoke(@NotNull hf hfVar) {
            final hf hfVar2 = hfVar;
            if (PatchProxy.isSupport(new Object[]{hfVar2}, this, changeQuickRedirect, false, 80817, new Class[]{hf.class}, Single.class)) {
                return (Single) PatchProxy.accessDispatch(new Object[]{hfVar2}, this, changeQuickRedirect, false, 80817, new Class[]{hf.class}, Single.class);
            }
            Intrinsics.checkParameterIsNotNull(hfVar2, "config");
            Single<Long> create = Single.create(new SingleOnSubscribe<T>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70985a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ g f70986b;

                {
                    this.f70986b = r1;
                }

                public final void subscribe(@NotNull final SingleEmitter<Long> singleEmitter) {
                    if (PatchProxy.isSupport(new Object[]{singleEmitter}, this, f70985a, false, 80821, new Class[]{SingleEmitter.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{singleEmitter}, this, f70985a, false, 80821, new Class[]{SingleEmitter.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(singleEmitter, AdvanceSetting.NETWORK_TYPE);
                    TTUploadSpeedProber a2 = c.f70971b;
                    if (a2 != null) {
                        a2.close();
                    }
                    c cVar = c.g;
                    c.f70971b = new TTUploadSpeedProber(this.f70986b.$applicationContext.getApplicationContext(), AnonymousClass2.INSTANCE.invoke());
                    TTUploadSpeedProber a3 = c.f70971b;
                    if (a3 != null) {
                        a3.setListener(new TTUploadSpeedProberListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f70988a;

                            public final void onNotify(int i, long j) {
                                int i2 = i;
                                long j2 = j;
                                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, f70988a, false, 80822, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, f70988a, false, 80822, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE);
                                    return;
                                }
                                c cVar = c.g;
                                cVar.a("SpeedProbe End what:" + i + " parameter:" + j2, true);
                                TTUploadSpeedProber a2 = c.f70971b;
                                if (a2 != null) {
                                    a2.close();
                                }
                                if (i2 != 0) {
                                    singleEmitter.tryOnError(new d(i));
                                } else {
                                    singleEmitter.onSuccess(Long.valueOf(j));
                                }
                            }
                        });
                    }
                    hl hlVar = hfVar2.f68131a;
                    if (!AnonymousClass1.INSTANCE.invoke(hlVar)) {
                        singleEmitter.tryOnError(new a("UploadAuthKeyConfig.uploadImageConfig is not valid"));
                        return;
                    }
                    c cVar2 = c.g;
                    c.f70974e = System.currentTimeMillis();
                    TTUploadSpeedProber a4 = c.f70971b;
                    if (a4 != null) {
                        a4.start(hlVar.f68156c, hlVar.i, hlVar.f68154a, (long) AnonymousClass3.INSTANCE.invoke());
                    }
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(create, "Single.create<Long> {\n  …正，万一sdk没回调了\n            }");
            return create;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"realStart", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class h extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ g $createStartProbeSingle$2;
        final /* synthetic */ Ref.ObjectRef $startTask;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(Ref.ObjectRef objectRef, g gVar) {
            super(0);
            this.$startTask = objectRef;
            this.$createStartProbeSingle$2 = gVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80823, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80823, new Class[0], Void.TYPE);
                return;
            }
            c.g.a("SpeedProbe Start", true);
            this.$startTask.element = f.INSTANCE.invoke().subscribeOn(Schedulers.io()).flatMap(new Function<T, SingleSource<? extends R>>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70990a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ h f70991b;

                {
                    this.f70991b = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    hf hfVar = (hf) obj;
                    if (PatchProxy.isSupport(new Object[]{hfVar}, this, f70990a, false, 80824, new Class[]{hf.class}, Single.class)) {
                        return (Single) PatchProxy.accessDispatch(new Object[]{hfVar}, this, f70990a, false, 80824, new Class[]{hf.class}, Single.class);
                    }
                    Intrinsics.checkParameterIsNotNull(hfVar, "config");
                    return this.f70991b.$createStartProbeSingle$2.invoke(hfVar);
                }
            }).observeOn(AndroidSchedulers.mainThread()).subscribe(AnonymousClass2.f70993b, AnonymousClass3.f70995b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"realCancel", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class i extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Ref.ObjectRef $startTask;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(Ref.ObjectRef objectRef) {
            super(0);
            this.$startTask = objectRef;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80827, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80827, new Class[0], Void.TYPE);
                return;
            }
            c.g.a("realCancel", true);
            Disposable disposable = (Disposable) this.$startTask.element;
            if (disposable != null) {
                disposable.dispose();
            }
            TTUploadSpeedProber a2 = c.f70971b;
            if (a2 != null) {
                a2.close();
            }
            C0738c b2 = c.f70972c;
            if (b2 != null) {
                b2.a(b.CANCEL);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"tryInitStateMachine", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class j extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ i $realCancel$4;
        final /* synthetic */ h $realStart$3;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(h hVar, i iVar) {
            super(0);
            this.$realStart$3 = hVar;
            this.$realCancel$4 = iVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80828, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80828, new Class[0], Void.TYPE);
                return;
            }
            if (c.f70972c == null) {
                c cVar = c.g;
                c.f70972c = new C0738c(new Function0<Unit>(this) {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ j this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final String getName() {
                        return "realStart";
                    }

                    public final KDeclarationContainer getOwner() {
                        return null;
                    }

                    public final String getSignature() {
                        return "invoke()V";
                    }

                    public final void invoke() {
                        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80829, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80829, new Class[0], Void.TYPE);
                            return;
                        }
                        this.this$0.$realStart$3.invoke();
                    }
                }, new Function0<Unit>(this) {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ j this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final String getName() {
                        return "realCancel";
                    }

                    public final KDeclarationContainer getOwner() {
                        return null;
                    }

                    public final String getSignature() {
                        return "invoke()V";
                    }

                    public final void invoke() {
                        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 80830, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 80830, new Class[0], Void.TYPE);
                            return;
                        }
                        this.this$0.$realCancel$4.invoke();
                    }
                });
            }
        }
    }

    private c() {
    }

    public final void a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f70970a, false, 80804, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f70970a, false, 80804, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            ai.a("UploadSpeedProbe + " + str2);
        }
    }
}
