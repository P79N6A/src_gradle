package com.ss.android.ugc.aweme.discover.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/ViewTypeManager;", "", "()V", "mIncType", "", "mRecycleList", "Ljava/util/LinkedList;", "get", "isHeaderOrFooterViewType", "", "viewType", "recycle", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42176a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f42177c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final LinkedList<Integer> f42178b = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    private int f42179d = 100000;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/ViewTypeManager$Companion;", "", "()V", "ITEM_TYPE_MAX", "", "ITEM_TYPE_MIN", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static boolean a(int i) {
        return 100000 <= i && 110000 >= i;
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f42176a, false, 36175, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42176a, false, 36175, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f42178b.size() > 0) {
            Integer removeFirst = this.f42178b.removeFirst();
            Intrinsics.checkExpressionValueIsNotNull(removeFirst, "mRecycleList.removeFirst()");
            return removeFirst.intValue();
        } else {
            int i = this.f42179d;
            if (i <= 110000) {
                this.f42179d++;
                return i;
            }
            throw new IllegalStateException("Your viewType is too much,it's impossible in common");
        }
    }
}
