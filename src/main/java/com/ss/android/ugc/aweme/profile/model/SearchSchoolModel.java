package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.profile.api.SchoolApiManager;
import com.ss.android.ugc.aweme.profile.model.SchoolStruct;
import java.util.List;
import java.util.concurrent.Callable;

public class SearchSchoolModel extends a<SchoolStruct.School, SchoolStruct> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String keyWords;

    public List<SchoolStruct.School> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((SchoolStruct) this.mData).schoolList;
    }

    public boolean isHasMore() {
        if (this.mData == null || !((SchoolStruct) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public int getTotal() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 67501, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 67501, new Class[0], Integer.TYPE)).intValue();
        } else if (isDataEmpty()) {
            return 0;
        } else {
            return ((SchoolStruct) this.mData).schoolList.size();
        }
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || (objArr.length != 2 && objArr.length != 1)) {
            return false;
        }
        return true;
    }

    public void handleData(SchoolStruct schoolStruct) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{schoolStruct}, this, changeQuickRedirect, false, 67500, new Class[]{SchoolStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{schoolStruct}, this, changeQuickRedirect, false, 67500, new Class[]{SchoolStruct.class}, Void.TYPE);
            return;
        }
        int i = this.mListQueryType;
        if (i != 1) {
            if (i == 4 && this.mData != null) {
                if (schoolStruct != null && !CollectionUtils.isEmpty(schoolStruct.schoolList)) {
                    z = false;
                }
                this.mIsNewDataEmpty = z;
                if (this.mIsNewDataEmpty) {
                    ((SchoolStruct) this.mData).hasMore = false;
                    return;
                }
                ((SchoolStruct) this.mData).schoolList.addAll(schoolStruct.schoolList);
                ((SchoolStruct) this.mData).hasMore = schoolStruct.hasMore;
                ((SchoolStruct) this.mData).page = schoolStruct.page;
            } else {
                return;
            }
            return;
        }
        this.mData = schoolStruct;
    }

    public void loadMoreList(Object... objArr) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 67498, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 67498, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        String str = this.keyWords;
        if (!isDataEmpty()) {
            i = ((SchoolStruct) this.mData).page;
        }
        fetchList(str, i, 20);
    }

    public void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 67497, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 67497, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.keyWords = objArr[1];
        fetchList(objArr[1], 0, 20);
    }

    public void fetchList(final String str, final int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 67499, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 67499, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int i3 = i;
        final int i4 = i2;
        m.a().a(this.mHandler, new Callable() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 67502, new Class[0], Object.class)) {
                    return SchoolApiManager.a(str, i, i4);
                }
                return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 67502, new Class[0], Object.class);
            }
        }, 0);
    }
}
