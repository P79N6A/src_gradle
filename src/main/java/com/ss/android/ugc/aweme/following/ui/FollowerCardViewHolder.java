package com.ss.android.ugc.aweme.following.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.following.ui.SimpleUserFragment;
import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.FansAdapter;
import com.ss.android.ugc.aweme.profile.ui.y;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;

public class FollowerCardViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47984a;

    /* renamed from: b  reason: collision with root package name */
    private FansAdapter f47985b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f47986c;

    /* renamed from: d  reason: collision with root package name */
    private Context f47987d;

    /* renamed from: e  reason: collision with root package name */
    private b f47988e;

    /* renamed from: f  reason: collision with root package name */
    private User f47989f;
    @BindView(2131494227)
    RecyclerView fansRecyclerView;
    private int g;
    private List<FollowerDetail> h;
    private boolean i;
    @BindView(2131497910)
    DmtTextView tvFansSum;

    public final View b() {
        return this.itemView;
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f47984a, false, 44919, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47984a, false, 44919, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.i && this.f47989f != null && !this.f47989f.isBlock() && !this.f47989f.isBlocked()) {
            z = true;
        }
        return z;
    }

    public final void a() {
        boolean z;
        boolean z2;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f47984a, false, 44918, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47984a, false, 44918, new Class[0], Void.TYPE);
        } else if (this.f47989f != null) {
            if (PatchProxy.isSupport(new Object[0], this, f47984a, false, 44916, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47984a, false, 44916, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (a.a() || !y.a(this.f47988e.getUser()) || this.f47988e.getPageType() != SimpleUserFragment.b.follower) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.f47985b == null) {
                    FansAdapter fansAdapter = new FansAdapter(this.f47987d, this.g, this.h, this.f47986c, this.f47989f);
                    this.f47985b = fansAdapter;
                    this.fansRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this.f47987d, 0, false));
                    this.fansRecyclerView.setAdapter(this.f47985b);
                }
                this.f47985b.notifyDataSetChanged();
                r.onEvent(MobClick.obtain().setEventName("fans_show_from_fans_power").setLabelName("others_fans_page"));
                this.i = true;
            }
            if (PatchProxy.isSupport(new Object[0], this, f47984a, false, 44915, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47984a, false, 44915, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z2 = d.a().getCurUserId().equals(this.f47988e.getUid());
            }
            if (z2 && !a.b()) {
                if (PatchProxy.isSupport(new Object[0], this, f47984a, false, 44917, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f47984a, false, 44917, new Class[0], Void.TYPE);
                } else if (this.f47989f != null) {
                    if (y.a(this.f47989f)) {
                        i2 = this.f47989f.getFansCount();
                    } else {
                        i2 = this.f47989f.getFollowerCount();
                    }
                    if (i2 >= 10000) {
                        this.tvFansSum.setVisibility(0);
                        if (!a.a()) {
                            String format = new DecimalFormat("#,####").format((long) i2);
                            this.tvFansSum.setText(this.f47987d.getString(C0906R.string.adb, new Object[]{format}));
                        } else if (a.c()) {
                            String format2 = String.format(Locale.getDefault(), "%,d", new Object[]{Integer.valueOf(i2)});
                            this.tvFansSum.setText(this.f47987d.getString(C0906R.string.adb, new Object[]{format2}));
                        }
                        this.i = true;
                    }
                }
            }
        }
    }

    public FollowerCardViewHolder(View view, b bVar) {
        super(view);
        int i2;
        ButterKnife.bind((Object) this, view);
        this.f47987d = view.getContext();
        this.f47988e = bVar;
        this.f47989f = bVar.getUser();
        this.f47986c = bVar.isMine();
        if (this.f47989f != null) {
            this.h = y.a(this.f47989f.getFollowerDetailList());
        }
        if (CollectionUtils.isEmpty(this.h)) {
            i2 = 0;
        } else {
            i2 = this.h.size() + 3;
        }
        this.g = i2;
    }
}
