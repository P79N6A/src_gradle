package com.coloros.mcssdk.mode;

public abstract class Message {
    String appPackage;
    int messageID;
    String taskID;

    public String getAppPackage() {
        return this.appPackage;
    }

    public int getMessageID() {
        return this.messageID;
    }

    public String getTaskID() {
        return this.taskID;
    }

    public abstract int getType();

    public void setAppPackage(String str) {
        this.appPackage = str;
    }

    public void setMessageID(int i) {
        this.messageID = i;
    }

    public void setTaskID(int i) {
        this.taskID = String.valueOf(i);
    }

    public void setTaskID(String str) {
        this.taskID = str;
    }
}
