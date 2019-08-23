package com.ss.android.ugc.aweme.antiaddic.lock.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.api.TeenageModeApi;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/presenter/TeenagerModePresenter;", "", "()V", "mApi", "Lcom/ss/android/ugc/aweme/antiaddic/lock/api/TeenageModeApi;", "mView", "Lcom/ss/android/ugc/aweme/antiaddic/lock/view/ITeenageView;", "bindView", "", "view", "checkTeenagePassword", "password", "", "getTeenageModeState", "", "setMinorSettings", "minorSettings", "syncTeenageModeState", "unBindView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33417a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.antiaddic.lock.b.a f33418b;

    /* renamed from: c  reason: collision with root package name */
    private final TeenageModeApi f33419c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/antiaddic/lock/presenter/TeenagerModePresenter$checkTeenagePassword$1", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.a.a$a  reason: collision with other inner class name */
    public static final class C0427a implements Observer<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33420a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f33421b;

        public final void onComplete() {
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f33420a, false, 21859, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f33420a, false, 21859, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "d");
        }

        C0427a(a aVar) {
            this.f33421b = aVar;
        }

        public final void onError(@NotNull Throwable th) {
            String str;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f33420a, false, 21858, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f33420a, false, 21858, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
            if (th2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th2;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    str = d.a().getString(C0906R.string.bge);
                } else {
                    str = aVar.getErrorMsg();
                }
                com.bytedance.ies.dmt.ui.d.a.b(d.a(), str).a();
            } else {
                com.bytedance.ies.dmt.ui.d.a.b(d.a(), (int) C0906R.string.bge).a();
            }
            com.ss.android.ugc.aweme.antiaddic.lock.b.a aVar2 = this.f33421b.f33418b;
            if (aVar2 != null) {
                aVar2.d();
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f33420a, false, 21857, new Class[]{BaseResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f33420a, false, 21857, new Class[]{BaseResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(baseResponse, "t");
            com.ss.android.ugc.aweme.antiaddic.lock.b.a aVar = this.f33421b.f33418b;
            if (aVar != null) {
                aVar.e();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/antiaddic/lock/presenter/TeenagerModePresenter$setMinorSettings$1", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Observer<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33422a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f33423b;

        public final void onComplete() {
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f33422a, false, 21860, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f33422a, false, 21860, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "d");
        }

        b(a aVar) {
            this.f33423b = aVar;
        }

        public final void onError(@NotNull Throwable th) {
            String str;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f33422a, false, 21862, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f33422a, false, 21862, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
            if (th2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) th2;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    str = d.a().getString(C0906R.string.bge);
                } else {
                    str = aVar.getErrorMsg();
                }
                com.bytedance.ies.dmt.ui.d.a.b(d.a(), str).a();
            } else {
                com.bytedance.ies.dmt.ui.d.a.b(d.a(), (int) C0906R.string.bge).a();
            }
            com.ss.android.ugc.aweme.antiaddic.lock.b.a aVar2 = this.f33423b.f33418b;
            if (aVar2 != null) {
                aVar2.d();
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f33422a, false, 21861, new Class[]{BaseResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f33422a, false, 21861, new Class[]{BaseResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(baseResponse, "t");
            com.ss.android.ugc.aweme.antiaddic.lock.b.a aVar = this.f33423b.f33418b;
            if (aVar != null) {
                aVar.e();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/antiaddic/lock/presenter/TeenagerModePresenter$syncTeenageModeState$1", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements Observer<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33424a;

        public final void onComplete() {
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f33424a, false, 21864, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f33424a, false, 21864, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f33424a, false, 21865, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f33424a, false, 21865, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "d");
        }

        c() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f33424a, false, 21863, new Class[]{BaseResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f33424a, false, 21863, new Class[]{BaseResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(baseResponse, "t");
            com.ss.android.ugc.aweme.antiaddic.lock.c cVar = com.ss.android.ugc.aweme.antiaddic.lock.c.f33443d;
            if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.antiaddic.lock.c.f33440a, false, 21782, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.antiaddic.lock.c.f33440a, false, 21782, new Class[0], Void.TYPE);
            } else {
                TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
                if (userSetting != null) {
                    TeenageModeSetting teenageModeSetting = com.ss.android.ugc.aweme.antiaddic.lock.c.f33441b;
                    if (teenageModeSetting != null) {
                        teenageModeSetting.setTeenageModeSelf(userSetting.isContentFilterOn());
                    }
                    TeenageModeSetting teenageModeSetting2 = com.ss.android.ugc.aweme.antiaddic.lock.c.f33441b;
                    if (teenageModeSetting2 != null) {
                        teenageModeSetting2.setTimeLockSelfInMin(userSetting.getLockTimeInMin());
                    }
                    TeenageModeSetting teenageModeSetting3 = com.ss.android.ugc.aweme.antiaddic.lock.c.f33441b;
                    if (teenageModeSetting3 != null) {
                        teenageModeSetting3.setMinorControlType(1);
                    }
                    cVar.a(com.ss.android.ugc.aweme.antiaddic.lock.c.f33441b);
                }
            }
            TimeLockRuler.removeUserSettingWithoutNotify();
        }
    }

    public final void b() {
        this.f33418b = null;
    }

    private final int c() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f33417a, false, 21856, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f33417a, false, 21856, new Class[0], Integer.TYPE)).intValue();
        }
        if (TimeLockRuler.isSelfContentFilterOn()) {
            i = 1;
        }
        return i;
    }

    public a() {
        TeenageModeApi teenageModeApi;
        TeenageModeApi.a aVar = TeenageModeApi.f33427a;
        if (PatchProxy.isSupport(new Object[0], aVar, TeenageModeApi.a.f33428a, false, 21842, new Class[0], TeenageModeApi.class)) {
            teenageModeApi = (TeenageModeApi) PatchProxy.accessDispatch(new Object[0], aVar, TeenageModeApi.a.f33428a, false, 21842, new Class[0], TeenageModeApi.class);
        } else {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(TeenageModeApi.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…enageModeApi::class.java)");
            teenageModeApi = (TeenageModeApi) create;
        }
        this.f33419c = teenageModeApi;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f33417a, false, 21853, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33417a, false, 21853, new Class[0], Void.TYPE);
            return;
        }
        TeenageModeApi teenageModeApi = this.f33419c;
        int c2 = c();
        int selfTimeInMin = TimeLockRuler.getSelfTimeInMin();
        com.ss.android.ugc.aweme.antiaddic.lock.c cVar = com.ss.android.ugc.aweme.antiaddic.lock.c.f33443d;
        String password = TimeLockRuler.getPassword();
        Intrinsics.checkExpressionValueIsNotNull(password, "TimeLockRuler.getPassword()");
        teenageModeApi.syncMinorSettings(c2, selfTimeInMin, cVar.a(password), TimeLockRuler.getLastPasswordSetTime() / 1000).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new c<Object>());
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.antiaddic.lock.b.a aVar) {
        com.ss.android.ugc.aweme.antiaddic.lock.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f33417a, false, 21852, new Class[]{com.ss.android.ugc.aweme.antiaddic.lock.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f33417a, false, 21852, new Class[]{com.ss.android.ugc.aweme.antiaddic.lock.b.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "view");
        this.f33418b = aVar2;
    }

    public final void b(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f33417a, false, 21855, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f33417a, false, 21855, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "minorSettings");
        this.f33419c.setMinorSettings(str).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new b<Object>(this));
    }

    public final void a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f33417a, false, 21854, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f33417a, false, 21854, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "password");
        this.f33419c.checkTeenagePassword(com.ss.android.ugc.aweme.antiaddic.lock.c.f33443d.a(str)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new C0427a<Object>(this));
    }
}
