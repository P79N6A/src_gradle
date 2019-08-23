package com.ss.android.ugc.aweme.newfollow.ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.adapter.AbsAwemeViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.newfollow.ui.FavoriteAdapter;
import java.util.List;

public class FavoriteViewHolder extends AbsAwemeViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57202a;

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f57202a, false, 61458, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57202a, false, 61458, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            if (((Aweme) this.g).getAwemeType() == 2) {
                i();
            } else {
                j();
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57202a, false, 61456, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57202a, false, 61456, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f57202a, false, 61459, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57202a, false, 61459, new Class[0], Void.TYPE);
            return;
        }
        List<ImageInfo> imageInfos = ((Aweme) this.g).getImageInfos();
        if (imageInfos != null && !imageInfos.isEmpty()) {
            ImageInfo imageInfo = imageInfos.get(0);
            if (imageInfo != null) {
                c.a((RemoteImageView) this.h, imageInfo.getLabelThumb(), this.h.getWidth(), this.h.getHeight());
            }
        }
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f57202a, false, 61460, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57202a, false, 61460, new Class[0], Void.TYPE);
            return;
        }
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

    public FavoriteViewHolder(View view, final FavoriteAdapter.a aVar) {
        super(view);
        this.h = (AnimatedImageView) view.findViewById(C0906R.id.a1a);
        this.h.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57203a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f57203a, false, 61461, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f57203a, false, 61461, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!(FavoriteViewHolder.this.g == null || aVar == null)) {
                    aVar.a(view, (Aweme) FavoriteViewHolder.this.g, ((Integer) view.getTag()).intValue());
                }
            }
        });
        this.h.setAnimationListener(this.f40163e);
    }

    public final void a(Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f57202a, false, 61457, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f57202a, false, 61457, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
        } else if (aweme != null) {
            this.h.setTag(Integer.valueOf(i));
            this.g = aweme;
            b();
        }
    }
}
