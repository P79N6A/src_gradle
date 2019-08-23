package com.ss.android.ugc.aweme.setting.adapter;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.ss.android.ugc.aweme.profile.model.User;

public class BlackListAdapter extends BaseAdapter<User> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63800a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f63801b;

    /* renamed from: c  reason: collision with root package name */
    private int f63802c;

    /* renamed from: d  reason: collision with root package name */
    private int f63803d;

    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f63800a, false, 72114, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f63800a, false, 72114, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
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
        appCompatTextView2.setText(C0906R.string.avo);
        DmtStatusView dmtStatusView = (DmtStatusView) onCreateFooterViewHolder.itemView;
        dmtStatusView.setBuilder(dmtStatusView.a().b((View) appCompatTextView2));
        return onCreateFooterViewHolder;
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f63800a, false, 72113, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new BlackHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.si, viewGroup2, false), this.f63801b);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f63800a, false, 72113, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f63800a, false, 72112, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f63800a, false, 72112, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        BlackHolder blackHolder = (BlackHolder) viewHolder;
        User user = (User) this.mItems.get(i);
        int i2 = this.f63802c;
        int i3 = this.f63803d;
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i2), Integer.valueOf(i3)}, blackHolder, BlackHolder.f63794a, false, 72103, new Class[]{User.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {user, Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = BlackHolder.f63794a;
            BlackHolder blackHolder2 = blackHolder;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            PatchProxy.accessDispatch(objArr, blackHolder2, changeQuickRedirect2, false, 72103, new Class[]{User.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (user != null) {
            blackHolder.h = i3;
            if (PatchProxy.isSupport(new Object[0], blackHolder, BlackHolder.f63794a, false, 72104, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], blackHolder, BlackHolder.f63794a, false, 72104, new Class[0], Void.TYPE);
            } else if (blackHolder.h != 0) {
                blackHolder.f63798e.setBackgroundColor(blackHolder.f63798e.getResources().getColor(C0906R.color.ao4));
                blackHolder.f63796c.setTextColor(blackHolder.f63798e.getResources().getColor(C0906R.color.a1_));
                blackHolder.f63797d.setTextColor(blackHolder.f63798e.getResources().getColor(C0906R.color.a0l));
            }
            blackHolder.g = i2;
            if (blackHolder.g == 1) {
                z = true;
            }
            blackHolder.i = z;
            blackHolder.f63799f = user;
            if (blackHolder.i) {
                if (blackHolder.f63799f.getStoryBlockInfo() == null) {
                    StoryBlockInfo storyBlockInfo = new StoryBlockInfo();
                    storyBlockInfo.setBlock(true);
                    blackHolder.f63799f.setStoryBlockInfo(storyBlockInfo);
                }
                blackHolder.a(true);
            } else {
                blackHolder.f63799f.setBlock(true);
            }
            c.b(blackHolder.f63795b, blackHolder.f63799f.getAvatarThumb());
            blackHolder.f63796c.setText(blackHolder.f63799f.getNickname());
            TextView textView = blackHolder.f63797d;
            StringBuilder sb = new StringBuilder("@");
            if (TextUtils.isEmpty(user.getUniqueId())) {
                str = user.getShortId();
            } else {
                str = user.getUniqueId();
            }
            sb.append(str);
            textView.setText(sb.toString());
        }
    }

    public BlackListAdapter(Activity activity, int i, int i2) {
        this.f63801b = activity;
        this.f63802c = i;
        this.f63803d = i2;
    }
}
