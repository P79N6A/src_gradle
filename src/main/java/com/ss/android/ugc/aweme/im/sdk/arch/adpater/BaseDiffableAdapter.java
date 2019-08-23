package com.ss.android.ugc.aweme.im.sdk.arch.adpater;

import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.arch.adpater.a;
import com.ss.android.ugc.aweme.im.sdk.arch.adpater.b;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005B\u0017\b\u0016\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\bB\u0013\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/BaseDiffableAdapter;", "VH", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "T", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/DiffableAdapter;", "diffCallback", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "(Landroid/support/v7/util/DiffUtil$ItemCallback;)V", "config", "Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/DifferConfig;", "(Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/DifferConfig;)V", "mDiffer", "Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/AsyncListDiffer;", "getMDiffer", "()Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/AsyncListDiffer;", "getHeaderViewCount", "", "getItem", "position", "(I)Ljava/lang/Object;", "getItemCount", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class BaseDiffableAdapter<VH extends RecyclerView.ViewHolder, T> extends RecyclerView.Adapter<VH> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50113a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final a<T> f50114b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "VH", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "T", "it", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<Integer, Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ BaseDiffableAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BaseDiffableAdapter baseDiffableAdapter) {
            super(1);
            this.this$0 = baseDiffableAdapter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(invoke(((Number) obj).intValue()));
        }

        public final int invoke(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 50160, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                return i + this.this$0.b();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 50160, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
    }

    public int b() {
        return 0;
    }

    @NotNull
    public final a<T> a() {
        return this.f50114b;
    }

    public int getItemCount() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f50113a, false, 50156, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50113a, false, 50156, new Class[0], Integer.TYPE)).intValue();
        }
        a a2 = a();
        if (PatchProxy.isSupport(new Object[0], a2, a.f50120a, false, 50142, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, a.f50120a, false, 50142, new Class[0], Integer.TYPE)).intValue();
        } else {
            List<? extends T> list = a2.f50123d;
            if (list != null) {
                i = list.size();
            }
        }
        return i + b();
    }

    private BaseDiffableAdapter(@NotNull c<T> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "config");
        this.f50114b = new a<>(new DifferListUpdateCallback(this, new a(this)), cVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private BaseDiffableAdapter(@org.jetbrains.annotations.NotNull android.support.v7.util.DiffUtil.ItemCallback<T> r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "diffCallback"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            r10 = 0
            r11 = 1
            r2[r11] = r10
            r12 = 2
            r2[r12] = r10
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.im.sdk.arch.adpater.e.f50148a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.support.v7.util.DiffUtil$ItemCallback> r3 = android.support.v7.util.DiffUtil.ItemCallback.class
            r7[r9] = r3
            java.lang.Class<java.util.concurrent.Executor> r3 = java.util.concurrent.Executor.class
            r7[r11] = r3
            java.lang.Class<java.util.concurrent.Executor> r3 = java.util.concurrent.Executor.class
            r7[r12] = r3
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.arch.adpater.c> r8 = com.ss.android.ugc.aweme.im.sdk.arch.adpater.c.class
            r3 = 0
            r5 = 1
            r6 = 50170(0xc3fa, float:7.0303E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x005d
            java.lang.Object[] r13 = new java.lang.Object[r1]
            r13[r9] = r0
            r13[r11] = r10
            r13[r12] = r10
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.arch.adpater.e.f50148a
            r16 = 1
            r17 = 50170(0xc3fa, float:7.0303E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<android.support.v7.util.DiffUtil$ItemCallback> r1 = android.support.v7.util.DiffUtil.ItemCallback.class
            r0[r9] = r1
            java.lang.Class<java.util.concurrent.Executor> r1 = java.util.concurrent.Executor.class
            r0[r11] = r1
            java.lang.Class<java.util.concurrent.Executor> r1 = java.util.concurrent.Executor.class
            r0[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.arch.adpater.c> r19 = com.ss.android.ugc.aweme.im.sdk.arch.adpater.c.class
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            com.ss.android.ugc.aweme.im.sdk.arch.adpater.c r0 = (com.ss.android.ugc.aweme.im.sdk.arch.adpater.c) r0
        L_0x0059:
            r1 = r0
            r0 = r20
            goto L_0x006c
        L_0x005d:
            java.lang.String r1 = "$this$asDifferConfig"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.im.sdk.arch.adpater.c$a r1 = new com.ss.android.ugc.aweme.im.sdk.arch.adpater.c$a
            r1.<init>(r0)
            com.ss.android.ugc.aweme.im.sdk.arch.adpater.c r0 = r1.a()
            goto L_0x0059
        L_0x006c:
            r0.<init>((com.ss.android.ugc.aweme.im.sdk.arch.adpater.c<T>) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.arch.adpater.BaseDiffableAdapter.<init>(android.support.v7.util.DiffUtil$ItemCallback):void");
    }

    @Nullable
    public final T a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50113a, false, 50155, new Class[]{Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50113a, false, 50155, new Class[]{Integer.TYPE}, Object.class);
        } else if (i2 < b() || i2 >= getItemCount()) {
            return null;
        } else {
            a a2 = a();
            int b2 = i2 - b();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(b2)}, a2, a.f50120a, false, 50141, new Class[]{Integer.TYPE}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(b2)}, a2, a.f50120a, false, 50141, new Class[]{Integer.TYPE}, Object.class);
            }
            List<? extends T> list = a2.f50123d;
            if (list != null && b2 < list.size() && b2 >= 0) {
                return list.get(b2);
            }
            return null;
        }
    }

    public final void a(@Nullable List<? extends T> list) {
        List<? extends T> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f50113a, false, 50157, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f50113a, false, 50157, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this, list2}, null, b.a.f50137a, true, 50162, new Class[]{b.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this, list2}, null, b.a.f50137a, true, 50162, new Class[]{b.class, List.class}, Void.TYPE);
            return;
        }
        a a2 = a();
        if (PatchProxy.isSupport(new Object[]{list2}, a2, a.f50120a, false, 50144, new Class[]{List.class}, Void.TYPE)) {
            Object[] objArr = {list2};
            a aVar = a2;
            PatchProxy.accessDispatch(objArr, aVar, a.f50120a, false, 50144, new Class[]{List.class}, Void.TYPE);
            return;
        }
        a2.f50123d = list2;
        a2.f50124e.a();
    }

    public /* synthetic */ BaseDiffableAdapter(DiffUtil.ItemCallback itemCallback, int i) {
        this((DiffUtil.ItemCallback) new EqualsItemCallback());
    }

    public final void a(@Nullable List<? extends T> list, @Nullable Function0<Unit> function0) {
        List<? extends T> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, function0}, this, f50113a, false, 50158, new Class[]{List.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, function0}, this, f50113a, false, 50158, new Class[]{List.class, Function0.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this, list2, function0}, null, b.a.f50137a, true, 50161, new Class[]{b.class, List.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this, list2, function0}, null, b.a.f50137a, true, 50161, new Class[]{b.class, List.class, Function0.class}, Void.TYPE);
            return;
        }
        a a2 = a();
        if (PatchProxy.isSupport(new Object[]{list2, function0}, a2, a.f50120a, false, 50145, new Class[]{List.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, function0}, a2, a.f50120a, false, 50145, new Class[]{List.class, Function0.class}, Void.TYPE);
            return;
        }
        a2.f50122c++;
        int i = a2.f50122c;
        List<? extends T> list3 = a2.f50123d;
        if (list2 != list3) {
            if (list2 == null) {
                if (list3 == null) {
                    Intrinsics.throwNpe();
                }
                int size = list3.size();
                a2.f50123d = null;
                a2.f50124e.onRemoved(0, size);
            } else if (list3 == null) {
                a2.f50123d = list2;
                a2.f50124e.onInserted(0, list.size());
            } else {
                Executor executor = a2.f50125f.f50139b;
                a.b bVar = new a.b(a2, list3, list, i, function0);
                executor.execute(bVar);
            }
        }
    }
}
