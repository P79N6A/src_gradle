package com.ss.android.ugc.aweme.im.sdk.providedservices;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.R$drawable;
import com.ss.android.ugc.aweme.im.sdk.g.a;
import com.ss.android.ugc.aweme.im.sdk.relations.RelationListAdapter;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.AbsRelationListAdapter;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexerListAdapter;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationListNewAdapter;
import com.ss.android.ugc.aweme.im.sdk.widget.ItemDivider;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

@Keep
public class ImplService implements IImplService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean enableExpressionTab() {
        return false;
    }

    public boolean enableMediaRecord() {
        return true;
    }

    public boolean enableSendEmoji() {
        return true;
    }

    public boolean enableSendVoice() {
        return true;
    }

    public boolean needAwemeMsgShowFollow() {
        return true;
    }

    public boolean needSessionListShowMore() {
        return true;
    }

    public void setTitleStyle(TextView textView) {
    }

    public void setupStatusBar(Activity activity) {
    }

    public Class getEmojiRClass() {
        return R$drawable.class;
    }

    public RecyclerView.ItemDecoration getItemDecoration(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 52642, new Class[]{Context.class}, RecyclerView.ItemDecoration.class)) {
            return new ItemDivider(context.getResources().getColor(C0906R.color.qz), (int) UIUtils.dip2Px(context2, 0.5f), 0, 1);
        }
        return (RecyclerView.ItemDecoration) PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 52642, new Class[]{Context.class}, RecyclerView.ItemDecoration.class);
    }

    public AbsRelationListAdapter getRelationListAdapter(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 52644, new Class[]{Boolean.TYPE}, AbsRelationListAdapter.class)) {
            return (AbsRelationListAdapter) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 52644, new Class[]{Boolean.TYPE}, AbsRelationListAdapter.class);
        } else if (((IIMService) a.a(IIMService.class)).getAbInterface().c()) {
            if (z) {
                return new RelationIndexSelectListAdapter();
            }
            return new RelationIndexerListAdapter();
        } else if (z || !com.ss.android.ugc.aweme.im.sdk.d.a.a().e().showNewStyle()) {
            return new RelationListAdapter();
        } else {
            return new RelationListNewAdapter();
        }
    }

    public boolean isUserVerified(IMUser iMUser) {
        if (PatchProxy.isSupport(new Object[]{iMUser}, this, changeQuickRedirect, false, 52645, new Class[]{IMUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMUser}, this, changeQuickRedirect, false, 52645, new Class[]{IMUser.class}, Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.isEmpty(iMUser.getCustomVerify()) || !TextUtils.isEmpty(iMUser.getWeiboVerify())) {
            return true;
        } else {
            return false;
        }
    }

    public void setupStatusBarWithHolder(Activity activity, View view) {
        if (PatchProxy.isSupport(new Object[]{activity, view}, this, changeQuickRedirect, false, 52643, new Class[]{Activity.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, view}, this, changeQuickRedirect, false, 52643, new Class[]{Activity.class, View.class}, Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(activity);
    }
}
