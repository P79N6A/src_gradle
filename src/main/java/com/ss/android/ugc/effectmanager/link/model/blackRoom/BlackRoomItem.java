package com.ss.android.ugc.effectmanager.link.model.blackRoom;

public abstract class BlackRoomItem {
    public boolean inBlackRoom;
    public int lockedCount;
    public long startLockTime;

    public abstract String getItemName();

    public void unlockFromBlackRoom() {
        this.inBlackRoom = false;
    }

    public void resetStatus() {
        this.inBlackRoom = false;
        this.lockedCount = 0;
    }

    public boolean lockToBlackRoom() {
        if (this.inBlackRoom) {
            return false;
        }
        this.inBlackRoom = true;
        this.lockedCount++;
        this.startLockTime = System.currentTimeMillis();
        return true;
    }

    public String toString() {
        return "BlackRoomItem{name=" + getItemName() + "lockedCount=" + this.lockedCount + ", inBlackRoom=" + this.inBlackRoom + '}';
    }
}
