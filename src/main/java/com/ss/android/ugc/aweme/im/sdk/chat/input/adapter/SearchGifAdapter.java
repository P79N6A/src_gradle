package com.ss.android.ugc.aweme.im.sdk.chat.input.adapter;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.d;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.f;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.g;
import com.ss.android.ugc.aweme.im.sdk.utils.DiffCallback;
import com.ss.android.ugc.aweme.im.sdk.utils.az;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

public class SearchGifAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50335a;
    private static final int i = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 16.0f));

    /* renamed from: b  reason: collision with root package name */
    public int f50336b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f50337c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f50338d = true;

    /* renamed from: e  reason: collision with root package name */
    public int f50339e;

    /* renamed from: f  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a> f50340f = new ArrayList();
    public b g;
    public a h;

    class EmptyViewHolder extends RecyclerView.ViewHolder {
        EmptyViewHolder(View view) {
            super(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = view.getResources().getDisplayMetrics().widthPixels;
            view.setLayoutParams(layoutParams);
        }
    }

    class GifThumbHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        RemoteImageView f50344a;

        GifThumbHolder(View view) {
            super(view);
            this.f50344a = (RemoteImageView) view.findViewById(C0906R.id.b1i);
        }
    }

    public interface a {
        void a(int i);

        void a(com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b bVar);
    }

    public interface b {
        void a();
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50335a, false, 50643, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50335a, false, 50643, new Class[0], Void.TYPE);
            return;
        }
        this.f50339e = 0;
        this.f50340f.clear();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50335a, false, 50652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50335a, false, 50652, new Class[0], Void.TYPE);
            return;
        }
        if (this.f50340f.size() > 0) {
            this.f50340f.clear();
            notifyDataSetChanged();
        }
        this.f50337c = false;
        this.f50338d = true;
    }

    public int getItemCount() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f50335a, false, 50656, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50335a, false, 50656, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f50340f != null) {
            i2 = this.f50340f.size();
        }
        return i2;
    }

    public SearchGifAdapter(@Nonnull RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f50335a, false, 50640, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f50335a, false, 50640, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50341a;

                public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
                    if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f50341a, false, 50660, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f50341a, false, 50660, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    if (!SearchGifAdapter.this.f50337c && SearchGifAdapter.this.f50338d) {
                        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                            if (findLastVisibleItemPosition > SearchGifAdapter.this.f50339e) {
                                SearchGifAdapter.this.f50339e = findLastVisibleItemPosition;
                            }
                            int itemCount = linearLayoutManager.getItemCount();
                            int i3 = findLastVisibleItemPosition + 1;
                            if (itemCount > 0 && itemCount != i3 && itemCount - i3 <= 4 && SearchGifAdapter.this.g != null) {
                                SearchGifAdapter.this.g.a();
                                SearchGifAdapter.this.f50337c = true;
                            }
                        }
                    }
                }
            });
        }
    }

    public int getItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f50335a, false, 50657, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f50335a, false, 50657, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (TextUtils.equals(this.f50340f.get(i2).getClass().getCanonicalName(), com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a.class.getCanonicalName())) {
            return 220;
        } else {
            return 221;
        }
    }

    public void a(boolean z, int i2) {
        this.f50338d = z;
        this.f50336b = i2;
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f50335a, false, 50653, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f50335a, false, 50653, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        if (i2 == 221) {
            viewHolder = new GifThumbHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.v8, viewGroup, false));
        } else {
            viewHolder = new EmptyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.v9, viewGroup, false));
        }
        return viewHolder;
    }

    public void a(List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a> list, c cVar) {
        if (PatchProxy.isSupport(new Object[]{list, cVar}, this, f50335a, false, 50646, new Class[]{List.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, cVar}, this, f50335a, false, 50646, new Class[]{List.class, c.class}, Void.TYPE);
        } else if (cVar == null) {
            a(false, 0);
        } else {
            a(cVar.f50604b, cVar.f50605c);
            List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b> list2 = cVar.f50603a;
            if (list2 != null && !list2.isEmpty()) {
                int i2 = cVar.f50606d;
                for (com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b next : list2) {
                    if (next != null) {
                        next.f50602c = i2;
                        list.add(next);
                    }
                }
            }
        }
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i2) {
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f50335a, false, 50654, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f50335a, false, 50654, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder instanceof GifThumbHolder) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewHolder.itemView.getLayoutParams();
            if (i2 == 0) {
                i3 = i;
            }
            marginLayoutParams.setMargins(i3, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            GifThumbHolder gifThumbHolder = (GifThumbHolder) viewHolder;
            com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a aVar = this.f50340f.get(i2);
            if (aVar instanceof com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.b) {
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.b bVar = (com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.b) aVar;
                a(gifThumbHolder.f50344a, Integer.parseInt(bVar.f50597b), Integer.parseInt(bVar.f50598c));
                gifThumbHolder.f50344a.setOnClickListener(new a(this, viewHolder));
                int parseInt = Integer.parseInt(bVar.f50598c);
                int parseInt2 = Integer.parseInt(bVar.f50597b);
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(Collections.singletonList(bVar.f50596a));
                urlModel.setHeight(parseInt);
                urlModel.setWidth(parseInt2);
                az.a(gifThumbHolder.f50344a, urlModel, parseInt2, parseInt);
            } else if (aVar instanceof com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b) {
                com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b bVar2 = (com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.b) aVar;
                UrlModel urlModel2 = bVar2.f50600a;
                if (urlModel2 != null) {
                    a(gifThumbHolder.f50344a, urlModel2.getWidth(), urlModel2.getHeight());
                    gifThumbHolder.f50344a.setOnClickListener(new b(this, bVar2));
                    az.a(gifThumbHolder.f50344a, urlModel2, urlModel2.getWidth(), urlModel2.getHeight());
                }
            }
        }
    }

    public void a(List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a> list, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.c cVar) {
        if (PatchProxy.isSupport(new Object[]{list, cVar}, this, f50335a, false, 50650, new Class[]{List.class, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, cVar}, this, f50335a, false, 50650, new Class[]{List.class, com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.c.class}, Void.TYPE);
            return;
        }
        g gVar = cVar.f50620a;
        if (gVar != null) {
            List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b> list2 = gVar.f50625a;
            if (list2 != null && list2.size() > 0) {
                for (com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.b bVar : list2) {
                    d dVar = bVar.f50618b;
                    if (dVar != null) {
                        list.add(dVar.f50621a);
                    }
                }
            }
            f fVar = gVar.f50626b;
            if (fVar != null) {
                a(fVar.f50623a, fVar.f50624b);
                return;
            }
            a(false, 0);
        }
    }

    public void a(List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a> list, List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a> list2) {
        List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a> list3 = list;
        List<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.b.a> list4 = list2;
        if (PatchProxy.isSupport(new Object[]{list3, list4}, this, f50335a, false, 50649, new Class[]{List.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, list4}, this, f50335a, false, 50649, new Class[]{List.class, List.class}, Void.TYPE);
            return;
        }
        if (list.size() != list2.size()) {
            DiffUtil.calculateDiff(new DiffCallback(list4, list3)).dispatchUpdatesTo((RecyclerView.Adapter) this);
        }
    }

    private static int a(int i2, int i3, int i4) {
        if (i3 == 0 || i4 == 0) {
            return i2;
        }
        return (i2 * i3) / i4;
    }

    private void a(RemoteImageView remoteImageView, int i2, int i3) {
        RemoteImageView remoteImageView2 = remoteImageView;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f50335a, false, 50655, new Class[]{RemoteImageView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f50335a, false, 50655, new Class[]{RemoteImageView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = remoteImageView.getLayoutParams();
        layoutParams.width = a(layoutParams.height, i2, i3);
        remoteImageView2.setLayoutParams(layoutParams);
    }
}
