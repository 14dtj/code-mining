/**
 * handle get请求
 */
@Override
protected void handleGet(final HttpServletRequest req, final HttpServletResponse resp,
final Session session) throws ServletException, IOException {
        if (hasParam(req, $param1)) {
           $handle1(req, resp, session);
        } else if (hasParam(req, $param2)) {
            $handle2(req, resp, session);
        } else if (hasParam(req, $param3)) {
            $handle3(req, resp, session);
        } else {
            $handle4(req, resp, session);
        }
}

/**
 * handle post请求
 */
@Override
protected void handlePost(final HttpServletRequest req, final HttpServletResponse resp,
final Session session) throws ServletException, IOException {
        if (hasParam(req, "ajax")) {
            handleAJAXAction(req, resp, session);
        }
}

/**
 * handle ajax请求
 */
private void handleAJAXAction(final HttpServletRequest req,
final HttpServletResponse resp, final Session session) throws ServletException,
        IOException {
    final HashMap<String, Object> ret = new HashMap<>();
    final String ajaxName = getParam(req, "ajax");

    if (ajaxName.equals($param1)) {
        $subProcess(ret);
    } else if (ajaxName.equals($param2)) {
        if (hasParam(req, $key1)) {
            $subProcess(ret);
        } else {
            ret.put("error", $errMsg);
        }
        else {
            ret.put("error", $errMsg);
        }
    }

    if (ret != null) {
        this.writeJSON(resp, ret);
    }
}
/**
 * 分页返回请求
 */
private void handlePage(final HttpServletRequest req,
final HttpServletResponse resp, final Session session) throws ServletException,
        IOException {
    final Page page = newPage(req, resp, session,
        $path);
    $param = $getParam;
    $result = $service.getResult($param);
    page.add($key1, $result1);
    page.add($key2, $result2);
    page.add($key3, $result3);

    page.render();
}
/**
 * 登录
 */
@Action(name="login") public String login(@ActionParam("username") final String username,@ActionParam("password") final String password) throws ServletException {
    final String ip=$getIp(this.getContext());
        logger.info($logInfo);
    final Session session=createSession(username,password,ip);
    return session.getSessionId();
}

/**
 * 创建session
 */
private Session createSession(  final String username,  final String password,  final String ip) throws $Exception {
    final $UserManager manager=$getUserManager();
    final $User user=manager.getUser(username,password);
    final String randomUID=UUID.randomUUID().toString();
    final Session session=new Session(randomUID,user,ip);
    final boolean sessionAdded=getSessionCache().addSession(session);
    if (sessionAdded) {
        return session;
    }
    else {
        throw new $Exception($exceptionMsg);
    }
}
/**
 * get session
 */
private Session getSessionFromSessionId( final String sessionId){
        if (sessionId == null) {
            return null;
        }
        return $getSessionCache().getSession(sessionId);
}