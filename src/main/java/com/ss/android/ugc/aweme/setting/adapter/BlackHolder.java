package com.ss.android.ugc.aweme.setting.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.f;
import com.ss.android.ugc.aweme.notification.d.c;
import com.ss.android.ugc.aweme.profile.api.BlockApi;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.ss.android.ugc.aweme.profile.model.User;

public class BlackHolder extends RecyclerView.ViewHolder implements View.OnClickListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63794a;

    /* renamed from: b  reason: collision with root package name */
    AvatarImageView f63795b;

    /* renamed from: c  reason: collision with root package name */
    TextView f63796c;

    /* renamed from: d  reason: collision with root package name */
    TextView f63797d;

    /* renamed from: e  reason: collision with root package name */
    View f63798e;

    /* renamed from: f  reason: collision with root package name */
    User f63799f;
    int g;
    int h;
    boolean i;
    private Activity j;
    private Button k;
    private WeakHandler l = new WeakHandler(this);

    private int a() {
        if (this.i) {
            return C0906R.string.nr;
        }
        return C0906R.string.nj;
    }

    private int b() {
        if (this.i) {
            return C0906R.string.dn7;
        }
        return C0906R.string.dn6;
    }

    private int c() {
        if (this.h == 0) {
            return 2130837983;
        }
        return 2130837986;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f63794a, false, 72108, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f63794a, false, 72108, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        BlockApi.a(this.l, this.f63799f.getUid(), z ^ true ? 1 : 0, this.g);
        if (z) {
            f.a("black_list", this.f63799f.getUid());
        } else {
            f.a("black_list", this.f63799f.getUid(), "");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f63794a, false, 72105, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f63794a, false, 72105, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.k.setText(b());
            this.k.setBackgroundResource(c());
            if (this.h == 0) {
                this.k.setTextColor(GlobalContext.getContext().getResources().getColor(C0906R.color.zt));
            } else {
                this.k.setTextColor(GlobalContext.getContext().getResources().getColor(C0906R.color.a17));
            }
        } else {
            this.k.setText(a());
            this.k.setBackgroundResource(2130837968);
            this.k.setTextColor(GlobalContext.getContext().getResources().getColor(C0906R.color.ui));
        }
    }

    public void handleMsg(Message message) {
        int i2;
        int i3;
        boolean z = true;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{message}, this, f63794a, false, 72110, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f63794a, false, 72110, new Class[]{Message.class}, Void.TYPE);
        } else if (!this.j.isFinishing()) {
            int i4 = message.what;
            Object obj = message.obj;
            if (i4 == 31 || i4 == 32) {
                if (obj instanceof a) {
                    com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), ((a) obj).getErrorMsg()).a();
                } else if (obj instanceof Exception) {
                    com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.bga).a();
                } else if (obj instanceof BlockStruct) {
                    if (((BlockStruct) obj).blockStatus != 1) {
                        z = false;
                    }
                    if (i4 == 32) {
                        StoryBlockInfo storyBlockInfo = this.f63799f.getStoryBlockInfo();
                        if (storyBlockInfo == null) {
                            storyBlockInfo = new StoryBlockInfo();
                            this.f63799f.setStoryBlockInfo(storyBlockInfo);
                        }
                        storyBlockInfo.setBlock(z);
                        if (storyBlockInfo != null) {
                            z2 = storyBlockInfo.isBlock();
                        }
                        a(z2);
                        Context context = GlobalContext.getContext();
                        Resources resources = this.j.getResources();
                        if (z) {
                            i3 = C0906R.string.nv;
                        } else {
                            i3 = C0906R.string.dn8;
                        }
                        com.bytedance.ies.dmt.ui.d.a.b(context, resources.getString(i3)).a();
                    } else {
                        this.f63799f.setBlock(z);
                        Context context2 = GlobalContext.getContext();
                        Resources resources2 = this.j.getResources();
                        if (z) {
                            i2 = C0906R.string.eo;
                        } else {
                            i2 = C0906R.string.dn6;
                        }
                        com.bytedance.ies.dmt.ui.d.a.b(context2, resources2.getString(i2)).a();
                        a(this.f63799f.isBlock());
                    }
                    com.ss.android.ugc.aweme.base.livedata.a.a().a("aweme.main.profile.more_page_user_info_change", User.class).postValue(this.f63799f);
                }
            }
        }
    }

    public void onClick(View view) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{view}, this, f63794a, false, 72106, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f63794a, false, 72106, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
            com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.bgf).a();
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.lb) {
            if (PatchProxy.isSupport(new Object[0], this, f63794a, false, 72109, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63794a, false, 72109, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (this.i) {
                StoryBlockInfo storyBlockInfo = this.f63799f.getStoryBlockInfo();
                if (storyBlockInfo == null) {
                    z = false;
                } else {
                    z = storyBlockInfo.isBlock();
                }
            } else {
                z = this.f63799f.isBlock();
            }
            if (!z) {
                if (PatchProxy.isSupport(new Object[0], this, f63794a, false, 72107, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f63794a, false, 72107, new Class[0], Void.TYPE);
                } else if (this.j != null && !this.j.isFinishing()) {
                    new a.C0185a(this.j).b((int) C0906R.string.aph).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) new a(this)).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a().a();
                }
            } else {
                b(true);
            }
        } else if (id == C0906R.id.lf) {
            h a2 = h.a();
            Activity activity = this.j;
            a2.a(activity, j.a("aweme://user/profile/" + this.f63799f.getUid()).a("sec_user_id", this.f63799f.getSecUid()).a());
        }
    }

    public BlackHolder(View view, Activity activity) {
        super(view);
        this.j = activity;
        this.f63795b = (AvatarImageView) view.findViewById(C0906R.id.lc);
        this.f63796c = (TextView) view.findViewById(C0906R.id.ld);
        this.f63797d = (TextView) view.findViewById(C0906R.id.le);
        this.f63798e = view.findViewById(C0906R.id.lf);
        this.k = (Button) view.findViewById(C0906R.id.lb);
        c.a(this.f63798e);
        c.a(this.k);
        this.f63798e.setOnClickListener(this);
        this.k.setOnClickListener(this);
    }
}
