package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.api.a.a;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import com.ss.android.ugc.aweme.base.sharedpref.f;
import com.ss.android.ugc.aweme.profile.adapter.ProfileCoverAdapter;
import com.ss.android.ugc.aweme.profile.adapter.VerticalPaddingItemDecoration;
import com.ss.android.ugc.aweme.profile.model.UrlModelWrap;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProfileCoverLibActivity extends AmeSSActivity implements WeakHandler.IHandler, r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62105a;

    /* renamed from: b  reason: collision with root package name */
    ad f62106b;

    /* renamed from: c  reason: collision with root package name */
    private int f62107c;

    /* renamed from: d  reason: collision with root package name */
    private int f62108d;

    /* renamed from: e  reason: collision with root package name */
    private int f62109e;

    /* renamed from: f  reason: collision with root package name */
    private int f62110f;
    private int g;
    @BindView(2131496870)
    RecyclerView mCoverRecycleView;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131497604)
    TextTitleBar mTitleBar;

    public final void a(boolean z) {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f62105a, false, 68635, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62105a, false, 68635, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62105a, false, 68636, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62105a, false, 68636, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public int getStatusBarColor() {
        if (!PatchProxy.isSupport(new Object[0], this, f62105a, false, 68629, new Class[0], Integer.TYPE)) {
            return getResources().getColor(C0906R.color.a7l);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f62105a, false, 68629, new Class[0], Integer.TYPE)).intValue();
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f62105a, false, 68634, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f62105a, false, 68634, new Class[]{Message.class}, Void.TYPE);
        } else if (message2.obj instanceof Exception) {
            a.a(this, (Exception) message2.obj, C0906R.string.bsd);
        } else {
            if (message2.obj instanceof User) {
                d.a().setCurUser((User) message2.obj);
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        List list;
        Set<String> set;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62105a, false, 68626, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62105a, false, 68626, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.bv);
        ButterKnife.bind((Activity) this);
        if (PatchProxy.isSupport(new Object[0], this, f62105a, false, 68627, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62105a, false, 68627, new Class[0], Void.TYPE);
        } else {
            this.f62107c = (int) UIUtils.dip2Px(this, 16.0f);
            this.f62108d = (int) UIUtils.dip2Px(this, 16.0f);
            this.f62109e = (int) UIUtils.dip2Px(this, 16.0f);
            this.f62110f = (int) UIUtils.dip2Px(this, 8.0f);
            this.g = (int) UIUtils.dip2Px(this, 8.0f);
            this.mTitleBar.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62111a;

                public final void b(View view) {
                }

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f62111a, false, 68639, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f62111a, false, 68639, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ProfileCoverLibActivity.this.onBackPressed();
                }
            });
            ProfileCoverAdapter profileCoverAdapter = new ProfileCoverAdapter();
            if (PatchProxy.isSupport(new Object[0], this, f62105a, false, 68628, new Class[0], List.class)) {
                list = (List) PatchProxy.accessDispatch(new Object[0], this, f62105a, false, 68628, new Class[0], List.class);
            } else {
                f b2 = e.b();
                HashSet hashSet = new HashSet();
                if (PatchProxy.isSupport(new Object[]{"default_profile_cover_url", hashSet}, b2, f.f34885a, false, 24895, new Class[]{String.class, Set.class}, Set.class)) {
                    f fVar = b2;
                    set = (Set) PatchProxy.accessDispatch(new Object[]{"default_profile_cover_url", hashSet}, fVar, f.f34885a, false, 24895, new Class[]{String.class, Set.class}, Set.class);
                } else {
                    set = b2.f34886b.getStringSet("default_profile_cover_url", hashSet);
                }
                ArrayList<UrlModelWrap> arrayList = new ArrayList<>();
                for (String fromJson : set) {
                    arrayList.add(UrlModelWrap.fromJson(fromJson));
                }
                if (PatchProxy.isSupport(new Object[]{arrayList}, this, f62105a, false, 68630, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{arrayList}, this, f62105a, false, 68630, new Class[]{List.class}, Void.TYPE);
                } else {
                    Collections.sort(arrayList, by.f62558b);
                }
                list = new ArrayList();
                for (UrlModelWrap urlModel : arrayList) {
                    list.add(urlModel.getUrlModel());
                }
            }
            profileCoverAdapter.setData(list);
            profileCoverAdapter.f61276b = new bx(this);
            this.mCoverRecycleView.setLayoutManager(new WrapLinearLayoutManager(this, 1, false));
            RecyclerView recyclerView = this.mCoverRecycleView;
            VerticalPaddingItemDecoration verticalPaddingItemDecoration = new VerticalPaddingItemDecoration(this.f62107c, this.f62108d, this.f62109e, this.f62110f, this.g);
            recyclerView.addItemDecoration(verticalPaddingItemDecoration);
            this.mCoverRecycleView.setAdapter(profileCoverAdapter);
            this.mStatusView.setBuilder(DmtStatusView.a.a((Context) this));
        }
        this.f62106b = new ad();
        this.f62106b.h = this;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onCreate", false);
    }

    public final void a(Exception exc, int i) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i)}, this, f62105a, false, 68632, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i)}, this, f62105a, false, 68632, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.f62106b != null) {
            this.mStatusView.setVisibility(8);
            a.a(this, exc, C0906R.string.bsd);
            com.ss.android.ugc.aweme.common.r.a("replace_profile_cover_finish", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_method", "app_album").f34114b);
        }
    }

    public final void a(User user, int i) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f62105a, false, 68631, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f62105a, false, 68631, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            com.bytedance.ies.dmt.ui.d.a.a(GlobalContext.getContext(), (int) C0906R.string.bs9).a();
            this.mStatusView.setVisibility(8);
            d.a().queryUser(new WeakHandler(Looper.getMainLooper(), this));
            com.ss.android.ugc.aweme.common.r.a("replace_profile_cover_finish", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_method", "app_album").f34114b);
        }
    }

    public final void a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f62105a, false, 68633, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f62105a, false, 68633, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (this.mStatusView != null) {
                this.mStatusView.b();
            }
            if (!TextUtils.isEmpty(str)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) k.a(), str).a();
                if (z) {
                    finish();
                }
            }
        }
    }
}
