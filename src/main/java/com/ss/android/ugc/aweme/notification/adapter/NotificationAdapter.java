package com.ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.Observer;
import android.content.DialogInterface;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.ui.a;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.story.api.b.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationAdapter extends BaseAdapter<BaseNotice> implements Observer<d>, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57927a;

    /* renamed from: b  reason: collision with root package name */
    public int f57928b;

    /* renamed from: c  reason: collision with root package name */
    Activity f57929c;

    /* renamed from: d  reason: collision with root package name */
    List<BaseNotice> f57930d;

    /* renamed from: e  reason: collision with root package name */
    private int f57931e;

    /* renamed from: f  reason: collision with root package name */
    private String f57932f;
    private Dialog g;
    private Map<String, BaseNotice> h;
    private HashMap<String, Boolean> i = new HashMap<>();

    public final void a() {
        this.f57931e = 0;
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f57927a, false, 63068, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57927a, false, 63068, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null && this.g.isShowing()) {
            f.a(this.g);
        }
    }

    public void setData(List<BaseNotice> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f57927a, false, 63063, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f57927a, false, 63063, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f57930d = list;
        super.setData(a(list));
    }

    public void setDataAfterLoadMore(List<BaseNotice> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f57927a, false, 63064, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f57927a, false, 63064, new Class[]{List.class}, Void.TYPE);
            return;
        }
        super.setDataAfterLoadMore(a(list));
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f57927a, false, 63067, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f57927a, false, 63067, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f57927a, false, 63069, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f57927a, false, 63069, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.g == null || !this.g.isShowing()) {
            a aVar = new a(this.f57929c);
            aVar.a((CharSequence[]) new String[]{this.f57929c.getResources().getString(C0906R.string.a4f)}, (DialogInterface.OnClickListener) new e(this, i2));
            this.g = aVar.a();
            this.g.show();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.ss.android.ugc.aweme.profile.model.User} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.ss.android.ugc.aweme.profile.model.User} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            com.ss.android.ugc.aweme.story.api.b.d r7 = (com.ss.android.ugc.aweme.story.api.b.d) r7
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f57927a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.b.d> r1 = com.ss.android.ugc.aweme.story.api.b.d.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 63066(0xf65a, float:8.8374E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0035
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f57927a
            r3 = 0
            r4 = 63066(0xf65a, float:8.8374E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.b.d> r1 = com.ss.android.ugc.aweme.story.api.b.d.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0035:
            if (r7 == 0) goto L_0x00d3
            boolean r0 = r7.f71832b
            if (r0 != 0) goto L_0x003d
            goto L_0x00d3
        L_0x003d:
            r10.b()
            java.util.List r0 = r10.mItems
            java.util.Iterator r0 = r0.iterator()
        L_0x0046:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d2
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.notification.bean.BaseNotice r1 = (com.ss.android.ugc.aweme.notification.bean.BaseNotice) r1
            r2 = 0
            int r3 = r10.f57928b
            switch(r3) {
                case 0: goto L_0x00bb;
                case 1: goto L_0x00a1;
                case 12: goto L_0x0071;
                case 13: goto L_0x0059;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x00bf
        L_0x0059:
            com.ss.android.ugc.aweme.notification.bean.StoryNotice r3 = r1.storyNotice
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r3 = r3.users
            if (r3 == 0) goto L_0x00bf
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x00bf
            com.ss.android.ugc.aweme.notification.bean.StoryNotice r1 = r1.storyNotice
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r1 = r1.users
            java.lang.Object r1 = r1.get(r9)
            r2 = r1
            com.ss.android.ugc.aweme.profile.model.User r2 = (com.ss.android.ugc.aweme.profile.model.User) r2
            goto L_0x00bf
        L_0x0071:
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r3 = r1.commentNotice
            if (r3 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.notification.bean.CommentNotice r1 = r1.commentNotice
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r1.comment
            com.ss.android.ugc.aweme.profile.model.User r2 = r1.getUser()
            goto L_0x00bf
        L_0x007e:
            com.ss.android.ugc.aweme.notification.bean.AtMe r3 = r1.atMe
            if (r3 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.notification.bean.AtMe r1 = r1.atMe
            com.ss.android.ugc.aweme.profile.model.User r2 = r1.user
            goto L_0x00bf
        L_0x0087:
            com.ss.android.ugc.aweme.notification.bean.VoteNotice r3 = r1.voteNotice
            if (r3 == 0) goto L_0x00bf
            com.ss.android.ugc.aweme.notification.bean.VoteNotice r3 = r1.voteNotice
            java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r3 = r3.f57986a
            boolean r3 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00bf
            com.ss.android.ugc.aweme.notification.bean.VoteNotice r1 = r1.voteNotice
            java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r1 = r1.f57986a
            java.lang.Object r1 = r1.get(r9)
            r2 = r1
            com.ss.android.ugc.aweme.profile.model.User r2 = (com.ss.android.ugc.aweme.profile.model.User) r2
            goto L_0x00bf
        L_0x00a1:
            com.ss.android.ugc.aweme.notification.bean.StoryNotice r3 = r1.storyNotice
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r3 = r3.users
            if (r3 == 0) goto L_0x00bf
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x00bf
            com.ss.android.ugc.aweme.notification.bean.DiggNotice r1 = r1.diggNotice
            java.util.List r1 = r1.getUsers()
            java.lang.Object r1 = r1.get(r9)
            r2 = r1
            com.ss.android.ugc.aweme.profile.model.User r2 = (com.ss.android.ugc.aweme.profile.model.User) r2
            goto L_0x00bf
        L_0x00bb:
            com.ss.android.ugc.aweme.notification.bean.FollowNotice r1 = r1.followNotice
            com.ss.android.ugc.aweme.profile.model.User r2 = r1.user
        L_0x00bf:
            if (r2 == 0) goto L_0x0046
            java.lang.String r1 = r2.getUid()
            java.lang.String r3 = r7.f71831a
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x0046
            r2.setHasUnreadStory(r9)
            goto L_0x0046
        L_0x00d2:
            return
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.NotificationAdapter.onChanged(java.lang.Object):void");
    }

    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f57927a, false, 63062, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f57927a, false, 63062, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        int color = ContextCompat.getColor(viewGroup.getContext(), C0906R.color.zx);
        this.mTextColor = color;
        RecyclerView.ViewHolder onCreateFooterViewHolder = super.onCreateFooterViewHolder(viewGroup);
        AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextColor(color);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setText(C0906R.string.b5s);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setTextColor(color);
        appCompatTextView2.setTextSize(13.0f);
        appCompatTextView2.setText(C0906R.string.avk);
        DmtStatusView dmtStatusView = (DmtStatusView) onCreateFooterViewHolder.itemView;
        dmtStatusView.setBuilder(dmtStatusView.a().b((View) appCompatTextView2));
        return onCreateFooterViewHolder;
    }

    private List<BaseNotice> a(List<BaseNotice> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f57927a, false, 63065, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f57927a, false, 63065, new Class[]{List.class}, List.class);
        }
        b();
        ArrayList arrayList = new ArrayList();
        for (BaseNotice next : list) {
            switch (this.f57928b) {
                case 0:
                    if (next.followNotice == null) {
                        break;
                    } else {
                        arrayList.add(next);
                        break;
                    }
                case 1:
                    if (next.diggNotice == null) {
                        break;
                    } else {
                        arrayList.add(next);
                        break;
                    }
                case 2:
                    if (next.atMe == null) {
                        break;
                    } else {
                        arrayList.add(next);
                        break;
                    }
                case 3:
                    if (next.commentNotice == null) {
                        break;
                    } else {
                        arrayList.add(next);
                        break;
                    }
                case 4:
                    if (next.announcement != null || next.challengeNotice != null || next.textNotice != null) {
                        arrayList.add(next);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (next.textNotice != null || next.announcement != null) {
                        arrayList.add(next);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (next.shopNotice == null) {
                        break;
                    } else {
                        arrayList.add(next);
                        break;
                    }
                case 9:
                    if (next.announcement != null || next.challengeNotice != null) {
                        arrayList.add(next);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (next.announcement != null || next.challengeNotice != null || next.textNotice != null || next.shopNotice != null) {
                        arrayList.add(next);
                        break;
                    } else {
                        break;
                    }
                    break;
                case 11:
                    if (next.friendNotice == null) {
                        break;
                    } else {
                        arrayList.add(next);
                        break;
                    }
                case SearchNilInfo.HIT_TYPE_SENSITIVE:
                    if (next.commentNotice != null || next.atMe != null || next.voteNotice != null) {
                        arrayList.add(next);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (next.storyNotice == null) {
                        break;
                    } else {
                        arrayList.add(next);
                        break;
                    }
                case 15:
                    if (next.lubanNotice == null) {
                        break;
                    } else {
                        arrayList.add(next);
                        break;
                    }
                case SearchJediMixFeedAdapter.f42514c:
                    if (next.starAtlasNotice == null) {
                        break;
                    } else {
                        arrayList.add(next);
                        break;
                    }
                case 17:
                    if (next.liveAssistantNotice == null) {
                        break;
                    } else {
                        arrayList.add(next);
                        break;
                    }
                case 18:
                    if (next.walletNotice == null) {
                        break;
                    } else {
                        arrayList.add(next);
                        break;
                    }
                case 19:
                    if (next.linkProfitNotice == null) {
                        break;
                    } else {
                        arrayList.add(next);
                        break;
                    }
            }
        }
        return arrayList;
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f57927a, false, 63060, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f57927a, false, 63060, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 > this.f57931e - 1) {
            z = true;
        }
        BaseNotice baseNotice = (BaseNotice) this.mItems.get(i2);
        baseNotice.showingPosition = i2;
        if (!z && this.h.get(baseNotice.nid) != null) {
            z = true;
        }
        switch (this.f57928b) {
            case 0:
                ((FansNotificationHolder) viewHolder).a(this.h, baseNotice, z, this.f57932f);
                return;
            case 1:
                ((LikeNotificationHolder) viewHolder).a(this.h, baseNotice, z, this.f57932f);
                return;
            case 2:
                ((AtMeNotificationHolder) viewHolder).a(this.h, baseNotice, z, this.f57932f);
                return;
            case 3:
                ((CommentNotificationHolder) viewHolder).a(this.h, baseNotice, z, this.f57932f);
                return;
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 15:
            case SearchJediMixFeedAdapter.f42514c:
            case 17:
            case 18:
            case 19:
                ((DouYinHelperHolder) viewHolder).a(this.h, baseNotice, z, this.f57932f);
                return;
            case 11:
                ((FriendRecommendNotificationHolder) viewHolder).a(this.h, baseNotice, z, this.f57932f);
                return;
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                ((InteractiveNotificationHolder) viewHolder).a(this.h, baseNotice, z, this.f57932f);
                return;
            case 13:
                ((StoryNotificationHolder) viewHolder).a(this.h, baseNotice, z, this.f57932f);
                break;
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
        BaseNotificationHolder baseNotificationHolder;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f57927a, false, 63061, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f57927a, false, 63061, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        switch (this.f57928b) {
            case 0:
                baseNotificationHolder = new FansNotificationHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.y8, viewGroup, false), this.f57929c, this.i);
                break;
            case 1:
                baseNotificationHolder = new LikeNotificationHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ya, viewGroup, false), this.f57929c);
                break;
            case 2:
                baseNotificationHolder = new AtMeNotificationHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.yb, viewGroup, false), this.f57929c);
                break;
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 15:
            case SearchJediMixFeedAdapter.f42514c:
            case 17:
            case 18:
            case 19:
                baseNotificationHolder = new DouYinHelperHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.y7, viewGroup, false), this.f57929c, this.f57928b, this.f57932f);
                break;
            case 11:
                baseNotificationHolder = new AtMeNotificationHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.yb, viewGroup, false), this.f57929c);
                break;
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                baseNotificationHolder = new InteractiveNotificationHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.y_, viewGroup, false), this.f57929c);
                break;
            case 13:
                baseNotificationHolder = new StoryNotificationHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.yc, viewGroup, false), this.f57929c);
                break;
            default:
                baseNotificationHolder = new CommentNotificationHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.y6, viewGroup, false), this.f57929c);
                break;
        }
        if (baseNotificationHolder.a()) {
            baseNotificationHolder.f57854c = this;
        }
        return baseNotificationHolder;
    }

    public NotificationAdapter(int i2, Activity activity, int i3, String str) {
        this.f57928b = i2;
        this.f57929c = activity;
        this.f57931e = Math.max(0, i3);
        this.h = new HashMap(this.f57931e);
        this.f57932f = str;
    }
}
