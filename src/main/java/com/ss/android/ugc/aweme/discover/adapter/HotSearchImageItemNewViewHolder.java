package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.discover.ui.ak;
import com.ss.android.ugc.aweme.discover.widget.HotSearchTitleTextView;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

public class HotSearchImageItemNewViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41622a;

    /* renamed from: b  reason: collision with root package name */
    LogPbBean f41623b;

    /* renamed from: c  reason: collision with root package name */
    public String f41624c;

    /* renamed from: d  reason: collision with root package name */
    public ak.b f41625d;
    @BindView(2131494996)
    RemoteImageView mImageView;
    @BindView(2131498515)
    View mMaskView;
    @BindView(2131498191)
    HotSearchTitleTextView mTitleView;

    /* access modifiers changed from: package-private */
    public boolean a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, f41622a, false, 35589, new Class[]{UrlModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{urlModel}, this, f41622a, false, 35589, new Class[]{UrlModel.class}, Boolean.TYPE)).booleanValue();
        } else if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        } else {
            for (String isEmpty : urlModel.getUrlList()) {
                if (!TextUtils.isEmpty(isEmpty)) {
                    return true;
                }
            }
            return false;
        }
    }

    public HotSearchImageItemNewViewHolder(View view, String str, ak.b bVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f41624c = str;
        this.f41625d = bVar;
    }
}
