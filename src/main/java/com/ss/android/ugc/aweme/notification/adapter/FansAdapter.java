package com.ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.h;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder;
import com.ss.android.ugc.aweme.friends.ui.RecommendFriendItemViewV2Holder;
import com.ss.android.ugc.aweme.newfollow.util.k;
import com.ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.FollowNotice;
import com.ss.android.ugc.aweme.notification.bean.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001PBA\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\b\u00101\u001a\u00020\nH\u0002J\u000e\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\rJ\u0010\u00102\u001a\u00020\n2\u0006\u00104\u001a\u00020\u0007H\u0002J\u0010\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0016J\u0018\u00106\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0002H\u0002J\u0018\u00108\u001a\u00020\n2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010,H\u0002J\u0006\u0010:\u001a\u00020\nJ\u0016\u0010;\u001a\u00020\n2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010,J\u0016\u0010<\u001a\u00020\n2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010,J\u0018\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020&2\u0006\u00104\u001a\u00020\u0007H\u0002J\u0018\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020A2\u0006\u00104\u001a\u00020\u0007H\u0016J\u0018\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0007H\u0016J\u0010\u0010F\u001a\u00020A2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010G\u001a\u00020\n2\u0006\u00104\u001a\u00020\u0007H\u0016J\u0010\u0010H\u001a\u00020\n2\u0006\u0010@\u001a\u00020AH\u0016J\u0016\u0010I\u001a\u00020\n2\u0006\u00103\u001a\u00020\r2\u0006\u0010J\u001a\u00020\u0007J\u0006\u0010K\u001a\u00020\nJ\b\u0010L\u001a\u00020\nH\u0002J\u0016\u0010M\u001a\u00020\n2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010,J\u0016\u0010N\u001a\u00020\n2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010,J\u0010\u0010O\u001a\u00020\n2\u0006\u00104\u001a\u00020\u0007H\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110 X\u0004¢\u0006\u0002\n\u0000R*\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\"j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0017`#X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020&0%X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070*X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b0\u0010\u0015¨\u0006Q"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/adapter/FansAdapter;", "Lcom/ss/android/ugc/aweme/common/adapter/BaseAdapter;", "", "Lcom/ss/android/ugc/aweme/notification/adapter/INotificationLongClickListener;", "mActivity", "Landroid/app/Activity;", "unReadMessageCount", "", "onLoadAllFans", "Lkotlin/Function0;", "", "listener", "Lcom/ss/android/ugc/aweme/base/activity/ViewEventListener;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "recommendAwemeListener", "Lcom/ss/android/ugc/aweme/friends/adapter/RecommendAwemeViewHolder$RecommendAwemeClickListener;", "enterFrom", "", "(Landroid/app/Activity;ILkotlin/jvm/functions/Function0;Lcom/ss/android/ugc/aweme/base/activity/ViewEventListener;Lcom/ss/android/ugc/aweme/friends/adapter/RecommendAwemeViewHolder$RecommendAwemeClickListener;Ljava/lang/String;)V", "fansStatusIndex", "getFansStatusIndex", "()I", "hasFansStatus", "", "getHasFansStatus", "()Z", "hasRecommendTitle", "getHasRecommendTitle", "isFirstRefresh", "mActionDialog", "Landroid/app/Dialog;", "mCachedId", "", "mFollowClickMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "mReadNoticeMap", "", "Lcom/ss/android/ugc/aweme/notification/bean/BaseNotice;", "mShownId", "mUnreadMessageCount", "posInApiListMap", "", "recommendList", "", "getRecommendList", "()Ljava/util/List;", "recommendTitleIndex", "getRecommendTitleIndex", "cacheIds", "deleteRecommend", "user", "position", "getBasicItemViewType", "getIsRead", "item", "insertListData", "list", "loadMoreNotice", "loadMoreNoticeData", "loadMoreRecommendData", "logNoticeDelete", "notice", "onBindBasicViewHolder", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "onCreateBasicViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onCreateFooterViewHolder", "onLongClick", "onViewAttachedToWindow", "refreshFollowStatus", "followStatus", "resetUnread", "savePosInApiList", "setNoticeData", "setRecommendData", "showDeleteDialog", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FansAdapter extends BaseAdapter<Object> implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57869a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f57870e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public int f57871b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f57872c = true;

    /* renamed from: d  reason: collision with root package name */
    final Activity f57873d;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, BaseNotice> f57874f;
    private final Set<String> g = new HashSet();
    private final Set<String> h = new HashSet();
    private Dialog i;
    private final HashMap<String, Boolean> j = new HashMap<>();
    private final Map<String, Integer> k = new LinkedHashMap();
    private final Function0<Unit> l;
    private final h<User> m;
    private final RecommendAwemeViewHolder.a n;
    private final String o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/adapter/FansAdapter$Companion;", "", "()V", "TYPE_FANS", "", "TYPE_RECOMMEND", "TYPE_RECOMMEND_TITLE", "TYPE_STATUS", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57875a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FansAdapter f57876b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f57877c;

        b(FansAdapter fansAdapter, int i) {
            this.f57876b = fansAdapter;
            this.f57877c = i;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f57875a, false, 62964, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f57875a, false, 62964, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            int size = this.f57876b.mItems.size();
            if (size > 0 && this.f57877c >= 0 && this.f57877c < size) {
                Object obj = this.f57876b.mItems.get(this.f57877c);
                if (obj != null && (obj instanceof BaseNotice)) {
                    BaseNotice baseNotice = (BaseNotice) obj;
                    NoticeApiManager.a(baseNotice.nid);
                    FansAdapter fansAdapter = this.f57876b;
                    int i2 = this.f57877c;
                    if (PatchProxy.isSupport(new Object[]{baseNotice, Integer.valueOf(i2)}, fansAdapter, FansAdapter.f57869a, false, 62963, new Class[]{BaseNotice.class, Integer.TYPE}, Void.TYPE)) {
                        FansAdapter fansAdapter2 = fansAdapter;
                        PatchProxy.accessDispatch(new Object[]{baseNotice, Integer.valueOf(i2)}, fansAdapter2, FansAdapter.f57869a, false, 62963, new Class[]{BaseNotice.class, Integer.TYPE}, Void.TYPE);
                    } else {
                        Map hashMap = new HashMap();
                        hashMap.put("scene_id", "1005");
                        hashMap.put("account_type", "fans");
                        hashMap.put("client_order", String.valueOf(i2));
                        hashMap.put("action_type", "delete");
                        String str = null;
                        if (fansAdapter.f57873d.getIntent() != null) {
                            str = fansAdapter.f57873d.getIntent().getStringExtra("rule_id");
                        }
                        if (str != null && !TextUtils.isEmpty(str)) {
                            hashMap.put("rule_id", str);
                        }
                        r.a("notification_message_inner_message", hashMap);
                    }
                }
                this.f57876b.mItems.remove(this.f57877c);
                this.f57876b.notifyItemRemoved(this.f57877c);
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r1 == null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable java.util.List<? extends com.ss.android.ugc.aweme.notification.bean.BaseNotice> r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f57869a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 62952(0xf5e8, float:8.8215E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f57869a
            r3 = 0
            r4 = 62952(0xf5e8, float:8.8215E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x003f
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r7 = 0
        L_0x003f:
            if (r7 == 0) goto L_0x0042
            return
        L_0x0042:
            java.util.List r1 = r9.mItems
            if (r1 == 0) goto L_0x004e
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection<? extends T>) r1)
            if (r1 != 0) goto L_0x0055
        L_0x004e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
        L_0x0055:
            int r2 = r9.a()
            int r2 = java.lang.Math.max(r2, r8)
            if (r10 != 0) goto L_0x0062
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0062:
            r1.addAll(r2, r0)
            r9.setData(r1)
            boolean r0 = r9.f57872c
            if (r0 != 0) goto L_0x008d
            java.util.Iterator r0 = r10.iterator()
        L_0x0070:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x008a
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.notification.bean.BaseNotice r1 = (com.ss.android.ugc.aweme.notification.bean.BaseNotice) r1
            java.util.Set<java.lang.String> r2 = r9.g
            java.lang.String r1 = r1.nid
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0087
            goto L_0x008b
        L_0x0087:
            int r8 = r8 + 1
            goto L_0x0070
        L_0x008a:
            r8 = -1
        L_0x008b:
            r9.f57871b = r8
        L_0x008d:
            r9.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.FansAdapter.a(java.util.List):void");
    }

    public final int b() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f57869a, false, 62940, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f57869a, false, 62940, new Class[0], Integer.TYPE)).intValue();
        }
        List<Object> list = this.mItems;
        if (list == null) {
            return -1;
        }
        for (Object obj : list) {
            if (obj instanceof c) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @NotNull
    public final List<User> c() {
        if (PatchProxy.isSupport(new Object[0], this, f57869a, false, 62943, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f57869a, false, 62943, new Class[0], List.class);
        }
        int a2 = a();
        if (a2 < 0) {
            return CollectionsKt.emptyList();
        }
        List list = this.mItems;
        Intrinsics.checkExpressionValueIsNotNull(list, "mItems");
        Collection arrayList = new ArrayList();
        for (Object next : CollectionsKt.takeLast(list, this.mItems.size() - a2)) {
            if (next instanceof User) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f57869a, false, 62951, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57869a, false, 62951, new Class[0], Void.TYPE);
            return;
        }
        int b2 = b();
        if (b2 >= 0) {
            Object obj = this.mItems.get(b2);
            if (obj != null) {
                ((c) obj).f57993a = 1;
                notifyItemChanged(b2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.bean.FansStatus");
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f57869a, false, 62955, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57869a, false, 62955, new Class[0], Void.TYPE);
            return;
        }
        int size = getData().size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = getData().get(i2);
            if ((obj instanceof User) && !(obj instanceof com.ss.android.ugc.aweme.notification.bean.b)) {
                Map<String, Integer> map = this.k;
                String uid = ((User) obj).getUid();
                Intrinsics.checkExpressionValueIsNotNull(uid, "item.uid");
                map.put(uid, Integer.valueOf((i2 - a()) - 1));
            }
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f57869a, false, 62960, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57869a, false, 62960, new Class[0], Void.TYPE);
            return;
        }
        List list = this.mItems;
        Intrinsics.checkExpressionValueIsNotNull(list, "mItems");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof BaseNotice) {
                arrayList.add(next);
            }
        }
        Collection collection = this.g;
        for (BaseNotice baseNotice : (List) arrayList) {
            String str = baseNotice.nid;
            if (str != null) {
                collection.add(str);
            }
        }
    }

    public final int a() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f57869a, false, 62939, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f57869a, false, 62939, new Class[0], Integer.TYPE)).intValue();
        }
        List<Object> list = this.mItems;
        if (list == null) {
            return -1;
        }
        for (Object obj : list) {
            if (obj instanceof com.ss.android.ugc.aweme.notification.bean.b) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final int getBasicItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f57869a, false, 62944, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f57869a, false, 62944, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Object obj = this.mItems.get(i2);
        if (obj instanceof c) {
            return 10001;
        }
        if (obj instanceof com.ss.android.ugc.aweme.notification.bean.b) {
            return 10003;
        }
        if (obj instanceof User) {
            return 10004;
        }
        return 10002;
    }

    public final void b(List<? extends Object> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f57869a, false, 62959, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f57869a, false, 62959, new Class[]{List.class}, Void.TYPE);
        } else if (list != null) {
            if (this.mItems == null) {
                this.mItems = new ArrayList();
            }
            int size = this.mItems.size();
            this.mItems.addAll(list);
            if (this.mShowFooter) {
                notifyItemChanged(size);
                notifyItemRangeInserted(size + 1, list.size());
            } else {
                notifyItemRangeInserted(size, list.size());
            }
            e();
        }
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateFooterViewHolder(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f57869a, false, 62949, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f57869a, false, 62949, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        int color = ContextCompat.getColor(viewGroup.getContext(), C0906R.color.zx);
        this.mTextColor = color;
        RecyclerView.ViewHolder onCreateFooterViewHolder = super.onCreateFooterViewHolder(viewGroup);
        View view = onCreateFooterViewHolder.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            DmtStatusView.a a2 = dmtStatusView.a();
            DmtTextView dmtTextView = new DmtTextView(viewGroup.getContext());
            dmtTextView.setGravity(17);
            dmtTextView.setTextColor(color);
            dmtTextView.setTextSize(13.0f);
            dmtTextView.setText(C0906R.string.avk);
            dmtStatusView.setBuilder(a2.b((View) dmtTextView));
            Intrinsics.checkExpressionValueIsNotNull(onCreateFooterViewHolder, "superFooterHolder");
            return onCreateFooterViewHolder;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    public final void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f57869a, false, 62950, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f57869a, false, 62950, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof RecommendFriendItemViewV2Holder) {
            User a2 = ((RecommendFriendItemViewV2Holder) viewHolder).a();
            if (a2 != null && !this.h.contains(a2.getUid())) {
                Set<String> set = this.h;
                String uid = a2.getUid();
                Intrinsics.checkExpressionValueIsNotNull(uid, "uid");
                set.add(uid);
                h<User> hVar = this.m;
                Integer num = this.k.get(a2.getUid());
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                hVar.a(103, a2, i2, viewHolder.itemView, "");
                k.a().a(3, a2.getUid());
            }
        } else if (viewHolder instanceof FansHolder) {
            FansHolder fansHolder = (FansHolder) viewHolder;
            User c2 = fansHolder.c();
            if (c2 != null && !this.h.contains(c2.getUid())) {
                int adapterPosition = fansHolder.getAdapterPosition();
                Object obj = this.mItems.get(adapterPosition);
                Intrinsics.checkExpressionValueIsNotNull(obj, "item");
                a(adapterPosition, obj);
                Set<String> set2 = this.h;
                String uid2 = c2.getUid();
                Intrinsics.checkExpressionValueIsNotNull(uid2, "uid");
                set2.add(uid2);
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f57869a, false, 62961, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f57869a, false, 62961, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f57869a, false, 62962, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f57869a, false, 62962, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Dialog dialog = this.i;
        if (dialog == null || !dialog.isShowing()) {
            com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(this.f57873d);
            aVar.a((CharSequence[]) new String[]{this.f57873d.getResources().getString(C0906R.string.a4f)}, (DialogInterface.OnClickListener) new b(this, i2));
            this.i = aVar.a();
            Dialog dialog2 = this.i;
            if (dialog2 != null) {
                dialog2.show();
            }
        }
    }

    public final void a(@NotNull User user) {
        int i2;
        boolean z;
        if (PatchProxy.isSupport(new Object[]{user}, this, f57869a, false, 62957, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f57869a, false, 62957, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
        List list = this.mItems;
        Intrinsics.checkExpressionValueIsNotNull(list, "mItems");
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it2.next();
            if (!(next instanceof User) || !Intrinsics.areEqual((Object) ((User) next).getUid(), (Object) user.getUid())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f57869a, false, 62958, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f57869a, false, 62958, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 >= 0 && i2 < this.mItems.size()) {
            this.mItems.remove(i2);
            notifyItemRemoved(i2);
            int a2 = a();
            if (a2 == this.mItems.size() - 1) {
                this.mItems.remove(a2);
                notifyItemRemoved(a2);
            }
        }
    }

    private final boolean a(int i2, Object obj) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), obj}, this, f57869a, false, 62946, new Class[]{Integer.TYPE, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), obj}, this, f57869a, false, 62946, new Class[]{Integer.TYPE, Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (i2 > this.f57871b - 1) {
            z = true;
        }
        if (obj instanceof BaseNotice) {
            BaseNotice baseNotice = (BaseNotice) obj;
            baseNotice.showingPosition = i2;
            if (!z && this.f57874f.get(baseNotice.nid) != null) {
                z = true;
            }
        }
        return z;
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(@NotNull ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f57869a, false, 62948, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f57869a, false, 62948, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        switch (i2) {
            case 10001:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.u3, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…ns_status, parent, false)");
                viewHolder = new FansStatusHolder(inflate, this.l);
                break;
            case 10002:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.u0, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate2, "LayoutInflater.from(pare…item_fans, parent, false)");
                viewHolder = new FansHolder(inflate2, this.f57873d, this.j);
                break;
            case 10003:
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.u2, viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate3, "LayoutInflater.from(pare…end_title, parent, false)");
                viewHolder = new FansRecommendTitleHolder(inflate3);
                break;
            default:
                Context context = viewGroup.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
                com.ss.android.ugc.aweme.notification.view.a aVar = new com.ss.android.ugc.aweme.notification.view.a(context, this.j, true);
                aVar.setEnterFrom("message_fans");
                aVar.setListener(this.m);
                aVar.setRecommendAwemeClickListener(this.n);
                return new RecommendFriendItemViewV2Holder(aVar);
        }
        if (viewHolder instanceof BaseNotificationHolder) {
            BaseNotificationHolder baseNotificationHolder = (BaseNotificationHolder) viewHolder;
            if (baseNotificationHolder.a()) {
                baseNotificationHolder.f57854c = this;
            }
        }
        return viewHolder;
    }

    public final void onBindBasicViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
        Object value;
        int i3;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f57869a, false, 62947, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f57869a, false, 62947, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        int basicItemViewType = getBasicItemViewType(i4);
        Object obj = this.mItems.get(i4);
        Intrinsics.checkExpressionValueIsNotNull(obj, "item");
        boolean a2 = a(i4, obj);
        int i5 = 8;
        switch (basicItemViewType) {
            case 10001:
                FansStatusHolder fansStatusHolder = (FansStatusHolder) viewHolder2;
                BaseNotice baseNotice = (BaseNotice) obj;
                if (PatchProxy.isSupport(new Object[]{baseNotice}, fansStatusHolder, FansStatusHolder.f57896a, false, 63022, new Class[]{BaseNotice.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{baseNotice}, fansStatusHolder, FansStatusHolder.f57896a, false, 63022, new Class[]{BaseNotice.class}, Void.TYPE);
                    break;
                } else {
                    Intrinsics.checkParameterIsNotNull(baseNotice, "notice");
                    if (baseNotice instanceof c) {
                        switch (((c) baseNotice).f57993a) {
                            case 0:
                                TextView a3 = fansStatusHolder.a();
                                Intrinsics.checkExpressionValueIsNotNull(a3, "mText");
                                a3.setVisibility(0);
                                DmtLoadingLayout b2 = fansStatusHolder.b();
                                Intrinsics.checkExpressionValueIsNotNull(b2, "mLoading");
                                b2.setVisibility(8);
                                DmtDefaultView c2 = fansStatusHolder.c();
                                Intrinsics.checkExpressionValueIsNotNull(c2, "mEmpty");
                                c2.setVisibility(8);
                                break;
                            case 1:
                                TextView a4 = fansStatusHolder.a();
                                Intrinsics.checkExpressionValueIsNotNull(a4, "mText");
                                a4.setVisibility(8);
                                DmtLoadingLayout b3 = fansStatusHolder.b();
                                Intrinsics.checkExpressionValueIsNotNull(b3, "mLoading");
                                b3.setVisibility(0);
                                DmtDefaultView c3 = fansStatusHolder.c();
                                Intrinsics.checkExpressionValueIsNotNull(c3, "mEmpty");
                                c3.setVisibility(8);
                                break;
                            case 2:
                                TextView a5 = fansStatusHolder.a();
                                Intrinsics.checkExpressionValueIsNotNull(a5, "mText");
                                a5.setVisibility(8);
                                DmtLoadingLayout b4 = fansStatusHolder.b();
                                Intrinsics.checkExpressionValueIsNotNull(b4, "mLoading");
                                b4.setVisibility(8);
                                DmtDefaultView c4 = fansStatusHolder.c();
                                Intrinsics.checkExpressionValueIsNotNull(c4, "mEmpty");
                                c4.setVisibility(0);
                                break;
                            default:
                                TextView a6 = fansStatusHolder.a();
                                Intrinsics.checkExpressionValueIsNotNull(a6, "mText");
                                a6.setVisibility(8);
                                DmtLoadingLayout b5 = fansStatusHolder.b();
                                Intrinsics.checkExpressionValueIsNotNull(b5, "mLoading");
                                b5.setVisibility(8);
                                DmtDefaultView c5 = fansStatusHolder.c();
                                Intrinsics.checkExpressionValueIsNotNull(c5, "mEmpty");
                                c5.setVisibility(8);
                                break;
                        }
                    }
                    return;
                }
            case 10002:
                ((FansHolder) viewHolder2).a(this.f57874f, (BaseNotice) obj, a2, this.o);
                return;
            case 10003:
                FansRecommendTitleHolder fansRecommendTitleHolder = (FansRecommendTitleHolder) viewHolder2;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, fansRecommendTitleHolder, FansRecommendTitleHolder.f57893a, false, 63017, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    FansRecommendTitleHolder fansRecommendTitleHolder2 = fansRecommendTitleHolder;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, fansRecommendTitleHolder2, FansRecommendTitleHolder.f57893a, false, 63017, new Class[]{Integer.TYPE}, Void.TYPE);
                    break;
                } else {
                    if (PatchProxy.isSupport(new Object[0], fansRecommendTitleHolder, FansRecommendTitleHolder.f57893a, false, 63016, new Class[0], View.class)) {
                        value = PatchProxy.accessDispatch(new Object[0], fansRecommendTitleHolder, FansRecommendTitleHolder.f57893a, false, 63016, new Class[0], View.class);
                    } else {
                        value = fansRecommendTitleHolder.f57895c.getValue();
                    }
                    View view = (View) value;
                    Intrinsics.checkExpressionValueIsNotNull(view, "mLine");
                    if (i4 != 0) {
                        i5 = 0;
                    }
                    view.setVisibility(i5);
                    return;
                }
            default:
                RecommendFriendItemViewV2Holder recommendFriendItemViewV2Holder = (RecommendFriendItemViewV2Holder) viewHolder2;
                User user = (User) obj;
                Integer num = this.k.get(user.getUid());
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = 0;
                }
                recommendFriendItemViewV2Holder.a(user, i3, false, 18);
                break;
        }
    }

    public final void a(@NotNull User user, int i2) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i2)}, this, f57869a, false, 62945, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i2)}, this, f57869a, false, 62945, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
        List list = this.mItems;
        Intrinsics.checkExpressionValueIsNotNull(list, "mItems");
        Iterator it2 = CollectionsKt.getIndices(list).iterator();
        while (it2.hasNext()) {
            int nextInt = ((IntIterator) it2).nextInt();
            Object obj = this.mItems.get(nextInt);
            if (obj instanceof BaseNotice) {
                FollowNotice followNotice = ((BaseNotice) obj).followNotice;
                if (!(followNotice == null || followNotice.user == null)) {
                    User user2 = followNotice.user;
                    Intrinsics.checkExpressionValueIsNotNull(user2, "followNotice.user");
                    if (TextUtils.equals(user2.getUid(), user.getUid())) {
                        User user3 = followNotice.user;
                        Intrinsics.checkExpressionValueIsNotNull(user3, "followNotice.user");
                        user3.setFollowStatus(i2);
                        notifyItemChanged(nextInt);
                    }
                }
            }
        }
    }

    public FansAdapter(@NotNull Activity activity, int i2, @NotNull Function0<Unit> function0, @NotNull h<User> hVar, @NotNull RecommendAwemeViewHolder.a aVar, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        Intrinsics.checkParameterIsNotNull(function0, "onLoadAllFans");
        Intrinsics.checkParameterIsNotNull(hVar, "listener");
        Intrinsics.checkParameterIsNotNull(aVar, "recommendAwemeListener");
        Intrinsics.checkParameterIsNotNull(str, "enterFrom");
        this.f57873d = activity;
        this.l = function0;
        this.m = hVar;
        this.n = aVar;
        this.o = str;
        this.f57871b = Math.max(0, i2);
        this.f57874f = new HashMap(this.f57871b);
    }
}
