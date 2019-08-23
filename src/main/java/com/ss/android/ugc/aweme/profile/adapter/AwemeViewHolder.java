package com.ss.android.ugc.aweme.profile.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.log.ab;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.common.adapter.AbsAwemeViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

public class AwemeViewHolder extends AbsAwemeViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61234a;

    /* renamed from: b  reason: collision with root package name */
    Context f61235b;

    /* renamed from: c  reason: collision with root package name */
    public String f61236c;
    RemoteImageView k;
    DmtTextView l;
    View m;
    TextView n;
    ImageView o;
    TextView p;
    DmtTextView q;
    ViewGroup r;
    View s;
    View t;
    TextView u;
    Drawable v;
    Drawable w;
    Drawable x;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61234a, false, 67371, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61234a, false, 67371, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f61234a, false, 67376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61234a, false, 67376, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.g == null || !ab.a().f39291d || ((Aweme) this.g).getStarRecommendTag() == null)) {
            d.a().a("starpage_ad").b("othershow").g("{}").d("cover_tag").c(((Aweme) this.g).getAdOrderId()).a(this.f61235b);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f61234a, false, 67375, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61234a, false, 67375, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            Video video = ((Aweme) this.g).getVideo();
            if (video != null) {
                if (e() && a(video.getDynamicCover())) {
                    this.h.a(video.getDynamicCover());
                    this.i = true;
                } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty(video.getCover().getUrlList().get(0))) {
                    this.h.setImageResource(C0906R.color.a0k);
                } else {
                    c.b(this.h, video.getCover());
                }
            }
        }
    }

    public AwemeViewHolder(View view, String str, final com.ss.android.ugc.aweme.challenge.d dVar) {
        super(view);
        this.f61235b = view.getContext();
        this.f61236c = str;
        this.h = (AnimatedImageView) view.findViewById(C0906R.id.a1a);
        this.p = (TextView) view.findViewById(C0906R.id.dgc);
        this.k = (RemoteImageView) view.findViewById(C0906R.id.b4_);
        this.l = (DmtTextView) view.findViewById(C0906R.id.dky);
        this.m = view.findViewById(C0906R.id.cuf);
        this.n = (TextView) view.findViewById(C0906R.id.cug);
        this.o = (ImageView) view.findViewById(C0906R.id.dsd);
        this.q = (DmtTextView) view.findViewById(C0906R.id.c83);
        this.r = (ViewGroup) view.findViewById(C0906R.id.ds_);
        this.t = view.findViewById(C0906R.id.cub);
        this.u = (TextView) view.findViewById(C0906R.id.cu_);
        this.s = view.findViewById(C0906R.id.blh);
        this.h.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61237a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f61237a, false, 67377, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f61237a, false, 67377, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!(AwemeViewHolder.this.g == null || dVar == null)) {
                    dVar.a(view, (Aweme) AwemeViewHolder.this.g, AwemeViewHolder.this.f61236c);
                }
            }
        });
        this.h.setAnimationListener(this.f40163e);
    }
}
