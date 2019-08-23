package com.ss.android.ugc.aweme.im.sdk.relations;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.AbsRelationListAdapter;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public class RelationListAdapter extends AbsRelationListAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51991a;

    public final String a(IMContact iMContact) {
        if (PatchProxy.isSupport(new Object[]{iMContact}, this, f51991a, false, 52675, new Class[]{IMContact.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{iMContact}, this, f51991a, false, 52675, new Class[]{IMContact.class}, String.class);
        }
        IMUser a2 = e.a(iMContact);
        if (a2 == null) {
            return null;
        }
        if (TextUtils.isEmpty(a2.getRemarkName()) || TextUtils.isEmpty(a2.getNickName())) {
            return a2.getSignature();
        }
        return GlobalContext.getContext().getString(C0906R.string.avn, new Object[]{a2.getNickName()});
    }
}
