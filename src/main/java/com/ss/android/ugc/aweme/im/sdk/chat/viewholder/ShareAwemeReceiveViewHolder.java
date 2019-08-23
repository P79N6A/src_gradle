package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.d.a;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public class ShareAwemeReceiveViewHolder extends BaseViewHolder<ShareAwemeContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51098a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f51099b;
    private TextView p;
    private TextView q;
    private RemoteImageView r;
    private TextView s;
    private ImageView t;
    private ImageView u;
    private TextView v;
    private View w;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51098a, false, 51522, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51098a, false, 51522, new Class[0], Void.TYPE);
            return;
        }
        super.b();
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51098a, false, 51521, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51098a, false, 51521, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.w = this.itemView.findViewById(C0906R.id.pf);
        this.f51099b = (RemoteImageView) this.itemView.findViewById(C0906R.id.yw);
        this.p = (TextView) this.itemView.findViewById(C0906R.id.z7);
        this.q = (TextView) this.itemView.findViewById(C0906R.id.yz);
        this.r = (RemoteImageView) this.itemView.findViewById(C0906R.id.yy);
        this.s = (TextView) this.itemView.findViewById(C0906R.id.z5);
        this.t = (ImageView) this.itemView.findViewById(C0906R.id.z8);
        this.u = (ImageView) this.itemView.findViewById(C0906R.id.ze);
        this.v = (TextView) this.itemView.findViewById(C0906R.id.za);
        this.i = (View) a((int) C0906R.id.yp);
        View view = this.w;
        if (PatchProxy.isSupport(new Object[]{view}, this, f51098a, false, 51525, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f51098a, false, 51525, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view != null) {
            Drawable background = view.getBackground();
            if (background != null && Build.VERSION.SDK_INT >= 19) {
                background.setAutoMirrored(true);
            }
        }
    }

    public void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51098a, false, 51523, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51098a, false, 51523, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.q.setOnClickListener(onClickListener);
        this.f51099b.setOnClickListener(onClickListener);
        this.p.setOnClickListener(onClickListener);
        this.i.setOnClickListener(onClickListener);
        this.n.a(this.q, this.f51099b, this.p, this.i);
    }

    public ShareAwemeReceiveViewHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, ShareAwemeContent shareAwemeContent, int i) {
        int i2;
        boolean z;
        n nVar3 = nVar;
        ShareAwemeContent shareAwemeContent2 = shareAwemeContent;
        if (PatchProxy.isSupport(new Object[]{nVar3, nVar2, shareAwemeContent2, Integer.valueOf(i)}, this, f51098a, false, 51524, new Class[]{n.class, n.class, ShareAwemeContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar3, nVar2, shareAwemeContent2, Integer.valueOf(i)}, this, f51098a, false, 51524, new Class[]{n.class, n.class, ShareAwemeContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, shareAwemeContent, i);
        int awemeType = shareAwemeContent.getAwemeType();
        if (awemeType == 0 || awemeType == 23) {
            this.u.setVisibility(0);
            this.t.setVisibility(8);
            this.q.setVisibility(8);
            if (awemeType == 23) {
                this.s.setVisibility(0);
            }
        } else {
            this.u.setVisibility(8);
            this.t.setVisibility(0);
            this.q.setVisibility(0);
        }
        c.b(this.r, shareAwemeContent.getCoverUrl());
        c.b(this.f51099b, shareAwemeContent.getContentThumb());
        this.p.setText(shareAwemeContent.getContentName());
        String title = shareAwemeContent.getTitle();
        if (!TextUtils.isEmpty(title)) {
            this.v.setText(title);
            this.v.setVisibility(0);
        } else {
            this.v.setVisibility(8);
        }
        if (awemeType == 0 || awemeType == 2) {
            IMUser b2 = e.a().b(shareAwemeContent.getUser());
            if (b2 == null) {
                i2 = 0;
            } else {
                i2 = b2.getFollowStatus();
            }
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService != null) {
                z = TextUtils.equals(shareAwemeContent.getUser(), iUserService.getCurrentUserID());
            } else {
                z = false;
            }
            if (i2 != 0 || z || !a.b().needAwemeMsgShowFollow()) {
                this.q.setVisibility(8);
            } else {
                this.q.setVisibility(0);
            }
        } else {
            this.q.setVisibility(8);
        }
        if (awemeType == 0) {
            this.i.setTag(50331648, 2);
            this.i.setTag(67108864, shareAwemeContent.getItemId());
            this.q.setTag(50331648, 5);
            this.q.setTag(67108864, nVar3);
        } else if (awemeType == 2) {
            this.i.setTag(50331648, 8);
            this.i.setTag(67108864, shareAwemeContent.getItemId());
            this.q.setTag(50331648, 5);
            this.q.setTag(67108864, nVar3);
        }
        this.f51099b.setTag(50331648, 4);
        this.f51099b.setTag(100663296, shareAwemeContent2);
        this.p.setTag(50331648, 4);
        this.p.setTag(100663296, shareAwemeContent2);
        this.o.f50685b = this.m.getConversationId();
    }
}
