package com.ss.android.ugc.aweme.paginglibrary.java.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class NetworkStateItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58427a;

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58427a, false, 63480, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58427a, false, 63480, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
    }
}
