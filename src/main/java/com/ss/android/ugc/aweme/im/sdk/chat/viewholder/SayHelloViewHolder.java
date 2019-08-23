package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.e;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.sdk.resources.model.a;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.az;
import com.ss.android.ugc.aweme.im.sdk.utils.b;
import com.ss.android.ugc.aweme.im.sdk.utils.t;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.IIMService;
import java.util.List;

public class SayHelloViewHolder extends BaseViewHolder<SayHelloContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51085a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f51086b;
    public View p;
    public View q;
    public List<a> r;
    public Animation s;
    private ImageView t;
    private RemoteImageView u;
    private RemoteImageView v;
    private RemoteImageView w;
    private View x;
    private DmtTextView y;
    private t z;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51085a, false, 51506, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51085a, false, 51506, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.z = new t() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51087a;

            /* renamed from: c  reason: collision with root package name */
            private int f51089c;

            /* renamed from: d  reason: collision with root package name */
            private int f51090d;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f51087a, false, 51510, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f51087a, false, 51510, new Class[0], Void.TYPE);
                    return;
                }
                this.f51090d++;
                this.f51089c++;
                c();
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f51087a, false, 51511, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f51087a, false, 51511, new Class[0], Void.TYPE);
                    return;
                }
                this.f51090d++;
                c();
            }

            private void c() {
                if (PatchProxy.isSupport(new Object[0], this, f51087a, false, 51512, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f51087a, false, 51512, new Class[0], Void.TYPE);
                    return;
                }
                if (this.f51090d == 3) {
                    SayHelloViewHolder.this.f51086b.setVisibility(8);
                    b.a(SayHelloViewHolder.this.f51086b);
                    if (this.f51089c != this.f51090d) {
                        SayHelloViewHolder.this.p.setVisibility(8);
                        SayHelloViewHolder.this.q.setVisibility(0);
                        SayHelloViewHolder.this.a(false);
                    } else {
                        SayHelloViewHolder.this.p.setVisibility(0);
                        SayHelloViewHolder.this.q.setVisibility(8);
                        SayHelloViewHolder.this.a(true);
                    }
                    this.f51089c = 0;
                    this.f51090d = 0;
                }
            }
        };
        this.q.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51091a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f51091a, false, 51513, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f51091a, false, 51513, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (SayHelloViewHolder.this.r != null) {
                    SayHelloViewHolder.this.q.setVisibility(8);
                    SayHelloViewHolder.this.f51086b.setVisibility(0);
                    SayHelloViewHolder.this.f51086b.startAnimation(SayHelloViewHolder.this.s);
                    SayHelloViewHolder.this.p.setVisibility(0);
                    SayHelloViewHolder.this.a(SayHelloViewHolder.this.r);
                }
            }
        });
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51085a, false, 51504, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51085a, false, 51504, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.x = this.itemView.findViewById(C0906R.id.cjh);
        this.y = (DmtTextView) this.itemView.findViewById(C0906R.id.cji);
        this.t = (ImageView) this.itemView.findViewById(C0906R.id.ts);
        this.u = (RemoteImageView) this.itemView.findViewById(C0906R.id.yq);
        this.v = (RemoteImageView) this.itemView.findViewById(C0906R.id.yr);
        this.w = (RemoteImageView) this.itemView.findViewById(C0906R.id.ys);
        this.p = this.itemView.findViewById(C0906R.id.axs);
        this.q = this.itemView.findViewById(C0906R.id.axt);
        this.f51086b = (ImageView) this.itemView.findViewById(C0906R.id.bj1);
        this.s = b.a(400, null);
        this.f51086b.startAnimation(this.s);
    }

    public final void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51085a, false, 51505, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51085a, false, 51505, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        this.t.setOnClickListener(onClickListener);
        this.u.setOnClickListener(onClickListener);
        this.v.setOnClickListener(onClickListener);
        this.w.setOnClickListener(onClickListener);
        a(false);
    }

    public final void a(List<a> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f51085a, false, 51508, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f51085a, false, 51508, new Class[]{List.class}, Void.TYPE);
            return;
        }
        az.a(this.u, list.get(0).getAnimateUrl(), this.z);
        az.a(this.v, list.get(1).getAnimateUrl(), this.z);
        az.a(this.w, list.get(2).getAnimateUrl(), this.z);
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f51085a, false, 51509, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f51085a, false, 51509, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.u.setEnabled(z2);
        this.v.setEnabled(z2);
        this.w.setEnabled(z2);
    }

    public SayHelloViewHolder(View view, int i) {
        super(view);
    }

    public final /* synthetic */ void a(n nVar, n nVar2, BaseContent baseContent, int i) {
        n nVar3 = nVar;
        n nVar4 = nVar2;
        SayHelloContent sayHelloContent = (SayHelloContent) baseContent;
        if (PatchProxy.isSupport(new Object[]{nVar3, nVar4, sayHelloContent, Integer.valueOf(i)}, this, f51085a, false, 51507, new Class[]{n.class, n.class, SayHelloContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar3, nVar4, sayHelloContent, Integer.valueOf(i)}, this, f51085a, false, 51507, new Class[]{n.class, n.class, SayHelloContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar3, nVar4, sayHelloContent, i);
        if (sayHelloContent != null) {
            this.r = sayHelloContent.getEmoji();
            com.ss.android.ugc.aweme.im.service.b abInterface = ((IIMService) com.ss.android.ugc.aweme.im.sdk.g.a.a(IIMService.class)).getAbInterface();
            if (this.r.size() < 3 || abInterface == null || !abInterface.b()) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.x.getLayoutParams();
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = 0;
                layoutParams.height = 0;
                this.x.setLayoutParams(layoutParams);
            } else if (!this.r.get(0).equals(this.u.getTag(67108864)) || !this.r.get(1).equals(this.v.getTag(67108864)) || !this.r.get(2).equals(this.w.getTag(67108864))) {
                a(this.r);
                this.y.setText(GlobalContext.getContext().getResources().getString(C0906R.string.ax1, new Object[]{sayHelloContent.getNickname()}));
                if (nVar.getLocalExt().get("is_logger") == null) {
                    nVar3.addLocalExt("is_logger", "true");
                    z.a().a(e.a(nVar.getConversationId()), this.m.getConversationId(), this.r, false);
                    ad.a(nVar);
                }
                this.t.setTag(50331648, 13);
                this.t.setTag(67108864, this.m);
                this.u.setTag(50331648, 13);
                this.u.setTag(83886080, 0);
                this.u.setTag(67108864, this.m);
                this.v.setTag(50331648, 13);
                this.v.setTag(83886080, 1);
                this.v.setTag(67108864, this.m);
                this.w.setTag(50331648, 13);
                this.w.setTag(83886080, 2);
                this.w.setTag(67108864, this.m);
            }
        }
    }
}
