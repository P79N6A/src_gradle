package com.ss.android.ugc.aweme.music.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ShowLessViewHolder extends RecyclerView.ViewHolder {
    @BindView(2131498143)
    LinearLayout tvShowLess;

    public ShowLessViewHolder(View view, final b bVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.tvShowLess.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56252a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f56252a, false, 59947, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f56252a, false, 59947, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                bVar.a(ShowLessViewHolder.this);
            }
        });
    }
}
