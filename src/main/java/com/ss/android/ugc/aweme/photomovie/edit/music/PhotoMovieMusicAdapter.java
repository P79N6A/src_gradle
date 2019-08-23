package com.ss.android.ugc.aweme.photomovie.edit.music;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.b.a;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.aweme.views.CircleDraweeView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

public class PhotoMovieMusicAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58935a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f58936b;

    /* renamed from: c  reason: collision with root package name */
    public CopyOnWriteArrayList<MusicWrapper> f58937c;

    /* renamed from: d  reason: collision with root package name */
    public a f58938d;

    class MusicDotViewHolder extends RecyclerView.ViewHolder {
        MusicDotViewHolder(View view) {
            super(view);
            view.findViewById(C0906R.id.aw9).setOnClickListener(new View.OnClickListener(PhotoMovieMusicAdapter.this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58940a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f58940a, false, 64106, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f58940a, false, 64106, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (PhotoMovieMusicAdapter.this.f58938d != null) {
                        PhotoMovieMusicAdapter.this.f58938d.a(null, null);
                    }
                }
            });
        }
    }

    class MusicNormalViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58943a;

        /* renamed from: b  reason: collision with root package name */
        AVDmtImageTextView f58944b;

        /* renamed from: c  reason: collision with root package name */
        public int f58945c;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f58943a, false, 64108, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58943a, false, 64108, new Class[0], Void.TYPE);
                return;
            }
            PhotoMovieMusicAdapter.this.notifyDataSetChanged();
            if (PhotoMovieMusicAdapter.this.f58938d != null) {
                PhotoMovieMusicAdapter.this.f58938d.a(PhotoMovieMusicAdapter.this.f58937c.get(PhotoMovieMusicAdapter.this.f58936b).f58932d, PhotoMovieMusicAdapter.this.f58937c.get(PhotoMovieMusicAdapter.this.f58936b).f58930b);
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f58943a, false, 64110, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58943a, false, 64110, new Class[0], Void.TYPE);
                return;
            }
            switch (PhotoMovieMusicAdapter.this.f58937c.get(this.f58945c).f58933e) {
                case 0:
                    this.f58944b.b(true);
                    return;
                case 1:
                    this.f58944b.b(false);
                    break;
                case 2:
                    this.f58944b.b(false);
                    return;
            }
        }

        MusicNormalViewHolder(View view) {
            super(view);
            this.f58944b = (AVDmtImageTextView) view.findViewById(C0906R.id.aw9);
        }
    }

    public interface a {
        void a(@NonNull e eVar, @NonNull String str);
    }

    public int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f58935a, false, 64105, new Class[0], Integer.TYPE)) {
            return this.f58937c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f58935a, false, 64105, new Class[0], Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58935a, false, 64100, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58935a, false, 64100, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f58937c.size() > i) {
            this.f58937c.get(i).f58933e = 1;
            this.f58937c.get(this.f58936b).f58934f = false;
            this.f58937c.get(i).f58934f = true;
            this.f58936b = i;
            notifyDataSetChanged();
        }
    }

    PhotoMovieMusicAdapter(List<e> list, e eVar) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f58935a, false, 64101, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f58935a, false, 64101, new Class[]{List.class}, Void.TYPE);
        } else {
            this.f58937c = new CopyOnWriteArrayList<>();
            this.f58937c.add(new MusicWrapper(new e()));
            for (e musicWrapper : list) {
                this.f58937c.add(new MusicWrapper(musicWrapper));
            }
        }
        this.f58936b = a(this.f58937c, eVar);
    }

    private int a(List<MusicWrapper> list, e eVar) {
        List<MusicWrapper> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, eVar}, this, f58935a, false, 64102, new Class[]{List.class, e.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list2, eVar}, this, f58935a, false, 64102, new Class[]{List.class, e.class}, Integer.TYPE)).intValue();
        }
        for (int i = 1; i < list.size(); i++) {
            MusicWrapper musicWrapper = list2.get(i);
            if (musicWrapper.f58932d.getMusicName().equals(eVar.getMusicName())) {
                musicWrapper.f58934f = true;
                return i;
            }
        }
        return 0;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f58935a, false, 64103, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f58935a, false, 64103, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 1) {
            return new MusicDotViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aeb, viewGroup, false));
        } else {
            return new MusicNormalViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aea, viewGroup, false));
        }
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f58935a, false, 64104, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f58935a, false, 64104, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getItemViewType(i2) == 2) {
            MusicNormalViewHolder musicNormalViewHolder = (MusicNormalViewHolder) viewHolder;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, musicNormalViewHolder, MusicNormalViewHolder.f58943a, false, 64107, new Class[]{Integer.TYPE}, Void.TYPE)) {
                MusicNormalViewHolder musicNormalViewHolder2 = musicNormalViewHolder;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, musicNormalViewHolder2, MusicNormalViewHolder.f58943a, false, 64107, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            musicNormalViewHolder.f58945c = i2;
            if (PatchProxy.isSupport(new Object[0], musicNormalViewHolder, MusicNormalViewHolder.f58943a, false, 64109, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], musicNormalViewHolder, MusicNormalViewHolder.f58943a, false, 64109, new Class[0], Void.TYPE);
            } else if (musicNormalViewHolder.f58944b != null) {
                musicNormalViewHolder.b();
                musicNormalViewHolder.f58944b.a(PhotoMovieMusicAdapter.this.f58937c.get(musicNormalViewHolder.f58945c).f58934f);
            }
            musicNormalViewHolder.f58944b.setOnClickListener(new View.OnClickListener(i2) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58947a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f58948b;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f58947a, false, 64112, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f58947a, false, 64112, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (PhotoMovieMusicAdapter.this.f58936b != this.f58948b) {
                        if (PhotoMovieMusicAdapter.this.f58937c.get(MusicNormalViewHolder.this.f58945c).f58933e == 1) {
                            PhotoMovieMusicAdapter.this.f58937c.get(PhotoMovieMusicAdapter.this.f58936b).f58934f = false;
                            PhotoMovieMusicAdapter.this.f58937c.get(MusicNormalViewHolder.this.f58945c).f58934f = true;
                            PhotoMovieMusicAdapter.this.f58936b = MusicNormalViewHolder.this.f58945c;
                            MusicNormalViewHolder.this.a();
                        } else if (PhotoMovieMusicAdapter.this.f58937c.get(MusicNormalViewHolder.this.f58945c).f58933e != 0) {
                            String str = PhotoMovieMusicAdapter.this.f58937c.get(MusicNormalViewHolder.this.f58945c).f58931c;
                            if (!TextUtils.isEmpty(str)) {
                                PhotoMovieMusicAdapter.this.f58937c.get(MusicNormalViewHolder.this.f58945c).f58933e = 0;
                                MusicNormalViewHolder.this.b();
                                com.ss.android.ugc.a.e a2 = new e.a().a(str).b(PhotoMovieMusicAdapter.this.f58937c.get(MusicNormalViewHolder.this.f58945c).f58930b).a();
                                MusicNormalViewHolder musicNormalViewHolder = MusicNormalViewHolder.this;
                                int i = MusicNormalViewHolder.this.f58945c;
                                if (PatchProxy.isSupport(new Object[]{a2, Integer.valueOf(i)}, musicNormalViewHolder, MusicNormalViewHolder.f58943a, false, 64111, new Class[]{com.ss.android.ugc.a.e.class, Integer.TYPE}, Void.TYPE)) {
                                    MusicNormalViewHolder musicNormalViewHolder2 = musicNormalViewHolder;
                                    PatchProxy.accessDispatch(new Object[]{a2, Integer.valueOf(i)}, musicNormalViewHolder2, MusicNormalViewHolder.f58943a, false, 64111, new Class[]{com.ss.android.ugc.a.e.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                com.ss.android.ugc.aweme.common.b.a.a(a2.f31527b, PhotoMovieMusicAdapter.this.f58937c.get(i).f58930b, new a.C0521a(i) {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f58950a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ int f58951b;

                                    public final void a(String str, int i) {
                                    }

                                    public final void a(String str) {
                                        if (PatchProxy.isSupport(new Object[]{str}, this, f58950a, false, 64113, new Class[]{String.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{str}, this, f58950a, false, 64113, new Class[]{String.class}, Void.TYPE);
                                            return;
                                        }
                                        PhotoMovieMusicAdapter.this.f58937c.get(this.f58951b).f58933e = 1;
                                        PhotoMovieMusicAdapter.this.f58937c.get(PhotoMovieMusicAdapter.this.f58936b).f58934f = false;
                                        PhotoMovieMusicAdapter.this.f58937c.get(this.f58951b).f58934f = true;
                                        PhotoMovieMusicAdapter.this.f58936b = this.f58951b;
                                        com.ss.android.b.a.a.a.b(new Runnable() {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f58953a;

                                            public final void run() {
                                                if (PatchProxy.isSupport(new Object[0], this, f58953a, false, 64115, new Class[0], Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[0], this, f58953a, false, 64115, new Class[0], Void.TYPE);
                                                    return;
                                                }
                                                MusicNormalViewHolder.this.a();
                                            }
                                        });
                                    }

                                    {
                                        this.f58951b = r2;
                                    }

                                    public final void a(String str, Exception exc) {
                                        if (PatchProxy.isSupport(new Object[]{str, exc}, this, f58950a, false, 64114, new Class[]{String.class, Exception.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{str, exc}, this, f58950a, false, 64114, new Class[]{String.class, Exception.class}, Void.TYPE);
                                            return;
                                        }
                                        PhotoMovieMusicAdapter.this.f58937c.get(this.f58951b).f58933e = 2;
                                        com.ss.android.b.a.a.a.b(new Runnable() {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f58955a;

                                            public final void run() {
                                                if (PatchProxy.isSupport(new Object[0], this, f58955a, false, 64116, new Class[0], Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[0], this, f58955a, false, 64116, new Class[0], Void.TYPE);
                                                    return;
                                                }
                                                PhotoMovieMusicAdapter.this.notifyDataSetChanged();
                                            }
                                        });
                                    }
                                });
                            }
                        }
                    }
                }

                {
                    this.f58948b = r2;
                }
            });
            AVDmtImageTextView aVDmtImageTextView = musicNormalViewHolder.f58944b;
            UrlModel coverMedium = PhotoMovieMusicAdapter.this.f58937c.get(musicNormalViewHolder.f58945c).f58932d.getCoverMedium();
            if (PatchProxy.isSupport(new Object[]{coverMedium}, aVDmtImageTextView, AVDmtImageTextView.f74552a, false, 86771, new Class[]{UrlModel.class}, Void.TYPE)) {
                AVDmtImageTextView aVDmtImageTextView2 = aVDmtImageTextView;
                PatchProxy.accessDispatch(new Object[]{coverMedium}, aVDmtImageTextView2, AVDmtImageTextView.f74552a, false, 86771, new Class[]{UrlModel.class}, Void.TYPE);
            } else if (coverMedium != null) {
                StickerImageView stickerImageView = aVDmtImageTextView.f74554b;
                if (stickerImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageView");
                }
                if (PatchProxy.isSupport(new Object[]{coverMedium}, stickerImageView, StickerImageView.f69223a, false, 78681, new Class[]{UrlModel.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{coverMedium}, stickerImageView, StickerImageView.f69223a, false, 78681, new Class[]{UrlModel.class}, Void.TYPE);
                    return;
                }
                CircleDraweeView circleDraweeView = stickerImageView.f69224b;
                if (circleDraweeView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("iconImageView");
                }
                c.b(circleDraweeView, coverMedium);
            }
        }
    }
}
