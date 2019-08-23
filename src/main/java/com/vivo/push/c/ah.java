package com.vivo.push.c;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.vivo.push.v;
import com.vivo.push.y;

public final class ah {
    public static aa b(y yVar) {
        int b2 = yVar.b();
        if (b2 == 20) {
            return new ag(yVar);
        }
        switch (b2) {
            case 1:
                return new ab(yVar);
            case 2:
                return new h(yVar);
            case 3:
                return new o(yVar);
            case 4:
                return new q(yVar);
            case 5:
                return new s(yVar);
            case 6:
                return new y(yVar);
            case e.l:
                return new m(yVar);
            case 8:
                return new k(yVar);
            case 9:
                return new g(yVar);
            case 10:
                return new d(yVar);
            case 11:
                return new ae(yVar);
            default:
                return null;
        }
    }

    public static v a(y yVar) {
        int b2 = yVar.b();
        if (b2 == 20) {
            return new ag(yVar);
        }
        switch (b2) {
            case 0:
                break;
            case 1:
                return new ab(yVar);
            case 2:
                return new h(yVar);
            case 3:
                return new o(yVar);
            case 4:
                return new q(yVar);
            case 5:
                return new s(yVar);
            case 6:
                return new y(yVar);
            case e.l:
                return new m(yVar);
            case 8:
                return new k(yVar);
            case 9:
                return new g(yVar);
            case 10:
                return new d(yVar);
            case 11:
                return new ae(yVar);
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                return new f(yVar);
            default:
                switch (b2) {
                    case 100:
                        return new b(yVar);
                    case BaseLoginOrRegisterActivity.o:
                        return new c(yVar);
                    default:
                        switch (b2) {
                            case 2000:
                            case 2001:
                            case 2002:
                            case PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE:
                            case PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_ERROR:
                            case PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_BROADCAST:
                            case 2008:
                            case 2009:
                            case 2010:
                            case 2011:
                            case 2012:
                            case 2013:
                            case 2014:
                                break;
                            case 2006:
                                return new a(yVar);
                            case 2007:
                                return new aj(yVar);
                            default:
                                return null;
                        }
                }
        }
        return new ai(yVar);
    }
}
