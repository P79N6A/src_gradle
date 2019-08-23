package com.ss.android.ugc.aweme.profile.adapter;

import android.content.Context;
import android.view.View;
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
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.adapter.AbsAwemeViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import java.util.List;

public class ImageViewHolder extends AbsAwemeViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61249a;

    /* renamed from: b  reason: collision with root package name */
    Context f61250b;

    /* renamed from: c  reason: collision with root package name */
    public String f61251c;
    ImageView k;
    TextView l;
    DmtTextView m;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61249a, false, 67389, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61249a, false, 67389, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f61249a, false, 67392, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61249a, false, 67392, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            List<ImageInfo> imageInfos = ((Aweme) this.g).getImageInfos();
            if (imageInfos != null && !imageInfos.isEmpty()) {
                ImageInfo imageInfo = imageInfos.get(0);
                if (imageInfo != null) {
                    c.a((RemoteImageView) this.h, imageInfo.getLabelThumb(), this.h.getWidth(), this.h.getHeight());
                }
            }
        }
    }

    public ImageViewHolder(View view, String str, final d dVar) {
        super(view);
        this.f61250b = view.getContext();
        this.f61251c = str;
        this.h = (AnimatedImageView) view.findViewById(C0906R.id.a1a);
        this.l = (TextView) view.findViewById(C0906R.id.dgc);
        this.k = (ImageView) view.findViewById(C0906R.id.dsd);
        this.m = (DmtTextView) view.findViewById(C0906R.id.dky);
        this.h.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61252a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f61252a, false, 67393, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f61252a, false, 67393, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!(ImageViewHolder.this.g == null || dVar == null)) {
                    dVar.a(view, (Aweme) ImageViewHolder.this.g, ImageViewHolder.this.f61251c);
                }
            }
        });
        this.h.setAnimationListener(this.f40163e);
    }
}
