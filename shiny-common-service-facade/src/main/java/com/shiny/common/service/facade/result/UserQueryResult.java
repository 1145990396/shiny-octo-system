/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.shiny.common.service.facade.result;

/**
 * @author wuxianxin
 * @version UserQueryResult.java, v 0.1 2023年02月26日 Administrator Exp $
 */
public class UserQueryResult extends BaseApiResult{

    private static final long serialVersionUID = -4894402127986123682L;
    private String userName;

    public UserQueryResult(String userName) {
        this.userName = userName;
    }

    /**
     * Getter method for property <tt>userName</tt>.
     *
     * @return property value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter method for property <tt>userName</tt>.
     *
     * @param userName value to be assigned to property userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}