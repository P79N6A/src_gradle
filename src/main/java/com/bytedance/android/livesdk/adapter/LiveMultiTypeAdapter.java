package com.bytedance.android.livesdk.adapter;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.j.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import me.drakeet.multitype.MultiTypeAdapter;

public class LiveMultiTypeAdapter extends MultiTypeAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8917a;

    /* renamed from: d  reason: collision with root package name */
    private ListDiffCallback f8918d;

    /* renamed from: e  reason: collision with root package name */
    private List<?> f8919e = new ArrayList();

    public final void a(@NonNull List list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f8917a, false, 3055, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f8917a, false, 3055, new Class[]{List.class}, Void.TYPE);
        } else if (list != null) {
            this.f8918d = new ListDiffCallback(this.f8919e, list);
            Observable.just(DiffUtil.calculateDiff(this.f8918d)).compose(i.a()).subscribe(new e(this, list), f.f8935b);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(@NonNull List list, DiffUtil.DiffResult diffResult) throws Exception {
        super.a(list);
        try {
            diffResult.dispatchUpdatesTo((RecyclerView.Adapter) this);
        } catch (Exception e2) {
            c.b().a(6, e2.getStackTrace());
        }
        this.f8919e.clear();
        this.f8919e.addAll(list);
    }
}
