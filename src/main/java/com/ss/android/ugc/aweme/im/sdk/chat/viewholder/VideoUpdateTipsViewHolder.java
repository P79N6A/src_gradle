package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.VideoUpdateTipsContent;

public class VideoUpdateTipsViewHolder extends BaseViewHolder<VideoUpdateTipsContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51157a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f51158b;
    private TextView p;
    private TextView q;
    private View r;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51157a, false, 51659, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51157a, false, 51659, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f51158b = (RemoteImageView) this.itemView.findViewById(C0906R.id.a1g);
        this.p = (TextView) this.itemView.findViewById(C0906R.id.d41);
        this.q = (TextView) this.itemView.findViewById(C0906R.id.zc);
        this.i = this.itemView.findViewById(C0906R.id.yo);
        this.r = this.itemView.findViewById(C0906R.id.a1i);
    }

    public final void a(View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{onClickListener2}, this, f51157a, false, 51660, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener2}, this, f51157a, false, 51660, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        this.i.setOnClickListener(onClickListener2);
    }

    public final void a(View.OnLongClickListener onLongClickListener) {
        View.OnLongClickListener onLongClickListener2 = onLongClickListener;
        if (PatchProxy.isSupport(new Object[]{onLongClickListener2}, this, f51157a, false, 51661, new Class[]{View.OnLongClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onLongClickListener2}, this, f51157a, false, 51661, new Class[]{View.OnLongClickListener.class}, Void.TYPE);
            return;
        }
        this.i.setOnLongClickListener(onLongClickListener2);
    }

    public VideoUpdateTipsViewHolder(View view, int i) {
        super(view);
    }

    public final /* synthetic */ void a(n nVar, n nVar2, BaseContent baseContent, int i) {
        n nVar3 = nVar;
        n nVar4 = nVar2;
        VideoUpdateTipsContent videoUpdateTipsContent = (VideoUpdateTipsContent) baseContent;
        if (PatchProxy.isSupport(new Object[]{nVar3, nVar4, videoUpdateTipsContent, Integer.valueOf(i)}, this, f51157a, false, 51662, new Class[]{n.class, n.class, VideoUpdateTipsContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar3, nVar4, videoUpdateTipsContent, Integer.valueOf(i)}, this, f51157a, false, 51662, new Class[]{n.class, n.class, VideoUpdateTipsContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar3, nVar4, videoUpdateTipsContent, i);
        if (videoUpdateTipsContent != null) {
            c.b(this.f51158b, videoUpdateTipsContent.getCover());
            this.p.setText(videoUpdateTipsContent.getTitle());
            this.q.setText(videoUpdateTipsContent.getContent());
            if (videoUpdateTipsContent.isPhoto()) {
                this.r.setVisibility(0);
            } else {
                this.r.setVisibility(8);
            }
        }
        this.i.setTag(50331648, 11);
        this.i.setTag(67108864, this.m);
    }
}
