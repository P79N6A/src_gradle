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
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import java.util.List;

public class TimeLineViewHolder extends AbsCellViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44807a;

    /* renamed from: b  reason: collision with root package name */
    public String f44808b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f44809c;
    @BindView(2131493169)
    AvatarImageView mAvHeadView;
    @BindView(2131495819)
    TextView mDescribeView;
    @BindView(2131495661)
    RemoteImageView mImgLocation;
    @BindView(2131495659)
    View mLocationLayout;
    @BindView(2131495651)
    TextView mTvLocation;
    @BindView(2131494890)
    TextView mTvName;
    @BindView(2131497457)
    TagLayout tagLayout;
    @BindView(2131498266)
    TextView txtDistance;

    public final void l() {
    }

    public final boolean k() {
        return this.f44809c;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44807a, false, 40694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44807a, false, 40694, new Class[0], Void.TYPE);
            return;
        }
        i();
    }

    public final String j() {
        if (PatchProxy.isSupport(new Object[0], this, f44807a, false, 40695, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f44807a, false, 40695, new Class[0], String.class);
        } else if (this.g != null) {
            return ((Aweme) this.g).getAid();
        } else {
            return "";
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f44807a, false, 40696, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44807a, false, 40696, new Class[0], Void.TYPE);
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

    public final void b() {
        List<AwemeLabelModel> list;
        if (PatchProxy.isSupport(new Object[0], this, f44807a, false, 40691, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44807a, false, 40691, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            i();
            if (!TextUtils.isEmpty(((Aweme) this.g).getDesc())) {
                this.mDescribeView.setVisibility(0);
                this.mDescribeView.setText(((Aweme) this.g).getDesc());
            } else {
                this.mDescribeView.setVisibility(8);
            }
            if (((Aweme) this.g).getAuthor() != null) {
                this.mAvHeadView.a(((Aweme) this.g).getAuthor().getAvatarThumb());
            }
            this.tagLayout.setEventType(this.f44808b);
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
            PoiStruct poiStruct = ((Aweme) this.g).getPoiStruct();
            if (poiStruct == null) {
                this.mTvName.setVisibility(0);
                if (((Aweme) this.g).getAuthor() != null) {
                    this.mTvName.setText(((Aweme) this.g).getAuthor().getNickname());
                }
                if (TextUtils.isEmpty(((Aweme) this.g).getDistance())) {
                    this.txtDistance.setVisibility(8);
                } else {
                    this.txtDistance.setVisibility(0);
                    this.txtDistance.setText(((Aweme) this.g).getDistance());
                }
                this.mLocationLayout.setVisibility(8);
                return;
            }
            this.mTvName.setVisibility(8);
            this.txtDistance.setVisibility(8);
            this.mLocationLayout.setVisibility(0);
            this.mTvLocation.setText(poiStruct.poiName);
            p.a(this.mImgLocation, poiStruct);
        }
    }

    public final void d(boolean z) {
        this.f44809c = true;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f44807a, false, 40693, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f44807a, false, 40693, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.mDescribeView.getAlpha() != f2) {
            float max = Math.max(0.0f, Math.min(f2, 1.0f));
            this.mDescribeView.setAlpha(max);
            this.mAvHeadView.setAlpha(max);
            this.mLocationLayout.setAlpha(max);
            this.mTvName.setAlpha(max);
            this.txtDistance.setAlpha(max);
            this.tagLayout.setAlpha(max);
        }
    }

    public TimeLineViewHolder(final View view, String str, final d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.h = (AnimatedImageView) view.findViewById(C0906R.id.a1a);
        this.i = true;
        this.f44808b = str;
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44810a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44810a, false, 40697, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44810a, false, 40697, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (((Aweme) TimeLineViewHolder.this.g).getStatus() == null || !((Aweme) TimeLineViewHolder.this.g).getStatus().isDelete()) {
                    if (dVar != null) {
                        dVar.a(view, (Aweme) TimeLineViewHolder.this.g, TimeLineViewHolder.this.f44808b);
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
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f44807a, false, 40690, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z)}, this, f44807a, false, 40690, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(aweme, i);
        if (aweme2 != null) {
            this.g = aweme2;
            this.f44809c = z;
            if (this.f44809c) {
                b();
            }
        }
    }
}
