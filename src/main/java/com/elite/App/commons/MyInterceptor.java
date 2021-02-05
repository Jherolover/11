package com.elite.App.commons;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 实现拦截器接口
 */
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,Object handler){
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        //拦截处理代码
        System.out.println("拦截请求前处理");
        return true;
    }

    /**
     * 后处理
     * @param request
     * @param response
     * @param handler
     * @return
     */
    @Override
    public void postHandle(HttpServletRequest request,
                              HttpServletResponse response, Object handler, ModelAndView modelAndView){
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        //拦截处理代码
        System.out.println("拦截请求后处理"+modelAndView);

    }
    @Override
    public void afterCompletion(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                                Exception ex){
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        //拦截处理代码
        System.out.println("拦截请求完成处理。。");

    }


}
