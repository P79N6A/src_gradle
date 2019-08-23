package com.ss.android.ugc.aweme.favorites.viewholder;

import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.favorites.d.a;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.aweme.sticker.model.d;

public class StickerCollectViewHolder extends RecyclerView.ViewHolder implements a.C0553a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44393a;

    /* renamed from: b  reason: collision with root package name */
    public View f44394b;

    /* renamed from: c  reason: collision with root package name */
    public bv f44395c;

    /* renamed from: d  reason: collision with root package name */
    public d f44396d;
    @BindView(2131496925)
    public RemoteImageView ivCover;
    @BindView(2131495129)
    public AppCompatImageView ivRecord;
    @BindView(2131497889)
    public DmtTextView tvDesigner;
    @BindView(2131498169)
    public DmtTextView tvStickerName;
    @BindView(2131498220)
    public DmtTextView tvUserCount;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44393a, false, 39707, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44393a, false, 39707, new Class[0], Void.TYPE);
            return;
        }
        if (this.f44396d != null) {
            a.d(1, this.f44396d.id);
        }
    }

    public StickerCollectViewHolder(View view) {
        super(view);
        this.f44394b = view;
        ButterKnife.bind((Object) this, view);
        this.tvStickerName.setFontType(c.f20595b);
    }
}
