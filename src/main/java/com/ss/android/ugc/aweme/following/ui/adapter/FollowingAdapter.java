package com.ss.android.ugc.aweme.following.ui.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.following.ui.SimpleUserFragment;
import com.ss.android.ugc.aweme.following.ui.b;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.profile.d.ae;
import com.ss.android.ugc.aweme.profile.d.s;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.y;
import com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.HashMap;
import java.util.Map;

public class FollowingAdapter extends RecyclerHeaderViewAdapter<User> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f48095f = null;
    public static final String i = "FollowingAdapter";
    public boolean g;
    public a h;
    protected b j;
    public boolean k;
    public boolean l = (!a.a());
    public HashMap<String, Boolean> m = new HashMap<>();
    public LifecycleOwner n;

    class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48098a;

        /* renamed from: b  reason: collision with root package name */
        com.ss.android.ugc.aweme.follow.widet.a f48099b;

        /* renamed from: c  reason: collision with root package name */
        FollowViewModel f48100c;
        @BindView(2131495017)
        View editRemark;
        @BindView(2131494950)
        AvatarImageWithVerify ivAvatar;
        @BindView(2131495790)
        View more;
        @BindView(2131498265)
        TextView txtDesc;
        @BindView(2131498269)
        FollowUserBtn txtFollow;
        @BindView(2131498296)
        TextView txtUserName;

        private static boolean a(int i) {
            return i == 1 || i == 2;
        }

        public final void a(final User user) {
            if (PatchProxy.isSupport(new Object[]{user}, this, f48098a, false, 45112, new Class[]{User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user}, this, f48098a, false, 45112, new Class[]{User.class}, Void.TYPE);
                return;
            }
            this.itemView.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48102a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f48102a, false, 45123, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f48102a, false, 45123, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    FollowingAdapter.this.h.a(user, ViewHolder.this.getAdapterPosition());
                }
            });
            this.ivAvatar.setData(user);
            a(user, user.getFollowStatus());
            b(user, user.getFollowStatus());
            this.f48099b.f47851d = new b(this, user);
            if (!((Boolean) SharePrefCache.inst().getRemoveFollowerSwitch().c()).booleanValue() || !FollowingAdapter.this.j.isMine() || FollowingAdapter.this.j == null || FollowingAdapter.this.j.getPageType() != SimpleUserFragment.b.follower) {
                this.more.getLayoutParams().width = 0;
            } else {
                Resources resources = this.more.getResources();
                this.more.setOnClickListener(new c(this, new CharSequence[]{resources.getString(C0906R.string.byz), resources.getString(C0906R.string.pm)}, user, resources));
                this.more.getLayoutParams().width = -2;
            }
            this.f48099b.a(user);
        }

        ViewHolder(View view) {
            super(view);
            a.c cVar;
            ButterKnife.bind((Object) this, view);
            FollowUserBtn followUserBtn = this.txtFollow;
            if (PatchProxy.isSupport(new Object[0], FollowingAdapter.this, FollowingAdapter.f48095f, false, 45107, new Class[0], a.c.class)) {
                cVar = (a.c) PatchProxy.accessDispatch(new Object[0], FollowingAdapter.this, FollowingAdapter.f48095f, false, 45107, new Class[0], a.c.class);
            } else {
                cVar = new a.c() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f48096a;

                    public final String b() {
                        return "click_follow";
                    }

                    public final String a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f48096a, false, 45110, new Class[0], String.class)) {
                            return FollowingAdapter.this.b(FollowingAdapter.this.j);
                        }
                        return (String) PatchProxy.accessDispatch(new Object[0], this, f48096a, false, 45110, new Class[0], String.class);
                    }

                    public final int c() {
                        int i = 0;
                        if (PatchProxy.isSupport(new Object[0], this, f48096a, false, 45111, new Class[0], Integer.TYPE)) {
                            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48096a, false, 45111, new Class[0], Integer.TYPE)).intValue();
                        }
                        if (FollowingAdapter.this.j.isMine()) {
                            if (FollowingAdapter.this.j.getPageType() == SimpleUserFragment.b.follower) {
                                i = 9;
                            }
                        } else if (FollowingAdapter.this.j.getPageType() == SimpleUserFragment.b.follower) {
                            i = 11;
                        } else {
                            i = 10;
                        }
                        return i;
                    }

                    public final void a(int i, User user) {
                        String str;
                        String str2;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), user}, this, f48096a, false, 45109, new Class[]{Integer.TYPE, User.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), user}, this, f48096a, false, 45109, new Class[]{Integer.TYPE, User.class}, Void.TYPE);
                            return;
                        }
                        MobClick obtain = MobClick.obtain();
                        if (i == 1) {
                            str = "follow";
                        } else {
                            str = "follow_cancel";
                        }
                        r.onEvent(obtain.setEventName(str).setLabelName(FollowingAdapter.this.b(FollowingAdapter.this.j)).setValue(String.valueOf(user.getUid())));
                        if (i == 1) {
                            d a2 = d.a().a("enter_from", FollowingAdapter.this.b(FollowingAdapter.this.j)).a("to_user_id", user.getUid());
                            if (FollowingAdapter.this.j.isMine()) {
                                str2 = "personal_homepage";
                            } else {
                                str2 = "others_homepage";
                            }
                            r.a("follow", (Map) a2.a("previous_page", str2).a("previous_page_position", "other_places").a("enter_method", "follow_button").b().f34114b);
                        }
                    }
                };
            }
            this.f48099b = new com.ss.android.ugc.aweme.follow.widet.a(followUserBtn, cVar);
        }

        /* access modifiers changed from: package-private */
        public void b(final User user, int i) {
            if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f48098a, false, 45115, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f48098a, false, 45115, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (AbTestManager.a().bc() == 2 || AbTestManager.a().bc() == 3) {
                if (FollowingAdapter.this.m != null && FollowingAdapter.this.m.get(user.getUid()) != null) {
                    s.a(user, i, this.editRemark, "fans", FollowingAdapter.this.m.get(user.getUid()).booleanValue(), (s.a) new s.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f48105a;

                        public final void b() {
                        }

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f48105a, false, 45124, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f48105a, false, 45124, new Class[0], Void.TYPE);
                                return;
                            }
                            ViewHolder.this.a(user, user.getFollowStatus());
                        }
                    });
                    FollowingAdapter.this.m.put(user.getUid(), Boolean.FALSE);
                } else if (this.editRemark != null) {
                    this.editRemark.setVisibility(8);
                }
            }
        }

        public final void a(User user, int i) {
            boolean z;
            boolean z2;
            if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f48098a, false, 45114, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f48098a, false, 45114, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.txtDesc.setVisibility(0);
            if (com.ss.android.g.a.b()) {
                this.txtUserName.setText(user.getNickname());
                this.txtDesc.setText("@" + ae.a(user));
                return;
            }
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                this.txtUserName.setText(user.getRemarkName());
                this.txtDesc.setText(this.itemView.getContext().getResources().getString(C0906R.string.agc, new Object[]{user.getNickname()}));
                z2 = false;
                z = true;
            } else {
                this.txtUserName.setText(user.getNickname());
                if (TextUtils.isEmpty(user.getSignature())) {
                    if (FollowingAdapter.this.l) {
                        this.txtDesc.setVisibility(8);
                    } else {
                        this.txtDesc.setText(C0906R.string.c8g);
                    }
                    z2 = false;
                } else {
                    this.txtDesc.setText(user.getSignature());
                    z2 = true;
                }
                z = false;
            }
            if (FollowingAdapter.this.g) {
                boolean z3 = !TextUtils.isEmpty(user.getRecommendReason());
                if (a(i) || !z3) {
                    this.txtDesc.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    if (!z3 || FollowingAdapter.this.m == null || FollowingAdapter.this.m.get(user.getUid()) == null) {
                        if (z2) {
                            this.txtDesc.setText("");
                            this.txtDesc.setVisibility(8);
                        }
                    } else if (!z) {
                        this.txtDesc.setText(user.getRecommendReason());
                        this.txtDesc.setCompoundDrawablesWithIntrinsicBounds(2130839790, 0, 0, 0);
                        UIUtils.setViewVisibility(this.txtDesc, 0);
                    }
                } else {
                    this.txtDesc.setText(user.getRecommendReason());
                    this.txtDesc.setCompoundDrawablesWithIntrinsicBounds(2130839790, 0, 0, 0);
                    UIUtils.setViewVisibility(this.txtDesc, 0);
                }
            }
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48108a;

        /* renamed from: b  reason: collision with root package name */
        private ViewHolder f48109b;

        @CallSuper
        public void unbind() {
            if (PatchProxy.isSupport(new Object[0], this, f48108a, false, 45125, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48108a, false, 45125, new Class[0], Void.TYPE);
                return;
            }
            ViewHolder viewHolder = this.f48109b;
            if (viewHolder != null) {
                this.f48109b = null;
                viewHolder.ivAvatar = null;
                viewHolder.txtUserName = null;
                viewHolder.txtDesc = null;
                viewHolder.txtFollow = null;
                viewHolder.editRemark = null;
                viewHolder.more = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        @UiThread
        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f48109b = viewHolder;
            viewHolder.ivAvatar = (AvatarImageWithVerify) Utils.findRequiredViewAsType(view, C0906R.id.ayr, "field 'ivAvatar'", AvatarImageWithVerify.class);
            viewHolder.txtUserName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dnq, "field 'txtUserName'", TextView.class);
            viewHolder.txtDesc = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dmv, "field 'txtDesc'", TextView.class);
            viewHolder.txtFollow = (FollowUserBtn) Utils.findRequiredViewAsType(view, C0906R.id.dmz, "field 'txtFollow'", FollowUserBtn.class);
            viewHolder.editRemark = Utils.findRequiredView(view, C0906R.id.b0u, "field 'editRemark'");
            viewHolder.more = Utils.findRequiredView(view, C0906R.id.bnh, "field 'more'");
        }
    }

    public FollowingAdapter(LifecycleOwner lifecycleOwner) {
        this.n = lifecycleOwner;
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f48095f, false, 45102, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f48095f, false, 45102, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f48095f, false, 45103, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f48095f, false, 45103, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
    }

    private int b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f48095f, false, 45104, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f48095f, false, 45104, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (getBasicItemCount() == 0) {
            return -1;
        } else {
            int size = this.mItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                User user = (User) this.mItems.get(i2);
                if (user != null && TextUtils.equals(user.getUid(), str)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    public final int a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f48095f, false, 45106, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f48095f, false, 45106, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        int b2 = b(str);
        if (b2 != -1 && c()) {
            b2++;
        }
        return b2;
    }

    public final String b(b bVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f48095f, false, 45108, new Class[]{b.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{bVar}, this, f48095f, false, 45108, new Class[]{b.class}, String.class);
        }
        if (bVar.isMine()) {
            if (bVar.getPageType() == SimpleUserFragment.b.follower) {
                str = "fans";
            } else {
                str = "following";
            }
        } else if (bVar.getPageType() == SimpleUserFragment.b.follower) {
            str = "other_fans";
        } else {
            str = "other_following";
        }
        return str;
    }

    public final void a(b bVar) {
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f48095f, false, 45099, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f48095f, false, 45099, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.j = bVar;
        if (!y.a(bVar.getUser()) || bVar.getPageType() != SimpleUserFragment.b.follower) {
            z = false;
        } else {
            z = true;
        }
        this.k = z;
        if (bVar.isMine()) {
            if (!AbTestManager.a().bk() || com.ss.android.g.a.a() || bVar.getPageType() != SimpleUserFragment.b.follower) {
                z2 = false;
            }
            this.g = z2;
            return;
        }
        if (!AbTestManager.a().bk() || com.ss.android.g.a.a()) {
            z2 = false;
        }
        this.g = z2;
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f48095f, false, 45101, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f48095f, false, 45101, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.uy, viewGroup2, false));
    }

    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f48095f, false, 45100, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f48095f, false, 45100, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ((ViewHolder) viewHolder).a((User) this.mItems.get(i2));
    }
}
