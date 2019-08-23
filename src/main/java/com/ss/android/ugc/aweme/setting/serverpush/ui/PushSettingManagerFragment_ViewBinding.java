package com.ss.android.ugc.aweme.setting.serverpush.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PushSettingManagerFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64062a;

    /* renamed from: b  reason: collision with root package name */
    private PushSettingManagerFragment f64063b;

    /* renamed from: c  reason: collision with root package name */
    private View f64064c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f64062a, false, 72348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64062a, false, 72348, new Class[0], Void.TYPE);
            return;
        }
        PushSettingManagerFragment pushSettingManagerFragment = this.f64063b;
        if (pushSettingManagerFragment != null) {
            this.f64063b = null;
            pushSettingManagerFragment.mTitle = null;
            pushSettingManagerFragment.backBtn = null;
            pushSettingManagerFragment.itemPushMain = null;
            pushSettingManagerFragment.itemPushDig = null;
            pushSettingManagerFragment.itemPushComment = null;
            pushSettingManagerFragment.itemPushFollow = null;
            pushSettingManagerFragment.itemPushMention = null;
            pushSettingManagerFragment.itemPushStoryInteraction = null;
            pushSettingManagerFragment.itemPushFollowNewVideo = null;
            pushSettingManagerFragment.itemPushFollowNewStory = null;
            pushSettingManagerFragment.itemPushRecommendVideo = null;
            pushSettingManagerFragment.itemPushLive = null;
            pushSettingManagerFragment.itemPushIm = null;
            this.f64064c.setOnClickListener(null);
            this.f64064c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PushSettingManagerFragment_ViewBinding(final PushSettingManagerFragment pushSettingManagerFragment, View view) {
        this.f64063b = pushSettingManagerFragment;
        pushSettingManagerFragment.mTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "field 'backBtn' and method 'onClick'");
        pushSettingManagerFragment.backBtn = (ImageView) Utils.castView(findRequiredView, C0906R.id.ix, "field 'backBtn'", ImageView.class);
        this.f64064c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64065a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f64065a, false, 72349, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f64065a, false, 72349, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                pushSettingManagerFragment.onClick(view2);
            }
        });
        pushSettingManagerFragment.itemPushMain = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.axk, "field 'itemPushMain'", CommonItemView.class);
        pushSettingManagerFragment.itemPushDig = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.axe, "field 'itemPushDig'", CommonItemView.class);
        pushSettingManagerFragment.itemPushComment = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.axd, "field 'itemPushComment'", CommonItemView.class);
        pushSettingManagerFragment.itemPushFollow = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.axf, "field 'itemPushFollow'", CommonItemView.class);
        pushSettingManagerFragment.itemPushMention = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.axl, "field 'itemPushMention'", CommonItemView.class);
        pushSettingManagerFragment.itemPushStoryInteraction = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.axn, "field 'itemPushStoryInteraction'", CommonItemView.class);
        pushSettingManagerFragment.itemPushFollowNewVideo = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.axh, "field 'itemPushFollowNewVideo'", CommonItemView.class);
        pushSettingManagerFragment.itemPushFollowNewStory = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.axg, "field 'itemPushFollowNewStory'", CommonItemView.class);
        pushSettingManagerFragment.itemPushRecommendVideo = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.axm, "field 'itemPushRecommendVideo'", CommonItemView.class);
        pushSettingManagerFragment.itemPushLive = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.axj, "field 'itemPushLive'", CommonItemView.class);
        pushSettingManagerFragment.itemPushIm = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.axi, "field 'itemPushIm'", CommonItemView.class);
    }
}
