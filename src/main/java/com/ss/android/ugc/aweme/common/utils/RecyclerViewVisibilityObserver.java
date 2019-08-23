package com.ss.android.ugc.aweme.common.utils;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u001d\u001e\u001f !\"B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u0016\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u001c\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver;", "", "()V", "OUT_OF_RANGE_POS", "", "STATUS_COMPLETELY_VISIBLE", "STATUS_INVISIBLE", "STATUS_VISIBLE", "TAG", "", "attachListener", "", "view", "Landroid/view/View;", "listener", "Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$Listener;", "checkVisibilityChange", "rv", "Landroid/support/v7/widget/RecyclerView;", "clear", "hasListener", "", "removeListener", "resetVisibilityStatus", "setup", "identifier", "Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$Identifier;", "statusToName", "status", "Data", "Identifier", "Item", "Listener", "ScrollListener", "StatusType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecyclerViewVisibilityObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40289a;

    /* renamed from: b  reason: collision with root package name */
    public static final RecyclerViewVisibilityObserver f40290b = new RecyclerViewVisibilityObserver();

    @Target
    @Retention
    @java.lang.annotation.Target({ElementType.FIELD, ElementType.PARAMETER})
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$StatusType;", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface StatusType {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$ScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "()V", "onScrolled", "", "rv", "Landroid/support/v7/widget/RecyclerView;", "dx", "", "dy", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class ScrollListener extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40291a;

        /* renamed from: b  reason: collision with root package name */
        public static final ScrollListener f40292b = new ScrollListener();

        private ScrollListener() {
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            RecyclerView recyclerView2 = recyclerView;
            if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f40291a, false, 33557, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f40291a, false, 33557, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(recyclerView2, "rv");
            RecyclerViewVisibilityObserver.a(recyclerView);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$Data;", "", "identifier", "Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$Identifier;", "history", "Ljava/util/LinkedList;", "Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$Item;", "(Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$Identifier;Ljava/util/LinkedList;)V", "getHistory", "()Ljava/util/LinkedList;", "getIdentifier", "()Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$Identifier;", "component1", "component2", "copy", "equals", "", "other", "getOrCreateItem", "id", "hashCode", "", "prepareChangeStatus", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40293a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final b f40294b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final LinkedList<c> f40295c;

        public final boolean equals(@Nullable Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f40293a, false, 33552, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f40293a, false, 33552, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (!Intrinsics.areEqual((Object) this.f40294b, (Object) aVar.f40294b) || !Intrinsics.areEqual((Object) this.f40295c, (Object) aVar.f40295c)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f40293a, false, 33551, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40293a, false, 33551, new Class[0], Integer.TYPE)).intValue();
            }
            b bVar = this.f40294b;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            LinkedList<c> linkedList = this.f40295c;
            if (linkedList != null) {
                i = linkedList.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f40293a, false, 33550, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f40293a, false, 33550, new Class[0], String.class);
            }
            return "Data(identifier=" + this.f40294b + ", history=" + this.f40295c + ")";
        }

        private a(@Nullable b bVar, @NotNull LinkedList<c> linkedList) {
            Intrinsics.checkParameterIsNotNull(linkedList, "history");
            this.f40294b = bVar;
            this.f40295c = linkedList;
        }

        public /* synthetic */ a(b bVar, LinkedList linkedList, int i) {
            this(bVar, new LinkedList());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$Identifier;", "", "getUniqueId", "pos", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        @Nullable
        Object a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$Item;", "", "pos", "", "id", "status", "newStatus", "(ILjava/lang/Object;II)V", "getId", "()Ljava/lang/Object;", "setId", "(Ljava/lang/Object;)V", "getNewStatus", "()I", "setNewStatus", "(I)V", "getPos", "setPos", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40296a;

        /* renamed from: b  reason: collision with root package name */
        public int f40297b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public Object f40298c;

        /* renamed from: d  reason: collision with root package name */
        public int f40299d;

        /* renamed from: e  reason: collision with root package name */
        public int f40300e;

        public c() {
            this(0, null, 0, 0, 15);
        }

        public final boolean equals(@Nullable Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f40296a, false, 33556, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f40296a, false, 33556, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if ((this.f40297b == cVar.f40297b) && Intrinsics.areEqual(this.f40298c, cVar.f40298c)) {
                        if (this.f40299d == cVar.f40299d) {
                            if (this.f40300e == cVar.f40300e) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f40296a, false, 33555, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40296a, false, 33555, new Class[0], Integer.TYPE)).intValue();
            }
            int i2 = this.f40297b * 31;
            Object obj = this.f40298c;
            if (obj != null) {
                i = obj.hashCode();
            }
            return ((((i2 + i) * 31) + this.f40299d) * 31) + this.f40300e;
        }

        @NotNull
        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f40296a, false, 33554, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f40296a, false, 33554, new Class[0], String.class);
            }
            return "Item(pos=" + this.f40297b + ", id=" + this.f40298c + ", status=" + this.f40299d + ", newStatus=" + this.f40300e + ")";
        }

        private c(int i, @Nullable Object obj, int i2, int i3) {
            this.f40297b = i;
            this.f40298c = obj;
            this.f40299d = i2;
            this.f40300e = i3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(int i, Object obj, int i2, int i3, int i4) {
            this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? null : obj, 0, 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$Listener;", "", "onVisibilityChanged", "", "pos", "", "id", "viewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "from", "to", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface d {
        void a(int i, @Nullable Object obj, @Nullable RecyclerView.ViewHolder viewHolder, @Nullable View view, int i2, int i3);
    }

    private RecyclerViewVisibilityObserver() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$d} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c6, code lost:
        if (r10 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(@org.jetbrains.annotations.Nullable android.support.v7.widget.RecyclerView r22) {
        /*
            r0 = r22
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f40289a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.support.v7.widget.RecyclerView> r3 = android.support.v7.widget.RecyclerView.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 33541(0x8305, float:4.7001E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f40289a
            r13 = 1
            r14 = 33541(0x8305, float:4.7001E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.support.v7.widget.RecyclerView> r0 = android.support.v7.widget.RecyclerView.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            if (r0 != 0) goto L_0x0037
            return
        L_0x0037:
            android.support.v7.widget.RecyclerView$LayoutManager r2 = r22.getLayoutManager()
            boolean r3 = r2 instanceof android.support.v7.widget.LinearLayoutManager
            if (r3 != 0) goto L_0x0040
            return
        L_0x0040:
            r3 = 2131169412(0x7f071084, float:1.7953153E38)
            java.lang.Object r3 = r0.getTag(r3)
            boolean r4 = r3 instanceof com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.a
            if (r4 != 0) goto L_0x004c
            r3 = 0
        L_0x004c:
            com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$a r3 = (com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.a) r3
            if (r3 != 0) goto L_0x0051
            return
        L_0x0051:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.a.f40293a
            r13 = 0
            r14 = 33547(0x830b, float:4.701E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            r6 = -1
            if (r4 == 0) goto L_0x0076
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.a.f40293a
            r13 = 0
            r14 = 33547(0x830b, float:4.701E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0093
        L_0x0076:
            java.util.LinkedList<com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$c> r4 = r3.f40295c
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x007e:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0093
            java.lang.Object r7 = r4.next()
            com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$c r7 = (com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.c) r7
            r7.f40297b = r6
            int r8 = r7.f40300e
            r7.f40299d = r8
            r7.f40300e = r9
            goto L_0x007e
        L_0x0093:
            r4 = r2
            android.support.v7.widget.LinearLayoutManager r4 = (android.support.v7.widget.LinearLayoutManager) r4
            int r7 = r4.findFirstVisibleItemPosition()
            int r8 = r4.findLastVisibleItemPosition()
            int r15 = r4.findFirstCompletelyVisibleItemPosition()
            int r4 = r4.findLastCompletelyVisibleItemPosition()
            kotlin.ranges.IntRange r10 = new kotlin.ranges.IntRange
            r10.<init>(r7, r8)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r7 = r10.iterator()
        L_0x00b1:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x015f
            r8 = r7
            kotlin.collections.IntIterator r8 = (kotlin.collections.IntIterator) r8
            int r8 = r8.nextInt()
            com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$b r10 = r3.f40294b
            if (r10 == 0) goto L_0x00cb
            java.lang.Object r10 = r10.a(r8)
            if (r10 != 0) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r14 = r10
            goto L_0x00d1
        L_0x00cb:
            long r10 = (long) r8
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            goto L_0x00c9
        L_0x00d1:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.a.f40293a
            r13 = 0
            r16 = 33548(0x830c, float:4.7011E-41)
            java.lang.Class[] r11 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r17 = java.lang.Object.class
            r11[r9] = r17
            java.lang.Class<com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$c> r17 = com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.c.class
            r18 = r11
            r11 = r3
            r5 = r14
            r14 = r16
            r6 = r15
            r15 = r18
            r16 = r17
            boolean r10 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r10 == 0) goto L_0x010e
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r5
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.a.f40293a
            r13 = 0
            r14 = 33548(0x830c, float:4.7011E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r15[r9] = r5
            java.lang.Class<com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$c> r16 = com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.c.class
            r11 = r3
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$c r5 = (com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.c) r5
            goto L_0x014f
        L_0x010e:
            java.lang.String r10 = "id"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r10)
            java.util.LinkedList<com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$c> r10 = r3.f40295c
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x011b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0131
            java.lang.Object r11 = r10.next()
            r12 = r11
            com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$c r12 = (com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.c) r12
            java.lang.Object r12 = r12.f40298c
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r12)
            if (r12 == 0) goto L_0x011b
            goto L_0x0132
        L_0x0131:
            r11 = 0
        L_0x0132:
            com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$c r11 = (com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.c) r11
            if (r11 != 0) goto L_0x014e
            com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$c r10 = new com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$c
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 13
            r16 = r10
            r18 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            java.util.LinkedList<com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$c> r5 = r3.f40295c
            r5.add(r10)
            r5 = r10
            goto L_0x014f
        L_0x014e:
            r5 = r11
        L_0x014f:
            r5.f40297b = r8
            if (r6 <= r8) goto L_0x0154
            goto L_0x0158
        L_0x0154:
            if (r4 < r8) goto L_0x0158
            r8 = 2
            goto L_0x0159
        L_0x0158:
            r8 = 1
        L_0x0159:
            r5.f40300e = r8
            r15 = r6
            r6 = -1
            goto L_0x00b1
        L_0x015f:
            r1 = 2131169413(0x7f071085, float:1.7953155E38)
            java.lang.Object r5 = r0.getTag(r1)
            boolean r4 = r5 instanceof com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.d
            if (r4 != 0) goto L_0x016b
            r5 = 0
        L_0x016b:
            r4 = r5
            com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$d r4 = (com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.d) r4
            java.util.LinkedList<com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$c> r3 = r3.f40295c
            java.util.ListIterator r3 = r3.listIterator()
            java.lang.String r5 = "data.history.listIterator()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)
        L_0x0179:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0211
            java.lang.Object r5 = r3.next()
            java.lang.String r6 = "iterator.next()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$c r5 = (com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.c) r5
            int r6 = r5.f40297b
            r13 = -1
            if (r6 != r13) goto L_0x0192
            r3.remove()
        L_0x0192:
            int r6 = r5.f40300e
            int r7 = r5.f40299d
            if (r6 == r7) goto L_0x020c
            int r6 = r5.f40297b
            if (r6 != r13) goto L_0x019f
            r11 = 0
            r12 = 0
            goto L_0x01ad
        L_0x019f:
            int r6 = r5.f40297b
            android.support.v7.widget.RecyclerView$ViewHolder r6 = r0.findViewHolderForAdapterPosition(r6)
            int r7 = r5.f40297b
            android.view.View r7 = r2.findViewByPosition(r7)
            r11 = r6
            r12 = r7
        L_0x01ad:
            if (r12 == 0) goto L_0x01b4
            java.lang.Object r6 = r12.getTag(r1)
            goto L_0x01b5
        L_0x01b4:
            r6 = 0
        L_0x01b5:
            boolean r7 = r6 instanceof com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.d
            if (r7 != 0) goto L_0x01ba
            r6 = 0
        L_0x01ba:
            r14 = r6
            com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$d r14 = (com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.d) r14
            if (r14 == 0) goto L_0x01d4
            int r15 = r5.f40297b
            java.lang.Object r6 = r5.f40298c
            int r7 = r5.f40299d
            int r8 = r5.f40300e
            r16 = r6
            r17 = r11
            r18 = r12
            r19 = r7
            r20 = r8
            r14.a(r15, r16, r17, r18, r19, r20)
        L_0x01d4:
            if (r4 == 0) goto L_0x01ea
            int r7 = r5.f40297b
            java.lang.Object r8 = r5.f40298c
            int r14 = r5.f40299d
            int r15 = r5.f40300e
            r6 = r4
            r9 = r11
            r10 = r12
            r1 = r11
            r11 = r14
            r18 = r12
            r12 = r15
            r6.a(r7, r8, r9, r10, r11, r12)
            goto L_0x01ed
        L_0x01ea:
            r1 = r11
            r18 = r12
        L_0x01ed:
            boolean r6 = r1 instanceof com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.d
            if (r6 != 0) goto L_0x01f3
            r6 = 0
            goto L_0x01f4
        L_0x01f3:
            r6 = r1
        L_0x01f4:
            r14 = r6
            com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver$d r14 = (com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.d) r14
            if (r14 == 0) goto L_0x020c
            int r15 = r5.f40297b
            java.lang.Object r6 = r5.f40298c
            int r7 = r5.f40299d
            int r5 = r5.f40300e
            r16 = r6
            r17 = r1
            r19 = r7
            r20 = r5
            r14.a(r15, r16, r17, r18, r19, r20)
        L_0x020c:
            r1 = 2131169413(0x7f071085, float:1.7953155E38)
            goto L_0x0179
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver.a(android.support.v7.widget.RecyclerView):void");
    }

    @JvmStatic
    public static final void a(@Nullable RecyclerView recyclerView, @Nullable b bVar) {
        RecyclerView recyclerView2 = recyclerView;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, bVar2}, null, f40289a, true, 33540, new Class[]{RecyclerView.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, bVar2}, null, f40289a, true, 33540, new Class[]{RecyclerView.class, b.class}, Void.TYPE);
            return;
        }
        if (recyclerView2 != null && !(recyclerView2.getTag(C0906R.id.ccg) instanceof a)) {
            recyclerView2.addOnScrollListener(ScrollListener.f40292b);
            recyclerView2.setTag(C0906R.id.ccg, new a(bVar2, null, 2));
        }
    }
}
