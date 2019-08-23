package com.ss.android.ugc.aweme.challenge.c;

import android.os.Message;
import android.util.Log;
import com.google.common.collect.av;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.challenge.ChallengeType;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class e extends a<SearchChallengeList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35374a;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    public final void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f35374a, false, 25881, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f35374a, false, 25881, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message2.obj instanceof Exception) {
            Exception exc = (Exception) message2.obj;
            if (exc.getMessage() != null) {
                ai.b("challenge search failed, message:" + exc.getMessage());
            }
            ai.b("challenge search failed, stack trace:" + Log.getStackTraceString(exc));
        }
        super.handleMsg(message);
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f35374a, false, 25879, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f35374a, false, 25879, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35375a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f35375a, false, 25883, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f35375a, false, 25883, new Class[0], Object.class);
                    }
                    e.this.mIsLoading = false;
                    String str = (String) objArr[0];
                    String str2 = (String) objArr[1];
                    if (PatchProxy.isSupport(new Object[]{str, 20, str2}, null, ChallengeApi.f35343a, true, 25803, new Class[]{String.class, Integer.TYPE, String.class}, SearchChallengeList.class)) {
                        return (SearchChallengeList) PatchProxy.accessDispatch(new Object[]{str, 20, str2}, null, ChallengeApi.f35343a, true, 25803, new Class[]{String.class, Integer.TYPE, String.class}, SearchChallengeList.class);
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("keyword", str);
                    hashMap.put("count", "20");
                    hashMap.put("search_source", str2);
                    hashMap.put("is_hash_tag", String.valueOf(ChallengeType.a()));
                    NetUtil.putCommonParams(hashMap, true);
                    SearchChallengeList searchChallengeList = (SearchChallengeList) ChallengeApi.f35344b.searchChallenge(hashMap).get();
                    searchChallengeList.keyword = str;
                    return searchChallengeList;
                }
            }, 0);
            return true;
        }
    }

    public final /* synthetic */ void handleData(Object obj) {
        SearchChallengeList searchChallengeList = (SearchChallengeList) obj;
        if (PatchProxy.isSupport(new Object[]{searchChallengeList}, this, f35374a, false, 25880, new Class[]{SearchChallengeList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchChallengeList}, this, f35374a, false, 25880, new Class[]{SearchChallengeList.class}, Void.TYPE);
            return;
        }
        if (searchChallengeList != null) {
            this.mData = searchChallengeList;
            if (((SearchChallengeList) this.mData).items == null) {
                ((SearchChallengeList) this.mData).items = new ArrayList();
            }
            if (!searchChallengeList.isMatch) {
                boolean isEmpty = ((SearchChallengeList) this.mData).items.isEmpty();
                if (!isEmpty) {
                    isEmpty = !av.c(((SearchChallengeList) this.mData).items, new f(this)).isPresent();
                }
                if (isEmpty) {
                    Challenge challenge = new Challenge();
                    challenge.setChallengeName(((SearchChallengeList) this.mData).keyword);
                    SearchChallenge searchChallenge = new SearchChallenge();
                    searchChallenge.challenge = challenge;
                    searchChallenge.isFake = true;
                    ((SearchChallengeList) this.mData).items.add(0, searchChallenge);
                }
            }
        }
    }
}
