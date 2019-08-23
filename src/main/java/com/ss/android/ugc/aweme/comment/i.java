package com.ss.android.ugc.aweme.comment;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.an;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0004J\b\u0010$\u001a\u00020\"H\u0002J\u0006\u0010%\u001a\u00020\"R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX.¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000R)\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00040\u00040\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0019\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b \u0010\u0015¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/comment/MiniEmojiPanelList;", "", "()V", "MINI_EMOJI_PANEL_LIST_PREFIX", "", "mCacheKey", "getMCacheKey", "()Ljava/lang/String;", "mCurrentUserData", "Ljava/util/LinkedList;", "mData", "getMData", "()Ljava/util/LinkedList;", "mDataChanged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mDataType", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "mDefaultEmojiList", "", "getMDefaultEmojiList", "()Ljava/util/List;", "mDefaultEmojiList$delegate", "Lkotlin/Lazy;", "mGson", "Lcom/google/gson/Gson;", "mMiniEmojiPanelListStringItem", "Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;", "getMMiniEmojiPanelListStringItem", "()Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;", "mUserId", "miniEmojiPanelList", "getMiniEmojiPanelList", "addEmojiUsage", "", "emojiText", "initData", "saveEmojiUsageList", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36467a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f36468b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(i.class), "mDefaultEmojiList", "getMDefaultEmojiList()Ljava/util/List;"))};

    /* renamed from: c  reason: collision with root package name */
    public static final Gson f36469c = new Gson();

    /* renamed from: d  reason: collision with root package name */
    public static final Type f36470d = new a().getType();

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicBoolean f36471e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public static final i f36472f = new i();
    private static String g;
    private static final Lazy h = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0<? extends T>) b.INSTANCE);
    private static LinkedList<String> i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/comment/MiniEmojiPanelList$mDataType$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/LinkedList;", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends TypeToken<LinkedList<String>> {
        a() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<List<? extends String>> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final List<String> invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 27183, new Class[0], List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 27183, new Class[0], List.class);
            }
            Context context = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
            String[] stringArray = context.getResources().getStringArray(C0906R.array.p);
            Intrinsics.checkExpressionValueIsNotNull(stringArray, "GlobalContext.getContext…ay.mini_emoji_panel_list)");
            return ArraysKt.toList((T[]) stringArray);
        }
    }

    private final List<String> d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f36467a, false, 27171, new Class[0], List.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f36467a, false, 27171, new Class[0], List.class);
        } else {
            value = h.getValue();
        }
        return (List) value;
    }

    private i() {
    }

    public final an<String> a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f36467a, false, 27170, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, f36467a, false, 27170, new Class[0], an.class);
        }
        if (PatchProxy.isSupport(new Object[0], this, f36467a, false, 27169, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], this, f36467a, false, 27169, new Class[0], String.class);
        } else {
            StringBuilder sb = new StringBuilder("mini_emoji_panel_list_string");
            String str2 = g;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUserId");
            }
            sb.append(str2);
            str = sb.toString();
        }
        return new an<>(str, "");
    }

    @Nullable
    public final List<String> c() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f36467a, false, 27173, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f36467a, false, 27173, new Class[0], List.class);
        }
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        if (!a2.isLogin()) {
            return d();
        }
        if (b().size() >= 8) {
            return CollectionsKt.take(b(), 8);
        }
        ArrayList arrayList = new ArrayList(b());
        while (arrayList.size() < 8 && i2 < 8) {
            String str = d().get(i2);
            if (arrayList.contains(str)) {
                i2++;
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if ((!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3.getCurUserId())) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedList<java.lang.String> b() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f36467a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.util.LinkedList> r7 = java.util.LinkedList.class
            r4 = 0
            r5 = 27172(0x6a24, float:3.8076E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f36467a
            r5 = 0
            r6 = 27172(0x6a24, float:3.8076E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.LinkedList> r8 = java.util.LinkedList.class
            r3 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            return r0
        L_0x0026:
            java.util.LinkedList<java.lang.String> r1 = i
            r2 = 1
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = g
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = g
            if (r1 != 0) goto L_0x0038
            java.lang.String r3 = "mUserId"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0038:
            com.ss.android.ugc.aweme.IAccountUserService r3 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r4 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.String r3 = r3.getCurUserId()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x00b7
        L_0x004c:
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r3 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            java.lang.String r1 = r1.getCurUserId()
            java.lang.String r3 = "AccountUserProxyService.get().curUserId"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            g = r1
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = f36467a
            r7 = 0
            r8 = 27174(0x6a26, float:3.8079E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x0082
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f36467a
            r6 = 0
            r7 = 27174(0x6a26, float:3.8079E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00b7
        L_0x0082:
            com.ss.android.ugc.aweme.app.an r1 = r11.a()
            java.lang.Object r1 = r1.c()
            java.lang.String r1 = (java.lang.String) r1
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x00b0 }
            if (r3 == 0) goto L_0x0097
            int r3 = r3.length()     // Catch:{ Exception -> 0x00b0 }
            if (r3 != 0) goto L_0x0098
        L_0x0097:
            r0 = 1
        L_0x0098:
            if (r0 == 0) goto L_0x00a0
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ Exception -> 0x00b0 }
            r0.<init>()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00b5
        L_0x00a0:
            com.google.gson.Gson r0 = f36469c     // Catch:{ Exception -> 0x00b0 }
            java.lang.reflect.Type r2 = f36470d     // Catch:{ Exception -> 0x00b0 }
            java.lang.Object r0 = r0.fromJson((java.lang.String) r1, (java.lang.reflect.Type) r2)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r1 = "mGson.fromJson(string, mDataType)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)     // Catch:{ Exception -> 0x00b0 }
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00b5
        L_0x00b0:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        L_0x00b5:
            i = r0
        L_0x00b7:
            java.util.LinkedList<java.lang.String> r0 = i
            if (r0 != 0) goto L_0x00c0
            java.lang.String r1 = "mCurrentUserData"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00c0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.i.b():java.util.LinkedList");
    }
}
