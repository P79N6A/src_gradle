package com.ss.android.ugc.aweme.friends.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.h;
import com.ss.android.ugc.aweme.base.widget.HeaderHolder;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.a;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder;
import com.ss.android.ugc.aweme.friends.ui.RecommendFriendItemViewV2Holder;
import com.ss.android.ugc.aweme.friends.ui.RecommendFriendsTitleHolder;
import com.ss.android.ugc.aweme.friends.ui.ak;
import com.ss.android.ugc.aweme.friends.ui.am;
import com.ss.android.ugc.aweme.newfollow.util.k;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class RecommendListAdapter extends BaseAdapter<User> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48751a = null;
    private static final String o = "com.ss.android.ugc.aweme.friends.adapter.RecommendListAdapter";

    /* renamed from: b  reason: collision with root package name */
    public List<User> f48752b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public View f48753c;

    /* renamed from: d  reason: collision with root package name */
    public View f48754d;

    /* renamed from: e  reason: collision with root package name */
    public int f48755e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f48756f = 0;
    public int g = -1;
    public boolean h;
    public RecommendAwemeViewHolder.a i;
    public RecyclerView j;
    public h<User> k;
    public String l = "find_friends";
    public String m;
    public String n;
    private Set<Integer> p = new HashSet();
    private Context q;
    private final boolean r;
    private HashMap<String, Boolean> s = new HashMap<>();

    private int a() {
        if (PatchProxy.isSupport(new Object[0], this, f48751a, false, 46344, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48751a, false, 46344, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f48752b.isEmpty()) {
            return 0;
        } else {
            return Math.min(this.f48752b.size(), 3) + 1;
        }
    }

    public int getBasicItemCount() {
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f48751a, false, 46339, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48751a, false, 46339, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f48753c != null) {
            i3 = 1;
        }
        int basicItemCount = super.getBasicItemCount() + Math.min(this.f48752b.size(), 3);
        if (basicItemCount > 0) {
            i2++;
            if (this.f48755e > 0) {
                i2++;
            }
            if (!this.f48752b.isEmpty()) {
                i2++;
            }
        }
        return basicItemCount + i2;
    }

    private int b(int i2) {
        if (this.f48755e <= 0 || i2 <= this.f48755e + 2) {
            return i2 - 2;
        }
        return i2 - 3;
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48751a, false, 46332, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48751a, false, 46332, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f48753c = view;
        notifyItemInserted(0);
    }

    public final void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48751a, false, 46333, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48751a, false, 46333, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f48754d = view;
        notifyItemInserted(getItemCount() - 1);
    }

    public void addData(List<User> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f48751a, false, 46345, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f48751a, false, 46345, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            if (this.mItems == null) {
                this.mItems = new ArrayList();
            }
            this.mItems.addAll(list);
            this.mItems = a(this.mItems);
            notifyDataSetChanged();
        }
    }

    private boolean a(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48751a, false, 46336, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48751a, false, 46336, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (this.mItems == null) {
            i3 = 0;
        } else {
            i3 = this.mItems.size();
        }
        if (i2 < 0 || i2 >= i3) {
            return false;
        }
        return true;
    }

    public int getBasicItemViewType(int i2) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48751a, false, 46338, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48751a, false, 46338, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (this.f48755e > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !this.f48752b.isEmpty();
        int min = Math.min(this.f48752b.size(), 3);
        if (this.f48753c == null) {
            if (i2 == 0) {
                if (z2) {
                    return 5;
                }
                if (z) {
                    this.g = i2;
                }
                if (z) {
                    return 3;
                }
                return 4;
            } else if (z2) {
                if (i2 == min + 1) {
                    if (z) {
                        return 3;
                    }
                    return 4;
                }
            } else if (z && i2 == this.f48755e + 1) {
                return 4;
            }
        } else if (i2 == 0) {
            return 0;
        } else {
            if (i2 == 1) {
                if (z2) {
                    return 5;
                }
                if (z) {
                    this.g = i2;
                }
                if (z) {
                    return 3;
                }
                return 4;
            } else if (z2) {
                if (z) {
                    int i3 = min + 2;
                    if (i2 == i3) {
                        return 3;
                    }
                    if (i2 == i3 + 1 + this.f48755e) {
                        return 4;
                    }
                } else if (i2 == min + 2) {
                    return 4;
                }
            } else if (z && i2 == this.f48755e + 2) {
                return 4;
            }
        }
        if (this.f48754d == null || i2 != getItemCount() - 1) {
            return 2;
        }
        return 1;
    }

    public List<User> a(List<User> list) {
        List<User> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f48751a, false, 46346, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list2}, this, f48751a, false, 46346, new Class[]{List.class}, List.class);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (User next : list) {
            if (hashSet.add(next.getUid())) {
                arrayList.add(next);
            }
        }
        list.clear();
        list2.addAll(arrayList);
        return list2;
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f48751a, false, 46334, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f48751a, false, 46334, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof RecommendFriendItemViewV2Holder) {
            User a2 = ((RecommendFriendItemViewV2Holder) viewHolder).a();
            if (this.f48752b != null && this.f48752b.contains(a2) && this.f48752b.indexOf(a2) < 3) {
                str = "recent_fans";
            } else if (a2 == null) {
                str = "";
            } else if (a2.isNewRecommend()) {
                str = "new";
            } else {
                str = "past";
            }
            int indexOf = this.mItems.indexOf(a2);
            if (!this.p.contains(Integer.valueOf(indexOf))) {
                this.p.add(Integer.valueOf(indexOf));
                k a3 = k.a();
                if (a2 == null) {
                    str2 = "";
                } else {
                    str2 = a2.getUid();
                }
                a3.a(3, str2);
                JSONObject jSONObject = new JSONObject();
                if (a2 == null) {
                    str3 = "";
                } else {
                    try {
                        str3 = a2.getUid();
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("rec_uid", str3);
                jSONObject.put("enter_from", this.l);
                jSONObject.put("event_type", "impression");
                jSONObject.put("previous_page", this.m);
                jSONObject.put("impr_order", indexOf);
                if (a2 != null) {
                    str4 = a2.getRequestId();
                } else {
                    str4 = "";
                }
                jSONObject.put("req_id", str4);
                jSONObject.put("is_direct", 1);
                jSONObject.put("page_status", "nonempty");
                jSONObject.put("trigger_reason", "friend_rec_message");
                if (a2 == null) {
                    str5 = "";
                } else {
                    str5 = a2.getRecommendReason();
                }
                jSONObject.put("rec_reason", str5);
                jSONObject.put("card_type", str);
                if ("others_homepage".equals(this.l)) {
                    jSONObject.put("profile_uid", this.n);
                }
                r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject));
                r.a("follow_card", jSONObject);
            }
        }
    }

    public final void a(User user) {
        int i2;
        int max;
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{user}, this, f48751a, false, 46340, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f48751a, false, 46340, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (a.a((Collection<User>) this.mItems, user)) {
            if (PatchProxy.isSupport(new Object[]{user}, this, f48751a, false, 46343, new Class[]{User.class}, Integer.TYPE)) {
                max = ((Integer) PatchProxy.accessDispatch(new Object[]{user}, this, f48751a, false, 46343, new Class[]{User.class}, Integer.TYPE)).intValue();
            } else {
                int a2 = a();
                if (this.f48755e <= 0) {
                    i2 = 0;
                } else {
                    i2 = this.f48755e + 1;
                }
                int a3 = a.a(this.mItems, user);
                if (a3 < this.f48755e) {
                    max = a2 + 1 + 1 + a3;
                } else {
                    max = ((((a2 + 1) + i2) + 1) + a3) - Math.max(0, this.f48755e);
                }
            }
            int i5 = max;
            if (this.f48755e > 0) {
                if (PatchProxy.isSupport(new Object[0], this, f48751a, false, 46341, new Class[0], Integer.TYPE)) {
                    i3 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48751a, false, 46341, new Class[0], Integer.TYPE)).intValue();
                } else {
                    i3 = this.f48755e + 1 + a() + 1;
                }
                if (i5 < i3) {
                    this.f48755e--;
                    if (this.f48755e == 0) {
                        if (PatchProxy.isSupport(new Object[0], this, f48751a, false, 46342, new Class[0], Integer.TYPE)) {
                            i4 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48751a, false, 46342, new Class[0], Integer.TYPE)).intValue();
                        } else {
                            i4 = a() + 1;
                        }
                        notifyItemRemoved(i4);
                    }
                }
            }
            a.b(this.mItems, user);
            notifyItemRemoved(i5);
        }
        if (a.a((Collection<User>) this.f48752b, user)) {
            int a4 = a.a(this.f48752b, user);
            a.b(this.f48752b, user);
            if (a4 < 3) {
                notifyItemRemoved(a4 + 2);
                if (this.f48752b.size() >= 3) {
                    notifyItemInserted(4);
                }
            }
        }
    }

    public RecommendListAdapter(Context context, boolean z) {
        this.q = context;
        setLoadEmptyTextResId(C0906R.string.a3f);
        this.r = z;
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
        ak akVar;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f48751a, false, 46337, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f48751a, false, 46337, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        switch (i2) {
            case 0:
                return new HeaderHolder(this.f48753c);
            case 1:
                return onCreateFooterViewHolder(viewGroup);
            case 2:
                if (com.ss.android.g.a.a()) {
                    akVar = new ak(viewGroup.getContext(), this.s, this.r);
                } else {
                    akVar = new am(viewGroup.getContext(), this.s, this.r);
                }
                akVar.setEnterFrom(this.l);
                akVar.setListener(this.k);
                akVar.setRecommendUserType(this.f48756f);
                akVar.setRecommendAwemeClickListener(this.i);
                return new RecommendFriendItemViewV2Holder(akVar);
            case 3:
            case 4:
            case 5:
                return new RecommendFriendsTitleHolder(LayoutInflater.from(this.q).inflate(C0906R.layout.v2, viewGroup, false));
            default:
                return null;
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f48751a, false, 46335, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f48751a, false, 46335, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (getItemViewType(i2)) {
            case 0:
                return;
            case 1:
                if (viewHolder instanceof LoadMoreRecyclerViewAdapter.LoadMoreViewHolder) {
                    ((LoadMoreRecyclerViewAdapter.LoadMoreViewHolder) viewHolder).a();
                    break;
                }
                break;
            case 2:
                if (viewHolder instanceof RecommendFriendItemViewV2Holder) {
                    if (!this.f48752b.isEmpty()) {
                        int min = Math.min(this.f48752b.size(), 3) + 1;
                        if (2 <= i2 && i2 < min + 2) {
                            int i3 = i2 - 2;
                            ((RecommendFriendItemViewV2Holder) viewHolder).a(this.f48752b.get(i3), i3, false, this.f48756f);
                            break;
                        } else {
                            int b2 = b(i2 - min);
                            if (a(b2)) {
                                if (this.f48755e > 0) {
                                    int i4 = min + 2;
                                    if (i2 < this.f48755e + i4 && i2 >= i4) {
                                        z = true;
                                    }
                                }
                                ((RecommendFriendItemViewV2Holder) viewHolder).a((User) this.mItems.get(b2), b2, z, this.f48756f);
                                return;
                            }
                            return;
                        }
                    } else {
                        int b3 = b(i2);
                        if (a(b3)) {
                            if ((this.f48755e <= 0 || i2 <= this.f48755e + 2) && this.f48755e > 0) {
                                z = true;
                            }
                            ((RecommendFriendItemViewV2Holder) viewHolder).a((User) this.mItems.get(b3), b3, z, this.f48756f);
                            return;
                        }
                        return;
                    }
                }
                break;
            case 3:
                if (viewHolder instanceof RecommendFriendsTitleHolder) {
                    RecommendFriendsTitleHolder recommendFriendsTitleHolder = (RecommendFriendsTitleHolder) viewHolder;
                    recommendFriendsTitleHolder.a(true, this.f48756f, this.f48755e, false, "");
                    if (this.h) {
                        recommendFriendsTitleHolder.a();
                    }
                    return;
                }
                break;
            case 4:
                if (viewHolder instanceof RecommendFriendsTitleHolder) {
                    ((RecommendFriendsTitleHolder) viewHolder).a(false, this.f48756f, this.f48755e, false, "");
                    return;
                }
                break;
            case 5:
                if (viewHolder instanceof RecommendFriendsTitleHolder) {
                    RecommendFriendsTitleHolder recommendFriendsTitleHolder2 = (RecommendFriendsTitleHolder) viewHolder;
                    recommendFriendsTitleHolder2.a(true, this.f48756f, this.f48755e, true, "");
                    if (this.h) {
                        recommendFriendsTitleHolder2.a();
                    }
                    return;
                }
                break;
        }
    }
}
