package com.ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class PoiDetailViewHolder extends AbsCellViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44749a;
    @BindView(2131493160)
    RemoteImageView authorAvatar;

    /* renamed from: b  reason: collision with root package name */
    public String f44750b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f44751c;
    @BindView(2131497457)
    TagLayout tagLayout;
    @BindView(2131493162)
    TextView txtAuthorName;
    @BindView(2131493907)
    TextView txtDesc;
    @BindView(2131495351)
    TextView txtLikeCount;

    public final void l() {
    }

    public final boolean k() {
        return this.f44751c;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44749a, false, 40598, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44749a, false, 40598, new Class[0], Void.TYPE);
            return;
        }
        i();
    }

    public final String j() {
        if (PatchProxy.isSupport(new Object[0], this, f44749a, false, 40599, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f44749a, false, 40599, new Class[0], String.class);
        } else if (this.g != null) {
            return ((Aweme) this.g).getAid();
        } else {
            return "";
        }
    }

    public final void b() {
        List<AwemeLabelModel> list;
        if (PatchProxy.isSupport(new Object[0], this, f44749a, false, 40596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44749a, false, 40596, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            i();
            if (TextUtils.isEmpty(((Aweme) this.g).getDesc())) {
                this.txtDesc.setVisibility(8);
            } else {
                this.txtDesc.setVisibility(0);
                this.txtDesc.setText(((Aweme) this.g).getDesc());
            }
            User author = ((Aweme) this.g).getAuthor();
            if (author != null) {
                this.txtAuthorName.setText(author.getNickname());
                c.b(this.authorAvatar, author.getAvatarThumb());
            }
            this.txtLikeCount.setVisibility(8);
            this.tagLayout.setEventType(this.f44750b);
            if (((Aweme) this.g).getVideoLabels() != null) {
                TagLayout tagLayout2 = this.tagLayout;
                Aweme aweme = (Aweme) this.g;
                if (((Aweme) this.g).getVideoLabels().size() > 0) {
                    list = ((Aweme) this.g).getVideoLabels().subList(0, 1);
                } else {
                    list = ((Aweme) this.g).getVideoLabels();
                }
                tagLayout2.b(aweme, list, new TagLayout.a(7, 16));
            }
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f44749a, false, 40597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44749a, false, 40597, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            List<ImageInfo> imageInfos = ((Aweme) this.g).getImageInfos();
            if (imageInfos == null || imageInfos.isEmpty()) {
                Video video = ((Aweme) this.g).getVideo();
                if (video != null) {
                    if (e() && a(video.getDynamicCover())) {
                        this.h.a(video.getDynamicCover());
                        this.i = true;
                        return;
                    } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty(video.getCover().getUrlList().get(0))) {
                        this.h.setImageResource(C0906R.color.a0k);
                        return;
                    } else {
                        c.b(this.h, video.getCover());
                    }
                }
                return;
            }
            ImageInfo imageInfo = imageInfos.get(0);
            if (imageInfo != null) {
                c.b(this.h, imageInfo.getLabelLarge());
            }
        }
    }

    public final void d(boolean z) {
        this.f44751c = true;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f44749a, false, 40600, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f44749a, false, 40600, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.txtDesc.getAlpha() != f2) {
            this.txtDesc.setAlpha(f2);
            this.txtAuthorName.setAlpha(f2);
            this.txtLikeCount.setAlpha(f2);
            this.authorAvatar.setAlpha(f2);
            this.tagLayout.setAlpha(f2);
        }
    }

    public PoiDetailViewHolder(final View view, String str, final d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.h = (AnimatedImageView) view.findViewById(C0906R.id.a1a);
        this.i = true;
        this.f44750b = str;
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44752a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44752a, false, 40601, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44752a, false, 40601, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (((Aweme) PoiDetailViewHolder.this.g).getStatus() == null || !((Aweme) PoiDetailViewHolder.this.g).getStatus().isDelete()) {
                    if (dVar != null) {
                        dVar.a(view, (Aweme) PoiDetailViewHolder.this.g, PoiDetailViewHolder.this.f44750b);
                    }
                    return;
                }
                a.c(view.getContext(), (int) C0906R.string.dr2).a();
            }
        });
        this.h.setAnimationListener(this.f40163e);
        a(this.h);
    }

    public final void a(Aweme aweme, int i, boolean z) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f44749a, false, 40595, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z)}, this, f44749a, false, 40595, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(aweme, i);
        if (aweme2 != null) {
            this.g = aweme2;
            this.f44751c = z;
            if (this.f44751c) {
                b();
            }
        }
    }
}
