package com.ss.android.ugc.a;

import com.ss.android.ugc.aweme.commercialize.loft.model.e;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f31519a;

    /* renamed from: b  reason: collision with root package name */
    public String f31520b;

    private c() {
    }

    public static c a() {
        return new c();
    }

    public final c a(String str) {
        this.f31520b = str;
        return this;
    }

    public final c a(int i) {
        this.f31519a = i;
        b(i);
        return this;
    }

    private String b(int i) {
        switch (i) {
            case 1:
                a("the context is null or not valid!");
                break;
            case 2:
                a("the download url or filePath is not valid!");
                break;
            case 3:
                a("the download request is repeat!");
                break;
            case 4:
                a("the download request is complete!");
                break;
            case 5:
                a("okHttp onResponse fail!");
                break;
            case 6:
                a("okHttp onFailure!");
                break;
            case e.l /*?: ONE_ARG  (7 int)*/:
                a("okHttp io error!");
                break;
            case 8:
                a("android storage memory size is too low");
                break;
            default:
                a("unknown error!");
                break;
        }
        return this.f31520b + "     errorCode: " + i;
    }

    public final c a(String str, String str2) {
        this.f31520b = "the download url [" + str + "] or filePath [ " + str2 + "] is not valid!";
        return this;
    }
}
