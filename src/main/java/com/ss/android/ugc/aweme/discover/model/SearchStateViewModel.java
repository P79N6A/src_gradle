package com.ss.android.ugc.aweme.discover.model;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.List;

public class SearchStateViewModel extends ViewModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public MutableLiveData<b<String, Object>> hotSearchLiveData = new MutableLiveData<>();
    public MutableLiveData<Boolean> isVisibleToUser = new MutableLiveData<>();
    public MutableLiveData<Integer> searchState = new MutableLiveData<>();

    public static class HotSearchListObserver implements Observer<b<String, Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private IHotSearchListListener listener;

        public HotSearchListObserver setListener(IHotSearchListListener iHotSearchListListener) {
            this.listener = iHotSearchListListener;
            return this;
        }

        public void onChanged(@Nullable b<String, Object> bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, changeQuickRedirect, false, 37122, new Class[]{b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, changeQuickRedirect, false, 37122, new Class[]{b.class}, Void.TYPE);
            } else if (this.listener != null && bVar != null) {
                String str = (String) bVar.a("key_operated_search_list");
                String str2 = (String) bVar.a("key_operated_real_search_word");
                LogPbBean logPbBean = (LogPbBean) bVar.a("key_log_pb");
                if (!AbTestManager.a().as() || !TextUtils.isEmpty(str)) {
                    this.listener.onShowOperatedSearchWord(str, str2, logPbBean);
                } else {
                    this.listener.onHotSearchWordsFlipper((List) bVar.a("key_hot_search_list"), logPbBean, (List) bVar.a("ad_search_list"));
                }
            }
        }
    }

    public interface IHotSearchListListener {
        void onHotSearchWordsFlipper(List<HotSearchItem> list, LogPbBean logPbBean, List<AdDefaultSearchStruct> list2);

        void onShowOperatedSearchWord(String str, String str2, LogPbBean logPbBean);
    }

    public static class SearchObserver implements Observer<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private boolean isFirstVisible = true;
        private SearchStateListener listener;

        public SearchObserver setListener(SearchStateListener searchStateListener) {
            this.listener = searchStateListener;
            return this;
        }

        public void onChanged(@Nullable Integer num) {
            if (PatchProxy.isSupport(new Object[]{num}, this, changeQuickRedirect, false, 37123, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, changeQuickRedirect, false, 37123, new Class[]{Integer.class}, Void.TYPE);
            } else if (num != null) {
                if (num.intValue() == 5) {
                    this.listener.onPageHidden();
                } else if (num.intValue() == 6) {
                    this.listener.onPageResume();
                } else if (num.intValue() == 3) {
                    this.listener.onContentVisible(false);
                } else if (this.isFirstVisible) {
                    this.isFirstVisible = false;
                } else {
                    this.listener.onContentVisible(true);
                }
            }
        }
    }

    public interface SearchStateListener {
        void onContentVisible(boolean z);

        void onPageHidden();

        void onPageResume();
    }

    public static boolean isSearchIntermediate(int i) {
        return i == 3;
    }
}
