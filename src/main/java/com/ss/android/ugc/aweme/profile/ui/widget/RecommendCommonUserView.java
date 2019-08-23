package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.common.d.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.friends.adapter.DividerItemDecoration;
import com.ss.android.ugc.aweme.profile.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserAdapter;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolder;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.ui.PrivacyActivity;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecommendCommonUserView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63061a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f63062b;

    /* renamed from: c  reason: collision with root package name */
    List<User> f63063c;

    /* renamed from: d  reason: collision with root package name */
    public a f63064d;

    /* renamed from: e  reason: collision with root package name */
    public String f63065e;

    /* renamed from: f  reason: collision with root package name */
    private View f63066f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private TextView m;
    private RecommendUserAdapter n;
    private boolean o = true;
    private int p;

    public interface a {
        void a(String str);
    }

    public RecommendUserAdapter getAdapter() {
        if (PatchProxy.isSupport(new Object[0], this, f63061a, false, 69797, new Class[0], RecommendUserAdapter.class)) {
            return (RecommendUserAdapter) PatchProxy.accessDispatch(new Object[0], this, f63061a, false, 69797, new Class[0], RecommendUserAdapter.class);
        }
        if (this.n == null) {
            this.n = new RecommendUserAdapter();
        }
        return this.n;
    }

    public List<User> getData() {
        if (!PatchProxy.isSupport(new Object[0], this, f63061a, false, 69802, new Class[0], List.class)) {
            return getAdapter().getData();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f63061a, false, 69802, new Class[0], List.class);
    }

    public Map<String, Integer> getPosInApiListMap() {
        if (!PatchProxy.isSupport(new Object[0], this, f63061a, false, 69803, new Class[0], Map.class)) {
            return getAdapter().h;
        }
        return (Map) PatchProxy.accessDispatch(new Object[0], this, f63061a, false, 69803, new Class[0], Map.class);
    }

    private void a() {
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f63061a, false, 69792, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63061a, false, 69792, new Class[0], Void.TYPE);
            return;
        }
        this.m.setVisibility(0);
        String string = getContext().getResources().getString(C0906R.string.bqx);
        String format = String.format(getContext().getString(C0906R.string.bqw), new Object[]{string});
        String[] split = format.split(string);
        if (split == null || split.length != 2) {
            i2 = 0;
        } else {
            i3 = split[0].length();
            i2 = string.length() + i3;
        }
        SpannableString spannableString = new SpannableString(format);
        g.a(spannableString, new ClickableSpan() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63072a;

            public final void onClick(@NonNull View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f63072a, false, 69809, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f63072a, false, 69809, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                RecommendCommonUserView recommendCommonUserView = RecommendCommonUserView.this;
                if (PatchProxy.isSupport(new Object[0], recommendCommonUserView, RecommendCommonUserView.f63061a, false, 69793, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], recommendCommonUserView, RecommendCommonUserView.f63061a, false, 69793, new Class[0], Void.TYPE);
                    return;
                }
                recommendCommonUserView.getContext().startActivity(new Intent(recommendCommonUserView.getContext(), PrivacyActivity.class));
            }

            public final void updateDrawState(@NonNull TextPaint textPaint) {
                TextPaint textPaint2 = textPaint;
                if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f63072a, false, 69810, new Class[]{TextPaint.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f63072a, false, 69810, new Class[]{TextPaint.class}, Void.TYPE);
                    return;
                }
                super.updateDrawState(textPaint);
                textPaint2.setColor(RecommendCommonUserView.this.getResources().getColor(C0906R.color.xz));
                textPaint2.setUnderlineText(false);
            }
        }, i3, i2, 33);
        this.m.setText(spannableString);
        this.m.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void setOnLookMoreUserListener(a aVar) {
        this.f63064d = aVar;
    }

    public RecommendCommonUserView(@NonNull Context context) {
        super(context);
        a(context);
    }

    public void setOnItemOperationListener(RecommendUserAdapter.b bVar) {
        RecommendUserAdapter.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f63061a, false, 69801, new Class[]{RecommendUserAdapter.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f63061a, false, 69801, new Class[]{RecommendUserAdapter.b.class}, Void.TYPE);
            return;
        }
        getAdapter().f63076c = bVar2;
    }

    public void setOnViewAttachedToWindowListener(b<RecommendUserCardViewHolder> bVar) {
        b<RecommendUserCardViewHolder> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f63061a, false, 69796, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f63061a, false, 69796, new Class[]{b.class}, Void.TYPE);
            return;
        }
        getAdapter().f63078e = bVar2;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f63061a, false, 69799, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f63061a, false, 69799, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        ViewParent parent = getParent();
        if (parent != null) {
            if (parent instanceof RecyclerView) {
                z = false;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setBackgroundResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f63061a, false, 69806, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f63061a, false, 69806, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        findViewById(C0906R.id.b_0).setBackgroundResource(i2);
    }

    public void setPageType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f63061a, false, 69794, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f63061a, false, 69794, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.p = i2;
        getAdapter().g = i2;
        if ((i2 == 1 || i2 == 2) && AbTestManager.a().j()) {
            this.j.setVisibility(0);
            this.i.setVisibility(8);
            return;
        }
        this.i.setVisibility(0);
        this.j.setVisibility(8);
    }

    public void setShowLookMore(boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f63061a, false, 69805, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f63061a, false, 69805, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.o = z;
        View view = this.g;
        int i3 = 4;
        if (z) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        view.setVisibility(i2);
        View view2 = this.h;
        if (z) {
            i3 = 0;
        }
        view2.setVisibility(i3);
        getAdapter().setShowFooter(z);
    }

    private void setFindMoreLayout(List<User> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f63061a, false, 69798, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f63061a, false, 69798, new Class[]{List.class}, Void.TYPE);
        } else if (list.size() <= 3) {
            findViewById(C0906R.id.ae8).setVisibility(8);
        } else {
            AvatarImageView avatarImageView = (AvatarImageView) this.j.findViewById(C0906R.id.ae6);
            AvatarImageView avatarImageView2 = (AvatarImageView) this.j.findViewById(C0906R.id.ae7);
            c.b((AvatarImageView) this.j.findViewById(C0906R.id.ae5), list.get(3).getAvatarThumb());
            if (list.size() >= 5) {
                c.b(avatarImageView, list.get(4).getAvatarThumb());
                if (list.size() >= 6) {
                    c.b(avatarImageView2, list.get(5).getAvatarThumb());
                } else {
                    avatarImageView2.setVisibility(8);
                }
            } else {
                avatarImageView.setVisibility(8);
                avatarImageView2.setVisibility(8);
            }
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f63061a, false, 69800, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f63061a, false, 69800, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.bks && this.o && this.f63064d != null) {
            this.f63064d.a(this.f63065e);
        }
        if (view.getId() == C0906R.id.ae_ && this.f63064d != null) {
            this.f63064d.a(this.f63065e);
        }
        if (view.getId() == C0906R.id.c6a) {
            HashMap hashMap = new HashMap();
            if (this.p == 1) {
                hashMap.put("enter_from", "homepage_follow");
            } else if (this.p == 2) {
                hashMap.put("enter_from", "homepage_friends");
            } else {
                hashMap.put("enter_from", "others_homepage");
            }
            r.a("click_privacy_tips", (Map) hashMap);
            String str = (String) SharePrefCache.inst().getPrivacyReminderH5Url().c();
            if (str != null) {
                Intent intent = new Intent(getContext(), CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", false);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(str));
                getContext().startActivity(intent);
            }
        }
    }

    private void a(final Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f63061a, false, 69791, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f63061a, false, 69791, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f63066f = LayoutInflater.from(context).inflate(C0906R.layout.arl, this, true);
        this.g = this.f63066f.findViewById(C0906R.id.bks);
        this.h = this.f63066f.findViewById(C0906R.id.bkt);
        this.j = this.f63066f.findViewById(C0906R.id.ae_);
        this.i = this.f63066f.findViewById(C0906R.id.bku);
        this.f63062b = (RecyclerView) this.f63066f.findViewById(C0906R.id.ccc);
        this.f63062b.setAdapter(getAdapter());
        this.l = this.f63066f.findViewById(C0906R.id.bbt);
        this.m = (TextView) this.f63066f.findViewById(C0906R.id.dgm);
        this.k = this.f63066f.findViewById(C0906R.id.c6a);
        ((SimpleItemAnimator) this.f63062b.getItemAnimator()).setSupportsChangeAnimations(false);
        getAdapter().f63077d = new RecommendUserAdapter.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63067a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f63067a, false, 69807, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f63067a, false, 69807, new Class[0], Void.TYPE);
                    return;
                }
                if (RecommendCommonUserView.this.f63064d != null) {
                    RecommendCommonUserView.this.f63064d.a(RecommendCommonUserView.this.f63065e);
                }
            }
        };
        getAdapter().i = new RecommendUserCardViewHolder.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63069a;

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f63069a, false, 69808, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f63069a, false, 69808, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                RecommendCommonUserView.this.f63062b.smoothScrollBy((int) UIUtils.dip2Px(context, 130.0f), 0);
            }
        };
        this.f63062b.setPadding((int) UIUtils.dip2Px(this.f63062b.getContext(), 8.0f), 0, 0, 0);
        this.f63062b.setClipToPadding(false);
        this.f63062b.addItemDecoration(new DividerItemDecoration(0, (int) UIUtils.dip2Px(context, 4.0f), 0));
        this.f63062b.setLayoutManager(new WrapLinearLayoutManager(context, 0, false));
        this.g.setOnClickListener(this);
        this.j.setOnClickListener(this);
        if (!AbTestManager.a().bA()) {
            this.k.setVisibility(8);
        } else {
            this.k.setVisibility(0);
            this.k.setOnClickListener(this);
        }
        if (!k.b()) {
            this.m.setVisibility(8);
        } else {
            a();
        }
        if (com.ss.android.g.a.a()) {
            this.j.setVisibility(8);
        }
    }

    public RecommendCommonUserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(List<User> list, String str) {
        if (PatchProxy.isSupport(new Object[]{list, str}, this, f63061a, false, 69795, new Class[]{List.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, str}, this, f63061a, false, 69795, new Class[]{List.class, String.class}, Void.TYPE);
        } else if (list != null) {
            this.f63065e = str;
            this.f63063c = list;
            getAdapter().setData(this.f63063c);
            getAdapter().f63079f = str;
            if (!this.o || this.f63063c.size() < 10) {
                getAdapter().setShowFooter(false);
            } else {
                getAdapter().setShowFooter(true);
            }
            if ((this.p == 1 || this.p == 2) && AbTestManager.a().j() && this.f63063c != null && this.f63063c.size() > 3) {
                setFindMoreLayout(this.f63063c);
            }
        }
    }

    public RecommendCommonUserView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }
}
