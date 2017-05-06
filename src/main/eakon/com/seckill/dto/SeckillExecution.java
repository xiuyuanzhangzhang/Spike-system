package com.seckill.dto;

import com.seckill.entity.SuccessKilled;

/**
 * 封装秒杀执行后结果
 * Created by Eakon on 2017/5/5.
 */
public class SeckillExecution {

    private long seckillId;

    //秒杀执行结果 -1失败 0成功 1已付款
    private int state;

    //状态表示
    private String stateInfo;

    //秒杀成功对象
    private SuccessKilled successKilled;

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }

    /**
     * 秒杀成功
     * @param seckillId
     * @param state
     * @param stateInfo
     * @param successKilled
     */
    public SeckillExecution(long seckillId, int state, String stateInfo, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.state = state;
        this.stateInfo = stateInfo;
        this.successKilled = successKilled;
    }

    /**
     *秒杀失败
     * @param stateInfo
     * @param cause
     */
    public SeckillExecution(String stateInfo, Throwable cause) {
        this.seckillId = seckillId;
        this.state = state;
        this.stateInfo = stateInfo;
    }

    @Override
    public String toString() {
        return "SeckillExecution{" +
                "seckillId=" + seckillId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", successKilled=" + successKilled +
                '}';
    }
}