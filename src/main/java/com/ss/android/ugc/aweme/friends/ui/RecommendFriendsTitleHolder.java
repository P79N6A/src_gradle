package com.ss.android.ugc.aweme.friends.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity;
import com.ss.android.ugc.aweme.following.ui.SimpleUserFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.HashMap;
import java.util.Map;

public class RecommendFriendsTitleHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49335a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f49336b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f49337c;

    /* renamed from: d  reason: collision with root package name */
    public View f49338d;

    /* renamed from: e  reason: collision with root package name */
    private View f49339e;

    /* renamed from: f  reason: collision with root package name */
    private View f49340f;
    private TextView g;
    private View h;
    private TextView i;

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f49335a, false, 47433, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49335a, false, 47433, new Class[0], Void.TYPE);
            return;
        }
        this.i.setVisibility(8);
        this.h.setVisibility(8);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f49335a, false, 47432, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49335a, false, 47432, new Class[0], Void.TYPE);
        } else if (a.b()) {
            b();
        } else {
            this.f49340f.setVisibility(4);
        }
    }

    public RecommendFriendsTitleHolder(View view) {
        super(view);
        this.f49339e = view.findViewById(C0906R.id.bqb);
        this.f49340f = view.findViewById(C0906R.id.bqd);
        this.h = view.findViewById(C0906R.id.bqc);
        this.i = (TextView) view.findViewById(C0906R.id.bqa);
        this.g = (TextView) view.findViewById(C0906R.id.dnm);
        this.f49337c = (TextView) view.findViewById(C0906R.id.eh);
        this.f49338d = view.findViewById(C0906R.id.c6a);
        if (PatchProxy.isSupport(new Object[0], this, f49335a, false, 47429, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49335a, false, 47429, new Class[0], Void.TYPE);
            return;
        }
        this.f49337c.setOnTouchListener(new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49341a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f49341a, false, 47434, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f49341a, false, 47434, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            view2.setAlpha(0.5f);
                            break;
                        case 1:
                            break;
                    }
                }
                view2.setAlpha(1.0f);
                return false;
            }
        });
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f49335a, false, 47431, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f49335a, false, 47431, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i.setText(String.valueOf(i2));
        this.i.setVisibility(0);
        this.h.setVisibility(0);
    }

    public final void a(boolean z, int i2, int i3, boolean z2, String str) {
        int i4;
        TextView textView;
        boolean z3 = z;
        int i5 = i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z2 ? (byte) 1 : 0), str}, this, f49335a, false, 47430, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z2), str}, this, f49335a, false, 47430, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.f49336b = z3;
        if (z2) {
            textView = this.g;
            i4 = C0906R.string.afu;
        } else {
            textView = this.g;
            if (z3) {
                i4 = C0906R.string.bgt;
            } else {
                i4 = C0906R.string.ee;
            }
        }
        textView.setText(i4);
        if (a.b()) {
            this.f49339e.setVisibility(8);
            this.f49340f.setVisibility(4);
            if (z3) {
                a(i3);
            } else {
                b();
            }
        } else {
            b();
            if (!z3 || i5 == 5 || i5 == 6) {
                this.f49339e.setVisibility(8);
                this.f49340f.setVisibility(4);
            } else if (z2) {
                this.f49339e.setVisibility(8);
                this.f49340f.setVisibility(8);
            } else {
                this.f49339e.setVisibility(0);
                this.f49340f.setVisibility(0);
            }
            if (z2) {
                this.f49337c.setVisibility(0);
                this.f49337c.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49343a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f49343a, false, 47435, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f49343a, false, 47435, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        User curUser = d.a().getCurUser();
                        FollowingFollowerActivity.a aVar = new FollowingFollowerActivity.a(RecommendFriendsTitleHolder.this.f49337c.getContext(), null, d.a().getCurUserId(), true, SimpleUserFragment.b.follower, 1);
                        aVar.a(curUser).a();
                    }
                });
            } else {
                this.f49337c.setOnClickListener(null);
                this.f49337c.setVisibility(8);
            }
            if (!AbTestManager.a().bA()) {
                this.f49338d.setVisibility(8);
                return;
            }
            if (!z2) {
                this.f49338d.setVisibility(0);
                this.f49338d.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49345a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f49345a, false, 47436, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f49345a, false, 47436, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        HashMap hashMap = new HashMap();
                        hashMap.put("enter_from", "find_friends");
                        r.a("click_privacy_tips", (Map) hashMap);
                        String str = (String) SharePrefCache.inst().getPrivacyReminderH5Url().c();
                        if (str != null) {
                            Intent intent = new Intent(RecommendFriendsTitleHolder.this.f49338d.getContext(), CrossPlatformActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("show_load_dialog", true);
                            intent.putExtra("hide_nav_bar", false);
                            intent.putExtras(bundle);
                            intent.setData(Uri.parse(str));
                            RecommendFriendsTitleHolder.this.f49338d.getContext().startActivity(intent);
                        }
                    }
                });
            }
        }
    }
}
