package com.ss.android.ugc.aweme.story.comment.view.adapter;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.ui.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import com.ss.android.ugc.aweme.story.comment.a.a;
import com.ss.android.ugc.aweme.story.comment.view.CommentActivity;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72300a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewerListViewHolder f72301b;

    i(ViewerListViewHolder viewerListViewHolder) {
        this.f72301b = viewerListViewHolder;
    }

    public final void onClick(View view) {
        String str;
        LifeStory lifeStory;
        if (PatchProxy.isSupport(new Object[]{view}, this, f72300a, false, 83009, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72300a, false, 83009, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ViewerListViewHolder viewerListViewHolder = this.f72301b;
        FragmentActivity activity = viewerListViewHolder.f72264b.getActivity();
        LifeStory lifeStory2 = null;
        if (activity != null && (activity instanceof CommentActivity)) {
            CommentActivity commentActivity = (CommentActivity) activity;
            if (PatchProxy.isSupport(new Object[0], commentActivity, CommentActivity.f72210a, false, 82925, new Class[0], LifeStory.class)) {
                lifeStory = (LifeStory) PatchProxy.accessDispatch(new Object[0], commentActivity, CommentActivity.f72210a, false, 82925, new Class[0], LifeStory.class);
            } else {
                int currentItem = commentActivity.f72215f.getCurrentItem();
                if (commentActivity.f72212c != null && !CollectionUtils.isEmpty(commentActivity.f72212c.getData()) && commentActivity.f72212c.getData().size() > currentItem) {
                    lifeStory = (LifeStory) commentActivity.f72212c.getData().get(currentItem);
                }
            }
            lifeStory2 = lifeStory;
        }
        if (lifeStory2 != null) {
            a aVar = new a(view.getContext());
            aVar.show();
            User user = viewerListViewHolder.n;
            if (PatchProxy.isSupport(new Object[]{user, lifeStory2}, aVar, a.f72130a, false, 82709, new Class[]{User.class, LifeStory.class}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{user, lifeStory2}, aVar2, a.f72130a, false, 82709, new Class[]{User.class, LifeStory.class}, Void.TYPE);
                return;
            }
            aVar.h = user;
            aVar.i = lifeStory2;
            c.b(aVar.f72131b, aVar.h.getAvatarThumb());
            if (!TextUtils.isEmpty(aVar.h.getRemarkName())) {
                str = aVar.h.getRemarkName();
            } else {
                str = aVar.h.getNickname();
            }
            aVar.f72133d.setText(aVar.getContext().getString(C0906R.string.vz, new Object[]{str}));
            b.a((View) aVar.f72134e, 0);
        }
    }
}
