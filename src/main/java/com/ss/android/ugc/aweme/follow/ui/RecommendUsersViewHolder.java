package com.ss.android.ugc.aweme.follow.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.api.a.a;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.presenter.c;
import com.ss.android.ugc.aweme.discover.presenter.f;
import com.ss.android.ugc.aweme.discover.presenter.g;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.permission.e;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class RecommendUsersViewHolder extends RecyclerView.ViewHolder implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47829a;

    /* renamed from: b  reason: collision with root package name */
    public List<User> f47830b;

    /* renamed from: c  reason: collision with root package name */
    public RecommendUserView f47831c;

    /* renamed from: d  reason: collision with root package name */
    public RecommendUserView f47832d;

    /* renamed from: e  reason: collision with root package name */
    g f47833e = new g();

    /* renamed from: f  reason: collision with root package name */
    public RecommendList f47834f;
    private View g;
    private Context h;

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f47829a, false, 44739, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f47829a, false, 44739, new Class[0], String.class);
        } else if (this.f47830b == null) {
            return "";
        } else {
            int size = this.f47830b.size();
            if (size <= 0) {
                return "";
            }
            if (size == 1) {
                return this.f47830b.get(0).getUid();
            }
            if (size < 2) {
                return "";
            }
            return this.f47830b.get(0).getUid() + "," + this.f47830b.get(1).getUid();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f47829a, false, 44740, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47829a, false, 44740, new Class[0], Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rec_user_id", a());
        } catch (JSONException unused) {
        }
        r.onEvent(MobClick.obtain().setEventName("rec_card").setLabelName("homepage_follow").setJsonObject(jSONObject));
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f47829a, false, 44741, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f47829a, false, 44741, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a.a(this.h, (Throwable) exc2);
    }

    public RecommendUsersViewHolder(View view) {
        super(view);
        this.h = view.getContext();
        this.f47831c = (RecommendUserView) view.findViewById(C0906R.id.dox);
        this.f47832d = (RecommendUserView) view.findViewById(C0906R.id.doy);
        this.g = view.findViewById(C0906R.id.fa);
        this.g.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47835a;

            public final void onClick(View view) {
                int i;
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f47835a, false, 44744, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f47835a, false, 44744, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                RecommendUsersViewHolder recommendUsersViewHolder = RecommendUsersViewHolder.this;
                if (PatchProxy.isSupport(new Object[]{view2}, recommendUsersViewHolder, RecommendUsersViewHolder.f47829a, false, 44743, new Class[]{View.class}, Void.TYPE)) {
                    RecommendUsersViewHolder recommendUsersViewHolder2 = recommendUsersViewHolder;
                    PatchProxy.accessDispatch(new Object[]{view2}, recommendUsersViewHolder2, RecommendUsersViewHolder.f47829a, false, 44743, new Class[]{View.class}, Void.TYPE);
                } else if (view2 != null) {
                    view.animate().scaleX(1.05f).scaleY(1.05f).setDuration(100).withEndAction(new Runnable(view2) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f47840a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ View f47841b;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f47840a, false, 44746, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f47840a, false, 44746, new Class[0], Void.TYPE);
                                return;
                            }
                            this.f47841b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150).start();
                        }

                        {
                            this.f47841b = r2;
                        }
                    }).start();
                }
                if (RecommendUsersViewHolder.this.f47834f == null) {
                    i = 2;
                } else {
                    i = RecommendUsersViewHolder.this.f47834f.cursor;
                }
                RecommendUsersViewHolder.this.f47833e.a(2, Integer.valueOf(i), Integer.valueOf(e.a()), Integer.valueOf(e.b()));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("rec_user_id", RecommendUsersViewHolder.this.a());
                    r.onEvent(MobClick.obtain().setEventName("refresh_rec_user").setLabelName("homepage_follow").setJsonObject(jSONObject));
                } catch (JSONException unused) {
                }
            }
        });
        this.f47833e.a(new f());
        this.f47833e.a(this);
    }

    public final void a(RecommendList recommendList) {
        if (PatchProxy.isSupport(new Object[]{recommendList}, this, f47829a, false, 44742, new Class[]{RecommendList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendList}, this, f47829a, false, 44742, new Class[]{RecommendList.class}, Void.TYPE);
            return;
        }
        this.f47834f = recommendList;
        final List<User> userList = recommendList.getUserList();
        if (userList == null) {
            com.bytedance.ies.dmt.ui.d.a.c(this.h, this.h.getString(C0906R.string.bhn)).a();
            return;
        }
        this.f47830b = userList;
        switch (userList.size()) {
            case 0:
                com.bytedance.ies.dmt.ui.d.a.c(this.h, this.h.getString(C0906R.string.bhn)).a();
                return;
            case 1:
                this.f47831c.a(userList.get(0));
                break;
            default:
                this.f47831c.a(userList.get(0));
                this.f47832d.postDelayed(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f47837a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f47837a, false, 44745, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f47837a, false, 44745, new Class[0], Void.TYPE);
                            return;
                        }
                        RecommendUsersViewHolder.this.f47832d.a((User) userList.get(1));
                    }
                }, 100);
                break;
        }
        b();
    }
}
