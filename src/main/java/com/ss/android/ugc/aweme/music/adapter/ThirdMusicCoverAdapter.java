package com.ss.android.ugc.aweme.music.adapter;

import android.graphics.drawable.Animatable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.ui.a.b;
import com.ss.android.ugc.aweme.views.WrapContentRemoteImageView;
import java.util.List;
import javax.annotation.Nullable;

public class ThirdMusicCoverAdapter extends BaseAdapter<ExternalMusicInfo> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56257a;

    /* renamed from: b  reason: collision with root package name */
    public a f56258b;

    class ThirdMusicCoverViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56259a;

        /* renamed from: b  reason: collision with root package name */
        View f56260b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f56261c;

        /* renamed from: d  reason: collision with root package name */
        public WrapContentRemoteImageView f56262d;

        /* renamed from: e  reason: collision with root package name */
        Animation f56263e;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f56259a, false, 59953, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f56259a, false, 59953, new Class[0], Void.TYPE);
                return;
            }
            if (this.f56261c != null) {
                this.f56261c.clearAnimation();
            }
            if (this.f56260b != null) {
                this.f56260b.setVisibility(8);
            }
        }

        ThirdMusicCoverViewHolder(View view) {
            super(view);
            this.f56262d = (WrapContentRemoteImageView) view.findViewById(C0906R.id.b60);
            this.f56260b = view.findViewById(C0906R.id.d2d);
            this.f56261c = (ImageView) view.findViewById(C0906R.id.d2c);
            this.f56263e = AnimationUtils.loadAnimation(view.getContext(), C0906R.anim.cf);
            this.f56262d.setOnClickListener(new g(this));
        }
    }

    public interface a {
        void a(int i);
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f56257a, false, 59950, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f56257a, false, 59950, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        return new ThirdMusicCoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a15, viewGroup2, false));
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f56257a, false, 59949, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f56257a, false, 59949, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ThirdMusicCoverViewHolder thirdMusicCoverViewHolder = (ThirdMusicCoverViewHolder) viewHolder;
        List list = this.mItems;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, thirdMusicCoverViewHolder, ThirdMusicCoverViewHolder.f56259a, false, 59951, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, thirdMusicCoverViewHolder, ThirdMusicCoverViewHolder.f56259a, false, 59951, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list) && i2 >= 0 && i2 < list.size()) {
            ExternalMusicInfo externalMusicInfo = (ExternalMusicInfo) list.get(i2);
            if (externalMusicInfo != null) {
                if (PatchProxy.isSupport(new Object[0], thirdMusicCoverViewHolder, ThirdMusicCoverViewHolder.f56259a, false, 59952, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], thirdMusicCoverViewHolder, ThirdMusicCoverViewHolder.f56259a, false, 59952, new Class[0], Void.TYPE);
                } else if (!(thirdMusicCoverViewHolder.f56260b == null || thirdMusicCoverViewHolder.f56261c == null)) {
                    thirdMusicCoverViewHolder.f56260b.setVisibility(0);
                    thirdMusicCoverViewHolder.f56261c.startAnimation(thirdMusicCoverViewHolder.f56263e);
                }
                if (!TextUtils.isEmpty(externalMusicInfo.getPartnerName())) {
                    List<String> a2 = b.f56658c.a(externalMusicInfo.getPartnerName());
                    if (!CollectionUtils.isEmpty(a2) && thirdMusicCoverViewHolder.f56262d != null) {
                        thirdMusicCoverViewHolder.f56262d.a(a2.get(0), null, new BaseControllerListener<ImageInfo>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f56265a;

                            public final void onFailure(String str, Throwable th) {
                                if (PatchProxy.isSupport(new Object[]{str, th}, this, f56265a, false, 59958, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str, th}, this, f56265a, false, 59958, new Class[]{String.class, Throwable.class}, Void.TYPE);
                                    return;
                                }
                                super.onFailure(str, th);
                                ThirdMusicCoverViewHolder.this.a();
                            }

                            public final void onIntermediateImageFailed(String str, Throwable th) {
                                if (PatchProxy.isSupport(new Object[]{str, th}, this, f56265a, false, 59957, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str, th}, this, f56265a, false, 59957, new Class[]{String.class, Throwable.class}, Void.TYPE);
                                    return;
                                }
                                super.onIntermediateImageFailed(str, th);
                                ThirdMusicCoverViewHolder.this.a();
                            }

                            public final /* synthetic */ void onIntermediateImageSet(String str, @Nullable Object obj) {
                                ImageInfo imageInfo = (ImageInfo) obj;
                                if (PatchProxy.isSupport(new Object[]{str, imageInfo}, this, f56265a, false, 59956, new Class[]{String.class, ImageInfo.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str, imageInfo}, this, f56265a, false, 59956, new Class[]{String.class, ImageInfo.class}, Void.TYPE);
                                    return;
                                }
                                ThirdMusicCoverViewHolder.this.a();
                                ThirdMusicCoverViewHolder.this.f56262d.a(imageInfo);
                            }

                            public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                                ImageInfo imageInfo = (ImageInfo) obj;
                                if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f56265a, false, 59955, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f56265a, false, 59955, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                                    return;
                                }
                                ThirdMusicCoverViewHolder.this.a();
                                ThirdMusicCoverViewHolder.this.f56262d.a(imageInfo);
                            }
                        });
                    }
                }
            }
        }
    }
}
