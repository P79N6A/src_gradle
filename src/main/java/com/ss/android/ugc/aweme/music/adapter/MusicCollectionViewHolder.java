package com.ss.android.ugc.aweme.music.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;

public class MusicCollectionViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56181a;

    /* renamed from: b  reason: collision with root package name */
    public MusicCollectionItem f56182b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f56183c;

    /* renamed from: d  reason: collision with root package name */
    private Context f56184d;
    @BindView(2131495814)
    public RemoteImageView mCoverView;
    @BindView(2131495858)
    public TextView mNameView;

    public MusicCollectionViewHolder(View view, final a aVar) {
        super(view);
        this.f56184d = view.getContext();
        ButterKnife.bind((Object) this, view);
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56185a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f56185a, false, 59874, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f56185a, false, 59874, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (aVar != null) {
                    if (MusicCollectionViewHolder.this.f56183c) {
                        aVar.a(MusicCollectionViewHolder.this);
                        return;
                    }
                    aVar.a(MusicCollectionViewHolder.this, MusicCollectionViewHolder.this.f56182b);
                }
            }
        });
    }
}
