package com.ss.android.ugc.aweme.requestcombine;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.requestcombine.a.b;
import com.ss.android.ugc.aweme.requestcombine.a.c;
import com.ss.android.ugc.aweme.requestcombine.a.d;
import com.ss.android.ugc.aweme.requestcombine.a.e;
import com.ss.android.ugc.aweme.requestcombine.a.f;
import com.ss.android.ugc.aweme.requestcombine.a.g;
import com.ss.android.ugc.aweme.requestcombine.a.h;
import com.ss.android.ugc.aweme.requestcombine.a.i;
import com.ss.android.ugc.aweme.requestcombine.api.SettingCombineApi;
import com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.utils.bh;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\u000fJ\u0006\u0010\u0017\u001a\u00020\u0018J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\rH\u0002J\u0010\u0010 \u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u000e¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/ColdLaunchRequestCombiner;", "", "()V", "mColdLaunchRequests", "Ljava/util/HashMap;", "", "Lcom/ss/android/ugc/aweme/requestcombine/request/ColdLaunchRequest;", "Lkotlin/collections/HashMap;", "mOnFetchDataCallListeners", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/requestcombine/OnFetchDataListener;", "Lkotlin/collections/ArrayList;", "mSettingCombineModel", "Lcom/ss/android/ugc/aweme/requestcombine/model/SettingCombineModel;", "addFetchDataListener", "", "onFetchDataListener", "addRequest", "request", "getResponse", "Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "url", "getSettingNoCombine", "isUseSettingCombineApi", "", "monitorApiError", "key", "errorCode", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "onCombineSuccess", "settingCombineModel", "removeFetchDataListener", "context", "Landroid/content/Context;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63563a;

    /* renamed from: b  reason: collision with root package name */
    static SettingCombineModel f63564b;

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<b> f63565c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    static HashMap<String, com.ss.android.ugc.aweme.requestcombine.a.a> f63566d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public static final a f63567e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/requestcombine/ColdLaunchRequestCombiner$request$2", "Lio/reactivex/Observer;", "Lcom/ss/android/ugc/aweme/requestcombine/model/SettingCombineModel;", "onComplete", "", "onError", "e", "", "onNext", "settingCombineModel", "onSubscribe", "d", "Lio/reactivex/disposables/Disposable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.requestcombine.a$a  reason: collision with other inner class name */
    public static final class C0685a implements Observer<SettingCombineModel> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63568a;

        public final void onComplete() {
        }

        public final void onSubscribe(@NotNull Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f63568a, false, 70716, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f63568a, false, 70716, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(disposable2, "d");
        }

        C0685a() {
        }

        public final void onError(@NotNull Throwable th) {
            Integer num;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f63568a, false, 70718, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f63568a, false, 70718, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "e");
            a aVar = a.f63567e;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f63563a, false, 70711, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f63563a, false, 70711, new Class[0], Void.TYPE);
            } else {
                a.d d2 = com.ss.android.ugc.aweme.lego.a.i.d();
                for (Map.Entry next : a.f63566d.entrySet()) {
                    String str = (String) next.getKey();
                    com.ss.android.ugc.aweme.requestcombine.a.a aVar2 = (com.ss.android.ugc.aweme.requestcombine.a.a) next.getValue();
                    if (!aVar2.a(a.f63564b)) {
                        aVar2.a(d2);
                        Intrinsics.checkExpressionValueIsNotNull(str, "key");
                        BaseCombineMode b2 = aVar2.b();
                        if (b2 != null) {
                            num = Integer.valueOf(b2.getHttpCode());
                        } else {
                            num = null;
                        }
                        aVar.a(str, num);
                    }
                }
                d2.a();
            }
            a aVar3 = a.f63567e;
            ArrayList<b> arrayList = a.f63565c;
            if (arrayList != null) {
                for (b a2 : arrayList) {
                    a2.a(th2);
                }
            }
            n.a("combine_settings_monitor_service", 1, bh.a().a("errorDesc", th.getMessage()).b());
        }

        public final /* synthetic */ void onNext(Object obj) {
            Integer num;
            SettingCombineModel settingCombineModel = (SettingCombineModel) obj;
            if (PatchProxy.isSupport(new Object[]{settingCombineModel}, this, f63568a, false, 70717, new Class[]{SettingCombineModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{settingCombineModel}, this, f63568a, false, 70717, new Class[]{SettingCombineModel.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(settingCombineModel, "settingCombineModel");
            a aVar = a.f63567e;
            if (PatchProxy.isSupport(new Object[]{settingCombineModel}, aVar, a.f63563a, false, 70709, new Class[]{SettingCombineModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{settingCombineModel}, aVar, a.f63563a, false, 70709, new Class[]{SettingCombineModel.class}, Void.TYPE);
            } else {
                a.f63564b = settingCombineModel;
                a.d dVar = new a.d();
                for (Map.Entry next : a.f63566d.entrySet()) {
                    String str = (String) next.getKey();
                    com.ss.android.ugc.aweme.requestcombine.a.a aVar2 = (com.ss.android.ugc.aweme.requestcombine.a.a) next.getValue();
                    if (!aVar2.a(a.f63564b)) {
                        aVar2.a(dVar);
                        Intrinsics.checkExpressionValueIsNotNull(str, "key");
                        BaseCombineMode b2 = aVar2.b();
                        if (b2 != null) {
                            num = Integer.valueOf(b2.getHttpCode());
                        } else {
                            num = null;
                        }
                        aVar.a(str, num);
                    }
                }
                dVar.a();
                ArrayList<b> arrayList = a.f63565c;
                if (arrayList != null) {
                    for (b o : arrayList) {
                        o.o();
                    }
                }
            }
            n.a("combine_settings_monitor_service", 0, (JSONObject) null);
        }
    }

    private a() {
    }

    static {
        a aVar = new a();
        f63567e = aVar;
        aVar.a((com.ss.android.ugc.aweme.requestcombine.a.a) new c());
        aVar.a((com.ss.android.ugc.aweme.requestcombine.a.a) new b());
        aVar.a((com.ss.android.ugc.aweme.requestcombine.a.a) new d());
        aVar.a((com.ss.android.ugc.aweme.requestcombine.a.a) new e());
        aVar.a((com.ss.android.ugc.aweme.requestcombine.a.a) new f());
        aVar.a((com.ss.android.ugc.aweme.requestcombine.a.a) new g());
        aVar.a((com.ss.android.ugc.aweme.requestcombine.a.a) new h());
        aVar.a((com.ss.android.ugc.aweme.requestcombine.a.a) new i());
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f63563a, false, 70712, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63563a, false, 70712, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        AbTestModel d2 = a2.d();
        if (d2 != null) {
            z = d2.isUseSettingCombineApi;
        }
        return z;
    }

    public final void a(@Nullable b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f63563a, false, 70714, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f63563a, false, 70714, new Class[]{b.class}, Void.TYPE);
            return;
        }
        ArrayList<b> arrayList = f63565c;
        if (arrayList != null) {
            arrayList.add(bVar2);
        }
    }

    private final void a(com.ss.android.ugc.aweme.requestcombine.a.a aVar) {
        com.ss.android.ugc.aweme.requestcombine.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f63563a, false, 70707, new Class[]{com.ss.android.ugc.aweme.requestcombine.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f63563a, false, 70707, new Class[]{com.ss.android.ugc.aweme.requestcombine.a.a.class}, Void.TYPE);
            return;
        }
        String a2 = aVar.a();
        if (a2 != null) {
            f63566d.put(a2, aVar2);
        }
    }

    @Nullable
    public final BaseCombineMode a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63563a, false, 70713, new Class[]{String.class}, BaseCombineMode.class)) {
            return (BaseCombineMode) PatchProxy.accessDispatch(new Object[]{str2}, this, f63563a, false, 70713, new Class[]{String.class}, BaseCombineMode.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        com.ss.android.ugc.aweme.requestcombine.a.a aVar = f63566d.get(str2);
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public final void a(@NotNull Context context) {
        Double d2;
        SettingCombineApi settingCombineApi;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f63563a, false, 70708, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f63563a, false, 70708, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        StringBuilder sb = new StringBuilder();
        Set<String> keySet = f63566d.keySet();
        Intrinsics.checkExpressionValueIsNotNull(keySet, "mColdLaunchRequests.keys");
        int i = 0;
        for (String str : keySet) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(str);
            i++;
        }
        af a2 = af.a(com.ss.android.ugc.aweme.base.utils.d.a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "LocationHelperCompat.get…ionUtils.getAppContext())");
        com.ss.android.ugc.aweme.poi.a f2 = a2.f();
        Double d3 = null;
        if (f2 != null) {
            d2 = Double.valueOf(f2.longitude);
        } else {
            d2 = null;
        }
        String valueOf = String.valueOf(d2);
        if (f2 != null) {
            d3 = Double.valueOf(f2.latitude);
        }
        String valueOf2 = String.valueOf(d3);
        HashMap hashMap = new HashMap();
        hashMap.put("api_list", sb.toString());
        hashMap.put("longitude", valueOf);
        hashMap.put("latitude", valueOf2);
        Collection<com.ss.android.ugc.aweme.requestcombine.a.a> values = f63566d.values();
        Intrinsics.checkExpressionValueIsNotNull(values, "mColdLaunchRequests.values");
        for (com.ss.android.ugc.aweme.requestcombine.a.a a3 : values) {
            Map a4 = a3.a(context2);
            if (a4 != null) {
                hashMap.putAll(a4);
            }
        }
        SettingCombineApi.a aVar = SettingCombineApi.f63586a;
        if (PatchProxy.isSupport(new Object[0], aVar, SettingCombineApi.a.f63587a, false, 70724, new Class[0], SettingCombineApi.class)) {
            settingCombineApi = (SettingCombineApi) PatchProxy.accessDispatch(new Object[0], aVar, SettingCombineApi.a.f63587a, false, 70724, new Class[0], SettingCombineApi.class);
        } else {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(SettingCombineApi.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…ngCombineApi::class.java)");
            settingCombineApi = (SettingCombineApi) create;
        }
        settingCombineApi.request(hashMap).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new C0685a<Object>());
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, Integer num) {
        String str2 = str;
        Integer num2 = num;
        if (PatchProxy.isSupport(new Object[]{str2, num2}, this, f63563a, false, 70710, new Class[]{String.class, Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, num2}, this, f63563a, false, 70710, new Class[]{String.class, Integer.class}, Void.TYPE);
            return;
        }
        n.a("combine_settings_monitor_service", 2, bh.a().a("errorCode", num2).a(PushConstants.WEB_URL, str2).b());
    }
}
