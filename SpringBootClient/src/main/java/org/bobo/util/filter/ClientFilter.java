package org.bobo.util.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 12 10:58
 */
public class ClientFilter extends ZuulFilter{

    /**
     pre：路由之前
     routing：路由之时
     post： 路由之后
     error：发送错误调用
     */

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            System.out.println("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){

            }
            return null;
        }
        return null;
    }
}
