package com.wzx.ssm.controller;

import com.wzx.ssm.domain.Product;
import com.wzx.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;
import java.util.List;

/**
 * @author wangzhixian
 * @date 2019-09-18 21:53
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    /**
     * 查询全部产品
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAll.do")
    @RolesAllowed("ADMIN")//配置权限管理注解JSR250，只有具有ADMIN权限的以后才能访问,可以省略前缀  ROLE_
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        if (productService == null){
            System.out.println("哈哈哈null");
        }else{
            System.out.println("哈哈哈no null");
        }
        System.out.println("哈哈哈");
        List<Product> productList = productService.findAll();
        mv.addObject("productList",productList);
        mv.setViewName("product-list");
        return mv;
    }

    /**
     * 添加产品
     */
    @RequestMapping("/save.do")
    public String save(Product product) throws Exception {
        productService.save(product);
        return "redirect:findAll.do";
    }
}
