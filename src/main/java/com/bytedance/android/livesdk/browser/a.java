package com.bytedance.android.livesdk.browser;

import com.bytedance.android.live.core.setting.l;
import com.bytedance.android.live.core.setting.n;
import java.util.ArrayList;
import java.util.List;

public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final l<List<String>> f9278a = new n("live_safe_domain_list", new ArrayList());

    /* renamed from: b  reason: collision with root package name */
    public static final l<List<String>> f9279b = new l<>("hotsoon_safe_host_list", new ArrayList());

    /* renamed from: c  reason: collision with root package name */
    public static final l<Integer> f9280c = new l<>("force_js_permission", -1);

    /* renamed from: d  reason: collision with root package name */
    public static final l<Boolean> f9281d = new l<>("allow_html_video", Boolean.TRUE);

    /* renamed from: e  reason: collision with root package name */
    public static final l<Long> f9282e = new l<>("wap_load_time_limit_wifi", -1L);

    /* renamed from: f  reason: collision with root package name */
    public static final l<Long> f9283f = new l<>("wap_load_time_limit_mobile", -1L);
    public static final l<Integer> g = new l<>("webview_destroy_mode", -1);
    public static final l<String> h = new n("js_actlog_url", "");
    public static final l<Boolean> i = new l<>("enable_webview_debugging", Boolean.FALSE, "webview debug");
    public static final l<String> j = new l<>("advert_cooperation_url", "https://www.chengzijianzhan.com/tetris/page/1614465171474436/");
}
