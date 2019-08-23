package com.bytedance.apm.agent.instrumentation;

import android.annotation.TargetApi;
import android.support.annotation.Keep;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.apm.agent.a.b;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.trace.a.a;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

@Keep
public class FragmentInstrumentation {
    public static long sCheckVisibilityStartTime;
    public static String sFragmentName;
    public static long sMaxWaitTime;
    private static HashSet<String> sMethodSet = new HashSet<>(32);
    private static long sOnActivityCreatedEnd;
    private static long sOnActivityCreatedStart;
    private static long sOnCreateEnd;
    private static String sOnCreateFragmentName;
    private static long sOnCreateStart;
    private static long sOnCreateTime;
    public static ViewTreeObserver.OnGlobalLayoutListener sOnGlobalLayoutListener;
    private static long sOnResumeEnd;
    private static long sOnResumeStart;
    private static long sOnViewCreatedEnd;
    private static long sOnViewCreatedStart;
    public static WeakReference<View> sRootViewRef;
    public static Runnable sWaitViewTimeoutRunnable;

    static boolean isValid(String str) {
        if (TextUtils.isEmpty(sFragmentName) || !TextUtils.equals(str, sFragmentName)) {
            return false;
        }
        return true;
    }

    @Keep
    public static void onCreate(String str) {
        sOnCreateFragmentName = str;
        sOnCreateTime = System.currentTimeMillis();
        if (sMaxWaitTime == 0) {
            sMaxWaitTime = ApmDelegate.getInstance().getTraceConfig().f2084a;
        }
    }

    @Keep
    public static void onPause(Fragment fragment) {
        if (fragment.getUserVisibleHint() && !fragment.isHidden()) {
            b.a(fragment, false);
        }
    }

    @Keep
    public static void onResume(Fragment fragment) {
        if (fragment.getUserVisibleHint() && !fragment.isHidden()) {
            String canonicalName = fragment.getClass().getCanonicalName();
            try {
                b.a(fragment, true);
                if (TextUtils.equals(canonicalName, sOnCreateFragmentName)) {
                    registerOnGlobalLayoutListener(canonicalName, fragment.getView(), a.a(canonicalName), sOnCreateTime, "fragmentOnCreateToViewShow");
                }
            } catch (Exception unused) {
            }
        }
    }

    @Keep
    public static void onHiddenChanged(Fragment fragment, boolean z) {
        b.a(fragment, !z);
        if (!z) {
            try {
                String canonicalName = fragment.getClass().getCanonicalName();
                registerOnGlobalLayoutListener(canonicalName, fragment.getView(), a.a(canonicalName), System.currentTimeMillis(), "fragmentOnHiddenChangedToViewShow");
            } catch (Exception unused) {
            }
        }
    }

    @Keep
    public static void setUserVisibleHint(Fragment fragment, boolean z) {
        if (fragment.isResumed() && !fragment.isHidden()) {
            b.a(fragment, z);
            if (z) {
                try {
                    String canonicalName = fragment.getClass().getCanonicalName();
                    registerOnGlobalLayoutListener(canonicalName, fragment.getView(), a.a(canonicalName), System.currentTimeMillis(), "fragmentUserVisibleToViewShow");
                } catch (Exception unused) {
                }
            }
        }
    }

