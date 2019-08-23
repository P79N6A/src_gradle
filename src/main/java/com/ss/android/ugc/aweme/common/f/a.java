package com.ss.android.ugc.aweme.common.f;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.p;
import java.util.ArrayList;
import java.util.List;

public abstract class a<T, K> extends com.ss.android.ugc.aweme.common.a<K> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int mCount;
    protected boolean mIsNewDataEmpty;
    public int mListQueryType = 1;

    public abstract List<T> getItems();

    public abstract boolean isHasMore();

    public void loadLatestList(Object... objArr) {
    }

    public abstract void loadMoreList(Object... objArr);

    public abstract void refreshList(Object... objArr);

    public void setItems(List<T> list) {
    }

    public boolean isNewDataEmpty() {
        return this.mIsNewDataEmpty;
    }

    public boolean isDataEmpty() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33459, new Class[0], Boolean.TYPE)) {
            return CollectionUtils.isEmpty(getItems());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33459, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean deleteItem(T t) {
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{t2}, this, changeQuickRedirect, false, 33460, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{t2}, this, changeQuickRedirect, false, 33460, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        List items = getItems();
        if (CollectionUtils.isEmpty(items)) {
            return false;
        }
        int indexOf = items.indexOf(t2);
        boolean remove = items.remove(t2);
        if (indexOf >= 0) {
            for (p pVar : this.mNotifyListeners) {
                if (pVar != null && (pVar instanceof e)) {
                    ((e) pVar).a(indexOf);
                }
            }
        }
        return remove;
    }

    public boolean insertItem(T t) {
        T t2 = t;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{t2}, this, changeQuickRedirect, false, 33462, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{t2}, this, changeQuickRedirect, false, 33462, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        List items = getItems();
        if (items != null) {
            i = items.size();
        }
        return insertItem(t2, i);
    }

    public boolean sendRequest(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 33458, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 33458, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            if (isDataEmpty()) {
                this.mListQueryType = 1;
            } else {
                this.mListQueryType = objArr[0].intValue();
            }
            int i = this.mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        refreshList(objArr);
                        break;
                    case 2:
                        loadLatestList(objArr);
                        break;
                }
            } else {
                loadMoreList(objArr);
            }
            return true;
        }
    }

    public boolean insertItem(T t, int i) {
        if (PatchProxy.isSupport(new Object[]{t, Integer.valueOf(i)}, this, changeQuickRedirect, false, 33461, new Class[]{Object.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{t, Integer.valueOf(i)}, this, changeQuickRedirect, false, 33461, new Class[]{Object.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        List items = getItems();
        if (CollectionUtils.isEmpty(items)) {
            items = new ArrayList();
        }
        if (i < 0 || i > items.size()) {
            return false;
        }
        items.add(i, t);
        if (items.size() == 1) {
            setItems(items);
        }
        for (p pVar : this.mNotifyListeners) {
            if (pVar != null && (pVar instanceof e)) {
                ((e) pVar).a(items, i);
            }
        }
        return true;
    }
}
