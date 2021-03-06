package com.davidhabot.adenleaguerenewal.input;

import lombok.Getter;

public enum PlayerKeySet {
    //TODO 주석달기
    MOVE_UP(0), MOVE_DOWN(1), MOVE_LEFT(2), MOVE_RIGHT(3), MOVE_DASH(4),
    SKILL_A(5), SKILL_B(6), SKILL_U(7),
    ITEM_1(8), ITEM_2(9), ITEM_3(10);

    @Getter
    private final int idx;

    PlayerKeySet(int idx) {
        this.idx = idx;
    }
}
