package com.monitor.cloudmessage.a.a;

import com.monitor.cloudmessage.a.b;
import com.monitor.cloudmessage.entity.a;
import java.util.Enumeration;

public final class j implements b {
    public final boolean a(a aVar) {
        Enumeration elements = com.monitor.cloudmessage.a.a().f27305a.elements();
        if (elements != null) {
            while (elements.hasMoreElements()) {
                com.monitor.cloudmessage.c.a aVar2 = (com.monitor.cloudmessage.c.a) elements.nextElement();
                if (aVar2 != null && aVar2.a()) {
                    com.monitor.cloudmessage.d.b.b bVar = new com.monitor.cloudmessage.d.b.b(0, false, aVar.f27362d, null);
                    com.monitor.cloudmessage.d.a.a(bVar);
                    return true;
                }
            }
        }
        return false;
    }
}
