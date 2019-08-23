package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.CommandShareContent;

public class CommandShareViewHolder extends BaseViewHolder<CommandShareContent> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51054b;

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f51055a;
    TextView p;
    private TextView q;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51054b, false, 51439, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51054b, false, 51439, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.n.a(this.i);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51054b, false, 51438, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51054b, false, 51438, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f51055a = (RemoteImageView) this.itemView.findViewById(C0906R.id.by9);
        this.p = (TextView) this.itemView.findViewById(C0906R.id.d41);
        this.q = (TextView) this.itemView.findViewById(C0906R.id.a3s);
        this.i = this.itemView.findViewById(C0906R.id.yp);
    }

    public CommandShareViewHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, CommandShareContent commandShareContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, commandShareContent, Integer.valueOf(i)}, this, f51054b, false, 51440, new Class[]{n.class, n.class, CommandShareContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, commandShareContent, Integer.valueOf(i)}, this, f51054b, false, 51440, new Class[]{n.class, n.class, CommandShareContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, commandShareContent, i);
        c.b(this.f51055a, commandShareContent.getCoverUrl());
        this.p.setText(C0906R.string.aq8);
        if (TextUtils.isEmpty(commandShareContent.getTitle())) {
            this.q.setText(GlobalContext.getContext().getString(C0906R.string.apz, new Object[]{commandShareContent.getAuthorName()}));
        } else {
            this.q.setText(commandShareContent.getTitle());
        }
        this.i.setTag(50331648, 12);
        this.i.setTag(67108864, commandShareContent.getItemId());
    }
}
