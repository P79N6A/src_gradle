package com.ss.android.ugc.aweme.challenge.c;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.commercialize.api.LinkDataApi;
import com.ss.android.ugc.aweme.commercialize.utils.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public class a extends com.ss.android.ugc.aweme.common.f.a<Aweme, ChallengeAwemeList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35360a;

    /* renamed from: b  reason: collision with root package name */
    public String f35361b = "challenge_video";

    /* renamed from: c  reason: collision with root package name */
    private int f35362c;

    /* renamed from: d  reason: collision with root package name */
    private List<Aweme> f35363d;

    public final List<Aweme> a() {
        if (this.mData == null) {
            return null;
        }
        return ((ChallengeAwemeList) this.mData).items;
    }

    public boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f35360a, false, 25858, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35360a, false, 25858, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null && ((ChallengeAwemeList) this.mData).isHasMore()) {
            z = true;
        }
        return z;
    }

    public List<Aweme> getItems() {
        if (PatchProxy.isSupport(new Object[0], this, f35360a, false, 25859, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f35360a, false, 25859, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(this.f35363d)) {
            arrayList.addAll(this.f35363d);
        }
        List<Aweme> a2 = a();
        if (!CollectionUtils.isEmpty(a2)) {
            arrayList.addAll(a2);
        }
        return arrayList;
    }

    public boolean isDataEmpty() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f35360a, false, 25861, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35360a, false, 25861, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if ((this.mData == null || !((ChallengeAwemeList) this.mData).isHasMore()) && CollectionUtils.isEmpty(getItems())) {
            z = true;
        }
        return z;
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 4) {
            return false;
        }
        return true;
    }

    public final void a(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f35360a, false, 25852, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f35360a, false, 25852, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            if (this.f35363d == null) {
                this.f35363d = new ArrayList();
            }
            this.f35363d.clear();
            this.f35363d.addAll(list);
        }
    }

    public void loadMoreList(Object... objArr) {
        long j;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f35360a, false, 25855, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f35360a, false, 25855, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        String str = objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((ChallengeAwemeList) this.mData).cursor;
        }
        a(str, j, 20, objArr[2].intValue(), objArr[3].booleanValue());
    }

    public void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f35360a, false, 25854, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f35360a, false, 25854, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(objArr[1], 0, 20, objArr[2].intValue(), objArr[3].booleanValue());
    }

    public void setItems(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f35360a, false, 25860, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f35360a, false, 25860, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.mData == null) {
            this.mData = new ChallengeAwemeList();
        }
        ((ChallengeAwemeList) this.mData).hasMore = 1;
        ((ChallengeAwemeList) this.mData).items = list;
    }

    public /* synthetic */ void handleData(Object obj) {
        boolean z;
        ChallengeAwemeList challengeAwemeList = (ChallengeAwemeList) obj;
        if (PatchProxy.isSupport(new Object[]{challengeAwemeList}, this, f35360a, false, 25857, new Class[]{ChallengeAwemeList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challengeAwemeList}, this, f35360a, false, 25857, new Class[]{ChallengeAwemeList.class}, Void.TYPE);
            return;
        }
        if (challengeAwemeList == null || (CollectionUtils.isEmpty(challengeAwemeList.items) && !challengeAwemeList.isHasMore())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (challengeAwemeList.items != null) {
                int size = challengeAwemeList.items.size();
                for (int i = 0; i < size; i++) {
                    Aweme a2 = com.ss.android.ugc.aweme.feed.a.a().a(challengeAwemeList.items.get(i));
                    a2.setIsTop(challengeAwemeList.items.get(i).getIsTop());
                    com.ss.android.ugc.aweme.feed.a a3 = com.ss.android.ugc.aweme.feed.a.a();
                    a3.a(a2.getAid() + (this.f35362c + PushConstants.WORK_RECEIVER_EVENTCORE_ERROR), challengeAwemeList.getRequestId(), i);
                    challengeAwemeList.items.set(i, a2);
                }
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = challengeAwemeList;
            } else if (i2 == 4) {
                if (challengeAwemeList.items != null) {
                    if (CollectionUtils.isEmpty(((ChallengeAwemeList) this.mData).items)) {
                        ((ChallengeAwemeList) this.mData).items = challengeAwemeList.items;
                    } else {
                        ((ChallengeAwemeList) this.mData).items.addAll(challengeAwemeList.items);
                    }
                }
                ((ChallengeAwemeList) this.mData).cursor = challengeAwemeList.cursor;
                ((ChallengeAwemeList) this.mData).hasMore = challengeAwemeList.hasMore & ((ChallengeAwemeList) this.mData).hasMore;
            }
        } else {
            if (this.mData != null) {
                ((ChallengeAwemeList) this.mData).hasMore = 0;
            }
        }
    }

    private void a(String str, long j, int i, int i2, boolean z) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), 20, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f35360a, false, 25856, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, new Long(j2), 20, Integer.valueOf(i2), Byte.valueOf(z)}, this, f35360a, false, 25856, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        final int i3 = i2;
        this.f35362c = i3;
        m a2 = m.a();
        WeakHandler weakHandler = this.mHandler;
        final String str2 = str;
        final long j3 = j;
        final boolean z2 = z;
        AnonymousClass1 r0 = new Callable(20) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35364a;

            public final Object call() throws Exception {
                String str;
                if (PatchProxy.isSupport(new Object[0], this, f35364a, false, 25862, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f35364a, false, 25862, new Class[0], Object.class);
                }
                String str2 = str2;
                long j = j3;
                int i = 20;
                int i2 = i3;
                boolean z = z2;
                String str3 = a.this.f35361b;
                if (PatchProxy.isSupport(new Object[]{str2, new Long(j), Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), str3}, null, ChallengeApi.f35343a, true, 25804, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, String.class}, ChallengeAwemeList.class)) {
                    Object[] objArr = {str2, new Long(j), Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), str3};
                    return (ChallengeAwemeList) PatchProxy.accessDispatch(objArr, null, ChallengeApi.f35343a, true, 25804, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, String.class}, ChallengeAwemeList.class);
                }
                boolean b2 = r.b(str2);
                if (i2 == 2) {
                    if (b2) {
                        str = "https://aweme.snssdk.com/aweme/v1/commerce/challenge/aweme/";
                    } else {
                        str = "https://aweme.snssdk.com/aweme/v1/challenge/aweme/";
                    }
                } else if (b2) {
                    str = "https://aweme.snssdk.com/aweme/v1/commerce/challenge/fresh/aweme/";
                } else {
                    str = "https://aweme.snssdk.com/aweme/v1/challenge/fresh/aweme/";
                }
                HashMap hashMap = new HashMap();
                if (z) {
                    hashMap.put("hashtag_name", str2);
                    hashMap.put("query_type", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                } else {
                    hashMap.put("ch_id", str2);
                    hashMap.put("query_type", PushConstants.PUSH_TYPE_NOTIFY);
                }
                hashMap.put("cursor", String.valueOf(j));
                hashMap.put("count", String.valueOf(i));
                hashMap.put("type", "5");
                hashMap.put("source", String.valueOf(str3));
                ChallengeAwemeList challengeAwemeList = (ChallengeAwemeList) ChallengeApi.f35344b.getChallengeAwemeList(str, hashMap).get();
                LinkDataApi.a("challenge", challengeAwemeList.items);
                return challengeAwemeList;
            }
        };
        a2.a(weakHandler, r0, 0);
    }
}
