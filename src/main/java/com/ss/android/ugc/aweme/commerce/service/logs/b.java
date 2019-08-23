package com.ss.android.ugc.aweme.commerce.service.logs;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.common.q;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\bH$J\b\u0010\u0012\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent;", "Lcom/ss/android/ugc/aweme/commerce/service/logs/MetricsEvent;", "event", "", "(Ljava/lang/String;)V", "params", "Ljava/util/HashMap;", "appendParam", "", "key", "value", "rule", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent$ParamRule;", "appendParam$commerce_service_release", "appendStagingFlagParam", "appendStaging", "", "buildParams", "post", "Companion", "ParamRule", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public abstract class b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f38109b;

    /* renamed from: e  reason: collision with root package name */
    public static final a f38110e = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, String> f38111c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final String f38112d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent$Companion;", "", "()V", "KEY_ENTER_FROM", "", "KEY_STAGING_FLAG", "TAG", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent$ParamRule;", "", "normalize", "", "param", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.b$b  reason: collision with other inner class name */
    public interface C0500b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38113a = a.f38114a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent$ParamRule$Companion;", "", "()V", "DEFAULT", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent$ParamRule;", "getDEFAULT", "()Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent$ParamRule;", "ID", "getID", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.b$b$a */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f38114a = new a();
            @NotNull

            /* renamed from: b  reason: collision with root package name */
            private static final C0500b f38115b = new C0501a();
            @NotNull

            /* renamed from: c  reason: collision with root package name */
            private static final C0500b f38116c = new C0502b();

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent$ParamRule$Companion$DEFAULT$1", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent$ParamRule;", "normalize", "", "param", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
            /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.b$b$a$a  reason: collision with other inner class name */
            public static final class C0501a implements C0500b {

                /* renamed from: b  reason: collision with root package name */
                public static ChangeQuickRedirect f38117b;

                C0501a() {
                }

                @NotNull
                public final String a(@NotNull String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{str2}, this, f38117b, false, 29694, new Class[]{String.class}, String.class)) {
                        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f38117b, false, 29694, new Class[]{String.class}, String.class);
                    }
                    Intrinsics.checkParameterIsNotNull(str2, "param");
                    if (TextUtils.isEmpty(str2) || Intrinsics.areEqual((Object) "null", (Object) str2)) {
                        return "";
                    }
                    return str2;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent$ParamRule$Companion$ID$1", "Lcom/ss/android/ugc/aweme/commerce/service/logs/BaseMetricsEvent$ParamRule;", "normalize", "", "param", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
            /* renamed from: com.ss.android.ugc.aweme.commerce.service.logs.b$b$a$b  reason: collision with other inner class name */
            public static final class C0502b implements C0500b {

                /* renamed from: b  reason: collision with root package name */
                public static ChangeQuickRedirect f38118b;

                C0502b() {
                }

                @NotNull
                public final String a(@NotNull String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{str2}, this, f38118b, false, 29695, new Class[]{String.class}, String.class)) {
                        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f38118b, false, 29695, new Class[]{String.class}, String.class);
                    }
                    Intrinsics.checkParameterIsNotNull(str2, "param");
                    if (TextUtils.isEmpty(str2) || Intrinsics.areEqual((Object) "null", (Object) str2) || Intrinsics.areEqual((Object) PushConstants.PUSH_TYPE_NOTIFY, (Object) str2)) {
                        return "";
                    }
                    return str2;
                }
            }

            private a() {
            }

            @NotNull
            public static C0500b a() {
                return f38115b;
            }
        }

        @NotNull
        String a(@NotNull String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38119a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f38120b;

        c(b bVar) {
            this.f38120b = bVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f38119a, false, 29696, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f38119a, false, 29696, new Class[0], Void.TYPE);
                return;
            }
            try {
                q.a(this.f38120b.f38112d, this.f38120b.f38111c);
            } catch (Throwable unused) {
            }
        }
    }

    @NotNull
    public final b a(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 0}, this, f38109b, false, 29693, new Class[]{Boolean.TYPE}, b.class)) {
            return this;
        }
        return (b) PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f38109b, false, 29693, new Class[]{Boolean.TYPE}, b.class);
    }

    public abstract void a();

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f38109b, false, 29691, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38109b, false, 29691, new Class[0], Void.TYPE);
            return;
        }
        a();
        com.ss.android.b.a.a.a.a(new c(this));
    }

    public b(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "event");
        this.f38112d = str;
    }

    public final void a(@NotNull String str, @Nullable String str2, @NotNull C0500b bVar) {
        String str3 = str;
        String str4 = str2;
        C0500b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, bVar2}, this, f38109b, false, 29692, new Class[]{String.class, String.class, C0500b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, bVar2}, this, f38109b, false, 29692, new Class[]{String.class, String.class, C0500b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "key");
        Intrinsics.checkParameterIsNotNull(bVar2, "rule");
        if (str4 != null) {
            this.f38111c.put(str3, bVar2.a(str4));
        }
    }
}
