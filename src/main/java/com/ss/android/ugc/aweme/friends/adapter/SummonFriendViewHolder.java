package com.ss.android.ugc.aweme.friends.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.challenge.model.Segment;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.a.b;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bg;

public class SummonFriendViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48767a;

    /* renamed from: b  reason: collision with root package name */
    public String f48768b;

    /* renamed from: c  reason: collision with root package name */
    public int f48769c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f48770d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f48771e;

    /* renamed from: f  reason: collision with root package name */
    private AvatarImageWithVerify f48772f;

    public final void a(SummonFriendItem summonFriendItem, String str) {
        SpannableString spannableString;
        final SummonFriendItem summonFriendItem2 = summonFriendItem;
        final String str2 = str;
        char c2 = 2;
        if (PatchProxy.isSupport(new Object[]{summonFriendItem2, str2}, this, f48767a, false, 46361, new Class[]{SummonFriendItem.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{summonFriendItem2, str2}, this, f48767a, false, 46361, new Class[]{SummonFriendItem.class, String.class}, Void.TYPE);
            return;
        }
        if (!(summonFriendItem2 == null || summonFriendItem2.mUser == null)) {
            final User user = summonFriendItem2.mUser;
            if (TextUtils.isEmpty(user.getSignature())) {
                this.f48771e.setVisibility(8);
            } else {
                this.f48771e.setVisibility(0);
                this.f48771e.setText(user.getSignature());
            }
            SpannableString spannableString2 = new SpannableString(summonFriendItem2.mUser.getNickname());
            if (summonFriendItem2.segments != null) {
                spannableString = spannableString2;
                for (Segment next : summonFriendItem2.segments) {
                    if (next != null) {
                        int i = next.begin;
                        int i2 = next.end + 1;
                        Object[] objArr = new Object[3];
                        objArr[0] = spannableString;
                        objArr[1] = Integer.valueOf(i);
                        objArr[c2] = Integer.valueOf(i2);
                        ChangeQuickRedirect changeQuickRedirect = f48767a;
                        Class[] clsArr = new Class[3];
                        clsArr[0] = SpannableString.class;
                        clsArr[1] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        int i3 = i2;
                        int i4 = i;
                        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, 46362, clsArr, SpannableString.class)) {
                            spannableString = (SpannableString) PatchProxy.accessDispatch(new Object[]{spannableString, Integer.valueOf(i4), Integer.valueOf(i3)}, this, f48767a, false, 46362, new Class[]{SpannableString.class, Integer.TYPE, Integer.TYPE}, SpannableString.class);
                        } else if (!TextUtils.isEmpty(spannableString) && !a.b()) {
                            int max = Math.max(0, i4);
                            if (!TextUtils.isEmpty(spannableString)) {
                                int i5 = i3;
                                if (max <= i5 && max < spannableString.length() && i5 <= spannableString.length()) {
                                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.itemView.getResources().getColor(C0906R.color.a1s));
                                    Object[] objArr2 = {spannableString, foregroundColorSpan, Integer.valueOf(max), Integer.valueOf(i5), 17};
                                    if (PatchProxy.isSupport(objArr2, null, q.f48819a, true, 46364, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                        Object[] objArr3 = {spannableString, foregroundColorSpan, Integer.valueOf(max), Integer.valueOf(i5), 17};
                                        Object[] objArr4 = objArr3;
                                        PatchProxy.accessDispatch(objArr4, null, q.f48819a, true, 46364, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                                    } else {
                                        spannableString.setSpan(foregroundColorSpan, max, i5, 17);
                                    }
                                    c2 = 2;
                                }
                            }
                        }
                    }
                    c2 = 2;
                }
            } else {
                spannableString = spannableString2;
            }
            this.f48770d.setText(spannableString);
            this.f48772f.setData(user);
            this.itemView.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48773a;

                public final void onClick(View view) {
                    String str;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f48773a, false, 46363, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f48773a, false, 46363, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    int i = summonFriendItem2.type;
                    if (!TextUtils.isEmpty(str2)) {
                        MobClick obtain = MobClick.obtain();
                        int i2 = SummonFriendViewHolder.this.f48769c;
                        if (i2 == 1) {
                            str = "comment_at";
                        } else if (i2 == 0) {
                            str = "video_at";
                        } else {
                            str = "";
                        }
                        r.onEvent(obtain.setEventName(str).setLabelName("search").setExtValueString(user.getUid()).setValue(SummonFriendViewHolder.this.f48768b).setJsonObject(c.a().a("search_keyword", str2).b()));
                    }
                    if (!TextUtils.equals(d.a().getCurUserId(), user.getUid())) {
                        user.setAtType(i);
                        r.onEvent(MobClick.obtain().setEventName("at_friend").setLabelName("friend_list").setValue(user.getUid()));
                        bg.a(new b(user));
                        return;
                    }
                    com.bytedance.ies.dmt.ui.d.a.b(SummonFriendViewHolder.this.itemView.getContext(), (int) C0906R.string.bh5).a();
                }
            });
        }
    }

    public SummonFriendViewHolder(View view, String str, int i) {
        super(view);
        if (PatchProxy.isSupport(new Object[]{view}, this, f48767a, false, 46360, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48767a, false, 46360, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f48770d = (TextView) view.findViewById(C0906R.id.df7);
            this.f48771e = (TextView) view.findViewById(C0906R.id.dj1);
            this.f48772f = (AvatarImageWithVerify) view.findViewById(C0906R.id.ckf);
        }
        this.f48768b = str;
        this.f48769c = i;
    }
}
