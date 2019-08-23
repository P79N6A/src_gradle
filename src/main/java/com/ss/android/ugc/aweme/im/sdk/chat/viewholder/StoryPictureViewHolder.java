package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.im.core.d.n;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.c.a;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent;
import com.ss.android.ugc.aweme.im.sdk.utils.ac;
import javax.annotation.Nullable;

public class StoryPictureViewHolder extends BaseViewHolder<StoryPictureContent> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51140b;

    /* renamed from: a  reason: collision with root package name */
    private final int f51141a = GlobalContext.getContext().getResources().getDimensionPixelSize(C0906R.dimen.ha);
    public RemoteImageView p;
    public View q;

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51140b, false, 51623, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51140b, false, 51623, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.n.a(this.q, this.i);
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51140b, false, 51622, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51140b, false, 51622, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.p = (RemoteImageView) this.itemView.findViewById(C0906R.id.by9);
        this.q = this.itemView.findViewById(C0906R.id.a75);
        this.i = this.itemView.findViewById(C0906R.id.yp);
    }

    public void a(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f51140b, false, 51624, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f51140b, false, 51624, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.a(onClickListener);
        if (this.q != null) {
            this.q.setOnClickListener(onClickListener);
        }
        this.i.setOnClickListener(onClickListener);
    }

    public StoryPictureViewHolder(View view, int i) {
        super(view);
    }

    public void a(n nVar, n nVar2, StoryPictureContent storyPictureContent, int i) {
        final StoryPictureContent storyPictureContent2 = storyPictureContent;
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, storyPictureContent2, Integer.valueOf(i)}, this, f51140b, false, 51625, new Class[]{n.class, n.class, StoryPictureContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, storyPictureContent2, Integer.valueOf(i)}, this, f51140b, false, 51625, new Class[]{n.class, n.class, StoryPictureContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, storyPictureContent, i);
        if (PatchProxy.isSupport(new Object[0], this, f51140b, false, 51626, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51140b, false, 51626, new Class[0], Void.TYPE);
        } else {
            Integer[] a2 = ac.a(this.p, (float) ((StoryPictureContent) this.k).getWidth(), (float) ((StoryPictureContent) this.k).getHeight());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.p.getLayoutParams();
            layoutParams.width = a2[0].intValue();
            layoutParams.height = a2[1].intValue();
            this.p.setLayoutParams(layoutParams);
            ((GenericDraweeHierarchy) this.p.getHierarchy()).setRoundingParams(RoundingParams.fromCornersRadii((float) this.f51141a, (float) this.f51141a, (float) this.f51141a, (float) this.f51141a));
        }
        c.a(this.p, a.a(storyPictureContent.getUrl(), storyPictureContent.getPicturePath()), (ControllerListener<ImageInfo>) new BaseControllerListener<ImageInfo>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51142a;

            public final void onFailure(String str, Throwable th) {
                if (PatchProxy.isSupport(new Object[]{str, th}, this, f51142a, false, 51628, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, th}, this, f51142a, false, 51628, new Class[]{String.class, Throwable.class}, Void.TYPE);
                    return;
                }
                if (StoryPictureViewHolder.this.q != null) {
                    StoryPictureViewHolder.this.q.setTag(50331648, 7);
                    StoryPictureViewHolder.this.q.setTag(67108864, storyPictureContent2);
                    StoryPictureViewHolder.this.q.setTag(StoryPictureViewHolder.this.p);
                    StoryPictureViewHolder.this.q.setVisibility(0);
                }
            }

            public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                ImageInfo imageInfo = (ImageInfo) obj;
                if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f51142a, false, 51627, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f51142a, false, 51627, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                    return;
                }
                if (StoryPictureViewHolder.this.q != null) {
                    StoryPictureViewHolder.this.q.setVisibility(8);
                }
            }
        });
        int type = storyPictureContent.getType();
        if (this.m.isSelf() || type == 2700) {
            this.i.setTag(50331648, 26);
        } else {
            this.i.setTag(50331648, 27);
        }
        this.i.setTag(67108864, this.m);
    }
}
