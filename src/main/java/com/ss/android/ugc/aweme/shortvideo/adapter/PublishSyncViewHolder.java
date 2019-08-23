package com.ss.android.ugc.aweme.shortvideo.adapter;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import butterknife.BindView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import org.greenrobot.eventbus.Subscribe;

public class PublishSyncViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3890a;

    /* renamed from: b  reason: collision with root package name */
    public VideoPublishSyncModel f3891b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3892c;
    @BindView(2131497430)
    AutoRTLImageView mIvIcon;
    @BindView(2131497431)
    TextView mTvName;

    @Subscribe
    public void onPublishSyncEvent(a aVar) {
        int i;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3890a, false, 74975, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3890a, false, 74975, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar.f65498b == this.f3891b.mType && "action_bind_toutiao_success".equals(aVar.f65497a)) {
            d.a().queryUser();
            boolean z = !this.f3892c;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3890a, false, 74974, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3890a, false, 74974, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.f3892c = z;
            this.itemView.setSelected(z);
            this.mTvName.setSelected(z);
            AutoRTLImageView autoRTLImageView = this.mIvIcon;
            if (z) {
                i = 255;
            } else {
                i = 77;
            }
            autoRTLImageView.setImageAlpha(i);
        }
    }
}
