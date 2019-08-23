package com.ss.android.ugc.aweme.friends.ui;

import a.g;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.challenge.a.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.friends.api.RecommendApi;
import com.ss.android.ugc.aweme.friends.api.b;
import com.ss.android.ugc.aweme.friends.ui.ah;
import com.ss.android.ugc.aweme.newfollow.util.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.u.s;
import com.ss.android.ugc.aweme.utils.permission.e;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public class RecommendFriendActivity extends AmeActivity implements View.OnClickListener, ah.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3344a;

    /* renamed from: b  reason: collision with root package name */
    public RecommendFriendAdapter f3345b;

    /* renamed from: c  reason: collision with root package name */
    List<User> f3346c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f3347d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f3348e;

    /* renamed from: f  reason: collision with root package name */
    private i f3349f;
    private ImageView g;
    private TextView h;
    private RecommendApi i;

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3344a, false, 47398, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3344a, false, 47398, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.RecommendFriendActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.RecommendFriendActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3344a, false, 47399, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3344a, false, 47399, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.RecommendFriendActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3344a, false, 47387, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3344a, false, 47387, new Class[0], Void.TYPE);
            return;
        }
        a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49326a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f49326a, false, 47403, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f49326a, false, 47403, new Class[0], Void.TYPE);
                    return;
                }
                RecommendFriendActivity.this.finish();
                RecommendFriendActivity.this.dismissProgressDialog();
            }
        });
    }

    private List<User> c() {
        if (PatchProxy.isSupport(new Object[0], this, f3344a, false, 47395, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f3344a, false, 47395, new Class[0], List.class);
        }
        List subList = this.f3345b.getData().subList(this.f3346c.size(), this.f3345b.getData().size());
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < subList.size(); i2++) {
            User user = (User) subList.get(i2);
            if (user != null && user.getFollowStatus() == 1) {
                arrayList.add(user);
            }
        }
        return arrayList;
    }

    private void d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3344a, false, 47397, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3344a, false, 47397, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3345b != null && !CollectionUtils.isEmpty(this.f3345b.getData())) {
            Iterator it2 = this.f3345b.getData().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((User) it2.next()).getFollowStatus() == 1) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                r.onEvent(MobClick.obtain().setEventName("follow_skip").setLabelName("recommend"));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3344a, false, 47390, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3344a, false, 47390, new Class[0], Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName("follow_default_count").setLabelName("recommend").setValue(String.valueOf(a(this.f3346c).size())).setJsonObject(new t().a("uid", b(a(this.f3346c))).a()));
        r.onEvent(MobClick.obtain().setEventName("follow_manual_count").setLabelName("recommend").setValue(String.valueOf(c().size())).setJsonObject(new t().a("uid", b(c())).a()));
    }

    private String b(List<User> list) {
        StringBuilder sb;
        if (PatchProxy.isSupport(new Object[]{list}, this, f3344a, false, 47393, new Class[]{List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list}, this, f3344a, false, 47393, new Class[]{List.class}, String.class);
        } else if (CollectionUtils.isEmpty(list)) {
            return "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (User uid : list) {
                sb2.append(uid.getUid());
                sb2.append(",");
            }
            if (sb2.length() > 0) {
                sb = new StringBuilder(sb2.substring(0, sb2.length() - 1));
            } else {
                sb = sb2;
            }
            return sb.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public List<User> a(List<User> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f3344a, false, 47392, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f3344a, false, 47392, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (User next : list) {
            if (1 == next.getFollowStatus()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @Subscribe
    public void onProfileFollowEvent(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f3344a, false, 47396, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f3344a, false, 47396, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (isViewValid() && (dVar.f35319b instanceof User) && this.f3345b != null) {
            User user = (User) dVar.f35319b;
            List data = this.f3345b.getData();
            int size = data.size();
            for (int i2 = 0; i2 < size; i2++) {
                User user2 = (User) data.get(i2);
                if (TextUtils.equals(user2.getUid(), user.getUid())) {
                    user2.setFollowStatus(dVar.f35318a);
                    this.f3345b.notifyItemChanged(i2);
                    return;
                }
            }
        }
    }

    private Pair<String, String> c(List<User> list) {
        StringBuilder sb;
        StringBuilder sb2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f3344a, false, 47394, new Class[]{List.class}, Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[]{list}, this, f3344a, false, 47394, new Class[]{List.class}, Pair.class);
        } else if (CollectionUtils.isEmpty(list)) {
            return new Pair<>("", "");
        } else {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            for (User next : list) {
                sb3.append(next.getUid());
                sb3.append(",");
                sb4.append(next.getSecUid());
                sb4.append(",");
            }
            if (sb3.length() > 0) {
                sb = new StringBuilder(sb3.substring(0, sb3.length() - 1));
            } else {
                sb = sb3;
            }
            if (sb4.length() > 0) {
                sb2 = new StringBuilder(sb4.substring(0, sb4.length() - 1));
            } else {
                sb2 = sb4;
            }
            return new Pair<>(sb.toString(), sb2.toString());
        }
    }

    public final void a(User user) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{user}, this, f3344a, false, 47388, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3344a, false, 47388, new Class[]{User.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (!NetworkUtils.isNetworkAvailable(this)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
                return;
            }
            if (user.getFollowStatus() != 0) {
                i2 = 1;
            }
            int i3 = i2 ^ 1;
            if (this.f3349f != null) {
                this.f3349f.a(new i.a().a(user.getUid()).b(user.getSecUid()).a(i3).b(1).a());
                if (i3 == 0) {
                    r.onEvent(MobClick.obtain().setEventName("follow_cancel").setLabelName("recommend").setValue(user.getUid()));
                } else {
                    r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("recommend").setValue(user.getUid()));
                    new s().b("recommend").h(user.getUid()).e();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3344a, false, 47386, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3344a, false, 47386, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.RecommendFriendActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.dk);
        this.f3347d = (RecyclerView) findViewById(C0906R.id.cc5);
        this.f3348e = (TextView) findViewById(C0906R.id.dn0);
        this.h = (TextView) findViewById(C0906R.id.cuj);
        this.g = (ImageView) findViewById(C0906R.id.azy);
        this.f3345b = new RecommendFriendAdapter();
        this.f3345b.f49329b = this;
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this);
        wrapLinearLayoutManager.setOrientation(1);
        this.f3347d.setLayoutManager(wrapLinearLayoutManager);
        this.f3347d.setOverScrollMode(2);
        this.f3347d.setHasFixedSize(true);
        this.f3347d.setAdapter(this.f3345b);
        this.f3348e.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.f3349f = new i();
        this.i = b.a();
        showProgressDialog();
        this.i.recommendList(null, null, null, 3, null, Integer.valueOf(e.a()), k.a().b(), Integer.valueOf(e.b()), null).a((g<TResult, TContinuationResult>) new ai<TResult,TContinuationResult>(this), a.i.f1052b);
        this.i.modifyUser(0);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.RecommendFriendActivity", "onCreate", false);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3344a, false, 47389, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3344a, false, 47389, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.dn0) {
            List data = this.f3345b.getData();
            if (PatchProxy.isSupport(new Object[]{1, data}, this, f3344a, false, 47391, new Class[]{Integer.TYPE, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{1, data}, this, f3344a, false, 47391, new Class[]{Integer.TYPE, List.class}, Void.TYPE);
            } else if (CollectionUtils.isEmpty(data)) {
                finish();
            } else {
                Pair<String, String> c2 = c(data);
                this.i.followUsers((String) c2.first, (String) c2.second, 1).c(new aj(this), a.i.f1052b);
                r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("recommend_all"));
                new s().b("recommend_all").e();
            }
            a();
        } else if (id == C0906R.id.cuj) {
            a();
            r.onEvent(MobClick.obtain().setEventName("follow_finish").setLabelName("recommend"));
            b();
            d();
        } else {
            if (id == C0906R.id.azy) {
                a();
                r.onEvent(MobClick.obtain().setEventName("follow_close").setLabelName("recommend"));
                b();
                d();
            }
        }
    }
}
