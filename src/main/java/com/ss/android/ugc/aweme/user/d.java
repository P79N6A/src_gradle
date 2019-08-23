package com.ss.android.ugc.aweme.user;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003TUVB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u0004J\u001e\u00102\u001a\u000203\"\u0006\b\u0000\u00104\u0018\u00012\u0006\u00105\u001a\u0002H4H\b¢\u0006\u0002\u00106J\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000408J\u0006\u00109\u001a\u00020\u0004J\u0010\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u001dJ\u000e\u0010<\u001a\u0002032\u0006\u00101\u001a\u00020\u0004J\u0006\u0010=\u001a\u00020\u0004J\b\u0010>\u001a\u0004\u0018\u00010\u0012J\b\u0010?\u001a\u000203H\u0007J\u0010\u0010@\u001a\u00020\u001d2\b\u00101\u001a\u0004\u0018\u00010\u0004J\u0006\u0010A\u001a\u000203J\u0010\u0010B\u001a\u0004\u0018\u00010C2\u0006\u00101\u001a\u00020\u0004J(\u0010D\u001a\u000203\"\u0006\b\u0000\u00104\u0018\u00012\u0006\u00105\u001a\u0002H42\b\b\u0002\u0010E\u001a\u00020\u001dH\b¢\u0006\u0002\u0010FJ\u000e\u0010G\u001a\u0002032\u0006\u00105\u001a\u000200J\u000e\u0010H\u001a\u0002032\u0006\u00105\u001a\u00020\u0012J\u000e\u0010I\u001a\u0002032\u0006\u00105\u001a\u00020CJ*\u0010J\u001a\u0004\u0018\u0001H4\"\u0006\b\u0000\u00104\u0018\u00012\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u0010;\u001a\u00020\u001dH\b¢\u0006\u0002\u0010KJ \u0010L\u001a\u0004\u0018\u00010\u0004\"\u0006\b\u0000\u00104\u0018\u00012\u0006\u00105\u001a\u0002H4H\b¢\u0006\u0002\u0010MJ,\u0010N\u001a\u00020\u001d\"\u0004\b\u0000\u0010O*\b\u0012\u0004\u0012\u0002HO0+2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u0002HO\u0012\u0004\u0012\u00020\u001d0QH\u0002J,\u0010R\u001a\u000203\"\u0004\b\u0000\u0010O*\b\u0012\u0004\u0012\u0002HO0+2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u0002HO\u0012\u0004\u0012\u0002HO0QH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048F@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR&\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048F@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010R\u0011\u0010\"\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020&8FX\u0002¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b'\u0010(R\u0019\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+8F¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006W"}, d2 = {"Lcom/ss/android/ugc/aweme/user/UserStore;", "", "()V", "ACCOUNT_USER_INFO", "", "AWEME_USER_INFO", "CURRENT_FOREGROUND_UID", "LATEST_LOGGED_IN_UID", "LOGGED_IN_UID_LIST", "NULL_UID", "SIGNIFICANT_USER_INFO", "value", "currentUid", "getCurrentUid", "()Ljava/lang/String;", "setCurrentUid", "(Ljava/lang/String;)V", "defaultNullUser", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getDefaultNullUser", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "defaultNullUser$delegate", "Lkotlin/Lazy;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "isLogin", "", "()Z", "latestLoggedInUid", "getLatestLoggedInUid", "setLatestLoggedInUid", "lock", "getLock", "()Ljava/lang/Object;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "syncTasks", "", "Lcom/ss/android/ugc/aweme/user/UserStore$UserSyncTask;", "getSyncTasks", "()Ljava/util/List;", "accountUser", "Lcom/ss/android/ugc/aweme/user/UserStore$AccountUser;", "uid", "add", "", "T", "u", "(Ljava/lang/Object;)V", "allUidList", "", "currentForegroundUid", "currentUser", "fast", "delete", "getOldUserId", "getOldVersionUser", "init", "isNullUid", "save", "significantUserInfoUser", "Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;", "update", "addNotExist", "(Ljava/lang/Object;Z)V", "updateAccountUser", "updateAwemeUser", "updateSignificantUser", "user", "(Ljava/lang/String;Z)Ljava/lang/Object;", "userId", "(Ljava/lang/Object;)Ljava/lang/String;", "removeIfCompat", "E", "filter", "Lkotlin/Function1;", "replaceAllCompat", "operator", "AccountUser", "PartialUserSyncTask", "UserSyncTask", "accountuser_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75327a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f75328b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(d.class), "gson", "getGson()Lcom/google/gson/Gson;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(d.class), "sharedPreferences", "getSharedPreferences()Landroid/content/SharedPreferences;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(d.class), "defaultNullUser", "getDefaultNullUser()Lcom/ss/android/ugc/aweme/profile/model/User;"))};

    /* renamed from: c  reason: collision with root package name */
    public static final d f75329c = new d();
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final Object f75330d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final Lazy f75331e = LazyKt.lazy(e.INSTANCE);
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private static final Lazy f75332f = LazyKt.lazy(f.INSTANCE);
    private static final Lazy g = LazyKt.lazy(C0788d.INSTANCE);
    @NotNull
    private static final List<c> h = new ArrayList();
    @NotNull
    private static String i = "";
    @NotNull
    private static String j = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/user/UserStore$AccountUser;", "", "uid", "", "session", "name", "userVerified", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getSession", "getUid", "getUserVerified", "()Z", "Companion", "accountuser_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75333a;

        /* renamed from: f  reason: collision with root package name */
        public static final C0786a f75334f = new C0786a((byte) 0);
        @SerializedName("uid")
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final String f75335b;
        @SerializedName("session_key")
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final String f75336c;
        @SerializedName("name")
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        public final String f75337d;
        @SerializedName("user_verified")

        /* renamed from: e  reason: collision with root package name */
        public final boolean f75338e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/user/UserStore$AccountUser$Companion;", "", "()V", "from", "Lcom/ss/android/ugc/aweme/user/UserStore$AccountUser;", "uid", "", "session", "", "name", "userVerified", "", "accountuser_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
        /* renamed from: com.ss.android.ugc.aweme.user.d$a$a  reason: collision with other inner class name */
        public static final class C0786a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75339a;

            private C0786a() {
            }

            public /* synthetic */ C0786a(byte b2) {
                this();
            }

            @JvmStatic
            @NotNull
            public final a a(long j, @NotNull String str, @NotNull String str2, boolean z) {
                String valueOf;
                long j2 = j;
                String str3 = str;
                String str4 = str2;
                if (PatchProxy.isSupport(new Object[]{new Long(j2), str3, str4, Byte.valueOf(z ? (byte) 1 : 0)}, this, f75339a, false, 87609, new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE}, a.class)) {
                    Object[] objArr = {new Long(j2), str3, str4, Byte.valueOf(z)};
                    return (a) PatchProxy.accessDispatch(objArr, this, f75339a, false, 87609, new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE}, a.class);
                }
                Intrinsics.checkParameterIsNotNull(str3, "session");
                Intrinsics.checkParameterIsNotNull(str4, "name");
                if (j2 == 0) {
                    valueOf = "";
                } else {
                    valueOf = String.valueOf(j);
                }
                return new a(valueOf, str3, str4, z);
            }
        }

        @JvmStatic
        @NotNull
        public static final a a(long j, @NotNull String str, @NotNull String str2, boolean z) {
            long j2 = j;
            if (!PatchProxy.isSupport(new Object[]{new Long(j2), str, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f75333a, true, 87608, new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE}, a.class)) {
                return f75334f.a(j, str, str2, z);
            }
            Object[] objArr = {new Long(j2), str, str2, Byte.valueOf(z)};
            return (a) PatchProxy.accessDispatch(objArr, null, f75333a, true, 87608, new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE}, a.class);
        }

        public a(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "session");
            Intrinsics.checkParameterIsNotNull(str3, "name");
            this.f75335b = str;
            this.f75336c = str2;
            this.f75337d = str3;
            this.f75338e = z;
        }

        public /* synthetic */ a(String str, String str2, String str3, boolean z, int i) {
            this(str, "", "", false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b¢\u0006\u0002\u0010\tJ\u0017\u0010\u001e\u001a\u00020\u001f2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\u000fJ\u0006\u0010 \u001a\u00020\u001fJ\b\u0010!\u001a\u00020\u001fH\u0007J\u000f\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\rR,\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\n\u001a\u0004\u0018\u00018\u00008F@FX\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0019X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bX\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;", "T", "", "uid", "", "name", "dataInitValue", "upgrade", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "value", "data", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "dataClass", "Ljava/lang/Class;", "isInit", "", "()Z", "setInit", "(Z)V", "modifications", "Ljava/util/ArrayList;", "getName", "()Ljava/lang/String;", "spKey", "getUid", "addModification", "", "apply", "commit", "load", "accountuser_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75340a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f75341b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final String f75342c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        public final String f75343d;

        /* renamed from: e  reason: collision with root package name */
        private final Class<? extends T> f75344e;

        /* renamed from: f  reason: collision with root package name */
        private final String f75345f = (this.f75342c + '_' + this.f75343d);
        private ArrayList<T> g = new ArrayList<>(1);
        @Nullable
        private T h;
        private final Function0<T> i;

        private final T d() {
            T t;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f75340a, false, 87612, new Class[0], Object.class)) {
                return PatchProxy.accessDispatch(new Object[0], this, f75340a, false, 87612, new Class[0], Object.class);
            }
            String string = d.f75329c.c().getString(this.f75345f, "");
            CharSequence charSequence = string;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if (z) {
                return null;
            }
            try {
                t = d.f75329c.b().fromJson(string, (Type) this.f75344e);
            } catch (JsonSyntaxException unused) {
                t = null;
            }
            return t;
        }

        @Nullable
        public final T a() {
            if (PatchProxy.isSupport(new Object[0], this, f75340a, false, 87610, new Class[0], Object.class)) {
                return PatchProxy.accessDispatch(new Object[0], this, f75340a, false, 87610, new Class[0], Object.class);
            } else if (this.f75341b) {
                return this.h;
            } else {
                this.h = d();
                if (this.h == null) {
                    a(this.i.invoke());
                    b();
                }
                this.f75341b = true;
                return this.h;
            }
        }

        @SuppressLint({"ApplySharedPref"})
        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f75340a, false, 87613, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75340a, false, 87613, new Class[0], Void.TYPE);
                return;
            }
            for (Object next : this.g) {
                SharedPreferences.Editor edit = d.f75329c.c().edit();
                if (next == null) {
                    edit.remove(this.f75345f);
                } else {
                    edit.putString(this.f75345f, d.f75329c.b().toJson(next));
                }
                edit.commit();
            }
            this.g.clear();
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f75340a, false, 87614, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75340a, false, 87614, new Class[0], Void.TYPE);
                return;
            }
            for (Object next : this.g) {
                SharedPreferences.Editor edit = d.f75329c.c().edit();
                if (next == null) {
                    edit.remove(this.f75345f);
                } else {
                    edit.putString(this.f75345f, d.f75329c.b().toJson(next));
                }
                edit.apply();
            }
            this.g.clear();
        }

        private final void b(T t) {
            if (PatchProxy.isSupport(new Object[]{t}, this, f75340a, false, 87615, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{t}, this, f75340a, false, 87615, new Class[]{Object.class}, Void.TYPE);
                return;
            }
            this.g.clear();
            this.g.add(t);
        }

        public final void a(@Nullable T t) {
            if (PatchProxy.isSupport(new Object[]{t}, this, f75340a, false, 87611, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{t}, this, f75340a, false, 87611, new Class[]{Object.class}, Void.TYPE);
                return;
            }
            if (this.h != t) {
                this.h = t;
                b(t);
                this.f75341b = true;
            }
        }

        public b(@NotNull String str, @NotNull String str2, @NotNull T t, @NotNull Function0<? extends T> function0) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            Intrinsics.checkParameterIsNotNull(t, "dataInitValue");
            Intrinsics.checkParameterIsNotNull(function0, "upgrade");
            this.f75342c = str;
            this.f75343d = str2;
            this.i = function0;
            this.f75344e = t.getClass();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\n\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0002J\u001e\u0010\u001d\u001a\u00020\u001a\"\u0006\b\u0000\u0010\u001e\u0018\u00012\u0006\u0010\u001f\u001a\u0002H\u001eH\b¢\u0006\u0002\u0010 R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068FX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00068FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000e\u0010\tR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0012\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/user/UserStore$UserSyncTask;", "", "uid", "", "(Ljava/lang/String;)V", "accountUser", "Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;", "Lcom/ss/android/ugc/aweme/user/UserStore$AccountUser;", "getAccountUser", "()Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;", "accountUser$delegate", "Lkotlin/Lazy;", "awemeUser", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getAwemeUser", "awemeUser$delegate", "significantUser", "Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;", "getSignificantUser", "significantUser$delegate", "getUid", "()Ljava/lang/String;", "accountUserUpgrade", "awemeUserUpgrade", "defaultNullAwemeUser", "delete", "", "save", "significantUserInfoUpgrade", "update", "T", "u", "(Ljava/lang/Object;)V", "accountuser_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75346a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ KProperty[] f75347b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(c.class), "awemeUser", "getAwemeUser()Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(c.class), "accountUser", "getAccountUser()Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(c.class), "significantUser", "getSignificantUser()Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;"))};
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final String f75348c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Lazy f75349d = LazyKt.lazy(new b(this));
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Lazy f75350e = LazyKt.lazy(new a(this));
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Lazy f75351f = LazyKt.lazy(new C0787c(this));

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;", "Lcom/ss/android/ugc/aweme/user/UserStore$AccountUser;", "invoke"}, k = 3, mv = {1, 1, 13})
        static final class a extends Lambda implements Function0<b<a>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @NotNull
            public final b<a> invoke() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87626, new Class[0], b.class)) {
                    return (b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87626, new Class[0], b.class);
                }
                String str = this.this$0.f75348c;
                a aVar = new a(this.this$0.f75348c, null, null, false, 14);
                return new b<>(str, "account_user_info", aVar, new Function0<a>(this.this$0) {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    public final String getName() {
                        return "accountUserUpgrade";
                    }

                    public final KDeclarationContainer getOwner() {
                        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87628, new Class[0], KDeclarationContainer.class)) {
                            return Reflection.getOrCreateKotlinClass(c.class);
                        }
                        return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87628, new Class[0], KDeclarationContainer.class);
                    }

                    public final String getSignature() {
                        return "accountUserUpgrade()Lcom/ss/android/ugc/aweme/user/UserStore$AccountUser;";
                    }

                    @Nullable
                    public final a invoke() {
                        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87627, new Class[0], a.class)) {
                            return (a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87627, new Class[0], a.class);
                        }
                        c cVar = (c) this.receiver;
                        if (!PatchProxy.isSupport(new Object[0], cVar, c.f75346a, false, 87623, new Class[0], a.class)) {
                            return com.ss.android.ugc.aweme.user.util.d.b(cVar.f75348c);
                        }
                        return (a) PatchProxy.accessDispatch(new Object[0], cVar, c.f75346a, false, 87623, new Class[0], a.class);
                    }
                });
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "invoke"}, k = 3, mv = {1, 1, 13})
        static final class b extends Lambda implements Function0<b<User>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @NotNull
            public final b<User> invoke() {
                User user;
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87629, new Class[0], b.class)) {
                    return (b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87629, new Class[0], b.class);
                }
                String str = this.this$0.f75348c;
                c cVar = this.this$0;
                String str2 = this.this$0.f75348c;
                if (PatchProxy.isSupport(new Object[]{str2}, cVar, c.f75346a, false, 87625, new Class[]{String.class}, User.class)) {
                    c cVar2 = cVar;
                    user = (User) PatchProxy.accessDispatch(new Object[]{str2}, cVar2, c.f75346a, false, 87625, new Class[]{String.class}, User.class);
                } else {
                    user = new User();
                    user.setUid(str2);
                    user.setAllowStatus(1);
                }
                return new b<>(str, "aweme_user_info", user, new Function0<User>(this.this$0) {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    public final String getName() {
                        return "awemeUserUpgrade";
                    }

                    public final KDeclarationContainer getOwner() {
                        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87631, new Class[0], KDeclarationContainer.class)) {
                            return Reflection.getOrCreateKotlinClass(c.class);
                        }
                        return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87631, new Class[0], KDeclarationContainer.class);
                    }

                    public final String getSignature() {
                        return "awemeUserUpgrade()Lcom/ss/android/ugc/aweme/profile/model/User;";
                    }

                    @Nullable
                    public final User invoke() {
                        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87630, new Class[0], User.class)) {
                            return ((c) this.receiver).f();
                        }
                        return (User) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87630, new Class[0], User.class);
                    }
                });
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;", "Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;", "invoke"}, k = 3, mv = {1, 1, 13})
        /* renamed from: com.ss.android.ugc.aweme.user.d$c$c  reason: collision with other inner class name */
        static final class C0787c extends Lambda implements Function0<b<a>> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0787c(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @NotNull
            public final b<a> invoke() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87632, new Class[0], b.class)) {
                    return (b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87632, new Class[0], b.class);
                }
                String str = this.this$0.f75348c;
                a aVar = new a(this.this$0.f75348c, null, null, null, null, 30);
                return new b<>(str, "significant_user_info", aVar, new Function0<a>(this.this$0) {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    public final String getName() {
                        return "significantUserInfoUpgrade";
                    }

                    public final KDeclarationContainer getOwner() {
                        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87634, new Class[0], KDeclarationContainer.class)) {
                            return Reflection.getOrCreateKotlinClass(c.class);
                        }
                        return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87634, new Class[0], KDeclarationContainer.class);
                    }

                    public final String getSignature() {
                        return "significantUserInfoUpgrade()Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;";
                    }

                    @Nullable
                    public final a invoke() {
                        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87633, new Class[0], a.class)) {
                            return (a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87633, new Class[0], a.class);
                        }
                        c cVar = (c) this.receiver;
                        if (PatchProxy.isSupport(new Object[0], cVar, c.f75346a, false, 87624, new Class[0], a.class)) {
                            return (a) PatchProxy.accessDispatch(new Object[0], cVar, c.f75346a, false, 87624, new Class[0], a.class);
                        }
                        User f2 = cVar.f();
                        if (f2 != null) {
                            return a.g.a(f2);
                        }
                        return null;
                    }
                });
            }
        }

        @NotNull
        public final b<User> a() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f75346a, false, 87616, new Class[0], b.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f75346a, false, 87616, new Class[0], b.class);
            } else {
                value = this.f75349d.getValue();
            }
            return (b) value;
        }

        @NotNull
        public final b<a> b() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f75346a, false, 87617, new Class[0], b.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f75346a, false, 87617, new Class[0], b.class);
            } else {
                value = this.f75350e.getValue();
            }
            return (b) value;
        }

        @NotNull
        public final b<a> c() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f75346a, false, 87618, new Class[0], b.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f75346a, false, 87618, new Class[0], b.class);
            } else {
                value = this.f75351f.getValue();
            }
            return (b) value;
        }

        public final void d() {
            if (PatchProxy.isSupport(new Object[0], this, f75346a, false, 87620, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75346a, false, 87620, new Class[0], Void.TYPE);
                return;
            }
            a().c();
            b().c();
            c().c();
        }

        public final void e() {
            if (PatchProxy.isSupport(new Object[0], this, f75346a, false, 87621, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75346a, false, 87621, new Class[0], Void.TYPE);
                return;
            }
            a().a(null);
            a().b();
            b().a(null);
            b().b();
            c().a(null);
            c().b();
        }

        public final User f() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f75346a, false, 87622, new Class[0], User.class)) {
                return (User) PatchProxy.accessDispatch(new Object[0], this, f75346a, false, 87622, new Class[0], User.class);
            }
            User j = d.f75329c.j();
            if (j != null) {
                str = j.getUid();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual((Object) str, (Object) this.f75348c)) {
                return j;
            }
            return null;
        }

        public c(@NotNull String str) {
            Intrinsics.checkParameterIsNotNull(str, "uid");
            this.f75348c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/profile/model/User;", "invoke"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.ss.android.ugc.aweme.user.d$d  reason: collision with other inner class name */
    static final class C0788d extends Lambda implements Function0<User> {
        public static final C0788d INSTANCE = new C0788d();
        public static ChangeQuickRedirect changeQuickRedirect;

        C0788d() {
            super(0);
        }

        @NotNull
        public final User invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87635, new Class[0], User.class)) {
                return (User) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87635, new Class[0], User.class);
            }
            User user = new User();
            user.setAllowStatus(1);
            return user;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class e extends Lambda implements Function0<Gson> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(0);
        }

        @NotNull
        public final Gson invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87636, new Class[0], Gson.class)) {
                return new Gson();
            }
            return (Gson) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87636, new Class[0], Gson.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class f extends Lambda implements Function0<SharedPreferences> {
        public static final f INSTANCE = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(0);
        }

        public final SharedPreferences invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87637, new Class[0], SharedPreferences.class)) {
                return com.ss.android.ugc.aweme.q.c.a(ae.a(), "aweme_user", 0);
            }
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87637, new Class[0], SharedPreferences.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/user/UserStore$UserSyncTask;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class g extends Lambda implements Function1<c, Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ List $uidList;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(List list) {
            super(1);
            this.$uidList = list;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((c) obj));
        }

        public final boolean invoke(@NotNull c cVar) {
            c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 87638, new Class[]{c.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 87638, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(cVar2, AdvanceSetting.NETWORK_TYPE);
            if (!this.$uidList.contains(cVar2.f75348c)) {
                return true;
            }
            return false;
        }
    }

    public final Gson b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f75327a, false, 87579, new Class[0], Gson.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f75327a, false, 87579, new Class[0], Gson.class);
        } else {
            value = f75331e.getValue();
        }
        return (Gson) value;
    }

    @NotNull
    public final SharedPreferences c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f75327a, false, 87580, new Class[0], SharedPreferences.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f75327a, false, 87580, new Class[0], SharedPreferences.class);
        } else {
            value = f75332f.getValue();
        }
        return (SharedPreferences) value;
    }

    private d() {
    }

    @NotNull
    public static Object a() {
        return f75330d;
    }

    public final boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f75327a, false, 87584, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f75327a, false, 87584, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!f(f())) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (r0 == null) goto L_0x004f;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String k() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f75327a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 87606(0x15636, float:1.22762E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f75327a
            r5 = 0
            r6 = 87606(0x15636, float:1.22762E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0028:
            android.app.Application r1 = com.ss.android.ugc.aweme.ae.a()
            java.lang.String r2 = "com.ss.spipe_setting"
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r1, r2, r0)
            java.lang.String r1 = "user_id"
            r2 = 0
            long r0 = r0.getLong(r1, r2)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0043
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x0043:
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.j()
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L_0x0051
        L_0x004f:
            java.lang.String r0 = "0"
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.user.d.k():java.lang.String");
    }

    @NotNull
    public final List<c> d() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f75327a, false, 87582, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f75327a, false, 87582, new Class[0], List.class);
        }
        List<String> h2 = h();
        for (String str : h2) {
            Iterator it2 = h.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual((Object) ((c) obj).f75348c, (Object) str)) {
                    break;
                }
            }
            if (obj == null) {
                h.add(new c(str));
            }
        }
        a(h, new g(h2));
        return h;
    }

    @NotNull
    public final List<String> h() {
        boolean z;
        List<String> list;
        if (PatchProxy.isSupport(new Object[0], this, f75327a, false, 87601, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f75327a, false, 87601, new Class[0], List.class);
        }
        synchronized (f75330d) {
            String string = f75329c.c().getString("logged_in_uid_list", "");
            if (string == null) {
                string = "";
            }
            if (string.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                list = CollectionsKt.emptyList();
            } else {
                list = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
            }
        }
        return list;
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f75327a, false, 87603, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75327a, false, 87603, new Class[0], Void.TYPE);
            return;
        }
        synchronized (f75330d) {
            for (c d2 : f75329c.d()) {
                d2.d();
            }
            f75329c.c().edit().putString("current_foreground_uid", f75329c.f()).apply();
        }
    }

    @Nullable
    public final User j() {
        if (PatchProxy.isSupport(new Object[0], this, f75327a, false, 87607, new Class[0], User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[0], this, f75327a, false, 87607, new Class[0], User.class);
        }
        User user = null;
        String string = c().getString("user_info", "");
        try {
            if (!TextUtils.isEmpty(string)) {
                user = (User) b().fromJson(string, User.class);
            }
        } catch (Exception unused) {
        }
        return user;
    }

    @NotNull
    public final String f() {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[0], this, f75327a, false, 87585, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f75327a, false, 87585, new Class[0], String.class);
        }
        synchronized (f75330d) {
            if (i.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = i;
            } else {
                String string = f75329c.c().getString("current_foreground_uid", "");
                if (string == null) {
                    Intrinsics.throwNpe();
                }
                if (string.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    str = f75329c.c().getString("current_foreground_uid", PushConstants.PUSH_TYPE_NOTIFY);
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                } else {
                    d dVar = f75329c;
                    if (!dVar.f(dVar.k())) {
                        str = f75329c.k();
                    } else {
                        User j2 = f75329c.j();
                        if (j2 != null) {
                            str2 = j2.getUid();
                        } else {
                            str2 = null;
                        }
                        CharSequence charSequence = str2;
                        if (charSequence == null || charSequence.length() == 0) {
                            z3 = true;
                        }
                        if (z3) {
                            str = PushConstants.PUSH_TYPE_NOTIFY;
                        } else {
                            if (j2 == null) {
                                Intrinsics.throwNpe();
                            }
                            str = j2.getUid();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(str, "if (user?.uid.isNullOrEm… NULL_UID else user!!.uid");
                    }
                }
            }
            i = str;
        }
        return str;
    }

    @NotNull
    public final synchronized String g() {
        boolean z;
        String str;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f75327a, false, 87587, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f75327a, false, 87587, new Class[0], String.class);
        }
        if (j.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = j;
        } else {
            String string = c().getString("latest_logged_in_uid_list", "");
            if (string == null) {
                Intrinsics.throwNpe();
            }
            if (string.length() > 0) {
                z2 = true;
            }
            if (z2) {
                str = c().getString("latest_logged_in_uid_list", PushConstants.PUSH_TYPE_NOTIFY);
                if (str == null) {
                    Intrinsics.throwNpe();
                }
            } else {
                str = c().getString("last_uid", "");
                if (str == null) {
                    Intrinsics.throwNpe();
                }
            }
        }
        j = str;
        return str;
    }

    public final synchronized void b(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f75327a, false, 87588, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f75327a, false, 87588, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "value");
        if (!Intrinsics.areEqual((Object) j, (Object) str)) {
            j = str;
            c().edit().putString("latest_logged_in_uid_list", str).apply();
        }
    }

    public final boolean f(@Nullable String str) {
        boolean z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f75327a, false, 87602, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f75327a, false, 87602, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        CharSequence charSequence = str2;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || Intrinsics.areEqual((Object) str2, (Object) PushConstants.PUSH_TYPE_NOTIFY)) {
            return true;
        }
        return false;
    }

    @SuppressLint({"ApplySharedPref"})
    public final void a(@NotNull String str) {
        String str2;
        String str3 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f75327a, false, 87586, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3}, this, f75327a, false, 87586, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "value");
        synchronized (f75330d) {
            if (!Intrinsics.areEqual((Object) i, (Object) str3)) {
                if (str3.length() != 0) {
                    z = false;
                }
                if (z) {
                    str2 = PushConstants.PUSH_TYPE_NOTIFY;
                } else {
                    str2 = str3;
                }
                i = str2;
                com.ss.android.ugc.aweme.account.terminal.a.f32778d.b(str3);
                f75329c.c().edit().putString("current_foreground_uid", i).commit();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.ss.android.ugc.aweme.user.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.ss.android.ugc.aweme.user.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.ss.android.ugc.aweme.user.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.ss.android.ugc.aweme.user.d$a} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cf, code lost:
        return r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.user.d.a c(@org.jetbrains.annotations.NotNull java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f75327a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r8 = com.ss.android.ugc.aweme.user.d.a.class
            r5 = 0
            r6 = 87591(0x15627, float:1.22741E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f75327a
            r13 = 0
            r14 = 87591(0x15627, float:1.22741E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r16 = com.ss.android.ugc.aweme.user.d.a.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.user.d$a r0 = (com.ss.android.ugc.aweme.user.d.a) r0
            return r0
        L_0x0039:
            java.lang.String r1 = "uid"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            java.lang.Object r1 = a()
            monitor-enter(r1)
            com.ss.android.ugc.aweme.user.d r2 = f75329c     // Catch:{ all -> 0x00d0 }
            java.util.List r2 = r2.d()     // Catch:{ all -> 0x00d0 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x00d0 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00d0 }
        L_0x004f:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00d0 }
            r4 = 0
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00d0 }
            r5 = r3
            com.ss.android.ugc.aweme.user.d$c r5 = (com.ss.android.ugc.aweme.user.d.c) r5     // Catch:{ all -> 0x00d0 }
            java.lang.String r5 = r5.f75348c     // Catch:{ all -> 0x00d0 }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)     // Catch:{ all -> 0x00d0 }
            if (r5 == 0) goto L_0x004f
            goto L_0x0067
        L_0x0066:
            r3 = r4
        L_0x0067:
            com.ss.android.ugc.aweme.user.d$c r3 = (com.ss.android.ugc.aweme.user.d.c) r3     // Catch:{ all -> 0x00d0 }
            if (r3 != 0) goto L_0x006d
            monitor-exit(r1)
            return r4
        L_0x006d:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r0 = com.ss.android.ugc.aweme.user.d.a.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r2 = com.ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)     // Catch:{ all -> 0x00d0 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.user.d$b r0 = r3.a()     // Catch:{ all -> 0x00d0 }
            boolean r0 = r0.f75341b     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0093
            com.ss.android.ugc.aweme.user.d$b r0 = r3.a()     // Catch:{ all -> 0x00d0 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x00d0 }
            r4 = r0
            com.ss.android.ugc.aweme.user.d$a r4 = (com.ss.android.ugc.aweme.user.d.a) r4     // Catch:{ all -> 0x00d0 }
            goto L_0x00ce
        L_0x0093:
            com.ss.android.ugc.aweme.user.d$b r0 = r3.a()     // Catch:{ all -> 0x00d0 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x00d0 }
            r4 = r0
            com.ss.android.ugc.aweme.user.d$a r4 = (com.ss.android.ugc.aweme.user.d.a) r4     // Catch:{ all -> 0x00d0 }
            goto L_0x00ce
        L_0x009f:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r2 = com.ss.android.ugc.aweme.user.d.a.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)     // Catch:{ all -> 0x00d0 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x00b7
            com.ss.android.ugc.aweme.user.d$b r0 = r3.b()     // Catch:{ all -> 0x00d0 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x00d0 }
            r4 = r0
            com.ss.android.ugc.aweme.user.d$a r4 = (com.ss.android.ugc.aweme.user.d.a) r4     // Catch:{ all -> 0x00d0 }
            goto L_0x00ce
        L_0x00b7:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r2 = com.ss.android.ugc.aweme.user.a.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)     // Catch:{ all -> 0x00d0 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00ce
            com.ss.android.ugc.aweme.user.d$b r0 = r3.c()     // Catch:{ all -> 0x00d0 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x00d0 }
            r4 = r0
            com.ss.android.ugc.aweme.user.d$a r4 = (com.ss.android.ugc.aweme.user.d.a) r4     // Catch:{ all -> 0x00d0 }
        L_0x00ce:
            monitor-exit(r1)
            return r4
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.user.d.c(java.lang.String):com.ss.android.ugc.aweme.user.d$a");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.ss.android.ugc.aweme.user.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.ss.android.ugc.aweme.user.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.ss.android.ugc.aweme.user.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.ss.android.ugc.aweme.user.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cf, code lost:
        return r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.user.a d(@org.jetbrains.annotations.NotNull java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f75327a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r8 = com.ss.android.ugc.aweme.user.a.class
            r5 = 0
            r6 = 87592(0x15628, float:1.22743E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f75327a
            r13 = 0
            r14 = 87592(0x15628, float:1.22743E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r16 = com.ss.android.ugc.aweme.user.a.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.user.a r0 = (com.ss.android.ugc.aweme.user.a) r0
            return r0
        L_0x0039:
            java.lang.String r1 = "uid"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            java.lang.Object r1 = a()
            monitor-enter(r1)
            com.ss.android.ugc.aweme.user.d r2 = f75329c     // Catch:{ all -> 0x00d0 }
            java.util.List r2 = r2.d()     // Catch:{ all -> 0x00d0 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x00d0 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00d0 }
        L_0x004f:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00d0 }
            r4 = 0
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00d0 }
            r5 = r3
            com.ss.android.ugc.aweme.user.d$c r5 = (com.ss.android.ugc.aweme.user.d.c) r5     // Catch:{ all -> 0x00d0 }
            java.lang.String r5 = r5.f75348c     // Catch:{ all -> 0x00d0 }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)     // Catch:{ all -> 0x00d0 }
            if (r5 == 0) goto L_0x004f
            goto L_0x0067
        L_0x0066:
            r3 = r4
        L_0x0067:
            com.ss.android.ugc.aweme.user.d$c r3 = (com.ss.android.ugc.aweme.user.d.c) r3     // Catch:{ all -> 0x00d0 }
            if (r3 != 0) goto L_0x006d
            monitor-exit(r1)
            return r4
        L_0x006d:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r0 = com.ss.android.ugc.aweme.user.a.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r2 = com.ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)     // Catch:{ all -> 0x00d0 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.user.d$b r0 = r3.a()     // Catch:{ all -> 0x00d0 }
            boolean r0 = r0.f75341b     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0093
            com.ss.android.ugc.aweme.user.d$b r0 = r3.a()     // Catch:{ all -> 0x00d0 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x00d0 }
            r4 = r0
            com.ss.android.ugc.aweme.user.a r4 = (com.ss.android.ugc.aweme.user.a) r4     // Catch:{ all -> 0x00d0 }
            goto L_0x00ce
        L_0x0093:
            com.ss.android.ugc.aweme.user.d$b r0 = r3.a()     // Catch:{ all -> 0x00d0 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x00d0 }
            r4 = r0
            com.ss.android.ugc.aweme.user.a r4 = (com.ss.android.ugc.aweme.user.a) r4     // Catch:{ all -> 0x00d0 }
            goto L_0x00ce
        L_0x009f:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r2 = com.ss.android.ugc.aweme.user.d.a.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)     // Catch:{ all -> 0x00d0 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x00b7
            com.ss.android.ugc.aweme.user.d$b r0 = r3.b()     // Catch:{ all -> 0x00d0 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x00d0 }
            r4 = r0
            com.ss.android.ugc.aweme.user.a r4 = (com.ss.android.ugc.aweme.user.a) r4     // Catch:{ all -> 0x00d0 }
            goto L_0x00ce
        L_0x00b7:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r2 = com.ss.android.ugc.aweme.user.a.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)     // Catch:{ all -> 0x00d0 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00ce
            com.ss.android.ugc.aweme.user.d$b r0 = r3.c()     // Catch:{ all -> 0x00d0 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x00d0 }
            r4 = r0
            com.ss.android.ugc.aweme.user.a r4 = (com.ss.android.ugc.aweme.user.a) r4     // Catch:{ all -> 0x00d0 }
        L_0x00ce:
            monitor-exit(r1)
            return r4
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.user.d.d(java.lang.String):com.ss.android.ugc.aweme.user.a");
    }

    public final void e(@NotNull String str) {
        Object obj;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f75327a, false, 87598, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f75327a, false, 87598, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "uid");
        if (Intrinsics.areEqual((Object) str2, (Object) f())) {
            a(PushConstants.PUSH_TYPE_NOTIFY);
        }
        synchronized (f75330d) {
            Iterator it2 = f75329c.d().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual((Object) ((c) obj).f75348c, (Object) str2)) {
                    break;
                }
            }
            c cVar = (c) obj;
            if (cVar != null) {
                cVar.e();
            }
            Collection d2 = f75329c.d();
            if (d2 != null) {
                TypeIntrinsics.asMutableCollection(d2).remove(cVar);
                SharedPreferences.Editor edit = f75329c.c().edit();
                Collection arrayList = new ArrayList();
                for (Object next : f75329c.h()) {
                    if (!Intrinsics.areEqual((Object) (String) next, (Object) str2)) {
                        arrayList.add(next);
                    }
                }
                edit.putString("logged_in_uid_list", CollectionsKt.joinToString$default((List) arrayList, ",", null, null, 0, null, null, 62, null)).apply();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.ss.android.ugc.aweme.profile.model.User} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.profile.model.User a(boolean r17) {
        /*
            r16 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r8 = 0
            java.lang.Byte r2 = java.lang.Byte.valueOf(r8)
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f75327a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r8] = r2
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r7 = com.ss.android.ugc.aweme.profile.model.User.class
            r4 = 0
            r5 = 87589(0x15625, float:1.22738E-40)
            r2 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003f
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r9[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = f75327a
            r12 = 0
            r13 = 87589(0x15625, float:1.22738E-40)
            java.lang.Class[] r14 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r14[r8] = r0
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r15 = com.ss.android.ugc.aweme.profile.model.User.class
            r10 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            return r0
        L_0x003f:
            java.lang.String r0 = r16.f()
            java.lang.Object r1 = a()
            monitor-enter(r1)
            com.ss.android.ugc.aweme.user.d r2 = f75329c     // Catch:{ all -> 0x0107 }
            java.util.List r2 = r2.d()     // Catch:{ all -> 0x0107 }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x0107 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0107 }
        L_0x0054:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0107 }
            r4 = 0
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0107 }
            r5 = r3
            com.ss.android.ugc.aweme.user.d$c r5 = (com.ss.android.ugc.aweme.user.d.c) r5     // Catch:{ all -> 0x0107 }
            java.lang.String r5 = r5.f75348c     // Catch:{ all -> 0x0107 }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x0054
            goto L_0x006c
        L_0x006b:
            r3 = r4
        L_0x006c:
            com.ss.android.ugc.aweme.user.d$c r3 = (com.ss.android.ugc.aweme.user.d.c) r3     // Catch:{ all -> 0x0107 }
            if (r3 != 0) goto L_0x0072
            monitor-exit(r1)
            goto L_0x00d2
        L_0x0072:
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r0 = com.ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)     // Catch:{ all -> 0x0107 }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r2 = com.ss.android.ugc.aweme.profile.model.User.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)     // Catch:{ all -> 0x0107 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.user.d$b r0 = r3.a()     // Catch:{ all -> 0x0107 }
            boolean r0 = r0.f75341b     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0098
            com.ss.android.ugc.aweme.user.d$b r0 = r3.a()     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0107 }
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0     // Catch:{ all -> 0x0107 }
        L_0x0096:
            r4 = r0
            goto L_0x00d1
        L_0x0098:
            com.ss.android.ugc.aweme.user.d$b r0 = r3.a()     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0107 }
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0     // Catch:{ all -> 0x0107 }
            goto L_0x0096
        L_0x00a3:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r2 = com.ss.android.ugc.aweme.user.d.a.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)     // Catch:{ all -> 0x0107 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.user.d$b r0 = r3.b()     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0107 }
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0     // Catch:{ all -> 0x0107 }
            goto L_0x0096
        L_0x00ba:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r2 = com.ss.android.ugc.aweme.user.a.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)     // Catch:{ all -> 0x0107 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x00d1
            com.ss.android.ugc.aweme.user.d$b r0 = r3.c()     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0107 }
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0     // Catch:{ all -> 0x0107 }
            goto L_0x0096
        L_0x00d1:
            monitor-exit(r1)
        L_0x00d2:
            if (r4 != 0) goto L_0x0106
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r11 = f75327a
            r12 = 0
            r13 = 87581(0x1561d, float:1.22727E-40)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r15 = com.ss.android.ugc.aweme.profile.model.User.class
            r10 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x00fd
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r3 = f75327a
            r4 = 0
            r5 = 87581(0x1561d, float:1.22727E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r7 = com.ss.android.ugc.aweme.profile.model.User.class
            r2 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            return r0
        L_0x00fd:
            kotlin.Lazy r0 = g
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            com.ss.android.ugc.aweme.profile.model.User r4 = (com.ss.android.ugc.aweme.profile.model.User) r4
        L_0x0106:
            return r4
        L_0x0107:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.user.d.a(boolean):com.ss.android.ugc.aweme.profile.model.User");
    }

    public final void a(@NotNull User user) {
        String str;
        Object obj;
        String str2;
        Object obj2;
        User user2 = user;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{user2}, this, f75327a, false, 87595, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, f75327a, false, 87595, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user2, "u");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(User.class);
        if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(User.class))) {
            str = user.getUid();
        } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
            str = ((a) user2).f75335b;
        } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
            str = ((a) user2).f75289b;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        if (str != null) {
            synchronized (a()) {
                Iterator it2 = f75329c.d().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.areEqual((Object) ((c) obj).f75348c, (Object) str)) {
                        break;
                    }
                }
                c cVar = (c) obj;
                if (cVar != null) {
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(User.class);
                    if (Intrinsics.areEqual((Object) orCreateKotlinClass2, (Object) Reflection.getOrCreateKotlinClass(User.class))) {
                        cVar.a().a(user2);
                        b<a> c2 = cVar.c();
                        a.C0785a aVar = a.g;
                        Object a2 = cVar.a().a();
                        if (a2 != null) {
                            c2.a(aVar.a((User) a2));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                        }
                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass2, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                        cVar.b().a((a) user2);
                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass2, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                        cVar.c().a((a) user2);
                    }
                    cVar.d();
                }
                if (cVar == null) {
                    d dVar = f75329c;
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(User.class);
                    if (Intrinsics.areEqual((Object) orCreateKotlinClass3, (Object) Reflection.getOrCreateKotlinClass(User.class))) {
                        str2 = user.getUid();
                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass3, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                        str2 = ((a) user2).f75335b;
                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass3, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                        str2 = ((a) user2).f75289b;
                    } else {
                        str2 = PushConstants.PUSH_TYPE_NOTIFY;
                    }
                    if (str2 != null) {
                        if (!dVar.f(str2)) {
                            Iterable h2 = dVar.h();
                            if (!(h2 instanceof Collection) || !((Collection) h2).isEmpty()) {
                                Iterator it3 = h2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (Intrinsics.areEqual((Object) (String) it3.next(), (Object) str2)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            z = false;
                            if (!z) {
                                SharedPreferences.Editor edit = dVar.c().edit();
                                List arrayList = new ArrayList();
                                arrayList.addAll(dVar.h());
                                arrayList.add(str2);
                                edit.putString("logged_in_uid_list", CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
                                edit.apply();
                                Iterator it4 = dVar.d().iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it4.next();
                                    if (Intrinsics.areEqual((Object) ((c) obj2).f75348c, (Object) str2)) {
                                        break;
                                    }
                                }
                                c cVar2 = (c) obj2;
                                if (cVar2 != null) {
                                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(User.class);
                                    if (Intrinsics.areEqual((Object) orCreateKotlinClass4, (Object) Reflection.getOrCreateKotlinClass(User.class))) {
                                        cVar2.a().a(user2);
                                        b<a> c3 = cVar2.c();
                                        a.C0785a aVar2 = a.g;
                                        Object a3 = cVar2.a().a();
                                        if (a3 != null) {
                                            c3.a(aVar2.a((User) a3));
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                        }
                                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass4, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                                        cVar2.b().a((a) user2);
                                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass4, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                                        cVar2.c().a((a) user2);
                                    }
                                    cVar2.d();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(@NotNull a aVar) {
        String str;
        Object obj;
        String str2;
        Object obj2;
        a aVar2 = aVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f75327a, false, 87596, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f75327a, false, 87596, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "u");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(a.class);
        if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(User.class))) {
            str = ((User) aVar2).getUid();
        } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
            str = ((a) aVar2).f75335b;
        } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
            str = aVar2.f75289b;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        if (str != null) {
            synchronized (a()) {
                Iterator it2 = f75329c.d().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.areEqual((Object) ((c) obj).f75348c, (Object) str)) {
                        break;
                    }
                }
                c cVar = (c) obj;
                if (cVar != null) {
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(a.class);
                    if (Intrinsics.areEqual((Object) orCreateKotlinClass2, (Object) Reflection.getOrCreateKotlinClass(User.class))) {
                        cVar.a().a((User) aVar2);
                        b<a> c2 = cVar.c();
                        a.C0785a aVar3 = a.g;
                        Object a2 = cVar.a().a();
                        if (a2 != null) {
                            c2.a(aVar3.a((User) a2));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                        }
                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass2, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                        cVar.b().a((a) aVar2);
                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass2, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                        cVar.c().a(aVar2);
                    }
                    cVar.d();
                }
                if (cVar == null) {
                    d dVar = f75329c;
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(a.class);
                    if (Intrinsics.areEqual((Object) orCreateKotlinClass3, (Object) Reflection.getOrCreateKotlinClass(User.class))) {
                        str2 = ((User) aVar2).getUid();
                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass3, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                        str2 = ((a) aVar2).f75335b;
                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass3, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                        str2 = aVar2.f75289b;
                    } else {
                        str2 = PushConstants.PUSH_TYPE_NOTIFY;
                    }
                    if (str2 != null) {
                        if (!dVar.f(str2)) {
                            Iterable h2 = dVar.h();
                            if (!(h2 instanceof Collection) || !((Collection) h2).isEmpty()) {
                                Iterator it3 = h2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (Intrinsics.areEqual((Object) (String) it3.next(), (Object) str2)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            z = false;
                            if (!z) {
                                SharedPreferences.Editor edit = dVar.c().edit();
                                List arrayList = new ArrayList();
                                arrayList.addAll(dVar.h());
                                arrayList.add(str2);
                                edit.putString("logged_in_uid_list", CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
                                edit.apply();
                                Iterator it4 = dVar.d().iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it4.next();
                                    if (Intrinsics.areEqual((Object) ((c) obj2).f75348c, (Object) str2)) {
                                        break;
                                    }
                                }
                                c cVar2 = (c) obj2;
                                if (cVar2 != null) {
                                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(a.class);
                                    if (Intrinsics.areEqual((Object) orCreateKotlinClass4, (Object) Reflection.getOrCreateKotlinClass(User.class))) {
                                        cVar2.a().a((User) aVar2);
                                        b<a> c3 = cVar2.c();
                                        a.C0785a aVar4 = a.g;
                                        Object a3 = cVar2.a().a();
                                        if (a3 != null) {
                                            c3.a(aVar4.a((User) a3));
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                        }
                                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass4, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                                        cVar2.b().a((a) aVar2);
                                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass4, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                                        cVar2.c().a(aVar2);
                                    }
                                    cVar2.d();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(@NotNull a aVar) {
        String str;
        Object obj;
        String str2;
        Object obj2;
        a aVar2 = aVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f75327a, false, 87594, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f75327a, false, 87594, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "u");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(a.class);
        if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(User.class))) {
            str = ((User) aVar2).getUid();
        } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
            str = aVar2.f75335b;
        } else if (Intrinsics.areEqual((Object) orCreateKotlinClass, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
            str = ((a) aVar2).f75289b;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        if (str != null) {
            synchronized (a()) {
                Iterator it2 = f75329c.d().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.areEqual((Object) ((c) obj).f75348c, (Object) str)) {
                        break;
                    }
                }
                c cVar = (c) obj;
                if (cVar != null) {
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(a.class);
                    if (Intrinsics.areEqual((Object) orCreateKotlinClass2, (Object) Reflection.getOrCreateKotlinClass(User.class))) {
                        cVar.a().a((User) aVar2);
                        b<a> c2 = cVar.c();
                        a.C0785a aVar3 = a.g;
                        Object a2 = cVar.a().a();
                        if (a2 != null) {
                            c2.a(aVar3.a((User) a2));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                        }
                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass2, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                        cVar.b().a(aVar2);
                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass2, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                        cVar.c().a((a) aVar2);
                    }
                    cVar.d();
                }
                if (cVar == null) {
                    d dVar = f75329c;
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(a.class);
                    if (Intrinsics.areEqual((Object) orCreateKotlinClass3, (Object) Reflection.getOrCreateKotlinClass(User.class))) {
                        str2 = ((User) aVar2).getUid();
                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass3, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                        str2 = aVar2.f75335b;
                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass3, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                        str2 = ((a) aVar2).f75289b;
                    } else {
                        str2 = PushConstants.PUSH_TYPE_NOTIFY;
                    }
                    if (str2 != null) {
                        if (!dVar.f(str2)) {
                            Iterable h2 = dVar.h();
                            if (!(h2 instanceof Collection) || !((Collection) h2).isEmpty()) {
                                Iterator it3 = h2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (Intrinsics.areEqual((Object) (String) it3.next(), (Object) str2)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            z = false;
                            if (!z) {
                                SharedPreferences.Editor edit = dVar.c().edit();
                                List arrayList = new ArrayList();
                                arrayList.addAll(dVar.h());
                                arrayList.add(str2);
                                edit.putString("logged_in_uid_list", CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
                                edit.apply();
                                Iterator it4 = dVar.d().iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it4.next();
                                    if (Intrinsics.areEqual((Object) ((c) obj2).f75348c, (Object) str2)) {
                                        break;
                                    }
                                }
                                c cVar2 = (c) obj2;
                                if (cVar2 != null) {
                                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(a.class);
                                    if (Intrinsics.areEqual((Object) orCreateKotlinClass4, (Object) Reflection.getOrCreateKotlinClass(User.class))) {
                                        cVar2.a().a((User) aVar2);
                                        b<a> c3 = cVar2.c();
                                        a.C0785a aVar4 = a.g;
                                        Object a3 = cVar2.a().a();
                                        if (a3 != null) {
                                            c3.a(aVar4.a((User) a3));
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                        }
                                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass4, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                                        cVar2.b().a(aVar2);
                                    } else if (Intrinsics.areEqual((Object) orCreateKotlinClass4, (Object) Reflection.getOrCreateKotlinClass(a.class))) {
                                        cVar2.c().a((a) aVar2);
                                    }
                                    cVar2.d();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final <E> boolean a(@NotNull List<E> list, Function1<? super E, Boolean> function1) {
        List<E> list2 = list;
        Function1<? super E, Boolean> function12 = function1;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{list2, function12}, this, f75327a, false, 87605, new Class[]{List.class, Function1.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list2, function12}, this, f75327a, false, 87605, new Class[]{List.class, Function1.class}, Boolean.TYPE)).booleanValue();
        } else if (Build.VERSION.SDK_INT >= 24) {
            return list2.removeIf(new e(function12));
        } else {
            Iterator<E> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Boolean) function12.invoke(it2.next())).booleanValue()) {
                    it2.remove();
                    z = true;
                }
            }
            return z;
        }
    }
}
