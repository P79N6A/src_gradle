package com.bytedance.android.livesdk.rank.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.network.response.b;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.e;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.utils.t;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.adapter.LiveMultiTypeAdapter;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.chatroom.model.UserRankExtra;
import com.bytedance.android.livesdk.rank.i;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.bytedance.android.livesdk.rank.model.c;
import com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder;
import com.bytedance.android.livesdk.rank.viewbinder.RankListTopViewBinder;
import com.bytedance.android.livesdk.rank.viewbinder.RankTitleViewBinder;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import java.util.ArrayList;

public class CurrentUserRankListFragment extends UserRankListFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16952a;
    private LiveMultiTypeAdapter B;

    /* renamed from: b  reason: collision with root package name */
    b<CurrentRankListResponse, UserRankExtra> f16953b;

    public final int c() {
        return 3;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f16952a, false, 13010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16952a, false, 13010, new Class[0], Void.TYPE);
            return;
        }
        this.s.setVisibility(0);
        this.s.b();
        h.a().a(this.u, this.w, this.x, 17);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f16952a, false, 13012, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16952a, false, 13012, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.B != null) {
            this.B.f83976c.a(com.bytedance.android.livesdk.rank.model.b.class);
            this.B.f83976c.a(c.class);
        }
    }

    private void g() {
        String str;
        boolean z;
        int i;
        float f2;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f16952a, false, 13014, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16952a, false, 13014, new Class[0], Void.TYPE);
        } else if (this.v) {
            this.i.setVisibility(8);
            this.t.setVisibility(8);
        } else if (!TTLiveSDKContext.getHostService().k().c()) {
            this.t.setVisibility(0);
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            if (this.f16953b == null || this.f16953b.f7871b == null || ((CurrentRankListResponse) this.f16953b.f7871b).selfInfo == null) {
                this.t.setVisibility(8);
                this.h.setVisibility(8);
                return;
            }
            com.bytedance.android.livesdk.rank.model.b bVar = ((CurrentRankListResponse) this.f16953b.f7871b).selfInfo;
            this.j.setVisibility(8);
            this.k.setVisibility(0);
            int i3 = bVar.f17027d;
            String valueOf = String.valueOf(i3);
            this.k.setText(valueOf);
            if (bVar.f17026c > 0) {
                if (i3 > 0 && i3 <= 100) {
                    switch (i3) {
                        case 1:
                            this.j.setImageResource(2130841414);
                            this.j.setVisibility(0);
                            this.k.setVisibility(8);
                            break;
                        case 2:
                            this.j.setImageResource(2130841415);
                            this.j.setVisibility(0);
                            this.k.setVisibility(8);
                            break;
                        case 3:
                            this.j.setImageResource(2130841416);
                            this.j.setVisibility(0);
                            this.k.setVisibility(8);
                            break;
                        default:
                            this.k.setText(valueOf);
                            this.k.setVisibility(0);
                            this.j.setVisibility(8);
                            break;
                    }
                } else {
                    this.k.setText(getContext().getResources().getString(C0906R.string.d8s));
                    this.k.setVisibility(0);
                    this.j.setVisibility(8);
                }
            } else {
                this.k.setText("-");
                this.k.setVisibility(0);
                this.j.setVisibility(8);
            }
            if (bVar.f17026c > 0 && (a.g() || a.j())) {
                TextView textView = (TextView) this.h.findViewById(C0906R.id.cnl);
                String valueOf2 = String.valueOf(bVar.f17026c);
                if (a.j()) {
                    textView.setText(getResources().getString(C0906R.string.dfo, new Object[]{valueOf2}));
                } else {
                    textView.setText(valueOf2);
                }
            }
            if (!(getContext() == null || getContext().getResources() == null)) {
                if (i3 <= 0 || i3 > 100) {
                    z = false;
                } else {
                    z = true;
                }
                TextView textView2 = this.k;
                Resources resources = getContext().getResources();
                if (z) {
                    i = C0906R.color.ai8;
                } else {
                    i = C0906R.color.ai9;
                }
                textView2.setTextColor(resources.getColor(i));
                TextView textView3 = this.k;
                if (z) {
                    f2 = 20.0f;
                } else {
                    f2 = 12.0f;
                }
                textView3.setTextSize(f2);
                if (bVar.f17026c <= 0) {
                    this.k.setTextSize(20.0f);
                }
            }
            User user = bVar.f17025b;
            if (user != null) {
                com.bytedance.android.livesdk.chatroom.f.b.b(this.l, user.getAvatarThumb(), this.l.getWidth(), this.l.getHeight(), 2130841141);
                if (!(user.getBorder() == null || this.m == null)) {
                    k.a(this.m, user.getBorder().f7750b);
                }
                this.n.setText(user.getNickName());
            }
            if (!com.bytedance.android.livesdkapi.a.a.f18614b) {
                if (StringUtils.isEmpty(bVar.f17028e)) {
                    str = getString(C0906R.string.dl4, e.b(bVar.f17026c));
                } else {
                    str = getString(C0906R.string.dl3, e.b(bVar.f17026c), bVar.f17028e);
                }
                this.o.setText(str);
            } else if (!TextUtils.isEmpty(bVar.f17028e)) {
                String str2 = bVar.f17028e;
                SpannableString spannableString = new SpannableString(str2);
                while (i2 < str2.length()) {
                    char charAt = str2.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        int i4 = i2 + 1;
                        while (i4 < str2.length() - 1 && Character.isDigit(str2.charAt(i4))) {
                            i4++;
                        }
                        spannableString.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.a_r)), i2, i4, 18);
                        i2 = i4;
                    } else {
                        if (i2 > 0 && charAt == '.' && Character.isDigit(str2.charAt(i2 - 1))) {
                            spannableString.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.a_r)), i2, i2 + 1, 18);
                        } else if (i2 > 0 && ((charAt == 'k' || charAt == 'm' || charAt == 'b') && Character.isDigit(str2.charAt(i2 - 1)))) {
                            spannableString.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.a_r)), i2, i2 + 1, 18);
                        } else if (i2 < str2.length() - 1 && (charAt == 'k' || charAt == 'm' || charAt == 'b')) {
                            int i5 = i2 + 1;
                            if (Character.isDigit(str2.charAt(i5))) {
                                spannableString.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.a_r)), i2, i5, 18);
                            }
                        }
                        i2++;
                    }
                }
                this.o.setText(spannableString);
            } else {
                this.o.setVisibility(8);
                this.p.setVisibility(8);
            }
            if (a.j()) {
                this.o.setVisibility(8);
            }
        }
    }

    public void handleMsg(Message message) {
        boolean z;
        String str;
        if (PatchProxy.isSupport(new Object[]{message}, this, f16952a, false, 13011, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f16952a, false, 13011, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (b_() && message.what == 24) {
            if (message.obj instanceof Exception) {
                this.s.setVisibility(0);
                this.s.d();
            } else if (message.obj instanceof b) {
                this.f16953b = (b) message.obj;
                if (PatchProxy.isSupport(new Object[0], this, f16952a, false, 13013, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f16952a, false, 13013, new Class[0], Void.TYPE);
                    return;
                }
                if (this.f16953b.f7871b != null && !Lists.isEmpty(((CurrentRankListResponse) this.f16953b.f7871b).ranks)) {
                    Observable.fromIterable(((CurrentRankListResponse) this.f16953b.f7871b).ranks).filter(new a(this)).toList().subscribe(new b(this), c.f16975b);
                }
                if (PatchProxy.isSupport(new Object[0], this, f16952a, false, 13015, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16952a, false, 13015, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (!a.d() ? this.f16953b.f7871b == null || (CollectionUtils.isEmpty(((CurrentRankListResponse) this.f16953b.f7871b).ranks) && CollectionUtils.isEmpty(((CurrentRankListResponse) this.f16953b.f7871b).seats)) : this.f16953b.f7871b == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.s.setVisibility(0);
                    this.s.c();
                    if (!TTLiveSDKContext.getHostService().k().c()) {
                        this.t.setVisibility(0);
                        this.h.setVisibility(8);
                    } else {
                        this.i.setVisibility(8);
                    }
                    if (a.f()) {
                        g();
                    }
                    return;
                }
                CurrentRankListResponse currentRankListResponse = (CurrentRankListResponse) this.f16953b.f7871b;
                ArrayList arrayList = new ArrayList(currentRankListResponse.ranks.size() + 1);
                if (getContext() != null) {
                    if (!t.a(currentRankListResponse.seats)) {
                        arrayList.add(new c(ac.a((int) C0906R.string.dkt), getResources().getColor(C0906R.color.si)));
                        for (int i = 0; i < currentRankListResponse.seats.size(); i++) {
                            com.bytedance.android.livesdk.rank.model.b bVar = currentRankListResponse.seats.get(i);
                            if (bVar.f17027d <= 3) {
                                bVar.f17027d -= 3;
                            }
                        }
                        arrayList.addAll(currentRankListResponse.seats);
                        if (!CollectionUtils.isEmpty(currentRankListResponse.ranks) && a.g()) {
                            arrayList.add(new c(ac.a((int) C0906R.string.cun), getResources().getColor(C0906R.color.a7l)));
                        }
                    }
                    if (!a.g() && !a.f()) {
                        if (com.bytedance.android.livesdkapi.a.a.f18614b) {
                            str = e.d(currentRankListResponse.total);
                        } else {
                            str = e.b(currentRankListResponse.total);
                        }
                        arrayList.add(currentRankListResponse.musicWave + " " + str);
                    }
                    arrayList.addAll(currentRankListResponse.ranks);
                    this.B = new LiveMultiTypeAdapter();
                    this.B.a(c.class, new RankTitleViewBinder());
                    this.B.a(String.class, new RankListTopViewBinder());
                    RankItemViewBinder rankItemViewBinder = new RankItemViewBinder(this.y, this.v, 3, this, 17);
                    this.B.a(com.bytedance.android.livesdk.rank.model.b.class, rankItemViewBinder);
                    this.r.setAdapter(this.B);
                    this.B.a(arrayList);
                    this.r.setVisibility(0);
                    this.s.setVisibility(8);
                    g();
                }
            }
        }
    }

    public static UserRankListFragment a(long j, long j2, boolean z) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), Byte.valueOf(z ? (byte) 1 : 0)}, null, f16952a, true, 13009, new Class[]{Long.TYPE, Long.TYPE, Boolean.TYPE}, UserRankListFragment.class)) {
            return (UserRankListFragment) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), Byte.valueOf(z)}, null, f16952a, true, 13009, new Class[]{Long.TYPE, Long.TYPE, Boolean.TYPE}, UserRankListFragment.class);
        }
        CurrentUserRankListFragment currentUserRankListFragment = new CurrentUserRankListFragment();
        i.a(currentUserRankListFragment.hashCode());
        Bundle bundle = new Bundle(2);
        bundle.putBoolean("broadcaster", z);
        bundle.putLong("room_id", j3);
        bundle.putLong("owner_id", j4);
        currentUserRankListFragment.setArguments(bundle);
        return currentUserRankListFragment;
    }
}
