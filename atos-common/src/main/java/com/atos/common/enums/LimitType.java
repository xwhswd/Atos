package com.atos.common.enums;

/**
 * 限流类型
 *
 * @author atos
 */

public enum LimitType
{
    /**
     * 默认策略全局限流
     */
    DEFAULT,

    /**
     * 根据请求者IP进行限流
     */
    IP
}
