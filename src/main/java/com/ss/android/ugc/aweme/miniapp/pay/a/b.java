package com.ss.android.ugc.aweme.miniapp.pay.a;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String appId;
    public String from;
    public int hideNavbar = 1;
    public String loadingBgColor = "ffffff";
    public String logParams;
    public String mark;
    public String merchantId;
    public String orderId;
    public String statusBarColor = "#ffffff";
    public int statusBarHeight;
    public int statusFontDark = 1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55880a;

        /* renamed from: b  reason: collision with root package name */
        public String f55881b;

        /* renamed from: c  reason: collision with root package name */
        public String f55882c;

        /* renamed from: d  reason: collision with root package name */
        public String f55883d;

        /* renamed from: e  reason: collision with root package name */
        public String f55884e;

        /* renamed from: f  reason: collision with root package name */
        public String f55885f;
        public String g;
        public int h = 1;
        public int i = 1;
        public String j = "#ffffff";
        public String k = "ffffff";
        public int l;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getFrom() {
        return this.from;
    }

    public int getHideNavbar() {
        return this.hideNavbar;
    }

    public String getLoadingBgColor() {
        return this.loadingBgColor;
    }

    public String getLogParams() {
        return this.logParams;
    }

    public String getMark() {
        return this.mark;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getStatusBarColor() {
        return this.statusBarColor;
    }

    public int getStatusBarHeight() {
        return this.statusBarHeight;
    }

    public int getStatusFontDark() {
        return this.statusFontDark;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setHideNavbar(int i) {
        this.hideNavbar = i;
    }

    public void setLoadingBgColor(String str) {
        this.loadingBgColor = str;
    }

    public void setLogParams(String str) {
        this.logParams = str;
    }

    public void setMark(String str) {
        this.mark = str;
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setStatusBarColor(String str) {
        this.statusBarColor = str;
    }

    public void setStatusBarHeight(int i) {
        this.statusBarHeight = i;
    }

    public void setStatusFontDark(int i) {
        this.statusFontDark = i;
    }
}
