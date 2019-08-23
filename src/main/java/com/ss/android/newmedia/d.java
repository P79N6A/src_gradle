package com.ss.android.newmedia;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30193a;

    public final boolean a(Context context, String str) {
        final Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f30193a, false, 18239, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f30193a, false, 18239, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null) {
            return false;
        } else {
            if (!str2.startsWith("alipays:") && !str2.startsWith("alipay")) {
                return false;
            }
            try {
                context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception unused) {
                new AlertDialog.Builder(context2).setMessage((CharSequence) "未检测到支付宝客户端，请安装后重试。").setPositiveButton((CharSequence) "立即安装", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f30194a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f30194a, false, 18240, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f30194a, false, 18240, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://d.alipay.com")));
                    }
                }).setNegativeButton((CharSequence) "取消", (DialogInterface.OnClickListener) null).show();
            }
            return true;
        }
    }
}
