package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class ShareOrderServiceImpl implements ShareOrderService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void addShareRecord(String str) {
    }

    public Drawable getFirstAvailableIcon(Activity activity) {
        return null;
    }

    public String[] getShareGifImageList() {
        return new String[0];
    }

    public String[] getShareCardImgeList() {
        return new String[]{"qq", "qzone", "weixin", "weixin_moments", "save_local"};
    }

    public String[] getImageShareList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73368, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73368, new Class[0], String[].class);
        }
        List<String> b2 = cg.b();
        b2.remove("toutiao");
        return (String[]) b2.toArray(new String[b2.size()]);
    }

    public String[] getUrlShareList() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73365, new Class[0], String[].class)) {
            return getUrlShareList(false);
        }
        return (String[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73365, new Class[0], String[].class);
    }

    public String[] getVideoShareList() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73369, new Class[0], String[].class)) {
            return (String[]) cg.b().toArray(new String[0]);
        }
        return (String[]) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73369, new Class[0], String[].class);
    }

    public String[] getUrlShareList(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 73367, new Class[]{Boolean.TYPE}, String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 73367, new Class[]{Boolean.TYPE}, String[].class);
        }
        List<String> b2 = cg.b();
        if (!z) {
            b2.remove("chat_merge");
        }
        return (String[]) b2.toArray(new String[0]);
    }

    public String[] getUrlShareList(boolean z, boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 73366, new Class[]{Boolean.TYPE, Boolean.TYPE}, String[].class)) {
            return getUrlShareList(z);
        }
        return (String[]) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, changeQuickRedirect, false, 73366, new Class[]{Boolean.TYPE, Boolean.TYPE}, String[].class);
    }
}
