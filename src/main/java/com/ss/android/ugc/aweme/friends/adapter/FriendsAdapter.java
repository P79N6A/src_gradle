package com.ss.android.ugc.aweme.friends.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ex;

public class FriendsAdapter<T extends User> extends RecyclerHeaderViewAdapter<T> implements SectionIndexer {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f48724f;
    private SectionIndexer g;
    private a h = new a();
    private int i = 0;
    private com.ss.android.ugc.aweme.friends.a.a j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f48725a = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f48726b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f48727c;

        /* renamed from: d  reason: collision with root package name */
        public String f48728d;
    }

    public Object[] getSections() {
        if (PatchProxy.isSupport(new Object[0], this, f48724f, false, 46297, new Class[0], Object[].class)) {
            return (Object[]) PatchProxy.accessDispatch(new Object[0], this, f48724f, false, 46297, new Class[0], Object[].class);
        } else if (this.g != null) {
            return this.g.getSections();
        } else {
            return new String[]{" "};
        }
    }

    public final int a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f48724f, false, 46292, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f48724f, false, 46292, new Class[]{String.class}, Integer.TYPE)).intValue();
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

    public final int b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f48724f, false, 46294, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f48724f, false, 46294, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        int a2 = a(str);
        if (a2 != -1 && c()) {
            a2++;
        }
        return a2;
    }

    public final int c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f48724f, false, 46296, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f48724f, false, 46296, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (getBasicItemCount() == 0) {
            return -1;
        } else {
            for (int size = this.mItems.size() - 1; size >= 0; size--) {
                User user = (User) this.mItems.get(size);
                if ((user instanceof Friend) && TextUtils.equals(((Friend) user).getSocialName(), str)) {
                    return size;
                }
            }
            return -1;
        }
    }

    public int getBasicItemViewType(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48724f, false, 46289, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48724f, false, 46289, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (com.ss.android.g.a.a()) {
            return super.getBasicItemViewType(i2);
        } else {
            if (i2 == 0 && this.f35105d != null) {
                return f35103b;
            }
            if (i2 == getItemCount() - 1) {
                return Integer.MIN_VALUE;
            }
            if (this.f35105d == null || i2 == 0) {
                i3 = i2;
            } else {
                i3 = i2 - 1;
            }
            if (((User) this.mItems.get(i3)) instanceof Friend) {
                return 22;
            }
            return 0;
        }
    }

    public int getPositionForSection(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48724f, false, 46298, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48724f, false, 46298, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.g != null) {
            return this.g.getPositionForSection(i2);
        } else {
            return -1;
        }
    }

    public int getSectionForPosition(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48724f, false, 46299, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48724f, false, 46299, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.g != null) {
            return this.g.getSectionForPosition(i2);
        } else {
            return -1;
        }
    }

    public FriendsAdapter(int i2, com.ss.android.ugc.aweme.friends.a.a aVar) {
        this.j = aVar;
        setLoadEmptyTextResId(C0906R.string.a3f);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f48724f, false, 46287, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f48724f, false, 46287, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (getItemViewType(i2) == 22) {
            if (this.f35105d == null || i2 == 0) {
                i3 = i2;
            } else {
                i3 = i2 - 1;
            }
            a(viewHolder, i3);
        } else {
            super.onBindBasicViewHolder(viewHolder, i2);
        }
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f48724f, false, 46288, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f48724f, false, 46288, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i2 == 22) {
            return new UnRegisteredFriendsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.v3, viewGroup, false), this.j);
        } else {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.v4, viewGroup, false);
            com.ss.android.ugc.aweme.friends.a.a aVar = this.j;
            if (this.i != 0) {
                z = true;
            }
            return new FriendsViewHolder(inflate, aVar, z);
        }
    }

    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        a aVar;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i3 = i2;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f48724f, false, 46286, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f48724f, false, 46286, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof UnRegisteredFriendsViewHolder) {
            UnRegisteredFriendsViewHolder unRegisteredFriendsViewHolder = (UnRegisteredFriendsViewHolder) viewHolder2;
            T t = (User) this.mItems.get(i3);
            int i4 = this.i;
            if (PatchProxy.isSupport(new Object[]{t, Integer.valueOf(i4)}, unRegisteredFriendsViewHolder, UnRegisteredFriendsViewHolder.f48778a, false, 46366, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                UnRegisteredFriendsViewHolder unRegisteredFriendsViewHolder2 = unRegisteredFriendsViewHolder;
                PatchProxy.accessDispatch(new Object[]{t, Integer.valueOf(i4)}, unRegisteredFriendsViewHolder2, UnRegisteredFriendsViewHolder.f48778a, false, 46366, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            } else {
                if (t != null) {
                    unRegisteredFriendsViewHolder.f48781d = t;
                    unRegisteredFriendsViewHolder.f48782e = i4;
                    unRegisteredFriendsViewHolder.g.setData((User) t);
                    if (t.getAvatarThumb() == null) {
                        unRegisteredFriendsViewHolder.g.getAvatarImageView().setController(null);
                    }
                    unRegisteredFriendsViewHolder.h.setText(t.getNickname());
                    unRegisteredFriendsViewHolder.i.a(t.getFollowStatus(), unRegisteredFriendsViewHolder.f48781d.getFollowerStatus());
                    if (UnRegisteredFriendsViewHolder.a(t) != null) {
                        if (UnRegisteredFriendsViewHolder.a(t).isInvited()) {
                            unRegisteredFriendsViewHolder.i.b();
                        } else {
                            unRegisteredFriendsViewHolder.i.a();
                        }
                    }
                    if (!(t instanceof Friend) || !((Friend) t).isFirstOne()) {
                        UIUtils.setViewVisibility(unRegisteredFriendsViewHolder.f48779b, 8);
                    } else {
                        UIUtils.setViewVisibility(unRegisteredFriendsViewHolder.f48779b, 0);
                    }
                }
            }
        } else {
            FriendsViewHolder friendsViewHolder = (FriendsViewHolder) viewHolder2;
            T t2 = (User) this.mItems.get(i3);
            int i5 = this.i;
            if (PatchProxy.isSupport(new Object[]{t2, Integer.valueOf(i5), Integer.valueOf(i2), this}, friendsViewHolder, FriendsViewHolder.f48732a, false, 46308, new Class[]{User.class, Integer.TYPE, Integer.TYPE, FriendsAdapter.class}, Void.TYPE)) {
                FriendsViewHolder friendsViewHolder2 = friendsViewHolder;
                PatchProxy.accessDispatch(new Object[]{t2, Integer.valueOf(i5), Integer.valueOf(i2), this}, friendsViewHolder2, FriendsViewHolder.f48732a, false, 46308, new Class[]{User.class, Integer.TYPE, Integer.TYPE, FriendsAdapter.class}, Void.TYPE);
            } else if (t2 != null) {
                friendsViewHolder.i.setVisibility(0);
                friendsViewHolder.f48735d = t2;
                friendsViewHolder.f48736e = i5;
                friendsViewHolder.g.setData((User) t2);
                if (t2.getAvatarThumb() == null) {
                    friendsViewHolder.g.getAvatarImageView().setController(null);
                }
                if (com.ss.android.g.a.a()) {
                    friendsViewHolder.h.setText(t2.getNickname());
                    if (FriendsViewHolder.a(t2) != null) {
                        if (TextUtils.isEmpty(FriendsViewHolder.a(t2).getSocialName())) {
                            friendsViewHolder.i.setText(ex.b((User) t2));
                        } else {
                            friendsViewHolder.i.setText(FriendsViewHolder.a(t2).getSocialName());
                        }
                    }
                } else if (friendsViewHolder.f48736e == 0) {
                    friendsViewHolder.h.setText(t2.getThirdName());
                    friendsViewHolder.i.setText(friendsViewHolder.f48734c.getString(C0906R.string.aid, new Object[]{t2.getNickname()}));
                } else {
                    friendsViewHolder.h.setText(t2.getNickname());
                    friendsViewHolder.i.setText(friendsViewHolder.f48734c.getString(C0906R.string.aid, new Object[]{t2.getThirdName()}));
                }
                friendsViewHolder.j.a(t2.getFollowStatus(), friendsViewHolder.f48735d.getFollowerStatus());
                if (com.ss.android.g.a.a() && friendsViewHolder.f48736e == 0 && TextUtils.isEmpty(t2.getUid()) && FriendsViewHolder.a(t2) != null) {
                    if (FriendsViewHolder.a(t2).isInvited()) {
                        friendsViewHolder.j.b();
                    } else {
                        friendsViewHolder.j.a();
                    }
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48724f, false, 46301, new Class[]{Integer.TYPE}, a.class)) {
                        aVar = (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48724f, false, 46301, new Class[]{Integer.TYPE}, a.class);
                    } else if (this.h.f48725a == i3) {
                        aVar = this.h;
                    } else {
                        this.h.f48725a = i3;
                        int sectionForPosition = getSectionForPosition(i3);
                        if (sectionForPosition == -1 || getPositionForSection(sectionForPosition) != i3) {
                            this.h.f48726b = false;
                            this.h.f48728d = null;
                        } else {
                            this.h.f48726b = true;
                            this.h.f48728d = (String) getSections()[sectionForPosition];
                        }
                        a aVar2 = this.h;
                        if (getPositionForSection(sectionForPosition + 1) - 1 != i3) {
                            z = false;
                        }
                        aVar2.f48727c = z;
                        aVar = this.h;
                    }
                    if (!TextUtils.isEmpty(aVar.f48728d)) {
                        friendsViewHolder.l.setVisibility(0);
                        friendsViewHolder.l.setText(aVar.f48728d);
                        return;
                    }
                    friendsViewHolder.l.setVisibility(8);
                }
            }
        }
    }
}
