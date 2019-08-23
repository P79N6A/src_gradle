package com.ss.android.ugc.aweme.follow.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.follow.a;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.eo;
import java.util.List;

public class ImageCellViewHolder extends AbsCellViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47805a;

    /* renamed from: b  reason: collision with root package name */
    public String f47806b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f47807c;
    @BindView(2131493169)
    AvatarImageView mAvHeadView;
    @BindView(2131493913)
    TextView mDescribeView;
    @BindView(2131494724)
    ImageView mImageIcon;
    @BindView(2131494890)
    TextView mTvName;
    @BindView(2131497457)
    TagLayout tagLayout;
    @BindView(2131497877)
    TextView tvCreateTime;

    public final void a() {
    }

    public final void l() {
    }

    public final boolean k() {
        return this.f47807c;
    }

    public final String j() {
        if (PatchProxy.isSupport(new Object[0], this, f47805a, false, 44721, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f47805a, false, 44721, new Class[0], String.class);
        } else if (this.g != null) {
            return ((Aweme) this.g).getAid();
        } else {
            return "";
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f47805a, false, 44717, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47805a, false, 44717, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            List<ImageInfo> imageInfos = ((Aweme) this.g).getImageInfos();
            if (imageInfos != null && !imageInfos.isEmpty()) {
                ImageInfo imageInfo = imageInfos.get(0);
                if (imageInfo != null) {
                    c.a((RemoteImageView) this.h, imageInfo.getLabelThumb(), this.h.getWidth(), this.h.getHeight());
                }
            }
            if (!TextUtils.isEmpty(((Aweme) this.g).getDesc())) {
                this.mDescribeView.setVisibility(0);
                this.mDescribeView.setText(((Aweme) this.g).getDesc());
            } else {
                this.mDescribeView.setVisibility(8);
            }
            if (((Aweme) this.g).getAuthor() != null) {
                this.mAvHeadView.a(((Aweme) this.g).getAuthor().getAvatarThumb());
            }
            this.tagLayout.setEventType(this.f47806b);
            if (((Aweme) this.g).getVideoLabels() != null) {
                List<AwemeLabelModel> a2 = a.a((Aweme) this.g);
                if (a2 == null) {
                    this.tagLayout.setVisibility(4);
                } else {
                    this.tagLayout.setVisibility(0);
                    this.tagLayout.b((Aweme) this.g, a2, new TagLayout.a(7, 16));
                }
            } else {
                this.tagLayout.setVisibility(4);
            }
            this.mTvName.setVisibility(0);
            if (((Aweme) this.g).getAuthor() != null) {
                this.mTvName.setText(((Aweme) this.g).getAuthor().getNickname());
            }
            if (PatchProxy.isSupport(new Object[0], this, f47805a, false, 44718, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f47805a, false, 44718, new Class[0], Void.TYPE);
            } else if (AbTestManager.a().G().intValue() == 2) {
                this.tvCreateTime.setText(eo.a(this.h.getContext(), ((Aweme) this.g).getCreateTime() * 1000));
            } else {
                this.tvCreateTime.setVisibility(4);
            }
        }
    }

    public final void d(boolean z) {
        this.f47807c = true;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f47805a, false, 44720, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f47805a, false, 44720, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.mDescribeView.getAlpha() != f2) {
            float max = Math.max(0.0f, Math.min(f2, 1.0f));
            this.mDescribeView.setAlpha(max);
            this.mAvHeadView.setAlpha(max);
            this.mTvName.setAlpha(max);
            this.tagLayout.setAlpha(max);
            this.mImageIcon.setAlpha(max);
            if (this.tvCreateTime.getVisibility() == 0) {
                this.tvCreateTime.setAlpha(max);
            }
        }
    }

    public ImageCellViewHolder(final View view, String str, final d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.h = (AnimatedImageView) view.findViewById(C0906R.id.a1a);
        this.i = true;
        this.f47806b = str;
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47808a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f47808a, false, 44722, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f47808a, false, 44722, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (((Aweme) ImageCellViewHolder.this.g).getStatus() == null || !((Aweme) ImageCellViewHolder.this.g).getStatus().isDelete()) {
                    if (dVar != null) {
                        dVar.a(view, (Aweme) ImageCellViewHolder.this.g, ImageCellViewHolder.this.f47806b);
                    }
                    return;
                }
                com.bytedance.ies.dmt.ui.d.a.c(view.getContext(), (int) C0906R.string.dr2).a();
            }
        });
        this.h.setAnimationListener(this.f40163e);
        a(this.h);
    }

    public final void a(Aweme aweme, int i, boolean z) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f47805a, false, 44716, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z)}, this, f47805a, false, 44716, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(aweme, i);
        if (aweme2 != null) {
            this.g = aweme2;
            this.f47807c = z;
            if (this.f47807c) {
                b();
            }
        }
    }
}
