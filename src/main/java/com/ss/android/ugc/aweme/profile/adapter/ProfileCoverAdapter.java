package com.ss.android.ugc.aweme.profile.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.e.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.profile.model.User;

public class ProfileCoverAdapter extends BaseAdapter<UrlModel> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61275a;

    /* renamed from: b  reason: collision with root package name */
    public a f61276b;

    public interface a {
        void a(UrlModel urlModel);
    }

    public int getLoadMoreHeight(View view) {
        if (!PatchProxy.isSupport(new Object[]{view}, this, f61275a, false, 67417, new Class[]{View.class}, Integer.TYPE)) {
            return (int) UIUtils.dip2Px(view.getContext(), 24.0f);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, f61275a, false, 67417, new Class[]{View.class}, Integer.TYPE)).intValue();
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f61275a, false, 67416, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new ProfileCoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vf, viewGroup2, false));
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f61275a, false, 67416, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int i2;
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f61275a, false, 67415, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f61275a, false, 67415, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        User curUser = d.a().getCurUser();
        if (!CollectionUtils.isEmpty(curUser.getCoverUrls())) {
            z = TextUtils.equals(((UrlModel) this.mItems.get(i3)).getUri(), curUser.getCoverUrls().get(0).getUri());
        } else {
            z = false;
        }
        ProfileCoverViewHolder profileCoverViewHolder = (ProfileCoverViewHolder) viewHolder;
        UrlModel urlModel = (UrlModel) this.mItems.get(i3);
        a aVar = this.f61276b;
        if (PatchProxy.isSupport(new Object[]{urlModel, Byte.valueOf(z ? (byte) 1 : 0), aVar}, profileCoverViewHolder, ProfileCoverViewHolder.f61277a, false, 67418, new Class[]{UrlModel.class, Boolean.TYPE, a.class}, Void.TYPE)) {
            ProfileCoverViewHolder profileCoverViewHolder2 = profileCoverViewHolder;
            PatchProxy.accessDispatch(new Object[]{urlModel, Byte.valueOf(z), aVar}, profileCoverViewHolder2, ProfileCoverViewHolder.f61277a, false, 67418, new Class[]{UrlModel.class, Boolean.TYPE, a.class}, Void.TYPE);
            return;
        }
        c.b(profileCoverViewHolder.mCoverImage, urlModel);
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, profileCoverViewHolder, ProfileCoverViewHolder.f61277a, false, 67419, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            ProfileCoverViewHolder profileCoverViewHolder3 = profileCoverViewHolder;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, profileCoverViewHolder3, ProfileCoverViewHolder.f61277a, false, 67419, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            ImageView imageView = profileCoverViewHolder.mSelectedImage;
            int i4 = 8;
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            TextView textView = profileCoverViewHolder.mUnselectedText;
            if (!z) {
                i4 = 0;
            }
            textView.setVisibility(i4);
        }
        profileCoverViewHolder.mSelectBtn.setOnTouchListener(b.a.g());
        profileCoverViewHolder.mSelectBtn.setOnClickListener(new f(aVar, urlModel));
    }
}
