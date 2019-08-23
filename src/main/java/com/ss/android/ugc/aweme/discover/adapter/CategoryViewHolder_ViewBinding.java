package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class CategoryViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41576a;

    /* renamed from: b  reason: collision with root package name */
    private CategoryViewHolder f41577b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41576a, false, 35536, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41576a, false, 35536, new Class[0], Void.TYPE);
            return;
        }
        CategoryViewHolder categoryViewHolder = this.f41577b;
        if (categoryViewHolder != null) {
            this.f41577b = null;
            categoryViewHolder.mIvType = null;
            categoryViewHolder.mTvTitle = null;
            categoryViewHolder.mTvType = null;
            categoryViewHolder.mTvCount = null;
            categoryViewHolder.mListView = null;
            categoryViewHolder.mRoot = null;
            categoryViewHolder.mViewStubPlaceHolder = null;
            categoryViewHolder.mViewDiscoverBg = null;
            categoryViewHolder.mCategoryCountView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CategoryViewHolder_ViewBinding(CategoryViewHolder categoryViewHolder, View view) {
        this.f41577b = categoryViewHolder;
        categoryViewHolder.mIvType = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b6_, "field 'mIvType'", RemoteImageView.class);
        categoryViewHolder.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dkk, "field 'mTvTitle'", TextView.class);
        categoryViewHolder.mTvType = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dl5, "field 'mTvType'", TextView.class);
        categoryViewHolder.mTvCount = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.daa, "field 'mTvCount'", TextView.class);
        categoryViewHolder.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.cip, "field 'mListView'", RecyclerView.class);
        categoryViewHolder.mRoot = Utils.findRequiredView(view, C0906R.id.chu, "field 'mRoot'");
        categoryViewHolder.mViewStubPlaceHolder = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.dvw, "field 'mViewStubPlaceHolder'", ViewStub.class);
        categoryViewHolder.mViewDiscoverBg = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.a5f, "field 'mViewDiscoverBg'", ImageView.class);
        categoryViewHolder.mCategoryCountView = Utils.findRequiredView(view, C0906R.id.bc0, "field 'mCategoryCountView'");
    }
}
