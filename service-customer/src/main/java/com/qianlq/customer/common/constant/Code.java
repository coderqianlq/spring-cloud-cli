package com.qianlq.customer.common.constant;

/**
 * [-999,999]    通用模块
 * [1000 - 1999] 登录注册，权限校验
 * [2000 - 2999]
 * [3000 - 3999]
 * [4000 - 4999]
 * [5000 - 5999]
 * [6000 - 6999]
 * [7000 - 7999]
 * [8000 - 9000]
 * [9000 - 9999] 系统通用模块
 */

public enum Code {

    // 通用模块
    FAILED(-1, "失败"),
    SUCCESS(0, "成功"),
    DEBUG(1, "调试模式"),
    PARAM_NULL(-2, "参数不完整"),

    SERVICE_ERROR(8000, "服务异常"),

    // 系统通用模块
    BACK_DOORS(9008, "环境异常"),
    NET_ERROR(9009, "网络错误");

    private final int code;
    private final String msg;

    Code(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }
}
