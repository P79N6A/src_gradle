package com.ss.android.ugc.aweme.music.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ChallengeTitleViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56177a;

    /* renamed from: b  reason: collision with root package name */
    private Context f56178b;
    @BindView(2131493531)
    public LinearLayout rootLayout;
    @BindView(2131493530)
    public TextView title;

    public ChallengeTitleViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f56178b = view.getContext();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f56177a, false, 59870, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f56177a, false, 59870, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.itemView.getLayoutParams();
        if (z) {
            layoutParams.height = -2;
            layoutParams.width = -1;
            this.itemView.setVisibility(0);
        } else {
            this.itemView.setVisibility(8);
            layoutParams.height = 0;
            layoutParams.width = 0;
        }
        this.itemView.setLayoutParams(layoutParams);
    }
}
