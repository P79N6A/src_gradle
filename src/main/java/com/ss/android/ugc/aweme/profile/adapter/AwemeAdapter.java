package com.ss.android.ugc.aweme.profile.adapter;

import android.graphics.Typeface;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.commercialize.log.ab;
import com.ss.android.ugc.aweme.common.adapter.AnimatedAdapter;
import com.ss.android.ugc.aweme.common.d.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.u;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class AwemeAdapter extends AnimatedAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f61233f;
    public boolean g;
    public boolean i = true;
    public boolean j;
    d k;
    public c l;
    public RoomStruct m;
    boolean n;
    protected int o;
    public boolean p = true;
    public boolean q = true;
    protected String r;
    private b s;
    private FragmentActivity t;

    public List<Aweme> getData() {
        return this.mItems;
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        boolean z;
        boolean z2;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f61233f, false, 67355, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f61233f, false, 67355, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (getItemViewType(i4)) {
            case 1:
                ((DraftBoxViewHolder) viewHolder2).a(this.l, i4);
                return;
            case 2:
                Aweme a2 = a(i4);
                ImageViewHolder imageViewHolder = (ImageViewHolder) viewHolder2;
                boolean z3 = this.j;
                String str = this.r;
                boolean z4 = this.n;
                int i5 = this.o;
                Object[] objArr = {a2, Integer.valueOf(i2), Byte.valueOf(z3 ? (byte) 1 : 0), str, Byte.valueOf(z4 ? (byte) 1 : 0), Integer.valueOf(i5)};
                if (PatchProxy.isSupport(objArr, imageViewHolder, ImageViewHolder.f61249a, false, 67390, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
                    Object[] objArr2 = {a2, Integer.valueOf(i2), Byte.valueOf(z3), str, Byte.valueOf(z4), Integer.valueOf(i5)};
                    Object[] objArr3 = objArr2;
                    ImageViewHolder imageViewHolder2 = imageViewHolder;
                    PatchProxy.accessDispatch(objArr3, imageViewHolder2, ImageViewHolder.f61249a, false, 67390, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (a2 != null) {
                    imageViewHolder.g = a2;
                    AwemeStatistics statistics = a2.getStatistics();
                    Object[] objArr4 = {a2, Byte.valueOf(z4), Integer.valueOf(i5)};
                    if (PatchProxy.isSupport(objArr4, imageViewHolder, ImageViewHolder.f61249a, false, 67391, new Class[]{Aweme.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
                        Object[] objArr5 = {a2, Byte.valueOf(z4), Integer.valueOf(i5)};
                        Object[] objArr6 = objArr5;
                        ImageViewHolder imageViewHolder3 = imageViewHolder;
                        PatchProxy.accessDispatch(objArr6, imageViewHolder3, ImageViewHolder.f61249a, false, 67391, new Class[]{Aweme.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
                    } else if (!((Boolean) SharePrefCache.inst().getIsPrivateAvailable().c()).booleanValue() || (((!z4 || i5 != 0) && !u.f75965b.b(a2)) || a2.getStatus().getPrivateStatus() == 0)) {
                        imageViewHolder.k.setVisibility(8);
                    } else {
                        imageViewHolder.k.setVisibility(0);
                        if (a2.getStatus().getPrivateStatus() == 1) {
                            imageViewHolder.k.setImageResource(2130839647);
                        } else if (a2.getStatus().getPrivateStatus() == 2) {
                            imageViewHolder.k.setImageResource(2130839639);
                        }
                    }
                    if (!z4 || i5 != 0) {
                        imageViewHolder.l.setVisibility(0);
                        imageViewHolder.l.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(imageViewHolder.f61250b, 2130839642), null, null, null);
                        if (statistics != null) {
                            String a3 = com.ss.android.ugc.aweme.profile.d.b.a(a2.getStatistics().getDiggCount());
                            imageViewHolder.l.setText(a3);
                            imageViewHolder.l.setContentDescription(imageViewHolder.f61250b.getString(C0906R.string.brw, new Object[]{a3}));
                        }
                    } else {
                        imageViewHolder.l.setVisibility(0);
                        AwemeStatus status = a2.getStatus();
                        if (status != null && status.isInReviewing() && !a.a()) {
                            imageViewHolder.l.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(imageViewHolder.f61250b, 2130839735), null, null, null);
                            imageViewHolder.l.setText(C0906R.string.js);
                            imageViewHolder.l.setTextColor(imageViewHolder.f61250b.getResources().getColor(C0906R.color.a09));
                            imageViewHolder.l.setTypeface(Typeface.DEFAULT);
                            imageViewHolder.l.setContentDescription(imageViewHolder.f61250b.getString(C0906R.string.js));
                        } else if (statistics != null) {
                            String a4 = com.ss.android.ugc.aweme.profile.d.b.a(a2.getStatistics().getPlayCount());
                            imageViewHolder.l.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(imageViewHolder.f61250b, 2130839650), null, null, null);
                            imageViewHolder.l.setText(a4);
                            imageViewHolder.l.setTextColor(imageViewHolder.f61250b.getResources().getColor(C0906R.color.vf));
                            imageViewHolder.l.setTypeface(Typeface.SANS_SERIF, 2);
                            imageViewHolder.l.setContentDescription(imageViewHolder.f61250b.getString(C0906R.string.brz, new Object[]{a4}));
                        }
                    }
                    if (a2.getIsTop() == 1) {
                        imageViewHolder.m.setVisibility(0);
                    } else {
                        imageViewHolder.m.setVisibility(8);
                    }
                    if (z3) {
                        imageViewHolder.b();
                    }
                    imageViewHolder.h.setContentDescription(imageViewHolder.f61250b.getString(C0906R.string.bry, new Object[]{Integer.valueOf(i4 + 1)}));
                }
                a(a2);
                return;
            case 3:
                LiveViewHolder liveViewHolder = (LiveViewHolder) viewHolder2;
                RoomStruct roomStruct = this.m;
                if (PatchProxy.isSupport(new Object[]{roomStruct}, liveViewHolder, LiveViewHolder.f61255a, false, 67398, new Class[]{RoomStruct.class}, Void.TYPE)) {
                    Object[] objArr7 = {roomStruct};
                    Object[] objArr8 = objArr7;
                    LiveViewHolder liveViewHolder2 = liveViewHolder;
                    PatchProxy.accessDispatch(objArr8, liveViewHolder2, LiveViewHolder.f61255a, false, 67398, new Class[]{RoomStruct.class}, Void.TYPE);
                    break;
                } else {
                    Intrinsics.checkParameterIsNotNull(roomStruct, "room");
                    RoomStruct roomStruct2 = liveViewHolder.g;
                    if (roomStruct2 == null || roomStruct2.id != roomStruct.id) {
                        liveViewHolder.a(roomStruct);
                    }
                    liveViewHolder.g = roomStruct;
                    if (liveViewHolder.i) {
                        liveViewHolder.j.a(true, roomStruct, liveViewHolder.f61258d);
                    }
                    liveViewHolder.f61259e.setText(String.valueOf(roomStruct.user_count));
                    liveViewHolder.h.f54177d.observe(liveViewHolder.k, liveViewHolder);
                    return;
                }
            default:
                if (viewHolder2 instanceof AwemeViewHolder) {
                    Aweme a5 = a(i4);
                    AwemeViewHolder awemeViewHolder = (AwemeViewHolder) viewHolder2;
                    boolean z5 = this.j;
                    String str2 = this.r;
                    boolean z6 = this.n;
                    int i6 = this.o;
                    Object[] objArr9 = {a5, Integer.valueOf(i2), Byte.valueOf(z5 ? (byte) 1 : 0), str2, Byte.valueOf(z6 ? (byte) 1 : 0), Integer.valueOf(i6)};
                    if (PatchProxy.isSupport(objArr9, awemeViewHolder, AwemeViewHolder.f61234a, false, 67372, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
                        Object[] objArr10 = {a5, Integer.valueOf(i2), Byte.valueOf(z5), str2, Byte.valueOf(z6), Integer.valueOf(i6)};
                        Object[] objArr11 = objArr10;
                        AwemeViewHolder awemeViewHolder2 = awemeViewHolder;
                        PatchProxy.accessDispatch(objArr11, awemeViewHolder2, AwemeViewHolder.f61234a, false, 67372, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
                    } else if (a5 != null) {
                        awemeViewHolder.g = a5;
                        if (!((Aweme) awemeViewHolder.g).isProhibited() || !aa.p((Aweme) awemeViewHolder.g)) {
                            i3 = 8;
                            awemeViewHolder.q.setVisibility(8);
                            awemeViewHolder.r.setVisibility(0);
                            if (awemeViewHolder.s.getVisibility() == 0) {
                                awemeViewHolder.s.setVisibility(8);
                            }
                        } else {
                            awemeViewHolder.q.setVisibility(0);
                            i3 = 8;
                            awemeViewHolder.r.setVisibility(8);
                            if (a.b()) {
                                awemeViewHolder.s.setVisibility(0);
                            }
                        }
                        AwemeStatistics statistics2 = a5.getStatistics();
                        awemeViewHolder.k.setVisibility(i3);
                        if (!a.b() && a5.getRate() == 0) {
                            awemeViewHolder.k.setVisibility(0);
                        }
                        if (a5.getIsTop() == 1 && i6 == 0) {
                            awemeViewHolder.l.setVisibility(0);
                        } else {
                            awemeViewHolder.l.setVisibility(8);
                        }
                        String starRecommendTag = a5.getStarRecommendTag();
                        if (!TextUtils.isEmpty(starRecommendTag)) {
                            awemeViewHolder.m.setVisibility(0);
                            awemeViewHolder.n.setText(starRecommendTag);
                        }
                        boolean booleanValue = ((Boolean) SharePrefCache.inst().getIsPrivateAvailable().c()).booleanValue();
                        Object[] objArr12 = {a5, Byte.valueOf(z6), Integer.valueOf(i6), Byte.valueOf(booleanValue ? (byte) 1 : 0)};
                        if (PatchProxy.isSupport(objArr12, awemeViewHolder, AwemeViewHolder.f61234a, false, 67374, new Class[]{Aweme.class, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                            Object[] objArr13 = {a5, Byte.valueOf(z6), Integer.valueOf(i6), Byte.valueOf(booleanValue)};
                            Object[] objArr14 = objArr13;
                            AwemeViewHolder awemeViewHolder3 = awemeViewHolder;
                            PatchProxy.accessDispatch(objArr14, awemeViewHolder3, AwemeViewHolder.f61234a, false, 67374, new Class[]{Aweme.class, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                        } else if (!booleanValue || (((!z6 || i6 != 0) && !u.f75965b.b(a5)) || a5.getStatus().getPrivateStatus() == 0)) {
                            awemeViewHolder.o.setVisibility(8);
                        } else {
                            awemeViewHolder.o.setVisibility(0);
                            if (a5.getStatus().getPrivateStatus() == 1) {
                                awemeViewHolder.o.setImageResource(2130839647);
                            } else if (a5.getStatus().getPrivateStatus() == 2) {
                                awemeViewHolder.o.setImageResource(2130839639);
                            }
                        }
                        if (z6 && i6 == 0) {
                            awemeViewHolder.p.setVisibility(0);
                            AwemeStatus status2 = a5.getStatus();
                            VideoControl videoControl = a5.getVideoControl();
                            if (status2 != null && status2.isInReviewing() && !a.a()) {
                                if (awemeViewHolder.v == null) {
                                    awemeViewHolder.v = ContextCompat.getDrawable(awemeViewHolder.f61235b, 2130839735);
                                }
                                awemeViewHolder.p.setCompoundDrawablesWithIntrinsicBounds(awemeViewHolder.v, null, null, null);
                                awemeViewHolder.p.setText(C0906R.string.js);
                                awemeViewHolder.p.setTextColor(awemeViewHolder.f61235b.getResources().getColor(C0906R.color.a09));
                                awemeViewHolder.p.setTypeface(Typeface.DEFAULT);
                                awemeViewHolder.p.setContentDescription(awemeViewHolder.f61235b.getString(C0906R.string.js));
                            } else if (videoControl != null && videoControl.timerStatus == 0 && !a.a()) {
                                if (awemeViewHolder.v == null) {
                                    awemeViewHolder.v = ContextCompat.getDrawable(awemeViewHolder.f61235b, 2130839735);
                                }
                                awemeViewHolder.p.setCompoundDrawablesWithIntrinsicBounds(awemeViewHolder.v, null, null, null);
                                awemeViewHolder.p.setText(C0906R.string.ju);
                                awemeViewHolder.p.setTextColor(awemeViewHolder.f61235b.getResources().getColor(C0906R.color.a09));
                                awemeViewHolder.p.setTypeface(Typeface.DEFAULT);
                                awemeViewHolder.p.setContentDescription(awemeViewHolder.f61235b.getString(C0906R.string.ju));
                            } else if (statistics2 != null) {
                                String a6 = com.ss.android.ugc.aweme.profile.d.b.a(a5.getStatistics().getPlayCount());
                                if (awemeViewHolder.w == null) {
                                    awemeViewHolder.w = ContextCompat.getDrawable(awemeViewHolder.f61235b, 2130839646);
                                }
                                awemeViewHolder.p.setCompoundDrawablesWithIntrinsicBounds(awemeViewHolder.w, null, null, null);
                                awemeViewHolder.p.setText(a6);
                                awemeViewHolder.p.setTextColor(awemeViewHolder.f61235b.getResources().getColor(C0906R.color.vf));
                                awemeViewHolder.p.setContentDescription(awemeViewHolder.f61235b.getString(C0906R.string.brz, new Object[]{a6}));
                            }
                        } else if (z6 || i6 != 0 || !a.a() || AbTestManager.a().cj() <= 0) {
                            awemeViewHolder.p.setVisibility(0);
                            if (awemeViewHolder.x == null) {
                                awemeViewHolder.x = ContextCompat.getDrawable(awemeViewHolder.f61235b, 2130839642);
                            }
                            awemeViewHolder.p.setCompoundDrawablesWithIntrinsicBounds(awemeViewHolder.x, null, null, null);
                            if (statistics2 != null) {
                                String a7 = com.ss.android.ugc.aweme.profile.d.b.a(a5.getStatistics().getDiggCount());
                                awemeViewHolder.p.setText(a7);
                                awemeViewHolder.p.setContentDescription(awemeViewHolder.f61235b.getString(C0906R.string.brw, new Object[]{a7}));
                            }
                        } else {
                            awemeViewHolder.p.setVisibility(0);
                            awemeViewHolder.p.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(awemeViewHolder.f61235b, 2130839646), null, null, null);
                            if (statistics2 != null) {
                                String a8 = com.ss.android.ugc.aweme.profile.d.b.a(a5.getStatistics().getPlayCount());
                                awemeViewHolder.p.setText(a8);
                                awemeViewHolder.p.setContentDescription(awemeViewHolder.f61235b.getString(C0906R.string.brz, new Object[]{a8}));
                            }
                        }
                        Aweme aweme = (Aweme) awemeViewHolder.g;
                        if (PatchProxy.isSupport(new Object[]{aweme}, awemeViewHolder, AwemeViewHolder.f61234a, false, 67373, new Class[]{Aweme.class}, Boolean.TYPE)) {
                            Object[] objArr15 = {aweme};
                            Object[] objArr16 = objArr15;
                            AwemeViewHolder awemeViewHolder4 = awemeViewHolder;
                            z = ((Boolean) PatchProxy.accessDispatch(objArr16, awemeViewHolder4, AwemeViewHolder.f61234a, false, 67373, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            awemeViewHolder.t.setVisibility(8);
                            if (aa.p(aweme)) {
                                AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
                                if (starAtlasInfo != null) {
                                    int reviewStatus = starAtlasInfo.getReviewStatus();
                                    String str3 = "";
                                    switch (reviewStatus) {
                                        case 1:
                                            str3 = awemeViewHolder.f61235b.getString(C0906R.string.ccx);
                                            break;
                                        case 2:
                                            str3 = awemeViewHolder.f61235b.getString(C0906R.string.cd4);
                                            break;
                                        case 3:
                                            str3 = awemeViewHolder.f61235b.getString(C0906R.string.cd2);
                                            break;
                                        case 4:
                                            str3 = awemeViewHolder.f61235b.getString(C0906R.string.ccs);
                                            break;
                                    }
                                    if (TextUtils.isEmpty(str3)) {
                                        awemeViewHolder.t.setVisibility(8);
                                    } else {
                                        r.a("starmap_cover_review_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("group_id", aweme.getAid()).a("enter_from", "personal_homepage").a("tag_label", com.ss.android.ugc.aweme.commercialize.utils.c.a(reviewStatus)).f34114b);
                                        awemeViewHolder.t.setVisibility(0);
                                        awemeViewHolder.u.setText(str3);
                                        z = true;
                                    }
                                }
                            }
                            z = false;
                        }
                        if (z || (a.b() && com.ss.android.ugc.aweme.login.utils.a.a(a5))) {
                            awemeViewHolder.p.setVisibility(8);
                        }
                        if (z5) {
                            awemeViewHolder.b();
                            ab a9 = ab.a();
                            String aid = a5.getAid();
                            if (PatchProxy.isSupport(new Object[]{aid}, a9, ab.f39287a, false, 31867, new Class[]{String.class}, Boolean.TYPE)) {
                                ab abVar = a9;
                                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aid}, abVar, ab.f39287a, false, 31867, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                            } else {
                                z2 = a9.f39290c.contains(aid);
                            }
                            if (!z2) {
                                ab a10 = ab.a();
                                String aid2 = a5.getAid();
                                if (PatchProxy.isSupport(new Object[]{aid2}, a10, ab.f39287a, false, 31868, new Class[]{String.class}, Void.TYPE)) {
                                    ab abVar2 = a10;
                                    PatchProxy.accessDispatch(new Object[]{aid2}, abVar2, ab.f39287a, false, 31868, new Class[]{String.class}, Void.TYPE);
                                } else {
                                    a10.f39290c.add(aid2);
                                }
                                awemeViewHolder.i();
                            }
                        }
                        awemeViewHolder.h.setContentDescription(awemeViewHolder.f61235b.getString(C0906R.string.bs0, new Object[]{Integer.valueOf(i4 + 1)}));
                    }
                    awemeViewHolder.c(this.i);
                    a(a5);
                    break;
                } else {
                    return;
                }
                break;
        }
    }

    public final boolean d() {
        if (this.m != null) {
            return true;
        }
        return false;
    }

    private int f() {
        boolean z;
        boolean z2 = this.g;
        if (this.m != null) {
            z = true;
        } else {
            z = false;
        }
        return (z2 ? 1 : 0) + (z ? 1 : 0);
    }

    private boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f61233f, false, 67357, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f61233f, false, 67357, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.o != 4 || !this.p || com.ss.android.ugc.aweme.favorites.d.a.a()) {
            return false;
        } else {
            return true;
        }
    }

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f61233f, false, 67360, new Class[0], Integer.TYPE)) {
            return super.getBasicItemCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f61233f, false, 67360, new Class[0], Integer.TYPE)).intValue();
    }

    public int getBasicItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f61233f, false, 67359, new Class[0], Integer.TYPE)) {
            return super.getBasicItemCount() + f();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f61233f, false, 67359, new Class[0], Integer.TYPE)).intValue();
    }

    public String toString() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f61233f, false, 67370, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f61233f, false, 67370, new Class[0], String.class);
        }
        switch (this.o) {
            case 0:
                str = "TYPE_PUBLISH_AWEME";
                break;
            case 1:
                str = "TYPE_FAVORITE_AWEME";
                break;
            case 2:
                str = "TYPE_STORY_AWEME";
                break;
            case 3:
                str = "TYPE_ORIGIN_MUSIC";
                break;
            case 4:
                str = "TYPE_COLLECT_AWEME";
                break;
            case 5:
                str = "TYPE_DYNAMIC_STATE";
                break;
            default:
                str = "TYPE_TOOL_MASTER";
                break;
        }
        return "profileListType: " + str + ", itemCount: " + getItemCount() + ", baseCount: " + getBasicItemCount() + ", mShowDraftBox: " + this.g + ", mShowFooter: " + this.mShowFooter + ", isMyProfile: " + this.n;
    }

    public void setData(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f61233f, false, 67366, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f61233f, false, 67366, new Class[]{List.class}, Void.TYPE);
            return;
        }
        super.setData(list);
        a(list);
    }

    public void setDataAfterLoadMore(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f61233f, false, 67367, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f61233f, false, 67367, new Class[]{List.class}, Void.TYPE);
            return;
        }
        super.setDataAfterLoadMore(list);
        a(list);
    }

    private Aweme a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61233f, false, 67362, new Class[]{Integer.TYPE}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61233f, false, 67362, new Class[]{Integer.TYPE}, Aweme.class);
        }
        int f2 = i2 - f();
        if (this.mItems != null && f2 >= 0 && f2 < this.mItems.size()) {
            return (Aweme) this.mItems.get(f2);
        }
        return null;
    }

    public int getBasicItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61233f, false, 67361, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61233f, false, 67361, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.g && i2 == 0) {
            return 1;
        } else {
            if (this.m != null && i2 == 0) {
                return 3;
            }
            Aweme a2 = a(i2);
            if (a2 == null || a2.getAwemeType() != 2) {
                return super.getBasicItemViewType(i2);
            }
            return 2;
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f61233f, false, 67364, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f61233f, false, 67364, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder2 instanceof LiveViewHolder) {
            LiveViewHolder liveViewHolder = (LiveViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], liveViewHolder, LiveViewHolder.f61255a, false, 67396, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], liveViewHolder, LiveViewHolder.f61255a, false, 67396, new Class[0], Void.TYPE);
                return;
            }
            liveViewHolder.h.f54177d.removeObserver(liveViewHolder);
        }
    }

    private void a(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f61233f, false, 67356, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, f61233f, false, 67356, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (e() && aweme2 != null) {
            com.ss.android.ugc.aweme.favorites.d.a.a(1, aweme2);
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f61233f, false, 67363, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f61233f, false, 67363, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (this.j && viewHolder.getItemViewType() == 0 && this.s != null) {
            this.s.a(viewHolder2);
        }
        if (viewHolder2 instanceof LiveViewHolder) {
            LiveViewHolder liveViewHolder = (LiveViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], liveViewHolder, LiveViewHolder.f61255a, false, 67395, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], liveViewHolder, LiveViewHolder.f61255a, false, 67395, new Class[0], Void.TYPE);
                return;
            }
            liveViewHolder.h.f54177d.observe(liveViewHolder.k, liveViewHolder);
        }
    }

    private void a(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f61233f, false, 67368, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f61233f, false, 67368, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.n && this.o == 0 && list != null) {
            int size = list.size();
            int awemeCount = com.ss.android.ugc.aweme.account.d.a().getCurUser().getAwemeCount();
            if (size > awemeCount) {
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("error_type", 1);
                r.a("publish_num_check", (Map) a2.a("num_des", size + "-" + awemeCount).f34114b);
            }
            if (size == 0 && awemeCount == 1) {
                com.ss.android.ugc.aweme.app.d.d a3 = com.ss.android.ugc.aweme.app.d.d.a().a("error_type", 2);
                r.a("publish_num_check", (Map) a3.a("num_des", size + "-" + awemeCount).f34114b);
            }
            if (!this.q && size != awemeCount) {
                com.ss.android.ugc.aweme.app.d.d a4 = com.ss.android.ugc.aweme.app.d.d.a().a("error_type", 3);
                r.a("publish_num_check", (Map) a4.a("num_des", size + "-" + awemeCount).f34114b);
            }
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f61233f, false, 67358, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f61233f, false, 67358, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        switch (i2) {
            case 1:
                return new DraftBoxViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.aqr, viewGroup, false));
            case 2:
                return new ImageViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.vv, viewGroup, false), this.r, this.k);
            case 3:
                return new LiveViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.z4, viewGroup, false), this.t);
            default:
                return new AwemeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.sg, viewGroup, false), this.r, this.k);
        }
    }

    public AwemeAdapter(FragmentActivity fragmentActivity, String str, boolean z, int i2, d dVar, b bVar) {
        this.t = fragmentActivity;
        this.r = str;
        this.k = dVar;
        this.n = z;
        this.o = i2;
        this.s = bVar;
    }
}
