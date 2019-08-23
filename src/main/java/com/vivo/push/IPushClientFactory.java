package com.vivo.push;

import android.content.Intent;
import com.vivo.push.c.aa;

public interface IPushClientFactory {
    aa createReceiveTask(y yVar);

    y createReceiverCommand(Intent intent);

    v createTask(y yVar);
}
