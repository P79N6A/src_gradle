package com.ss.android.ugc.aweme.poi.e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59834a;

    public enum a {
        TYPE_GAODE,
        TYPE_BAIDU,
        TYPE_TENCENT,
        TYPE_GOOGLE;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    private static String a(a aVar, Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{aVar, context2}, null, f59834a, true, 66909, new Class[]{a.class, Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aVar, context2}, null, f59834a, true, 66909, new Class[]{a.class, Context.class}, String.class);
        }
        switch (aVar) {
            case TYPE_GAODE:
                return context2.getString(C0906R.string.b_6);
            case TYPE_BAIDU:
                return context2.getString(C0906R.string.b_5);
            case TYPE_TENCENT:
                return context2.getString(C0906R.string.b_8);
            case TYPE_GOOGLE:
                return context2.getString(C0906R.string.b_7);
            default:
                return "";
        }
    }

    public static String[] a(List<a> list, Context context) {
        Context context2 = context;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{list, context2}, null, f59834a, true, 66908, new Class[]{List.class, Context.class}, String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[]{list, context2}, null, f59834a, true, 66908, new Class[]{List.class, Context.class}, String[].class);
        }
        String[] strArr = new String[list.size()];
        for (a a2 : list) {
            strArr[i] = a(a2, context2);
            i++;
        }
        return strArr;
    }

    private static void a(Context context, double d2, double d3) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Double.valueOf(d2), Double.valueOf(d3)}, null, f59834a, true, 66911, new Class[]{Context.class, Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Double.valueOf(d2), Double.valueOf(d3)}, null, f59834a, true, 66911, new Class[]{Context.class, Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("qqmap://map/routeplan?type=drive&from=&fromcoord=&to=目的地&tocoord=" + d2 + "," + d3 + "&policy=0&referer=appName")));
    }

    private static void b(Context context, double d2, double d3) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Double.valueOf(d2), Double.valueOf(d3)}, null, f59834a, true, 66912, new Class[]{Context.class, Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Double.valueOf(d2), Double.valueOf(d3)}, null, f59834a, true, 66912, new Class[]{Context.class, Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("androidamap://route?sourceApplication=appName&slat=&slon=&sname=我的位置&dlat=" + d2 + "&dlon=" + d3 + "&dname=目的地&dev=0&t=2")));
    }

    private static void c(Context context, double d2, double d3) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Double.valueOf(d2), Double.valueOf(d3)}, null, f59834a, true, 66913, new Class[]{Context.class, Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Double.valueOf(d2), Double.valueOf(d3)}, null, f59834a, true, 66913, new Class[]{Context.class, Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("baidumap://map/geocoder?location=" + d2 + "," + d3)));
    }

    private static void d(Context context, double d2, double d3) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Double.valueOf(d2), Double.valueOf(d3)}, null, f59834a, true, 66914, new Class[]{Context.class, Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Double.valueOf(d2), Double.valueOf(d3)}, null, f59834a, true, 66914, new Class[]{Context.class, Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("google.navigation:q=" + d2 + "," + d3));
        intent.setPackage("com.google.android.apps.maps");
        context2.startActivity(intent);
    }

    public static void a(Context context, a aVar, double d2, double d3) {
        Context context2 = context;
        double d4 = d2;
        double d5 = d3;
        if (PatchProxy.isSupport(new Object[]{context2, aVar, Double.valueOf(d2), Double.valueOf(d3)}, null, f59834a, true, 66910, new Class[]{Context.class, a.class, Double.TYPE, Double.TYPE}, Void.TYPE)) {
            Object[] objArr = {context2, aVar, Double.valueOf(d2), Double.valueOf(d3)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f59834a, true, 66910, new Class[]{Context.class, a.class, Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        switch (aVar) {
            case TYPE_GAODE:
                b(context2, d4, d5);
                return;
            case TYPE_BAIDU:
                double[] a2 = a.a(d5, d4);
                c(context2, a2[1], a2[0]);
                return;
            case TYPE_TENCENT:
                a(context2, d4, d5);
                return;
            case TYPE_GOOGLE:
                double[] c2 = a.c(d5, d4);
                d(context2, c2[1], c2[0]);
                break;
        }
    }
}
