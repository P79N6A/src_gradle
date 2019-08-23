package com.ss.android.ugc.aweme.login.b;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.http.a.b.f;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.update.d;
import com.ss.android.ugc.aweme.utils.x;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u0006J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/login/larksso/LarkSsoHelper;", "", "()V", "month", "", "startSso", "", "getStartSso", "()Z", "setStartSso", "(Z)V", "getUserInfo", "", "url", "", "isTestChannel", "needSso", "onUrlEvent", "sso", "context", "Landroid/content/Context;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53744a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f53745b = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/ObservableEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.login.b.a$a  reason: collision with other inner class name */
    static final class C0620a<T> implements ObservableOnSubscribe<String> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53746a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f53747b;

        C0620a(String str) {
            this.f53747b = str;
        }

        public final void subscribe(@NotNull ObservableEmitter<String> observableEmitter) {
            ObservableEmitter<String> observableEmitter2 = observableEmitter;
            if (PatchProxy.isSupport(new Object[]{observableEmitter2}, this, f53746a, false, 56384, new Class[]{ObservableEmitter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{observableEmitter2}, this, f53746a, false, 56384, new Class[]{ObservableEmitter.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(observableEmitter2, AdvanceSetting.NETWORK_TYPE);
            String str = null;
            try {
                str = NetworkUtils.executeGet(0, 0, this.f53747b, true, false, (List<com.ss.android.http.a.a>) null, (f) null, true);
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optString("username");
                observableEmitter2.onNext(jSONObject.optString("email"));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/login/larksso/LarkSsoHelper$getUserInfo$2", "Lio/reactivex/Observer;", "", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Observer<String> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53748a;

        public final void onComplete() {
        }

        public final void onError(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f53748a, false, 56387, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f53748a, false, 56387, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f53748a, false, 56385, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f53748a, false, 56385, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "d");
        }

        b() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            if (PatchProxy.isSupport(new Object[]{str}, this, f53748a, false, 56386, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f53748a, false, 56386, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, "t");
            if (!TextUtils.isEmpty(str)) {
                com.ss.android.ugc.aweme.aj.b.b().a((Context) k.a(), "sso_time", System.currentTimeMillis());
                Intent intent = new Intent();
                if (com.ss.android.g.a.a()) {
                    String str2 = "com.ss.android.ugc.aweme.splash.SplashActivity";
                    Object service = ServiceManager.get().getService(IBridgeService.class);
                    Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…ridgeService::class.java)");
                    int isInterestOrWelcomeShowing = ((IBridgeService) service).isInterestOrWelcomeShowing();
                    if (isInterestOrWelcomeShowing == 1) {
                        str2 = "com.ss.android.ugc.aweme.interest.InterestSelectActivity";
                    } else if (isInterestOrWelcomeShowing == 2) {
                        str2 = "com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity";
                    }
                    intent.setClassName(k.a(), str2);
                    intent.setFlags(335544320);
                } else {
                    intent.addFlags(268435456);
                    intent.setClass(k.a(), MainActivity.class);
                }
                k.a().startActivity(intent);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53749a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f53750b;

        public c(Context context) {
            this.f53750b = context;
        }

        public final void run() {
            boolean z;
            boolean z2;
            if (PatchProxy.isSupport(new Object[0], this, f53749a, false, 56388, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53749a, false, 56388, new Class[0], Void.TYPE);
                return;
            }
            if (NetworkUtils.isNetworkAvailable(k.a())) {
                a aVar = a.f53745b;
                if (PatchProxy.isSupport(new Object[0], aVar, a.f53744a, false, 56381, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], aVar, a.f53744a, false, 56381, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    long d2 = com.ss.android.ugc.aweme.aj.b.b().d(k.a(), "sso_time");
                    if (d2 == 0 || System.currentTimeMillis() - d2 > TimeUnit.DAYS.toMillis(30)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    a aVar2 = a.f53745b;
                    if (PatchProxy.isSupport(new Object[0], aVar2, a.f53744a, false, 56380, new Class[0], Boolean.TYPE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], aVar2, a.f53744a, false, 56380, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
                        Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
                        if (!StringUtils.equal(b2.f3304b, "local_test")) {
                            com.ss.android.ugc.aweme.framework.core.a b3 = com.ss.android.ugc.aweme.framework.core.a.b();
                            Intrinsics.checkExpressionValueIsNotNull(b3, "AppTracker.get()");
                            if (!StringUtils.equal(b3.f3304b, "lark_inhouse")) {
                                z2 = false;
                            }
                        }
                        z2 = true;
                    }
                    if (z2) {
                        d a2 = d.a();
                        Intrinsics.checkExpressionValueIsNotNull(a2, "InHouseHelper.getInstance()");
                        if (!a2.f75212b && Build.VERSION.SDK_INT >= 23) {
                            x a3 = x.a();
                            Intrinsics.checkExpressionValueIsNotNull(a3, "BoeUtils.inst()");
                            if (!a3.f4300b) {
                                Intent a4 = com.ss.android.ugc.aweme.crossplatform.base.b.a(this.f53750b, "https://sso.bytedance.com/cas/login");
                                Intrinsics.checkExpressionValueIsNotNull(a4, "CrossPlatformUtil.getInt…bytedance.com/cas/login\")");
                                a4.setClass(this.f53750b, CrossPlatformActivity.class);
                                a4.putExtra("hide_more", true);
                                a4.putExtra("title_extra", this.f53750b.getString(C0906R.string.b4t));
                                a4.putExtra("key_support_back", false);
                                this.f53750b.startActivity(a4);
                            }
                        }
                    }
                }
            }
        }
    }

    private a() {
    }

    @JvmStatic
    public static final synchronized void a(@Nullable String str) {
        String str2 = str;
        synchronized (a.class) {
            if (PatchProxy.isSupport(new Object[]{str2}, null, f53744a, true, 56382, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, null, f53744a, true, 56382, new Class[]{String.class}, Void.TYPE);
            } else if (!TextUtils.isEmpty(str2)) {
                a aVar = f53745b;
                if (str2 == null) {
                    Intrinsics.throwNpe();
                }
                if (PatchProxy.isSupport(new Object[]{str2}, aVar, f53744a, false, 56383, new Class[]{String.class}, Void.TYPE)) {
                    a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{str2}, aVar2, f53744a, false, 56383, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                try {
                    if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "api/v1/be/user", false, 2, (Object) null)) {
                        Observable.create(new C0620a(str2)).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe((Observer<? super T>) new b<Object>());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
