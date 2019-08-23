package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.music.adapter.d;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.List;

public class MusicClassViewHolder extends ItemWidgetViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f36085c;

    /* renamed from: d  reason: collision with root package name */
    public d f36086d;

    /* renamed from: e  reason: collision with root package name */
    public c f36087e;
    @BindView(2131496867)
    RecyclerView mRvClassContainer;
    @BindView(2131498197)
    TextView mTvTitleLeft;
    @BindView(2131498200)
    TextView mTvTitleRight;

    public MusicClassViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.mTvTitleLeft.setText(view.getContext().getText(C0906R.string.bex));
        final int dip2Px = (int) UIUtils.dip2Px(view.getContext(), 16.0f);
        this.mRvClassContainer.addItemDecoration(new RecyclerView.ItemDecoration() {
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                rect.bottom = dip2Px;
            }
        });
        this.mTvTitleRight.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36090a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f36090a, false, 26896, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f36090a, false, 26896, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (MusicClassViewHolder.this.f36086d != null) {
                    MusicClassViewHolder.this.f36086d.a(null, view, null);
                }
            }
        });
        this.mRvClassContainer.setLayoutManager(new WrapGridLayoutManager(view.getContext(), 2));
    }

    public final void a(final List<MusicCollectionItem> list, final int i) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f36085c, false, 26895, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f36085c, false, 26895, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mRvClassContainer.setAdapter(new RecyclerView.Adapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36092a;

            public int getItemCount() {
                if (PatchProxy.isSupport(new Object[0], this, f36092a, false, 26899, new Class[0], Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f36092a, false, 26899, new Class[0], Integer.TYPE)).intValue();
                } else if (list == null) {
                    return 0;
                } else {
                    return list.size();
                }
            }

            @NonNull
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
                if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f36092a, false, 26897, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
                    return new MusicClassItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.xs, viewGroup, false), i, MusicClassViewHolder.this.f36087e);
                }
                return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f36092a, false, 26897, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
            }

            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
                if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f36092a, false, 26898, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f36092a, false, 26898, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                MusicClassItemViewHolder musicClassItemViewHolder = (MusicClassItemViewHolder) viewHolder;
                MusicCollectionItem musicCollectionItem = (MusicCollectionItem) list.get(i);
                if (PatchProxy.isSupport(new Object[]{musicCollectionItem}, musicClassItemViewHolder, MusicClassItemViewHolder.f36079a, false, 26892, new Class[]{MusicCollectionItem.class}, Void.TYPE)) {
                    MusicClassItemViewHolder musicClassItemViewHolder2 = musicClassItemViewHolder;
                    PatchProxy.accessDispatch(new Object[]{musicCollectionItem}, musicClassItemViewHolder2, MusicClassItemViewHolder.f36079a, false, 26892, new Class[]{MusicCollectionItem.class}, Void.TYPE);
                    return;
                }
                musicClassItemViewHolder.f36080b = musicCollectionItem;
                if (musicClassItemViewHolder.f36080b != null) {
                    musicClassItemViewHolder.mTvClassName.setText(musicClassItemViewHolder.f36080b.mcName);
                    com.ss.android.ugc.aweme.base.c.b(musicClassItemViewHolder.mIvClassCover, musicClassItemViewHolder.f36080b.awemeCover);
                }
            }
        });
    }
}
