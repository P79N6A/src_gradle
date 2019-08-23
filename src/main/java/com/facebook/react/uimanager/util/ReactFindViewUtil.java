package com.facebook.react.uimanager.util;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class ReactFindViewUtil {
    private static final Map<OnMultipleViewsFoundListener, Set<String>> mOnMultipleViewsFoundListener = new HashMap();
    private static final List<OnViewFoundListener> mOnViewFoundListeners = new ArrayList();

    public interface OnMultipleViewsFoundListener {
        void onViewFound(View view, String str);
    }

    public interface OnViewFoundListener {
        String getNativeId();

        void onViewFound(View view);
    }

    public static void addViewListener(OnViewFoundListener onViewFoundListener) {
        mOnViewFoundListeners.add(onViewFoundListener);
    }

    public static void removeViewListener(OnViewFoundListener onViewFoundListener) {
        mOnViewFoundListeners.remove(onViewFoundListener);
    }

    public static void removeViewsListener(OnMultipleViewsFoundListener onMultipleViewsFoundListener) {
        mOnMultipleViewsFoundListener.remove(onMultipleViewsFoundListener);
    }

    @Nullable
    private static String getNativeId(View view) {
        Object tag = view.getTag(C0906R.id.duo);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static void notifyViewRendered(View view) {
        String nativeId = getNativeId(view);
        if (nativeId != null) {
            Iterator<OnViewFoundListener> it2 = mOnViewFoundListeners.iterator();
            while (it2.hasNext()) {
                OnViewFoundListener next = it2.next();
                if (nativeId != null && nativeId.equals(next.getNativeId())) {
                    next.onViewFound(view);
                    it2.remove();
                }
            }
            Iterator<Map.Entry<OnMultipleViewsFoundListener, Set<String>>> it3 = mOnMultipleViewsFoundListener.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry next2 = it3.next();
                Set set = (Set) next2.getValue();
                if (set.contains(nativeId)) {
                    ((OnMultipleViewsFoundListener) next2.getKey()).onViewFound(view, nativeId);
                    set.remove(nativeId);
                }
                if (set.isEmpty()) {
                    it3.remove();
                }
            }
        }
    }

    public static void addViewsListener(OnMultipleViewsFoundListener onMultipleViewsFoundListener, Set<String> set) {
        mOnMultipleViewsFoundListener.put(onMultipleViewsFoundListener, set);
    }

    public static void findView(View view, OnViewFoundListener onViewFoundListener) {
        View findView = findView(view, onViewFoundListener.getNativeId());
        if (findView != null) {
            onViewFoundListener.onViewFound(findView);
        }
        addViewListener(onViewFoundListener);
    }

    @Nullable
    public static View findView(View view, String str) {
        String nativeId = getNativeId(view);
        if (nativeId != null && nativeId.equals(str)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View findView = findView(viewGroup.getChildAt(i), str);
                if (findView != null) {
                    return findView;
                }
            }
        }
        return null;
    }
}
