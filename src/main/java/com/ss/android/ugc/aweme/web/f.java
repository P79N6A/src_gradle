package com.ss.android.ugc.aweme.web;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.g.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76628a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f76629b;

    static {
        List<String> list;
        if (PatchProxy.isSupport(new Object[0], null, f76628a, true, 89869, new Class[0], List.class)) {
            list = (List) PatchProxy.accessDispatch(new Object[0], null, f76628a, true, 89869, new Class[0], List.class);
        } else {
            list = new ArrayList<>();
            IAmeJsMessageHandlerService iAmeJsMessageHandlerService = (IAmeJsMessageHandlerService) ServiceManager.get().getService(IAmeJsMessageHandlerService.class);
            if (iAmeJsMessageHandlerService != null && !CollectionUtils.isEmpty(iAmeJsMessageHandlerService.getSafeHosts())) {
                list.addAll(iAmeJsMessageHandlerService.getSafeHosts());
            }
            list.add("snssdk.com");
            list.add("toutiao.com");
            list.add("neihanshequ.com");
            list.add("youdianyisi.com");
            list.add("admin.bytedance.com");
            list.add("wallet.amemv.com");
            list.add("iesdouyin.com");
            list.add("douyincdn.com");
            list.add("douyinact.com");
            list.add("douyin.com");
            list.add("chengzijianzhan.com");
            list.add("ad.toutiao.com");
            list.add("s3.pstatp.com");
            list.add("s0.ipstatp.com");
            list.add("s.ipstatp.com");
            list.add("m.toutiaocdn.cn");
            list.add("m.toutiaocdn.com");
            list.add("m.toutiaocdn.net");
            list.add("m.zjurl.cn");
            list.add("douyinvideo.net");
            list.add("lb.jinritemai.com");
            list.add("tosv.byted.org");
            list.add("amemv.com");
            list.add("juliangyinqing.com");
            list.add("xgfe.snssdk.com");
            list.add("pstatp.com");
            if (a.a()) {
                list.add("10.95.44.104");
                list.add("10.95.53.40");
                list.add("test-aweme.snssdk.com");
            }
            List list2 = (List) x.a().ad().c();
            if (list2 != null && list2.size() > 0) {
                HashSet hashSet = new HashSet(list);
                hashSet.addAll(list2);
                list = new ArrayList<>(hashSet);
            }
        }
        f76629b = list;
    }
}
