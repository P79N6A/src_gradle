package com.ss.android.ugc.aweme.story.shootvideo.friends.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.story.shootvideo.friends.adapter.PublishSelectFriendAdapter;

public class PublishSelectFriendViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73566a;

    /* renamed from: b  reason: collision with root package name */
    TextView f73567b;

    /* renamed from: c  reason: collision with root package name */
    AvatarImageWithVerify f73568c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f73569d;

    /* renamed from: e  reason: collision with root package name */
    TextView f73570e;

    /* renamed from: f  reason: collision with root package name */
    TextView f73571f;
    View g;
    PublishSelectFriendAdapter.a h;
    int i;
    public boolean j;
    String k;
    private View l;

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73566a, false, 85312, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73566a, false, 85312, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.f73569d.setImageResource(2130838826);
        } else {
            this.f73569d.setImageResource(2130838832);
        }
    }

    public PublishSelectFriendViewHolder(View view, PublishSelectFriendAdapter.a aVar, String str, int i2) {
        super(view);
        this.i = i2;
        this.h = aVar;
        this.k = str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f73566a, false, 85310, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73566a, false, 85310, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f73567b = (TextView) view.findViewById(C0906R.id.df7);
        this.f73568c = (AvatarImageWithVerify) view.findViewById(C0906R.id.ckf);
        this.f73569d = (ImageView) view.findViewById(C0906R.id.s_);
        this.f73570e = (TextView) view.findViewById(C0906R.id.ano);
        this.f73571f = (TextView) view.findViewById(C0906R.id.ahl);
        this.g = view.findViewById(C0906R.id.jf);
        this.l = view.findViewById(C0906R.id.jc);
        if (this.i == 1) {
            this.f73570e.setText(this.f73570e.getContext().getResources().getString(C0906R.string.cfn));
        } else {
            this.f73570e.setText(this.f73570e.getContext().getResources().getString(C0906R.string.cfq));
            this.f73571f.setVisibility(8);
            this.g.setVisibility(8);
        }
        this.f73570e.setOnClickListener(b.f73573b);
        this.l.setOnClickListener(new c(this));
        this.g.setOnClickListener(new d(this, view));
    }
}
