package com.ss.android.ugc.aweme.friends.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.friends.api.SummonFriendApi;
import java.util.concurrent.Callable;

public class SummonFriendSearchModel extends a<SummonFriendList> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean mIsRefresh;

    public SummonFriendList getData() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46650, new Class[0], SummonFriendList.class)) {
            return (SummonFriendList) super.getData();
        }
        return (SummonFriendList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46650, new Class[0], SummonFriendList.class);
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 2) {
            return false;
        }
        return true;
    }

    public void handleData(SummonFriendList summonFriendList) {
        if (PatchProxy.isSupport(new Object[]{summonFriendList}, this, changeQuickRedirect, false, 46649, new Class[]{SummonFriendList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{summonFriendList}, this, changeQuickRedirect, false, 46649, new Class[]{SummonFriendList.class}, Void.TYPE);
        } else if (summonFriendList != null) {
            if (this.mData == null) {
                this.mData = summonFriendList;
            } else {
                ((SummonFriendList) this.mData).cursor = summonFriendList.cursor;
                ((SummonFriendList) this.mData).hasMore = summonFriendList.hasMore;
            }
            if (this.mIsRefresh) {
                ((SummonFriendList) this.mData).items = summonFriendList.items;
                return;
            }
            ((SummonFriendList) this.mData).items.addAll(summonFriendList.items);
        }
    }

    public boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 46648, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 46648, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            final boolean booleanValue = objArr[0].booleanValue();
            this.mIsRefresh = objArr[0].booleanValue();
            m.a().a(this.mHandler, new Callable() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46651, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46651, new Class[0], Object.class);
                    } else if (booleanValue) {
                        SummonFriendSearchModel.this.mIsLoading = false;
                        return SummonFriendApi.a((String) objArr[1], 0, 20, (String) objArr[2]);
                    } else if (objArr.length != 3) {
                        return null;
                    } else {
                        String str = (String) objArr[1];
                        String str2 = (String) objArr[2];
                        if (SummonFriendSearchModel.this.mData == null || ((SummonFriendList) SummonFriendSearchModel.this.mData).cursor <= 0) {
                            SummonFriendSearchModel.this.mIsRefresh = true;
                            return SummonFriendApi.a(str, 0, 20, str2);
                        }
                        SummonFriendSearchModel.this.mIsRefresh = false;
                        return SummonFriendApi.a(str, ((SummonFriendList) SummonFriendSearchModel.this.mData).cursor, 20, str2);
                    }
                }
            }, 0);
            return true;
        }
    }
}
