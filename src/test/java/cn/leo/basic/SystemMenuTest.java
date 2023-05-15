package cn.leo.basic;

import cn.leo.basic.model.system.base.Status;
import cn.leo.basic.model.system.base.Type;
import cn.leo.basic.model.system.entities.SystemMenu;
import cn.leo.basic.service_system.repository.SystemMenuRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static cn.leo.basic.model.system.entities.SystemMenu.*;

@SpringBootTest
public class SystemMenuTest {
    @Autowired
    private SystemMenuRepository menuRepository;


    @Test
    void initData() {

        SystemMenu menu1 = builder().name("系统管理").type(Type.NULL).path("system").component("Layout").icon("el-icon-s-tools").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu2 = builder().parentId(menu1).name("用户管理").type(Type.MENU).path("sysUser").component("system/sysUser/list").icon("el-icon-s-custom").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu3 = builder().parentId(menu1).name("系统管理").type(Type.NULL).path("sysUser").component("system/sysUser/list").icon("el-icon-user-solid").sortValue(2).status(Status.NORMAL).build();
        SystemMenu menu4 = builder().parentId(menu1).name("菜单管理").type(Type.NULL).path("sysMenu").component("system/sysMenu/list").icon("el-icon-s-unfold").sortValue(3).status(Status.NORMAL).build();
        SystemMenu menu5 = builder().parentId(menu2).name("查看").type(Type.BUTTON).perms("bnt.sysUser.list").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu6 = builder().parentId(menu2).name("添加").type(Type.BUTTON).perms("bnt.sysUser.add").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu7 = builder().parentId(menu2).name("修改").type(Type.BUTTON).perms("bnt.sysUser.update").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu8 = builder().parentId(menu2).name("删除").type(Type.BUTTON).perms("bnt.sysUser.remove").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu9 = builder().parentId(menu3).name("查看").type(Type.BUTTON).perms("bnt.sysUser.list").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu10 = builder().parentId(menu3).name("添加").type(Type.BUTTON).perms("bnt.sysUser.add").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu11 = builder().parentId(menu3).name("修改").type(Type.BUTTON).perms("bnt.sysUser.update").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu12 = builder().parentId(menu3).name("删除").type(Type.BUTTON).perms("bnt.sysUser.remove").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu13 = builder().parentId(menu4).name("查看").type(Type.BUTTON).perms("bnt.sysUser.list").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu14 = builder().parentId(menu4).name("添加").type(Type.BUTTON).perms("bnt.sysUser.add").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu15 = builder().parentId(menu4).name("修改").type(Type.BUTTON).perms("bnt.sysUser.update").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu16 = builder().parentId(menu4).name("删除").type(Type.BUTTON).perms("bnt.sysUser.remove").sortValue(1).status(Status.NORMAL).build();

        SystemMenu menu17 = builder().parentId(menu2).name("分配角色").type(Type.BUTTON).perms("bnt.sysUser.assignRole").sortValue(1).status(Status.NORMAL).build();

        SystemMenu menu18 = builder().parentId(menu3).name("分配权限").type(Type.BUTTON).path("assignAuth").component("system/sysRole/assignAuth").perms("bnt.sysRole.assignAuth").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu19 = builder().parentId(menu1).name("部门管理").type(Type.MENU).path("sysDept").component("system/sysDept/list").icon("el-icon-s-operation").sortValue(4).status(Status.NORMAL).build();
        SystemMenu menu20 = builder().parentId(menu19).name("查看").type(Type.BUTTON).perms("bnt.sysDept.list").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu21 = builder().parentId(menu1).name("岗位管理").type(Type.MENU).path("sysPost").component("system/sysPost/list").icon("el-icon-more-outline").sortValue(5).status(Status.NORMAL).build();
        SystemMenu menu22 = builder().parentId(menu21).name("查看").type(Type.BUTTON).perms("bnt.sysPost.list").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu23 = builder().parentId(menu19).name("添加").type(Type.BUTTON).perms("bnt.sysDept.add").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu24 = builder().parentId(menu19).name("修改").type(Type.BUTTON).perms("bnt.sysDept.update").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu25 = builder().parentId(menu19).name("删除").type(Type.BUTTON).perms("bnt.sysDept.remove").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu26 = builder().parentId(menu21).name("添加").type(Type.BUTTON).perms("bnt.sysPost.add").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu27 = builder().parentId(menu21).name("修改").type(Type.BUTTON).perms("bnt.sysPost.update").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu28 = builder().parentId(menu21).name("删除").type(Type.BUTTON).perms("bnt.sysPost.remove").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu33 = builder().parentId(menu1).name("日志管理").type(Type.NULL).path("log").component("ParentView").icon("el-icon-tickets").sortValue(6).status(Status.NORMAL).build();

        SystemMenu menu29 = builder().parentId(menu33).name("操作日志").type(Type.MENU).path("sysOperationLog").component("system/sysOperationLog/list").icon("el-icon-document-remove").sortValue(7).status(Status.NORMAL).build();

        SystemMenu menu30 = builder().parentId(menu29).name("查看").type(Type.BUTTON).perms("bnt.sysOperationLog.list").sortValue(1).status(Status.NORMAL).build();
        SystemMenu menu31 = builder().parentId(menu33).name("登录日志").type(Type.MENU).path("sysLoginLog").component("system/sysLoginLog/list").icon("el-icon-s-goods").sortValue(8).status(Status.NORMAL).build();
        SystemMenu menu32 = builder().parentId(menu31).name("查看").type(Type.BUTTON).perms("bnt.sysLoginLog.list").sortValue(1).status(Status.NORMAL).build();

        List<SystemMenu> entities = List.of(menu1, menu2, menu3, menu4, menu5, menu6, menu7, menu8, menu9, menu10, menu11, menu12, menu13, menu14, menu15, menu16, menu17, menu18, menu19, menu20,
                menu21, menu22, menu23, menu24, menu25, menu26, menu27, menu28, menu33, menu29, menu30, menu31, menu32);
        menuRepository.saveAll(entities);

    }
}
