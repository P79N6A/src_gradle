package com.ss.android.ugc.aweme.story.base.c.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/story/base/paging/common/NetworkState;", "", "status", "Lcom/ss/android/ugc/aweme/story/base/paging/common/Status;", "msg", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lcom/ss/android/ugc/aweme/story/base/paging/common/Status;Ljava/lang/Exception;)V", "getMsg", "()Ljava/lang/Exception;", "getStatus", "()Lcom/ss/android/ugc/aweme/story/base/paging/common/Status;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71930a;
    @NotNull
    @JvmField

    /* renamed from: d  reason: collision with root package name */
    public static final a f71931d = new a(b.REFRESHING, (Exception) null, 2);
    @NotNull
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public static final a f71932e = new a(b.REFRESHING_SUCCESS, (Exception) null, 2);
    @NotNull
    @JvmField

    /* renamed from: f  reason: collision with root package name */
    public static final a f71933f = new a(b.REFRESHING_EMPTY, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a g = new a(b.LOADING_MORE, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a h = new a(b.LOADING_MORE_SUCCESS, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a i = new a(b.LOADING_MORE_EMPTY, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a j = new a(b.PRE_LOADING_MORE, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a k = new a(b.PRE_LOADING_MORE_SUCCESS, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a l = new a(b.PRE_LOADING_MORE_EMPTY, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a m = new a(b.COMMENT_REFRESHING, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a n = new a(b.COMMENT_REFRESHING_SUCCESS, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a o = new a(b.COMMENT_REFRESHING_EMPTY, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a p = new a(b.COMMENT_LOADING_MORE, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a q = new a(b.COMMENT_LOADING_MORE_SUCCESS, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a r = new a(b.COMMENT_LOADING_MORE_EMPTY, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a s = new a(b.VIEWER_REFRESHING, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a t = new a(b.VIEWER_REFRESHING_SUCCESS, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a u = new a(b.VIEWER_REFRESHING_EMPTY, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a v = new a(b.VIEWER_LOADING_MORE, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a w = new a(b.VIEWER_LOADING_MORE_SUCCESS, (Exception) null, 2);
    @NotNull
    @JvmField
    public static final a x = new a(b.VIEWER_LOADING_MORE_EMPTY, (Exception) null, 2);
    public static final C0751a y = new C0751a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final b f71934b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final Exception f71935c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0019\u001a\u00020\u00042\u000e\u0010\u001a\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0007J\u0018\u0010\u001d\u001a\u00020\u00042\u000e\u0010\u001a\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0007J\u0018\u0010\u001e\u001a\u00020\u00042\u000e\u0010\u001a\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0007J\u0018\u0010\u001f\u001a\u00020\u00042\u000e\u0010\u001a\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0007J\u0018\u0010 \u001a\u00020\u00042\u000e\u0010\u001a\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0007J\u0018\u0010!\u001a\u00020\u00042\u000e\u0010\u001a\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0007J\u0018\u0010\"\u001a\u00020\u00042\u000e\u0010\u001a\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/story/base/paging/common/NetworkState$Companion;", "", "()V", "COMMENT_LOADING_MORE", "Lcom/ss/android/ugc/aweme/story/base/paging/common/NetworkState;", "COMMENT_LOADING_MORE_EMPTY", "COMMENT_LOADING_MORE_SUCCESS", "COMMENT_REFRESHING", "COMMENT_REFRESHING_EMPTY", "COMMENT_REFRESHING_SUCCESS", "LOADING_MORE", "LOADING_MORE_EMPTY", "LOADING_MORE_SUCCESS", "PRE_LOADING_MORE", "PRE_LOADING_MORE_EMPTY", "PRE_LOADING_MORE_SUCCESS", "REFRESHING", "REFRESHING_EMPTY", "REFRESHING_SUCCESS", "VIEWER_LOADING_MORE", "VIEWER_LOADING_MORE_EMPTY", "VIEWER_LOADING_MORE_SUCCESS", "VIEWER_REFRESHING", "VIEWER_REFRESHING_EMPTY", "VIEWER_REFRESHING_SUCCESS", "comment_loadmoreError", "msg", "Ljava/lang/Exception;", "Lkotlin/Exception;", "comment_refreshError", "loadmoreError", "pre_loadmoreError", "refreshError", "viewer_loadmoreError", "viewer_refreshError", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.story.base.c.a.a$a  reason: collision with other inner class name */
    public static final class C0751a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71936a;

        private C0751a() {
        }

        public /* synthetic */ C0751a(byte b2) {
            this();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f71930a, false, 82261, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f71930a, false, 82261, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!Intrinsics.areEqual((Object) this.f71934b, (Object) aVar.f71934b) || !Intrinsics.areEqual((Object) this.f71935c, (Object) aVar.f71935c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f71930a, false, 82260, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71930a, false, 82260, new Class[0], Integer.TYPE)).intValue();
        }
        b bVar = this.f71934b;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        Exception exc = this.f71935c;
        if (exc != null) {
            i2 = exc.hashCode();
        }
        return hashCode + i2;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f71930a, false, 82259, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f71930a, false, 82259, new Class[0], String.class);
        }
        return "NetworkState(status=" + this.f71934b + ", msg=" + this.f71935c + ")";
    }

    @JvmStatic
    @NotNull
    public static final a a(@Nullable Exception exc) {
        Object accessDispatch;
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, null, f71930a, true, 82262, new Class[]{Exception.class}, a.class)) {
            accessDispatch = PatchProxy.accessDispatch(new Object[]{exc2}, null, f71930a, true, 82262, new Class[]{Exception.class}, a.class);
        } else {
            C0751a aVar = y;
            if (!PatchProxy.isSupport(new Object[]{exc2}, aVar, C0751a.f71936a, false, 82269, new Class[]{Exception.class}, a.class)) {
                return new a(b.REFRESHING_FAILED, exc2, (byte) 0);
            }
            Object[] objArr = {exc2};
            C0751a aVar2 = aVar;
            accessDispatch = PatchProxy.accessDispatch(objArr, aVar2, C0751a.f71936a, false, 82269, new Class[]{Exception.class}, a.class);
        }
        return (a) accessDispatch;
    }

    @JvmStatic
    @NotNull
    public static final a b(@Nullable Exception exc) {
        Object accessDispatch;
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, null, f71930a, true, 82263, new Class[]{Exception.class}, a.class)) {
            accessDispatch = PatchProxy.accessDispatch(new Object[]{exc2}, null, f71930a, true, 82263, new Class[]{Exception.class}, a.class);
        } else {
            C0751a aVar = y;
            if (!PatchProxy.isSupport(new Object[]{exc2}, aVar, C0751a.f71936a, false, 82270, new Class[]{Exception.class}, a.class)) {
                return new a(b.LOADING_MORE_FAILED, exc2, (byte) 0);
            }
            Object[] objArr = {exc2};
            C0751a aVar2 = aVar;
            accessDispatch = PatchProxy.accessDispatch(objArr, aVar2, C0751a.f71936a, false, 82270, new Class[]{Exception.class}, a.class);
        }
        return (a) accessDispatch;
    }

    @JvmStatic
    @NotNull
    public static final a c(@Nullable Exception exc) {
        Object accessDispatch;
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, null, f71930a, true, 82265, new Class[]{Exception.class}, a.class)) {
            accessDispatch = PatchProxy.accessDispatch(new Object[]{exc2}, null, f71930a, true, 82265, new Class[]{Exception.class}, a.class);
        } else {
            C0751a aVar = y;
            if (!PatchProxy.isSupport(new Object[]{exc2}, aVar, C0751a.f71936a, false, 82272, new Class[]{Exception.class}, a.class)) {
                return new a(b.COMMENT_REFRESHING_FAILED, exc2, (byte) 0);
            }
            Object[] objArr = {exc2};
            C0751a aVar2 = aVar;
            accessDispatch = PatchProxy.accessDispatch(objArr, aVar2, C0751a.f71936a, false, 82272, new Class[]{Exception.class}, a.class);
        }
        return (a) accessDispatch;
    }

    @JvmStatic
    @NotNull
    public static final a d(@Nullable Exception exc) {
        Object accessDispatch;
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, null, f71930a, true, 82267, new Class[]{Exception.class}, a.class)) {
            accessDispatch = PatchProxy.accessDispatch(new Object[]{exc2}, null, f71930a, true, 82267, new Class[]{Exception.class}, a.class);
        } else {
            C0751a aVar = y;
            if (!PatchProxy.isSupport(new Object[]{exc2}, aVar, C0751a.f71936a, false, 82274, new Class[]{Exception.class}, a.class)) {
                return new a(b.VIEWER_REFRESHING_FAILED, exc2, (byte) 0);
            }
            Object[] objArr = {exc2};
            C0751a aVar2 = aVar;
            accessDispatch = PatchProxy.accessDispatch(objArr, aVar2, C0751a.f71936a, false, 82274, new Class[]{Exception.class}, a.class);
        }
        return (a) accessDispatch;
    }

    private a(b bVar, Exception exc) {
        this.f71934b = bVar;
        this.f71935c = exc;
    }

    public /* synthetic */ a(b bVar, Exception exc, byte b2) {
        this(bVar, exc);
    }

    private /* synthetic */ a(b bVar, Exception exc, int i2) {
        this(bVar, null);
    }
}
