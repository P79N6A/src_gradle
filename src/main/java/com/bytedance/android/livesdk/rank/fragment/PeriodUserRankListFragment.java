package com.bytedance.android.livesdk.rank.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.network.response.b;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.e;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.adapter.LiveMultiTypeAdapter;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.chatroom.bl.r;
import com.bytedance.android.livesdk.chatroom.bl.s;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.bytedance.android.livesdk.rank.model.PeriodRankExtra;
import com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder;
import com.bytedance.android.livesdk.utils.o;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.a.a;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;

public class PeriodUserRankListFragment extends UserRankListFragment {
    private static final String B = "PeriodUserRankListFragment";

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16954a;
    private long C;
    private int D;
    private LiveMultiTypeAdapter E;

    /* renamed from: b  reason: collision with root package name */
    b<CurrentRankListResponse, PeriodRankExtra> f16955b;

    public final int c() {
        return this.D;
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f16954a, false, 13023, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16954a, false, 13023, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.E != null) {
            this.E.f83976c.a(com.bytedance.android.livesdk.rank.model.b.class);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f16954a, false, 13021, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16954a, false, 13021, new Class[0], Void.TYPE);
            return;
        }
        h a2 = h.a();
        WeakHandler weakHandler = this.u;
        long j = this.C;
        int i = this.D;
        long j2 = this.w;
        if (PatchProxy.isSupport(new Object[]{weakHandler, new Long(j), Integer.valueOf(i), new Long(j2)}, a2, h.f9797a, false, 4003, new Class[]{Handler.class, Long.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {weakHandler, new Long(j), Integer.valueOf(i), new Long(j2)};
            Object[] objArr2 = objArr;
            h hVar = a2;
            PatchProxy.accessDispatch(objArr2, hVar, h.f9797a, false, 4003, new Class[]{Handler.class, Long.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).getPeriodUserRank(new o().a("anchor_id", String.valueOf(j)).a("sec_anchor_id", TTLiveSDKContext.getHostService().k().a(j)).a("rank_type", String.valueOf(i)).a("room_id", String.valueOf(j2)).a("sec_user_id", TTLiveSDKContext.getHostService().k().a().getSecUid()).f17622b).compose(i.a()).subscribe(new r(weakHandler), new s(weakHandler));
    }

    private void g() {
        String str;
        boolean z;
        int i;
        float f2;
        String str2;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f16954a, false, 13025, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16954a, false, 13025, new Class[0], Void.TYPE);
        } else if (this.v) {
            this.i.setVisibility(8);
            this.t.setVisibility(8);
        } else if (!TTLiveSDKContext.getHostService().k().c()) {
            this.t.setVisibility(0);
            this.h.setVisibility(8);
        } else if (this.f16955b == null || this.f16955b.f7871b == null || ((CurrentRankListResponse) this.f16955b.f7871b).selfInfo == null) {
            this.t.setVisibility(8);
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            com.bytedance.android.livesdk.rank.model.b bVar = ((CurrentRankListResponse) this.f16955b.f7871b).selfInfo;
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
                    if (a.f18614b) {
                        str2 = "-";
                    } else {
                        str2 = getString(C0906R.string.d8s);
                    }
                    this.k.setText(str2);
                    this.k.setVisibility(0);
                    this.j.setVisibility(8);
                }
            } else {
                this.k.setText("-");
                this.k.setVisibility(0);
                this.j.setVisibility(8);
            }
            if (com.bytedance.android.live.uikit.a.a.g()) {
                TextView textView = (TextView) this.h.findViewById(C0906R.id.cnl);
                if (this.D != 9) {
                    textView.setText(String.valueOf(bVar.f17026c));
                } else {
                    textView.setVisibility(8);
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
            if (!a.f18614b) {
                if (this.D == 7) {
                    if (StringUtils.isEmpty(bVar.f17028e)) {
                        str = getString(C0906R.string.dl9, e.b(bVar.f17026c));
                    } else {
                        str = getString(C0906R.string.dl8, e.b(bVar.f17026c), bVar.f17028e);
                    }
                    this.o.setText(str);
                    return;
                }
                this.o.setText("");
            } else if (!TextUtils.isEmpty(bVar.f17028e)) {
                String str3 = bVar.f17028e;
                SpannableString spannableString = new SpannableString(str3);
                while (i2 < str3.length()) {
                    char charAt = str3.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        int i4 = i2 + 1;
                        while (i4 < str3.length() - 1 && Character.isDigit(str3.charAt(i4))) {
                            i4++;
                        }
                        spannableString.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.a_r)), i2, i4, 18);
                        i2 = i4;
                    } else {
                        if (i2 > 0 && charAt == '.' && Character.isDigit(str3.charAt(i2 - 1))) {
                            spannableString.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.a_r)), i2, i2 + 1, 18);
                        } else if (i2 > 0 && ((charAt == 'k' || charAt == 'm' || charAt == 'b') && Character.isDigit(str3.charAt(i2 - 1)))) {
                            spannableString.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.a_r)), i2, i2 + 1, 18);
                        } else if (i2 < str3.length() - 1 && (charAt == 'k' || charAt == 'm' || charAt == 'b')) {
                            int i5 = i2 + 1;
                            if (Character.isDigit(str3.charAt(i5))) {
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
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f16954a, false, 13020, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f16954a, false, 13020, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.C = arguments.getLong("owner_id");
        this.D = arguments.getInt("rank_type");
        this.y = TTLiveSDKContext.getHostService().k();
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f16954a, false, 13022, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f16954a, false, 13022, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (b_() && message.what == 31) {
            if (message.obj instanceof Exception) {
                this.s.setVisibility(0);
                this.s.d();
                com.bytedance.android.live.core.c.a.a(6, B, ((Exception) message.obj).getStackTrace());
            }
            if (message.obj instanceof b) {
                this.f16955b = (b) message.obj;
                if (PatchProxy.isSupport(new Object[0], this, f16954a, false, 13024, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f16954a, false, 13024, new Class[0], Void.TYPE);
                    return;
                }
                if (this.f16955b.f7871b != null && !Lists.isEmpty(((CurrentRankListResponse) this.f16955b.f7871b).ranks)) {
                    Observable.fromIterable(((CurrentRankListResponse) this.f16955b.f7871b).ranks).filter(new d(this)).toList().subscribe(new e(this), f.f16981b);
                }
                if (this.f16955b.f7871b == null || Lists.isEmpty(((CurrentRankListResponse) this.f16955b.f7871b).ranks)) {
                    this.s.setVisibility(0);
                    this.s.c();
                    if (!TTLiveSDKContext.getHostService().k().c()) {
                        this.t.setVisibility(0);
                        this.h.setVisibility(8);
                    } else {
                        this.i.setVisibility(8);
                    }
                    if (com.bytedance.android.live.uikit.a.a.f()) {
                        g();
                    }
                    return;
                }
                if (this.E == null) {
                    this.E = new LiveMultiTypeAdapter();
                    RankItemViewBinder rankItemViewBinder = new RankItemViewBinder(this.y, this.v, 10, this, this.D);
                    this.E.a(com.bytedance.android.livesdk.rank.model.b.class, rankItemViewBinder);
                }
                this.E.a(((CurrentRankListResponse) this.f16955b.f7871b).ranks);
                this.r.setAdapter(this.E);
                this.r.setVisibility(0);
                this.s.setVisibility(8);
                g();
            }
        }
    }

    public static UserRankListFragment a(long j, boolean z, long j2, int i) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Byte.valueOf(z ? (byte) 1 : 0), new Long(j4), Integer.valueOf(i)}, null, f16954a, true, 13019, new Class[]{Long.TYPE, Boolean.TYPE, Long.TYPE, Integer.TYPE}, UserRankListFragment.class)) {
            Object[] objArr = {new Long(j3), Byte.valueOf(z), new Long(j4), Integer.valueOf(i)};
            return (UserRankListFragment) PatchProxy.accessDispatch(objArr, null, f16954a, true, 13019, new Class[]{Long.TYPE, Boolean.TYPE, Long.TYPE, Integer.TYPE}, UserRankListFragment.class);
        }
        PeriodUserRankListFragment periodUserRankListFragment = new PeriodUserRankListFragment();
        com.bytedance.android.livesdk.rank.i.b(periodUserRankListFragment.hashCode());
        Bundle bundle = new Bundle(2);
        bundle.putBoolean("broadcaster", z);
        bundle.putLong("room_id", j3);
        bundle.putLong("owner_id", j4);
        bundle.putInt("rank_type", i);
        periodUserRankListFragment.setArguments(bundle);
        return periodUserRankListFragment;
    }
}
