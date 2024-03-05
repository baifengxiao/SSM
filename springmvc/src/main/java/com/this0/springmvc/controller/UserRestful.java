package com.this0.springmvc.controller;


import com.this0.springmvc.pojo.User;
import org.springframework.web.bind.annotation.*;

/**
 * 用户模块控制器
 */
@RestController
@RequestMapping("User")
public class UserRestful {

    /**
     * 模拟分页查询业务接口
     */
    @GetMapping
    public Object queryPage(@RequestParam(name = "page") int page,
                            @RequestParam(name = "size") int size) {
        return "{'status':'ok','message':'queryPage'}";
    }

    /**
     * 模拟条件分页查询业务接口
     */
    @GetMapping("search")
    public Object queryPage(@RequestParam(name = "page", required = false, defaultValue = "1") int page,
                            @RequestParam(name = "size", required = false, defaultValue = "10") int size,
                            @RequestParam(name = "keyword", required = false) String keyword) {
        System.out.println("page = " + page + ", size = " + size + ", keyword = " + keyword);
        System.out.println("条件分页查询业务!");
        return "{'status':'ok'}";
    }

    /**
     * 模拟用户保存业务接口
     */
    @PostMapping
    public Object saveUser(@RequestBody User user) {
        System.out.println("user = " + user);
        System.out.println("用户保存业务!");
        return "{'status':'ok'}";
    }

    /**
     * 模拟用户详情业务接口
     */
    @PostMapping("/{id}")
    public Object detailUser(@PathVariable Integer id) {
        System.out.println("id = " + id);
        System.out.println("用户详情业务!");
        return "{'status':'ok'}";
    }

    /**
     * 模拟用户删除接口
     */
    @DeleteMapping("/{id}")
    public Object deleteUser(@PathVariable Integer id) {
        System.out.println("id=" + id);
        System.out.println("用户删除接口!");
        return "{'status':'ok'}";
    }


    /**
     * 模拟用户更新业务接口
     */
    @PutMapping
    public Object updateUser(@RequestBody User user) {
        System.out.println("user = " + user);
        System.out.println("用户更新业务!");
        return "{'status':'ok'}";
    }


}
