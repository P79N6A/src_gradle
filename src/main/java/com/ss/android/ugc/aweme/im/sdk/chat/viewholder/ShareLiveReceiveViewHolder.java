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
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.d.a;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.HashMap;
import java.util.Map;

public class ShareLiveReceiveViewHolder extends BaseViewHolder<ShareLiveContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51113a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f51114b;
    private TextView p;
    private TextView q;
    private RemoteImageView r;
    private TextView s;
    private ImageView t;
    private ImageView u;
    private TextView v;

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51113a, false, 51552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51113a, false, 51552, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        View findViewById = this.itemView.findViewById(C0906R.id.pf);
        if (PatchProxy.isSupport(new Object[]{findViewById}, this, f51113a, false, 51555, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{findViewById}, this, f51113a, false, 51555, new Class[]{View.class}, Void.TYPE);
        } else if (findViewById != null) {
            Drawable background = findViewById.getBackground();
            if (background != null && Build.VERSION.SDK_INT >= 19) {
                background.setAutoMirrored(true);
            }
        }
        this.f51114b = (RemoteImageView) this.itemView.findViewById(C0906R.id.yw);
        this.p = (TextView) this.itemView.findViewById(C0906R.id.z7);
        this.q = (TextView) this.itemView.findViewById(C0906R.id.yz);
        this.r = (RemoteImageView) this.itemView.findViewById(C0906R.id.yy);
        this.s = (TextView) this.itemView.findViewById(C0906R.id.z5);
        this.t = (ImageView) this.itemView.findViewById(C0906R.id.z8);
        this.u = (ImageView) this.itemView.findViewById(C0906R.id.ze);
        this.v = (TextView) this.itemView.findViewById(C0906R.id.za);
        this.i = (View) a((int) C0906R.id.yp);
    }

    public void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51113a, false, 51553, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51113a, false, 51553, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        this.q.setOnClickListener(onClickListener);
        this.f51114b.setOnClickListener(onClickListener);
        this.p.setOnClickListener(onClickListener);
        this.i.setOnClickListener(onClickListener);
        this.n.a(this.q, this.f51114b, this.p, this.i);
    }

    public ShareLiveReceiveViewHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, ShareLiveContent shareLiveContent, int i) {
        int i2;
        boolean z;
        n nVar3 = nVar;
        ShareLiveContent shareLiveContent2 = shareLiveContent;
        if (PatchProxy.isSupport(new Object[]{nVar3, nVar2, shareLiveContent2, Integer.valueOf(i)}, this, f51113a, false, 51554, new Class[]{n.class, n.class, ShareLiveContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar3, nVar2, shareLiveContent2, Integer.valueOf(i)}, this, f51113a, false, 51554, new Class[]{n.class, n.class, ShareLiveContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, shareLiveContent, i);
        this.u.setVisibility(0);
        this.s.setVisibility(0);
        this.q.setVisibility(8);
        this.t.setVisibility(8);
        if (shareLiveContent.getRoomCover() != null) {
            c.b(this.r, shareLiveContent.getRoomCover());
        } else {
            c.a(this.r, 2130840529);
        }
        c.b(this.f51114b, shareLiveContent.getRoomOwnerAvatar());
        this.p.setText(shareLiveContent.getRoomOwnerName());
        if (!TextUtils.isEmpty(shareLiveContent.getRoomDesc())) {
            this.v.setText(shareLiveContent.getRoomDesc());
            this.v.setVisibility(0);
        } else {
            this.v.setVisibility(8);
        }
        IMUser b2 = e.a().b(shareLiveContent.getRoomOwnerId());
        if (b2 == null) {
            i2 = 0;
        } else {
            i2 = b2.getFollowStatus();
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            z = TextUtils.equals(shareLiveContent.getRoomOwnerId(), iUserService.getCurrentUserID());
        } else {
            z = false;
        }
        if (i2 != 0 || z || !a.b().needAwemeMsgShowFollow()) {
            this.q.setVisibility(8);
        } else {
            this.q.setVisibility(0);
        }
        this.o.f50685b = this.m.getConversationId();
        this.f51114b.setTag(50331648, 24);
        this.f51114b.setTag(100663296, shareLiveContent2);
        this.p.setTag(50331648, 24);
        this.p.setTag(100663296, shareLiveContent2);
        this.q.setTag(50331648, 5);
        this.q.setTag(67108864, nVar3);
        this.i.setTag(50331648, 23);
        z a2 = z.a();
        String roomOwnerId = shareLiveContent.getRoomOwnerId();
        String roomId = shareLiveContent.getRoomId();
        if (PatchProxy.isSupport(new Object[]{roomOwnerId, roomId}, a2, z.f52670a, false, 53585, new Class[]{String.class, String.class}, Void.TYPE)) {
            z zVar = a2;
            PatchProxy.accessDispatch(new Object[]{roomOwnerId, roomId}, zVar, z.f52670a, false, 53585, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", roomId);
        hashMap.put("anchor_id", roomOwnerId);
        hashMap.put("action_type", "click");
        hashMap.put("enter_from_merge", "chat");
        hashMap.put("enter_method", "live_cover");
        hashMap.put("_params_live_platform", "live");
        r.a("livesdk_live_show", (Map) hashMap);
    }
}
