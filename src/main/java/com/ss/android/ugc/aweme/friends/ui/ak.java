package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.base.activity.h;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.friends.adapter.DividerItemDecoration;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeAdapter;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.profile.d.q;
import com.ss.android.ugc.aweme.profile.d.r;
import com.ss.android.ugc.aweme.profile.d.s;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.HashMap;

public class ak extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49408a;

    /* renamed from: b  reason: collision with root package name */
    protected TextView f49409b;

    /* renamed from: c  reason: collision with root package name */
    protected AvatarImageWithVerify f49410c;

    /* renamed from: d  reason: collision with root package name */
    protected TextView f49411d;

    /* renamed from: e  reason: collision with root package name */
    protected FollowUserBtn f49412e;

    /* renamed from: f  reason: collision with root package name */
    protected TextView f49413f;
    public h<User> g;
    public int h;
    public String i;
    public int j;
    protected int k;
    private User l;
    private View m;
    private RecyclerView n;
    private View o;
    private ImageView p;
    private LinearLayout q;
    private q r;
    private RelativeUserAvatarListView s;
    private int t;
    private RecommendAwemeViewHolder.a u;
    private boolean v;
    private HashMap<String, Boolean> w;
    private a x;

    public int getLayoutId() {
        return C0906R.layout.zf;
    }

    public User getData() {
        return this.l;
    }

    private String getUserInfo() {
        if (PatchProxy.isSupport(new Object[0], this, f49408a, false, 47407, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49408a, false, 47407, new Class[0], String.class);
        }
        return getContext().getString(C0906R.string.du7) + ":" + b.a((long) this.l.getAwemeCount()) + "  " + getContext().getString(C0906R.string.agu) + ":" + b.a((long) this.l.getFollowerCount());
    }

    public void setEnterFrom(String str) {
        this.i = str;
    }

    public void setFollowFromType(int i2) {
        this.j = i2;
    }

    public void setListener(h<User> hVar) {
        this.g = hVar;
    }

    public void setPositionInApiList(int i2) {
        this.h = i2;
    }

    public void setRecommendAwemeClickListener(RecommendAwemeViewHolder.a aVar) {
        this.u = aVar;
    }

    public void setRecommendUserType(int i2) {
        this.k = i2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(FollowStatus followStatus) {
        if (followStatus != null) {
            this.w.put(this.l.getUid(), Boolean.TRUE);
            a(this.l, followStatus.followStatus);
            if (this.v) {
                if (followStatus.followStatus == 0) {
                    this.p.setVisibility(0);
                    return;
                }
                this.p.setVisibility(4);
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f49408a, false, 47408, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f49408a, false, 47408, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f49412e.a(i2, this.l.getFollowerStatus());
    }

    public void setNewFriendRecommendMask(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49408a, false, 47413, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49408a, false, 47413, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = this.m;
        if (!z) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public void setData(final User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f49408a, false, 47409, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f49408a, false, 47409, new Class[]{User.class}, Void.TYPE);
        } else if (user != null) {
            this.l = user;
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                this.f49409b.setText(user.getRemarkName());
            } else {
                this.f49409b.setText(user.getNickname());
            }
            this.f49410c.setData(user);
            a(user, user.getFollowStatus());
            this.x.f47851d = new al(this);
            this.x.a(user);
            setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49416a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49416a, false, 47417, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49416a, false, 47417, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (ak.this.g != null) {
                        ak.this.g.a(BaseLoginOrRegisterActivity.o, user, ak.this.h, ak.this, "click_head");
                    }
                }
            });
            if (this.v) {
                if (user.getFollowStatus() == 0) {
                    this.p.setVisibility(0);
                } else {
                    this.p.setVisibility(4);
                }
                this.p.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49419a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f49419a, false, 47418, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f49419a, false, 47418, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        if (ak.this.g != null) {
                            ak.this.g.a(102, user, ak.this.h, ak.this, "");
                        }
                    }
                });
            }
            this.f49409b.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49422a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49422a, false, 47419, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49422a, false, 47419, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (ak.this.g != null) {
                        ak.this.g.a(BaseLoginOrRegisterActivity.o, user, ak.this.h, ak.this, "click_name");
                    }
                }
            });
            if (!CollectionUtils.isEmpty(user.getRecommendAwemeItems())) {
                this.n.setVisibility(0);
                RecommendAwemeAdapter recommendAwemeAdapter = new RecommendAwemeAdapter();
                recommendAwemeAdapter.f48746c = this.u;
                recommendAwemeAdapter.setData(user.getRecommendAwemeItems());
                recommendAwemeAdapter.f48745b = this.h;
                this.n.setAdapter(recommendAwemeAdapter);
            } else {
                this.n.setVisibility(8);
            }
            if (AbTestManager.a().d().isRecommendItemShowMoreInfo) {
                TextView textView = this.f49413f;
                if (PatchProxy.isSupport(new Object[]{user, textView}, this, f49408a, false, 47410, new Class[]{User.class, TextView.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{user, textView}, this, f49408a, false, 47410, new Class[]{User.class, TextView.class}, Void.TYPE);
                } else if (textView != null) {
                    this.s.setVisibility(0);
                    textView.setMaxLines(2);
                    a(user, textView);
                    this.s.a(user, textView);
                }
                if (PatchProxy.isSupport(new Object[]{user}, this, f49408a, false, 47406, new Class[]{User.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{user}, this, f49408a, false, 47406, new Class[]{User.class}, Void.TYPE);
                } else {
                    this.r.a(user, this.t);
                }
            } else {
                a(user, this.f49413f);
                a(this.f49411d, user);
            }
        }
    }

    public ak(Context context, HashMap<String, Boolean> hashMap) {
        this(context, (AttributeSet) null, hashMap);
    }

    private void a(User user, int i2) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i2)}, this, f49408a, false, 47412, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i2)}, this, f49408a, false, 47412, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().bc() == 2 || AbTestManager.a().bc() == 3) {
            if (this.w != null && this.w.get(user.getUid()) != null) {
                s.a(user, i2, this.f49409b, this.o, "find_friends", this.w.get(user.getUid()).booleanValue());
                this.w.put(user.getUid(), Boolean.FALSE);
            } else if (this.o != null) {
                this.o.setVisibility(8);
            }
        }
    }

    public final void a(TextView textView, User user) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2, user}, this, f49408a, false, 47414, new Class[]{TextView.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, user}, this, f49408a, false, 47414, new Class[]{TextView.class, User.class}, Void.TYPE);
            return;
        }
        textView2.setVisibility(0);
        textView2.setText(getUserInfo());
    }

    public final void a(User user, TextView textView) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{user, textView2}, this, f49408a, false, 47411, new Class[]{User.class, TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, textView2}, this, f49408a, false, 47411, new Class[]{User.class, TextView.class}, Void.TYPE);
            return;
        }
        textView2.setVisibility(0);
        if (!TextUtils.isEmpty(user.getRecommendReason())) {
            textView2.setText(user.getRecommendReason());
        } else if (!TextUtils.isEmpty(user.getSignature())) {
            textView2.setText(user.getSignature());
        } else if (com.ss.android.g.a.a()) {
            textView2.setText(C0906R.string.c8h);
        } else {
            textView2.setVisibility(8);
        }
    }

    private ak(Context context, @Nullable AttributeSet attributeSet, HashMap<String, Boolean> hashMap) {
        this(context, null, 0, hashMap, false);
    }

    public ak(Context context, HashMap<String, Boolean> hashMap, boolean z) {
        this(context, null, 0, hashMap, z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ak(Context context, @Nullable AttributeSet attributeSet, int i2, HashMap<String, Boolean> hashMap, boolean z) {
        super(context, attributeSet, 0);
        Context context2;
        float f2;
        boolean z2 = false;
        this.i = "";
        this.j = 12;
        this.w = new HashMap<>();
        this.k = 0;
        LayoutInflater.from(context).inflate(getLayoutId(), this);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        this.f49409b = (TextView) findViewById(C0906R.id.dnq);
        this.f49410c = (AvatarImageWithVerify) findViewById(C0906R.id.ayr);
        this.f49411d = (TextView) findViewById(C0906R.id.dn1);
        this.f49412e = (FollowUserBtn) findViewById(C0906R.id.o2);
        this.f49413f = (TextView) findViewById(C0906R.id.dau);
        this.o = findViewById(C0906R.id.b0u);
        this.p = (ImageView) findViewById(C0906R.id.az7);
        this.m = findViewById(C0906R.id.bqb);
        this.n = (RecyclerView) findViewById(C0906R.id.bcv);
        this.n.addItemDecoration(new DividerItemDecoration(0, (int) UIUtils.dip2Px(this.n.getContext(), 4.0f), 0));
        this.n.setLayoutManager(new RecommendFriendItemViewV2$1(this, this.n.getContext(), 0, false));
        this.w = hashMap;
        if (AbTestManager.a().C() && z) {
            z2 = true;
        }
        this.v = z2;
        if (!this.v) {
            this.p.setVisibility(8);
        }
        this.x = new a(this.f49412e, new a.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49414a;

            public final String a() {
                return ak.this.i;
            }

            public final int c() {
                return ak.this.j;
            }

            public final void a(int i, User user) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), user}, this, f49414a, false, 47416, new Class[]{Integer.TYPE, User.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), user}, this, f49414a, false, 47416, new Class[]{Integer.TYPE, User.class}, Void.TYPE);
                    return;
                }
                if (ak.this.g != null) {
                    ak.this.g.a(100, user, ak.this.h, ak.this, "");
                }
            }
        });
        this.q = (LinearLayout) findViewById(C0906R.id.czc);
        float screenWidth = (float) UIUtils.getScreenWidth(getContext());
        if (this.v) {
            context2 = getContext();
            f2 = 210.0f;
        } else {
            context2 = getContext();
            f2 = 185.0f;
        }
        this.t = (int) (screenWidth - UIUtils.dip2Px(context2, f2));
        this.r = new r(this.q, this.t);
        this.s = (RelativeUserAvatarListView) findViewById(C0906R.id.cd2);
    }
}
