package com.xiaomi.push;

import java.net.UnknownHostException;

public final class ia {

    static class a {

        /* renamed from: a  reason: collision with root package name */
        gf f82213a;

        /* renamed from: a  reason: collision with other field name */
        String f516a;

        a() {
        }
    }

    static a a(Exception exc) {
        a(exc);
        boolean z = exc instanceof hb;
        Throwable th = exc;
        if (z) {
            hb hbVar = (hb) exc;
            th = exc;
            if (hbVar.a() != null) {
                th = hbVar.a();
            }
        }
        a aVar = new a();
        String message = th.getMessage();
        if (th.getCause() != null) {
            message = th.getCause().getMessage();
        }
        String str = th.getClass().getSimpleName() + ":" + message;
        int a2 = gs.a(th);
        if (a2 != 0) {
            aVar.f82213a = gf.a(a2 + gf.GSLB_REQUEST_SUCCESS.a());
        }
        if (aVar.f82213a == null) {
            aVar.f82213a = gf.GSLB_TCP_ERR_OTHER;
        }
        if (aVar.f82213a == gf.GSLB_TCP_ERR_OTHER) {
            aVar.f516a = str;
        }
        return aVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static void m384a(Exception exc) {
        if (exc == null) {
            throw new NullPointerException();
        }
    }

    static a b(Exception exc) {
        gf gfVar;
        a(exc);
        boolean z = exc instanceof hb;
        Throwable th = exc;
        if (z) {
            hb hbVar = (hb) exc;
            th = exc;
            if (hbVar.a() != null) {
                th = hbVar.a();
            }
        }
        a aVar = new a();
        String message = th.getMessage();
        if (th.getCause() != null) {
            message = th.getCause().getMessage();
        }
        int a2 = gs.a(th);
        String str = th.getClass().getSimpleName() + ":" + message;
        if (a2 != 0) {
            aVar.f82213a = gf.a(a2 + gf.CONN_SUCCESS.a());
            if (aVar.f82213a == gf.CONN_BOSH_ERR) {
                Throwable cause = th.getCause();
                if (cause != null && (cause instanceof UnknownHostException)) {
                    gfVar = gf.CONN_BOSH_UNKNOWNHOST;
                }
            }
            if (aVar.f82213a == gf.CONN_TCP_ERR_OTHER || aVar.f82213a == gf.CONN_XMPP_ERR || aVar.f82213a == gf.CONN_BOSH_ERR) {
                aVar.f516a = str;
            }
            return aVar;
        }
        gfVar = gf.CONN_XMPP_ERR;
        aVar.f82213a = gfVar;
        aVar.f516a = str;
        return aVar;
    }

    static a c(Exception exc) {
        gf gfVar;
        a(exc);
        boolean z = exc instanceof hb;
        Throwable th = exc;
        if (z) {
            hb hbVar = (hb) exc;
            th = exc;
            if (hbVar.a() != null) {
                th = hbVar.a();
            }
        }
        a aVar = new a();
        String message = th.getMessage();
        if (th.getCause() != null) {
            message = th.getCause().getMessage();
        }
        int a2 = gs.a(th);
        String str = th.getClass().getSimpleName() + ":" + message;
        if (a2 == 105) {
            gfVar = gf.BIND_TCP_READ_TIMEOUT;
        } else if (a2 == 199) {
            gfVar = gf.BIND_TCP_ERR;
        } else if (a2 != 499) {
            switch (a2) {
                case 109:
                    gfVar = gf.BIND_TCP_CONNRESET;
                    break;
                case 110:
                    gfVar = gf.BIND_TCP_BROKEN_PIPE;
                    break;
                default:
                    gfVar = gf.BIND_XMPP_ERR;
                    break;
            }
        } else {
            aVar.f82213a = gf.BIND_BOSH_ERR;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                gfVar = gf.BIND_BOSH_ITEM_NOT_FOUND;
            }
            if (aVar.f82213a == gf.BIND_TCP_ERR || aVar.f82213a == gf.BIND_XMPP_ERR || aVar.f82213a == gf.BIND_BOSH_ERR) {
                aVar.f516a = str;
            }
            return aVar;
        }
        aVar.f82213a = gfVar;
        aVar.f516a = str;
        return aVar;
    }

    static a d(Exception exc) {
        gf gfVar;
        a(exc);
        boolean z = exc instanceof hb;
        Throwable th = exc;
        if (z) {
            hb hbVar = (hb) exc;
            th = exc;
            if (hbVar.a() != null) {
                th = hbVar.a();
            }
        }
        a aVar = new a();
        String message = th.getMessage();
        int a2 = gs.a(th);
        String str = th.getClass().getSimpleName() + ":" + message;
        if (a2 == 105) {
            gfVar = gf.CHANNEL_TCP_READTIMEOUT;
        } else if (a2 == 199) {
            gfVar = gf.CHANNEL_TCP_ERR;
        } else if (a2 != 499) {
            switch (a2) {
                case 109:
                    gfVar = gf.CHANNEL_TCP_CONNRESET;
                    break;
                case 110:
                    gfVar = gf.CHANNEL_TCP_BROKEN_PIPE;
                    break;
                default:
                    gfVar = gf.CHANNEL_XMPPEXCEPTION;
                    break;
            }
        } else {
            aVar.f82213a = gf.CHANNEL_BOSH_EXCEPTION;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                gfVar = gf.CHANNEL_BOSH_ITEMNOTFIND;
            }
            if (aVar.f82213a == gf.CHANNEL_TCP_ERR || aVar.f82213a == gf.CHANNEL_XMPPEXCEPTION || aVar.f82213a == gf.CHANNEL_BOSH_EXCEPTION) {
                aVar.f516a = str;
            }
            return aVar;
        }
        aVar.f82213a = gfVar;
        aVar.f516a = str;
        return aVar;
    }
}
