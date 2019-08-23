package com.ss.android.ugc.aweme.commercialize.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.model.f;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\b\u0010\u0018\u001a\u00020\u0017H\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R0\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/api/CommerceSettingsApi;", "", "()V", "api", "Lcom/ss/android/ugc/aweme/commercialize/api/CommerceSettingsApi$IApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/ss/android/ugc/aweme/commercialize/api/CommerceSettingsApi$IApi;", "api$delegate", "Lkotlin/Lazy;", "<set-?>", "Lcom/ss/android/ugc/aweme/commercialize/model/CommerceSettings;", "settings", "settings$annotations", "getSettings", "()Lcom/ss/android/ugc/aweme/commercialize/model/CommerceSettings;", "setSettings", "(Lcom/ss/android/ugc/aweme/commercialize/model/CommerceSettings;)V", "getMusicClassAd", "Lcom/ss/android/ugc/aweme/commercialize/model/CommerceSettings$MusicListAdStruct;", "mcId", "", "update", "", "updateTask", "IApi", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CommerceSettingsApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38483a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f38484b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CommerceSettingsApi.class), "api", "getApi()Lcom/ss/android/ugc/aweme/commercialize/api/CommerceSettingsApi$IApi;"))};
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public static f f38485c;

    /* renamed from: d  reason: collision with root package name */
    public static final CommerceSettingsApi f38486d = new CommerceSettingsApi();

    /* renamed from: e  reason: collision with root package name */
    private static final Lazy f38487e = LazyKt.lazy(a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/api/CommerceSettingsApi$IApi;", "", "getSettings", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/ss/android/ugc/aweme/commercialize/model/CommerceSettings;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    interface IApi {
        @NotNull
        @GET(a = "/aweme/v1/commerce/settings")
        q<f> getSettings();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/commercialize/api/CommerceSettingsApi$IApi;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<IApi> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        public final IApi invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30411, new Class[0], IApi.class)) {
                return (IApi) a.a(IApi.class);
            }
            return (IApi) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30411, new Class[0], IApi.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    public static final class b<V> implements Callable<Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38488a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f38489b = new b();

        b() {
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f38488a, false, 30412, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f38488a, false, 30412, new Class[0], Void.TYPE);
            } else {
                CommerceSettingsApi.f38486d.b();
            }
            return Unit.INSTANCE;
        }
    }

    private CommerceSettingsApi() {
    }

    @Nullable
    public static final f a() {
        return f38485c;
    }

    public final synchronized void b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f38483a, false, 30409, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38483a, false, 30409, new Class[0], Void.TYPE);
        } else if (f38485c == null) {
            try {
                if (PatchProxy.isSupport(new Object[0], this, f38483a, false, 30407, new Class[0], IApi.class)) {
                    value = PatchProxy.accessDispatch(new Object[0], this, f38483a, false, 30407, new Class[0], IApi.class);
                } else {
                    value = f38487e.getValue();
                }
                f38485c = (f) ((IApi) value).getSettings().get();
            } catch (Exception unused) {
            }
        }
    }
}
