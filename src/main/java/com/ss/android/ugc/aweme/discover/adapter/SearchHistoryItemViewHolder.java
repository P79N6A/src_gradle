package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.discover.ui.ak;

public class SearchHistoryItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41802a;

    /* renamed from: b  reason: collision with root package name */
    SearchHistory f41803b;

    /* renamed from: c  reason: collision with root package name */
    public ak.c f41804c;
    @BindView(2131497858)
    TextView mContentView;
    @BindView(2131495003)
    View mDeleteView;

    private SearchHistoryItemViewHolder(View view, ak.c cVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f41804c = cVar;
        this.mDeleteView.setOnTouchListener(new ai() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41805a;

            public final void b(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f41805a, false, 35795, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f41805a, false, 35795, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                    return;
                }
                if (SearchHistoryItemViewHolder.this.f41804c != null) {
                    SearchHistoryItemViewHolder.this.f41804c.b(SearchHistoryItemViewHolder.this.f41803b, SearchHistoryItemViewHolder.this.getAdapterPosition());
                }
            }
        });
    }

    public static SearchHistoryItemViewHolder a(ViewGroup viewGroup, ak.c cVar) {
        ViewGroup viewGroup2 = viewGroup;
        ak.c cVar2 = cVar;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, cVar2}, null, f41802a, true, 35794, new Class[]{ViewGroup.class, ak.c.class}, SearchHistoryItemViewHolder.class)) {
            return new SearchHistoryItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a04, viewGroup2, false), cVar2);
        }
        return (SearchHistoryItemViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, cVar2}, null, f41802a, true, 35794, new Class[]{ViewGroup.class, ak.c.class}, SearchHistoryItemViewHolder.class);
    }

    public final void a(final SearchHistory searchHistory, final int i) {
        if (PatchProxy.isSupport(new Object[]{searchHistory, Integer.valueOf(i)}, this, f41802a, false, 35793, new Class[]{SearchHistory.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchHistory, Integer.valueOf(i)}, this, f41802a, false, 35793, new Class[]{SearchHistory.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mContentView.setText(searchHistory.keyword);
        this.itemView.setOnTouchListener(new ai() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41807a;

            public final void b(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f41807a, false, 35796, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f41807a, false, 35796, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                    return;
                }
                if (SearchHistoryItemViewHolder.this.f41804c != null) {
                    SearchHistoryItemViewHolder.this.f41804c.a(searchHistory, i);
                }
            }
        });
        this.f41803b = searchHistory;
    }
}
