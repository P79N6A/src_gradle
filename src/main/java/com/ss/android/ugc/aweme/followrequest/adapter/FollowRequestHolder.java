package com.ss.android.ugc.aweme.followrequest.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.followrequest.api.FollowRequestApiManager;
import com.ss.android.ugc.aweme.followrequest.c;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.u.z;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class FollowRequestHolder extends RecyclerView.ViewHolder implements View.OnClickListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48246a;

    /* renamed from: b  reason: collision with root package name */
    User f48247b;

    /* renamed from: c  reason: collision with root package name */
    AvatarImageWithVerify f48248c;

    /* renamed from: d  reason: collision with root package name */
    TextView f48249d;

    /* renamed from: e  reason: collision with root package name */
    TextView f48250e;

    /* renamed from: f  reason: collision with root package name */
    private Activity f48251f;
    private WeakHandler g = new WeakHandler(this);
    private ImageView h;
    private ImageView i;
    private ViewGroup j;
    private a k;

    public interface a {
        void a(User user, int i, int i2);
    }

    public void handleMsg(Message message) {
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48246a, false, 45313, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48246a, false, 45313, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this.f48251f, (int) C0906R.string.bgf).a();
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.avt) {
            if (this.k != null) {
                this.k.a(this.f48247b, getAdapterPosition(), 1);
            }
            WeakHandler weakHandler = this.g;
            String uid = this.f48247b.getUid();
            if (PatchProxy.isSupport(new Object[]{weakHandler, uid}, null, FollowRequestApiManager.f48252a, true, 45315, new Class[]{Handler.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{weakHandler, uid}, null, FollowRequestApiManager.f48252a, true, 45315, new Class[]{Handler.class, String.class}, Void.TYPE);
            } else {
                m.a().a(weakHandler, new Callable(uid) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f48254a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ String f48255b;

                    public final Object call() throws Exception {
                        if (PatchProxy.isSupport(new Object[0], this, f48254a, false, 45317, new Class[0], Object.class)) {
                            return PatchProxy.accessDispatch(new Object[0], this, f48254a, false, 45317, new Class[0], Object.class);
                        }
                        try {
                            return FollowRequestApiManager.f48253b.approveRequest(this.f48255b).get();
                        } catch (ExecutionException e2) {
                            throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e2);
                        }
                    }

                    {
                        this.f48255b = r1;
                    }
                }, 1);
            }
            String uid2 = this.f48247b.getUid();
            if (PatchProxy.isSupport(new Object[]{"message", uid2}, null, c.f48258a, true, 45305, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{"message", uid2}, null, c.f48258a, true, 45305, new Class[]{String.class, String.class}, Void.TYPE);
            } else {
                z.a("follow_approve").a("enter_from", "message").a("to_user_id", uid2).e();
            }
        } else if (id == C0906R.id.axq) {
            if (this.k != null) {
                this.k.a(this.f48247b, getAdapterPosition(), 2);
            }
            WeakHandler weakHandler2 = this.g;
            String uid3 = this.f48247b.getUid();
            if (PatchProxy.isSupport(new Object[]{weakHandler2, uid3}, null, FollowRequestApiManager.f48252a, true, 45316, new Class[]{Handler.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{weakHandler2, uid3}, null, FollowRequestApiManager.f48252a, true, 45316, new Class[]{Handler.class, String.class}, Void.TYPE);
            } else {
                m.a().a(weakHandler2, new Callable(uid3) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f48256a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ String f48257b;

                    public final Object call() throws Exception {
                        if (PatchProxy.isSupport(new Object[0], this, f48256a, false, 45318, new Class[0], Object.class)) {
                            return PatchProxy.accessDispatch(new Object[0], this, f48256a, false, 45318, new Class[0], Object.class);
                        }
                        try {
                            return FollowRequestApiManager.f48253b.rejectRequest(this.f48257b).get();
                        } catch (ExecutionException e2) {
                            throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e2);
                        }
                    }

                    {
                        this.f48257b = r1;
                    }
                }, 2);
            }
            String uid4 = this.f48247b.getUid();
            if (PatchProxy.isSupport(new Object[]{"message", uid4}, null, c.f48258a, true, 45306, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{"message", uid4}, null, c.f48258a, true, 45306, new Class[]{String.class, String.class}, Void.TYPE);
            } else {
                z.a("follow_refuse").a("enter_from", "message").a("to_user_id", uid4).h().e();
            }
        } else if (id == C0906R.id.aw4) {
            h a2 = h.a();
            Activity activity = this.f48251f;
            a2.a(activity, j.a("aweme://user/profile/" + this.f48247b.getUid()).a("sec_user_id", this.f48247b.getSecUid()).a());
            c.a("message", this.f48247b.getUid(), "click_head");
        } else if (id == C0906R.id.awq || id == C0906R.id.aw7) {
            h a3 = h.a();
            Activity activity2 = this.f48251f;
            a3.a(activity2, j.a("aweme://user/profile/" + this.f48247b.getUid()).a("sec_user_id", this.f48247b.getSecUid()).a());
            c.a("message", this.f48247b.getUid(), "click_name");
        } else if (id == C0906R.id.axr) {
            h a4 = h.a();
            Activity activity3 = this.f48251f;
            a4.a(activity3, j.a("aweme://user/profile/" + this.f48247b.getUid()).a("sec_user_id", this.f48247b.getSecUid()).a());
            c.a("message", this.f48247b.getUid(), "click_card");
        }
    }

    public FollowRequestHolder(View view, Activity activity, a aVar) {
        super(view);
        this.f48251f = activity;
        this.j = (ViewGroup) view.findViewById(C0906R.id.axr);
        this.f48248c = (AvatarImageWithVerify) view.findViewById(C0906R.id.aw4);
        this.f48249d = (TextView) view.findViewById(C0906R.id.awq);
        this.f48250e = (TextView) view.findViewById(C0906R.id.aw7);
        this.h = (ImageView) view.findViewById(C0906R.id.avt);
        this.i = (ImageView) view.findViewById(C0906R.id.axq);
        this.k = aVar;
        com.ss.android.ugc.aweme.notification.d.c.a(this.j);
        com.ss.android.ugc.aweme.notification.d.c.a(this.h);
        com.ss.android.ugc.aweme.notification.d.c.a(this.i);
        this.f48248c.setOnClickListener(this);
        this.f48249d.setOnClickListener(this);
        this.f48250e.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.i.setOnClickListener(this);
    }
}
