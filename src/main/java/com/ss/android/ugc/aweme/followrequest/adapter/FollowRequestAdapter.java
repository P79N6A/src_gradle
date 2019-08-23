package com.ss.android.ugc.aweme.followrequest.adapter;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.followrequest.adapter.FollowRequestHolder;
import com.ss.android.ugc.aweme.followrequest.b;
import com.ss.android.ugc.aweme.profile.model.User;

public class FollowRequestAdapter extends BaseAdapter<User> implements FollowRequestHolder.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48243a;

    /* renamed from: c  reason: collision with root package name */
    private static final int f48244c = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 6.0f));

    /* renamed from: b  reason: collision with root package name */
    private b f48245b;

    public FollowRequestAdapter(b bVar) {
        this.f48245b = bVar;
    }

    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f48243a, false, 45310, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f48243a, false, 45310, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        int color = ContextCompat.getColor(viewGroup.getContext(), C0906R.color.zx);
        this.mTextColor = color;
        RecyclerView.ViewHolder onCreateFooterViewHolder = super.onCreateFooterViewHolder(viewGroup);
        AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextColor(color);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setText(C0906R.string.b5s);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setTextColor(color);
        appCompatTextView2.setTextSize(13.0f);
        appCompatTextView2.setText(C0906R.string.avk);
        DmtStatusView dmtStatusView = (DmtStatusView) onCreateFooterViewHolder.itemView;
        dmtStatusView.setBuilder(dmtStatusView.a().b((View) appCompatTextView2));
        return onCreateFooterViewHolder;
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f48243a, false, 45309, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new FollowRequestHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ux, viewGroup, false), (Activity) this.f48245b, this);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f48243a, false, 45309, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f48243a, false, 45308, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f48243a, false, 45308, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        FollowRequestHolder followRequestHolder = (FollowRequestHolder) viewHolder2;
        User user = (User) this.mItems.get(i2);
        if (PatchProxy.isSupport(new Object[]{user}, followRequestHolder, FollowRequestHolder.f48246a, false, 45312, new Class[]{User.class}, Void.TYPE)) {
            FollowRequestHolder followRequestHolder2 = followRequestHolder;
            PatchProxy.accessDispatch(new Object[]{user}, followRequestHolder2, FollowRequestHolder.f48246a, false, 45312, new Class[]{User.class}, Void.TYPE);
        } else if (user != null) {
            followRequestHolder.f48247b = user;
            followRequestHolder.f48248c.setData(user);
            followRequestHolder.f48249d.setText(followRequestHolder.f48247b.getNickname());
            if (a.a()) {
                TextView textView = followRequestHolder.f48250e;
                StringBuilder sb = new StringBuilder("@");
                if (TextUtils.isEmpty(followRequestHolder.f48247b.getUniqueId())) {
                    str = user.getShortId();
                } else {
                    str = user.getUniqueId();
                }
                sb.append(str);
                textView.setText(sb.toString());
            } else if (TextUtils.isEmpty(followRequestHolder.f48247b.getRecommendReason())) {
                followRequestHolder.f48250e.setVisibility(8);
            } else {
                followRequestHolder.f48250e.setVisibility(0);
                followRequestHolder.f48250e.setText(followRequestHolder.f48247b.getRecommendReason());
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewHolder2.itemView.getLayoutParams();
        if (i2 == 0) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, f48244c, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        } else {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    public final void a(User user, int i, int i2) {
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i), Integer.valueOf(i2)}, this, f48243a, false, 45311, new Class[]{User.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i), Integer.valueOf(i2)}, this, f48243a, false, 45311, new Class[]{User.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i3 >= 0 && i3 < this.mItems.size()) {
            this.mItems.remove(i);
            notifyItemRemoved(i);
            if (this.mItems.isEmpty()) {
                this.f48245b.c();
            }
        }
    }
}
