package com.ss.android.ugc.aweme.im.sdk.chat.input;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class InputView$6 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50330a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f50331b;

    InputView$6(d dVar) {
        this.f50331b = dVar;
    }

    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f50330a, false, 50616, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f50330a, false, 50616, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            this.f50331b.o();
        } else {
            this.f50331b.n();
        }
    }
}
