package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.n;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMusicContent;
import com.ss.android.ugc.aweme.im.sdk.utils.w;

public class ShareMusicSimpleReceiveViewHolder extends BaseViewHolder<ShareMusicContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51121a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f51122b;
    private DmtTextView p;
    private DmtTextView q;
    private DmtTextView r;

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51121a, false, 51570, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51121a, false, 51570, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.i = this.itemView.findViewById(C0906R.id.yp);
        this.f51122b = (RemoteImageView) this.itemView.findViewById(C0906R.id.aqj);
        this.p = (DmtTextView) this.itemView.findViewById(C0906R.id.d41);
        this.q = (DmtTextView) this.itemView.findViewById(C0906R.id.a3s);
        this.r = (DmtTextView) this.itemView.findViewById(C0906R.id.czi);
    }

    public final void a(View.OnLongClickListener onLongClickListener) {
        View.OnLongClickListener onLongClickListener2 = onLongClickListener;
        if (PatchProxy.isSupport(new Object[]{onLongClickListener2}, this, f51121a, false, 51573, new Class[]{View.OnLongClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onLongClickListener2}, this, f51121a, false, 51573, new Class[]{View.OnLongClickListener.class}, Void.TYPE);
            return;
        }
        this.i.setOnLongClickListener(onLongClickListener2);
    }

    public void a(View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{onClickListener2}, this, f51121a, false, 51572, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener2}, this, f51121a, false, 51572, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.i.setOnClickListener(onClickListener2);
    }

    public ShareMusicSimpleReceiveViewHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, ShareMusicContent shareMusicContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, shareMusicContent, Integer.valueOf(i)}, this, f51121a, false, 51571, new Class[]{n.class, n.class, ShareMusicContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, shareMusicContent, Integer.valueOf(i)}, this, f51121a, false, 51571, new Class[]{n.class, n.class, ShareMusicContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, shareMusicContent, i);
        this.p.setText(shareMusicContent.getMusicName());
        this.q.setVisibility(0);
        this.q.setText(String.format(this.itemView.getContext().getResources().getString(C0906R.string.avb), new Object[]{com.ss.android.ugc.aweme.im.sdk.utils.n.a((long) shareMusicContent.getUserCount())}));
        this.r.setText(C0906R.string.ava);
        RemoteImageView remoteImageView = this.f51122b;
        UrlModel coverThumb = shareMusicContent.getCoverThumb();
        if (PatchProxy.isSupport(new Object[]{remoteImageView, coverThumb, 2130840096, 2130840118}, null, w.f52667a, true, 53521, new Class[]{RemoteImageView.class, UrlModel.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {remoteImageView, coverThumb, 2130840096, 2130840118};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, w.f52667a, true, 53521, new Class[]{RemoteImageView.class, UrlModel.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!(remoteImageView == null || remoteImageView.getContext() == null)) {
            GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder = new GenericDraweeHierarchyBuilder(remoteImageView.getContext().getResources());
            genericDraweeHierarchyBuilder.setPlaceholderImage(2130840118);
            genericDraweeHierarchyBuilder.setFailureImage(2130840096);
            remoteImageView.setHierarchy(genericDraweeHierarchyBuilder.build());
            c.b(remoteImageView, coverThumb);
        }
        this.i.setTag(50331648, 17);
        this.i.setTag(67108864, this.m);
    }
}
