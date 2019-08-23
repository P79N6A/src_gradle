package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.delegate.a.e;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.discover.ui.ak;

public class SearchHistoryLastItemHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41813a;

    /* renamed from: b  reason: collision with root package name */
    public long f41814b;

    /* renamed from: c  reason: collision with root package name */
    public ak.c f41815c;

    /* renamed from: d  reason: collision with root package name */
    public e.b f41816d;
    @BindView(2131498116)
    DmtTextView mTipView;

    public final void a(e.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f41813a, false, 35798, new Class[]{e.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f41813a, false, 35798, new Class[]{e.b.class}, Void.TYPE);
            return;
        }
        this.f41816d = bVar;
        switch (bVar) {
            case TYPE_NONE:
                this.itemView.setVisibility(8);
                return;
            case TYPE_SHOW_MORE:
                this.mTipView.setVisibility(0);
                this.mTipView.setText(this.itemView.getResources().getString(C0906R.string.ef));
                return;
            case TYPE_CLEAR_ALL:
                this.mTipView.setVisibility(0);
                this.mTipView.setText(this.itemView.getResources().getString(C0906R.string.te));
                return;
            default:
                this.itemView.setVisibility(8);
                return;
        }
    }

    private SearchHistoryLastItemHolder(View view, ak.c cVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f41815c = cVar;
        view.setOnTouchListener(new ai() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41817a;

            public final void b(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f41817a, false, 35800, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f41817a, false, 35800, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                } else if (System.currentTimeMillis() - SearchHistoryLastItemHolder.this.f41814b >= 500) {
                    SearchHistoryLastItemHolder.this.f41814b = System.currentTimeMillis();
                    if (SearchHistoryLastItemHolder.this.f41815c != null) {
                        if (SearchHistoryLastItemHolder.this.f41816d == e.b.TYPE_SHOW_MORE) {
                            SearchHistoryLastItemHolder.this.f41815c.f();
                            return;
                        }
                        if (SearchHistoryLastItemHolder.this.f41816d == e.b.TYPE_CLEAR_ALL) {
                            SearchHistoryLastItemHolder.this.f41815c.g();
                        }
                    }
                }
            }
        });
    }

    public static SearchHistoryLastItemHolder a(ViewGroup viewGroup, ak.c cVar) {
        ViewGroup viewGroup2 = viewGroup;
        ak.c cVar2 = cVar;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, cVar2}, null, f41813a, true, 35799, new Class[]{ViewGroup.class, ak.c.class}, SearchHistoryLastItemHolder.class)) {
            return new SearchHistoryLastItemHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a03, viewGroup2, false), cVar2);
        }
        return (SearchHistoryLastItemHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, cVar2}, null, f41813a, true, 35799, new Class[]{ViewGroup.class, ak.c.class}, SearchHistoryLastItemHolder.class);
    }
}
