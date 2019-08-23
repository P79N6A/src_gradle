package com.ss.android.ugc.aweme.livewallpaper.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.livewallpaper.adapter.LiveWallPaperAdapter;
import com.ss.android.ugc.aweme.livewallpaper.c.c;
import com.ss.android.ugc.aweme.livewallpaper.c.e;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.profile.adapter.AmeDecoration;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.List;
import java.util.Map;

public class LocalLiveWallPaperActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53725a;

    /* renamed from: b  reason: collision with root package name */
    private LiveWallPaperAdapter f53726b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f53727c;
    @BindView(2131495249)
    ViewGroup mLayoutEmpty;
    @BindView(2131497590)
    TextView mTitle;
    @BindView(2131496668)
    RecyclerView mWallPapersRecyclerView;

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53725a, false, 56250, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53725a, false, 56250, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f53725a, false, 56249, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53725a, false, 56249, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f53725a, false, 56248, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53725a, false, 56248, new Class[0], Void.TYPE);
        } else if (!a.b()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.w1).statusBarDarkFont(true).init();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f53725a, false, 56247, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53725a, false, 56247, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onResume", true);
        super.onResume();
        List<LiveWallPaperBean> c2 = c.a().c();
        if (CollectionUtils.isEmpty(c2)) {
            this.mLayoutEmpty.setVisibility(0);
        } else {
            if (!this.f53727c) {
                this.f53727c = true;
                if (PatchProxy.isSupport(new Object[]{c2}, null, e.f53685a, true, 56273, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{c2}, null, e.f53685a, true, 56273, new Class[]{List.class}, Void.TYPE);
                } else if (!CollectionUtils.isEmpty(c2)) {
                    for (LiveWallPaperBean liveWallPaperBean : c2) {
                        if (a.a()) {
                            r.a("wall_paper_show", (Map) d.a().a("group_id", liveWallPaperBean.getId()).a("enter_from", "paper_set").f34114b);
                        } else {
                            r.onEvent(MobClick.obtain().setEventName("wall_paper_show").setLabelName("set_wall_paper").setValue(liveWallPaperBean.getId()));
                        }
                    }
                }
            }
            this.mLayoutEmpty.setVisibility(8);
        }
        LiveWallPaperAdapter liveWallPaperAdapter = this.f53726b;
        if (PatchProxy.isSupport(new Object[]{c2}, liveWallPaperAdapter, LiveWallPaperAdapter.f53601a, false, 56016, new Class[]{List.class}, Void.TYPE)) {
            LiveWallPaperAdapter liveWallPaperAdapter2 = liveWallPaperAdapter;
            PatchProxy.accessDispatch(new Object[]{c2}, liveWallPaperAdapter2, LiveWallPaperAdapter.f53601a, false, 56016, new Class[]{List.class}, Void.TYPE);
        } else {
            liveWallPaperAdapter.f53604b.clear();
            if (!CollectionUtils.isEmpty(c2)) {
                liveWallPaperAdapter.f53604b.addAll(c2);
            }
            liveWallPaperAdapter.notifyDataSetChanged();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onResume", false);
    }

    @OnClick({2131493213})
    public void exit(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f53725a, false, 56246, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f53725a, false, 56246, new Class[]{View.class}, Void.TYPE);
            return;
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f53725a, false, 56244, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f53725a, false, 56244, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.c8);
        if (PatchProxy.isSupport(new Object[0], this, f53725a, false, 56245, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53725a, false, 56245, new Class[0], Void.TYPE);
        } else {
            this.mTitle.setText(getString(C0906R.string.b7_));
            this.mWallPapersRecyclerView.setLayoutManager(new WrapGridLayoutManager((Context) this, 3, 1, false));
            this.mWallPapersRecyclerView.setHasFixedSize(true);
            this.f53726b = new LiveWallPaperAdapter();
            this.f53726b.f53605c = new LiveWallPaperAdapter.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53728a;

                public final void a(LiveWallPaperBean liveWallPaperBean) {
                    if (PatchProxy.isSupport(new Object[]{liveWallPaperBean}, this, f53728a, false, 56251, new Class[]{LiveWallPaperBean.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{liveWallPaperBean}, this, f53728a, false, 56251, new Class[]{LiveWallPaperBean.class}, Void.TYPE);
                        return;
                    }
                    Intent intent = new Intent(LocalLiveWallPaperActivity.this, LiveWallPaperPreviewActivity.class);
                    intent.putExtra("live_wall_paper", liveWallPaperBean);
                    LocalLiveWallPaperActivity.this.startActivity(intent);
                }
            };
            this.mWallPapersRecyclerView.addItemDecoration(new AmeDecoration((int) UIUtils.dip2Px(this, 1.0f)));
            this.mWallPapersRecyclerView.setAdapter(this.f53726b);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity", "onCreate", false);
    }
}