    @Keep
    public static void onTrace(Fragment fragment, String str, String str2, boolean z) {
        if (TextUtils.equals("onCreate", str2)) {
            if (z) {
                sFragmentName = str;
                sOnCreateStart = System.currentTimeMillis();
            } else if (isValid(str)) {
                sOnCreateEnd = System.currentTimeMillis();
            }
        } else if (!TextUtils.equals("onViewCreated", str2) || !isValid(str)) {
            if (!TextUtils.equals("onActivityCreated", str2) || !isValid(str)) {
                if (TextUtils.equals("onResume", str2) && isValid(str)) {
                    if (z) {
                        if (sOnCreateStart > 0) {
                            sOnResumeStart = System.currentTimeMillis();
                        }
                    } else if (sOnCreateStart > 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        sOnResumeEnd = currentTimeMillis;
                        if (currentTimeMillis - sOnCreateStart < 5000) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("begin_time", sOnCreateStart);
                                jSONObject.put("end_time", sOnResumeEnd);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("fragment_onCreate", sOnCreateEnd - sOnCreateStart);
                                jSONObject2.put("fragment_onViewCreated", sOnViewCreatedEnd - sOnViewCreatedStart);
                                jSONObject2.put("fragment_onActivityCreated", sOnActivityCreatedEnd - sOnActivityCreatedStart);
                                jSONObject2.put("fragment_onResume_fragment", sOnResumeEnd - sOnResumeStart);
                                jSONObject2.put("fragment_create_to_resume", sOnResumeEnd - sOnCreateStart);
                                if (!(fragment == null || fragment.getActivity() == null)) {
                                    jSONObject.put("attached_activity", fragment.getActivity().getClass().getName());
                                }
                                jSONObject.put("page_type", "fragment");
                                JSONObject jSONObject3 = new JSONObject();
                                HashSet<String> hashSet = sMethodSet;
                                jSONObject3.put("is_first", !hashSet.contains(sFragmentName + str2));
                                jSONObject3.put("scene", str);
                                HashSet<String> hashSet2 = sMethodSet;
                                hashSet2.add(sFragmentName + str2);
                                com.bytedance.apm.agent.b.a.a("page_load", jSONObject2, jSONObject3, jSONObject);
                            } catch (Exception unused) {
                            }
                        }
                        sOnCreateStart = 0;
                        sFragmentName = null;
                    }
                }
            } else if (z) {
                if (sOnCreateStart > 0) {
                    sOnActivityCreatedStart = System.currentTimeMillis();
                }
            } else if (sOnCreateStart > 0) {
                sOnActivityCreatedEnd = System.currentTimeMillis();
            }
        } else if (z) {
            if (sOnCreateStart > 0) {
                sOnViewCreatedStart = System.currentTimeMillis();
            }
        } else if (sOnCreateStart > 0) {
            sOnViewCreatedEnd = System.currentTimeMillis();
        }
    }

    @TargetApi(16)
    private static void registerOnGlobalLayoutListener(String str, View view, final Integer num, final long j, final String str2) {
        if (num != null && num.intValue() > 0) {
            sFragmentName = str;
            if (!(sRootViewRef == null || sRootViewRef.get() == view)) {
                ViewTreeObserver viewTreeObserver = ((View) sRootViewRef.get()).getViewTreeObserver();
                if (viewTreeObserver.isAlive() && sOnGlobalLayoutListener != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(sOnGlobalLayoutListener);
                }
                if (sWaitViewTimeoutRunnable != null) {
                    com.bytedance.apm.j.a.a().removeCallbacks(sWaitViewTimeoutRunnable);
                }
            }
            sRootViewRef = new WeakReference<>(view);
            sCheckVisibilityStartTime = 0;
            sOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    try {
                        if (FragmentInstrumentation.sRootViewRef != null) {
                            if (FragmentInstrumentation.sRootViewRef.get() != null) {
                                View findViewById = ((View) FragmentInstrumentation.sRootViewRef.get()).findViewById(num.intValue());
                                if (FragmentInstrumentation.sCheckVisibilityStartTime == 0) {
                                    FragmentInstrumentation.sCheckVisibilityStartTime = System.currentTimeMillis();
                                }
                                if (findViewById != null && findViewById.getVisibility() == 0 && findViewById.getWidth() > 0) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (((View) FragmentInstrumentation.sRootViewRef.get()).getViewTreeObserver().isAlive() && FragmentInstrumentation.sOnGlobalLayoutListener != null) {
                                        ((View) FragmentInstrumentation.sRootViewRef.get()).getViewTreeObserver().removeOnGlobalLayoutListener(FragmentInstrumentation.sOnGlobalLayoutListener);
                                    }
                                    FragmentInstrumentation.sOnGlobalLayoutListener = null;
                                    FragmentInstrumentation.sRootViewRef = null;
                                    if (FragmentInstrumentation.sWaitViewTimeoutRunnable != null) {
                                        com.bytedance.apm.j.a.a().removeCallbacks(FragmentInstrumentation.sWaitViewTimeoutRunnable);
                                    }
                                    long j = currentTimeMillis - j;
                                    if (currentTimeMillis - FragmentInstrumentation.sCheckVisibilityStartTime > 1 && j < FragmentInstrumentation.sMaxWaitTime) {
                                        com.bytedance.apm.agent.b.a.a(FragmentInstrumentation.sFragmentName, str2, j);
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            view.getViewTreeObserver().addOnGlobalLayoutListener(sOnGlobalLayoutListener);
            sWaitViewTimeoutRunnable = new Runnable() {
                public final void run() {
                    try {
                        if (!(FragmentInstrumentation.sOnGlobalLayoutListener == null || FragmentInstrumentation.sRootViewRef == null || FragmentInstrumentation.sRootViewRef.get() == null)) {
                            ((View) FragmentInstrumentation.sRootViewRef.get()).getViewTreeObserver().removeOnGlobalLayoutListener(FragmentInstrumentation.sOnGlobalLayoutListener);
                        }
                    } catch (Exception unused) {
                    }
                }
            };
            com.bytedance.apm.j.a.a().postDelayed(sWaitViewTimeoutRunnable, sMaxWaitTime);
        }
    }
}
