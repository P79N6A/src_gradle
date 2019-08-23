package com.ss.android.ugc.aweme.story.feed.view.profile;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ProfileAdapter extends BaseAdapter<ProfileEntity> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72784a;

    /* renamed from: b  reason: collision with root package name */
    public int f72785b;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f72786c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProfileMode {
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getLoadMoreHeight(View view) {
        return 1;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f72784a, false, 84059, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f72784a, false, 84059, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.f72786c = recyclerView2;
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f72784a, false, 84060, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f72784a, false, 84060, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        this.f72786c = null;
    }

    public int getBasicItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72784a, false, 84056, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72784a, false, 84056, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (((ProfileEntity) getData().get(i)).isMain()) {
            return 1998;
        } else {
            return 1997;
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f72784a, false, 84055, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f72784a, false, 84055, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        AbsProfileViewHolder absProfileViewHolder = (AbsProfileViewHolder) viewHolder;
        absProfileViewHolder.a(this.f72785b);
        absProfileViewHolder.a((ProfileEntity) getData().get(i));
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f72784a, false, 84054, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f72784a, false, 84054, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        switch (i) {
            case 1997:
                return ProfileViewHolder.a(viewGroup);
            case 1998:
                if (!PatchProxy.isSupport(new Object[]{viewGroup2}, null, MainProfileViewHolder.g, true, 84041, new Class[]{ViewGroup.class}, MainProfileViewHolder.class)) {
                    return new MainProfileViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a7s, viewGroup2, false));
                }
                return (MainProfileViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, MainProfileViewHolder.g, true, 84041, new Class[]{ViewGroup.class}, MainProfileViewHolder.class);
            default:
                return ProfileViewHolder.a(viewGroup);
        }
    }
}
