package com.ss.android.ugc.aweme.music.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.keva.Keva;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/music/util/KevaUtils;", "", "()V", "Companion", "Music", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56790a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0647a f56791b = new C0647a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J)\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0011J)\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0007J+\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u0002H\t2\u0006\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/music/util/KevaUtils$Companion;", "", "()V", "DEFAULT_RINGTONE_SCHEME", "", "MUSIC_RINGTONE_SCHEME", "THIRD_MUSIC_COVER_INFO", "getArrayFromKeva", "", "T", "key", "clazz", "Ljava/lang/Class;", "repo", "getBooleanFromKeva", "", "default", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Z", "getIntFromKeva", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)I", "getStringFromKeva", "storeInKeva", "", "value", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.music.util.a$a  reason: collision with other inner class name */
    public static final class C0647a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56792a;

        private C0647a() {
        }

        public /* synthetic */ C0647a(byte b2) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        public final boolean a(@NotNull String str, @Nullable Boolean bool, @NotNull String str2) {
            String str3 = str;
            String str4 = str2;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{str3, bool, str4}, this, f56792a, false, 60587, new Class[]{String.class, Boolean.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, bool, str4}, this, f56792a, false, 60587, new Class[]{String.class, Boolean.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str3, "key");
            Intrinsics.checkParameterIsNotNull(str4, "repo");
            Keva repoFromSp = Keva.getRepoFromSp(k.a(), str4, 0);
            if (bool != null) {
                z = bool.booleanValue();
            }
            return repoFromSp.getBoolean(str3, z);
        }

        @JvmStatic
        @NotNull
        public final <T> List<T> a(@NotNull String str, @NotNull Class<T> cls, @NotNull String str2) {
            String str3 = str;
            Class<T> cls2 = cls;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, cls2, str4}, this, f56792a, false, 60589, new Class[]{String.class, Class.class, String.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{str3, cls2, str4}, this, f56792a, false, 60589, new Class[]{String.class, Class.class, String.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(str3, "key");
            Intrinsics.checkParameterIsNotNull(cls2, "clazz");
            Intrinsics.checkParameterIsNotNull(str4, "repo");
            String string = Keva.getRepoFromSp(k.a(), str4, 0).getString(str3, "");
            if (TextUtils.isEmpty(string)) {
                return new ArrayList<>();
            }
            List<T> parseArray = JSON.parseArray(string, cls2);
            Intrinsics.checkExpressionValueIsNotNull(parseArray, "JSON.parseArray(json, clazz)");
            return parseArray;
        }

        @JvmStatic
        public final <T> void a(@NotNull String str, T t, @NotNull String str2) {
            String str3 = str;
            T t2 = t;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, t2, str4}, this, f56792a, false, 60584, new Class[]{String.class, Object.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, t2, str4}, this, f56792a, false, 60584, new Class[]{String.class, Object.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str3, "key");
            Intrinsics.checkParameterIsNotNull(str4, "repo");
            Keva repoFromSp = Keva.getRepoFromSp(k.a(), str4, 0);
            if (t2 instanceof String) {
                repoFromSp.storeString(str3, (String) t2);
            } else if (t2 instanceof Boolean) {
                repoFromSp.storeBoolean(str3, ((Boolean) t2).booleanValue());
            } else {
                repoFromSp.storeString(str3, JSON.toJSONString(t));
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final <T> List<T> a(@NotNull String str, @NotNull Class<T> cls, @NotNull String str2) {
        String str3 = str;
        Class<T> cls2 = cls;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, cls2, str4}, null, f56790a, true, 60581, new Class[]{String.class, Class.class, String.class}, List.class)) {
            return f56791b.a(str3, cls2, str4);
        }
        return (List) PatchProxy.accessDispatch(new Object[]{str3, cls2, str4}, null, f56790a, true, 60581, new Class[]{String.class, Class.class, String.class}, List.class);
    }

    @JvmStatic
    public static final <T> void a(@NotNull String str, T t, @NotNull String str2) {
        String str3 = str;
        T t2 = t;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, t2, str4}, null, f56790a, true, 60576, new Class[]{String.class, Object.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, t2, str4}, null, f56790a, true, 60576, new Class[]{String.class, Object.class, String.class}, Void.TYPE);
            return;
        }
        f56791b.a(str3, t2, str4);
    }

    @JvmStatic
    @JvmOverloads
    public static final boolean a(@NotNull String str, @Nullable Boolean bool, @NotNull String str2) {
        String str3 = str;
        Boolean bool2 = bool;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, bool2, str4}, null, f56790a, true, 60579, new Class[]{String.class, Boolean.class, String.class}, Boolean.TYPE)) {
            return f56791b.a(str3, bool2, str4);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, bool2, str4}, null, f56790a, true, 60579, new Class[]{String.class, Boolean.class, String.class}, Boolean.TYPE)).booleanValue();
    }
}
