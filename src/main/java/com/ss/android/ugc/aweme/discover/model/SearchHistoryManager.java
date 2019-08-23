package com.ss.android.ugc.aweme.discover.model;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import com.ss.android.ugc.aweme.base.sharedpref.f;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SearchHistoryManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static SearchHistoryManager sManager;

    SearchHistoryManager() {
        List<SearchHistory> searchHistory = getSearchHistory();
        if (!searchHistory.isEmpty()) {
            SearchHistory searchHistory2 = searchHistory.get(0);
            if (b.c()) {
                if (searchHistory2.type < 16) {
                    clearSearchHistory();
                }
            } else if (searchHistory2.type >= 16) {
                clearSearchHistory();
            }
        }
    }

    public void clearForAccountChange() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37090, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37090, new Class[0], Void.TYPE);
            return;
        }
        if (b.c()) {
            clearSearchHistory();
        }
    }

    public void clearSearchHistory() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37088, new Class[0], Void.TYPE);
            return;
        }
        setSearchHistory(new ArrayList());
    }

    @NonNull
    public List<SearchHistory> getSearchHistory() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37084, new Class[0], List.class)) {
            return e.e().b("recent_history", SearchHistory.class);
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37084, new Class[0], List.class);
    }

    public static SearchHistoryManager inst() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 37083, new Class[0], SearchHistoryManager.class)) {
            return (SearchHistoryManager) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 37083, new Class[0], SearchHistoryManager.class);
        }
        if (sManager == null) {
            synchronized (SearchHistoryManager.class) {
                if (sManager == null) {
                    sManager = new SearchHistoryManager();
                }
            }
        }
        return sManager;
    }

    public void clearSearchHistory(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 37089, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 37089, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        List<SearchHistory> searchHistory = getSearchHistory();
        Iterator<SearchHistory> it2 = searchHistory.iterator();
        while (it2.hasNext()) {
            if (it2.next().type == i) {
                it2.remove();
            }
        }
        setSearchHistory(searchHistory);
    }

    public void deleteSearchHistory(SearchHistory searchHistory) {
        SearchHistory searchHistory2 = searchHistory;
        if (PatchProxy.isSupport(new Object[]{searchHistory2}, this, changeQuickRedirect, false, 37086, new Class[]{SearchHistory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchHistory2}, this, changeQuickRedirect, false, 37086, new Class[]{SearchHistory.class}, Void.TYPE);
            return;
        }
        List<SearchHistory> searchHistory3 = getSearchHistory();
        Iterator<SearchHistory> it2 = searchHistory3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SearchHistory next = it2.next();
            if (next.type == searchHistory2.type && TextUtils.equals(next.keyword, searchHistory2.keyword)) {
                it2.remove();
                break;
            }
        }
        setSearchHistory(searchHistory3);
    }

    private void setSearchHistory(@NonNull List<SearchHistory> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 37085, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 37085, new Class[]{List.class}, Void.TYPE);
            return;
        }
        f e2 = e.e();
        if (PatchProxy.isSupport(new Object[]{"recent_history", list}, e2, f.f34885a, false, 24903, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{"recent_history", list}, e2, f.f34885a, false, 24903, new Class[]{String.class, Object.class}, Void.TYPE);
        } else {
            e2.a().putString("recent_history", JSONArray.toJSONString(list)).apply();
        }
        bg.a(new com.ss.android.ugc.aweme.discover.a.f());
    }

    public void recordSearchHistory(SearchHistory searchHistory) {
        SearchHistory searchHistory2 = searchHistory;
        if (PatchProxy.isSupport(new Object[]{searchHistory2}, this, changeQuickRedirect, false, 37087, new Class[]{SearchHistory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchHistory2}, this, changeQuickRedirect, false, 37087, new Class[]{SearchHistory.class}, Void.TYPE);
            return;
        }
        List<SearchHistory> searchHistory3 = getSearchHistory();
        Iterator<SearchHistory> it2 = searchHistory3.iterator();
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(searchHistory2.type), 1);
        while (it2.hasNext()) {
            SearchHistory next = it2.next();
            if (next.type != searchHistory2.type || !TextUtils.equals(next.keyword, searchHistory2.keyword)) {
                Integer num = (Integer) hashMap.get(Integer.valueOf(next.type));
                if (num == null) {
                    hashMap.put(Integer.valueOf(next.type), 1);
                } else if (num.intValue() < 10) {
                    hashMap.put(Integer.valueOf(next.type), Integer.valueOf(num.intValue() + 1));
                } else {
                    it2.remove();
                }
            } else {
                it2.remove();
            }
        }
        searchHistory3.add(0, searchHistory2);
        setSearchHistory(searchHistory3);
    }
}
