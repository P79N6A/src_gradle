package com.ss.android.ugc.aweme.profile.ui.widget;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolder;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecommendUserAdapter extends BaseAdapter<User> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63074a;

    /* renamed from: b  reason: collision with root package name */
    public int f63075b;

    /* renamed from: c  reason: collision with root package name */
    public b f63076c;

    /* renamed from: d  reason: collision with root package name */
    public a f63077d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.common.d.b f63078e;

    /* renamed from: f  reason: collision with root package name */
    public String f63079f;
    public int g;
    public Map<String, Integer> h = new HashMap();
    public RecommendUserCardViewHolder.b i;
    private RecommendUserCardViewHolder.a j = new RecommendUserCardViewHolder.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63082a;

        public final void a(User user, int i) {
            if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f63082a, false, 69820, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f63082a, false, 69820, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            } else if (i >= 0 && i < RecommendUserAdapter.this.mItems.size()) {
                RecommendUserAdapter.this.mItems.remove(i);
                RecommendUserAdapter.this.notifyItemRemoved(i);
                if (RecommendUserAdapter.this.f63076c != null) {
                    RecommendUserAdapter.this.f63076c.a(user, i);
                    if (RecommendUserAdapter.this.mItems.isEmpty()) {
                        RecommendUserAdapter.this.f63076c.b(user, i);
                    }
                }
                if (i != RecommendUserAdapter.this.mItems.size()) {
                    RecommendUserAdapter recommendUserAdapter = RecommendUserAdapter.this;
                    recommendUserAdapter.notifyItemRangeChanged(i, recommendUserAdapter.mItems.size() - i);
                }
                if (RecommendUserAdapter.this.mShowFooter) {
                    if (RecommendUserAdapter.this.mItems.size() <= 10) {
                        RecommendUserAdapter.this.setShowFooter(false);
                    } else {
                        RecommendUserAdapter.this.setShowFooter(true);
                    }
                }
            }
        }
    };

    public interface a {
        void a();
    }

    public interface b {
        void a(User user, int i);

        void b(User user, int i);

        void c(User user, int i);

        void d(User user, int i);
    }

    public void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder) {
    }

    public List<User> getData() {
        return this.mItems;
    }

    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f63074a, false, 69814, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f63074a, false, 69814, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zj, viewGroup2, false);
        inflate.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63080a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f63080a, false, 69819, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f63080a, false, 69819, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (RecommendUserAdapter.this.f63077d != null) {
                    RecommendUserAdapter.this.f63077d.a();
                }
            }
        });
        return new EnterMoreViewHolder(inflate);
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f63074a, false, 69815, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f63074a, false, 69815, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof RecommendUserCardViewHolder) && this.f63078e != null) {
            this.f63078e.a(viewHolder);
        }
    }

    public void setData(List<User> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f63074a, false, 69816, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f63074a, false, 69816, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.mItems = list;
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            this.h.put(((User) this.mItems.get(i2)).getUid(), Integer.valueOf(i2));
        }
        notifyDataSetChanged();
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f63074a, false, 69813, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new RecommendUserCardViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zi, viewGroup2, false), this.g);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f63074a, false, 69813, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        User user;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f63074a, false, 69812, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f63074a, false, 69812, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        RecommendUserCardViewHolder recommendUserCardViewHolder = (RecommendUserCardViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f63074a, false, 69818, new Class[]{Integer.TYPE}, User.class)) {
            user = (User) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f63074a, false, 69818, new Class[]{Integer.TYPE}, User.class);
        } else if (this.mItems == null || i3 < 0 || i3 >= this.mItems.size()) {
            user = null;
        } else {
            user = (User) this.mItems.get(i3);
        }
        RecommendUserCardViewHolder.a aVar = this.j;
        RecommendUserCardViewHolder.b bVar = this.i;
        b bVar2 = this.f63076c;
        int i4 = this.f63075b;
        String str = this.f63079f;
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i2), aVar, bVar, bVar2, Integer.valueOf(i4), str}, recommendUserCardViewHolder, RecommendUserCardViewHolder.f63084a, false, 69821, new Class[]{User.class, Integer.TYPE, RecommendUserCardViewHolder.a.class, RecommendUserCardViewHolder.b.class, b.class, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {user, Integer.valueOf(i2), aVar, bVar, bVar2, Integer.valueOf(i4), str};
            ChangeQuickRedirect changeQuickRedirect = RecommendUserCardViewHolder.f63084a;
            RecommendUserCardViewHolder recommendUserCardViewHolder2 = recommendUserCardViewHolder;
            PatchProxy.accessDispatch(objArr, recommendUserCardViewHolder2, changeQuickRedirect, false, 69821, new Class[]{User.class, Integer.TYPE, RecommendUserCardViewHolder.a.class, RecommendUserCardViewHolder.b.class, b.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        RecommendUserCardViewHolder recommendUserCardViewHolder3 = recommendUserCardViewHolder;
        if (user != null) {
            recommendUserCardViewHolder3.i = bVar2;
            recommendUserCardViewHolder3.f63087d = user;
            recommendUserCardViewHolder3.f63089f = aVar;
            recommendUserCardViewHolder3.g = bVar;
            recommendUserCardViewHolder3.f63088e = i3;
            recommendUserCardViewHolder3.f63085b.setData(user);
            recommendUserCardViewHolder3.a(recommendUserCardViewHolder3.f63087d);
            recommendUserCardViewHolder3.f63086c.setText(recommendUserCardViewHolder3.f63087d.getRecommendReason());
            recommendUserCardViewHolder3.a(recommendUserCardViewHolder3.f63087d.getFollowStatus());
            recommendUserCardViewHolder3.a(recommendUserCardViewHolder3.f63087d, recommendUserCardViewHolder3.f63087d.getFollowStatus());
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) recommendUserCardViewHolder3.j.getLayoutParams();
            if (i3 != 0) {
                i4 = 0;
            }
            layoutParams.leftMargin = i4;
            recommendUserCardViewHolder3.j.setLayoutParams(layoutParams);
            recommendUserCardViewHolder3.k = str;
            if (AbTestManager.a().j()) {
                recommendUserCardViewHolder3.l.setImageResource(2130838742);
                ViewGroup.LayoutParams layoutParams2 = recommendUserCardViewHolder3.l.getLayoutParams();
                layoutParams2.width = (int) UIUtils.dip2Px(recommendUserCardViewHolder3.h, -2.0f);
                layoutParams2.height = (int) UIUtils.dip2Px(recommendUserCardViewHolder3.h, -2.0f);
                recommendUserCardViewHolder3.l.setLayoutParams(layoutParams2);
            }
        }
    }
}
