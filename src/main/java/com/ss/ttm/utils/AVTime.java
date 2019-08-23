package com.ss.ttm.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AVTime {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getFormatNow() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 91145, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 91145, new Class[0], String.class);
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm ss:SSS").format(new Date());
    }
}
