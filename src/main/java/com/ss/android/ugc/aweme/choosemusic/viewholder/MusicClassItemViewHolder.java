package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;

public class MusicClassItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36079a;

    /* renamed from: b  reason: collision with root package name */
    MusicCollectionItem f36080b;

    /* renamed from: c  reason: collision with root package name */
    private int f36081c;

    /* renamed from: d  reason: collision with root package name */
    private c f36082d;
    @BindView(2131494985)
    RemoteImageView mIvClassCover;
    @BindView(2131497837)
    TextView mTvClassName;

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36079a, false, 26893, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36079a, false, 26893, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!(this.f36080b == null || this.itemView == null || this.f36082d == null)) {
            this.f36082d.a(this.f36080b, this.f36081c);
        }
    }

    public MusicClassItemViewHolder(View view, int i, c cVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f36081c = i;
        this.itemView.setOnClickListener(this);
        this.f36082d = cVar;
    }
}
