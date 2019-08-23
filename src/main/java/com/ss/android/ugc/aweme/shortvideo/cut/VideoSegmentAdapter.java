package com.ss.android.ugc.aweme.shortvideo.cut;

import android.graphics.Rect;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.shortvideo.cut.model.f;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

public class VideoSegmentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements aj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66326a;

    /* renamed from: b  reason: collision with root package name */
    public List<au> f66327b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f66328c = 0;

    /* renamed from: d  reason: collision with root package name */
    public a f66329d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f66330e = true;

    /* renamed from: f  reason: collision with root package name */
    private VideoEditViewModel f66331f;
    private CutMultiVideoViewModel g;

    class VideoSegmentViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66332a;

        /* renamed from: b  reason: collision with root package name */
        RemoteImageView f66333b = ((RemoteImageView) this.itemView.findViewById(C0906R.id.drv));

        /* renamed from: c  reason: collision with root package name */
        RelativeLayout f66334c = ((RelativeLayout) this.itemView.findViewById(C0906R.id.ci4));

        /* renamed from: d  reason: collision with root package name */
        TextView f66335d;

        VideoSegmentViewHolder(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a19, viewGroup, false));
            ak.a((View) this.f66333b);
            this.f66335d = (TextView) this.itemView.findViewById(C0906R.id.cmu);
        }
    }

    public interface a {
        void a(View view, int i, String str);
    }

    public final void a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f66326a, false, 75787, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f66326a, false, 75787, new Class[]{h.class}, Void.TYPE);
            return;
        }
        for (int i = 0; i < this.f66327b.size(); i++) {
            if (this.f66327b.get(i).f66396b.f66495b.equals(hVar.f66495b)) {
                this.f66327b.get(i).f66396b = hVar;
                notifyItemChanged(i);
                return;
            }
        }
    }

    public final void a(@NotNull RecyclerView.ViewHolder viewHolder, boolean z) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f66326a, false, 75790, new Class[]{RecyclerView.ViewHolder.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Byte.valueOf(z)}, this, f66326a, false, 75790, new Class[]{RecyclerView.ViewHolder.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof VideoSegmentViewHolder) {
            VideoSegmentViewHolder videoSegmentViewHolder = (VideoSegmentViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], videoSegmentViewHolder, VideoSegmentViewHolder.f66332a, false, 75795, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], videoSegmentViewHolder, VideoSegmentViewHolder.f66332a, false, 75795, new Class[0], Void.TYPE);
            } else if (videoSegmentViewHolder.f66334c != null) {
                videoSegmentViewHolder.f66334c.setScaleY(1.0f);
                videoSegmentViewHolder.f66334c.setScaleX(1.0f);
            }
            f fVar = new f(2, -1, viewHolder.getAdapterPosition());
            fVar.f66490b = z;
            this.g.a(fVar);
        }
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f66326a, false, 75782, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66326a, false, 75782, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f66327b == null) {
            return 0;
        } else {
            return this.f66327b.size();
        }
    }

    private void a(List<h> list) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{list}, this, f66326a, false, 75780, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f66326a, false, 75780, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f66327b.clear();
        while (i < list.size()) {
            int i2 = i + 1;
            this.f66327b.add(new au(i2, list.get(i)));
            i = i2;
        }
    }

    public final void b(h hVar) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f66326a, false, 75788, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f66326a, false, 75788, new Class[]{h.class}, Void.TYPE);
            return;
        }
        while (true) {
            if (i >= this.f66327b.size()) {
                break;
            } else if (this.f66327b.get(i).f66396b.f66495b.equals(hVar.f66495b)) {
                this.f66327b.remove(i);
                break;
            } else {
                i++;
            }
        }
        notifyDataSetChanged();
    }

    public long getItemId(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66326a, false, 75781, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return (long) this.f66327b.get(i).f66395a;
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66326a, false, 75781, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
    }

    @NotNull
    public final ViewPropertyAnimator a(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (!PatchProxy.isSupport(new Object[]{viewHolder2}, this, f66326a, false, 75792, new Class[]{RecyclerView.ViewHolder.class}, ViewPropertyAnimator.class)) {
            return viewHolder2.itemView.animate().scaleX(1.0f).scaleY(1.0f);
        }
        return (ViewPropertyAnimator) PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f66326a, false, 75792, new Class[]{RecyclerView.ViewHolder.class}, ViewPropertyAnimator.class);
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f66326a, false, 75778, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new VideoSegmentViewHolder(viewGroup2);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f66326a, false, 75778, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public final int a(RecyclerView recyclerView, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f66326a, false, 75785, new Class[]{RecyclerView.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f66326a, false, 75785, new Class[]{RecyclerView.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Pair<Integer, Integer> a2 = com.ss.android.ugc.aweme.imported.f.a(recyclerView);
        if (i2 >= ((Integer) a2.first).intValue() && i2 <= ((Integer) a2.second).intValue() && i2 < getItemCount() && i2 >= 0) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition != null) {
                int[] iArr = new int[2];
                findViewHolderForAdapterPosition.itemView.getLocationOnScreen(iArr);
                return iArr[0] + u.a(23.5d);
            }
        }
        return -1;
    }

    public final Rect b(RecyclerView recyclerView, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f66326a, false, 75786, new Class[]{RecyclerView.class, Integer.TYPE}, Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f66326a, false, 75786, new Class[]{RecyclerView.class, Integer.TYPE}, Rect.class);
        }
        Pair<Integer, Integer> a2 = com.ss.android.ugc.aweme.imported.f.a(recyclerView);
        if (i2 >= ((Integer) a2.first).intValue() && i2 <= ((Integer) a2.second).intValue() && i2 < getItemCount() && i2 >= 0) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (!(findViewHolderForAdapterPosition == null || findViewHolderForAdapterPosition.itemView == null)) {
                int[] iArr = new int[2];
                findViewHolderForAdapterPosition.itemView.getLocationInWindow(iArr);
                return new Rect(iArr[0], iArr[1], iArr[0] + findViewHolderForAdapterPosition.itemView.getWidth(), iArr[1] + findViewHolderForAdapterPosition.itemView.getHeight());
            }
        }
        return null;
    }

    public final void a(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f66326a, false, 75789, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f66326a, false, 75789, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof VideoSegmentViewHolder) {
            VideoSegmentViewHolder videoSegmentViewHolder = (VideoSegmentViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], videoSegmentViewHolder, VideoSegmentViewHolder.f66332a, false, 75794, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], videoSegmentViewHolder, VideoSegmentViewHolder.f66332a, false, 75794, new Class[0], Void.TYPE);
            } else if (videoSegmentViewHolder.f66334c != null) {
                videoSegmentViewHolder.f66334c.setScaleX(1.25f);
                videoSegmentViewHolder.f66334c.setScaleY(1.25f);
            }
            this.g.a(new f(0, viewHolder.getAdapterPosition(), -1));
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        au auVar;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f66326a, false, 75779, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f66326a, false, 75779, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof VideoSegmentViewHolder) {
            VideoSegmentViewHolder videoSegmentViewHolder = (VideoSegmentViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66326a, false, 75783, new Class[]{Integer.TYPE}, au.class)) {
                int i2 = i;
                auVar = (au) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66326a, false, 75783, new Class[]{Integer.TYPE}, au.class);
            } else {
                auVar = this.f66327b.get(i);
            }
            if (PatchProxy.isSupport(new Object[]{auVar, Integer.valueOf(i), videoSegmentViewHolder}, videoSegmentViewHolder, VideoSegmentViewHolder.f66332a, false, 75793, new Class[]{au.class, Integer.TYPE, VideoSegmentViewHolder.class}, Void.TYPE)) {
                VideoSegmentViewHolder videoSegmentViewHolder2 = videoSegmentViewHolder;
                PatchProxy.accessDispatch(new Object[]{auVar, Integer.valueOf(i), videoSegmentViewHolder}, videoSegmentViewHolder2, VideoSegmentViewHolder.f66332a, false, 75793, new Class[]{au.class, Integer.TYPE, VideoSegmentViewHolder.class}, Void.TYPE);
                return;
            }
            String str = auVar.f66396b.f66495b;
            if (PatchProxy.isSupport(new Object[]{videoSegmentViewHolder, str}, videoSegmentViewHolder, VideoSegmentViewHolder.f66332a, false, 75797, new Class[]{VideoSegmentViewHolder.class, String.class}, Void.TYPE)) {
                VideoSegmentViewHolder videoSegmentViewHolder3 = videoSegmentViewHolder;
                PatchProxy.accessDispatch(new Object[]{videoSegmentViewHolder, str}, videoSegmentViewHolder3, VideoSegmentViewHolder.f66332a, false, 75797, new Class[]{VideoSegmentViewHolder.class, String.class}, Void.TYPE);
            } else {
                videoSegmentViewHolder.f66333b.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(videoSegmentViewHolder.f66333b.getController())).setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse("file://" + str)).setResizeOptions(new ResizeOptions(u.a(48.0d), u.a(48.0d))).build())).build());
            }
            videoSegmentViewHolder.f66335d.setText(String.format(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) (auVar.f66396b.f66498e - auVar.f66396b.f66497d)) / (auVar.f66396b.f66499f * 1000.0f))}) + NotifyType.SOUND);
            videoSegmentViewHolder.f66335d.setShadowLayer(6.0f, 0.0f, 4.0f, videoSegmentViewHolder.itemView.getContext().getResources().getColor(C0906R.color.a2d));
            if (PatchProxy.isSupport(new Object[]{videoSegmentViewHolder}, videoSegmentViewHolder, VideoSegmentViewHolder.f66332a, false, 75796, new Class[]{VideoSegmentViewHolder.class}, Void.TYPE)) {
                VideoSegmentViewHolder videoSegmentViewHolder4 = videoSegmentViewHolder;
                PatchProxy.accessDispatch(new Object[]{videoSegmentViewHolder}, videoSegmentViewHolder4, VideoSegmentViewHolder.f66332a, false, 75796, new Class[]{VideoSegmentViewHolder.class}, Void.TYPE);
                return;
            }
            videoSegmentViewHolder.itemView.setOnClickListener(new at(videoSegmentViewHolder, videoSegmentViewHolder));
        }
    }

    public final void a(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, viewHolder2}, this, f66326a, false, 75791, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, viewHolder2}, this, f66326a, false, 75791, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (adapterPosition < this.f66327b.size() && adapterPosition2 < this.f66327b.size()) {
            int a2 = this.f66331f.a(this.f66327b.get(adapterPosition).f66396b.f66495b);
            int a3 = this.f66331f.a(this.f66327b.get(adapterPosition2).f66396b.f66495b);
            if (!(a2 == -1 || a3 == -1)) {
                Collections.swap(this.f66327b, adapterPosition, adapterPosition2);
                Collections.swap(this.f66331f.c(), a2, a3);
                notifyItemMoved(adapterPosition, adapterPosition2);
                this.g.a(new f(1, a2, a3));
            }
        }
    }

    public VideoSegmentAdapter(@NonNull VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<h> list) {
        this.f66331f = videoEditViewModel;
        this.g = cutMultiVideoViewModel;
        a(list);
        setHasStableIds(true);
    }
}
