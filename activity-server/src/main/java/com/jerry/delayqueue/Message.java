package com.jerry.delayqueue;


import lombok.Getter;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

@Getter
public class Message<T> implements Delayed {

    private int id;
    // 消息内容
    private T body;
    // 延迟时长，这个是必须的属性因为要按照这个判断延时时长。
    private long excuteTime;

    public Message(int id, T body, long delayTime) {
        this.id = id;
        this.body = body;
        this.excuteTime = TimeUnit.NANOSECONDS.convert(delayTime, TimeUnit.MILLISECONDS) + System.nanoTime();
    }

    /**
     * 延迟任务是否到时就是按照这个方法判断如果返回的是负数则说明到期否则还没到期
     * @param unit {@link TimeUnit}
     * @return long
     */
    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(this.excuteTime - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed delayed) {
        Message msg = (Message) delayed;
        return Integer.compare(this.id, msg.id);
    }
}
