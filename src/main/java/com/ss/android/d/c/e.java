package com.ss.android.d.c;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private Object f28397a;

    public e() {
        try {
            this.f28397a = Class.forName("android.os.SystemProperties").newInstance();
        } catch (ClassNotFoundException | InstantiationException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }

    public final String a(String str) throws IllegalArgumentException {
        try {
            return (String) this.f28397a.getClass().getMethod("get", new Class[]{String.class}).invoke(this.f28397a, new Object[]{str});
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (Exception unused) {
            return "";
        }
    }
}
