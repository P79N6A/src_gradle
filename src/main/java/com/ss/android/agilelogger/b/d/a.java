package com.ss.android.agilelogger.b.d;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f27885a = "Thread: ";

    public final /* synthetic */ String a(Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Thread: ");
        stringBuffer.append(((Thread) obj).getName());
        return stringBuffer.toString();
    }
}
