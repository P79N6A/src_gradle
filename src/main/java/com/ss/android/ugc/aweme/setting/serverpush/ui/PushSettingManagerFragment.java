package com.ss.android.ugc.aweme.setting.serverpush.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import com.ss.android.ugc.aweme.setting.serverpush.b.a;
import com.ss.android.ugc.aweme.setting.serverpush.b.b;
import com.ss.android.ugc.aweme.setting.serverpush.b.d;
import com.ss.android.ugc.aweme.setting.serverpush.b.e;
import com.ss.android.ugc.aweme.utils.cx;
import com.ss.android.ugc.aweme.utils.cy;

public class PushSettingManagerFragment extends AmeBaseFragment implements a, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64054a;

    /* renamed from: b  reason: collision with root package name */
    e f64055b;
    @BindView(2131493213)
    ImageView backBtn;

    /* renamed from: c  reason: collision with root package name */
    d f64056c;
    @BindView(2131494914)
    CommonItemView itemPushComment;
    @BindView(2131494915)
    CommonItemView itemPushDig;
    @BindView(2131494916)
    CommonItemView itemPushFollow;
    @BindView(2131494917)
    CommonItemView itemPushFollowNewStory;
    @BindView(2131494918)
    CommonItemView itemPushFollowNewVideo;
    @BindView(2131494919)
    CommonItemView itemPushIm;
    @BindView(2131494920)
    CommonItemView itemPushLive;
    @BindView(2131494921)
    CommonItemView itemPushMain;
    @BindView(2131494922)
    CommonItemView itemPushMention;
    @BindView(2131494923)
    CommonItemView itemPushRecommendVideo;
    @BindView(2131494924)
    CommonItemView itemPushStoryInteraction;
    @BindView(2131497590)
    TextView mTitle;

    public final void X_() {
    }

    public final void c() {
    }

    public final void d_(Exception exc) {
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f64054a, false, 72343, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64054a, false, 72343, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.f64055b.k();
        this.f64056c.k();
    }

    private void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f64054a, false, 72336, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64054a, false, 72336, new Class[0], Void.TYPE);
            return;
        }
        CommonItemView commonItemView = this.itemPushMain;
        if (cy.a(getContext())) {
            str = getString(C0906R.string.btu);
        } else {
            str = getString(C0906R.string.btt);
        }
        commonItemView.setRightText(str);
    }

    public void onResume() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f64054a, false, 72335, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64054a, false, 72335, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        a();
        if (PatchProxy.isSupport(new Object[0], this, f64054a, false, 72337, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64054a, false, 72337, new Class[0], Void.TYPE);
            return;
        }
        if (cy.a(getContext())) {
            f2 = 1.0f;
        } else {
            f2 = 0.34f;
        }
        a(this.itemPushDig, f2);
        a(this.itemPushComment, f2);
        a(this.itemPushFollow, f2);
        a(this.itemPushMention, f2);
        a(this.itemPushStoryInteraction, f2);
        a(this.itemPushFollowNewVideo, f2);
        a(this.itemPushFollowNewStory, f2);
        a(this.itemPushRecommendVideo, f2);
        a(this.itemPushLive, f2);
        a(this.itemPushIm, f2);
    }

    @OnClick({2131493213})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64054a, false, 72341, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64054a, false, 72341, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.ix) {
            getActivity().onBackPressed();
        }
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f64054a, false, 72342, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f64054a, false, 72342, new Class[]{c.class}, Void.TYPE);
            return;
        }
        a(this.itemPushDig, cVar.f64025a);
        a(this.itemPushComment, cVar.f64026b);
        a(this.itemPushFollow, cVar.f64027c);
        a(this.itemPushMention, cVar.f64028d);
        a(this.itemPushStoryInteraction, cVar.f64029e);
        a(this.itemPushFollowNewVideo, cVar.g);
        a(this.itemPushFollowNewStory, cVar.f64030f);
        a(this.itemPushRecommendVideo, cVar.h);
        a(this.itemPushLive, cVar.i);
        a(this.itemPushIm, cVar.j);
    }

    private void a(CommonItemView commonItemView, float f2) {
        CommonItemView commonItemView2 = commonItemView;
        if (PatchProxy.isSupport(new Object[]{commonItemView2, Float.valueOf(f2)}, this, f64054a, false, 72345, new Class[]{CommonItemView.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commonItemView2, Float.valueOf(f2)}, this, f64054a, false, 72345, new Class[]{CommonItemView.class, Float.TYPE}, Void.TYPE);
            return;
        }
        View findViewById = commonItemView2.findViewById(C0906R.id.cew);
        if (findViewById != null) {
            findViewById.setAlpha(f2);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f64054a, false, 72334, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f64054a, false, 72334, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f64054a, false, 72338, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64054a, false, 72338, new Class[0], Void.TYPE);
        } else {
            this.mTitle.setText(C0906R.string.c5d);
            this.itemPushMain.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64057a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f64057a, false, 72346, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f64057a, false, 72346, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    try {
                        cx.b(PushSettingManagerFragment.this.getContext());
                    } catch (Exception unused) {
                        PushSettingManagerFragment.this.getContext().startActivity(new Intent("android.settings.SETTINGS"));
                    }
                }
            });
            a();
            a(this.itemPushDig, "digg_push");
            a(this.itemPushComment, "comment_push");
            a(this.itemPushFollow, "follow_push");
            a(this.itemPushMention, "mention_push");
            a(this.itemPushStoryInteraction, "story_interaction_push");
            a(this.itemPushFollowNewVideo, "follow_new_video_push");
            a(this.itemPushFollowNewStory, "follow_new_story_push");
            a(this.itemPushRecommendVideo, "recommend_video_push");
            a(this.itemPushLive, "live_push");
            a(this.itemPushIm, "im_push");
        }
        this.f64055b = new e();
        this.f64055b.a(this);
        this.f64055b.a(new Object[0]);
        this.f64056c = new d();
        this.f64056c.a(this);
    }

    private void a(CommonItemView commonItemView, int i) {
        CommonItemView commonItemView2 = commonItemView;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{commonItemView2, Integer.valueOf(i)}, this, f64054a, false, 72340, new Class[]{CommonItemView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commonItemView2, Integer.valueOf(i)}, this, f64054a, false, 72340, new Class[]{CommonItemView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == 1) {
            z = true;
        }
        commonItemView2.setChecked(z);
    }

    private void a(CommonItemView commonItemView, String str) {
        final CommonItemView commonItemView2 = commonItemView;
        if (PatchProxy.isSupport(new Object[]{commonItemView2, str}, this, f64054a, false, 72339, new Class[]{CommonItemView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commonItemView2, str}, this, f64054a, false, 72339, new Class[]{CommonItemView.class, String.class}, Void.TYPE);
            return;
        }
        commonItemView.setTag(str);
        commonItemView2.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64059a;

            public final void onClick(View view) {
                boolean z;
                if (PatchProxy.isSupport(new Object[]{view}, this, f64059a, false, 72347, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64059a, false, 72347, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (PushSettingManagerFragment.this.isViewValid() && PushSettingManagerFragment.this.getContext() != null) {
                    PushSettingManagerFragment pushSettingManagerFragment = PushSettingManagerFragment.this;
                    if (PatchProxy.isSupport(new Object[0], pushSettingManagerFragment, PushSettingManagerFragment.f64054a, false, 72344, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], pushSettingManagerFragment, PushSettingManagerFragment.f64054a, false, 72344, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (cy.a(pushSettingManagerFragment.getContext())) {
                        z = true;
                    } else {
                        cy.b(pushSettingManagerFragment.getContext(), true);
                        z = false;
                    }
                    if (z) {
                        commonItemView2.setChecked(!commonItemView2.c());
                        PushSettingManagerFragment.this.f64056c.a(commonItemView2.getTag(), Integer.valueOf(commonItemView2.c() ? 1 : 0));
                    }
                }
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f64054a, false, 72333, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.pu, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f64054a, false, 72333, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
