/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.shiny.common.service.facade.api.User;

import com.shiny.common.service.facade.request.UserQueryRequest;
import com.shiny.common.service.facade.result.UserQueryResult;

/**
 * @author wuxianxin
 * @version UserService.java, v 0.1 2023年02月26日 Administrator Exp $
 */
public interface UserServiceFacade {

    UserQueryResult query(UserQueryRequest request);
}